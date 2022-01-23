//----------------------------------------------------------------------
// Copyright (C) 2019 Oleg Sergeev [sergoleg@gmail.com]
//----------------------------------------------------------------------

/**
 * Ovation ® graphics language
 */

package org.ops.ovation.mmi.gl;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import org.ops.ovation.mmi.gl.glLexer;
import org.ops.ovation.mmi.gl.glParser;
import org.ops.ovation.mmi.gl.glParserBaseListener;
import org.ops.ovation.mmi.util.MacroBoundingBox;

/***************************************************************
 * gl2js class
 */
public class gl2js {

	@Option(name = "-i", aliases = "--input", required = true, usage = "input *.src file path")
	private File inputFile;

	@Option(name = "-o", aliases = "--output", required = false, usage = "output file path")
	private File outputFile;

	@Option(name = "-s", aliases = "--shapelib", required = false, usage="shapelib Mode")
    private boolean shapelib = false;

	@Option(name="-b", aliases = "--boundingbox", required = false, usage="boundingbox Mode")
    private boolean boundingbox = false;

	@Option(name="-p", aliases = "--preprocessor", required = false, usage="preprocessor Mode")
    private boolean preprocessor = false;

	@Option(name = "-m", aliases = "--macrobb", required = false, usage = "input PDSMacro.json file path")
	private File macroFile;

	@Option(name = "-d", aliases = "--macrodir", required = false, usage = "input macro*.src files directory path")
	private File macroDir;

	@Option(name = "-j", aliases = "--jspoint", required = false, usage = "input PDSPoints.js file path")
	private File jspointFile;

	@Option(name = "-h", aliases = "--htmldir", required = false, usage = "output *.html and *.js files directory path")
	private File htmlDir;

	@Option(name = "-w", aliases = "--webpack", required = false, usage = "output webpack file path")
	private File webpackFile;

	// receives other command line parameters than options
	@Argument
	private List<String> arguments = new ArrayList<String>();

	private static String DEF_MACRO_DIR;

	/***************************************************************
	 */
	public static void OpenMacroBBoxFile(String fileName) {
		MacroBoundingBox._set_json_file(fileName);
	} // OpenMacroBBoxFile

	/***************************************************************
	 */
	public static String GetMacroBBox(String macroName) {
		MacroBoundingBox._set_macro_name(macroName);
		String tmp = "";
		tmp = tmp.concat(" " + macroName);
		tmp = tmp.concat(" " + MacroBoundingBox.x);
		tmp = tmp.concat(" " + MacroBoundingBox.y);
		tmp = tmp.concat(" " + MacroBoundingBox.w);
		tmp = tmp.concat(" " + MacroBoundingBox.h);
		return tmp;
	} // GetMacroBBox

	/***************************************************************
	 * PreprocessorListener class
	 */
	public static class PreprocessorListener extends glParserBaseListener {
		final String NL = "\n";
		int counter = -1;
		BufferedTokenStream tokens;
		TokenStreamRewriter rewriter;

		/***************
		 */
		PreprocessorListener(BufferedTokenStream tokens) {
			this.tokens = tokens;
			rewriter = new TokenStreamRewriter(tokens);
		}

		/***************
		 */
		public void enterCmdMACRO(glParser.CmdMACROContext ctx) {
			rewriter.insertBefore(ctx.start, "\n*** start macro ***\nDEF_");
		}

		/***************
		 */
		public void exitCmdMACRO(glParser.CmdMACROContext ctx) {
			String	MACRO_DEF_DIR = DEF_MACRO_DIR;
			counter = counter + 1;
			String MacroContent = "\nSET_MACRO_BB" + GetMacroBBox(glParser._MacroNumber.get(counter).toString()) + "\n\n";
			try {
				int len;
				char[] chr = new char[4096];
				final StringBuffer buffer = new StringBuffer();
				final FileReader reader = new FileReader(MACRO_DEF_DIR + "\\" + glParser._MacroFileNames.get(counter).toString() + ".src");
				try {
					while ((len = reader.read(chr)) > 0) {
						buffer.append(chr, 0, len);
					}
				} finally {
					reader.close();
				}
				MacroContent = MacroContent + buffer.toString();
			} catch (IOException e) {
				e.printStackTrace();
			}
			rewriter.insertAfter(ctx.stop, NL + MacroContent + "END_MACRO " + glParser._MacroSection.get(counter).toString() + "\n*** stop macro ***\n");
		}
	} // PreprocessorListener class

	/***************************************************************
	 * 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws CmdLineException, Exception, IOException {

		final gl2js options = new gl2js();
		final CmdLineParser parser = new CmdLineParser(options);

		parser.parseArgument(args);

		String pattern = "[0-9]+";
		String text    = options.inputFile.getPath();
		Pattern p      = Pattern.compile(pattern);
		Matcher m      = p.matcher(text);

		String number  = "";

		while (m.find()) {
			number = number.concat(text.substring(m.start(), m.end()));
		}

		/***************************************************************
		 */
		if (options.preprocessor) {	// Спец. ветка для предпроцессора

			/*
			 * java -Xmx1024m -Xms256m -jar ..\bin\gl2js.jar
			 * 			--preprocessor
			 * 			--macrodir .
			 * 			--macrobb %_Macro%
			 * 			--input %%i
			 *          --output %_TmpFile1% 1>> %_LOG% 2>>&1
			 */

			// --macrodir
			DEF_MACRO_DIR = options.macroDir.getPath();

			// --macrobb
			OpenMacroBBoxFile(options.macroFile.getPath());

			CharStream mainInput = null;

			// Pick an input stream (filename)
			// --input
			mainInput = new ANTLRFileStream(options.inputFile.getPath());

			// Create a lexer that feeds off of mainInput CharStream
			glLexer mainLexer = new glLexer(mainInput);

			mainLexer.ppf = true;

			// Create a buffer of tokens between lexer and parser
			CommonTokenStream tokens = new CommonTokenStream(mainLexer);

			// Create a parser, attaching it to the token buffer
			glParser mainParser = new glParser(tokens);

			mainParser.parserMode = glParser.MODE_PREPROCESSOR;

			mainParser.setBuildParseTree(true);

			// Begin parsing at rule gl_start_rule
			ParseTree tree = mainParser.gl_start_rule();

			// For debugging, print LISP-style tree
			// System.err.println(tree.toStringTree(parser));

			// генератор tree-walker-а (обходчика дерева)
			ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
			PreprocessorListener extractor = new PreprocessorListener(tokens);
			walker.walk(extractor, tree); // initiate walk of tree with listener

			Writer foutput = null;
			try {
				// --output
				foutput = new BufferedWriter(
					new OutputStreamWriter(
						new FileOutputStream(options.outputFile.getPath(), false), "UTF-8"	// открыть файл с начала
					)
				);
				foutput.write(extractor.rewriter.getText());
				foutput.close();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		/***************************************************************
		 */
		} else {
			CharStream mainInput = CharStreams.fromFileName(options.inputFile.getPath());
			glLexer mainLexer = new glLexer(mainInput);
			glParser mainParser = new glParser(new CommonTokenStream(mainLexer));
//			_parser.addParseListener(new TESTLANGEventListener());

			if (options.shapelib) {
				mainParser.parserMode = glParser.MODE_SHAPE_LIB;
				mainParser.outputFile = options.outputFile.getPath();
			} else {
				if (options.boundingbox) {
					mainParser.parserMode  = glParser.MODE_BOUNDING_BOX;
					mainParser.macroNumber = number;
					mainParser.outputFile  = options.outputFile.getPath();
				} else {
					/*
					 * java -Xmx1024m -Xms256m -jar ..\bin\gl2js.jar
					 * 			--input %%i
					 * 			--jspoint %_Point%
					 * 			--htmldir %_HTMLDir% 1>> %_LOG% 2>>&1
					 */
					mainParser.parserMode  = glParser.MODE_HTML;
					mainParser.jspointFile = options.jspointFile.getPath();	// input PDSPoints.js file path
					mainParser.htmlDir     = options.htmlDir.getPath();		// output *.html and *.js files directory path
					mainParser.diagNumber  = number;
					mainParser.webpackFile = options.webpackFile.getPath();	// output webpack file path
				}
			}

			mainParser.setBuildParseTree(true);

			// Start parsing
			mainParser.gl_start_rule();
		}
	} // main

} // gl2js
