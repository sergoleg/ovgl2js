// Generated from grammar\glParser.g4 by ANTLR 4.7.2

	package org.ops.ovation.mmi.gl;

	import org.stringtemplate.v4.*;

	import org.ops.ovation.mmi.util.BoundingBox;
	import org.ops.ovation.mmi.util.MacroPort;
	import org.ops.ovation.mmi.util.UseCommands;

	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.OutputStreamWriter;
	import java.io.PrintStream;
	import java.io.UnsupportedEncodingException;
	import java.io.Writer;
	import java.nio.charset.Charset;
	import java.nio.file.Files;
	import java.nio.file.Paths;

	import java.util.HashMap;
	import java.util.HashSet;

	import java.util.Map;

	import java.util.Set;

	import java.util.Collection;
	import java.util.Collections;
	import java.util.Comparator;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class glParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, SUBWIN=2, WINDOW=3, ZOOMABLE=4, NON_ZOOMABLE=5, DEFAULT_POSITION=6, 
		FIXED_POSITION=7, DEFAULT_SIZE=8, FIXED_SIZE=9, NOT_FITTED=10, FITTED=11, 
		SCALE=12, NOSCALE=13, BITMAP_OVER=14, BITMAP=15, VECTOR_OVER=16, VECTOR=17, 
		RIGHT0=18, RIGHT=19, LEFT=20, HEX_H=21, HEX=22, BINARY=23, EXPONENTIAL=24, 
		TECHNICAL=25, HORZ=26, VERT=27, NONE=28, TTB=29, RTL=30, BOTH=31, DOWN=32, 
		UP=33, BIAS=34, SMALL=35, MEDIUM=36, LARGE=37, OPERATOR=38, PROGRAM=39, 
		ASCII=40, INT=41, REAL=42, BYTE=43, ROUNDED=44, SQUARED=45, OLNORMAL=46, 
		INVOKED=47, LINES=48, SHAPE_PLOT=49, SQUAREWAVE=50, SHAPE_LABEL=51, TEXT_LABEL=52, 
		EXEC_TRIG=53, EXEC_POKE=54, POSITION=55, SIZE=56, FG=57, BG=58, ER=59, 
		OL=60, M_BACKGROUND=61, M_DIAGRAM=62, M_EXIT=63, M_FOREGROUND=64, M_KEYBOARD=65, 
		M_TRIGGER=66, L_BACKGROUND=67, L_DIAGRAM=68, L_EXIT=69, L_FOREGROUND=70, 
		L_KEYBOARD=71, L_TRIGGER=72, CC_ARC=73, CC_CIRCLE=74, CC_COLOR=75, CC_BLINK=76, 
		CC_DYNAMIC_LINE=77, CC_DYNAMIC_POLYGON=78, CC_ELLIPSE=79, CC_LINE=80, 
		CC_MULTI_TEXT=81, CC_POLYGON=82, CC_PROCESS_PT=83, CC_RECTANGLE=84, CC_SHAPE=85, 
		CC_TEXT=86, CC_TRIG_ON=87, C_BAR=88, C_CURSOR=89, C_DATE=90, C_DEF_FKEY_GROUP=91, 
		C_DEF_QUAL=92, C_DIAG_DISP=93, C_DOT=94, C_EF_STATE=95, C_ELSE=96, C_ENDIF=97, 
		C_ENDLOOP=98, C_ENTRY_FLD=99, C_FKEY_STATE=100, C_FORCE_UPDATE=101, C_FORMAT=102, 
		C_FUNC_KEY=103, C_GCODE=104, C_GTEXT=105, C_IF=106, C_IF_CHANGED=107, 
		C_IF_ENDIF=108, C_IFELSE=109, C_LOAD_FKEY_GROUP=110, C_LOOP=111, C_MACRO=112, 
		C_DEF_MACRO=113, C_DEF_MACRO_PARAMS=114, C_SET_MACRO_BB=115, C_END_MACRO=116, 
		C_MATH=117, C_OL_BUTTON=118, C_OL_CHECKBOX=119, C_OL_CHOICE=120, C_OL_CYLINDER=121, 
		C_OL_EVENT_MENU=122, C_OL_GAUGE=123, C_OL_RECTANGLE=124, C_OL_SLIDER=125, 
		C_P_ENDLOOP=126, C_P_ENDLP=127, C_PAGE=128, C_PLOT=129, C_POINTER=130, 
		C_POKE_FLD=131, C_POKE_STATE=132, C_PTR_EQUAL=133, C_PTR_LOOP=134, C_PTR_MOVE=135, 
		C_PTR_VALUE=136, C_RUN_PROGRAMS=137, C_SETVAL=138, C_TIME=139, C_TREND=140, 
		C_XY_PLOT=141, C_SHAPELIB=142, C_DEF_SHAPE=143, C_END_SHAPE=144, C_FONT=145, 
		WEQUALS=146, HEQUALS=147, XEQUALS=148, YEQUALS=149, EXP=150, SQRT=151, 
		LOG=152, COS=153, SIN=154, TAN=155, ASIN=156, ACOS=157, ATAN=158, LineFillPattern=159, 
		BlinkPattern=160, FontStyleRegular=161, FontStyleBoldItalic=162, FontStyleItalic=163, 
		FontStyleBold=164, Color=165, RecordField=166, Gpointer=167, Hpointer=168, 
		Wpointer=169, Dpointer=170, Ppointer=171, Spointer=172, Opointer=173, 
		Ioffset=174, Roffset=175, Boffset=176, Soffset=177, Aoffset=178, StatusWord=179, 
		CaseExp=180, QualityExp=181, SetExp=182, SetVariable=183, ConstVariable=184, 
		ColorVariable=185, StatusVariable=186, LPAREN=187, RPAREN=188, LBRACE=189, 
		RBRACE=190, LBRACKET=191, RBRACKET=192, COMMA=193, STAR=194, OP_ADD=195, 
		OP_SUB=196, OP_MULT=197, OR=198, AND=199, EOR=200, EQUALS=201, NOTEQUALS=202, 
		LT=203, LTEQ=204, GT=205, GTEQ=206, PLUS=207, MINUS=208, MULT=209, DIV=210, 
		MOD=211, EXPONENT=212, NOT=213, IntegerLiteral=214, FloatingPointLiteral=215, 
		StringLiteral=216, PointName=217, NullLiteral=218, Identifier=219, ID=220, 
		LineComment=221, BlockComment=222, Whitespace=223;
	public static final int
		RULE_gl_start_rule = 0, RULE_stat = 1, RULE_label = 2, RULE_command = 3, 
		RULE_cmdFONT = 4, RULE_cmdGCODE = 5, RULE_cmdSHAPELIB = 6, RULE_cmdDEF_SHAPE = 7, 
		RULE_cmdEND_SHAPE = 8, RULE_cmdDIAGRAM = 9, RULE_cmdKEYBOARD = 10, RULE_cmdBACKGROUND = 11, 
		RULE_cmdFOREGROUND = 12, RULE_cmdTRIGGER = 13, RULE_cmdEXIT = 14, RULE_def_conditional_value = 15, 
		RULE_conditionalExpression = 16, RULE_simpleExpression = 17, RULE_compoundExpression = 18, 
		RULE_caseExpression = 19, RULE_qualityExpression = 20, RULE_setExpression = 21, 
		RULE_expression = 22, RULE_primary_expr = 23, RULE_conditional_value = 24, 
		RULE_pt_name_pat = 25, RULE_pointer_pat = 26, RULE_rec_fld_pat = 27, RULE_offset_pat = 28, 
		RULE_value = 29, RULE_prog_args_pat = 30, RULE_coordinate_pairs = 31, 
		RULE_literal_numbers = 32, RULE_cmdARC = 33, RULE_cmdCIRCLE = 34, RULE_cmdCOLOR = 35, 
		RULE_cmdBLINK = 36, RULE_cmdDYNAMIC_LINE = 37, RULE_cmdDYNAMIC_POLYGON = 38, 
		RULE_cmdELLIPSE = 39, RULE_cmdLINE = 40, RULE_cmdMULTI_TEXT = 41, RULE_multi_text_strings = 42, 
		RULE_multi_text_strings_cond = 43, RULE_def_font_type = 44, RULE_cmdPOLYGON = 45, 
		RULE_cmdPROCESS_PT = 46, RULE_cmdRECTANGLE = 47, RULE_cmdSHAPE = 48, RULE_cmdTEXT = 49, 
		RULE_cmdTRIG_ON = 50, RULE_cmdOL_GAUGE = 51, RULE_cmdBAR = 52, RULE_cmdCURSOR = 53, 
		RULE_cmdDATE = 54, RULE_cmdDEF_FKEY_GROUP = 55, RULE_cmdDEF_QUAL = 56, 
		RULE_cmdDIAG_DISP = 57, RULE_cmdDOT = 58, RULE_cmdEF_STATE = 59, RULE_cmdLOOP = 60, 
		RULE_cmdENDLOOP = 61, RULE_cmdENTRY_FLD = 62, RULE_cmdFORCE_UPDATE = 63, 
		RULE_cmdFUNC_KEY = 64, RULE_cmdGTEXT = 65, RULE_cmdIF = 66, RULE_cmdIF_CHANGED = 67, 
		RULE_cmdELSE = 68, RULE_cmdENDIF = 69, RULE_cmdIFELSE = 70, RULE_cmdMACRO = 71, 
		RULE_cmdDEF_MACRO_PARAMS = 72, RULE_cmdDEF_MACRO = 73, RULE_def_macro_d_list = 74, 
		RULE_def_macro_t_list_other = 75, RULE_def_macro_t_list_bg = 76, RULE_def_macro_set_list = 77, 
		RULE_def_macro_const_list = 78, RULE_def_macro_status_list = 79, RULE_def_macro_color_list = 80, 
		RULE_def_macro_olcolor_list = 81, RULE_cmdSET_MACRO_BB = 82, RULE_cmdEND_MACRO = 83, 
		RULE_cmdMATH = 84, RULE_math_equation = 85, RULE_math_primary_eqtn = 86, 
		RULE_cmdOL_BUTTON = 87, RULE_cmdOL_RECTANGLE = 88, RULE_cmdPAGE = 89, 
		RULE_cmdPLOT = 90, RULE_cmdPTR_VALUE = 91, RULE_poke_args = 92, RULE_cmdPOKE_FLD = 93, 
		RULE_cmdPOKE_STATE = 94, RULE_cmdRUN_PROGRAMS = 95, RULE_cmdSETVAL = 96, 
		RULE_cmdTIME = 97, RULE_cmdXY_PLOT = 98, RULE_cmdTREND = 99, RULE_cmdPTR_MOVE = 100, 
		RULE_cmdPOINTER = 101;
	private static String[] makeRuleNames() {
		return new String[] {
			"gl_start_rule", "stat", "label", "command", "cmdFONT", "cmdGCODE", "cmdSHAPELIB", 
			"cmdDEF_SHAPE", "cmdEND_SHAPE", "cmdDIAGRAM", "cmdKEYBOARD", "cmdBACKGROUND", 
			"cmdFOREGROUND", "cmdTRIGGER", "cmdEXIT", "def_conditional_value", "conditionalExpression", 
			"simpleExpression", "compoundExpression", "caseExpression", "qualityExpression", 
			"setExpression", "expression", "primary_expr", "conditional_value", "pt_name_pat", 
			"pointer_pat", "rec_fld_pat", "offset_pat", "value", "prog_args_pat", 
			"coordinate_pairs", "literal_numbers", "cmdARC", "cmdCIRCLE", "cmdCOLOR", 
			"cmdBLINK", "cmdDYNAMIC_LINE", "cmdDYNAMIC_POLYGON", "cmdELLIPSE", "cmdLINE", 
			"cmdMULTI_TEXT", "multi_text_strings", "multi_text_strings_cond", "def_font_type", 
			"cmdPOLYGON", "cmdPROCESS_PT", "cmdRECTANGLE", "cmdSHAPE", "cmdTEXT", 
			"cmdTRIG_ON", "cmdOL_GAUGE", "cmdBAR", "cmdCURSOR", "cmdDATE", "cmdDEF_FKEY_GROUP", 
			"cmdDEF_QUAL", "cmdDIAG_DISP", "cmdDOT", "cmdEF_STATE", "cmdLOOP", "cmdENDLOOP", 
			"cmdENTRY_FLD", "cmdFORCE_UPDATE", "cmdFUNC_KEY", "cmdGTEXT", "cmdIF", 
			"cmdIF_CHANGED", "cmdELSE", "cmdENDIF", "cmdIFELSE", "cmdMACRO", "cmdDEF_MACRO_PARAMS", 
			"cmdDEF_MACRO", "def_macro_d_list", "def_macro_t_list_other", "def_macro_t_list_bg", 
			"def_macro_set_list", "def_macro_const_list", "def_macro_status_list", 
			"def_macro_color_list", "def_macro_olcolor_list", "cmdSET_MACRO_BB", 
			"cmdEND_MACRO", "cmdMATH", "math_equation", "math_primary_eqtn", "cmdOL_BUTTON", 
			"cmdOL_RECTANGLE", "cmdPAGE", "cmdPLOT", "cmdPTR_VALUE", "poke_args", 
			"cmdPOKE_FLD", "cmdPOKE_STATE", "cmdRUN_PROGRAMS", "cmdSETVAL", "cmdTIME", 
			"cmdXY_PLOT", "cmdTREND", "cmdPTR_MOVE", "cmdPOINTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "','", "'*'", null, null, null, null, null, null, "'='", 
			"'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", null, "'/'", "'%'", 
			"'^'", null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "SUBWIN", "WINDOW", "ZOOMABLE", "NON_ZOOMABLE", "DEFAULT_POSITION", 
			"FIXED_POSITION", "DEFAULT_SIZE", "FIXED_SIZE", "NOT_FITTED", "FITTED", 
			"SCALE", "NOSCALE", "BITMAP_OVER", "BITMAP", "VECTOR_OVER", "VECTOR", 
			"RIGHT0", "RIGHT", "LEFT", "HEX_H", "HEX", "BINARY", "EXPONENTIAL", "TECHNICAL", 
			"HORZ", "VERT", "NONE", "TTB", "RTL", "BOTH", "DOWN", "UP", "BIAS", "SMALL", 
			"MEDIUM", "LARGE", "OPERATOR", "PROGRAM", "ASCII", "INT", "REAL", "BYTE", 
			"ROUNDED", "SQUARED", "OLNORMAL", "INVOKED", "LINES", "SHAPE_PLOT", "SQUAREWAVE", 
			"SHAPE_LABEL", "TEXT_LABEL", "EXEC_TRIG", "EXEC_POKE", "POSITION", "SIZE", 
			"FG", "BG", "ER", "OL", "M_BACKGROUND", "M_DIAGRAM", "M_EXIT", "M_FOREGROUND", 
			"M_KEYBOARD", "M_TRIGGER", "L_BACKGROUND", "L_DIAGRAM", "L_EXIT", "L_FOREGROUND", 
			"L_KEYBOARD", "L_TRIGGER", "CC_ARC", "CC_CIRCLE", "CC_COLOR", "CC_BLINK", 
			"CC_DYNAMIC_LINE", "CC_DYNAMIC_POLYGON", "CC_ELLIPSE", "CC_LINE", "CC_MULTI_TEXT", 
			"CC_POLYGON", "CC_PROCESS_PT", "CC_RECTANGLE", "CC_SHAPE", "CC_TEXT", 
			"CC_TRIG_ON", "C_BAR", "C_CURSOR", "C_DATE", "C_DEF_FKEY_GROUP", "C_DEF_QUAL", 
			"C_DIAG_DISP", "C_DOT", "C_EF_STATE", "C_ELSE", "C_ENDIF", "C_ENDLOOP", 
			"C_ENTRY_FLD", "C_FKEY_STATE", "C_FORCE_UPDATE", "C_FORMAT", "C_FUNC_KEY", 
			"C_GCODE", "C_GTEXT", "C_IF", "C_IF_CHANGED", "C_IF_ENDIF", "C_IFELSE", 
			"C_LOAD_FKEY_GROUP", "C_LOOP", "C_MACRO", "C_DEF_MACRO", "C_DEF_MACRO_PARAMS", 
			"C_SET_MACRO_BB", "C_END_MACRO", "C_MATH", "C_OL_BUTTON", "C_OL_CHECKBOX", 
			"C_OL_CHOICE", "C_OL_CYLINDER", "C_OL_EVENT_MENU", "C_OL_GAUGE", "C_OL_RECTANGLE", 
			"C_OL_SLIDER", "C_P_ENDLOOP", "C_P_ENDLP", "C_PAGE", "C_PLOT", "C_POINTER", 
			"C_POKE_FLD", "C_POKE_STATE", "C_PTR_EQUAL", "C_PTR_LOOP", "C_PTR_MOVE", 
			"C_PTR_VALUE", "C_RUN_PROGRAMS", "C_SETVAL", "C_TIME", "C_TREND", "C_XY_PLOT", 
			"C_SHAPELIB", "C_DEF_SHAPE", "C_END_SHAPE", "C_FONT", "WEQUALS", "HEQUALS", 
			"XEQUALS", "YEQUALS", "EXP", "SQRT", "LOG", "COS", "SIN", "TAN", "ASIN", 
			"ACOS", "ATAN", "LineFillPattern", "BlinkPattern", "FontStyleRegular", 
			"FontStyleBoldItalic", "FontStyleItalic", "FontStyleBold", "Color", "RecordField", 
			"Gpointer", "Hpointer", "Wpointer", "Dpointer", "Ppointer", "Spointer", 
			"Opointer", "Ioffset", "Roffset", "Boffset", "Soffset", "Aoffset", "StatusWord", 
			"CaseExp", "QualityExp", "SetExp", "SetVariable", "ConstVariable", "ColorVariable", 
			"StatusVariable", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", 
			"RBRACKET", "COMMA", "STAR", "OP_ADD", "OP_SUB", "OP_MULT", "OR", "AND", 
			"EOR", "EQUALS", "NOTEQUALS", "LT", "LTEQ", "GT", "GTEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "EXPONENT", "NOT", "IntegerLiteral", "FloatingPointLiteral", 
			"StringLiteral", "PointName", "NullLiteral", "Identifier", "ID", "LineComment", 
			"BlockComment", "Whitespace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "glParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



		/** Режим работы парсера */
		public static final int
			MODE_SHAPE_LIB    = 10,
			MODE_BOUNDING_BOX = 20,
			MODE_PREPROCESSOR = 40,
			MODE_HTML         = 50,
			MODE_DEFAULT      = 99;

		/** Тип видеограммы */
		private static final int DIAG_TYPE_MAIN    = 1000;
		private static final int DIAG_TYPE_SUBWIN  = 2000;
		private static final int DIAG_TYPE_WINDOW  = 3000;
		private static final int DIAG_TYPE_CONTROL = 4000;

		/** Входные атрибуты */
		public String outputFile  = "stdout";
		public String jspointFile = "";			// input PDSPoints.js file path
		public String webpackFile = "stdout";	// output webpack file path
		public String htmlDir     = "";			// output *.html and *.js files directory path
		public String diagNumber  = "";
		public int diagTypeNumber   = DIAG_TYPE_CONTROL;
		public String macroNumber = "";

		public int parserMode     = MODE_DEFAULT;



		public static boolean OneSectionMode = false;

		/** Для предпроцессора */
		public static ArrayList<String>  _MacroFileNames = new ArrayList<String>();
		public static ArrayList<String>  _MacroNumber    = new ArrayList<String>();
		public static ArrayList<Section> _MacroSection   = new ArrayList<Section>();

		/** */
		public static String  diagTitle  = "";
		public static String  diagType   = "";
		public static String  diagParam  = "";

		public static boolean diagTitle_first = true;
		public static int     diagTitle_number = 0;

		public static boolean shape_first = true;

		public static String coordinate_pairs_X = "";
		public static String coordinate_pairs_Y = "";

		/** Разделы видеограммы */
		public enum Section {
			I_BACKGROUND,
			I_DIAGRAM,
			I_FOREGROUND,
			I_KEYBOARD,
			I_TRIGGER,
			I_SHAPELIB,
			I_CALL_MACRO,
			I_BODY_MACRO
		};
		public static Section section = Section.I_DIAGRAM;

		/** Dозврат из триггерной секции */
		public static Section ret_from_trigger_section = Section.I_DIAGRAM;

		ArrayList<String> sctnDIAGRAM    = new ArrayList<String>();
		ArrayList<String> sctnKEYBOARD   = new ArrayList<String>();
		ArrayList<String> sctnBACKGROUND = new ArrayList<String>();
		ArrayList<String> sctnFOREGROUND = new ArrayList<String>();
		ArrayList<String> sctnTRIGGER    = new ArrayList<String>();
		ArrayList<String> sctnSHAPELIB   = new ArrayList<String>();
		ArrayList<String> sctnCALL_MACRO = new ArrayList<String>();
		ArrayList<String> sctnBODY_MACRO = new ArrayList<String>();

		/**
		 * Утверждение:
		 *    line_pat, fill_pat,
		 *    fg_color, bg_color, er_color, ol_index,
		 *    fg_blink, bg_blink,
		 *    rec_fld,
		 *    shape_name,
		 *    string_literal,
		 *    integer_literal.
		 */
		String statement_name = "";

		/** Условные выражения. */
		ArrayList<String> expression        = new ArrayList<String>();
		ArrayList<String> color_expressions = new ArrayList<String>();

		int numberExpressions = 0;

		/* Создать ArrayList уникальных значений */
		public class ArrayListSet<E> implements Iterable<E>, Set<E> {
			private ArrayList<E> list;
			private HashSet<E> set;

			public ArrayListSet() {
				list = new ArrayList<>();
				set = new HashSet<>();
			}

			public boolean add(E e) { return set.add(e) && list.add(e); }

			public boolean add(int i, E e) {
				if (!set.add(e)) return false;
				list.add(i, e);
				return true;
			}

			public void clear() {
				list.clear();
				set.clear();
			}

			public boolean contains(Object o) { return set.contains(o); }
			public E get(int i) { return list.get(i); }
			public boolean isEmpty() { return list.isEmpty(); }

			public E remove(int i) {        
				E e = list.remove(i);
				set.remove(e);
				return e;
			}

			public boolean remove(Object o) {        
				if (set.remove(o)) {
					list.remove(o);
					return true;
				}
				return false;
			}

			public boolean set(int i, E e) {
				if (set.contains(e)) return false;
				set.add(e);
				set.remove(list.set(i, e));
				return true;
			}

			public int size() { return list.size(); }
			public void sort(Comparator<? super E> c) { Collections.sort(list, c); }
			public Iterator<E> iterator() { return list.iterator(); }

			public boolean addAll(Collection<? extends E> c) {
				int before = size();
				for (E e : c) add(e);
				return size() == before;
			}

			public boolean containsAll(Collection<?> c) { return set.containsAll(c); }
			public boolean removeAll(Collection<?> c) { return set.removeAll(c) && list.removeAll(c); }
			public boolean retainAll(Collection<?> c) { return set.retainAll(c) && list.retainAll(c); }
			public Object[] toArray() { return list.toArray(); }
			public <T> T[] toArray(T[] a) { return list.toArray(a); }

			public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append("[");

				for (int i = 0; i < list.size() - 1; i++) {
					sb.append(list.get(i) + ", ");
				}

				if (!list.isEmpty()) {
					sb.append(list.get(list.size() - 1));
				}

				sb.append("]");
				return sb.toString();
			}
		} // ArrayListSet<E>

		/** Математическое уравнение. */
		ArrayList<String> equation = new ArrayList<String>();

		/** Список имен параметров. */
		ArrayListSet<String> PointNameList = new ArrayListSet<String>();

		/** Список номеров видеограмм. */
		ArrayListSet<String> DiagNumList = new ArrayListSet<String>();

		/** */
		public BoundingBox macroBBox = new BoundingBox();
		public MacroPort   macroPort = new MacroPort();

		/** */
		int    macro_number  = 0;

		String macro_args = "";

		int    macro_x       = 0;
		int    macro_y       = 0;
		double macro_w_scale = 1;
		double macro_h_scale = 1;

		int    macro_BBx     = 0;
		int    macro_BBy     = 0;
		int    macro_BBw     = 0;
		int    macro_BBh     = 0;

		/**********************************************************************/
		void print(String s) {
			if (OneSectionMode) {
				if ((section == Section.I_DIAGRAM) ||
					(section == Section.I_KEYBOARD) ||
					(section == Section.I_BACKGROUND) ||
					(section == Section.I_FOREGROUND))		{ sctnDIAGRAM.add(s); }
				if (section == Section.I_TRIGGER)    sctnTRIGGER.add(s);
				if (section == Section.I_SHAPELIB)   sctnSHAPELIB.add(s);
				if (section == Section.I_CALL_MACRO) sctnCALL_MACRO.add(s);
			} else {
				if (section == Section.I_DIAGRAM)    sctnDIAGRAM.add(s);
				if (section == Section.I_KEYBOARD)   sctnKEYBOARD.add(s);
				if (section == Section.I_BACKGROUND) sctnBACKGROUND.add(s);
				if (section == Section.I_FOREGROUND) sctnFOREGROUND.add(s);
				if (section == Section.I_TRIGGER)    sctnTRIGGER.add(s);
				if (section == Section.I_SHAPELIB)   sctnSHAPELIB.add(s);
				if (section == Section.I_CALL_MACRO) sctnCALL_MACRO.add(s);
			}
		}

		/**********************************************************************/
		void println(String s) {
			if (OneSectionMode) {
				if ((section == Section.I_DIAGRAM) ||
					(section == Section.I_KEYBOARD) ||
					(section == Section.I_BACKGROUND) ||
					(section == Section.I_FOREGROUND))		{ sctnDIAGRAM.add(s); sctnDIAGRAM.add("\n"); }
				if (section == Section.I_TRIGGER)    { sctnTRIGGER.add(s);    sctnTRIGGER.add("\n");    }
				if (section == Section.I_SHAPELIB)   { sctnSHAPELIB.add(s);   sctnSHAPELIB.add("\n");   }
				if (section == Section.I_CALL_MACRO) { sctnCALL_MACRO.add(s); sctnCALL_MACRO.add("\n"); }
			} else {
				if (section == Section.I_DIAGRAM)    { sctnDIAGRAM.add(s);    sctnDIAGRAM.add("\n");    }
				if (section == Section.I_KEYBOARD)   { sctnKEYBOARD.add(s);   sctnKEYBOARD.add("\n");   }
				if (section == Section.I_BACKGROUND) { sctnBACKGROUND.add(s); sctnBACKGROUND.add("\n"); }
				if (section == Section.I_FOREGROUND) { sctnFOREGROUND.add(s); sctnFOREGROUND.add("\n"); }
				if (section == Section.I_TRIGGER)    { sctnTRIGGER.add(s);    sctnTRIGGER.add("\n");    }
				if (section == Section.I_SHAPELIB)   { sctnSHAPELIB.add(s);   sctnSHAPELIB.add("\n");   }
				if (section == Section.I_CALL_MACRO) { sctnCALL_MACRO.add(s); sctnCALL_MACRO.add("\n"); }
			}
		}

		/** очистка массива ***************************************************/
		void EqtnClear() { equation.clear(); }
		/** добавить к массиву ************************************************/
		void EqtnAdd(String s) { equation.add(s); }
		/** конвертировать в строку *******************************************/
		String EqtnToStr() { 
			String s = "";
			for (int i = 0; i < equation.size(); i++) {
				s = s + equation.get(i);
			}
			return s;
		}

		/** очистка массива ***************************************************/
		void ExprClear() { expression.clear(); }
		/** добавить к массиву ************************************************/
		void ExprAdd(String s) { expression.add(s); }
		/**********************************************************************/
		void ExprAddStatus(String s) {
			int i = expression.size() - 1;
			expression.add(i,"(");								// добавление в «середину» списка
			expression.add(s);
		}

		/**********************************************************************/
		void ExprAddStatusVariable(String s) {
			int i = expression.size() - 1;
			expression.add(i,"vStatus(");						// добавление в «середину» списка
			expression.add(s);
		}

		/**********************************************************************/
		String ExprToStr() {									// конвертировать в строку
			String s = "";
			for (int i = 0; i < expression.size(); i++) {
				s = s + expression.get(i);
			}
			return s;
		}

		/**********************************************************************/
		void Create_DIAG_html (String filename) {
			PrintStream output = null;
			try {
	/*			output = new PrintStream(System.out, true, "UTF-8"); */
				output = new PrintStream(new FileOutputStream(filename, false));	// перезаписать файл
	/*
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
	*/
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			output.println("<!DOCTYPE html>");
			output.println("<html lang=\"en\">");
			output.println("<!-- -->");
			output.println("<head>");
			output.println("<title>Process Diagram " + diagNumber + " - " + diagTitle + "</title>");
			output.println("<meta charset=utf-8>");
			output.println("<meta name=\"copyright\" content=\"Copyright © 2019 WSC (https://www.ws-corp.com/). All rights reserved.\">");
			output.println("<link   type=\"text/css\" href=\"ui/o.diagram.css\" rel=\"stylesheet\"/>");

			output.println("<script type=\"text/javascript\" src=\"ui/jquery-1.12.4.min.js\"></script>");
	//		output.println("<script type=\"text/javascript\" src=\"ui/jquery-ui-1.12.1/jquery-ui.min.js\"></script>");

			output.println("<script type=\"text/javascript\" src=\"ui/snap.svg-min.js\"></script>");
			output.println("<script type=\"text/javascript\" src=\"ui/o.html_wrap.js\"></script>");
			output.println("<script type=\"text/javascript\" src=\"ui/o.sim_wrap.js\"></script>");
			output.println("<script type=\"text/javascript\" src=\"ui/o.shapelib.js\"></script>");
			output.println("<script type=\"text/javascript\" src=\"ui/o.statuslib.js\"></script>");
			output.println("<script type=\"text/javascript\" src=\"ui/o.primitives.js\"></script>");
			output.println("<script type=\"text/javascript\" src=\"" + diagNumber + ".js\"></script>");

			if (0 != DiagNumList.size()) {
				for (int i = 0; i < DiagNumList.size(); i++) {
					String diag_num = DiagNumList.get(i);
					if (!(diag_num.equals("0"))) {
						output.println("		<script type=\"text/javascript\" src=\"" + diag_num + ".js\"></script>");
					}
				}
			}

			output.println("</head>");
			output.println("<!-- -->");
			output.println("<body>");
	//		output.println("	<svg id='svg' width='100%' height='100%' preserveAspectRatio='xMidYMid meet' xmlns='http://www.w3.org/2000/svg' version='1.1'></svg>");
			output.println("	<svg id='svg' xmlns='http://www.w3.org/2000/svg' version='1.1'></svg>");
			output.println("	<div class='popup'>");
			output.println("		<div class='popup_bg'></div>");
			output.println("		<div class='form'><form><textarea id='info' disabled='disabled' rows='15' cols='55'>OPS OPS OPS</textarea></form></div>");
			output.println("	</div>");
			output.println("</body>");
			output.println("<!-- -->");
			output.println("</html>");
		} // Create_DIAG_html

		/**********************************************************************/
		void Create_DIAG_js (String filename) {

			/* открыть файл для вывода
			 * ***********************************/
			Writer foutput = null;

			try {
				foutput = new BufferedWriter(
					new OutputStreamWriter(
						new FileOutputStream(filename, false), "UTF-8"	// открыть файл с начала
					)
				);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			/* вывод объекта SHC и SPD в MAIN диаграмму
			 * **************************************************/
			if ((0 != PointNameList.size()) && (diagType.equals("MAIN"))) { // вывод не пустых объектов SHC и SPD в MAIN диаграмму 

				// загрузка DB параметров для SHC
				FileInputStream fis = null;
				byte[] content = null;
				try {
					fis = new FileInputStream(new File(jspointFile));	// открыть DB файл
					content = new byte[fis.available()];
					fis.read(content);									// считать DB файл в content
					fis.close();										// закрыть DB файл
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				String[] lines = null;
				try {
					lines = new String(content, "UTF-8").split("\n");	// разделить content на строки
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				HashMap<String, String> _db_points = new HashMap<String, String>();
				for (String line : lines) {
					String[] words = line.split(":");
					_db_points.put(words[0], line);						// строки в HashMap
				}
				// DB параметров для SHC в HashMap _db_points

				// начало вывода объекта SHC
				try {
		foutput.write("function setPDSPoints() {\n");
					/* foutput.write("//====================================================================================================\n"); */
					/* foutput.write("var SHC={" + "\n"); */
					foutput.write("SHC={" + "\n");
				} catch (IOException e2) {
					e2.printStackTrace();
				}

				boolean firstPnt = true;
				StringBuilder SPDlist = new StringBuilder();

				// Искать строки содержащие имя параметра из списка PointNameList
				for(int i = 0; i < PointNameList.size(); i++) {
					String searchWord = PointNameList.get(i);
					String line = _db_points.get("\"_" + searchWord + "\"");
					try {
						if (line == null) {									// параметр не найден в DB и не добавлен в объект SPD !!! ???
							foutput.write("\"_" + searchWord + "\":{_RT:\"0\",_PN:\"" + searchWord + "\"},\n");
							System.err.println("Dummy Points (Unresolved Points) in Diagram " + diagNumber + " : " + searchWord);
						} else {
							foutput.write(line + "\n");
							if (i > 0)
								SPDlist.append("\t");				// заполняем объект SPD
							SPDlist.append("\"" + PointNameList.get(i) + "\"");
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				} // for

				// конец вывода объекта SHC и вывод объекта SPD
				try {
					foutput.write("_reserve:{}\n");
					foutput.write("};\n");
					/* foutput.write("//====================================================================================================\n"); */
					/* foutput.write("var SPD=[" + SPDlist.toString().replace("\t", ",") + "];\n"); */
					foutput.write("SPD=[" + SPDlist.toString().replace("\t", ",") + "];\n");
		foutput.write("}\n");
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			} else { // вывод пустых объектов SHC и SPD в MAIN диаграмму
				if (diagType.equals("MAIN")) {
					try {
		foutput.write("function setPDSPoints() {\n");
	/*
						foutput.write("//====================================================================================================\n");
						foutput.write("SHC={reserve:{}};\n");
						foutput.write("//====================================================================================================\n");
						foutput.write("SPD=[];\n");
	 */
		foutput.write("}\n");
					} catch (IOException e2) {
						e2.printStackTrace();
					}
				}
			} // вывод объекта SHC и SPD

			String functionName = "";

			/* вывод параметров DIAGRAM
			 * ***********************************/
			try {
				if (diagType.equals("MAIN")) {
					foutput.write("//====================================================================================================\n");
					functionName = diagType + "_DIAG";
				} else {
					foutput.write("//====================================================================================================\n");
					functionName = diagType + "_DIAG_" + diagNumber;
				}

				foutput.write("var fld_" + functionName + "=" + diagParam + "\n");

			} catch (IOException e2) {
				e2.printStackTrace();
			}

			try {
				foutput.write("// Define the object specific properties inside the constructor\n");
				foutput.write("//====================================================================================================\n");
				foutput.write("function " + functionName + "(fld) {\n");

				//foutput.write("	//====================================================================================================\n");
				foutput.write("	this.diag_num = fld.diag_num;\n");
				foutput.write("	this.diag_type = fld.diag_type;\n");
				foutput.write("	this.icon_num = fld.icon_num;\n");
				foutput.write("	this.x = fld.x;\n");
				foutput.write("	this.y = fld.y;\n");
				foutput.write("	this.w = fld.w;\n");
				foutput.write("	this.h = fld.h;\n");
				foutput.write("	this.background = fld.background;\n");
				foutput.write("	this.zoom_flag = fld.zoom_flag;\n");
				foutput.write("	this.revision_num = fld.revision_num;\n");
				foutput.write("	this.x_extents = fld.x_extents;\n");
				foutput.write("	this.y_extents = fld.y_extents;\n");
				foutput.write("	this.w_extents = fld.w_extents;\n");
				foutput.write("	this.h_extents = fld.h_extents;\n");
				foutput.write("	this.update_rate = fld.update_rate;\n");
				foutput.write("	this.positioning = fld.positioning;\n");
				foutput.write("	this.sizing = fld.sizing;\n");
				foutput.write("	this.subscreen_num = fld.subscreen_num;\n");
				foutput.write("	this.diag_title = fld.diag_title;\n");
				foutput.write("}\n\n");

				String defVar = "" +
					"	var fg_color, bg_color, er_color, ol_color;" +	// названия цвета\n" +
					"	var fg_blink, bg_blink;" +						// состояния мигания\n" +
					"	var line_pat, fill_pat;" +						// шаблон линии, узор-заполнитель\n" +
					"	var string_literal;" +							// текстовая строка\n" +
					"	var shape_name;" +								// название формы\n" +
					"	var integer_literal;" +							// номер триггера\n" +
					"	var $"+"CONST = [];" +							// const variable\n" +
					"	var $"+"STATUS = [];" +							// status variable\n" +
					"	var $"+"D = [];" +								// указатели $"+"D (указатели макросов)\n" +
					"	var $"+"T = [];" +								// указатели $"+"T (указатели макросов)\n" +
					"	var $"+"O = [];" +								// указатели $"+"T (указатели макросов)\n" +
					"	var $"+"S = [];" +								// указатели $"+"S (указатели поля ввода)\n" +
					"	var strings = [];" +							// список строк\n" +
					"	var f_trig_on = Create_trig_on_array(256);";	// trigger on/off\n";

				foutput.write("// Define the DIAGRAM method using the prototype\n");
				foutput.write("//====================================================================================================\n");
				foutput.write(functionName + ".prototype.DIAGRAM = function() {\n");			foutput.write(defVar);
				if (sctnDIAGRAM.size() != 0) {
					for (int i = 0; i < sctnDIAGRAM.size(); i++)
						foutput.write("\t"+sctnDIAGRAM.get(i));
				}
				foutput.write("} // DIAGRAM\n\n");

				foutput.write("// Define the KEYBOARD method using the prototype\n");
				foutput.write("//====================================================================================================\n");
				foutput.write(functionName + ".prototype.KEYBOARD = function() {\n");			foutput.write(defVar);
				if (sctnKEYBOARD.size() != 0) {
					for (int i = 0; i < sctnKEYBOARD.size(); i++)
						foutput.write("\t"+sctnKEYBOARD.get(i));
				}
				foutput.write("} // KEYBOARD\n\n");

				foutput.write("// Define the BACKGROUND method using the prototype\n");
				foutput.write("//====================================================================================================\n");
				foutput.write(functionName + ".prototype.BACKGROUND = function() {\n");			foutput.write(defVar);
				if (sctnBACKGROUND.size() != 0) {
					for (int i = 0; i < sctnBACKGROUND.size(); i++)
						foutput.write("\t"+sctnBACKGROUND.get(i));
				}
				foutput.write("} // BACKGROUND\n\n");

				foutput.write("// Define the FOREGROUND method using the prototype\n");
				foutput.write("//====================================================================================================\n");
				foutput.write(functionName + ".prototype.FOREGROUND = function() {\n");			foutput.write(defVar);
				if (sctnFOREGROUND.size() != 0) {
					for (int i = 0; i < sctnFOREGROUND.size(); i++)
						foutput.write("\t"+sctnFOREGROUND.get(i));
				}
				foutput.write("} // FOREGROUND\n\n");

				foutput.write("// Define the TRIGGER method using the prototype\n");
				foutput.write("//====================================================================================================\n");
				if (0 != sctnTRIGGER.size()) {
					for (int i = 0; i < sctnTRIGGER.size(); i++) {
						foutput.write(sctnTRIGGER.get(i).replace("XXXL", functionName));
					}
				}

				foutput.write("// Create object using the constructor function\n");
				foutput.write("//====================================================================================================\n");

				if (diagType.equals("MAIN")) {
					foutput.write("var " + functionName.replace("_DIAG", "_diag") + " = new " + functionName + "(fld_" + functionName + ");\n");
				} else {
					foutput.write("//var " + functionName.replace("_DIAG", "_diag") + " = new " + functionName + "(fld_" + functionName + ");\n");
				}

			} catch (IOException e2) {
				e2.printStackTrace();
			}

			/* закрыть файл для вывода
			 * ***********************************/
			try {
				foutput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} // Create_DIAG_js

		/**********************************************************************/
		void WriteWebPackFile(String filename) {

			if (!diagType.equals("MAIN")) { return; }

			/** stdout */
			if (filename.equals("stdout")) {
				PrintStream output = null;
				try {
					output = new PrintStream(System.out, true, "UTF-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}



				output.print("copy " + diagNumber + ".js");
				if (0 != DiagNumList.size()) {
					for (int i = 0; i < DiagNumList.size(); i++) {
						String diag_num = DiagNumList.get(i);
						if (!(diag_num.equals("0"))) {
							output.print(" + " + diag_num + ".js");
						}
					}
				}
				output.println(" /b " + diagNumber + ".diag");



			/** file */
			} else {
				Writer foutput = null;
				try {
					foutput = new BufferedWriter(
						new OutputStreamWriter(
							new FileOutputStream(filename, true), "UTF-8"	// открыть файл в режиме добавления
						)
					);



					foutput.write("copy " + diagNumber + ".js");
					if (0 != DiagNumList.size()) {
						for (int i = 0; i < DiagNumList.size(); i++) {
							String diag_num = DiagNumList.get(i);
							if (!(diag_num.equals("0"))) {
								foutput.write(" + " + diag_num + ".js");
							}
						}
					}
					foutput.write(" /b " + diagNumber + ".diag\n");

					foutput.close();



				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} // WriteWebPackFile

		/**********************************************************************/
		void OutShapeLib (String filename) {
			/** stdout */
			if (filename.equals("stdout")) {
				PrintStream output = null;
				try {
					output = new PrintStream(System.out, true, "UTF-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				if (0 == sctnSHAPELIB.size()) return;
				output.println("var shapelib = {");
				for (int i = 0; i < sctnSHAPELIB.size(); i++) {
					output.print(sctnSHAPELIB.get(i));
				}
				output.println("};");
			/** file */
			} else {
				Writer foutput = null;
				try {
					foutput = new BufferedWriter(
						new OutputStreamWriter(
							new FileOutputStream(filename, false), "UTF-8"	// открыть файл с начала
						)
					);
					if (0 == sctnSHAPELIB.size()) return;
					foutput.write("var shapelib = {\n");
					for (int i = 0; i < sctnSHAPELIB.size(); i++) {
						foutput.write(sctnSHAPELIB.get(i));
					}
					foutput.write("};\n");
					foutput.close();
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} // OutShapeLib

		/**********************************************************************/
		void OutMacroBB (String filename) {
			/** stdout */
			if (filename.equals("stdout")) {
				PrintStream output = null;
				try {
					output = new PrintStream(System.out, true, "UTF-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				output.print( "\"" + macroNumber + "\": " + macroBBox.toString());
			/** file */
			} else {
				Writer foutput = null;
				try {
					foutput = new BufferedWriter(
						new OutputStreamWriter(
							new FileOutputStream(filename, true), "UTF-8"	// открыть файл в режиме добавления
						)
					);
					foutput.write("\"" + macroNumber + "\": " + macroBBox.toString());
					foutput.close();
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} // OutMacroBB

		String[] keywords = new String[] {
			"ARROW1", "ARROW2", "DFDBKR", "DFDCONT", "DMPRO", "FAN",
			"HEATER", "HORZPMP", "MED71", "VEK04", "VLVSTM1", "VLVSTM2",
			"arrow2left", "arrow4down", "arrow4left", "arrow4righ", "arrow4up",
			"barscale", "dfda1", "dfda2", "dfda3", "dfda4", "dfdgen", "dfdxfmr",
			"diapump", "fwpmp", "nvalve", "oriface", "pmpmtr", "pumpfill3",
			"valve1", "valve5", "CLOSEBTN", "test0", "test1"};

		/*
		 * Проверить, содержится ли хотя бы одно ключевое слово (стоп-слово) в заданной строке.
		 * Полный перебор ключевых слов с проверкой с помощью метода contains.
		 */
		boolean bruteForce(String text, String[] keywords) {
			for (String keyword : keywords) {
				if (text.contains(keyword)) {
					return true;
				}
			}
			return false;
		}


	public glParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Gl_start_ruleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(glParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Gl_start_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gl_start_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterGl_start_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitGl_start_rule(this);
		}
	}

	public final Gl_start_ruleContext gl_start_rule() throws RecognitionException {
		Gl_start_ruleContext _localctx = new Gl_start_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gl_start_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (L_BACKGROUND - 67)) | (1L << (L_DIAGRAM - 67)) | (1L << (L_EXIT - 67)) | (1L << (L_FOREGROUND - 67)) | (1L << (L_KEYBOARD - 67)) | (1L << (L_TRIGGER - 67)) | (1L << (CC_ARC - 67)) | (1L << (CC_CIRCLE - 67)) | (1L << (CC_COLOR - 67)) | (1L << (CC_BLINK - 67)) | (1L << (CC_DYNAMIC_LINE - 67)) | (1L << (CC_DYNAMIC_POLYGON - 67)) | (1L << (CC_ELLIPSE - 67)) | (1L << (CC_LINE - 67)) | (1L << (CC_MULTI_TEXT - 67)) | (1L << (CC_POLYGON - 67)) | (1L << (CC_PROCESS_PT - 67)) | (1L << (CC_RECTANGLE - 67)) | (1L << (CC_SHAPE - 67)) | (1L << (CC_TEXT - 67)) | (1L << (CC_TRIG_ON - 67)) | (1L << (C_BAR - 67)) | (1L << (C_CURSOR - 67)) | (1L << (C_DATE - 67)) | (1L << (C_DEF_FKEY_GROUP - 67)) | (1L << (C_DEF_QUAL - 67)) | (1L << (C_DIAG_DISP - 67)) | (1L << (C_DOT - 67)) | (1L << (C_EF_STATE - 67)) | (1L << (C_ELSE - 67)) | (1L << (C_ENDIF - 67)) | (1L << (C_ENDLOOP - 67)) | (1L << (C_ENTRY_FLD - 67)) | (1L << (C_FORCE_UPDATE - 67)) | (1L << (C_FUNC_KEY - 67)) | (1L << (C_GCODE - 67)) | (1L << (C_GTEXT - 67)) | (1L << (C_IF - 67)) | (1L << (C_IF_CHANGED - 67)) | (1L << (C_IFELSE - 67)) | (1L << (C_LOOP - 67)) | (1L << (C_MACRO - 67)) | (1L << (C_DEF_MACRO - 67)) | (1L << (C_DEF_MACRO_PARAMS - 67)) | (1L << (C_SET_MACRO_BB - 67)) | (1L << (C_END_MACRO - 67)) | (1L << (C_MATH - 67)) | (1L << (C_OL_BUTTON - 67)) | (1L << (C_OL_GAUGE - 67)) | (1L << (C_OL_RECTANGLE - 67)) | (1L << (C_PAGE - 67)) | (1L << (C_PLOT - 67)) | (1L << (C_POINTER - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (C_POKE_FLD - 131)) | (1L << (C_POKE_STATE - 131)) | (1L << (C_PTR_MOVE - 131)) | (1L << (C_PTR_VALUE - 131)) | (1L << (C_RUN_PROGRAMS - 131)) | (1L << (C_SETVAL - 131)) | (1L << (C_TIME - 131)) | (1L << (C_TREND - 131)) | (1L << (C_XY_PLOT - 131)) | (1L << (C_SHAPELIB - 131)) | (1L << (C_DEF_SHAPE - 131)) | (1L << (C_END_SHAPE - 131)) | (1L << (C_FONT - 131)))) != 0)) {
				{
				{
				setState(204);
				stat();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(210);
			match(EOF);

						switch (parserMode) {
							case MODE_PREPROCESSOR :
								break;
							case MODE_SHAPE_LIB :
								if (section == Section.I_SHAPELIB)
									OutShapeLib(outputFile);
								break;
							case MODE_BOUNDING_BOX :
								OutMacroBB(outputFile);
								break;
							case MODE_HTML :
								//if (diagTypeNumber == DIAG_TYPE_MAIN)
								//	Create_DIAG_html(htmlDir + "\\" + diagNumber + ".html");
								Create_DIAG_js(htmlDir + "\\" + diagNumber + ".js");
								WriteWebPackFile(webpackFile);
								break;
							default: 
								break;
						} // switch
					
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BACKGROUND:
			case L_DIAGRAM:
			case L_EXIT:
			case L_FOREGROUND:
			case L_KEYBOARD:
			case L_TRIGGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				label();
				}
				break;
			case CC_ARC:
			case CC_CIRCLE:
			case CC_COLOR:
			case CC_BLINK:
			case CC_DYNAMIC_LINE:
			case CC_DYNAMIC_POLYGON:
			case CC_ELLIPSE:
			case CC_LINE:
			case CC_MULTI_TEXT:
			case CC_POLYGON:
			case CC_PROCESS_PT:
			case CC_RECTANGLE:
			case CC_SHAPE:
			case CC_TEXT:
			case CC_TRIG_ON:
			case C_BAR:
			case C_CURSOR:
			case C_DATE:
			case C_DEF_FKEY_GROUP:
			case C_DEF_QUAL:
			case C_DIAG_DISP:
			case C_DOT:
			case C_EF_STATE:
			case C_ELSE:
			case C_ENDIF:
			case C_ENDLOOP:
			case C_ENTRY_FLD:
			case C_FORCE_UPDATE:
			case C_FUNC_KEY:
			case C_GCODE:
			case C_GTEXT:
			case C_IF:
			case C_IF_CHANGED:
			case C_IFELSE:
			case C_LOOP:
			case C_MACRO:
			case C_DEF_MACRO:
			case C_DEF_MACRO_PARAMS:
			case C_SET_MACRO_BB:
			case C_END_MACRO:
			case C_MATH:
			case C_OL_BUTTON:
			case C_OL_GAUGE:
			case C_OL_RECTANGLE:
			case C_PAGE:
			case C_PLOT:
			case C_POINTER:
			case C_POKE_FLD:
			case C_POKE_STATE:
			case C_PTR_MOVE:
			case C_PTR_VALUE:
			case C_RUN_PROGRAMS:
			case C_SETVAL:
			case C_TIME:
			case C_TREND:
			case C_XY_PLOT:
			case C_SHAPELIB:
			case C_DEF_SHAPE:
			case C_END_SHAPE:
			case C_FONT:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public CmdDIAGRAMContext cmdDIAGRAM() {
			return getRuleContext(CmdDIAGRAMContext.class,0);
		}
		public CmdKEYBOARDContext cmdKEYBOARD() {
			return getRuleContext(CmdKEYBOARDContext.class,0);
		}
		public CmdBACKGROUNDContext cmdBACKGROUND() {
			return getRuleContext(CmdBACKGROUNDContext.class,0);
		}
		public CmdFOREGROUNDContext cmdFOREGROUND() {
			return getRuleContext(CmdFOREGROUNDContext.class,0);
		}
		public CmdTRIGGERContext cmdTRIGGER() {
			return getRuleContext(CmdTRIGGERContext.class,0);
		}
		public CmdEXITContext cmdEXIT() {
			return getRuleContext(CmdEXITContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_label);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_DIAGRAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				cmdDIAGRAM();
				}
				break;
			case L_KEYBOARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				cmdKEYBOARD();
				}
				break;
			case L_BACKGROUND:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				cmdBACKGROUND();
				}
				break;
			case L_FOREGROUND:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				cmdFOREGROUND();
				}
				break;
			case L_TRIGGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				cmdTRIGGER();
				}
				break;
			case L_EXIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				cmdEXIT();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CmdARCContext cmdARC() {
			return getRuleContext(CmdARCContext.class,0);
		}
		public CmdCIRCLEContext cmdCIRCLE() {
			return getRuleContext(CmdCIRCLEContext.class,0);
		}
		public CmdCOLORContext cmdCOLOR() {
			return getRuleContext(CmdCOLORContext.class,0);
		}
		public CmdBLINKContext cmdBLINK() {
			return getRuleContext(CmdBLINKContext.class,0);
		}
		public CmdDYNAMIC_LINEContext cmdDYNAMIC_LINE() {
			return getRuleContext(CmdDYNAMIC_LINEContext.class,0);
		}
		public CmdDYNAMIC_POLYGONContext cmdDYNAMIC_POLYGON() {
			return getRuleContext(CmdDYNAMIC_POLYGONContext.class,0);
		}
		public CmdELLIPSEContext cmdELLIPSE() {
			return getRuleContext(CmdELLIPSEContext.class,0);
		}
		public CmdLINEContext cmdLINE() {
			return getRuleContext(CmdLINEContext.class,0);
		}
		public CmdMULTI_TEXTContext cmdMULTI_TEXT() {
			return getRuleContext(CmdMULTI_TEXTContext.class,0);
		}
		public CmdPOLYGONContext cmdPOLYGON() {
			return getRuleContext(CmdPOLYGONContext.class,0);
		}
		public CmdPROCESS_PTContext cmdPROCESS_PT() {
			return getRuleContext(CmdPROCESS_PTContext.class,0);
		}
		public CmdRECTANGLEContext cmdRECTANGLE() {
			return getRuleContext(CmdRECTANGLEContext.class,0);
		}
		public CmdSHAPEContext cmdSHAPE() {
			return getRuleContext(CmdSHAPEContext.class,0);
		}
		public CmdTEXTContext cmdTEXT() {
			return getRuleContext(CmdTEXTContext.class,0);
		}
		public CmdTRIG_ONContext cmdTRIG_ON() {
			return getRuleContext(CmdTRIG_ONContext.class,0);
		}
		public CmdBARContext cmdBAR() {
			return getRuleContext(CmdBARContext.class,0);
		}
		public CmdCURSORContext cmdCURSOR() {
			return getRuleContext(CmdCURSORContext.class,0);
		}
		public CmdDATEContext cmdDATE() {
			return getRuleContext(CmdDATEContext.class,0);
		}
		public CmdDEF_FKEY_GROUPContext cmdDEF_FKEY_GROUP() {
			return getRuleContext(CmdDEF_FKEY_GROUPContext.class,0);
		}
		public CmdDEF_QUALContext cmdDEF_QUAL() {
			return getRuleContext(CmdDEF_QUALContext.class,0);
		}
		public CmdDIAG_DISPContext cmdDIAG_DISP() {
			return getRuleContext(CmdDIAG_DISPContext.class,0);
		}
		public CmdDOTContext cmdDOT() {
			return getRuleContext(CmdDOTContext.class,0);
		}
		public CmdEF_STATEContext cmdEF_STATE() {
			return getRuleContext(CmdEF_STATEContext.class,0);
		}
		public CmdELSEContext cmdELSE() {
			return getRuleContext(CmdELSEContext.class,0);
		}
		public CmdENDIFContext cmdENDIF() {
			return getRuleContext(CmdENDIFContext.class,0);
		}
		public CmdENDLOOPContext cmdENDLOOP() {
			return getRuleContext(CmdENDLOOPContext.class,0);
		}
		public CmdENTRY_FLDContext cmdENTRY_FLD() {
			return getRuleContext(CmdENTRY_FLDContext.class,0);
		}
		public CmdFORCE_UPDATEContext cmdFORCE_UPDATE() {
			return getRuleContext(CmdFORCE_UPDATEContext.class,0);
		}
		public CmdFUNC_KEYContext cmdFUNC_KEY() {
			return getRuleContext(CmdFUNC_KEYContext.class,0);
		}
		public CmdGTEXTContext cmdGTEXT() {
			return getRuleContext(CmdGTEXTContext.class,0);
		}
		public CmdIFContext cmdIF() {
			return getRuleContext(CmdIFContext.class,0);
		}
		public CmdIF_CHANGEDContext cmdIF_CHANGED() {
			return getRuleContext(CmdIF_CHANGEDContext.class,0);
		}
		public CmdIFELSEContext cmdIFELSE() {
			return getRuleContext(CmdIFELSEContext.class,0);
		}
		public CmdLOOPContext cmdLOOP() {
			return getRuleContext(CmdLOOPContext.class,0);
		}
		public CmdMACROContext cmdMACRO() {
			return getRuleContext(CmdMACROContext.class,0);
		}
		public CmdDEF_MACROContext cmdDEF_MACRO() {
			return getRuleContext(CmdDEF_MACROContext.class,0);
		}
		public CmdDEF_MACRO_PARAMSContext cmdDEF_MACRO_PARAMS() {
			return getRuleContext(CmdDEF_MACRO_PARAMSContext.class,0);
		}
		public CmdSET_MACRO_BBContext cmdSET_MACRO_BB() {
			return getRuleContext(CmdSET_MACRO_BBContext.class,0);
		}
		public CmdEND_MACROContext cmdEND_MACRO() {
			return getRuleContext(CmdEND_MACROContext.class,0);
		}
		public CmdMATHContext cmdMATH() {
			return getRuleContext(CmdMATHContext.class,0);
		}
		public CmdOL_BUTTONContext cmdOL_BUTTON() {
			return getRuleContext(CmdOL_BUTTONContext.class,0);
		}
		public CmdOL_RECTANGLEContext cmdOL_RECTANGLE() {
			return getRuleContext(CmdOL_RECTANGLEContext.class,0);
		}
		public CmdPAGEContext cmdPAGE() {
			return getRuleContext(CmdPAGEContext.class,0);
		}
		public CmdPLOTContext cmdPLOT() {
			return getRuleContext(CmdPLOTContext.class,0);
		}
		public CmdPOINTERContext cmdPOINTER() {
			return getRuleContext(CmdPOINTERContext.class,0);
		}
		public CmdPOKE_FLDContext cmdPOKE_FLD() {
			return getRuleContext(CmdPOKE_FLDContext.class,0);
		}
		public CmdPOKE_STATEContext cmdPOKE_STATE() {
			return getRuleContext(CmdPOKE_STATEContext.class,0);
		}
		public CmdPTR_VALUEContext cmdPTR_VALUE() {
			return getRuleContext(CmdPTR_VALUEContext.class,0);
		}
		public CmdPTR_MOVEContext cmdPTR_MOVE() {
			return getRuleContext(CmdPTR_MOVEContext.class,0);
		}
		public CmdRUN_PROGRAMSContext cmdRUN_PROGRAMS() {
			return getRuleContext(CmdRUN_PROGRAMSContext.class,0);
		}
		public CmdSETVALContext cmdSETVAL() {
			return getRuleContext(CmdSETVALContext.class,0);
		}
		public CmdTIMEContext cmdTIME() {
			return getRuleContext(CmdTIMEContext.class,0);
		}
		public CmdXY_PLOTContext cmdXY_PLOT() {
			return getRuleContext(CmdXY_PLOTContext.class,0);
		}
		public CmdSHAPELIBContext cmdSHAPELIB() {
			return getRuleContext(CmdSHAPELIBContext.class,0);
		}
		public CmdDEF_SHAPEContext cmdDEF_SHAPE() {
			return getRuleContext(CmdDEF_SHAPEContext.class,0);
		}
		public CmdEND_SHAPEContext cmdEND_SHAPE() {
			return getRuleContext(CmdEND_SHAPEContext.class,0);
		}
		public CmdFONTContext cmdFONT() {
			return getRuleContext(CmdFONTContext.class,0);
		}
		public CmdGCODEContext cmdGCODE() {
			return getRuleContext(CmdGCODEContext.class,0);
		}
		public CmdOL_GAUGEContext cmdOL_GAUGE() {
			return getRuleContext(CmdOL_GAUGEContext.class,0);
		}
		public CmdTRENDContext cmdTREND() {
			return getRuleContext(CmdTRENDContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CC_ARC:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				cmdARC();
				}
				break;
			case CC_CIRCLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				cmdCIRCLE();
				}
				break;
			case CC_COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				cmdCOLOR();
				}
				break;
			case CC_BLINK:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				cmdBLINK();
				}
				break;
			case CC_DYNAMIC_LINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				cmdDYNAMIC_LINE();
				}
				break;
			case CC_DYNAMIC_POLYGON:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				cmdDYNAMIC_POLYGON();
				}
				break;
			case CC_ELLIPSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				cmdELLIPSE();
				}
				break;
			case CC_LINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(232);
				cmdLINE();
				}
				break;
			case CC_MULTI_TEXT:
				enterOuterAlt(_localctx, 9);
				{
				setState(233);
				cmdMULTI_TEXT();
				}
				break;
			case CC_POLYGON:
				enterOuterAlt(_localctx, 10);
				{
				setState(234);
				cmdPOLYGON();
				}
				break;
			case CC_PROCESS_PT:
				enterOuterAlt(_localctx, 11);
				{
				setState(235);
				cmdPROCESS_PT();
				}
				break;
			case CC_RECTANGLE:
				enterOuterAlt(_localctx, 12);
				{
				setState(236);
				cmdRECTANGLE();
				}
				break;
			case CC_SHAPE:
				enterOuterAlt(_localctx, 13);
				{
				setState(237);
				cmdSHAPE();
				}
				break;
			case CC_TEXT:
				enterOuterAlt(_localctx, 14);
				{
				setState(238);
				cmdTEXT();
				}
				break;
			case CC_TRIG_ON:
				enterOuterAlt(_localctx, 15);
				{
				setState(239);
				cmdTRIG_ON();
				}
				break;
			case C_BAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(240);
				cmdBAR();
				}
				break;
			case C_CURSOR:
				enterOuterAlt(_localctx, 17);
				{
				setState(241);
				cmdCURSOR();
				}
				break;
			case C_DATE:
				enterOuterAlt(_localctx, 18);
				{
				setState(242);
				cmdDATE();
				}
				break;
			case C_DEF_FKEY_GROUP:
				enterOuterAlt(_localctx, 19);
				{
				setState(243);
				cmdDEF_FKEY_GROUP();
				}
				break;
			case C_DEF_QUAL:
				enterOuterAlt(_localctx, 20);
				{
				setState(244);
				cmdDEF_QUAL();
				}
				break;
			case C_DIAG_DISP:
				enterOuterAlt(_localctx, 21);
				{
				setState(245);
				cmdDIAG_DISP();
				}
				break;
			case C_DOT:
				enterOuterAlt(_localctx, 22);
				{
				setState(246);
				cmdDOT();
				}
				break;
			case C_EF_STATE:
				enterOuterAlt(_localctx, 23);
				{
				setState(247);
				cmdEF_STATE();
				}
				break;
			case C_ELSE:
				enterOuterAlt(_localctx, 24);
				{
				setState(248);
				cmdELSE();
				}
				break;
			case C_ENDIF:
				enterOuterAlt(_localctx, 25);
				{
				setState(249);
				cmdENDIF();
				}
				break;
			case C_ENDLOOP:
				enterOuterAlt(_localctx, 26);
				{
				setState(250);
				cmdENDLOOP();
				}
				break;
			case C_ENTRY_FLD:
				enterOuterAlt(_localctx, 27);
				{
				setState(251);
				cmdENTRY_FLD();
				}
				break;
			case C_FORCE_UPDATE:
				enterOuterAlt(_localctx, 28);
				{
				setState(252);
				cmdFORCE_UPDATE();
				}
				break;
			case C_FUNC_KEY:
				enterOuterAlt(_localctx, 29);
				{
				setState(253);
				cmdFUNC_KEY();
				}
				break;
			case C_GTEXT:
				enterOuterAlt(_localctx, 30);
				{
				setState(254);
				cmdGTEXT();
				}
				break;
			case C_IF:
				enterOuterAlt(_localctx, 31);
				{
				setState(255);
				cmdIF();
				}
				break;
			case C_IF_CHANGED:
				enterOuterAlt(_localctx, 32);
				{
				setState(256);
				cmdIF_CHANGED();
				}
				break;
			case C_IFELSE:
				enterOuterAlt(_localctx, 33);
				{
				setState(257);
				cmdIFELSE();
				}
				break;
			case C_LOOP:
				enterOuterAlt(_localctx, 34);
				{
				setState(258);
				cmdLOOP();
				}
				break;
			case C_MACRO:
				enterOuterAlt(_localctx, 35);
				{
				setState(259);
				cmdMACRO();
				}
				break;
			case C_DEF_MACRO:
				enterOuterAlt(_localctx, 36);
				{
				setState(260);
				cmdDEF_MACRO();
				}
				break;
			case C_DEF_MACRO_PARAMS:
				enterOuterAlt(_localctx, 37);
				{
				setState(261);
				cmdDEF_MACRO_PARAMS();
				}
				break;
			case C_SET_MACRO_BB:
				enterOuterAlt(_localctx, 38);
				{
				setState(262);
				cmdSET_MACRO_BB();
				}
				break;
			case C_END_MACRO:
				enterOuterAlt(_localctx, 39);
				{
				setState(263);
				cmdEND_MACRO();
				}
				break;
			case C_MATH:
				enterOuterAlt(_localctx, 40);
				{
				setState(264);
				cmdMATH();
				}
				break;
			case C_OL_BUTTON:
				enterOuterAlt(_localctx, 41);
				{
				setState(265);
				cmdOL_BUTTON();
				}
				break;
			case C_OL_RECTANGLE:
				enterOuterAlt(_localctx, 42);
				{
				setState(266);
				cmdOL_RECTANGLE();
				}
				break;
			case C_PAGE:
				enterOuterAlt(_localctx, 43);
				{
				setState(267);
				cmdPAGE();
				}
				break;
			case C_PLOT:
				enterOuterAlt(_localctx, 44);
				{
				setState(268);
				cmdPLOT();
				}
				break;
			case C_POINTER:
				enterOuterAlt(_localctx, 45);
				{
				setState(269);
				cmdPOINTER();
				}
				break;
			case C_POKE_FLD:
				enterOuterAlt(_localctx, 46);
				{
				setState(270);
				cmdPOKE_FLD();
				}
				break;
			case C_POKE_STATE:
				enterOuterAlt(_localctx, 47);
				{
				setState(271);
				cmdPOKE_STATE();
				}
				break;
			case C_PTR_VALUE:
				enterOuterAlt(_localctx, 48);
				{
				setState(272);
				cmdPTR_VALUE();
				}
				break;
			case C_PTR_MOVE:
				enterOuterAlt(_localctx, 49);
				{
				setState(273);
				cmdPTR_MOVE();
				}
				break;
			case C_RUN_PROGRAMS:
				enterOuterAlt(_localctx, 50);
				{
				setState(274);
				cmdRUN_PROGRAMS();
				}
				break;
			case C_SETVAL:
				enterOuterAlt(_localctx, 51);
				{
				setState(275);
				cmdSETVAL();
				}
				break;
			case C_TIME:
				enterOuterAlt(_localctx, 52);
				{
				setState(276);
				cmdTIME();
				}
				break;
			case C_XY_PLOT:
				enterOuterAlt(_localctx, 53);
				{
				setState(277);
				cmdXY_PLOT();
				}
				break;
			case C_SHAPELIB:
				enterOuterAlt(_localctx, 54);
				{
				setState(278);
				cmdSHAPELIB();
				}
				break;
			case C_DEF_SHAPE:
				enterOuterAlt(_localctx, 55);
				{
				setState(279);
				cmdDEF_SHAPE();
				}
				break;
			case C_END_SHAPE:
				enterOuterAlt(_localctx, 56);
				{
				setState(280);
				cmdEND_SHAPE();
				}
				break;
			case C_FONT:
				enterOuterAlt(_localctx, 57);
				{
				setState(281);
				cmdFONT();
				}
				break;
			case C_GCODE:
				enterOuterAlt(_localctx, 58);
				{
				setState(282);
				cmdGCODE();
				}
				break;
			case C_OL_GAUGE:
				enterOuterAlt(_localctx, 59);
				{
				setState(283);
				cmdOL_GAUGE();
				}
				break;
			case C_TREND:
				enterOuterAlt(_localctx, 60);
				{
				setState(284);
				cmdTREND();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFONTContext extends ParserRuleContext {
		public Token StringLiteral;
		public Token style;
		public TerminalNode C_FONT() { return getToken(glParser.C_FONT, 0); }
		public TerminalNode StringLiteral() { return getToken(glParser.StringLiteral, 0); }
		public TerminalNode FontStyleRegular() { return getToken(glParser.FontStyleRegular, 0); }
		public TerminalNode FontStyleBoldItalic() { return getToken(glParser.FontStyleBoldItalic, 0); }
		public TerminalNode FontStyleItalic() { return getToken(glParser.FontStyleItalic, 0); }
		public TerminalNode FontStyleBold() { return getToken(glParser.FontStyleBold, 0); }
		public CmdFONTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFONT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdFONT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdFONT(this);
		}
	}

	public final CmdFONTContext cmdFONT() throws RecognitionException {
		CmdFONTContext _localctx = new CmdFONTContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdFONT);

			ST template = new ST("Gfont(<name>,\"<style>\");");

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(C_FONT);
			setState(288);
			((CmdFONTContext)_localctx).StringLiteral = match(StringLiteral);
			 template.add("name", (((CmdFONTContext)_localctx).StringLiteral!=null?((CmdFONTContext)_localctx).StringLiteral.getText():null)); 
			setState(290);
			((CmdFONTContext)_localctx).style = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (FontStyleRegular - 161)) | (1L << (FontStyleBoldItalic - 161)) | (1L << (FontStyleItalic - 161)) | (1L << (FontStyleBold - 161)))) != 0)) ) {
				((CmdFONTContext)_localctx).style = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 template.add("style", (((CmdFONTContext)_localctx).style!=null?((CmdFONTContext)_localctx).style.getText():null)); 
			}
			_ctx.stop = _input.LT(-1);

				String output = template.render();
			//	println(UseCommands.get_use_cmds(section, "FONT") + output);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdGCODEContext extends ParserRuleContext {
		public TerminalNode C_GCODE() { return getToken(glParser.C_GCODE, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public TerminalNode Dpointer() { return getToken(glParser.Dpointer, 0); }
		public CmdGCODEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdGCODE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdGCODE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdGCODE(this);
		}
	}

	public final CmdGCODEContext cmdGCODE() throws RecognitionException {
		CmdGCODEContext _localctx = new CmdGCODEContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdGCODE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(C_GCODE);
			setState(294);
			literal_numbers();
			setState(295);
			match(Dpointer);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSHAPELIBContext extends ParserRuleContext {
		public TerminalNode C_SHAPELIB() { return getToken(glParser.C_SHAPELIB, 0); }
		public CmdSHAPELIBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSHAPELIB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdSHAPELIB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdSHAPELIB(this);
		}
	}

	public final CmdSHAPELIBContext cmdSHAPELIB() throws RecognitionException {
		CmdSHAPELIBContext _localctx = new CmdSHAPELIBContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdSHAPELIB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(C_SHAPELIB);
			 section = Section.I_SHAPELIB; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDEF_SHAPEContext extends ParserRuleContext {
		public ValueContext shape_number;
		public Token shape_name;
		public Token name;
		public TerminalNode C_DEF_SHAPE() { return getToken(glParser.C_DEF_SHAPE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(glParser.Identifier, 0); }
		public TerminalNode ID() { return getToken(glParser.ID, 0); }
		public CmdDEF_SHAPEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDEF_SHAPE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDEF_SHAPE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDEF_SHAPE(this);
		}
	}

	public final CmdDEF_SHAPEContext cmdDEF_SHAPE() throws RecognitionException {
		CmdDEF_SHAPEContext _localctx = new CmdDEF_SHAPEContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdDEF_SHAPE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(C_DEF_SHAPE);
			 if (!shape_first) { println(","); } shape_first = false; 
			setState(302);
			((CmdDEF_SHAPEContext)_localctx).shape_number = value();
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(303);
				((CmdDEF_SHAPEContext)_localctx).shape_name = match(Identifier);

							if (bruteForce((((CmdDEF_SHAPEContext)_localctx).shape_name!=null?((CmdDEF_SHAPEContext)_localctx).shape_name.getText():null).replace("\"", ""), keywords))
								print ((((CmdDEF_SHAPEContext)_localctx).shape_name!=null?((CmdDEF_SHAPEContext)_localctx).shape_name.getText():null).replace("\"", "") + ":{make:function(){var trgt = new PIXI.Graphics();");
							else
								print ("//" + (((CmdDEF_SHAPEContext)_localctx).shape_name!=null?((CmdDEF_SHAPEContext)_localctx).shape_name.getText():null).replace("\"", "") + ":{make:'");
						
				}
				break;
			case ID:
				{
				setState(305);
				((CmdDEF_SHAPEContext)_localctx).name = match(ID);

							if (bruteForce((((CmdDEF_SHAPEContext)_localctx).shape_name!=null?((CmdDEF_SHAPEContext)_localctx).shape_name.getText():null).replace("\"", ""), keywords))
								print ((((CmdDEF_SHAPEContext)_localctx).name!=null?((CmdDEF_SHAPEContext)_localctx).name.getText():null).replace("\"", "")       + ":{make:function(){var trgt = new PIXI.Graphics();");
							else
								print ("//" + (((CmdDEF_SHAPEContext)_localctx).name!=null?((CmdDEF_SHAPEContext)_localctx).name.getText():null).replace("\"", "")       + ":{make:'");
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEND_SHAPEContext extends ParserRuleContext {
		public ValueContext xorigin;
		public ValueContext yorigin;
		public ValueContext sw;
		public ValueContext sh;
		public ValueContext x;
		public ValueContext y;
		public ValueContext w;
		public ValueContext h;
		public TerminalNode C_END_SHAPE() { return getToken(glParser.C_END_SHAPE, 0); }
		public TerminalNode STAR() { return getToken(glParser.STAR, 0); }
		public List<TerminalNode> WEQUALS() { return getTokens(glParser.WEQUALS); }
		public TerminalNode WEQUALS(int i) {
			return getToken(glParser.WEQUALS, i);
		}
		public List<TerminalNode> HEQUALS() { return getTokens(glParser.HEQUALS); }
		public TerminalNode HEQUALS(int i) {
			return getToken(glParser.HEQUALS, i);
		}
		public TerminalNode LBRACKET() { return getToken(glParser.LBRACKET, 0); }
		public TerminalNode XEQUALS() { return getToken(glParser.XEQUALS, 0); }
		public TerminalNode YEQUALS() { return getToken(glParser.YEQUALS, 0); }
		public TerminalNode RBRACKET() { return getToken(glParser.RBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public CmdEND_SHAPEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEND_SHAPE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdEND_SHAPE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdEND_SHAPE(this);
		}
	}

	public final CmdEND_SHAPEContext cmdEND_SHAPE() throws RecognitionException {
		CmdEND_SHAPEContext _localctx = new CmdEND_SHAPEContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdEND_SHAPE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(C_END_SHAPE);
			 print ("return trgt;},"); 
			setState(311);
			((CmdEND_SHAPEContext)_localctx).xorigin = value();
			 print ("x0:"+(((CmdEND_SHAPEContext)_localctx).xorigin!=null?_input.getText(((CmdEND_SHAPEContext)_localctx).xorigin.start,((CmdEND_SHAPEContext)_localctx).xorigin.stop):null)+","); 
			setState(313);
			((CmdEND_SHAPEContext)_localctx).yorigin = value();
			 print ("y0:"+(((CmdEND_SHAPEContext)_localctx).yorigin!=null?_input.getText(((CmdEND_SHAPEContext)_localctx).yorigin.start,((CmdEND_SHAPEContext)_localctx).yorigin.stop):null)+"}"); 
			setState(315);
			match(STAR);
			setState(316);
			match(WEQUALS);
			setState(317);
			((CmdEND_SHAPEContext)_localctx).sw = value();
			setState(318);
			match(HEQUALS);
			setState(319);
			((CmdEND_SHAPEContext)_localctx).sh = value();
			setState(320);
			match(LBRACKET);
			setState(321);
			match(XEQUALS);
			setState(322);
			((CmdEND_SHAPEContext)_localctx).x = value();
			setState(323);
			match(YEQUALS);
			setState(324);
			((CmdEND_SHAPEContext)_localctx).y = value();
			setState(325);
			match(WEQUALS);
			setState(326);
			((CmdEND_SHAPEContext)_localctx).w = value();
			setState(327);
			match(HEQUALS);
			setState(328);
			((CmdEND_SHAPEContext)_localctx).h = value();
			setState(329);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDIAGRAMContext extends ParserRuleContext {
		public Token d;
		public Literal_numbersContext literal_numbers;
		public Token Color;
		public Token zoom_flag;
		public Token p;
		public Token s;
		public Token StringLiteral;
		public TerminalNode L_DIAGRAM() { return getToken(glParser.L_DIAGRAM, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode Color() { return getToken(glParser.Color, 0); }
		public TerminalNode MAIN() { return getToken(glParser.MAIN, 0); }
		public TerminalNode SUBWIN() { return getToken(glParser.SUBWIN, 0); }
		public TerminalNode WINDOW() { return getToken(glParser.WINDOW, 0); }
		public TerminalNode ZOOMABLE() { return getToken(glParser.ZOOMABLE, 0); }
		public TerminalNode NON_ZOOMABLE() { return getToken(glParser.NON_ZOOMABLE, 0); }
		public TerminalNode DEFAULT_POSITION() { return getToken(glParser.DEFAULT_POSITION, 0); }
		public TerminalNode FIXED_POSITION() { return getToken(glParser.FIXED_POSITION, 0); }
		public TerminalNode DEFAULT_SIZE() { return getToken(glParser.DEFAULT_SIZE, 0); }
		public TerminalNode FIXED_SIZE() { return getToken(glParser.FIXED_SIZE, 0); }
		public TerminalNode StringLiteral() { return getToken(glParser.StringLiteral, 0); }
		public CmdDIAGRAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDIAGRAM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDIAGRAM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDIAGRAM(this);
		}
	}

	public final CmdDIAGRAMContext cmdDIAGRAM() throws RecognitionException {
		CmdDIAGRAMContext _localctx = new CmdDIAGRAMContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdDIAGRAM);

			ST t = new ST("Gdiagram("+
				"<diag_num>,"+
				"<diag_type>,<icon_num>,"+
				"<x>,<y>,<w>,<h>,"+
				"<bg_color>,<zoom_flag>,<revision_num>,"+
				"<x_extents>,<y_extents>,<width_extents>,<height_extents>,"+
				"<update_rate>,<positioning>,<sizing>,<subscreen_num>,<diag_title>);");
			t.add("diag_num", diagNumber);
			t.add("subscreen_num", 65535);
			t.add("diag_title", "\"\"");

			ST tmpltDiag = new ST(
				"{diag_num:<diag_num>,"+
				"diag_type:<diag_type>,"+
				"icon_num:<icon_num>,"+
				"x:<x>,y:<y>,w:<w>,h:<h>,"+
				"background:<bg_color>,"+
				"zoom_flag:<zoom_flag>,"+
				"revision_num:<revision_num>,"+
				"x_extents:<x_extents>,"+
				"y_extents:<y_extents>,"+
				"w_extents:<width_extents>,"+
				"h_extents:<height_extents>,"+
				"update_rate:<update_rate>,"+
				"positioning:<positioning>,"+
				"sizing:<sizing>,"+
				"subscreen_num:<subscreen_num>,"+
				"diag_title:<diag_title>};");
			tmpltDiag.add("diag_num", diagNumber);
			tmpltDiag.add("subscreen_num", 65535);
			tmpltDiag.add("diag_title", "\"\"");

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(L_DIAGRAM);
			setState(332);
			((CmdDIAGRAMContext)_localctx).d = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIN) | (1L << SUBWIN) | (1L << WINDOW))) != 0)) ) {
				((CmdDIAGRAMContext)_localctx).d = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 tmpltDiag.add("diag_type",      (((CmdDIAGRAMContext)_localctx).d!=null?((CmdDIAGRAMContext)_localctx).d.getText():null));                                t.add("diag_type",      (((CmdDIAGRAMContext)_localctx).d!=null?((CmdDIAGRAMContext)_localctx).d.getText():null)); 
			setState(334);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("icon_num",       (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null));                  t.add("icon_num",       (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null)); 
			setState(336);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("x",              macroPort.calcX((((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null))); t.add("x",              macroPort.calcX((((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null))); 
			setState(338);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("y",              macroPort.calcY((((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null))); t.add("y",              macroPort.calcY((((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null))); 
			setState(340);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("w",              macroPort.calcW((((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null))); t.add("w",              macroPort.calcW((((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null))); 
			setState(342);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("h",              macroPort.calcH((((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null))); t.add("h",              macroPort.calcH((((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null))); 
			setState(344);
			((CmdDIAGRAMContext)_localctx).Color = match(Color);
			 tmpltDiag.add("bg_color",       (((CmdDIAGRAMContext)_localctx).Color!=null?((CmdDIAGRAMContext)_localctx).Color.getText():null));                            t.add("bg_color",       (((CmdDIAGRAMContext)_localctx).Color!=null?((CmdDIAGRAMContext)_localctx).Color.getText():null)); 
			setState(346);
			((CmdDIAGRAMContext)_localctx).zoom_flag = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ZOOMABLE || _la==NON_ZOOMABLE) ) {
				((CmdDIAGRAMContext)_localctx).zoom_flag = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 tmpltDiag.add("zoom_flag",      (((CmdDIAGRAMContext)_localctx).zoom_flag!=null?((CmdDIAGRAMContext)_localctx).zoom_flag.getText():null));                        t.add("zoom_flag",      (((CmdDIAGRAMContext)_localctx).zoom_flag!=null?((CmdDIAGRAMContext)_localctx).zoom_flag.getText():null)); 
			setState(348);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("revision_num",   (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null));                  t.add("revision_num",   (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null)); 
			setState(350);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("x_extents",      (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null));                  t.add("x_extents",      (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null)); 
			setState(352);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("y_extents",      (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null));                  t.add("y_extents",      (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null)); 
			setState(354);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("width_extents",  (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null));                  t.add("width_extents",  (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null)); 
			setState(356);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("height_extents", (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null));                  t.add("height_extents", (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null)); 
			setState(358);
			((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();
			 tmpltDiag.add("update_rate",    (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null));                  t.add("update_rate",    (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null)); 
			setState(360);
			((CmdDIAGRAMContext)_localctx).p = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT_POSITION || _la==FIXED_POSITION) ) {
				((CmdDIAGRAMContext)_localctx).p = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 tmpltDiag.add("positioning",    (((CmdDIAGRAMContext)_localctx).p!=null?((CmdDIAGRAMContext)_localctx).p.getText():null));                                t.add("positioning",    (((CmdDIAGRAMContext)_localctx).p!=null?((CmdDIAGRAMContext)_localctx).p.getText():null)); 
			setState(362);
			((CmdDIAGRAMContext)_localctx).s = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT_SIZE || _la==FIXED_SIZE) ) {
				((CmdDIAGRAMContext)_localctx).s = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 tmpltDiag.add("sizing",         (((CmdDIAGRAMContext)_localctx).s!=null?((CmdDIAGRAMContext)_localctx).s.getText():null));                                t.add("sizing",         (((CmdDIAGRAMContext)_localctx).s!=null?((CmdDIAGRAMContext)_localctx).s.getText():null)); 
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (ConstVariable - 184)) | (1L << (ColorVariable - 184)) | (1L << (PLUS - 184)) | (1L << (MINUS - 184)) | (1L << (IntegerLiteral - 184)) | (1L << (FloatingPointLiteral - 184)))) != 0)) {
				{
				setState(364);
				((CmdDIAGRAMContext)_localctx).literal_numbers = literal_numbers();

							tmpltDiag.remove("subscreen_num"); tmpltDiag.add("subscreen_num", (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null));
							        t.remove("subscreen_num");         t.add("subscreen_num", (((CmdDIAGRAMContext)_localctx).literal_numbers!=null?_input.getText(((CmdDIAGRAMContext)_localctx).literal_numbers.start,((CmdDIAGRAMContext)_localctx).literal_numbers.stop):null));
						
				}
			}

			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(369);
				((CmdDIAGRAMContext)_localctx).StringLiteral = match(StringLiteral);

							tmpltDiag.remove("diag_title"); tmpltDiag.add("diag_title", (((CmdDIAGRAMContext)_localctx).StringLiteral!=null?((CmdDIAGRAMContext)_localctx).StringLiteral.getText():null));
				                    t.remove("diag_title");         t.add("diag_title", (((CmdDIAGRAMContext)_localctx).StringLiteral!=null?((CmdDIAGRAMContext)_localctx).StringLiteral.getText():null));
							if (diagTitle_first) {
								diagTitle_first = false;
								diagTitle = (((CmdDIAGRAMContext)_localctx).StringLiteral!=null?((CmdDIAGRAMContext)_localctx).StringLiteral.getText():null);
							}
						
				}
			}

			}
			_ctx.stop = _input.LT(-1);

				section = Section.I_DIAGRAM;

				diagTitle_number++;

				if (diagTitle_number == 1) {
					diagParam = tmpltDiag.render();
					diagType = (((CmdDIAGRAMContext)_localctx).d!=null?((CmdDIAGRAMContext)_localctx).d.getText():null);
					diagType = diagType.replace("\"", "");
					if (!macroPort.get_m_flag()) {
						String output = t.render();
						println(output);
						switch ((((CmdDIAGRAMContext)_localctx).d!=null?((CmdDIAGRAMContext)_localctx).d.getText():null))
						{
							case "\"MAIN\"":   diagTypeNumber = DIAG_TYPE_MAIN;   break;
							case "\"SUBWIN\"": diagTypeNumber = DIAG_TYPE_SUBWIN; break;
							case "\"WINDOW\"": diagTypeNumber = DIAG_TYPE_WINDOW; break;
						}
					}
				}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdKEYBOARDContext extends ParserRuleContext {
		public TerminalNode L_KEYBOARD() { return getToken(glParser.L_KEYBOARD, 0); }
		public CmdKEYBOARDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdKEYBOARD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdKEYBOARD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdKEYBOARD(this);
		}
	}

	public final CmdKEYBOARDContext cmdKEYBOARD() throws RecognitionException {
		CmdKEYBOARDContext _localctx = new CmdKEYBOARDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdKEYBOARD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(L_KEYBOARD);

					if (section == Section.I_TRIGGER) println("}");
					ret_from_trigger_section = section = Section.I_KEYBOARD;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdBACKGROUNDContext extends ParserRuleContext {
		public TerminalNode L_BACKGROUND() { return getToken(glParser.L_BACKGROUND, 0); }
		public CmdBACKGROUNDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdBACKGROUND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdBACKGROUND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdBACKGROUND(this);
		}
	}

	public final CmdBACKGROUNDContext cmdBACKGROUND() throws RecognitionException {
		CmdBACKGROUNDContext _localctx = new CmdBACKGROUNDContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdBACKGROUND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(L_BACKGROUND);

					if (section == Section.I_TRIGGER) println("}");
					ret_from_trigger_section = section = Section.I_BACKGROUND;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFOREGROUNDContext extends ParserRuleContext {
		public TerminalNode L_FOREGROUND() { return getToken(glParser.L_FOREGROUND, 0); }
		public CmdFOREGROUNDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFOREGROUND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdFOREGROUND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdFOREGROUND(this);
		}
	}

	public final CmdFOREGROUNDContext cmdFOREGROUND() throws RecognitionException {
		CmdFOREGROUNDContext _localctx = new CmdFOREGROUNDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdFOREGROUND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(L_FOREGROUND);

					if (section == Section.I_TRIGGER) println("}");
					ret_from_trigger_section = section = Section.I_FOREGROUND;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdTRIGGERContext extends ParserRuleContext {
		public Literal_numbersContext n;
		public TerminalNode L_TRIGGER() { return getToken(glParser.L_TRIGGER, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public CmdTRIGGERContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdTRIGGER; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdTRIGGER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdTRIGGER(this);
		}
	}

	public final CmdTRIGGERContext cmdTRIGGER() throws RecognitionException {
		CmdTRIGGERContext _localctx = new CmdTRIGGERContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdTRIGGER);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(L_TRIGGER);
			setState(383);
			((CmdTRIGGERContext)_localctx).n = literal_numbers();

					if (section == Section.I_TRIGGER) {
						println("}");
						println("XXXL.prototype.TRIGGER_" + (((CmdTRIGGERContext)_localctx).n!=null?_input.getText(((CmdTRIGGERContext)_localctx).n.start,((CmdTRIGGERContext)_localctx).n.stop):null) + " = function() {");
					} else {
						sctnTRIGGER.add("XXXL.prototype.TRIGGER_" + (((CmdTRIGGERContext)_localctx).n!=null?_input.getText(((CmdTRIGGERContext)_localctx).n.start,((CmdTRIGGERContext)_localctx).n.stop):null) + " = function() {");
						sctnTRIGGER.add("\n");
					}

					section = ret_from_trigger_section; 
					println("if (trig_on(" + (((CmdTRIGGERContext)_localctx).n!=null?_input.getText(((CmdTRIGGERContext)_localctx).n.start,((CmdTRIGGERContext)_localctx).n.stop):null) + ") && this.TRIGGER_" + (((CmdTRIGGERContext)_localctx).n!=null?_input.getText(((CmdTRIGGERContext)_localctx).n.start,((CmdTRIGGERContext)_localctx).n.stop):null) + ") this.TRIGGER_" + (((CmdTRIGGERContext)_localctx).n!=null?_input.getText(((CmdTRIGGERContext)_localctx).n.start,((CmdTRIGGERContext)_localctx).n.stop):null) + "();");

					section = Section.I_TRIGGER;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEXITContext extends ParserRuleContext {
		public TerminalNode L_EXIT() { return getToken(glParser.L_EXIT, 0); }
		public CmdEXITContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEXIT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdEXIT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdEXIT(this);
		}
	}

	public final CmdEXITContext cmdEXIT() throws RecognitionException {
		CmdEXITContext _localctx = new CmdEXITContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdEXIT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(L_EXIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_conditional_valueContext extends ParserRuleContext {
		public String arg_name;
		public ArrayList<String> arg_result;
		public Token LineFillPattern;
		public ConditionalExpressionContext conditionalExpression;
		public Token Color;
		public Literal_numbersContext literal_numbers;
		public Token BlinkPattern;
		public Token Identifier;
		public Token StringLiteral;
		public Rec_fld_patContext rec_fld_pat;
		public Offset_patContext offset_pat;
		public TerminalNode LineFillPattern() { return getToken(glParser.LineFillPattern, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode Color() { return getToken(glParser.Color, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public TerminalNode BlinkPattern() { return getToken(glParser.BlinkPattern, 0); }
		public TerminalNode Identifier() { return getToken(glParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(glParser.StringLiteral, 0); }
		public Rec_fld_patContext rec_fld_pat() {
			return getRuleContext(Rec_fld_patContext.class,0);
		}
		public Offset_patContext offset_pat() {
			return getRuleContext(Offset_patContext.class,0);
		}
		public Def_conditional_valueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Def_conditional_valueContext(ParserRuleContext parent, int invokingState, String arg_name) {
			super(parent, invokingState);
			this.arg_name = arg_name;
		}
		@Override public int getRuleIndex() { return RULE_def_conditional_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterDef_conditional_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitDef_conditional_value(this);
		}
	}

	public final Def_conditional_valueContext def_conditional_value(String arg_name) throws RecognitionException {
		Def_conditional_valueContext _localctx = new Def_conditional_valueContext(_ctx, getState(), arg_name);
		enterRule(_localctx, 30, RULE_def_conditional_value);

			((Def_conditional_valueContext)_localctx).arg_result =  new ArrayList<String>();
			statement_name = _localctx.arg_name;

		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LineFillPattern:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				((Def_conditional_valueContext)_localctx).LineFillPattern = match(LineFillPattern);

						_localctx.arg_result.add((((Def_conditional_valueContext)_localctx).LineFillPattern!=null?((Def_conditional_valueContext)_localctx).LineFillPattern.getText():null));
						_localctx.arg_result.add(_localctx.arg_name+"="+(((Def_conditional_valueContext)_localctx).LineFillPattern!=null?((Def_conditional_valueContext)_localctx).LineFillPattern.getText():null)+";");
					
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(390);
					((Def_conditional_valueContext)_localctx).conditionalExpression = conditionalExpression();
					 _localctx.arg_result.add(((Def_conditional_valueContext)_localctx).conditionalExpression.str); 
					}
					break;
				}
				}
				break;
			case Color:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				((Def_conditional_valueContext)_localctx).Color = match(Color);

						_localctx.arg_result.add((((Def_conditional_valueContext)_localctx).Color!=null?((Def_conditional_valueContext)_localctx).Color.getText():null));
						_localctx.arg_result.add(_localctx.arg_name+"="+(((Def_conditional_valueContext)_localctx).Color!=null?((Def_conditional_valueContext)_localctx).Color.getText():null)+";");
					
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(397);
					((Def_conditional_valueContext)_localctx).conditionalExpression = conditionalExpression();
					 _localctx.arg_result.add(((Def_conditional_valueContext)_localctx).conditionalExpression.str); 
					}
					break;
				}
				}
				break;
			case ConstVariable:
			case ColorVariable:
			case PLUS:
			case MINUS:
			case IntegerLiteral:
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				((Def_conditional_valueContext)_localctx).literal_numbers = literal_numbers();

						_localctx.arg_result.add((((Def_conditional_valueContext)_localctx).literal_numbers!=null?_input.getText(((Def_conditional_valueContext)_localctx).literal_numbers.start,((Def_conditional_valueContext)_localctx).literal_numbers.stop):null));
						_localctx.arg_result.add(_localctx.arg_name+"="+(((Def_conditional_valueContext)_localctx).literal_numbers!=null?_input.getText(((Def_conditional_valueContext)_localctx).literal_numbers.start,((Def_conditional_valueContext)_localctx).literal_numbers.stop):null)+";");
					
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(404);
					((Def_conditional_valueContext)_localctx).conditionalExpression = conditionalExpression();
					 _localctx.arg_result.add(((Def_conditional_valueContext)_localctx).conditionalExpression.str); 
					}
					break;
				}
				}
				break;
			case BlinkPattern:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				((Def_conditional_valueContext)_localctx).BlinkPattern = match(BlinkPattern);

						_localctx.arg_result.add((((Def_conditional_valueContext)_localctx).BlinkPattern!=null?((Def_conditional_valueContext)_localctx).BlinkPattern.getText():null));
						_localctx.arg_result.add(_localctx.arg_name+"="+(((Def_conditional_valueContext)_localctx).BlinkPattern!=null?((Def_conditional_valueContext)_localctx).BlinkPattern.getText():null)+";");
					
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(411);
					((Def_conditional_valueContext)_localctx).conditionalExpression = conditionalExpression();
					 _localctx.arg_result.add(((Def_conditional_valueContext)_localctx).conditionalExpression.str); 
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				((Def_conditional_valueContext)_localctx).Identifier = match(Identifier);

						_localctx.arg_result.add((((Def_conditional_valueContext)_localctx).Identifier!=null?((Def_conditional_valueContext)_localctx).Identifier.getText():null));
						_localctx.arg_result.add(_localctx.arg_name+"="+(((Def_conditional_valueContext)_localctx).Identifier!=null?((Def_conditional_valueContext)_localctx).Identifier.getText():null)+";");
					
				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(418);
					((Def_conditional_valueContext)_localctx).conditionalExpression = conditionalExpression();
					 _localctx.arg_result.add(((Def_conditional_valueContext)_localctx).conditionalExpression.str); 
					}
					break;
				}
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				((Def_conditional_valueContext)_localctx).StringLiteral = match(StringLiteral);

						_localctx.arg_result.add((((Def_conditional_valueContext)_localctx).StringLiteral!=null?((Def_conditional_valueContext)_localctx).StringLiteral.getText():null));
						_localctx.arg_result.add(_localctx.arg_name+"="+(((Def_conditional_valueContext)_localctx).StringLiteral!=null?((Def_conditional_valueContext)_localctx).StringLiteral.getText():null)+";");
					
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(425);
					((Def_conditional_valueContext)_localctx).conditionalExpression = conditionalExpression();
					 _localctx.arg_result.add(((Def_conditional_valueContext)_localctx).conditionalExpression.str); 
					}
					break;
				}
				}
				break;
			case RecordField:
				enterOuterAlt(_localctx, 7);
				{
				setState(430);
				((Def_conditional_valueContext)_localctx).rec_fld_pat = rec_fld_pat();

						_localctx.arg_result.add((((Def_conditional_valueContext)_localctx).rec_fld_pat!=null?_input.getText(((Def_conditional_valueContext)_localctx).rec_fld_pat.start,((Def_conditional_valueContext)_localctx).rec_fld_pat.stop):null));
						_localctx.arg_result.add(_localctx.arg_name+"="+(((Def_conditional_valueContext)_localctx).rec_fld_pat!=null?_input.getText(((Def_conditional_valueContext)_localctx).rec_fld_pat.start,((Def_conditional_valueContext)_localctx).rec_fld_pat.stop):null)+";");
					
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(432);
					((Def_conditional_valueContext)_localctx).conditionalExpression = conditionalExpression();
					 _localctx.arg_result.add(((Def_conditional_valueContext)_localctx).conditionalExpression.str); 
					}
					break;
				}
				}
				break;
			case Spointer:
			case Ioffset:
			case Roffset:
			case Boffset:
			case Soffset:
			case Aoffset:
				enterOuterAlt(_localctx, 8);
				{
				setState(437);
				((Def_conditional_valueContext)_localctx).offset_pat = offset_pat();

						_localctx.arg_result.add((((Def_conditional_valueContext)_localctx).offset_pat!=null?_input.getText(((Def_conditional_valueContext)_localctx).offset_pat.start,((Def_conditional_valueContext)_localctx).offset_pat.stop):null));
						_localctx.arg_result.add(_localctx.arg_name+"="+(((Def_conditional_valueContext)_localctx).offset_pat!=null?_input.getText(((Def_conditional_valueContext)_localctx).offset_pat.start,((Def_conditional_valueContext)_localctx).offset_pat.stop):null)+";");
					
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(439);
					((Def_conditional_valueContext)_localctx).conditionalExpression = conditionalExpression();
					 _localctx.arg_result.add(((Def_conditional_valueContext)_localctx).conditionalExpression.str); 
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public String str;
		public SimpleExpressionContext simpleExpression;
		public CompoundExpressionContext compoundExpression;
		public CaseExpressionContext caseExpression;
		public QualityExpressionContext qualityExpression;
		public SetExpressionContext setExpression;
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public CompoundExpressionContext compoundExpression() {
			return getRuleContext(CompoundExpressionContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public QualityExpressionContext qualityExpression() {
			return getRuleContext(QualityExpressionContext.class,0);
		}
		public SetExpressionContext setExpression() {
			return getRuleContext(SetExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionalExpression);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Gpointer:
			case Hpointer:
			case Wpointer:
			case Dpointer:
			case Ppointer:
			case Spointer:
			case Opointer:
			case SetVariable:
			case ConstVariable:
			case ColorVariable:
			case LPAREN:
			case PLUS:
			case MINUS:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case PointName:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				((ConditionalExpressionContext)_localctx).simpleExpression = simpleExpression();
				 ((ConditionalExpressionContext)_localctx).str = ((ConditionalExpressionContext)_localctx).simpleExpression.str;   
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				((ConditionalExpressionContext)_localctx).compoundExpression = compoundExpression();
				 ((ConditionalExpressionContext)_localctx).str = ((ConditionalExpressionContext)_localctx).compoundExpression.str; 
				}
				break;
			case CaseExp:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				((ConditionalExpressionContext)_localctx).caseExpression = caseExpression();
				 ((ConditionalExpressionContext)_localctx).str = ((ConditionalExpressionContext)_localctx).caseExpression.str;     
				}
				break;
			case QualityExp:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
				((ConditionalExpressionContext)_localctx).qualityExpression = qualityExpression();
				 ((ConditionalExpressionContext)_localctx).str = ((ConditionalExpressionContext)_localctx).qualityExpression.str;  
				}
				break;
			case SetExp:
				enterOuterAlt(_localctx, 5);
				{
				setState(458);
				((ConditionalExpressionContext)_localctx).setExpression = setExpression();
				 ((ConditionalExpressionContext)_localctx).str = ((ConditionalExpressionContext)_localctx).setExpression.str;      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public String str;
		public ExpressionContext smpl_expression;
		public Conditional_valueContext cond_value;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Conditional_valueContext conditional_value() {
			return getRuleContext(Conditional_valueContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			 ExprClear(); 
			setState(464);
			((SimpleExpressionContext)_localctx).smpl_expression = expression(0);
			setState(465);
			((SimpleExpressionContext)_localctx).cond_value = conditional_value();
			 ((SimpleExpressionContext)_localctx).str = "if "+((SimpleExpressionContext)_localctx).smpl_expression.str+" {"+statement_name+"="+(((SimpleExpressionContext)_localctx).cond_value!=null?_input.getText(((SimpleExpressionContext)_localctx).cond_value.start,((SimpleExpressionContext)_localctx).cond_value.stop):null)+";} "; 
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundExpressionContext extends ParserRuleContext {
		public String str;
		public boolean first = true;
		public String tmp;
		public SimpleExpressionContext smpl_expression;
		public TerminalNode LBRACE() { return getToken(glParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(glParser.RBRACE, 0); }
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public CompoundExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCompoundExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCompoundExpression(this);
		}
	}

	public final CompoundExpressionContext compoundExpression() throws RecognitionException {
		CompoundExpressionContext _localctx = new CompoundExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compoundExpression);
		 ((CompoundExpressionContext)_localctx).str =  ""; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(468);
			match(LBRACE);
			setState(472); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(469);
				((CompoundExpressionContext)_localctx).smpl_expression = simpleExpression();

								((CompoundExpressionContext)_localctx).tmp =  ((CompoundExpressionContext)_localctx).smpl_expression.str;
								if (_localctx.first) {
									((CompoundExpressionContext)_localctx).first =  false;
								} else {
									((CompoundExpressionContext)_localctx).tmp =  _localctx.tmp.replace("if ", "else if ");
								}
								((CompoundExpressionContext)_localctx).str =  _localctx.str + _localctx.tmp;
							
				}
				}
				setState(474); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (Gpointer - 167)) | (1L << (Hpointer - 167)) | (1L << (Wpointer - 167)) | (1L << (Dpointer - 167)) | (1L << (Ppointer - 167)) | (1L << (Spointer - 167)) | (1L << (Opointer - 167)) | (1L << (SetVariable - 167)) | (1L << (ConstVariable - 167)) | (1L << (ColorVariable - 167)) | (1L << (LPAREN - 167)) | (1L << (PLUS - 167)) | (1L << (MINUS - 167)) | (1L << (IntegerLiteral - 167)) | (1L << (FloatingPointLiteral - 167)) | (1L << (PointName - 167)))) != 0) );
			setState(476);
			match(RBRACE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpressionContext extends ParserRuleContext {
		public String str;
		public int counter = 0;
		public ValueContext point;
		public Token initial_val;
		public Token increment;
		public Literal_numbersContext count;
		public Conditional_valueContext cond_value;
		public TerminalNode CaseExp() { return getToken(glParser.CaseExp, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> IntegerLiteral() { return getTokens(glParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(glParser.IntegerLiteral, i);
		}
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public List<Conditional_valueContext> conditional_value() {
			return getRuleContexts(Conditional_valueContext.class);
		}
		public Conditional_valueContext conditional_value(int i) {
			return getRuleContext(Conditional_valueContext.class,i);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCaseExpression(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_caseExpression);
		 ((CaseExpressionContext)_localctx).str =  ""; 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(478);
			match(CaseExp);
			setState(479);
			((CaseExpressionContext)_localctx).point = value();
			setState(480);
			((CaseExpressionContext)_localctx).initial_val = match(IntegerLiteral);
			setState(481);
			((CaseExpressionContext)_localctx).increment = match(IntegerLiteral);
			setState(482);
			((CaseExpressionContext)_localctx).count = literal_numbers();
			setState(486); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(483);
					((CaseExpressionContext)_localctx).cond_value = conditional_value();

									_localctx.counter++;
									int ll = ((((CaseExpressionContext)_localctx).initial_val!=null?Integer.valueOf(((CaseExpressionContext)_localctx).initial_val.getText()):0)+((((CaseExpressionContext)_localctx).increment!=null?Integer.valueOf(((CaseExpressionContext)_localctx).increment.getText()):0)*(_localctx.counter)));
									int hl = ((((CaseExpressionContext)_localctx).initial_val!=null?Integer.valueOf(((CaseExpressionContext)_localctx).initial_val.getText()):0)+((((CaseExpressionContext)_localctx).increment!=null?Integer.valueOf(((CaseExpressionContext)_localctx).increment.getText()):0)*((_localctx.counter)+1)));
									((CaseExpressionContext)_localctx).str =  _localctx.str + "if (("+((CaseExpressionContext)_localctx).point.str+">="+ll+")&&("+((CaseExpressionContext)_localctx).point.str+"<"+hl+")) {"+statement_name+"="+(((CaseExpressionContext)_localctx).cond_value!=null?_input.getText(((CaseExpressionContext)_localctx).cond_value.start,((CaseExpressionContext)_localctx).cond_value.stop):null)+";} ";
								
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(488); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualityExpressionContext extends ParserRuleContext {
		public String str;
		public Pt_name_patContext pt_name_pat;
		public Conditional_valueContext fair_quality_cond_value;
		public Conditional_valueContext poor_quality_cond_value;
		public Conditional_valueContext bad_quality_cond_value;
		public Conditional_valueContext timedout_quality_cond_value;
		public TerminalNode QualityExp() { return getToken(glParser.QualityExp, 0); }
		public Pt_name_patContext pt_name_pat() {
			return getRuleContext(Pt_name_patContext.class,0);
		}
		public List<Conditional_valueContext> conditional_value() {
			return getRuleContexts(Conditional_valueContext.class);
		}
		public Conditional_valueContext conditional_value(int i) {
			return getRuleContext(Conditional_valueContext.class,i);
		}
		public QualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterQualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitQualityExpression(this);
		}
	}

	public final QualityExpressionContext qualityExpression() throws RecognitionException {
		QualityExpressionContext _localctx = new QualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_qualityExpression);
		 ((QualityExpressionContext)_localctx).str =  ""; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(490);
			match(QualityExp);
			setState(491);
			((QualityExpressionContext)_localctx).pt_name_pat = pt_name_pat();
			setState(492);
			((QualityExpressionContext)_localctx).fair_quality_cond_value = conditional_value();
			setState(493);
			((QualityExpressionContext)_localctx).poor_quality_cond_value = conditional_value();
			setState(494);
			((QualityExpressionContext)_localctx).bad_quality_cond_value = conditional_value();
			setState(495);
			((QualityExpressionContext)_localctx).timedout_quality_cond_value = conditional_value();

						((QualityExpressionContext)_localctx).str =  _localctx.str + "if (vStatus("+(((QualityExpressionContext)_localctx).pt_name_pat!=null?_input.getText(((QualityExpressionContext)_localctx).pt_name_pat.start,((QualityExpressionContext)_localctx).pt_name_pat.stop):null)+",\"=\",\"FAIR\")"+") {"+statement_name+"="+(((QualityExpressionContext)_localctx).fair_quality_cond_value!=null?_input.getText(((QualityExpressionContext)_localctx).fair_quality_cond_value.start,((QualityExpressionContext)_localctx).fair_quality_cond_value.stop):null)+";} ";
						((QualityExpressionContext)_localctx).str =  _localctx.str + "if (vStatus("+(((QualityExpressionContext)_localctx).pt_name_pat!=null?_input.getText(((QualityExpressionContext)_localctx).pt_name_pat.start,((QualityExpressionContext)_localctx).pt_name_pat.stop):null)+",\"=\",\"POOR\")"+") {"+statement_name+"="+(((QualityExpressionContext)_localctx).poor_quality_cond_value!=null?_input.getText(((QualityExpressionContext)_localctx).poor_quality_cond_value.start,((QualityExpressionContext)_localctx).poor_quality_cond_value.stop):null)+";} ";
						((QualityExpressionContext)_localctx).str =  _localctx.str + "if (vStatus("+(((QualityExpressionContext)_localctx).pt_name_pat!=null?_input.getText(((QualityExpressionContext)_localctx).pt_name_pat.start,((QualityExpressionContext)_localctx).pt_name_pat.stop):null)+",\"=\",\"BAD\")" +") {"+statement_name+"="+(((QualityExpressionContext)_localctx).bad_quality_cond_value!=null?_input.getText(((QualityExpressionContext)_localctx).bad_quality_cond_value.start,((QualityExpressionContext)_localctx).bad_quality_cond_value.stop):null)+";} ";
						((QualityExpressionContext)_localctx).str =  _localctx.str + "if (vStatus("+(((QualityExpressionContext)_localctx).pt_name_pat!=null?_input.getText(((QualityExpressionContext)_localctx).pt_name_pat.start,((QualityExpressionContext)_localctx).pt_name_pat.stop):null)+",\"=\",\"ON0\")" +") {"+statement_name+"="+(((QualityExpressionContext)_localctx).timedout_quality_cond_value!=null?_input.getText(((QualityExpressionContext)_localctx).timedout_quality_cond_value.start,((QualityExpressionContext)_localctx).timedout_quality_cond_value.stop):null)+";} ";
					
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetExpressionContext extends ParserRuleContext {
		public String str;
		public int counter = 0;
		public Token set_variable;
		public Literal_numbersContext num;
		public Conditional_valueContext cond_value;
		public TerminalNode SetExp() { return getToken(glParser.SetExp, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public List<Conditional_valueContext> conditional_value() {
			return getRuleContexts(Conditional_valueContext.class);
		}
		public Conditional_valueContext conditional_value(int i) {
			return getRuleContext(Conditional_valueContext.class,i);
		}
		public SetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterSetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitSetExpression(this);
		}
	}

	public final SetExpressionContext setExpression() throws RecognitionException {
		SetExpressionContext _localctx = new SetExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setExpression);
		 ((SetExpressionContext)_localctx).str =  ""; 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(498);
			((SetExpressionContext)_localctx).set_variable = match(SetExp);
			setState(499);
			((SetExpressionContext)_localctx).num = literal_numbers();
			setState(503); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(500);
					((SetExpressionContext)_localctx).cond_value = conditional_value();

									_localctx.counter++;
									((SetExpressionContext)_localctx).str =  _localctx.str + "if ("+(((SetExpressionContext)_localctx).set_variable!=null?((SetExpressionContext)_localctx).set_variable.getText():null)+"=="+_localctx.counter+") {"+statement_name+"="+(((SetExpressionContext)_localctx).cond_value!=null?_input.getText(((SetExpressionContext)_localctx).cond_value.start,((SetExpressionContext)_localctx).cond_value.stop):null)+";} ";
								
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(505); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String str;
		public Token StatusWord;
		public Token StatusVariable;
		public Primary_exprContext primary_expr() {
			return getRuleContext(Primary_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(glParser.PLUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(glParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(glParser.LT, 0); }
		public TerminalNode GT() { return getToken(glParser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(glParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(glParser.GTEQ, 0); }
		public TerminalNode EQUALS() { return getToken(glParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(glParser.NOTEQUALS, 0); }
		public TerminalNode AND() { return getToken(glParser.AND, 0); }
		public TerminalNode OR() { return getToken(glParser.OR, 0); }
		public TerminalNode EOR() { return getToken(glParser.EOR, 0); }
		public TerminalNode StatusWord() { return getToken(glParser.StatusWord, 0); }
		public TerminalNode StatusVariable() { return getToken(glParser.StatusVariable, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(508);
				primary_expr();
				}
				break;
			case 2:
				{
				setState(509);
				match(PLUS);
				 ExprAdd("+" ); 
				setState(511);
				expression(15);
				}
				break;
			case 3:
				{
				setState(512);
				match(MINUS);
				 ExprAdd("-" ); 
				setState(514);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(569);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(517);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(518);
						match(LT);
						 ExprAdd("<" ); 
						setState(520);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(521);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(522);
						match(GT);
						 ExprAdd(">" ); 
						setState(524);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(525);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(526);
						match(LTEQ);
						 ExprAdd("<="); 
						setState(528);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(529);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(530);
						match(GTEQ);
						 ExprAdd(">="); 
						setState(532);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(533);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(534);
						match(EQUALS);
						 ExprAdd("=="); 
						setState(536);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(537);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(538);
						match(NOTEQUALS);
						 ExprAdd("!="); 
						setState(540);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(541);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(542);
						match(AND);
						 ExprAdd("&&"); 
						setState(544);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(545);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(546);
						match(OR);
						 ExprAdd("||"); 
						setState(548);
						expression(3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(549);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(550);
						match(EOR);
						 ExprAdd("^" ); 
						setState(552);
						expression(2);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(553);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(554);
						match(EQUALS);
						setState(555);
						((ExpressionContext)_localctx).StatusWord = match(StatusWord);

						          			//ExprAddStatusVariable(",\"=\","+status.getMask((((ExpressionContext)_localctx).StatusWord!=null?((ExpressionContext)_localctx).StatusWord.getText():null))+","+status.getPattern((((ExpressionContext)_localctx).StatusWord!=null?((ExpressionContext)_localctx).StatusWord.getText():null))+")");
						          			ExprAddStatusVariable(",\"=\",\""+(((ExpressionContext)_localctx).StatusWord!=null?((ExpressionContext)_localctx).StatusWord.getText():null)+"\")");
						          		
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(557);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(558);
						match(NOTEQUALS);
						setState(559);
						((ExpressionContext)_localctx).StatusWord = match(StatusWord);

						          			//ExprAddStatusVariable(",\"<>\","+status.getMask((((ExpressionContext)_localctx).StatusWord!=null?((ExpressionContext)_localctx).StatusWord.getText():null))+","+status.getPattern((((ExpressionContext)_localctx).StatusWord!=null?((ExpressionContext)_localctx).StatusWord.getText():null))+")");
						          			ExprAddStatusVariable(",\"<>\",\""+(((ExpressionContext)_localctx).StatusWord!=null?((ExpressionContext)_localctx).StatusWord.getText():null)+"\")");
						          		
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(561);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(562);
						match(EQUALS);
						setState(563);
						((ExpressionContext)_localctx).StatusVariable = match(StatusVariable);

						          			ExprAddStatusVariable(",\"=\","+(((ExpressionContext)_localctx).StatusVariable!=null?((ExpressionContext)_localctx).StatusVariable.getText():null)+")");
						          		
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(565);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(566);
						match(NOTEQUALS);
						setState(567);
						((ExpressionContext)_localctx).StatusVariable = match(StatusVariable);

						          			ExprAddStatusVariable(",\"<>\","+(((ExpressionContext)_localctx).StatusVariable!=null?((ExpressionContext)_localctx).StatusVariable.getText():null)+")");
						          		
						}
						break;
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			 ((ExpressionContext)_localctx).str =  ExprToStr(); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Primary_exprContext extends ParserRuleContext {
		public Literal_numbersContext literal_numbers;
		public Pt_name_patContext pt_name_pat;
		public Rec_fld_patContext rec_fld_pat;
		public Pointer_patContext pointer_pat;
		public Offset_patContext offset_pat;
		public Token SetVariable;
		public Token ConstVariable;
		public Token ColorVariable;
		public TerminalNode LPAREN() { return getToken(glParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(glParser.RPAREN, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public Pt_name_patContext pt_name_pat() {
			return getRuleContext(Pt_name_patContext.class,0);
		}
		public Rec_fld_patContext rec_fld_pat() {
			return getRuleContext(Rec_fld_patContext.class,0);
		}
		public Pointer_patContext pointer_pat() {
			return getRuleContext(Pointer_patContext.class,0);
		}
		public Offset_patContext offset_pat() {
			return getRuleContext(Offset_patContext.class,0);
		}
		public TerminalNode SetVariable() { return getToken(glParser.SetVariable, 0); }
		public TerminalNode ConstVariable() { return getToken(glParser.ConstVariable, 0); }
		public TerminalNode ColorVariable() { return getToken(glParser.ColorVariable, 0); }
		public Primary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterPrimary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitPrimary_expr(this);
		}
	}

	public final Primary_exprContext primary_expr() throws RecognitionException {
		Primary_exprContext _localctx = new Primary_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary_expr);
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(LPAREN);
				 ExprAdd("("); 
				setState(576);
				expression(0);
				setState(577);
				match(RPAREN);
				 ExprAdd(")"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				((Primary_exprContext)_localctx).literal_numbers = literal_numbers();
				 ExprAdd((((Primary_exprContext)_localctx).literal_numbers!=null?_input.getText(((Primary_exprContext)_localctx).literal_numbers.start,((Primary_exprContext)_localctx).literal_numbers.stop):null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				((Primary_exprContext)_localctx).pt_name_pat = pt_name_pat();
				setState(585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(584);
					((Primary_exprContext)_localctx).rec_fld_pat = rec_fld_pat();
					}
					break;
				}

						if ((((Primary_exprContext)_localctx).rec_fld_pat!=null?_input.getText(((Primary_exprContext)_localctx).rec_fld_pat.start,((Primary_exprContext)_localctx).rec_fld_pat.stop):null)!=null) {
							ExprAdd("get"+(((Primary_exprContext)_localctx).rec_fld_pat!=null?_input.getText(((Primary_exprContext)_localctx).rec_fld_pat.start,((Primary_exprContext)_localctx).rec_fld_pat.stop):null).replace("\"", " ").trim()+"("+(((Primary_exprContext)_localctx).pt_name_pat!=null?_input.getText(((Primary_exprContext)_localctx).pt_name_pat.start,((Primary_exprContext)_localctx).pt_name_pat.stop):null)+")");
						} else {
							ExprAdd("getAV("+(((Primary_exprContext)_localctx).pt_name_pat!=null?_input.getText(((Primary_exprContext)_localctx).pt_name_pat.start,((Primary_exprContext)_localctx).pt_name_pat.stop):null)+")");
						}
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(589);
				((Primary_exprContext)_localctx).pointer_pat = pointer_pat();
				setState(591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(590);
					((Primary_exprContext)_localctx).offset_pat = offset_pat();
					}
					break;
				}

						if ((((Primary_exprContext)_localctx).offset_pat!=null?_input.getText(((Primary_exprContext)_localctx).offset_pat.start,((Primary_exprContext)_localctx).offset_pat.stop):null)!=null) {
							String pointer_name = (((Primary_exprContext)_localctx).pointer_pat!=null?_input.getText(((Primary_exprContext)_localctx).pointer_pat.start,((Primary_exprContext)_localctx).pointer_pat.stop):null).substring(0, 2);
							String pointer_index = (((Primary_exprContext)_localctx).pointer_pat!=null?_input.getText(((Primary_exprContext)_localctx).pointer_pat.start,((Primary_exprContext)_localctx).pointer_pat.stop):null).substring(3).replace("]", "");
							String offset_name = (((Primary_exprContext)_localctx).offset_pat!=null?_input.getText(((Primary_exprContext)_localctx).offset_pat.start,((Primary_exprContext)_localctx).offset_pat.stop):null).substring(0, 2);
							String offset_index = (((Primary_exprContext)_localctx).offset_pat!=null?_input.getText(((Primary_exprContext)_localctx).offset_pat.start,((Primary_exprContext)_localctx).offset_pat.stop):null).substring(3).replace("]", "");
							ExprAdd("get"+pointer_name+offset_name+"("+pointer_index+","+offset_index+")");
						} else {
							ExprAdd((((Primary_exprContext)_localctx).pointer_pat!=null?_input.getText(((Primary_exprContext)_localctx).pointer_pat.start,((Primary_exprContext)_localctx).pointer_pat.stop):null));
						}
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(595);
				((Primary_exprContext)_localctx).SetVariable = match(SetVariable);
				 ExprAdd((((Primary_exprContext)_localctx).SetVariable!=null?((Primary_exprContext)_localctx).SetVariable.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(597);
				((Primary_exprContext)_localctx).ConstVariable = match(ConstVariable);
				 ExprAdd((((Primary_exprContext)_localctx).ConstVariable!=null?((Primary_exprContext)_localctx).ConstVariable.getText():null)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(599);
				((Primary_exprContext)_localctx).ColorVariable = match(ColorVariable);
				 ExprAdd((((Primary_exprContext)_localctx).ColorVariable!=null?((Primary_exprContext)_localctx).ColorVariable.getText():null)); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_valueContext extends ParserRuleContext {
		public TerminalNode LineFillPattern() { return getToken(glParser.LineFillPattern, 0); }
		public TerminalNode BlinkPattern() { return getToken(glParser.BlinkPattern, 0); }
		public TerminalNode Color() { return getToken(glParser.Color, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(glParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(glParser.StringLiteral, 0); }
		public TerminalNode RecordField() { return getToken(glParser.RecordField, 0); }
		public TerminalNode Ioffset() { return getToken(glParser.Ioffset, 0); }
		public TerminalNode Roffset() { return getToken(glParser.Roffset, 0); }
		public TerminalNode Boffset() { return getToken(glParser.Boffset, 0); }
		public TerminalNode Soffset() { return getToken(glParser.Soffset, 0); }
		public TerminalNode Aoffset() { return getToken(glParser.Aoffset, 0); }
		public Conditional_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterConditional_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitConditional_value(this);
		}
	}

	public final Conditional_valueContext conditional_value() throws RecognitionException {
		Conditional_valueContext _localctx = new Conditional_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditional_value);
		try {
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LineFillPattern:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(LineFillPattern);
				}
				break;
			case BlinkPattern:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(BlinkPattern);
				}
				break;
			case Color:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				match(Color);
				}
				break;
			case ConstVariable:
			case ColorVariable:
			case PLUS:
			case MINUS:
			case IntegerLiteral:
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				literal_numbers();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(607);
				match(Identifier);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(608);
				match(StringLiteral);
				}
				break;
			case RecordField:
				enterOuterAlt(_localctx, 7);
				{
				setState(609);
				match(RecordField);
				}
				break;
			case Ioffset:
				enterOuterAlt(_localctx, 8);
				{
				setState(610);
				match(Ioffset);
				}
				break;
			case Roffset:
				enterOuterAlt(_localctx, 9);
				{
				setState(611);
				match(Roffset);
				}
				break;
			case Boffset:
				enterOuterAlt(_localctx, 10);
				{
				setState(612);
				match(Boffset);
				}
				break;
			case Soffset:
				enterOuterAlt(_localctx, 11);
				{
				setState(613);
				match(Soffset);
				}
				break;
			case Aoffset:
				enterOuterAlt(_localctx, 12);
				{
				setState(614);
				match(Aoffset);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pt_name_patContext extends ParserRuleContext {
		public Token PointName;
		public TerminalNode PointName() { return getToken(glParser.PointName, 0); }
		public TerminalNode Dpointer() { return getToken(glParser.Dpointer, 0); }
		public TerminalNode Hpointer() { return getToken(glParser.Hpointer, 0); }
		public TerminalNode Gpointer() { return getToken(glParser.Gpointer, 0); }
		public TerminalNode Wpointer() { return getToken(glParser.Wpointer, 0); }
		public TerminalNode Ppointer() { return getToken(glParser.Ppointer, 0); }
		public Pt_name_patContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pt_name_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterPt_name_pat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitPt_name_pat(this);
		}
	}

	public final Pt_name_patContext pt_name_pat() throws RecognitionException {
		Pt_name_patContext _localctx = new Pt_name_patContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pt_name_pat);
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PointName:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				((Pt_name_patContext)_localctx).PointName = match(PointName);

						// Добавим имя точки в глобальный список
						if(!PointNameList.contains((((Pt_name_patContext)_localctx).PointName!=null?((Pt_name_patContext)_localctx).PointName.getText():null).substring(1,(((Pt_name_patContext)_localctx).PointName!=null?((Pt_name_patContext)_localctx).PointName.getText():null).length()-1)))
							PointNameList.add((((Pt_name_patContext)_localctx).PointName!=null?((Pt_name_patContext)_localctx).PointName.getText():null).substring(1,(((Pt_name_patContext)_localctx).PointName!=null?((Pt_name_patContext)_localctx).PointName.getText():null).length()-1));
					
				}
				break;
			case Dpointer:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(Dpointer);
				}
				break;
			case Hpointer:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				match(Hpointer);
				}
				break;
			case Gpointer:
				enterOuterAlt(_localctx, 4);
				{
				setState(621);
				match(Gpointer);
				}
				break;
			case Wpointer:
				enterOuterAlt(_localctx, 5);
				{
				setState(622);
				match(Wpointer);
				}
				break;
			case Ppointer:
				enterOuterAlt(_localctx, 6);
				{
				setState(623);
				match(Ppointer);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pointer_patContext extends ParserRuleContext {
		public TerminalNode Ppointer() { return getToken(glParser.Ppointer, 0); }
		public TerminalNode Spointer() { return getToken(glParser.Spointer, 0); }
		public TerminalNode Opointer() { return getToken(glParser.Opointer, 0); }
		public Pointer_patContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterPointer_pat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitPointer_pat(this);
		}
	}

	public final Pointer_patContext pointer_pat() throws RecognitionException {
		Pointer_patContext _localctx = new Pointer_patContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pointer_pat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (Ppointer - 171)) | (1L << (Spointer - 171)) | (1L << (Opointer - 171)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rec_fld_patContext extends ParserRuleContext {
		public TerminalNode RecordField() { return getToken(glParser.RecordField, 0); }
		public Rec_fld_patContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rec_fld_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterRec_fld_pat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitRec_fld_pat(this);
		}
	}

	public final Rec_fld_patContext rec_fld_pat() throws RecognitionException {
		Rec_fld_patContext _localctx = new Rec_fld_patContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rec_fld_pat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(RecordField);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Offset_patContext extends ParserRuleContext {
		public TerminalNode Ioffset() { return getToken(glParser.Ioffset, 0); }
		public TerminalNode Roffset() { return getToken(glParser.Roffset, 0); }
		public TerminalNode Boffset() { return getToken(glParser.Boffset, 0); }
		public TerminalNode Spointer() { return getToken(glParser.Spointer, 0); }
		public TerminalNode Soffset() { return getToken(glParser.Soffset, 0); }
		public TerminalNode Aoffset() { return getToken(glParser.Aoffset, 0); }
		public Offset_patContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterOffset_pat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitOffset_pat(this);
		}
	}

	public final Offset_patContext offset_pat() throws RecognitionException {
		Offset_patContext _localctx = new Offset_patContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_offset_pat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !(((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (Spointer - 172)) | (1L << (Ioffset - 172)) | (1L << (Roffset - 172)) | (1L << (Boffset - 172)) | (1L << (Soffset - 172)) | (1L << (Aoffset - 172)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public String str;
		public Token IntegerLiteral;
		public Token FloatingPointLiteral;
		public Pt_name_patContext pt_name_pat;
		public Rec_fld_patContext rec_fld_pat;
		public Pointer_patContext pointer_pat;
		public Offset_patContext offset_pat;
		public Token StringLiteral;
		public TerminalNode IntegerLiteral() { return getToken(glParser.IntegerLiteral, 0); }
		public TerminalNode MINUS() { return getToken(glParser.MINUS, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(glParser.FloatingPointLiteral, 0); }
		public Pt_name_patContext pt_name_pat() {
			return getRuleContext(Pt_name_patContext.class,0);
		}
		public Rec_fld_patContext rec_fld_pat() {
			return getRuleContext(Rec_fld_patContext.class,0);
		}
		public Pointer_patContext pointer_pat() {
			return getRuleContext(Pointer_patContext.class,0);
		}
		public Offset_patContext offset_pat() {
			return getRuleContext(Offset_patContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(glParser.StringLiteral, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_value);
		 ((ValueContext)_localctx).str =  ""; 
		int _la;
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(632);
					match(MINUS);
					((ValueContext)_localctx).str = "-";
					}
				}

				setState(636);
				((ValueContext)_localctx).IntegerLiteral = match(IntegerLiteral);
				 ((ValueContext)_localctx).str = _localctx.str+(((ValueContext)_localctx).IntegerLiteral!=null?((ValueContext)_localctx).IntegerLiteral.getText():null); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(638);
					match(MINUS);
					((ValueContext)_localctx).str = "-";
					}
				}

				setState(642);
				((ValueContext)_localctx).FloatingPointLiteral = match(FloatingPointLiteral);
				 ((ValueContext)_localctx).str = _localctx.str+(((ValueContext)_localctx).FloatingPointLiteral!=null?((ValueContext)_localctx).FloatingPointLiteral.getText():null); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				((ValueContext)_localctx).pt_name_pat = pt_name_pat();
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RecordField) {
					{
					setState(645);
					((ValueContext)_localctx).rec_fld_pat = rec_fld_pat();
					}
				}


						if ((((ValueContext)_localctx).rec_fld_pat!=null?_input.getText(((ValueContext)_localctx).rec_fld_pat.start,((ValueContext)_localctx).rec_fld_pat.stop):null)!=null) {
							((ValueContext)_localctx).str = "get"+(((ValueContext)_localctx).rec_fld_pat!=null?_input.getText(((ValueContext)_localctx).rec_fld_pat.start,((ValueContext)_localctx).rec_fld_pat.stop):null).replace("\"", " ").trim()+"("+(((ValueContext)_localctx).pt_name_pat!=null?_input.getText(((ValueContext)_localctx).pt_name_pat.start,((ValueContext)_localctx).pt_name_pat.stop):null)+")";
						} else {
							((ValueContext)_localctx).str = "getAV("+(((ValueContext)_localctx).pt_name_pat!=null?_input.getText(((ValueContext)_localctx).pt_name_pat.start,((ValueContext)_localctx).pt_name_pat.stop):null)+")";
						}
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(650);
				((ValueContext)_localctx).pointer_pat = pointer_pat();
				setState(652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(651);
					((ValueContext)_localctx).offset_pat = offset_pat();
					}
					break;
				}

						if ((((ValueContext)_localctx).offset_pat!=null?_input.getText(((ValueContext)_localctx).offset_pat.start,((ValueContext)_localctx).offset_pat.stop):null)!=null) {
							String pointer_name = (((ValueContext)_localctx).pointer_pat!=null?_input.getText(((ValueContext)_localctx).pointer_pat.start,((ValueContext)_localctx).pointer_pat.stop):null).substring(0, 2);
							String pointer_index = (((ValueContext)_localctx).pointer_pat!=null?_input.getText(((ValueContext)_localctx).pointer_pat.start,((ValueContext)_localctx).pointer_pat.stop):null).substring(3).replace("]", "");
							String offset_name = (((ValueContext)_localctx).offset_pat!=null?_input.getText(((ValueContext)_localctx).offset_pat.start,((ValueContext)_localctx).offset_pat.stop):null).substring(0, 2);
							String offset_index = (((ValueContext)_localctx).offset_pat!=null?_input.getText(((ValueContext)_localctx).offset_pat.start,((ValueContext)_localctx).offset_pat.stop):null).substring(3).replace("]", "");
							((ValueContext)_localctx).str = "get"+pointer_name+offset_name+"("+pointer_index+","+offset_index+")";
						} else {
							((ValueContext)_localctx).str = (((ValueContext)_localctx).pointer_pat!=null?_input.getText(((ValueContext)_localctx).pointer_pat.start,((ValueContext)_localctx).pointer_pat.stop):null);
						}
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(656);
				((ValueContext)_localctx).StringLiteral = match(StringLiteral);
				 ((ValueContext)_localctx).str = _localctx.str+(((ValueContext)_localctx).StringLiteral!=null?((ValueContext)_localctx).StringLiteral.getText():null); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prog_args_patContext extends ParserRuleContext {
		public String str;
		public Token IntegerLiteral;
		public Token FloatingPointLiteral;
		public Token StringLiteral;
		public Token StatusWord;
		public Token Identifier;
		public Pt_name_patContext pt_name_pat;
		public Rec_fld_patContext rec_fld_pat;
		public Pointer_patContext pointer_pat;
		public Offset_patContext offset_pat;
		public Token SetVariable;
		public Token ConstVariable;
		public Token ColorVariable;
		public Token StatusVariable;
		public TerminalNode IntegerLiteral() { return getToken(glParser.IntegerLiteral, 0); }
		public TerminalNode MINUS() { return getToken(glParser.MINUS, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(glParser.FloatingPointLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(glParser.StringLiteral, 0); }
		public TerminalNode StatusWord() { return getToken(glParser.StatusWord, 0); }
		public TerminalNode Identifier() { return getToken(glParser.Identifier, 0); }
		public Pt_name_patContext pt_name_pat() {
			return getRuleContext(Pt_name_patContext.class,0);
		}
		public Rec_fld_patContext rec_fld_pat() {
			return getRuleContext(Rec_fld_patContext.class,0);
		}
		public Pointer_patContext pointer_pat() {
			return getRuleContext(Pointer_patContext.class,0);
		}
		public Offset_patContext offset_pat() {
			return getRuleContext(Offset_patContext.class,0);
		}
		public TerminalNode SetVariable() { return getToken(glParser.SetVariable, 0); }
		public TerminalNode ConstVariable() { return getToken(glParser.ConstVariable, 0); }
		public TerminalNode ColorVariable() { return getToken(glParser.ColorVariable, 0); }
		public TerminalNode StatusVariable() { return getToken(glParser.StatusVariable, 0); }
		public Prog_args_patContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_args_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterProg_args_pat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitProg_args_pat(this);
		}
	}

	public final Prog_args_patContext prog_args_pat() throws RecognitionException {
		Prog_args_patContext _localctx = new Prog_args_patContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_prog_args_pat);
		 ((Prog_args_patContext)_localctx).str =  ""; 
		int _la;
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(660);
					match(MINUS);
					((Prog_args_patContext)_localctx).str = "-";
					}
				}

				setState(664);
				((Prog_args_patContext)_localctx).IntegerLiteral = match(IntegerLiteral);
				 ((Prog_args_patContext)_localctx).str = _localctx.str+(((Prog_args_patContext)_localctx).IntegerLiteral!=null?((Prog_args_patContext)_localctx).IntegerLiteral.getText():null);       
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(666);
					match(MINUS);
					((Prog_args_patContext)_localctx).str = "-";
					}
				}

				setState(670);
				((Prog_args_patContext)_localctx).FloatingPointLiteral = match(FloatingPointLiteral);
				 ((Prog_args_patContext)_localctx).str = _localctx.str+(((Prog_args_patContext)_localctx).FloatingPointLiteral!=null?((Prog_args_patContext)_localctx).FloatingPointLiteral.getText():null); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				((Prog_args_patContext)_localctx).StringLiteral = match(StringLiteral);
				 ((Prog_args_patContext)_localctx).str = (((Prog_args_patContext)_localctx).StringLiteral!=null?((Prog_args_patContext)_localctx).StringLiteral.getText():null);        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(674);
				((Prog_args_patContext)_localctx).StatusWord = match(StatusWord);
				 ((Prog_args_patContext)_localctx).str = "\""+(((Prog_args_patContext)_localctx).StatusWord!=null?((Prog_args_patContext)_localctx).StatusWord.getText():null)+"\""; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(676);
				((Prog_args_patContext)_localctx).Identifier = match(Identifier);
				 ((Prog_args_patContext)_localctx).str = (((Prog_args_patContext)_localctx).Identifier!=null?((Prog_args_patContext)_localctx).Identifier.getText():null);           
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(678);
				((Prog_args_patContext)_localctx).pt_name_pat = pt_name_pat();
				 ((Prog_args_patContext)_localctx).str = (((Prog_args_patContext)_localctx).pt_name_pat!=null?_input.getText(((Prog_args_patContext)_localctx).pt_name_pat.start,((Prog_args_patContext)_localctx).pt_name_pat.stop):null);          
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(681);
				((Prog_args_patContext)_localctx).rec_fld_pat = rec_fld_pat();
				 ((Prog_args_patContext)_localctx).str = (((Prog_args_patContext)_localctx).rec_fld_pat!=null?_input.getText(((Prog_args_patContext)_localctx).rec_fld_pat.start,((Prog_args_patContext)_localctx).rec_fld_pat.stop):null);          
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(684);
				((Prog_args_patContext)_localctx).pointer_pat = pointer_pat();
				 ((Prog_args_patContext)_localctx).str = (((Prog_args_patContext)_localctx).pointer_pat!=null?_input.getText(((Prog_args_patContext)_localctx).pointer_pat.start,((Prog_args_patContext)_localctx).pointer_pat.stop):null);          
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(687);
				((Prog_args_patContext)_localctx).offset_pat = offset_pat();
				 ((Prog_args_patContext)_localctx).str = (((Prog_args_patContext)_localctx).offset_pat!=null?_input.getText(((Prog_args_patContext)_localctx).offset_pat.start,((Prog_args_patContext)_localctx).offset_pat.stop):null);           
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(690);
				((Prog_args_patContext)_localctx).SetVariable = match(SetVariable);
				 ((Prog_args_patContext)_localctx).str = (((Prog_args_patContext)_localctx).SetVariable!=null?((Prog_args_patContext)_localctx).SetVariable.getText():null);          
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(692);
				((Prog_args_patContext)_localctx).ConstVariable = match(ConstVariable);
				 ((Prog_args_patContext)_localctx).str = (((Prog_args_patContext)_localctx).ConstVariable!=null?((Prog_args_patContext)_localctx).ConstVariable.getText():null);        
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(694);
				((Prog_args_patContext)_localctx).ColorVariable = match(ColorVariable);
				 ((Prog_args_patContext)_localctx).str = (((Prog_args_patContext)_localctx).ColorVariable!=null?((Prog_args_patContext)_localctx).ColorVariable.getText():null);        
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(696);
				((Prog_args_patContext)_localctx).StatusVariable = match(StatusVariable);
				 ((Prog_args_patContext)_localctx).str = (((Prog_args_patContext)_localctx).StatusVariable!=null?((Prog_args_patContext)_localctx).StatusVariable.getText():null);       
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Coordinate_pairsContext extends ParserRuleContext {
		public int n;
		public int i = 0;
		public StringBuilder px = new StringBuilder();
		public StringBuilder py = new StringBuilder();
		public String prefix = "";
		public ValueContext x;
		public ValueContext y;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Coordinate_pairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinate_pairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCoordinate_pairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCoordinate_pairs(this);
		}
	}

	public final Coordinate_pairsContext coordinate_pairs() throws RecognitionException {
		Coordinate_pairsContext _localctx = new Coordinate_pairsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_coordinate_pairs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(700);
					((Coordinate_pairsContext)_localctx).x = value();
					setState(701);
					((Coordinate_pairsContext)_localctx).y = value();

								macroBBox.addPoint(((Coordinate_pairsContext)_localctx).x.str, ((Coordinate_pairsContext)_localctx).y.str);
								_localctx.px.append(_localctx.prefix); _localctx.px.append(macroPort.calcX(((Coordinate_pairsContext)_localctx).x.str));
								_localctx.py.append(_localctx.prefix); _localctx.py.append(macroPort.calcY(((Coordinate_pairsContext)_localctx).y.str));
								_localctx.i++;
								((Coordinate_pairsContext)_localctx).n = _localctx.i;
								((Coordinate_pairsContext)_localctx).prefix = ",";
							
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(706); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			_ctx.stop = _input.LT(-1);

				coordinate_pairs_X = "["+_localctx.px.toString()+"]";
				coordinate_pairs_Y = "["+_localctx.py.toString()+"]";

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_numbersContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(glParser.IntegerLiteral, 0); }
		public TerminalNode MINUS() { return getToken(glParser.MINUS, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(glParser.FloatingPointLiteral, 0); }
		public TerminalNode PLUS() { return getToken(glParser.PLUS, 0); }
		public TerminalNode ConstVariable() { return getToken(glParser.ConstVariable, 0); }
		public TerminalNode ColorVariable() { return getToken(glParser.ColorVariable, 0); }
		public Literal_numbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_numbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterLiteral_numbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitLiteral_numbers(this);
		}
	}

	public final Literal_numbersContext literal_numbers() throws RecognitionException {
		Literal_numbersContext _localctx = new Literal_numbersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal_numbers);
		int _la;
		try {
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(708);
					match(MINUS);
					}
				}

				setState(711);
				match(IntegerLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(712);
					match(MINUS);
					}
				}

				setState(715);
				match(FloatingPointLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(716);
					match(PLUS);
					}
				}

				setState(719);
				match(IntegerLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(720);
					match(PLUS);
					}
				}

				setState(723);
				match(FloatingPointLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(724);
				match(ConstVariable);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(725);
				match(ColorVariable);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdARCContext extends ParserRuleContext {
		public String _line_pat;
		public String _fill_pat;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public Literal_numbersContext angle1;
		public Literal_numbersContext angle2;
		public Literal_numbersContext line_width;
		public Def_conditional_valueContext line_pat;
		public Def_conditional_valueContext fill_pat;
		public TerminalNode CC_ARC() { return getToken(glParser.CC_ARC, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<Def_conditional_valueContext> def_conditional_value() {
			return getRuleContexts(Def_conditional_valueContext.class);
		}
		public Def_conditional_valueContext def_conditional_value(int i) {
			return getRuleContext(Def_conditional_valueContext.class,i);
		}
		public CmdARCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdARC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdARC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdARC(this);
		}
	}

	public final CmdARCContext cmdARC() throws RecognitionException {
		CmdARCContext _localctx = new CmdARCContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cmdARC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(CC_ARC);
			setState(729);
			((CmdARCContext)_localctx).x = literal_numbers();
			setState(730);
			((CmdARCContext)_localctx).y = literal_numbers();
			setState(731);
			((CmdARCContext)_localctx).w = literal_numbers();
			setState(732);
			((CmdARCContext)_localctx).h = literal_numbers();
			setState(733);
			((CmdARCContext)_localctx).angle1 = literal_numbers();
			setState(734);
			((CmdARCContext)_localctx).angle2 = literal_numbers();
			 macroBBox.addArc((((CmdARCContext)_localctx).x!=null?_input.getText(((CmdARCContext)_localctx).x.start,((CmdARCContext)_localctx).x.stop):null), (((CmdARCContext)_localctx).y!=null?_input.getText(((CmdARCContext)_localctx).y.start,((CmdARCContext)_localctx).y.stop):null), (((CmdARCContext)_localctx).w!=null?_input.getText(((CmdARCContext)_localctx).w.start,((CmdARCContext)_localctx).w.stop):null), (((CmdARCContext)_localctx).h!=null?_input.getText(((CmdARCContext)_localctx).h.start,((CmdARCContext)_localctx).h.stop):null), (((CmdARCContext)_localctx).angle1!=null?_input.getText(((CmdARCContext)_localctx).angle1.start,((CmdARCContext)_localctx).angle1.stop):null), (((CmdARCContext)_localctx).angle2!=null?_input.getText(((CmdARCContext)_localctx).angle2.start,((CmdARCContext)_localctx).angle2.stop):null)); 
			setState(736);
			((CmdARCContext)_localctx).line_width = literal_numbers();
			setState(737);
			((CmdARCContext)_localctx).line_pat = def_conditional_value("line_pat");
			setState(738);
			((CmdARCContext)_localctx).fill_pat = def_conditional_value("fill_pat");
			}
			_ctx.stop = _input.LT(-1);

				if (((CmdARCContext)_localctx).line_pat.arg_result != null && ((CmdARCContext)_localctx).line_pat.arg_result.size() == 3) {
					print(((CmdARCContext)_localctx).line_pat.arg_result.get(1));
					println(((CmdARCContext)_localctx).line_pat.arg_result.get(2));
					((CmdARCContext)_localctx)._line_pat =  "line_pat";
				}
				if (((CmdARCContext)_localctx).line_pat.arg_result != null && ((CmdARCContext)_localctx).line_pat.arg_result.size() == 2)
					((CmdARCContext)_localctx)._line_pat =  ((CmdARCContext)_localctx).line_pat.arg_result.get(0);

				if (((CmdARCContext)_localctx).fill_pat.arg_result != null && ((CmdARCContext)_localctx).fill_pat.arg_result.size() == 3) {
					print(((CmdARCContext)_localctx).fill_pat.arg_result.get(1));
					println(((CmdARCContext)_localctx).fill_pat.arg_result.get(2));
					((CmdARCContext)_localctx)._fill_pat =  "fill_pat";
				}
				if (((CmdARCContext)_localctx).fill_pat.arg_result != null && ((CmdARCContext)_localctx).fill_pat.arg_result.size() == 2)
					((CmdARCContext)_localctx)._fill_pat =  ((CmdARCContext)_localctx).fill_pat.arg_result.get(0);

				if (section == Section.I_SHAPELIB) {
					print("sARC(trgt,"+(((CmdARCContext)_localctx).x!=null?_input.getText(((CmdARCContext)_localctx).x.start,((CmdARCContext)_localctx).x.stop):null)+","+(((CmdARCContext)_localctx).y!=null?_input.getText(((CmdARCContext)_localctx).y.start,((CmdARCContext)_localctx).y.stop):null)+","+
						(((CmdARCContext)_localctx).w!=null?_input.getText(((CmdARCContext)_localctx).w.start,((CmdARCContext)_localctx).w.stop):null)+","+(((CmdARCContext)_localctx).h!=null?_input.getText(((CmdARCContext)_localctx).h.start,((CmdARCContext)_localctx).h.stop):null)+","+
						(((CmdARCContext)_localctx).angle1!=null?_input.getText(((CmdARCContext)_localctx).angle1.start,((CmdARCContext)_localctx).angle1.stop):null)+","+(((CmdARCContext)_localctx).angle2!=null?_input.getText(((CmdARCContext)_localctx).angle2.start,((CmdARCContext)_localctx).angle2.stop):null)+","+
						(((CmdARCContext)_localctx).line_width!=null?_input.getText(((CmdARCContext)_localctx).line_width.start,((CmdARCContext)_localctx).line_width.stop):null)+","+_localctx._line_pat.toUpperCase()+","+_localctx._fill_pat.toUpperCase()+");"
					);
				} else {
					println(UseCommands.get_use_cmds(section, "ARC") + "Garc("+
						macroPort.calcX((((CmdARCContext)_localctx).x!=null?_input.getText(((CmdARCContext)_localctx).x.start,((CmdARCContext)_localctx).x.stop):null))+","+
						macroPort.calcY((((CmdARCContext)_localctx).y!=null?_input.getText(((CmdARCContext)_localctx).y.start,((CmdARCContext)_localctx).y.stop):null))+","+
						macroPort.calcW((((CmdARCContext)_localctx).w!=null?_input.getText(((CmdARCContext)_localctx).w.start,((CmdARCContext)_localctx).w.stop):null))+","+
						macroPort.calcH((((CmdARCContext)_localctx).h!=null?_input.getText(((CmdARCContext)_localctx).h.start,((CmdARCContext)_localctx).h.stop):null))+","+
						(((CmdARCContext)_localctx).angle1!=null?_input.getText(((CmdARCContext)_localctx).angle1.start,((CmdARCContext)_localctx).angle1.stop):null)+","+
						(((CmdARCContext)_localctx).angle2!=null?_input.getText(((CmdARCContext)_localctx).angle2.start,((CmdARCContext)_localctx).angle2.stop):null)+","+
						(((CmdARCContext)_localctx).line_width!=null?_input.getText(((CmdARCContext)_localctx).line_width.start,((CmdARCContext)_localctx).line_width.stop):null)+","+
						_localctx._line_pat.toUpperCase()+","+
						_localctx._fill_pat.toUpperCase()+");"
					);
				}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCIRCLEContext extends ParserRuleContext {
		public String _line_pat;
		public String _fill_pat;
		public Literal_numbersContext cx;
		public Literal_numbersContext cy;
		public Literal_numbersContext r;
		public Literal_numbersContext line_width;
		public Def_conditional_valueContext line_pat;
		public Def_conditional_valueContext fill_pat;
		public TerminalNode CC_CIRCLE() { return getToken(glParser.CC_CIRCLE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<Def_conditional_valueContext> def_conditional_value() {
			return getRuleContexts(Def_conditional_valueContext.class);
		}
		public Def_conditional_valueContext def_conditional_value(int i) {
			return getRuleContext(Def_conditional_valueContext.class,i);
		}
		public CmdCIRCLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCIRCLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdCIRCLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdCIRCLE(this);
		}
	}

	public final CmdCIRCLEContext cmdCIRCLE() throws RecognitionException {
		CmdCIRCLEContext _localctx = new CmdCIRCLEContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cmdCIRCLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(CC_CIRCLE);
			setState(741);
			((CmdCIRCLEContext)_localctx).cx = literal_numbers();
			setState(742);
			((CmdCIRCLEContext)_localctx).cy = literal_numbers();
			 macroBBox.addPoint((((CmdCIRCLEContext)_localctx).cx!=null?_input.getText(((CmdCIRCLEContext)_localctx).cx.start,((CmdCIRCLEContext)_localctx).cx.stop):null), (((CmdCIRCLEContext)_localctx).cy!=null?_input.getText(((CmdCIRCLEContext)_localctx).cy.start,((CmdCIRCLEContext)_localctx).cy.stop):null)); 
			setState(744);
			((CmdCIRCLEContext)_localctx).r = literal_numbers();
			 macroBBox.addCircle((((CmdCIRCLEContext)_localctx).cx!=null?_input.getText(((CmdCIRCLEContext)_localctx).cx.start,((CmdCIRCLEContext)_localctx).cx.stop):null), (((CmdCIRCLEContext)_localctx).cy!=null?_input.getText(((CmdCIRCLEContext)_localctx).cy.start,((CmdCIRCLEContext)_localctx).cy.stop):null), (((CmdCIRCLEContext)_localctx).r!=null?_input.getText(((CmdCIRCLEContext)_localctx).r.start,((CmdCIRCLEContext)_localctx).r.stop):null)); 
			setState(746);
			((CmdCIRCLEContext)_localctx).line_width = literal_numbers();
			setState(747);
			((CmdCIRCLEContext)_localctx).line_pat = def_conditional_value("line_pat");
			setState(748);
			((CmdCIRCLEContext)_localctx).fill_pat = def_conditional_value("fill_pat");
			}
			_ctx.stop = _input.LT(-1);

				if (((CmdCIRCLEContext)_localctx).line_pat.arg_result != null && ((CmdCIRCLEContext)_localctx).line_pat.arg_result.size() == 3) {
					print(((CmdCIRCLEContext)_localctx).line_pat.arg_result.get(1));
					println(((CmdCIRCLEContext)_localctx).line_pat.arg_result.get(2));
					((CmdCIRCLEContext)_localctx)._line_pat =  "line_pat";
				}
				if (((CmdCIRCLEContext)_localctx).line_pat.arg_result != null && ((CmdCIRCLEContext)_localctx).line_pat.arg_result.size() == 2)
					((CmdCIRCLEContext)_localctx)._line_pat =  ((CmdCIRCLEContext)_localctx).line_pat.arg_result.get(0);

				if (((CmdCIRCLEContext)_localctx).fill_pat.arg_result != null && ((CmdCIRCLEContext)_localctx).fill_pat.arg_result.size() == 3) {
					print(((CmdCIRCLEContext)_localctx).fill_pat.arg_result.get(1));
					println(((CmdCIRCLEContext)_localctx).fill_pat.arg_result.get(2));
					((CmdCIRCLEContext)_localctx)._fill_pat =  "fill_pat";
				}
				if (((CmdCIRCLEContext)_localctx).fill_pat.arg_result != null && ((CmdCIRCLEContext)_localctx).fill_pat.arg_result.size() == 2)
					((CmdCIRCLEContext)_localctx)._fill_pat =  ((CmdCIRCLEContext)_localctx).fill_pat.arg_result.get(0);

			//
			// CIRCLE cx cy r line_width line_pat [conditional] fill_pat [conditional]
			//
				println(UseCommands.get_use_cmds(section, "CIRCLE") + "Gcircle("+
					macroPort.calcX((((CmdCIRCLEContext)_localctx).cx!=null?_input.getText(((CmdCIRCLEContext)_localctx).cx.start,((CmdCIRCLEContext)_localctx).cx.stop):null))+","+
					macroPort.calcY((((CmdCIRCLEContext)_localctx).cy!=null?_input.getText(((CmdCIRCLEContext)_localctx).cy.start,((CmdCIRCLEContext)_localctx).cy.stop):null))+","+
					macroPort.calcW((((CmdCIRCLEContext)_localctx).r!=null?_input.getText(((CmdCIRCLEContext)_localctx).r.start,((CmdCIRCLEContext)_localctx).r.stop):null))+","+
					(((CmdCIRCLEContext)_localctx).line_width!=null?_input.getText(((CmdCIRCLEContext)_localctx).line_width.start,((CmdCIRCLEContext)_localctx).line_width.stop):null)+","+
					_localctx._line_pat+","+
					_localctx._fill_pat+");"
				);

			//
			// ELLIPSE cx cy hr vr line_width line_pat [conditional] fill_pat [conditional]
			//
			//	println("Gellipse("+
			//		macroPort.calcX((((CmdCIRCLEContext)_localctx).cx!=null?_input.getText(((CmdCIRCLEContext)_localctx).cx.start,((CmdCIRCLEContext)_localctx).cx.stop):null))+","+
			//		macroPort.calcY((((CmdCIRCLEContext)_localctx).cy!=null?_input.getText(((CmdCIRCLEContext)_localctx).cy.start,((CmdCIRCLEContext)_localctx).cy.stop):null))+","+
			//		macroPort.calcW((((CmdCIRCLEContext)_localctx).r!=null?_input.getText(((CmdCIRCLEContext)_localctx).r.start,((CmdCIRCLEContext)_localctx).r.stop):null))+","+
			//		(macro_BBy*macro_h_scale/2)+","+
			//		(((CmdCIRCLEContext)_localctx).line_width!=null?_input.getText(((CmdCIRCLEContext)_localctx).line_width.start,((CmdCIRCLEContext)_localctx).line_width.stop):null)+","+
			//		_localctx._line_pat+","+
			//		_localctx._fill_pat+");"
			//	);


		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCOLORContext extends ParserRuleContext {
		public String _fg_color;
		public String _bg_color;
		public String _er_color;
		public String _ol_color;
		public Def_conditional_valueContext fg_color;
		public Def_conditional_valueContext bg_color;
		public Def_conditional_valueContext er_color;
		public Def_conditional_valueContext ol_color;
		public TerminalNode CC_COLOR() { return getToken(glParser.CC_COLOR, 0); }
		public TerminalNode FG() { return getToken(glParser.FG, 0); }
		public List<Def_conditional_valueContext> def_conditional_value() {
			return getRuleContexts(Def_conditional_valueContext.class);
		}
		public Def_conditional_valueContext def_conditional_value(int i) {
			return getRuleContext(Def_conditional_valueContext.class,i);
		}
		public TerminalNode BG() { return getToken(glParser.BG, 0); }
		public TerminalNode ER() { return getToken(glParser.ER, 0); }
		public TerminalNode OL() { return getToken(glParser.OL, 0); }
		public CmdCOLORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCOLOR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdCOLOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdCOLOR(this);
		}
	}

	public final CmdCOLORContext cmdCOLOR() throws RecognitionException {
		CmdCOLORContext _localctx = new CmdCOLORContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cmdCOLOR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(CC_COLOR);
			setState(751);
			match(FG);
			setState(752);
			((CmdCOLORContext)_localctx).fg_color = def_conditional_value("fg_color");
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BG) {
				{
				setState(753);
				match(BG);
				setState(754);
				((CmdCOLORContext)_localctx).bg_color = def_conditional_value("bg_color");
				}
			}

			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ER) {
				{
				setState(757);
				match(ER);
				setState(758);
				((CmdCOLORContext)_localctx).er_color = def_conditional_value("er_color");
				}
			}

			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OL) {
				{
				setState(761);
				match(OL);
				setState(762);
				((CmdCOLORContext)_localctx).ol_color = def_conditional_value("ol_color");
				}
			}

			}
			_ctx.stop = _input.LT(-1);


				try {
					if (((CmdCOLORContext)_localctx).fg_color.arg_result != null) {
						if (((CmdCOLORContext)_localctx).fg_color.arg_result.size() == 3) {
							print(((CmdCOLORContext)_localctx).fg_color.arg_result.get(1));		//color_expression_print(((CmdCOLORContext)_localctx).fg_color.arg_result.get(2));
							println(((CmdCOLORContext)_localctx).fg_color.arg_result.get(2));
							((CmdCOLORContext)_localctx)._fg_color =  "fg_color";
						}
						if (((CmdCOLORContext)_localctx).fg_color.arg_result.size() == 2)
							((CmdCOLORContext)_localctx)._fg_color =  ((CmdCOLORContext)_localctx).fg_color.arg_result.get(0);
					}
				}
				catch(Exception e) {
					//System.out.println("Null Pointer ");
					((CmdCOLORContext)_localctx)._fg_color =  "null";
				}

				try {
					if (((CmdCOLORContext)_localctx).bg_color.arg_result != null) {
						if (((CmdCOLORContext)_localctx).bg_color.arg_result.size() == 3) {
							print(((CmdCOLORContext)_localctx).bg_color.arg_result.get(1));		//color_expression_print(((CmdCOLORContext)_localctx).bg_color.arg_result.get(2));
							println(((CmdCOLORContext)_localctx).bg_color.arg_result.get(2));
							((CmdCOLORContext)_localctx)._bg_color =  "bg_color";
						}
						if (((CmdCOLORContext)_localctx).bg_color.arg_result.size() == 2)
							((CmdCOLORContext)_localctx)._bg_color =  ((CmdCOLORContext)_localctx).bg_color.arg_result.get(0);
					}
				}
				catch(Exception e) {
					//System.out.println("Null Pointer ");
					((CmdCOLORContext)_localctx)._bg_color =  "null";
				}

				try {
					if (((CmdCOLORContext)_localctx).er_color.arg_result != null) {
						if (((CmdCOLORContext)_localctx).er_color.arg_result.size() == 3) {
							print(((CmdCOLORContext)_localctx).er_color.arg_result.get(1));		//color_expression_print(((CmdCOLORContext)_localctx).er_color.arg_result.get(2));
							println(((CmdCOLORContext)_localctx).er_color.arg_result.get(2));
							((CmdCOLORContext)_localctx)._er_color =  "er_color";
						}
						if (((CmdCOLORContext)_localctx).er_color.arg_result.size() == 2)
							((CmdCOLORContext)_localctx)._er_color =  ((CmdCOLORContext)_localctx).er_color.arg_result.get(0);
					}
				}
				catch(Exception e) {
					//System.out.println("Null Pointer ");
					((CmdCOLORContext)_localctx)._er_color =  "null";
				}

				try {
					if (((CmdCOLORContext)_localctx).ol_color.arg_result != null) {
						if (((CmdCOLORContext)_localctx).ol_color.arg_result.size() == 3) {
							print(((CmdCOLORContext)_localctx).ol_color.arg_result.get(1));		//color_expression_print(((CmdCOLORContext)_localctx).ol_color.arg_result.get(2));
							println(((CmdCOLORContext)_localctx).ol_color.arg_result.get(2));
							((CmdCOLORContext)_localctx)._ol_color =  "ol_color";
						}
						if (((CmdCOLORContext)_localctx).ol_color.arg_result.size() == 2)
							((CmdCOLORContext)_localctx)._ol_color =  ((CmdCOLORContext)_localctx).ol_color.arg_result.get(0);
					}
				}
				catch(Exception e) {
					//System.out.println("Null Pointer ");
					((CmdCOLORContext)_localctx)._ol_color =  "null";
				}

				println(UseCommands.get_use_cmds(section, "COLOR") + "Gcolor("
					+_localctx._fg_color
					+","+_localctx._bg_color
					+","+_localctx._er_color
					+","+_localctx._ol_color
					+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdBLINKContext extends ParserRuleContext {
		public String _fg_blink;
		public String _bg_blink;
		public Def_conditional_valueContext fg_blink;
		public Def_conditional_valueContext bg_blink;
		public TerminalNode CC_BLINK() { return getToken(glParser.CC_BLINK, 0); }
		public TerminalNode FG() { return getToken(glParser.FG, 0); }
		public TerminalNode BG() { return getToken(glParser.BG, 0); }
		public List<Def_conditional_valueContext> def_conditional_value() {
			return getRuleContexts(Def_conditional_valueContext.class);
		}
		public Def_conditional_valueContext def_conditional_value(int i) {
			return getRuleContext(Def_conditional_valueContext.class,i);
		}
		public CmdBLINKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdBLINK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdBLINK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdBLINK(this);
		}
	}

	public final CmdBLINKContext cmdBLINK() throws RecognitionException {
		CmdBLINKContext _localctx = new CmdBLINKContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cmdBLINK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(CC_BLINK);
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FG:
				{
				{
				setState(766);
				match(FG);
				setState(767);
				((CmdBLINKContext)_localctx).fg_blink = def_conditional_value("fg_blink");
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BG) {
					{
					setState(768);
					match(BG);
					setState(769);
					((CmdBLINKContext)_localctx).bg_blink = def_conditional_value("bg_blink");
					}
				}

				}
				}
				break;
			case BG:
				{
				{
				setState(772);
				match(BG);
				setState(773);
				((CmdBLINKContext)_localctx).bg_blink = def_conditional_value("bg_blink");
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FG) {
					{
					setState(774);
					match(FG);
					setState(775);
					((CmdBLINKContext)_localctx).fg_blink = def_conditional_value("fg_blink");
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);


				try {
					if (((CmdBLINKContext)_localctx).fg_blink.arg_result != null) {
						if (((CmdBLINKContext)_localctx).fg_blink.arg_result.size() == 3) {
							print(((CmdBLINKContext)_localctx).fg_blink.arg_result.get(1));
							println(((CmdBLINKContext)_localctx).fg_blink.arg_result.get(2));
							((CmdBLINKContext)_localctx)._fg_blink =  "fg_blink";
						}
						if (((CmdBLINKContext)_localctx).fg_blink.arg_result.size() == 2)
							((CmdBLINKContext)_localctx)._fg_blink =  ((CmdBLINKContext)_localctx).fg_blink.arg_result.get(0);
					}
				}
				catch(Exception e) {
					//System.out.println("Null Pointer ");
					((CmdBLINKContext)_localctx)._fg_blink =  "null";
				}

				try {
					if (((CmdBLINKContext)_localctx).bg_blink.arg_result != null) {
						if (((CmdBLINKContext)_localctx).bg_blink.arg_result.size() == 3) {
							print(((CmdBLINKContext)_localctx).bg_blink.arg_result.get(1));
							println(((CmdBLINKContext)_localctx).bg_blink.arg_result.get(2));
							((CmdBLINKContext)_localctx)._bg_blink =  "bg_blink";
						}
						if (((CmdBLINKContext)_localctx).bg_blink.arg_result.size() == 2)
							((CmdBLINKContext)_localctx)._bg_blink =  ((CmdBLINKContext)_localctx).bg_blink.arg_result.get(0);
					}
				}
				catch(Exception e) {
					//System.out.println("Null Pointer ");
					((CmdBLINKContext)_localctx)._bg_blink =  "null";
				}

				println(UseCommands.get_use_cmds(section, "COLOR") + "Gblink("
					+_localctx._fg_blink
					+","+_localctx._bg_blink
					+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDYNAMIC_LINEContext extends ParserRuleContext {
		public String _line_pat;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public ValueContext x_low_limit;
		public ValueContext x_high_limit;
		public ValueContext y_low_limit;
		public ValueContext y_high_limit;
		public Token fitted;
		public Token scales;
		public Literal_numbersContext update_rate;
		public Literal_numbersContext nnn;
		public Coordinate_pairsContext pairs;
		public Literal_numbersContext line_width;
		public Def_conditional_valueContext line_pat;
		public TerminalNode CC_DYNAMIC_LINE() { return getToken(glParser.CC_DYNAMIC_LINE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Coordinate_pairsContext coordinate_pairs() {
			return getRuleContext(Coordinate_pairsContext.class,0);
		}
		public Def_conditional_valueContext def_conditional_value() {
			return getRuleContext(Def_conditional_valueContext.class,0);
		}
		public TerminalNode NOT_FITTED() { return getToken(glParser.NOT_FITTED, 0); }
		public TerminalNode FITTED() { return getToken(glParser.FITTED, 0); }
		public TerminalNode SCALE() { return getToken(glParser.SCALE, 0); }
		public TerminalNode NOSCALE() { return getToken(glParser.NOSCALE, 0); }
		public CmdDYNAMIC_LINEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDYNAMIC_LINE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDYNAMIC_LINE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDYNAMIC_LINE(this);
		}
	}

	public final CmdDYNAMIC_LINEContext cmdDYNAMIC_LINE() throws RecognitionException {
		CmdDYNAMIC_LINEContext _localctx = new CmdDYNAMIC_LINEContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cmdDYNAMIC_LINE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(CC_DYNAMIC_LINE);
			setState(781);
			((CmdDYNAMIC_LINEContext)_localctx).x = literal_numbers();
			setState(782);
			((CmdDYNAMIC_LINEContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdDYNAMIC_LINEContext)_localctx).x!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).x.start,((CmdDYNAMIC_LINEContext)_localctx).x.stop):null), (((CmdDYNAMIC_LINEContext)_localctx).y!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).y.start,((CmdDYNAMIC_LINEContext)_localctx).y.stop):null)); 
			setState(784);
			((CmdDYNAMIC_LINEContext)_localctx).w = literal_numbers();
			setState(785);
			((CmdDYNAMIC_LINEContext)_localctx).h = literal_numbers();
			 macroBBox.addRect((((CmdDYNAMIC_LINEContext)_localctx).x!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).x.start,((CmdDYNAMIC_LINEContext)_localctx).x.stop):null), (((CmdDYNAMIC_LINEContext)_localctx).y!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).y.start,((CmdDYNAMIC_LINEContext)_localctx).y.stop):null), (((CmdDYNAMIC_LINEContext)_localctx).w!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).w.start,((CmdDYNAMIC_LINEContext)_localctx).w.stop):null), (((CmdDYNAMIC_LINEContext)_localctx).h!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).h.start,((CmdDYNAMIC_LINEContext)_localctx).h.stop):null)); 
			setState(787);
			((CmdDYNAMIC_LINEContext)_localctx).x_low_limit = value();
			setState(788);
			((CmdDYNAMIC_LINEContext)_localctx).x_high_limit = value();
			setState(789);
			((CmdDYNAMIC_LINEContext)_localctx).y_low_limit = value();
			setState(790);
			((CmdDYNAMIC_LINEContext)_localctx).y_high_limit = value();
			setState(791);
			((CmdDYNAMIC_LINEContext)_localctx).fitted = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NOT_FITTED || _la==FITTED) ) {
				((CmdDYNAMIC_LINEContext)_localctx).fitted = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(792);
			((CmdDYNAMIC_LINEContext)_localctx).scales = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SCALE || _la==NOSCALE) ) {
				((CmdDYNAMIC_LINEContext)_localctx).scales = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(793);
			((CmdDYNAMIC_LINEContext)_localctx).update_rate = literal_numbers();
			setState(794);
			((CmdDYNAMIC_LINEContext)_localctx).nnn = literal_numbers();
			setState(795);
			((CmdDYNAMIC_LINEContext)_localctx).pairs = coordinate_pairs();
			setState(796);
			((CmdDYNAMIC_LINEContext)_localctx).line_width = literal_numbers();
			setState(797);
			((CmdDYNAMIC_LINEContext)_localctx).line_pat = def_conditional_value("line_pat");
			}
			_ctx.stop = _input.LT(-1);

				if (((CmdDYNAMIC_LINEContext)_localctx).line_pat.arg_result != null && ((CmdDYNAMIC_LINEContext)_localctx).line_pat.arg_result.size() == 3) {
					print(((CmdDYNAMIC_LINEContext)_localctx).line_pat.arg_result.get(1));
					println(((CmdDYNAMIC_LINEContext)_localctx).line_pat.arg_result.get(2));
					((CmdDYNAMIC_LINEContext)_localctx)._line_pat =  "line_pat";
				}
				if (((CmdDYNAMIC_LINEContext)_localctx).line_pat.arg_result != null && ((CmdDYNAMIC_LINEContext)_localctx).line_pat.arg_result.size() == 2)
					((CmdDYNAMIC_LINEContext)_localctx)._line_pat =  ((CmdDYNAMIC_LINEContext)_localctx).line_pat.arg_result.get(0);

				println(UseCommands.get_use_cmds(section, "DYNAMIC_LINE") + "Gdynamic_line("+
					macroPort.calcX((((CmdDYNAMIC_LINEContext)_localctx).x!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).x.start,((CmdDYNAMIC_LINEContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdDYNAMIC_LINEContext)_localctx).y!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).y.start,((CmdDYNAMIC_LINEContext)_localctx).y.stop):null))+","+
					macroPort.calcW((((CmdDYNAMIC_LINEContext)_localctx).w!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).w.start,((CmdDYNAMIC_LINEContext)_localctx).w.stop):null))+","+
					macroPort.calcH((((CmdDYNAMIC_LINEContext)_localctx).h!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).h.start,((CmdDYNAMIC_LINEContext)_localctx).h.stop):null))+","+
					((CmdDYNAMIC_LINEContext)_localctx).x_low_limit.str+","+
					((CmdDYNAMIC_LINEContext)_localctx).x_high_limit.str+","+
					((CmdDYNAMIC_LINEContext)_localctx).y_low_limit.str+","+
					((CmdDYNAMIC_LINEContext)_localctx).y_high_limit.str+","+
					(((CmdDYNAMIC_LINEContext)_localctx).fitted!=null?((CmdDYNAMIC_LINEContext)_localctx).fitted.getText():null)+","+
					(((CmdDYNAMIC_LINEContext)_localctx).scales!=null?((CmdDYNAMIC_LINEContext)_localctx).scales.getText():null)+","+
					(((CmdDYNAMIC_LINEContext)_localctx).update_rate!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).update_rate.start,((CmdDYNAMIC_LINEContext)_localctx).update_rate.stop):null)+","+
			//		((CmdDYNAMIC_LINEContext)_localctx).pairs.n+",px,py,"+
						((CmdDYNAMIC_LINEContext)_localctx).pairs.n+","+
						coordinate_pairs_X+","+
						coordinate_pairs_Y+","+
					(((CmdDYNAMIC_LINEContext)_localctx).line_width!=null?_input.getText(((CmdDYNAMIC_LINEContext)_localctx).line_width.start,((CmdDYNAMIC_LINEContext)_localctx).line_width.stop):null)+","+
					_localctx._line_pat+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDYNAMIC_POLYGONContext extends ParserRuleContext {
		public String _line_pat;
		public String _fill_pat;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public ValueContext x_low_limit;
		public ValueContext x_high_limit;
		public ValueContext y_low_limit;
		public ValueContext y_high_limit;
		public Literal_numbersContext update_rate;
		public Literal_numbersContext nnn;
		public Coordinate_pairsContext pairs;
		public Literal_numbersContext line_width;
		public Def_conditional_valueContext line_pat;
		public Def_conditional_valueContext fill_pat;
		public TerminalNode CC_DYNAMIC_POLYGON() { return getToken(glParser.CC_DYNAMIC_POLYGON, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Coordinate_pairsContext coordinate_pairs() {
			return getRuleContext(Coordinate_pairsContext.class,0);
		}
		public List<Def_conditional_valueContext> def_conditional_value() {
			return getRuleContexts(Def_conditional_valueContext.class);
		}
		public Def_conditional_valueContext def_conditional_value(int i) {
			return getRuleContext(Def_conditional_valueContext.class,i);
		}
		public CmdDYNAMIC_POLYGONContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDYNAMIC_POLYGON; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDYNAMIC_POLYGON(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDYNAMIC_POLYGON(this);
		}
	}

	public final CmdDYNAMIC_POLYGONContext cmdDYNAMIC_POLYGON() throws RecognitionException {
		CmdDYNAMIC_POLYGONContext _localctx = new CmdDYNAMIC_POLYGONContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cmdDYNAMIC_POLYGON);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(CC_DYNAMIC_POLYGON);
			setState(800);
			((CmdDYNAMIC_POLYGONContext)_localctx).x = literal_numbers();
			setState(801);
			((CmdDYNAMIC_POLYGONContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdDYNAMIC_POLYGONContext)_localctx).x!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).x.start,((CmdDYNAMIC_POLYGONContext)_localctx).x.stop):null), (((CmdDYNAMIC_POLYGONContext)_localctx).y!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).y.start,((CmdDYNAMIC_POLYGONContext)_localctx).y.stop):null)); 
			setState(803);
			((CmdDYNAMIC_POLYGONContext)_localctx).w = literal_numbers();
			setState(804);
			((CmdDYNAMIC_POLYGONContext)_localctx).h = literal_numbers();
			 macroBBox.addRect((((CmdDYNAMIC_POLYGONContext)_localctx).x!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).x.start,((CmdDYNAMIC_POLYGONContext)_localctx).x.stop):null), (((CmdDYNAMIC_POLYGONContext)_localctx).y!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).y.start,((CmdDYNAMIC_POLYGONContext)_localctx).y.stop):null), (((CmdDYNAMIC_POLYGONContext)_localctx).w!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).w.start,((CmdDYNAMIC_POLYGONContext)_localctx).w.stop):null), (((CmdDYNAMIC_POLYGONContext)_localctx).h!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).h.start,((CmdDYNAMIC_POLYGONContext)_localctx).h.stop):null)); 
			setState(806);
			((CmdDYNAMIC_POLYGONContext)_localctx).x_low_limit = value();
			setState(807);
			((CmdDYNAMIC_POLYGONContext)_localctx).x_high_limit = value();
			setState(808);
			((CmdDYNAMIC_POLYGONContext)_localctx).y_low_limit = value();
			setState(809);
			((CmdDYNAMIC_POLYGONContext)_localctx).y_high_limit = value();
			setState(810);
			((CmdDYNAMIC_POLYGONContext)_localctx).update_rate = literal_numbers();
			setState(811);
			((CmdDYNAMIC_POLYGONContext)_localctx).nnn = literal_numbers();
			setState(812);
			((CmdDYNAMIC_POLYGONContext)_localctx).pairs = coordinate_pairs();
			setState(813);
			((CmdDYNAMIC_POLYGONContext)_localctx).line_width = literal_numbers();
			setState(814);
			((CmdDYNAMIC_POLYGONContext)_localctx).line_pat = def_conditional_value("line_pat");
			setState(815);
			((CmdDYNAMIC_POLYGONContext)_localctx).fill_pat = def_conditional_value("fill_pat");
			}
			_ctx.stop = _input.LT(-1);

				if (((CmdDYNAMIC_POLYGONContext)_localctx).line_pat.arg_result != null && ((CmdDYNAMIC_POLYGONContext)_localctx).line_pat.arg_result.size() == 3) {
					print(((CmdDYNAMIC_POLYGONContext)_localctx).line_pat.arg_result.get(1));
					println(((CmdDYNAMIC_POLYGONContext)_localctx).line_pat.arg_result.get(2));
					((CmdDYNAMIC_POLYGONContext)_localctx)._line_pat =  "line_pat";
				}
				if (((CmdDYNAMIC_POLYGONContext)_localctx).line_pat.arg_result != null && ((CmdDYNAMIC_POLYGONContext)_localctx).line_pat.arg_result.size() == 2)
					((CmdDYNAMIC_POLYGONContext)_localctx)._line_pat =  ((CmdDYNAMIC_POLYGONContext)_localctx).line_pat.arg_result.get(0);

				if (((CmdDYNAMIC_POLYGONContext)_localctx).fill_pat.arg_result != null && ((CmdDYNAMIC_POLYGONContext)_localctx).fill_pat.arg_result.size() == 3) {
					print(((CmdDYNAMIC_POLYGONContext)_localctx).fill_pat.arg_result.get(1));
					println(((CmdDYNAMIC_POLYGONContext)_localctx).fill_pat.arg_result.get(2));
					((CmdDYNAMIC_POLYGONContext)_localctx)._fill_pat =  "fill_pat";
				}
				if (((CmdDYNAMIC_POLYGONContext)_localctx).fill_pat.arg_result != null && ((CmdDYNAMIC_POLYGONContext)_localctx).fill_pat.arg_result.size() == 2)
					((CmdDYNAMIC_POLYGONContext)_localctx)._fill_pat =  ((CmdDYNAMIC_POLYGONContext)_localctx).fill_pat.arg_result.get(0);

				println(UseCommands.get_use_cmds(section, "DYNAMIC_POLYGON") + "Gdynamic_polygon("+
					macroPort.calcX((((CmdDYNAMIC_POLYGONContext)_localctx).x!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).x.start,((CmdDYNAMIC_POLYGONContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdDYNAMIC_POLYGONContext)_localctx).y!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).y.start,((CmdDYNAMIC_POLYGONContext)_localctx).y.stop):null))+","+
					macroPort.calcW((((CmdDYNAMIC_POLYGONContext)_localctx).w!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).w.start,((CmdDYNAMIC_POLYGONContext)_localctx).w.stop):null))+","+
					macroPort.calcH((((CmdDYNAMIC_POLYGONContext)_localctx).h!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).h.start,((CmdDYNAMIC_POLYGONContext)_localctx).h.stop):null))+","+
					((CmdDYNAMIC_POLYGONContext)_localctx).x_low_limit.str+","+
					((CmdDYNAMIC_POLYGONContext)_localctx).x_high_limit.str+","+
					((CmdDYNAMIC_POLYGONContext)_localctx).y_low_limit.str+","+
					((CmdDYNAMIC_POLYGONContext)_localctx).y_high_limit.str+","+
					(((CmdDYNAMIC_POLYGONContext)_localctx).update_rate!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).update_rate.start,((CmdDYNAMIC_POLYGONContext)_localctx).update_rate.stop):null)+","+
			//		((CmdDYNAMIC_POLYGONContext)_localctx).pairs.n+",px,py,"+
						((CmdDYNAMIC_POLYGONContext)_localctx).pairs.n+","+
						coordinate_pairs_X+","+
						coordinate_pairs_Y+","+
					(((CmdDYNAMIC_POLYGONContext)_localctx).line_width!=null?_input.getText(((CmdDYNAMIC_POLYGONContext)_localctx).line_width.start,((CmdDYNAMIC_POLYGONContext)_localctx).line_width.stop):null)+","+
					_localctx._line_pat+","+
					_localctx._fill_pat+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdELLIPSEContext extends ParserRuleContext {
		public String _line_pat;
		public String _fill_pat;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext hr;
		public Literal_numbersContext vr;
		public Literal_numbersContext line_width;
		public Def_conditional_valueContext line_pat;
		public Def_conditional_valueContext fill_pat;
		public TerminalNode CC_ELLIPSE() { return getToken(glParser.CC_ELLIPSE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<Def_conditional_valueContext> def_conditional_value() {
			return getRuleContexts(Def_conditional_valueContext.class);
		}
		public Def_conditional_valueContext def_conditional_value(int i) {
			return getRuleContext(Def_conditional_valueContext.class,i);
		}
		public CmdELLIPSEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdELLIPSE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdELLIPSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdELLIPSE(this);
		}
	}

	public final CmdELLIPSEContext cmdELLIPSE() throws RecognitionException {
		CmdELLIPSEContext _localctx = new CmdELLIPSEContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cmdELLIPSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(CC_ELLIPSE);
			setState(818);
			((CmdELLIPSEContext)_localctx).x = literal_numbers();
			setState(819);
			((CmdELLIPSEContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdELLIPSEContext)_localctx).x!=null?_input.getText(((CmdELLIPSEContext)_localctx).x.start,((CmdELLIPSEContext)_localctx).x.stop):null), (((CmdELLIPSEContext)_localctx).y!=null?_input.getText(((CmdELLIPSEContext)_localctx).y.start,((CmdELLIPSEContext)_localctx).y.stop):null)); 
			setState(821);
			((CmdELLIPSEContext)_localctx).hr = literal_numbers();
			setState(822);
			((CmdELLIPSEContext)_localctx).vr = literal_numbers();
			 macroBBox.addEllipse((((CmdELLIPSEContext)_localctx).x!=null?_input.getText(((CmdELLIPSEContext)_localctx).x.start,((CmdELLIPSEContext)_localctx).x.stop):null), (((CmdELLIPSEContext)_localctx).y!=null?_input.getText(((CmdELLIPSEContext)_localctx).y.start,((CmdELLIPSEContext)_localctx).y.stop):null), (((CmdELLIPSEContext)_localctx).hr!=null?_input.getText(((CmdELLIPSEContext)_localctx).hr.start,((CmdELLIPSEContext)_localctx).hr.stop):null), (((CmdELLIPSEContext)_localctx).vr!=null?_input.getText(((CmdELLIPSEContext)_localctx).vr.start,((CmdELLIPSEContext)_localctx).vr.stop):null)); 
			setState(824);
			((CmdELLIPSEContext)_localctx).line_width = literal_numbers();
			setState(825);
			((CmdELLIPSEContext)_localctx).line_pat = def_conditional_value("line_pat");
			setState(826);
			((CmdELLIPSEContext)_localctx).fill_pat = def_conditional_value("fill_pat");
			}
			_ctx.stop = _input.LT(-1);

				if (((CmdELLIPSEContext)_localctx).line_pat.arg_result != null && ((CmdELLIPSEContext)_localctx).line_pat.arg_result.size() == 3) {
					print(((CmdELLIPSEContext)_localctx).line_pat.arg_result.get(1));
					println(((CmdELLIPSEContext)_localctx).line_pat.arg_result.get(2));
					((CmdELLIPSEContext)_localctx)._line_pat =  "line_pat";
				}
				if (((CmdELLIPSEContext)_localctx).line_pat.arg_result != null && ((CmdELLIPSEContext)_localctx).line_pat.arg_result.size() == 2)
					((CmdELLIPSEContext)_localctx)._line_pat =  ((CmdELLIPSEContext)_localctx).line_pat.arg_result.get(0);

				if (((CmdELLIPSEContext)_localctx).fill_pat.arg_result != null && ((CmdELLIPSEContext)_localctx).fill_pat.arg_result.size() == 3) {
					print(((CmdELLIPSEContext)_localctx).fill_pat.arg_result.get(1));
					println(((CmdELLIPSEContext)_localctx).fill_pat.arg_result.get(2));
					((CmdELLIPSEContext)_localctx)._fill_pat =  "fill_pat";
				}
				if (((CmdELLIPSEContext)_localctx).fill_pat.arg_result != null && ((CmdELLIPSEContext)_localctx).fill_pat.arg_result.size() == 2)
					((CmdELLIPSEContext)_localctx)._fill_pat =  ((CmdELLIPSEContext)_localctx).fill_pat.arg_result.get(0);

				if (section == Section.I_SHAPELIB) {
					print("sELLIPSE(trgt,"+(((CmdELLIPSEContext)_localctx).x!=null?_input.getText(((CmdELLIPSEContext)_localctx).x.start,((CmdELLIPSEContext)_localctx).x.stop):null)+","+(((CmdELLIPSEContext)_localctx).y!=null?_input.getText(((CmdELLIPSEContext)_localctx).y.start,((CmdELLIPSEContext)_localctx).y.stop):null)+","+
						(((CmdELLIPSEContext)_localctx).hr!=null?_input.getText(((CmdELLIPSEContext)_localctx).hr.start,((CmdELLIPSEContext)_localctx).hr.stop):null)+","+(((CmdELLIPSEContext)_localctx).vr!=null?_input.getText(((CmdELLIPSEContext)_localctx).vr.start,((CmdELLIPSEContext)_localctx).vr.stop):null)+","+
						(((CmdELLIPSEContext)_localctx).line_width!=null?_input.getText(((CmdELLIPSEContext)_localctx).line_width.start,((CmdELLIPSEContext)_localctx).line_width.stop):null)+","+_localctx._line_pat.toUpperCase()+","+_localctx._fill_pat.toUpperCase()+");"
					);
				} else {
					println(UseCommands.get_use_cmds(section, "ELLIPSE") + "Gellipse("+
						macroPort.calcX((((CmdELLIPSEContext)_localctx).x!=null?_input.getText(((CmdELLIPSEContext)_localctx).x.start,((CmdELLIPSEContext)_localctx).x.stop):null))+","+
						macroPort.calcY((((CmdELLIPSEContext)_localctx).y!=null?_input.getText(((CmdELLIPSEContext)_localctx).y.start,((CmdELLIPSEContext)_localctx).y.stop):null))+","+
						macroPort.calcW((((CmdELLIPSEContext)_localctx).hr!=null?_input.getText(((CmdELLIPSEContext)_localctx).hr.start,((CmdELLIPSEContext)_localctx).hr.stop):null))+","+
						macroPort.calcH((((CmdELLIPSEContext)_localctx).vr!=null?_input.getText(((CmdELLIPSEContext)_localctx).vr.start,((CmdELLIPSEContext)_localctx).vr.stop):null))+","+
						(((CmdELLIPSEContext)_localctx).line_width!=null?_input.getText(((CmdELLIPSEContext)_localctx).line_width.start,((CmdELLIPSEContext)_localctx).line_width.stop):null)+","+
						_localctx._line_pat.toUpperCase()+","+
						_localctx._fill_pat.toUpperCase()+");"
					);
				}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLINEContext extends ParserRuleContext {
		public String _line_pat;
		public Literal_numbersContext n;
		public Coordinate_pairsContext pairs;
		public Literal_numbersContext line_width;
		public Def_conditional_valueContext line_pat;
		public TerminalNode CC_LINE() { return getToken(glParser.CC_LINE, 0); }
		public Coordinate_pairsContext coordinate_pairs() {
			return getRuleContext(Coordinate_pairsContext.class,0);
		}
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public Def_conditional_valueContext def_conditional_value() {
			return getRuleContext(Def_conditional_valueContext.class,0);
		}
		public CmdLINEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLINE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdLINE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdLINE(this);
		}
	}

	public final CmdLINEContext cmdLINE() throws RecognitionException {
		CmdLINEContext _localctx = new CmdLINEContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cmdLINE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(CC_LINE);
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(829);
				if (!( section == Section.I_SHAPELIB )) throw new FailedPredicateException(this, " section == Section.I_SHAPELIB ");
				setState(830);
				((CmdLINEContext)_localctx).n = literal_numbers();
				}
				break;
			}
			setState(833);
			((CmdLINEContext)_localctx).pairs = coordinate_pairs();
			setState(834);
			((CmdLINEContext)_localctx).line_width = literal_numbers();
			setState(835);
			((CmdLINEContext)_localctx).line_pat = def_conditional_value("line_pat");
			}
			_ctx.stop = _input.LT(-1);

				if (((CmdLINEContext)_localctx).line_pat.arg_result != null && ((CmdLINEContext)_localctx).line_pat.arg_result.size() == 3) {
					print(((CmdLINEContext)_localctx).line_pat.arg_result.get(1));
					println(((CmdLINEContext)_localctx).line_pat.arg_result.get(2));
					((CmdLINEContext)_localctx)._line_pat =  "line_pat";
				}
				if (((CmdLINEContext)_localctx).line_pat.arg_result != null && ((CmdLINEContext)_localctx).line_pat.arg_result.size() == 2)
					((CmdLINEContext)_localctx)._line_pat =  ((CmdLINEContext)_localctx).line_pat.arg_result.get(0);

				if (section == Section.I_SHAPELIB) {
					print("sLINE(trgt,"+((CmdLINEContext)_localctx).pairs.n+","+coordinate_pairs_X+","+coordinate_pairs_Y+","+
						(((CmdLINEContext)_localctx).line_width!=null?_input.getText(((CmdLINEContext)_localctx).line_width.start,((CmdLINEContext)_localctx).line_width.stop):null)+","+_localctx._line_pat.toUpperCase()+");"
					);
				} else {
					println(UseCommands.get_use_cmds(section, "LINE") + "Gline("+
			//			((CmdLINEContext)_localctx).pairs.n+",px,py,"+
							((CmdLINEContext)_localctx).pairs.n+","+
							coordinate_pairs_X+","+
							coordinate_pairs_Y+","+
						(((CmdLINEContext)_localctx).line_width!=null?_input.getText(((CmdLINEContext)_localctx).line_width.start,((CmdLINEContext)_localctx).line_width.stop):null)+","+
						_localctx._line_pat.toUpperCase()+");"
					);
				}


		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdMULTI_TEXTContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext justify;
		public Literal_numbersContext spacing;
		public Literal_numbersContext nnn;
		public Multi_text_stringsContext sss;
		public Def_font_typeContext font_type;
		public TerminalNode CC_MULTI_TEXT() { return getToken(glParser.CC_MULTI_TEXT, 0); }
		public Multi_text_strings_condContext multi_text_strings_cond() {
			return getRuleContext(Multi_text_strings_condContext.class,0);
		}
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public Multi_text_stringsContext multi_text_strings() {
			return getRuleContext(Multi_text_stringsContext.class,0);
		}
		public Def_font_typeContext def_font_type() {
			return getRuleContext(Def_font_typeContext.class,0);
		}
		public CmdMULTI_TEXTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdMULTI_TEXT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdMULTI_TEXT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdMULTI_TEXT(this);
		}
	}

	public final CmdMULTI_TEXTContext cmdMULTI_TEXT() throws RecognitionException {
		CmdMULTI_TEXTContext _localctx = new CmdMULTI_TEXTContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cmdMULTI_TEXT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(CC_MULTI_TEXT);
			setState(838);
			((CmdMULTI_TEXTContext)_localctx).x = literal_numbers();
			setState(839);
			((CmdMULTI_TEXTContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdMULTI_TEXTContext)_localctx).x!=null?_input.getText(((CmdMULTI_TEXTContext)_localctx).x.start,((CmdMULTI_TEXTContext)_localctx).x.stop):null), (((CmdMULTI_TEXTContext)_localctx).y!=null?_input.getText(((CmdMULTI_TEXTContext)_localctx).y.start,((CmdMULTI_TEXTContext)_localctx).y.stop):null)); 
			setState(841);
			((CmdMULTI_TEXTContext)_localctx).justify = literal_numbers();
			setState(842);
			((CmdMULTI_TEXTContext)_localctx).spacing = literal_numbers();
			setState(843);
			((CmdMULTI_TEXTContext)_localctx).nnn = literal_numbers();
			setState(844);
			((CmdMULTI_TEXTContext)_localctx).sss = multi_text_strings();
			setState(845);
			multi_text_strings_cond();
			setState(846);
			((CmdMULTI_TEXTContext)_localctx).font_type = def_font_type();
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "MULTI_TEXT") + "Gmulti_text("+
					macroPort.calcX((((CmdMULTI_TEXTContext)_localctx).x!=null?_input.getText(((CmdMULTI_TEXTContext)_localctx).x.start,((CmdMULTI_TEXTContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdMULTI_TEXTContext)_localctx).y!=null?_input.getText(((CmdMULTI_TEXTContext)_localctx).y.start,((CmdMULTI_TEXTContext)_localctx).y.stop):null))+","+
					(((CmdMULTI_TEXTContext)_localctx).justify!=null?_input.getText(((CmdMULTI_TEXTContext)_localctx).justify.start,((CmdMULTI_TEXTContext)_localctx).justify.stop):null)+","+
					(((CmdMULTI_TEXTContext)_localctx).spacing!=null?_input.getText(((CmdMULTI_TEXTContext)_localctx).spacing.start,((CmdMULTI_TEXTContext)_localctx).spacing.stop):null)+","+
					((CmdMULTI_TEXTContext)_localctx).sss.n+",strings"+","+
					((CmdMULTI_TEXTContext)_localctx).font_type.str+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multi_text_stringsContext extends ParserRuleContext {
		public int n;
		public int i = 0;
		public Token StringLiteral;
		public List<TerminalNode> StringLiteral() { return getTokens(glParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(glParser.StringLiteral, i);
		}
		public Multi_text_stringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_text_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterMulti_text_strings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitMulti_text_strings(this);
		}
	}

	public final Multi_text_stringsContext multi_text_strings() throws RecognitionException {
		Multi_text_stringsContext _localctx = new Multi_text_stringsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_multi_text_strings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(848);
				((Multi_text_stringsContext)_localctx).StringLiteral = match(StringLiteral);

								println("strings["+_localctx.i+"]="+(((Multi_text_stringsContext)_localctx).StringLiteral!=null?((Multi_text_stringsContext)_localctx).StringLiteral.getText():null)+";");
								_localctx.i++; ((Multi_text_stringsContext)_localctx).n = _localctx.i;
							
				}
				}
				setState(852); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multi_text_strings_condContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Multi_text_stringsContext multi_text_strings() {
			return getRuleContext(Multi_text_stringsContext.class,0);
		}
		public Multi_text_strings_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_text_strings_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterMulti_text_strings_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitMulti_text_strings_cond(this);
		}
	}

	public final Multi_text_strings_condContext multi_text_strings_cond() throws RecognitionException {
		Multi_text_strings_condContext _localctx = new Multi_text_strings_condContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multi_text_strings_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (Gpointer - 167)) | (1L << (Hpointer - 167)) | (1L << (Wpointer - 167)) | (1L << (Dpointer - 167)) | (1L << (Ppointer - 167)) | (1L << (Spointer - 167)) | (1L << (Opointer - 167)) | (1L << (SetVariable - 167)) | (1L << (ConstVariable - 167)) | (1L << (ColorVariable - 167)) | (1L << (LPAREN - 167)) | (1L << (PLUS - 167)) | (1L << (MINUS - 167)) | (1L << (IntegerLiteral - 167)) | (1L << (FloatingPointLiteral - 167)) | (1L << (PointName - 167)))) != 0)) {
				{
				 ExprClear(); 
				setState(855);
				((Multi_text_strings_condContext)_localctx).expression = expression(0);
				 println("if "+((Multi_text_strings_condContext)_localctx).expression.str+" {"); 
				setState(857);
				multi_text_strings();
				 println("}"); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_font_typeContext extends ParserRuleContext {
		public String str;
		public Token font_type;
		public Literal_numbersContext bitmap_font_num;
		public Literal_numbersContext char_w;
		public Literal_numbersContext char_h;
		public Literal_numbersContext line_width;
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode BITMAP() { return getToken(glParser.BITMAP, 0); }
		public TerminalNode BITMAP_OVER() { return getToken(glParser.BITMAP_OVER, 0); }
		public TerminalNode VECTOR() { return getToken(glParser.VECTOR, 0); }
		public TerminalNode VECTOR_OVER() { return getToken(glParser.VECTOR_OVER, 0); }
		public Def_font_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_font_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterDef_font_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitDef_font_type(this);
		}
	}

	public final Def_font_typeContext def_font_type() throws RecognitionException {
		Def_font_typeContext _localctx = new Def_font_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_def_font_type);
		int _la;
		try {
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BITMAP_OVER:
			case BITMAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				((Def_font_typeContext)_localctx).font_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BITMAP_OVER || _la==BITMAP) ) {
					((Def_font_typeContext)_localctx).font_type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(863);
				((Def_font_typeContext)_localctx).bitmap_font_num = literal_numbers();
				 ((Def_font_typeContext)_localctx).str =  (((Def_font_typeContext)_localctx).font_type!=null?((Def_font_typeContext)_localctx).font_type.getText():null) + ", " + (((Def_font_typeContext)_localctx).bitmap_font_num!=null?_input.getText(((Def_font_typeContext)_localctx).bitmap_font_num.start,((Def_font_typeContext)_localctx).bitmap_font_num.stop):null) + ", null, null, null"; 
				}
				break;
			case VECTOR_OVER:
			case VECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				((Def_font_typeContext)_localctx).font_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==VECTOR_OVER || _la==VECTOR) ) {
					((Def_font_typeContext)_localctx).font_type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(867);
				((Def_font_typeContext)_localctx).char_w = literal_numbers();
				setState(868);
				((Def_font_typeContext)_localctx).char_h = literal_numbers();
				setState(869);
				((Def_font_typeContext)_localctx).line_width = literal_numbers();
				 ((Def_font_typeContext)_localctx).str =  (((Def_font_typeContext)_localctx).font_type!=null?((Def_font_typeContext)_localctx).font_type.getText():null) + ", null, " + macroPort.calcW((((Def_font_typeContext)_localctx).char_w!=null?_input.getText(((Def_font_typeContext)_localctx).char_w.start,((Def_font_typeContext)_localctx).char_w.stop):null)) + ", " + macroPort.calcH((((Def_font_typeContext)_localctx).char_h!=null?_input.getText(((Def_font_typeContext)_localctx).char_h.start,((Def_font_typeContext)_localctx).char_h.stop):null)) + ", " + (((Def_font_typeContext)_localctx).line_width!=null?_input.getText(((Def_font_typeContext)_localctx).line_width.start,((Def_font_typeContext)_localctx).line_width.stop):null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPOLYGONContext extends ParserRuleContext {
		public String _line_pat;
		public String _fill_pat;
		public Literal_numbersContext n;
		public Coordinate_pairsContext pairs;
		public Literal_numbersContext line_width;
		public Def_conditional_valueContext line_pat;
		public Def_conditional_valueContext fill_pat;
		public TerminalNode CC_POLYGON() { return getToken(glParser.CC_POLYGON, 0); }
		public Coordinate_pairsContext coordinate_pairs() {
			return getRuleContext(Coordinate_pairsContext.class,0);
		}
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<Def_conditional_valueContext> def_conditional_value() {
			return getRuleContexts(Def_conditional_valueContext.class);
		}
		public Def_conditional_valueContext def_conditional_value(int i) {
			return getRuleContext(Def_conditional_valueContext.class,i);
		}
		public CmdPOLYGONContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPOLYGON; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdPOLYGON(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdPOLYGON(this);
		}
	}

	public final CmdPOLYGONContext cmdPOLYGON() throws RecognitionException {
		CmdPOLYGONContext _localctx = new CmdPOLYGONContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_cmdPOLYGON);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(CC_POLYGON);
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(875);
				if (!( section == Section.I_SHAPELIB )) throw new FailedPredicateException(this, " section == Section.I_SHAPELIB ");
				setState(876);
				((CmdPOLYGONContext)_localctx).n = literal_numbers();
				}
				break;
			}
			setState(879);
			((CmdPOLYGONContext)_localctx).pairs = coordinate_pairs();
			setState(880);
			((CmdPOLYGONContext)_localctx).line_width = literal_numbers();
			setState(881);
			((CmdPOLYGONContext)_localctx).line_pat = def_conditional_value("line_pat");
			setState(882);
			((CmdPOLYGONContext)_localctx).fill_pat = def_conditional_value("fill_pat");
			}
			_ctx.stop = _input.LT(-1);

				if (((CmdPOLYGONContext)_localctx).line_pat.arg_result != null && ((CmdPOLYGONContext)_localctx).line_pat.arg_result.size() == 3) {
					print(((CmdPOLYGONContext)_localctx).line_pat.arg_result.get(1));
					println(((CmdPOLYGONContext)_localctx).line_pat.arg_result.get(2));
					((CmdPOLYGONContext)_localctx)._line_pat =  "line_pat";
				}
				if (((CmdPOLYGONContext)_localctx).line_pat.arg_result != null && ((CmdPOLYGONContext)_localctx).line_pat.arg_result.size() == 2)
					((CmdPOLYGONContext)_localctx)._line_pat =  ((CmdPOLYGONContext)_localctx).line_pat.arg_result.get(0);

				if (((CmdPOLYGONContext)_localctx).fill_pat.arg_result != null && ((CmdPOLYGONContext)_localctx).fill_pat.arg_result.size() == 3) {
					print(((CmdPOLYGONContext)_localctx).fill_pat.arg_result.get(1));
					println(((CmdPOLYGONContext)_localctx).fill_pat.arg_result.get(2));
					((CmdPOLYGONContext)_localctx)._fill_pat =  "fill_pat";
				}
				if (((CmdPOLYGONContext)_localctx).fill_pat.arg_result != null && ((CmdPOLYGONContext)_localctx).fill_pat.arg_result.size() == 2)
					((CmdPOLYGONContext)_localctx)._fill_pat =  ((CmdPOLYGONContext)_localctx).fill_pat.arg_result.get(0);

				if (section == Section.I_SHAPELIB) {
					print("sPOLYGON(trgt,"+((CmdPOLYGONContext)_localctx).pairs.n+","+coordinate_pairs_X+","+coordinate_pairs_Y+","+
						(((CmdPOLYGONContext)_localctx).line_width!=null?_input.getText(((CmdPOLYGONContext)_localctx).line_width.start,((CmdPOLYGONContext)_localctx).line_width.stop):null)+","+_localctx._line_pat.toUpperCase()+","+_localctx._fill_pat.toUpperCase()+");"
					);
				} else {
					println(UseCommands.get_use_cmds(section, "POLYGON") + "Gpolygon("+
			//			((CmdPOLYGONContext)_localctx).pairs.n+",px,py,"+
							((CmdPOLYGONContext)_localctx).pairs.n+","+
							coordinate_pairs_X+","+
							coordinate_pairs_Y+","+
						(((CmdPOLYGONContext)_localctx).line_width!=null?_input.getText(((CmdPOLYGONContext)_localctx).line_width.start,((CmdPOLYGONContext)_localctx).line_width.stop):null)+","+
						_localctx._line_pat.toUpperCase()+","+
						_localctx._fill_pat.toUpperCase()+");"
					);
				}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPROCESS_PTContext extends ParserRuleContext {
		public String process_pt_value;
		public boolean flag_expr = false;
		public String expr;
		public Literal_numbersContext x;
		public Literal_numbersContext literal_numbers;
		public Literal_numbersContext y;
		public ValueContext value;
		public Token format;
		public Token quality;
		public Token ornt;
		public Def_font_typeContext font_type;
		public ValueContext point;
		public ConditionalExpressionContext conditionalExpression;
		public TerminalNode CC_PROCESS_PT() { return getToken(glParser.CC_PROCESS_PT, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode BlinkPattern() { return getToken(glParser.BlinkPattern, 0); }
		public Def_font_typeContext def_font_type() {
			return getRuleContext(Def_font_typeContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(glParser.RIGHT, 0); }
		public TerminalNode RIGHT0() { return getToken(glParser.RIGHT0, 0); }
		public TerminalNode LEFT() { return getToken(glParser.LEFT, 0); }
		public TerminalNode HEX() { return getToken(glParser.HEX, 0); }
		public TerminalNode HEX_H() { return getToken(glParser.HEX_H, 0); }
		public TerminalNode BINARY() { return getToken(glParser.BINARY, 0); }
		public TerminalNode EXPONENTIAL() { return getToken(glParser.EXPONENTIAL, 0); }
		public TerminalNode TECHNICAL() { return getToken(glParser.TECHNICAL, 0); }
		public TerminalNode HORZ() { return getToken(glParser.HORZ, 0); }
		public TerminalNode VERT() { return getToken(glParser.VERT, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public CmdPROCESS_PTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPROCESS_PT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdPROCESS_PT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdPROCESS_PT(this);
		}
	}

	public final CmdPROCESS_PTContext cmdPROCESS_PT() throws RecognitionException {
		CmdPROCESS_PTContext _localctx = new CmdPROCESS_PTContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_cmdPROCESS_PT);

			ST template = new ST("Gprocess_pt("+
				"<x>,<y>,<number_of_chars>,<decimal_places>,<format>,"+
				"<quality>,<orientation>,<font_type>,"+
				"<str_value>,<value>,"+
				"<low_limit>,<high_limit>);");
			template.add("low_limit", "null");
			template.add("high_limit", "null");

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(CC_PROCESS_PT);
			setState(885);
			((CmdPROCESS_PTContext)_localctx).x = ((CmdPROCESS_PTContext)_localctx).literal_numbers = literal_numbers();
			 template.add("x", macroPort.calcX((((CmdPROCESS_PTContext)_localctx).x!=null?_input.getText(((CmdPROCESS_PTContext)_localctx).x.start,((CmdPROCESS_PTContext)_localctx).x.stop):null))); 
			setState(887);
			((CmdPROCESS_PTContext)_localctx).y = ((CmdPROCESS_PTContext)_localctx).literal_numbers = literal_numbers();
			 template.add("y", macroPort.calcY((((CmdPROCESS_PTContext)_localctx).y!=null?_input.getText(((CmdPROCESS_PTContext)_localctx).y.start,((CmdPROCESS_PTContext)_localctx).y.stop):null)));
										  macroBBox.addPoint((((CmdPROCESS_PTContext)_localctx).x!=null?_input.getText(((CmdPROCESS_PTContext)_localctx).x.start,((CmdPROCESS_PTContext)_localctx).x.stop):null), (((CmdPROCESS_PTContext)_localctx).y!=null?_input.getText(((CmdPROCESS_PTContext)_localctx).y.start,((CmdPROCESS_PTContext)_localctx).y.stop):null)); 
			setState(889);
			((CmdPROCESS_PTContext)_localctx).literal_numbers = literal_numbers();
			 template.add("number_of_chars", (((CmdPROCESS_PTContext)_localctx).literal_numbers!=null?_input.getText(((CmdPROCESS_PTContext)_localctx).literal_numbers.start,((CmdPROCESS_PTContext)_localctx).literal_numbers.stop):null)); 
			setState(891);
			((CmdPROCESS_PTContext)_localctx).value = value();
			 template.add("decimal_places", ((CmdPROCESS_PTContext)_localctx).value.str); 
			setState(893);
			((CmdPROCESS_PTContext)_localctx).format = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RIGHT0) | (1L << RIGHT) | (1L << LEFT) | (1L << HEX_H) | (1L << HEX) | (1L << BINARY) | (1L << EXPONENTIAL) | (1L << TECHNICAL))) != 0)) ) {
				((CmdPROCESS_PTContext)_localctx).format = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 template.add("format", (((CmdPROCESS_PTContext)_localctx).format!=null?((CmdPROCESS_PTContext)_localctx).format.getText():null)); 
			setState(895);
			((CmdPROCESS_PTContext)_localctx).quality = match(BlinkPattern);
			 template.add("quality", (((CmdPROCESS_PTContext)_localctx).quality!=null?((CmdPROCESS_PTContext)_localctx).quality.getText():null)); 
			setState(897);
			((CmdPROCESS_PTContext)_localctx).ornt = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==HORZ || _la==VERT) ) {
				((CmdPROCESS_PTContext)_localctx).ornt = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 template.add("orientation", (((CmdPROCESS_PTContext)_localctx).ornt!=null?((CmdPROCESS_PTContext)_localctx).ornt.getText():null)); 
			setState(899);
			((CmdPROCESS_PTContext)_localctx).font_type = def_font_type();
			 template.add("font_type", ((CmdPROCESS_PTContext)_localctx).font_type.str); 
			setState(901);
			((CmdPROCESS_PTContext)_localctx).point = ((CmdPROCESS_PTContext)_localctx).value = value();

					template.add("str_value", "'" + ((CmdPROCESS_PTContext)_localctx).point.str + "'");
					template.add("value", ((CmdPROCESS_PTContext)_localctx).point.str);
					((CmdPROCESS_PTContext)_localctx).process_pt_value =  ((CmdPROCESS_PTContext)_localctx).point.str;
				
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (Gpointer - 167)) | (1L << (Hpointer - 167)) | (1L << (Wpointer - 167)) | (1L << (Dpointer - 167)) | (1L << (Ppointer - 167)) | (1L << (Spointer - 167)) | (1L << (Opointer - 167)) | (1L << (CaseExp - 167)) | (1L << (QualityExp - 167)) | (1L << (SetExp - 167)) | (1L << (SetVariable - 167)) | (1L << (ConstVariable - 167)) | (1L << (ColorVariable - 167)) | (1L << (LPAREN - 167)) | (1L << (LBRACE - 167)) | (1L << (PLUS - 167)) | (1L << (MINUS - 167)) | (1L << (IntegerLiteral - 167)) | (1L << (FloatingPointLiteral - 167)) | (1L << (PointName - 167)))) != 0)) {
				{
				 statement_name = ""; 
				setState(904);
				((CmdPROCESS_PTContext)_localctx).conditionalExpression = conditionalExpression();
				 ((CmdPROCESS_PTContext)_localctx).flag_expr =  true; ((CmdPROCESS_PTContext)_localctx).expr =  ((CmdPROCESS_PTContext)_localctx).conditionalExpression.str; 
				}
			}

			}
			_ctx.stop = _input.LT(-1);


				if (_localctx.flag_expr) {
					print("pr_pt_val=" + _localctx.process_pt_value + ";");
					String tmp_str = _localctx.process_pt_value;
					String tmp_pnt = tmp_str.substring(tmp_str.indexOf("("), tmp_str.indexOf(")")+1);
			//		println("// tmp_pnt          =   " + tmp_pnt);
			//		println("// expr             =   " + _localctx.expr);
					String tmp_expr = _localctx.expr;
					tmp_expr = tmp_expr.replace("{=\"", "{pr_pt_val=get").replace("\";}", tmp_pnt + ";}" );
					println(tmp_expr);
					template.remove("value"); template.add("value", "pr_pt_val");
				}

				String output = template.render();
				println(UseCommands.get_use_cmds(section, "PROCESS_PT") + output);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdRECTANGLEContext extends ParserRuleContext {
		public String _line_pat;
		public String _fill_pat;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public Literal_numbersContext line_width;
		public Def_conditional_valueContext line_pat;
		public Def_conditional_valueContext fill_pat;
		public TerminalNode CC_RECTANGLE() { return getToken(glParser.CC_RECTANGLE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<Def_conditional_valueContext> def_conditional_value() {
			return getRuleContexts(Def_conditional_valueContext.class);
		}
		public Def_conditional_valueContext def_conditional_value(int i) {
			return getRuleContext(Def_conditional_valueContext.class,i);
		}
		public CmdRECTANGLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRECTANGLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdRECTANGLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdRECTANGLE(this);
		}
	}

	public final CmdRECTANGLEContext cmdRECTANGLE() throws RecognitionException {
		CmdRECTANGLEContext _localctx = new CmdRECTANGLEContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_cmdRECTANGLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(CC_RECTANGLE);
			setState(910);
			((CmdRECTANGLEContext)_localctx).x = literal_numbers();
			setState(911);
			((CmdRECTANGLEContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdRECTANGLEContext)_localctx).x!=null?_input.getText(((CmdRECTANGLEContext)_localctx).x.start,((CmdRECTANGLEContext)_localctx).x.stop):null), (((CmdRECTANGLEContext)_localctx).y!=null?_input.getText(((CmdRECTANGLEContext)_localctx).y.start,((CmdRECTANGLEContext)_localctx).y.stop):null)); 
			setState(913);
			((CmdRECTANGLEContext)_localctx).w = literal_numbers();
			setState(914);
			((CmdRECTANGLEContext)_localctx).h = literal_numbers();
			 macroBBox.addRect((((CmdRECTANGLEContext)_localctx).x!=null?_input.getText(((CmdRECTANGLEContext)_localctx).x.start,((CmdRECTANGLEContext)_localctx).x.stop):null), (((CmdRECTANGLEContext)_localctx).y!=null?_input.getText(((CmdRECTANGLEContext)_localctx).y.start,((CmdRECTANGLEContext)_localctx).y.stop):null), (((CmdRECTANGLEContext)_localctx).w!=null?_input.getText(((CmdRECTANGLEContext)_localctx).w.start,((CmdRECTANGLEContext)_localctx).w.stop):null), (((CmdRECTANGLEContext)_localctx).h!=null?_input.getText(((CmdRECTANGLEContext)_localctx).h.start,((CmdRECTANGLEContext)_localctx).h.stop):null)); 
			setState(916);
			((CmdRECTANGLEContext)_localctx).line_width = literal_numbers();
			setState(917);
			((CmdRECTANGLEContext)_localctx).line_pat = def_conditional_value("line_pat");
			setState(918);
			((CmdRECTANGLEContext)_localctx).fill_pat = def_conditional_value("fill_pat");
			}
			_ctx.stop = _input.LT(-1);

				if (((CmdRECTANGLEContext)_localctx).line_pat.arg_result != null && ((CmdRECTANGLEContext)_localctx).line_pat.arg_result.size() == 3) {
					print(((CmdRECTANGLEContext)_localctx).line_pat.arg_result.get(1));
					println(((CmdRECTANGLEContext)_localctx).line_pat.arg_result.get(2));
					((CmdRECTANGLEContext)_localctx)._line_pat =  "line_pat";
				}
				if (((CmdRECTANGLEContext)_localctx).line_pat.arg_result != null && ((CmdRECTANGLEContext)_localctx).line_pat.arg_result.size() == 2)
					((CmdRECTANGLEContext)_localctx)._line_pat =  ((CmdRECTANGLEContext)_localctx).line_pat.arg_result.get(0);

				if (((CmdRECTANGLEContext)_localctx).fill_pat.arg_result != null && ((CmdRECTANGLEContext)_localctx).fill_pat.arg_result.size() == 3) {
					print(((CmdRECTANGLEContext)_localctx).fill_pat.arg_result.get(1));
					println(((CmdRECTANGLEContext)_localctx).fill_pat.arg_result.get(2));
					((CmdRECTANGLEContext)_localctx)._fill_pat =  "fill_pat";
				}
				if (((CmdRECTANGLEContext)_localctx).fill_pat.arg_result != null && ((CmdRECTANGLEContext)_localctx).fill_pat.arg_result.size() == 2)
					((CmdRECTANGLEContext)_localctx)._fill_pat =  ((CmdRECTANGLEContext)_localctx).fill_pat.arg_result.get(0);

				if (section == Section.I_SHAPELIB) {
					print("sRECTANGLE(trgt,"+(((CmdRECTANGLEContext)_localctx).x!=null?_input.getText(((CmdRECTANGLEContext)_localctx).x.start,((CmdRECTANGLEContext)_localctx).x.stop):null)+","+(((CmdRECTANGLEContext)_localctx).y!=null?_input.getText(((CmdRECTANGLEContext)_localctx).y.start,((CmdRECTANGLEContext)_localctx).y.stop):null)+","+
						(((CmdRECTANGLEContext)_localctx).w!=null?_input.getText(((CmdRECTANGLEContext)_localctx).w.start,((CmdRECTANGLEContext)_localctx).w.stop):null)+","+(((CmdRECTANGLEContext)_localctx).h!=null?_input.getText(((CmdRECTANGLEContext)_localctx).h.start,((CmdRECTANGLEContext)_localctx).h.stop):null)+","+
						(((CmdRECTANGLEContext)_localctx).line_width!=null?_input.getText(((CmdRECTANGLEContext)_localctx).line_width.start,((CmdRECTANGLEContext)_localctx).line_width.stop):null)+","+_localctx._line_pat.toUpperCase()+","+_localctx._fill_pat.toUpperCase()+");"
					);
				} else {
					println(UseCommands.get_use_cmds(section, "RECTANGLE") + "Grectangle("+
						macroPort.calcX((((CmdRECTANGLEContext)_localctx).x!=null?_input.getText(((CmdRECTANGLEContext)_localctx).x.start,((CmdRECTANGLEContext)_localctx).x.stop):null))+","+
						macroPort.calcY((((CmdRECTANGLEContext)_localctx).y!=null?_input.getText(((CmdRECTANGLEContext)_localctx).y.start,((CmdRECTANGLEContext)_localctx).y.stop):null))+","+
						macroPort.calcW((((CmdRECTANGLEContext)_localctx).w!=null?_input.getText(((CmdRECTANGLEContext)_localctx).w.start,((CmdRECTANGLEContext)_localctx).w.stop):null))+","+
						macroPort.calcH((((CmdRECTANGLEContext)_localctx).h!=null?_input.getText(((CmdRECTANGLEContext)_localctx).h.start,((CmdRECTANGLEContext)_localctx).h.stop):null))+","+
						(((CmdRECTANGLEContext)_localctx).line_width!=null?_input.getText(((CmdRECTANGLEContext)_localctx).line_width.start,((CmdRECTANGLEContext)_localctx).line_width.stop):null)+","+
						_localctx._line_pat.toUpperCase()+","+
						_localctx._fill_pat.toUpperCase()+");"
					);
				}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSHAPEContext extends ParserRuleContext {
		public String _shape_name;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public Def_conditional_valueContext shape_name;
		public ValueContext rotation;
		public Token inversion;
		public TerminalNode CC_SHAPE() { return getToken(glParser.CC_SHAPE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public Def_conditional_valueContext def_conditional_value() {
			return getRuleContext(Def_conditional_valueContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NONE() { return getToken(glParser.NONE, 0); }
		public TerminalNode TTB() { return getToken(glParser.TTB, 0); }
		public TerminalNode RTL() { return getToken(glParser.RTL, 0); }
		public TerminalNode BOTH() { return getToken(glParser.BOTH, 0); }
		public CmdSHAPEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSHAPE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdSHAPE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdSHAPE(this);
		}
	}

	public final CmdSHAPEContext cmdSHAPE() throws RecognitionException {
		CmdSHAPEContext _localctx = new CmdSHAPEContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_cmdSHAPE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(CC_SHAPE);
			setState(921);
			((CmdSHAPEContext)_localctx).x = literal_numbers();
			setState(922);
			((CmdSHAPEContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdSHAPEContext)_localctx).x!=null?_input.getText(((CmdSHAPEContext)_localctx).x.start,((CmdSHAPEContext)_localctx).x.stop):null), (((CmdSHAPEContext)_localctx).y!=null?_input.getText(((CmdSHAPEContext)_localctx).y.start,((CmdSHAPEContext)_localctx).y.stop):null)); 
			setState(924);
			((CmdSHAPEContext)_localctx).w = literal_numbers();
			setState(925);
			((CmdSHAPEContext)_localctx).h = literal_numbers();
			 macroBBox.addShape((((CmdSHAPEContext)_localctx).x!=null?_input.getText(((CmdSHAPEContext)_localctx).x.start,((CmdSHAPEContext)_localctx).x.stop):null), (((CmdSHAPEContext)_localctx).y!=null?_input.getText(((CmdSHAPEContext)_localctx).y.start,((CmdSHAPEContext)_localctx).y.stop):null), (((CmdSHAPEContext)_localctx).w!=null?_input.getText(((CmdSHAPEContext)_localctx).w.start,((CmdSHAPEContext)_localctx).w.stop):null), (((CmdSHAPEContext)_localctx).h!=null?_input.getText(((CmdSHAPEContext)_localctx).h.start,((CmdSHAPEContext)_localctx).h.stop):null)); 
			setState(927);
			((CmdSHAPEContext)_localctx).shape_name = def_conditional_value("shape_name");
			setState(928);
			((CmdSHAPEContext)_localctx).rotation = value();
			setState(929);
			((CmdSHAPEContext)_localctx).inversion = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << TTB) | (1L << RTL) | (1L << BOTH))) != 0)) ) {
				((CmdSHAPEContext)_localctx).inversion = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			_ctx.stop = _input.LT(-1);

				if (((CmdSHAPEContext)_localctx).shape_name.arg_result != null && ((CmdSHAPEContext)_localctx).shape_name.arg_result.size() == 3) {
					print(((CmdSHAPEContext)_localctx).shape_name.arg_result.get(1));
					println(((CmdSHAPEContext)_localctx).shape_name.arg_result.get(2));
					((CmdSHAPEContext)_localctx)._shape_name =  "shape_name";
				}
				if (((CmdSHAPEContext)_localctx).shape_name.arg_result != null && ((CmdSHAPEContext)_localctx).shape_name.arg_result.size() == 2)
					((CmdSHAPEContext)_localctx)._shape_name =  ((CmdSHAPEContext)_localctx).shape_name.arg_result.get(0);

				println(UseCommands.get_use_cmds(section, "SHAPE") + "Gshape("+
					macroPort.calcX((((CmdSHAPEContext)_localctx).x!=null?_input.getText(((CmdSHAPEContext)_localctx).x.start,((CmdSHAPEContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdSHAPEContext)_localctx).y!=null?_input.getText(((CmdSHAPEContext)_localctx).y.start,((CmdSHAPEContext)_localctx).y.stop):null))+","+
					macroPort.calcW((((CmdSHAPEContext)_localctx).w!=null?_input.getText(((CmdSHAPEContext)_localctx).w.start,((CmdSHAPEContext)_localctx).w.stop):null))+","+
					macroPort.calcH((((CmdSHAPEContext)_localctx).h!=null?_input.getText(((CmdSHAPEContext)_localctx).h.start,((CmdSHAPEContext)_localctx).h.stop):null))+","+
					_localctx._shape_name+","+
					((CmdSHAPEContext)_localctx).rotation.str+","+
					(((CmdSHAPEContext)_localctx).inversion!=null?((CmdSHAPEContext)_localctx).inversion.getText():null)+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdTEXTContext extends ParserRuleContext {
		public String _string_literal;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Def_conditional_valueContext string_literal;
		public Token ornt;
		public Def_font_typeContext font_type;
		public TerminalNode CC_TEXT() { return getToken(glParser.CC_TEXT, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public Def_conditional_valueContext def_conditional_value() {
			return getRuleContext(Def_conditional_valueContext.class,0);
		}
		public Def_font_typeContext def_font_type() {
			return getRuleContext(Def_font_typeContext.class,0);
		}
		public TerminalNode HORZ() { return getToken(glParser.HORZ, 0); }
		public TerminalNode VERT() { return getToken(glParser.VERT, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(glParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(glParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(glParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(glParser.RBRACKET, i);
		}
		public CmdTEXTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdTEXT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdTEXT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdTEXT(this);
		}
	}

	public final CmdTEXTContext cmdTEXT() throws RecognitionException {
		CmdTEXTContext _localctx = new CmdTEXTContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cmdTEXT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(CC_TEXT);
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(932);
				match(LBRACKET);
				}
			}

			setState(935);
			((CmdTEXTContext)_localctx).x = literal_numbers();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRACKET) {
				{
				setState(936);
				match(RBRACKET);
				}
			}

			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(939);
				match(LBRACKET);
				}
			}

			setState(942);
			((CmdTEXTContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdTEXTContext)_localctx).x!=null?_input.getText(((CmdTEXTContext)_localctx).x.start,((CmdTEXTContext)_localctx).x.stop):null), (((CmdTEXTContext)_localctx).y!=null?_input.getText(((CmdTEXTContext)_localctx).y.start,((CmdTEXTContext)_localctx).y.stop):null)); 
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRACKET) {
				{
				setState(944);
				match(RBRACKET);
				}
			}

			setState(947);
			((CmdTEXTContext)_localctx).string_literal = def_conditional_value("string_literal");
			setState(948);
			((CmdTEXTContext)_localctx).ornt = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==HORZ || _la==VERT) ) {
				((CmdTEXTContext)_localctx).ornt = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(949);
			((CmdTEXTContext)_localctx).font_type = def_font_type();
			}
			_ctx.stop = _input.LT(-1);

				// Есть Условный параметр (значение)
				if (((CmdTEXTContext)_localctx).string_literal.arg_result != null && ((CmdTEXTContext)_localctx).string_literal.arg_result.size() == 3) {
					print(((CmdTEXTContext)_localctx).string_literal.arg_result.get(1));
					println(((CmdTEXTContext)_localctx).string_literal.arg_result.get(2));
					((CmdTEXTContext)_localctx)._string_literal =  "string_literal";
				}
				// Нет Условный параметр (значение)
				if (((CmdTEXTContext)_localctx).string_literal.arg_result != null && ((CmdTEXTContext)_localctx).string_literal.arg_result.size() == 2) {
					((CmdTEXTContext)_localctx)._string_literal =  ((CmdTEXTContext)_localctx).string_literal.arg_result.get(0);
				}
				println(UseCommands.get_use_cmds(section, "TEXT") + "Gtext("+
					macroPort.calcX((((CmdTEXTContext)_localctx).x!=null?_input.getText(((CmdTEXTContext)_localctx).x.start,((CmdTEXTContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdTEXTContext)_localctx).y!=null?_input.getText(((CmdTEXTContext)_localctx).y.start,((CmdTEXTContext)_localctx).y.stop):null))+","+
					_localctx._string_literal+","+
					(((CmdTEXTContext)_localctx).ornt!=null?((CmdTEXTContext)_localctx).ornt.getText():null)+","+
					((CmdTEXTContext)_localctx).font_type.str+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdTRIG_ONContext extends ParserRuleContext {
		public String _integer_literal;
		public Def_conditional_valueContext integer_literal;
		public TerminalNode CC_TRIG_ON() { return getToken(glParser.CC_TRIG_ON, 0); }
		public Def_conditional_valueContext def_conditional_value() {
			return getRuleContext(Def_conditional_valueContext.class,0);
		}
		public CmdTRIG_ONContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdTRIG_ON; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdTRIG_ON(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdTRIG_ON(this);
		}
	}

	public final CmdTRIG_ONContext cmdTRIG_ON() throws RecognitionException {
		CmdTRIG_ONContext _localctx = new CmdTRIG_ONContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_cmdTRIG_ON);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(CC_TRIG_ON);
			setState(952);
			((CmdTRIG_ONContext)_localctx).integer_literal = def_conditional_value("integer_literal");
			}
			_ctx.stop = _input.LT(-1);

				if (((CmdTRIG_ONContext)_localctx).integer_literal.arg_result != null && ((CmdTRIG_ONContext)_localctx).integer_literal.arg_result.size() == 3) {
					print(((CmdTRIG_ONContext)_localctx).integer_literal.arg_result.get(1));
					println(((CmdTRIG_ONContext)_localctx).integer_literal.arg_result.get(2));
					((CmdTRIG_ONContext)_localctx)._integer_literal =  "integer_literal";
				}
				if (((CmdTRIG_ONContext)_localctx).integer_literal.arg_result != null && ((CmdTRIG_ONContext)_localctx).integer_literal.arg_result.size() == 2)
					((CmdTRIG_ONContext)_localctx)._integer_literal =  ((CmdTRIG_ONContext)_localctx).integer_literal.arg_result.get(0);

				println(UseCommands.get_use_cmds(section, "TRIG_ON") + "Gtrig_on("+_localctx._integer_literal+");");

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdOL_GAUGEContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public Token direction;
		public ValueContext cur_value;
		public ValueContext value;
		public ValueContext low_limit;
		public ValueContext high_limit;
		public TerminalNode C_OL_GAUGE() { return getToken(glParser.C_OL_GAUGE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode LEFT() { return getToken(glParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(glParser.RIGHT, 0); }
		public TerminalNode DOWN() { return getToken(glParser.DOWN, 0); }
		public TerminalNode UP() { return getToken(glParser.UP, 0); }
		public TerminalNode BIAS() { return getToken(glParser.BIAS, 0); }
		public CmdOL_GAUGEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdOL_GAUGE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdOL_GAUGE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdOL_GAUGE(this);
		}
	}

	public final CmdOL_GAUGEContext cmdOL_GAUGE() throws RecognitionException {
		CmdOL_GAUGEContext _localctx = new CmdOL_GAUGEContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cmdOL_GAUGE);

			ST tmplt = new ST("Gol_gauge(<x>,<y>,<w>,<h>,<direction>,<cur_value>,<low_limit>,<high_limit>);");

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(C_OL_GAUGE);
			setState(955);
			((CmdOL_GAUGEContext)_localctx).x = literal_numbers();
			setState(956);
			((CmdOL_GAUGEContext)_localctx).y = literal_numbers();
			setState(957);
			((CmdOL_GAUGEContext)_localctx).w = literal_numbers();
			setState(958);
			((CmdOL_GAUGEContext)_localctx).h = literal_numbers();
			setState(959);
			((CmdOL_GAUGEContext)_localctx).direction = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RIGHT) | (1L << LEFT) | (1L << DOWN) | (1L << UP) | (1L << BIAS))) != 0)) ) {
				((CmdOL_GAUGEContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

						macroBBox.addBar((((CmdOL_GAUGEContext)_localctx).x!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).x.start,((CmdOL_GAUGEContext)_localctx).x.stop):null), (((CmdOL_GAUGEContext)_localctx).y!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).y.start,((CmdOL_GAUGEContext)_localctx).y.stop):null), (((CmdOL_GAUGEContext)_localctx).w!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).w.start,((CmdOL_GAUGEContext)_localctx).w.stop):null), (((CmdOL_GAUGEContext)_localctx).h!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).h.start,((CmdOL_GAUGEContext)_localctx).h.stop):null), (((CmdOL_GAUGEContext)_localctx).direction!=null?((CmdOL_GAUGEContext)_localctx).direction.getText():null));
						tmplt.add("direction",  (((CmdOL_GAUGEContext)_localctx).direction!=null?((CmdOL_GAUGEContext)_localctx).direction.getText():null));
						// Исходной точкой может являться:
						//  - Нижний левый угол прямоугольника (с заполнением up).
						//  - Верхний левый угол прямоугольника (с заполнением down или right или bias).
						//  - Верхний правый угол прямоугольника (с заполнением left).
						switch ((((CmdOL_GAUGEContext)_localctx).direction!=null?((CmdOL_GAUGEContext)_localctx).direction.getText():null)) {
						case "\"UP\"":		// снизу вверх - отлажено
							tmplt.add("x", macroPort.calcX((((CmdOL_GAUGEContext)_localctx).x!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).x.start,((CmdOL_GAUGEContext)_localctx).x.stop):null)));
							tmplt.add("y", macroPort.calcY((((CmdOL_GAUGEContext)_localctx).y!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).y.start,((CmdOL_GAUGEContext)_localctx).y.stop):null)));
							tmplt.add("w", macroPort.calcW((((CmdOL_GAUGEContext)_localctx).w!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).w.start,((CmdOL_GAUGEContext)_localctx).w.stop):null)));
							tmplt.add("h", macroPort.calcH((((CmdOL_GAUGEContext)_localctx).h!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).h.start,((CmdOL_GAUGEContext)_localctx).h.stop):null)));
							break;
						case "\"BIAS\"":	// вверх или вниз от позиции с нулевым значением
							tmplt.add("x", macroPort.calcX((((CmdOL_GAUGEContext)_localctx).x!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).x.start,((CmdOL_GAUGEContext)_localctx).x.stop):null)));
							tmplt.add("y", macroPort.calcY((((CmdOL_GAUGEContext)_localctx).y!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).y.start,((CmdOL_GAUGEContext)_localctx).y.stop):null)));
							tmplt.add("w", macroPort.calcW((((CmdOL_GAUGEContext)_localctx).w!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).w.start,((CmdOL_GAUGEContext)_localctx).w.stop):null)));
							tmplt.add("h", macroPort.calcH((((CmdOL_GAUGEContext)_localctx).h!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).h.start,((CmdOL_GAUGEContext)_localctx).h.stop):null)));
							break;
						case "\"DOWN\"":	// сверху вниз - отлажено
							tmplt.add("x", macroPort.calcX((((CmdOL_GAUGEContext)_localctx).x!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).x.start,((CmdOL_GAUGEContext)_localctx).x.stop):null)));
							tmplt.add("y", macroPort.calcY((((CmdOL_GAUGEContext)_localctx).y!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).y.start,((CmdOL_GAUGEContext)_localctx).y.stop):null)));
							tmplt.add("w", macroPort.calcW((((CmdOL_GAUGEContext)_localctx).w!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).w.start,((CmdOL_GAUGEContext)_localctx).w.stop):null)));
							tmplt.add("h", macroPort.calcH((((CmdOL_GAUGEContext)_localctx).h!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).h.start,((CmdOL_GAUGEContext)_localctx).h.stop):null)));
							break;
						case "\"RIGHT\"":	// слева направо - отлажено
							tmplt.add("x", macroPort.calcX((((CmdOL_GAUGEContext)_localctx).x!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).x.start,((CmdOL_GAUGEContext)_localctx).x.stop):null)));
							tmplt.add("y", macroPort.calcY((((CmdOL_GAUGEContext)_localctx).y!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).y.start,((CmdOL_GAUGEContext)_localctx).y.stop):null)));
							tmplt.add("w", macroPort.calcH((((CmdOL_GAUGEContext)_localctx).w!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).w.start,((CmdOL_GAUGEContext)_localctx).w.stop):null)));//( W * H_scale)
							tmplt.add("h", macroPort.calcW((((CmdOL_GAUGEContext)_localctx).h!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).h.start,((CmdOL_GAUGEContext)_localctx).h.stop):null)));//( H * W_scale)
							break;
						case "\"LEFT\"":	// справа налево - отлажено
							tmplt.add("x", macroPort.calcX((((CmdOL_GAUGEContext)_localctx).x!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).x.start,((CmdOL_GAUGEContext)_localctx).x.stop):null)));
							tmplt.add("y", macroPort.calcY((((CmdOL_GAUGEContext)_localctx).y!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).y.start,((CmdOL_GAUGEContext)_localctx).y.stop):null)));
							tmplt.add("w", macroPort.calcH((((CmdOL_GAUGEContext)_localctx).w!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).w.start,((CmdOL_GAUGEContext)_localctx).w.stop):null)));//( W * H_scale)
							tmplt.add("h", macroPort.calcW((((CmdOL_GAUGEContext)_localctx).h!=null?_input.getText(((CmdOL_GAUGEContext)_localctx).h.start,((CmdOL_GAUGEContext)_localctx).h.stop):null)));//( H * W_scale)
							break;
						}
					
			setState(961);
			((CmdOL_GAUGEContext)_localctx).cur_value = ((CmdOL_GAUGEContext)_localctx).value = value();
			 tmplt.add("cur_value", ((CmdOL_GAUGEContext)_localctx).value.str); 
			setState(963);
			((CmdOL_GAUGEContext)_localctx).low_limit = ((CmdOL_GAUGEContext)_localctx).value = value();
			 tmplt.add("low_limit", ((CmdOL_GAUGEContext)_localctx).value.str); 
			setState(965);
			((CmdOL_GAUGEContext)_localctx).high_limit = ((CmdOL_GAUGEContext)_localctx).value = value();
			 tmplt.add("high_limit", ((CmdOL_GAUGEContext)_localctx).value.str); 
			}
			_ctx.stop = _input.LT(-1);

				if (parserMode != MODE_PREPROCESSOR)
					println(UseCommands.get_use_cmds(section, "OL_GAUGE") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdBARContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public Token direction;
		public ValueContext cur_value;
		public ValueContext value;
		public ValueContext low_limit;
		public ValueContext high_limit;
		public TerminalNode C_BAR() { return getToken(glParser.C_BAR, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode LEFT() { return getToken(glParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(glParser.RIGHT, 0); }
		public TerminalNode DOWN() { return getToken(glParser.DOWN, 0); }
		public TerminalNode UP() { return getToken(glParser.UP, 0); }
		public TerminalNode BIAS() { return getToken(glParser.BIAS, 0); }
		public CmdBARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdBAR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdBAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdBAR(this);
		}
	}

	public final CmdBARContext cmdBAR() throws RecognitionException {
		CmdBARContext _localctx = new CmdBARContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_cmdBAR);

			ST tmplt = new ST("Gbar(<x>,<y>,<w>,<h>,<direction>,<cur_value>,<low_limit>,<high_limit>);");

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(C_BAR);
			setState(969);
			((CmdBARContext)_localctx).x = literal_numbers();
			setState(970);
			((CmdBARContext)_localctx).y = literal_numbers();
			setState(971);
			((CmdBARContext)_localctx).w = literal_numbers();
			setState(972);
			((CmdBARContext)_localctx).h = literal_numbers();
			setState(973);
			((CmdBARContext)_localctx).direction = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RIGHT) | (1L << LEFT) | (1L << DOWN) | (1L << UP) | (1L << BIAS))) != 0)) ) {
				((CmdBARContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

						macroBBox.addBar((((CmdBARContext)_localctx).x!=null?_input.getText(((CmdBARContext)_localctx).x.start,((CmdBARContext)_localctx).x.stop):null), (((CmdBARContext)_localctx).y!=null?_input.getText(((CmdBARContext)_localctx).y.start,((CmdBARContext)_localctx).y.stop):null), (((CmdBARContext)_localctx).w!=null?_input.getText(((CmdBARContext)_localctx).w.start,((CmdBARContext)_localctx).w.stop):null), (((CmdBARContext)_localctx).h!=null?_input.getText(((CmdBARContext)_localctx).h.start,((CmdBARContext)_localctx).h.stop):null), (((CmdBARContext)_localctx).direction!=null?((CmdBARContext)_localctx).direction.getText():null));
						tmplt.add("direction", (((CmdBARContext)_localctx).direction!=null?((CmdBARContext)_localctx).direction.getText():null));
						// Исходной точкой может являться:
						//  - Нижний левый угол прямоугольника (с заполнением up).
						//  - Верхний левый угол прямоугольника (с заполнением down или right или bias).
						//  - Верхний правый угол прямоугольника (с заполнением left).
						switch ((((CmdBARContext)_localctx).direction!=null?((CmdBARContext)_localctx).direction.getText():null)) {
						case "\"UP\"":		// снизу вверх - отлажено
							tmplt.add("x", macroPort.calcX((((CmdBARContext)_localctx).x!=null?_input.getText(((CmdBARContext)_localctx).x.start,((CmdBARContext)_localctx).x.stop):null)));
							tmplt.add("y", macroPort.calcY((((CmdBARContext)_localctx).y!=null?_input.getText(((CmdBARContext)_localctx).y.start,((CmdBARContext)_localctx).y.stop):null)));
							tmplt.add("w", macroPort.calcW((((CmdBARContext)_localctx).w!=null?_input.getText(((CmdBARContext)_localctx).w.start,((CmdBARContext)_localctx).w.stop):null)));
							tmplt.add("h", macroPort.calcH((((CmdBARContext)_localctx).h!=null?_input.getText(((CmdBARContext)_localctx).h.start,((CmdBARContext)_localctx).h.stop):null)));
							break;
						case "\"BIAS\"":	// вверх или вниз от позиции с нулевым значением
							tmplt.add("x", macroPort.calcX((((CmdBARContext)_localctx).x!=null?_input.getText(((CmdBARContext)_localctx).x.start,((CmdBARContext)_localctx).x.stop):null)));
							tmplt.add("y", macroPort.calcY((((CmdBARContext)_localctx).y!=null?_input.getText(((CmdBARContext)_localctx).y.start,((CmdBARContext)_localctx).y.stop):null)));
							tmplt.add("w", macroPort.calcW((((CmdBARContext)_localctx).w!=null?_input.getText(((CmdBARContext)_localctx).w.start,((CmdBARContext)_localctx).w.stop):null)));
							tmplt.add("h", macroPort.calcH((((CmdBARContext)_localctx).h!=null?_input.getText(((CmdBARContext)_localctx).h.start,((CmdBARContext)_localctx).h.stop):null)));
							break;
						case "\"DOWN\"":	// сверху вниз - отлажено
							tmplt.add("x", macroPort.calcX((((CmdBARContext)_localctx).x!=null?_input.getText(((CmdBARContext)_localctx).x.start,((CmdBARContext)_localctx).x.stop):null)));
							tmplt.add("y", macroPort.calcY((((CmdBARContext)_localctx).y!=null?_input.getText(((CmdBARContext)_localctx).y.start,((CmdBARContext)_localctx).y.stop):null)));
							tmplt.add("w", macroPort.calcW((((CmdBARContext)_localctx).w!=null?_input.getText(((CmdBARContext)_localctx).w.start,((CmdBARContext)_localctx).w.stop):null)));
							tmplt.add("h", macroPort.calcH((((CmdBARContext)_localctx).h!=null?_input.getText(((CmdBARContext)_localctx).h.start,((CmdBARContext)_localctx).h.stop):null)));
							break;
						case "\"RIGHT\"":	// слева направо - отлажено
							tmplt.add("x", macroPort.calcX((((CmdBARContext)_localctx).x!=null?_input.getText(((CmdBARContext)_localctx).x.start,((CmdBARContext)_localctx).x.stop):null)));
							tmplt.add("y", macroPort.calcY((((CmdBARContext)_localctx).y!=null?_input.getText(((CmdBARContext)_localctx).y.start,((CmdBARContext)_localctx).y.stop):null)));
							tmplt.add("w", macroPort.calcH((((CmdBARContext)_localctx).w!=null?_input.getText(((CmdBARContext)_localctx).w.start,((CmdBARContext)_localctx).w.stop):null)));//( W * H_scale)
							tmplt.add("h", macroPort.calcW((((CmdBARContext)_localctx).h!=null?_input.getText(((CmdBARContext)_localctx).h.start,((CmdBARContext)_localctx).h.stop):null)));//( H * W_scale)
							break;
						case "\"LEFT\"":	// справа налево - отлажено
							tmplt.add("x", macroPort.calcX((((CmdBARContext)_localctx).x!=null?_input.getText(((CmdBARContext)_localctx).x.start,((CmdBARContext)_localctx).x.stop):null)));
							tmplt.add("y", macroPort.calcY((((CmdBARContext)_localctx).y!=null?_input.getText(((CmdBARContext)_localctx).y.start,((CmdBARContext)_localctx).y.stop):null)));
							tmplt.add("w", macroPort.calcH((((CmdBARContext)_localctx).w!=null?_input.getText(((CmdBARContext)_localctx).w.start,((CmdBARContext)_localctx).w.stop):null)));//( W * H_scale)
							tmplt.add("h", macroPort.calcW((((CmdBARContext)_localctx).h!=null?_input.getText(((CmdBARContext)_localctx).h.start,((CmdBARContext)_localctx).h.stop):null)));//( H * W_scale)
							break;
						}
					
			setState(975);
			((CmdBARContext)_localctx).cur_value = ((CmdBARContext)_localctx).value = value();
			 tmplt.add("cur_value", ((CmdBARContext)_localctx).value.str); 
			setState(977);
			((CmdBARContext)_localctx).low_limit = ((CmdBARContext)_localctx).value = value();
			 tmplt.add("low_limit", ((CmdBARContext)_localctx).value.str); 
			setState(979);
			((CmdBARContext)_localctx).high_limit = ((CmdBARContext)_localctx).value = value();
			 tmplt.add("high_limit", ((CmdBARContext)_localctx).value.str); 
			}
			_ctx.stop = _input.LT(-1);

				if (parserMode != MODE_PREPROCESSOR)
					println(UseCommands.get_use_cmds(section, "BAR") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCURSORContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public TerminalNode C_CURSOR() { return getToken(glParser.C_CURSOR, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public CmdCURSORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCURSOR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdCURSOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdCURSOR(this);
		}
	}

	public final CmdCURSORContext cmdCURSOR() throws RecognitionException {
		CmdCURSORContext _localctx = new CmdCURSORContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cmdCURSOR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(C_CURSOR);
			setState(983);
			((CmdCURSORContext)_localctx).x = literal_numbers();
			setState(984);
			((CmdCURSORContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdCURSORContext)_localctx).x!=null?_input.getText(((CmdCURSORContext)_localctx).x.start,((CmdCURSORContext)_localctx).x.stop):null), (((CmdCURSORContext)_localctx).y!=null?_input.getText(((CmdCURSORContext)_localctx).y.start,((CmdCURSORContext)_localctx).y.stop):null)); 
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "CURSOR") + "Gcursor("+
					macroPort.calcX((((CmdCURSORContext)_localctx).x!=null?_input.getText(((CmdCURSORContext)_localctx).x.start,((CmdCURSORContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdCURSORContext)_localctx).y!=null?_input.getText(((CmdCURSORContext)_localctx).y.start,((CmdCURSORContext)_localctx).y.stop):null))+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDATEContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext format;
		public Def_font_typeContext font_type;
		public TerminalNode C_DATE() { return getToken(glParser.C_DATE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public Def_font_typeContext def_font_type() {
			return getRuleContext(Def_font_typeContext.class,0);
		}
		public CmdDATEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDATE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDATE(this);
		}
	}

	public final CmdDATEContext cmdDATE() throws RecognitionException {
		CmdDATEContext _localctx = new CmdDATEContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cmdDATE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(C_DATE);
			setState(988);
			((CmdDATEContext)_localctx).x = literal_numbers();
			setState(989);
			((CmdDATEContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdDATEContext)_localctx).x!=null?_input.getText(((CmdDATEContext)_localctx).x.start,((CmdDATEContext)_localctx).x.stop):null), (((CmdDATEContext)_localctx).y!=null?_input.getText(((CmdDATEContext)_localctx).y.start,((CmdDATEContext)_localctx).y.stop):null)); 
			setState(991);
			((CmdDATEContext)_localctx).format = literal_numbers();
			setState(992);
			((CmdDATEContext)_localctx).font_type = def_font_type();
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "DATE") + "Gdate("+
					macroPort.calcX((((CmdDATEContext)_localctx).x!=null?_input.getText(((CmdDATEContext)_localctx).x.start,((CmdDATEContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdDATEContext)_localctx).y!=null?_input.getText(((CmdDATEContext)_localctx).y.start,((CmdDATEContext)_localctx).y.stop):null))+","+
					(((CmdDATEContext)_localctx).format!=null?_input.getText(((CmdDATEContext)_localctx).format.start,((CmdDATEContext)_localctx).format.stop):null)+","+
					((CmdDATEContext)_localctx).font_type.str+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDEF_FKEY_GROUPContext extends ParserRuleContext {
		public StringBuilder arg = new StringBuilder();;
		public Literal_numbersContext group;
		public Prog_args_patContext a;
		public TerminalNode C_DEF_FKEY_GROUP() { return getToken(glParser.C_DEF_FKEY_GROUP, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public List<Prog_args_patContext> prog_args_pat() {
			return getRuleContexts(Prog_args_patContext.class);
		}
		public Prog_args_patContext prog_args_pat(int i) {
			return getRuleContext(Prog_args_patContext.class,i);
		}
		public CmdDEF_FKEY_GROUPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDEF_FKEY_GROUP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDEF_FKEY_GROUP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDEF_FKEY_GROUP(this);
		}
	}

	public final CmdDEF_FKEY_GROUPContext cmdDEF_FKEY_GROUP() throws RecognitionException {
		CmdDEF_FKEY_GROUPContext _localctx = new CmdDEF_FKEY_GROUPContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_cmdDEF_FKEY_GROUP);
		 boolean first = true; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(C_DEF_FKEY_GROUP);
			setState(995);
			((CmdDEF_FKEY_GROUPContext)_localctx).group = literal_numbers();
			setState(999); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(996);
				((CmdDEF_FKEY_GROUPContext)_localctx).a = prog_args_pat();

							if (!first) { _localctx.arg.append("\t"); }
							first = false;
							_localctx.arg.append(((CmdDEF_FKEY_GROUPContext)_localctx).a.str.replace("\"", " ").trim());
						
				}
				}
				setState(1001); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (RecordField - 166)) | (1L << (Gpointer - 166)) | (1L << (Hpointer - 166)) | (1L << (Wpointer - 166)) | (1L << (Dpointer - 166)) | (1L << (Ppointer - 166)) | (1L << (Spointer - 166)) | (1L << (Opointer - 166)) | (1L << (Ioffset - 166)) | (1L << (Roffset - 166)) | (1L << (Boffset - 166)) | (1L << (Soffset - 166)) | (1L << (Aoffset - 166)) | (1L << (StatusWord - 166)) | (1L << (SetVariable - 166)) | (1L << (ConstVariable - 166)) | (1L << (ColorVariable - 166)) | (1L << (StatusVariable - 166)) | (1L << (MINUS - 166)) | (1L << (IntegerLiteral - 166)) | (1L << (FloatingPointLiteral - 166)) | (1L << (StringLiteral - 166)) | (1L << (PointName - 166)) | (1L << (Identifier - 166)))) != 0) );
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "DEF_FKEY_GROUP") +
					"Gdef_fkey_group("+(((CmdDEF_FKEY_GROUPContext)_localctx).group!=null?_input.getText(((CmdDEF_FKEY_GROUPContext)_localctx).group.start,((CmdDEF_FKEY_GROUPContext)_localctx).group.stop):null)+",\""+ _localctx.arg.toString()+"\");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDEF_QUALContext extends ParserRuleContext {
		public Token G_fgcolor;
		public Token G_bgcolor;
		public Token G_blink;
		public Token G_string;
		public Token F_fgcolor;
		public Token F_bgcolor;
		public Token F_blink;
		public Token F_string;
		public Token P_fgcolor;
		public Token P_bgcolor;
		public Token P_blink;
		public Token P_string;
		public Token B_fgcolor;
		public Token B_bgcolor;
		public Token B_blink;
		public Token B_string;
		public Token T_fgcolor;
		public Token T_bgcolor;
		public Token T_blink;
		public Token T_string;
		public TerminalNode C_DEF_QUAL() { return getToken(glParser.C_DEF_QUAL, 0); }
		public List<TerminalNode> Color() { return getTokens(glParser.Color); }
		public TerminalNode Color(int i) {
			return getToken(glParser.Color, i);
		}
		public List<TerminalNode> BlinkPattern() { return getTokens(glParser.BlinkPattern); }
		public TerminalNode BlinkPattern(int i) {
			return getToken(glParser.BlinkPattern, i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(glParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(glParser.StringLiteral, i);
		}
		public CmdDEF_QUALContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDEF_QUAL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDEF_QUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDEF_QUAL(this);
		}
	}

	public final CmdDEF_QUALContext cmdDEF_QUAL() throws RecognitionException {
		CmdDEF_QUALContext _localctx = new CmdDEF_QUALContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cmdDEF_QUAL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(C_DEF_QUAL);
			setState(1004);
			((CmdDEF_QUALContext)_localctx).G_fgcolor = match(Color);
			setState(1005);
			((CmdDEF_QUALContext)_localctx).G_bgcolor = match(Color);
			setState(1006);
			((CmdDEF_QUALContext)_localctx).G_blink = match(BlinkPattern);
			setState(1007);
			((CmdDEF_QUALContext)_localctx).G_string = match(StringLiteral);
			setState(1008);
			((CmdDEF_QUALContext)_localctx).F_fgcolor = match(Color);
			setState(1009);
			((CmdDEF_QUALContext)_localctx).F_bgcolor = match(Color);
			setState(1010);
			((CmdDEF_QUALContext)_localctx).F_blink = match(BlinkPattern);
			setState(1011);
			((CmdDEF_QUALContext)_localctx).F_string = match(StringLiteral);
			setState(1012);
			((CmdDEF_QUALContext)_localctx).P_fgcolor = match(Color);
			setState(1013);
			((CmdDEF_QUALContext)_localctx).P_bgcolor = match(Color);
			setState(1014);
			((CmdDEF_QUALContext)_localctx).P_blink = match(BlinkPattern);
			setState(1015);
			((CmdDEF_QUALContext)_localctx).P_string = match(StringLiteral);
			setState(1016);
			((CmdDEF_QUALContext)_localctx).B_fgcolor = match(Color);
			setState(1017);
			((CmdDEF_QUALContext)_localctx).B_bgcolor = match(Color);
			setState(1018);
			((CmdDEF_QUALContext)_localctx).B_blink = match(BlinkPattern);
			setState(1019);
			((CmdDEF_QUALContext)_localctx).B_string = match(StringLiteral);
			setState(1020);
			((CmdDEF_QUALContext)_localctx).T_fgcolor = match(Color);
			setState(1021);
			((CmdDEF_QUALContext)_localctx).T_bgcolor = match(Color);
			setState(1022);
			((CmdDEF_QUALContext)_localctx).T_blink = match(BlinkPattern);
			setState(1023);
			((CmdDEF_QUALContext)_localctx).T_string = match(StringLiteral);
			}
			_ctx.stop = _input.LT(-1);

				if (!macroPort.get_m_flag()) 
					println(UseCommands.get_use_cmds(section, "DEF_QUAL")
						+"Gdef_qual("
						+(((CmdDEF_QUALContext)_localctx).G_fgcolor!=null?((CmdDEF_QUALContext)_localctx).G_fgcolor.getText():null)		+","+(((CmdDEF_QUALContext)_localctx).G_bgcolor!=null?((CmdDEF_QUALContext)_localctx).G_bgcolor.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).G_blink!=null?((CmdDEF_QUALContext)_localctx).G_blink.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).G_string!=null?((CmdDEF_QUALContext)_localctx).G_string.getText():null)
						+","+(((CmdDEF_QUALContext)_localctx).F_fgcolor!=null?((CmdDEF_QUALContext)_localctx).F_fgcolor.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).F_bgcolor!=null?((CmdDEF_QUALContext)_localctx).F_bgcolor.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).F_blink!=null?((CmdDEF_QUALContext)_localctx).F_blink.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).F_string!=null?((CmdDEF_QUALContext)_localctx).F_string.getText():null)
						+","+(((CmdDEF_QUALContext)_localctx).P_fgcolor!=null?((CmdDEF_QUALContext)_localctx).P_fgcolor.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).P_bgcolor!=null?((CmdDEF_QUALContext)_localctx).P_bgcolor.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).P_blink!=null?((CmdDEF_QUALContext)_localctx).P_blink.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).P_string!=null?((CmdDEF_QUALContext)_localctx).P_string.getText():null)
						+","+(((CmdDEF_QUALContext)_localctx).B_fgcolor!=null?((CmdDEF_QUALContext)_localctx).B_fgcolor.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).B_bgcolor!=null?((CmdDEF_QUALContext)_localctx).B_bgcolor.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).B_blink!=null?((CmdDEF_QUALContext)_localctx).B_blink.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).B_string!=null?((CmdDEF_QUALContext)_localctx).B_string.getText():null)
						+","+(((CmdDEF_QUALContext)_localctx).T_fgcolor!=null?((CmdDEF_QUALContext)_localctx).T_fgcolor.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).T_bgcolor!=null?((CmdDEF_QUALContext)_localctx).T_bgcolor.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).T_blink!=null?((CmdDEF_QUALContext)_localctx).T_blink.getText():null)	+","+(((CmdDEF_QUALContext)_localctx).T_string!=null?((CmdDEF_QUALContext)_localctx).T_string.getText():null)
					+");");

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDIAG_DISPContext extends ParserRuleContext {
		public StringBuilder cmd = new StringBuilder();;
		public Token diag_type;
		public Literal_numbersContext diag_num;
		public Literal_numbersContext group_num;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public Literal_numbersContext num_sids;
		public Pt_name_patContext pnt;
		public TerminalNode C_DIAG_DISP() { return getToken(glParser.C_DIAG_DISP, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode MAIN() { return getToken(glParser.MAIN, 0); }
		public TerminalNode SUBWIN() { return getToken(glParser.SUBWIN, 0); }
		public TerminalNode WINDOW() { return getToken(glParser.WINDOW, 0); }
		public TerminalNode POSITION() { return getToken(glParser.POSITION, 0); }
		public TerminalNode SIZE() { return getToken(glParser.SIZE, 0); }
		public List<Pt_name_patContext> pt_name_pat() {
			return getRuleContexts(Pt_name_patContext.class);
		}
		public Pt_name_patContext pt_name_pat(int i) {
			return getRuleContext(Pt_name_patContext.class,i);
		}
		public CmdDIAG_DISPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDIAG_DISP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDIAG_DISP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDIAG_DISP(this);
		}
	}

	public final CmdDIAG_DISPContext cmdDIAG_DISP() throws RecognitionException {
		CmdDIAG_DISPContext _localctx = new CmdDIAG_DISPContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cmdDIAG_DISP);
		 boolean first = true; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(C_DIAG_DISP);
			 _localctx.cmd.append("Gdiag_disp("); 
			setState(1027);
			((CmdDIAG_DISPContext)_localctx).diag_type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIN) | (1L << SUBWIN) | (1L << WINDOW))) != 0)) ) {
				((CmdDIAG_DISPContext)_localctx).diag_type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _localctx.cmd.append((((CmdDIAG_DISPContext)_localctx).diag_type!=null?((CmdDIAG_DISPContext)_localctx).diag_type.getText():null)+","); 
			setState(1029);
			((CmdDIAG_DISPContext)_localctx).diag_num = literal_numbers();
			 _localctx.cmd.append((((CmdDIAG_DISPContext)_localctx).diag_num!=null?_input.getText(((CmdDIAG_DISPContext)_localctx).diag_num.start,((CmdDIAG_DISPContext)_localctx).diag_num.stop):null)+","); 
			setState(1031);
			((CmdDIAG_DISPContext)_localctx).group_num = literal_numbers();
			 _localctx.cmd.append((((CmdDIAG_DISPContext)_localctx).group_num!=null?_input.getText(((CmdDIAG_DISPContext)_localctx).group_num.start,((CmdDIAG_DISPContext)_localctx).group_num.stop):null)+","); 
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSITION) {
				{
				setState(1033);
				match(POSITION);
				setState(1034);
				((CmdDIAG_DISPContext)_localctx).x = literal_numbers();
				setState(1035);
				((CmdDIAG_DISPContext)_localctx).y = literal_numbers();
				}
			}

			 _localctx.cmd.append((((CmdDIAG_DISPContext)_localctx).x!=null?_input.getText(((CmdDIAG_DISPContext)_localctx).x.start,((CmdDIAG_DISPContext)_localctx).x.stop):null)+","+(((CmdDIAG_DISPContext)_localctx).y!=null?_input.getText(((CmdDIAG_DISPContext)_localctx).y.start,((CmdDIAG_DISPContext)_localctx).y.stop):null)+","); 
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIZE) {
				{
				setState(1040);
				match(SIZE);
				setState(1041);
				((CmdDIAG_DISPContext)_localctx).w = literal_numbers();
				setState(1042);
				((CmdDIAG_DISPContext)_localctx).h = literal_numbers();
				}
			}

			 _localctx.cmd.append((((CmdDIAG_DISPContext)_localctx).w!=null?_input.getText(((CmdDIAG_DISPContext)_localctx).w.start,((CmdDIAG_DISPContext)_localctx).w.stop):null)+","+(((CmdDIAG_DISPContext)_localctx).h!=null?_input.getText(((CmdDIAG_DISPContext)_localctx).h.start,((CmdDIAG_DISPContext)_localctx).h.stop):null)+","); 
			setState(1047);
			((CmdDIAG_DISPContext)_localctx).num_sids = literal_numbers();
			 _localctx.cmd.append((((CmdDIAG_DISPContext)_localctx).num_sids!=null?_input.getText(((CmdDIAG_DISPContext)_localctx).num_sids.start,((CmdDIAG_DISPContext)_localctx).num_sids.stop):null)+","); 
			 _localctx.cmd.append("["); 
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (Gpointer - 167)) | (1L << (Hpointer - 167)) | (1L << (Wpointer - 167)) | (1L << (Dpointer - 167)) | (1L << (Ppointer - 167)) | (1L << (PointName - 167)))) != 0)) {
				{
				{
				setState(1050);
				((CmdDIAG_DISPContext)_localctx).pnt = pt_name_pat();

							if (!first) { _localctx.cmd.append(","); }
							first = false;
							_localctx.cmd.append((((CmdDIAG_DISPContext)_localctx).pnt!=null?_input.getText(((CmdDIAG_DISPContext)_localctx).pnt.start,((CmdDIAG_DISPContext)_localctx).pnt.stop):null));
						
				}
				}
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.cmd.append("]);"); 
			}
			_ctx.stop = _input.LT(-1);
			 println(UseCommands.get_use_cmds(section, "DIAG_DISP") + _localctx.cmd.toString()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDOTContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Token size;
		public TerminalNode C_DOT() { return getToken(glParser.C_DOT, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode SMALL() { return getToken(glParser.SMALL, 0); }
		public TerminalNode MEDIUM() { return getToken(glParser.MEDIUM, 0); }
		public TerminalNode LARGE() { return getToken(glParser.LARGE, 0); }
		public CmdDOTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDOT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDOT(this);
		}
	}

	public final CmdDOTContext cmdDOT() throws RecognitionException {
		CmdDOTContext _localctx = new CmdDOTContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cmdDOT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(C_DOT);
			setState(1061);
			((CmdDOTContext)_localctx).x = literal_numbers();
			setState(1062);
			((CmdDOTContext)_localctx).y = literal_numbers();
			setState(1063);
			((CmdDOTContext)_localctx).size = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SMALL) | (1L << MEDIUM) | (1L << LARGE))) != 0)) ) {
				((CmdDOTContext)_localctx).size = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 macroBBox.addDOT((((CmdDOTContext)_localctx).x!=null?_input.getText(((CmdDOTContext)_localctx).x.start,((CmdDOTContext)_localctx).x.stop):null), (((CmdDOTContext)_localctx).y!=null?_input.getText(((CmdDOTContext)_localctx).y.start,((CmdDOTContext)_localctx).y.stop):null), (((CmdDOTContext)_localctx).size!=null?((CmdDOTContext)_localctx).size.getText():null)); 
			}
			_ctx.stop = _input.LT(-1);

				if (section == Section.I_SHAPELIB) {
					print("sDOT(trgt,"+(((CmdDOTContext)_localctx).x!=null?_input.getText(((CmdDOTContext)_localctx).x.start,((CmdDOTContext)_localctx).x.stop):null)+","+(((CmdDOTContext)_localctx).y!=null?_input.getText(((CmdDOTContext)_localctx).y.start,((CmdDOTContext)_localctx).y.stop):null)+","+
						(((CmdDOTContext)_localctx).size!=null?((CmdDOTContext)_localctx).size.getText():null).toUpperCase()+");"
					);
				} else {
					println(UseCommands.get_use_cmds(section, "DOT") +
						"Gdot("+macroPort.calcX((((CmdDOTContext)_localctx).x!=null?_input.getText(((CmdDOTContext)_localctx).x.start,((CmdDOTContext)_localctx).x.stop):null))+","+macroPort.calcY((((CmdDOTContext)_localctx).y!=null?_input.getText(((CmdDOTContext)_localctx).y.start,((CmdDOTContext)_localctx).y.stop):null))+","+
							(((CmdDOTContext)_localctx).size!=null?((CmdDOTContext)_localctx).size.getText():null).toUpperCase()+");"
					);
				}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEF_STATEContext extends ParserRuleContext {
		public Literal_numbersContext entry_fld;
		public Token state;
		public TerminalNode C_EF_STATE() { return getToken(glParser.C_EF_STATE, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public TerminalNode BlinkPattern() { return getToken(glParser.BlinkPattern, 0); }
		public CmdEF_STATEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEF_STATE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdEF_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdEF_STATE(this);
		}
	}

	public final CmdEF_STATEContext cmdEF_STATE() throws RecognitionException {
		CmdEF_STATEContext _localctx = new CmdEF_STATEContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_cmdEF_STATE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(C_EF_STATE);
			setState(1067);
			((CmdEF_STATEContext)_localctx).entry_fld = literal_numbers();
			setState(1068);
			((CmdEF_STATEContext)_localctx).state = match(BlinkPattern);
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "EF_STATE") + "Gef_state("+
					(((CmdEF_STATEContext)_localctx).entry_fld!=null?_input.getText(((CmdEF_STATEContext)_localctx).entry_fld.start,((CmdEF_STATEContext)_localctx).entry_fld.stop):null)+
					(((CmdEF_STATEContext)_localctx).state!=null?((CmdEF_STATEContext)_localctx).state.getText():null)+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLOOPContext extends ParserRuleContext {
		public Literal_numbersContext n;
		public TerminalNode C_LOOP() { return getToken(glParser.C_LOOP, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public CmdLOOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLOOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdLOOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdLOOP(this);
		}
	}

	public final CmdLOOPContext cmdLOOP() throws RecognitionException {
		CmdLOOPContext _localctx = new CmdLOOPContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_cmdLOOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			match(C_LOOP);
			setState(1071);
			((CmdLOOPContext)_localctx).n = literal_numbers();
			}
			_ctx.stop = _input.LT(-1);

				println("for (i = 0; i < "+(((CmdLOOPContext)_localctx).n!=null?_input.getText(((CmdLOOPContext)_localctx).n.start,((CmdLOOPContext)_localctx).n.stop):null)+"; i++) {");

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdENDLOOPContext extends ParserRuleContext {
		public TerminalNode C_ENDLOOP() { return getToken(glParser.C_ENDLOOP, 0); }
		public CmdENDLOOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdENDLOOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdENDLOOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdENDLOOP(this);
		}
	}

	public final CmdENDLOOPContext cmdENDLOOP() throws RecognitionException {
		CmdENDLOOPContext _localctx = new CmdENDLOOPContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cmdENDLOOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(C_ENDLOOP);
			}
			_ctx.stop = _input.LT(-1);
			 println("}"); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdENTRY_FLDContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext l;
		public Literal_numbersContext number;
		public Token type;
		public Token format;
		public Token state;
		public Def_font_typeContext font_type;
		public TerminalNode C_ENTRY_FLD() { return getToken(glParser.C_ENTRY_FLD, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode BlinkPattern() { return getToken(glParser.BlinkPattern, 0); }
		public Def_font_typeContext def_font_type() {
			return getRuleContext(Def_font_typeContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(glParser.OPERATOR, 0); }
		public TerminalNode PROGRAM() { return getToken(glParser.PROGRAM, 0); }
		public TerminalNode BOTH() { return getToken(glParser.BOTH, 0); }
		public TerminalNode ASCII() { return getToken(glParser.ASCII, 0); }
		public TerminalNode INT() { return getToken(glParser.INT, 0); }
		public TerminalNode REAL() { return getToken(glParser.REAL, 0); }
		public TerminalNode BYTE() { return getToken(glParser.BYTE, 0); }
		public TerminalNode HEX() { return getToken(glParser.HEX, 0); }
		public TerminalNode EXPONENTIAL() { return getToken(glParser.EXPONENTIAL, 0); }
		public CmdENTRY_FLDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdENTRY_FLD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdENTRY_FLD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdENTRY_FLD(this);
		}
	}

	public final CmdENTRY_FLDContext cmdENTRY_FLD() throws RecognitionException {
		CmdENTRY_FLDContext _localctx = new CmdENTRY_FLDContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cmdENTRY_FLD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(C_ENTRY_FLD);
			setState(1076);
			((CmdENTRY_FLDContext)_localctx).x = literal_numbers();
			setState(1077);
			((CmdENTRY_FLDContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdENTRY_FLDContext)_localctx).x!=null?_input.getText(((CmdENTRY_FLDContext)_localctx).x.start,((CmdENTRY_FLDContext)_localctx).x.stop):null), (((CmdENTRY_FLDContext)_localctx).y!=null?_input.getText(((CmdENTRY_FLDContext)_localctx).y.start,((CmdENTRY_FLDContext)_localctx).y.stop):null)); 
			setState(1079);
			((CmdENTRY_FLDContext)_localctx).l = literal_numbers();
			setState(1080);
			((CmdENTRY_FLDContext)_localctx).number = literal_numbers();
			setState(1081);
			((CmdENTRY_FLDContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOTH) | (1L << OPERATOR) | (1L << PROGRAM))) != 0)) ) {
				((CmdENTRY_FLDContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1082);
			((CmdENTRY_FLDContext)_localctx).format = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEX) | (1L << EXPONENTIAL) | (1L << ASCII) | (1L << INT) | (1L << REAL) | (1L << BYTE))) != 0)) ) {
				((CmdENTRY_FLDContext)_localctx).format = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1083);
			((CmdENTRY_FLDContext)_localctx).state = match(BlinkPattern);
			setState(1084);
			((CmdENTRY_FLDContext)_localctx).font_type = def_font_type();
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "ENTRY_FLD") + "Gentry_fld("+
					macroPort.calcX((((CmdENTRY_FLDContext)_localctx).x!=null?_input.getText(((CmdENTRY_FLDContext)_localctx).x.start,((CmdENTRY_FLDContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdENTRY_FLDContext)_localctx).y!=null?_input.getText(((CmdENTRY_FLDContext)_localctx).y.start,((CmdENTRY_FLDContext)_localctx).y.stop):null))+","+
					(((CmdENTRY_FLDContext)_localctx).l!=null?_input.getText(((CmdENTRY_FLDContext)_localctx).l.start,((CmdENTRY_FLDContext)_localctx).l.stop):null)+","+
					(((CmdENTRY_FLDContext)_localctx).number!=null?_input.getText(((CmdENTRY_FLDContext)_localctx).number.start,((CmdENTRY_FLDContext)_localctx).number.stop):null)+","+
					(((CmdENTRY_FLDContext)_localctx).type!=null?((CmdENTRY_FLDContext)_localctx).type.getText():null)+","+
					(((CmdENTRY_FLDContext)_localctx).format!=null?((CmdENTRY_FLDContext)_localctx).format.getText():null)+","+
					(((CmdENTRY_FLDContext)_localctx).state!=null?((CmdENTRY_FLDContext)_localctx).state.getText():null)+","+
					((CmdENTRY_FLDContext)_localctx).font_type.str+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFORCE_UPDATEContext extends ParserRuleContext {
		public Token state;
		public TerminalNode C_FORCE_UPDATE() { return getToken(glParser.C_FORCE_UPDATE, 0); }
		public TerminalNode BlinkPattern() { return getToken(glParser.BlinkPattern, 0); }
		public CmdFORCE_UPDATEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFORCE_UPDATE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdFORCE_UPDATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdFORCE_UPDATE(this);
		}
	}

	public final CmdFORCE_UPDATEContext cmdFORCE_UPDATE() throws RecognitionException {
		CmdFORCE_UPDATEContext _localctx = new CmdFORCE_UPDATEContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cmdFORCE_UPDATE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(C_FORCE_UPDATE);
			setState(1087);
			((CmdFORCE_UPDATEContext)_localctx).state = match(BlinkPattern);
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "FORCE_UPDATE") + "Gforce_update("+(((CmdFORCE_UPDATEContext)_localctx).state!=null?((CmdFORCE_UPDATEContext)_localctx).state.getText():null)+");");

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFUNC_KEYContext extends ParserRuleContext {
		public StringBuilder cmd = new StringBuilder();;
		public Literal_numbersContext key_num;
		public Token state;
		public Literal_numbersContext num_lists;
		public Prog_args_patContext arg;
		public TerminalNode C_FUNC_KEY() { return getToken(glParser.C_FUNC_KEY, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode BlinkPattern() { return getToken(glParser.BlinkPattern, 0); }
		public List<Prog_args_patContext> prog_args_pat() {
			return getRuleContexts(Prog_args_patContext.class);
		}
		public Prog_args_patContext prog_args_pat(int i) {
			return getRuleContext(Prog_args_patContext.class,i);
		}
		public CmdFUNC_KEYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFUNC_KEY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdFUNC_KEY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdFUNC_KEY(this);
		}
	}

	public final CmdFUNC_KEYContext cmdFUNC_KEY() throws RecognitionException {
		CmdFUNC_KEYContext _localctx = new CmdFUNC_KEYContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_cmdFUNC_KEY);
		 boolean first = true; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(C_FUNC_KEY);
			 _localctx.cmd.append("Gfunc_key(");        
			setState(1091);
			((CmdFUNC_KEYContext)_localctx).key_num = literal_numbers();
			 _localctx.cmd.append((((CmdFUNC_KEYContext)_localctx).key_num!=null?_input.getText(((CmdFUNC_KEYContext)_localctx).key_num.start,((CmdFUNC_KEYContext)_localctx).key_num.stop):null)+",");   
			setState(1093);
			((CmdFUNC_KEYContext)_localctx).state = match(BlinkPattern);
			 _localctx.cmd.append((((CmdFUNC_KEYContext)_localctx).state!=null?((CmdFUNC_KEYContext)_localctx).state.getText():null)+",");     
			setState(1095);
			((CmdFUNC_KEYContext)_localctx).num_lists = literal_numbers();
			 _localctx.cmd.append((((CmdFUNC_KEYContext)_localctx).num_lists!=null?_input.getText(((CmdFUNC_KEYContext)_localctx).num_lists.start,((CmdFUNC_KEYContext)_localctx).num_lists.stop):null)+","); 
			 _localctx.cmd.append("\""); 
			setState(1101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1098);
				((CmdFUNC_KEYContext)_localctx).arg = prog_args_pat();

							if (!first) { _localctx.cmd.append("\t"); }
							first = false;
							_localctx.cmd.append((((CmdFUNC_KEYContext)_localctx).arg!=null?_input.getText(((CmdFUNC_KEYContext)_localctx).arg.start,((CmdFUNC_KEYContext)_localctx).arg.stop):null));
						
				}
				}
				setState(1103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (RecordField - 166)) | (1L << (Gpointer - 166)) | (1L << (Hpointer - 166)) | (1L << (Wpointer - 166)) | (1L << (Dpointer - 166)) | (1L << (Ppointer - 166)) | (1L << (Spointer - 166)) | (1L << (Opointer - 166)) | (1L << (Ioffset - 166)) | (1L << (Roffset - 166)) | (1L << (Boffset - 166)) | (1L << (Soffset - 166)) | (1L << (Aoffset - 166)) | (1L << (StatusWord - 166)) | (1L << (SetVariable - 166)) | (1L << (ConstVariable - 166)) | (1L << (ColorVariable - 166)) | (1L << (StatusVariable - 166)) | (1L << (MINUS - 166)) | (1L << (IntegerLiteral - 166)) | (1L << (FloatingPointLiteral - 166)) | (1L << (StringLiteral - 166)) | (1L << (PointName - 166)) | (1L << (Identifier - 166)))) != 0) );
			 _localctx.cmd.append("\");"); 
			}
			_ctx.stop = _input.LT(-1);
			 println(UseCommands.get_use_cmds(section, "FUNC_KEY") + _localctx.cmd.toString()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdGTEXTContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext str_num;
		public Literal_numbersContext num_of_chars;
		public Token orientation;
		public Def_font_typeContext font_type;
		public TerminalNode C_GTEXT() { return getToken(glParser.C_GTEXT, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public Def_font_typeContext def_font_type() {
			return getRuleContext(Def_font_typeContext.class,0);
		}
		public TerminalNode HORZ() { return getToken(glParser.HORZ, 0); }
		public TerminalNode VERT() { return getToken(glParser.VERT, 0); }
		public CmdGTEXTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdGTEXT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdGTEXT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdGTEXT(this);
		}
	}

	public final CmdGTEXTContext cmdGTEXT() throws RecognitionException {
		CmdGTEXTContext _localctx = new CmdGTEXTContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cmdGTEXT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(C_GTEXT);
			setState(1108);
			((CmdGTEXTContext)_localctx).x = literal_numbers();
			setState(1109);
			((CmdGTEXTContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdGTEXTContext)_localctx).x!=null?_input.getText(((CmdGTEXTContext)_localctx).x.start,((CmdGTEXTContext)_localctx).x.stop):null), (((CmdGTEXTContext)_localctx).y!=null?_input.getText(((CmdGTEXTContext)_localctx).y.start,((CmdGTEXTContext)_localctx).y.stop):null)); 
			setState(1111);
			((CmdGTEXTContext)_localctx).str_num = literal_numbers();
			setState(1112);
			((CmdGTEXTContext)_localctx).num_of_chars = literal_numbers();
			setState(1113);
			((CmdGTEXTContext)_localctx).orientation = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==HORZ || _la==VERT) ) {
				((CmdGTEXTContext)_localctx).orientation = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1114);
			((CmdGTEXTContext)_localctx).font_type = def_font_type();
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "GTEXT") + "Ggtext("+
					macroPort.calcX((((CmdGTEXTContext)_localctx).x!=null?_input.getText(((CmdGTEXTContext)_localctx).x.start,((CmdGTEXTContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdGTEXTContext)_localctx).y!=null?_input.getText(((CmdGTEXTContext)_localctx).y.start,((CmdGTEXTContext)_localctx).y.stop):null))+","+
					(((CmdGTEXTContext)_localctx).str_num!=null?_input.getText(((CmdGTEXTContext)_localctx).str_num.start,((CmdGTEXTContext)_localctx).str_num.stop):null)+","+
					(((CmdGTEXTContext)_localctx).num_of_chars!=null?_input.getText(((CmdGTEXTContext)_localctx).num_of_chars.start,((CmdGTEXTContext)_localctx).num_of_chars.stop):null)+","+
					(((CmdGTEXTContext)_localctx).orientation!=null?((CmdGTEXTContext)_localctx).orientation.getText():null)+","+
					((CmdGTEXTContext)_localctx).font_type.str+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdIFContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode C_IF() { return getToken(glParser.C_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CmdIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdIF(this);
		}
	}

	public final CmdIFContext cmdIF() throws RecognitionException {
		CmdIFContext _localctx = new CmdIFContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cmdIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(C_IF);
			 ExprClear(); 
			setState(1118);
			((CmdIFContext)_localctx).expression = expression(0);
			 println("if "+((CmdIFContext)_localctx).expression.str+" {"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdIF_CHANGEDContext extends ParserRuleContext {
		public Literal_numbersContext deadband;
		public ValueContext changed_operand;
		public TerminalNode C_IF_CHANGED() { return getToken(glParser.C_IF_CHANGED, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(glParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(glParser.COMMA, i);
		}
		public CmdIF_CHANGEDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIF_CHANGED; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdIF_CHANGED(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdIF_CHANGED(this);
		}
	}

	public final CmdIF_CHANGEDContext cmdIF_CHANGED() throws RecognitionException {
		CmdIF_CHANGEDContext _localctx = new CmdIF_CHANGEDContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cmdIF_CHANGED);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			match(C_IF_CHANGED);
			 println("if (true) {"); 
			setState(1123);
			((CmdIF_CHANGEDContext)_localctx).deadband = literal_numbers();
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (Gpointer - 167)) | (1L << (Hpointer - 167)) | (1L << (Wpointer - 167)) | (1L << (Dpointer - 167)) | (1L << (Ppointer - 167)) | (1L << (Spointer - 167)) | (1L << (Opointer - 167)) | (1L << (MINUS - 167)) | (1L << (IntegerLiteral - 167)) | (1L << (FloatingPointLiteral - 167)) | (1L << (StringLiteral - 167)) | (1L << (PointName - 167)))) != 0)) {
				{
				{
				setState(1124);
				((CmdIF_CHANGEDContext)_localctx).changed_operand = value();
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1125);
					match(COMMA);
					}
				}

				}
				}
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdELSEContext extends ParserRuleContext {
		public TerminalNode C_ELSE() { return getToken(glParser.C_ELSE, 0); }
		public CmdELSEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdELSE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdELSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdELSE(this);
		}
	}

	public final CmdELSEContext cmdELSE() throws RecognitionException {
		CmdELSEContext _localctx = new CmdELSEContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cmdELSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(C_ELSE);
			 println("} else {"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdENDIFContext extends ParserRuleContext {
		public TerminalNode C_ENDIF() { return getToken(glParser.C_ENDIF, 0); }
		public CmdENDIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdENDIF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdENDIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdENDIF(this);
		}
	}

	public final CmdENDIFContext cmdENDIF() throws RecognitionException {
		CmdENDIFContext _localctx = new CmdENDIFContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cmdENDIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(C_ENDIF);
			 println("}"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdIFELSEContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode C_IFELSE() { return getToken(glParser.C_IFELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CmdIFELSEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIFELSE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdIFELSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdIFELSE(this);
		}
	}

	public final CmdIFELSEContext cmdIFELSE() throws RecognitionException {
		CmdIFELSEContext _localctx = new CmdIFELSEContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cmdIFELSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(C_IFELSE);
			 ExprClear(); 
			setState(1141);
			((CmdIFELSEContext)_localctx).expression = expression(0);
			 println("if "+((CmdIFELSEContext)_localctx).expression.str+" {"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdMACROContext extends ParserRuleContext {
		public int i = 1;
		public int i_D = 0;
		public StringBuilder sb_D = new StringBuilder();
		public int i_T_other = 0;
		public StringBuilder sb_T_other = new StringBuilder();
		public int i_T_bg = 0;
		public StringBuilder sb_T_bg = new StringBuilder();
		public int i_SET = 0;
		public StringBuilder sb_SET = new StringBuilder();
		public int i_CONST = 0;
		public StringBuilder sb_CONST = new StringBuilder();
		public int i_STATUS = 0;
		public StringBuilder sb_STATUS = new StringBuilder();
		public int i_COLOR = 0;
		public StringBuilder sb_COLOR = new StringBuilder();
		public int i_OLCOLOR = 0;
		public StringBuilder sb_OLCOLOR = new StringBuilder();
		public Literal_numbersContext macro_num;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w_scale;
		public Literal_numbersContext h_scale;
		public Token n_D;
		public Token n_T_other;
		public Token n_T_bg;
		public Token n_SET;
		public Token n_CONST;
		public Token n_STATUS;
		public Pt_name_patContext s1;
		public Token s2;
		public Token s3;
		public Token s4;
		public Literal_numbersContext s5;
		public Token s6;
		public Token n_COLOR;
		public Token s7;
		public Token n_OLCOLOR;
		public Literal_numbersContext s8;
		public TerminalNode C_MACRO() { return getToken(glParser.C_MACRO, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<TerminalNode> IntegerLiteral() { return getTokens(glParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(glParser.IntegerLiteral, i);
		}
		public List<Pt_name_patContext> pt_name_pat() {
			return getRuleContexts(Pt_name_patContext.class);
		}
		public Pt_name_patContext pt_name_pat(int i) {
			return getRuleContext(Pt_name_patContext.class,i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(glParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(glParser.StringLiteral, i);
		}
		public List<TerminalNode> SetVariable() { return getTokens(glParser.SetVariable); }
		public TerminalNode SetVariable(int i) {
			return getToken(glParser.SetVariable, i);
		}
		public List<TerminalNode> StatusWord() { return getTokens(glParser.StatusWord); }
		public TerminalNode StatusWord(int i) {
			return getToken(glParser.StatusWord, i);
		}
		public List<TerminalNode> Color() { return getTokens(glParser.Color); }
		public TerminalNode Color(int i) {
			return getToken(glParser.Color, i);
		}
		public CmdMACROContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdMACRO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdMACRO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdMACRO(this);
		}
	}

	public final CmdMACROContext cmdMACRO() throws RecognitionException {
		CmdMACROContext _localctx = new CmdMACROContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_cmdMACRO);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(C_MACRO);
			setState(1145);
			((CmdMACROContext)_localctx).macro_num = literal_numbers();

													_MacroFileNames.add("macro"+(((CmdMACROContext)_localctx).macro_num!=null?_input.getText(((CmdMACROContext)_localctx).macro_num.start,((CmdMACROContext)_localctx).macro_num.stop):null));
													_MacroNumber.add((((CmdMACROContext)_localctx).macro_num!=null?_input.getText(((CmdMACROContext)_localctx).macro_num.start,((CmdMACROContext)_localctx).macro_num.stop):null));
													_MacroSection.add(section);
												
			setState(1147);
			((CmdMACROContext)_localctx).x = literal_numbers();
			setState(1148);
			((CmdMACROContext)_localctx).y = literal_numbers();
			setState(1149);
			((CmdMACROContext)_localctx).w_scale = literal_numbers();
			setState(1150);
			((CmdMACROContext)_localctx).h_scale = literal_numbers();
			setState(1151);
			((CmdMACROContext)_localctx).n_D = match(IntegerLiteral);
			 ((CmdMACROContext)_localctx).i_D =  (((CmdMACROContext)_localctx).n_D!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_D.getText()):0);       
			setState(1153);
			((CmdMACROContext)_localctx).n_T_other = match(IntegerLiteral);
			 ((CmdMACROContext)_localctx).i_T_other =  (((CmdMACROContext)_localctx).n_T_other!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_T_other.getText()):0); 
			setState(1155);
			((CmdMACROContext)_localctx).n_T_bg = match(IntegerLiteral);
			 ((CmdMACROContext)_localctx).i_T_bg =  (((CmdMACROContext)_localctx).n_T_bg!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_T_bg.getText()):0);    
			setState(1157);
			((CmdMACROContext)_localctx).n_SET = match(IntegerLiteral);
			 ((CmdMACROContext)_localctx).i_SET =  (((CmdMACROContext)_localctx).n_SET!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_SET.getText()):0);     
			setState(1159);
			((CmdMACROContext)_localctx).n_CONST = match(IntegerLiteral);
			 ((CmdMACROContext)_localctx).i_CONST =  (((CmdMACROContext)_localctx).n_CONST!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_CONST.getText()):0);   
			setState(1161);
			((CmdMACROContext)_localctx).n_STATUS = match(IntegerLiteral);
			 ((CmdMACROContext)_localctx).i_STATUS =  (((CmdMACROContext)_localctx).n_STATUS!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_STATUS.getText()):0);  
			 ((CmdMACROContext)_localctx).i =  1; 
			setState(1170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1164);
					if (!( _localctx.i <= _localctx.i_D )) throw new FailedPredicateException(this, " $i <= $i_D ");
					setState(1165);
					((CmdMACROContext)_localctx).s1 = pt_name_pat();
					 _localctx.sb_D.append((((CmdMACROContext)_localctx).s1!=null?_input.getText(((CmdMACROContext)_localctx).s1.start,((CmdMACROContext)_localctx).s1.stop):null)); if (_localctx.i < _localctx.i_D) _localctx.sb_D.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			 ((CmdMACROContext)_localctx).i =  1; 
			setState(1179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1174);
					if (!( _localctx.i <= _localctx.i_T_other )) throw new FailedPredicateException(this, " $i <= $i_T_other ");
					setState(1175);
					((CmdMACROContext)_localctx).s2 = match(StringLiteral);
					 _localctx.sb_T_other.append((((CmdMACROContext)_localctx).s2!=null?((CmdMACROContext)_localctx).s2.getText():null)); if (_localctx.i < _localctx.i_T_other) _localctx.sb_T_other.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			 ((CmdMACROContext)_localctx).i =  1; 
			setState(1188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1183);
					if (!( _localctx.i <= _localctx.i_T_bg )) throw new FailedPredicateException(this, " $i <= $i_T_bg ");
					setState(1184);
					((CmdMACROContext)_localctx).s3 = match(StringLiteral);
					 _localctx.sb_T_bg.append((((CmdMACROContext)_localctx).s3!=null?((CmdMACROContext)_localctx).s3.getText():null)); if (_localctx.i < _localctx.i_T_bg) _localctx.sb_T_bg.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			 ((CmdMACROContext)_localctx).i =  1; 
			setState(1197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1192);
					if (!( _localctx.i <= _localctx.i_SET )) throw new FailedPredicateException(this, " $i <= $i_SET ");
					setState(1193);
					((CmdMACROContext)_localctx).s4 = match(SetVariable);
					 _localctx.sb_SET.append((((CmdMACROContext)_localctx).s4!=null?((CmdMACROContext)_localctx).s4.getText():null)); if (_localctx.i < _localctx.i_SET) _localctx.sb_SET.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			 ((CmdMACROContext)_localctx).i =  1; 
			setState(1207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1201);
					if (!( _localctx.i <= _localctx.i_CONST )) throw new FailedPredicateException(this, " $i <= $i_CONST ");
					setState(1202);
					((CmdMACROContext)_localctx).s5 = literal_numbers();
					 _localctx.sb_CONST.append((((CmdMACROContext)_localctx).s5!=null?_input.getText(((CmdMACROContext)_localctx).s5.start,((CmdMACROContext)_localctx).s5.stop):null)); if (_localctx.i < _localctx.i_CONST) _localctx.sb_CONST.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			 ((CmdMACROContext)_localctx).i =  1; 
			setState(1216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1211);
					if (!( _localctx.i <= (((CmdMACROContext)_localctx).n_STATUS!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_STATUS.getText()):0) )) throw new FailedPredicateException(this, " $i <= $n_STATUS.int ");
					setState(1212);
					((CmdMACROContext)_localctx).s6 = match(StatusWord);
					 _localctx.sb_STATUS.append((((CmdMACROContext)_localctx).s6!=null?((CmdMACROContext)_localctx).s6.getText():null)); if (_localctx.i < (((CmdMACROContext)_localctx).n_STATUS!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_STATUS.getText()):0)) _localctx.sb_STATUS.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1219);
				((CmdMACROContext)_localctx).n_COLOR = match(IntegerLiteral);
				 ((CmdMACROContext)_localctx).i_COLOR =  (((CmdMACROContext)_localctx).n_COLOR!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_COLOR.getText()):0);   
				 ((CmdMACROContext)_localctx).i =  1; 
				setState(1227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1222);
						if (!( _localctx.i <= _localctx.i_COLOR )) throw new FailedPredicateException(this, " $i <= $i_COLOR ");
						setState(1223);
						((CmdMACROContext)_localctx).s7 = match(Color);
						 _localctx.sb_COLOR.append((((CmdMACROContext)_localctx).s7!=null?((CmdMACROContext)_localctx).s7.getText():null)); if (_localctx.i < _localctx.i_COLOR) _localctx.sb_COLOR.append("\t"); _localctx.i++; 
						}
						} 
					}
					setState(1229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
				break;
			}
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IntegerLiteral) {
				{
				setState(1232);
				((CmdMACROContext)_localctx).n_OLCOLOR = match(IntegerLiteral);
				 ((CmdMACROContext)_localctx).i_OLCOLOR =  (((CmdMACROContext)_localctx).n_OLCOLOR!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_OLCOLOR.getText()):0); 
				 ((CmdMACROContext)_localctx).i =  1; 
				setState(1241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1235);
						if (!( _localctx.i <= _localctx.i_OLCOLOR )) throw new FailedPredicateException(this, " $i <= $i_OLCOLOR ");
						setState(1236);
						((CmdMACROContext)_localctx).s8 = literal_numbers();
						 _localctx.sb_OLCOLOR.append((((CmdMACROContext)_localctx).s8!=null?_input.getText(((CmdMACROContext)_localctx).s8.start,((CmdMACROContext)_localctx).s8.stop):null)); if (_localctx.i < _localctx.i_OLCOLOR) _localctx.sb_OLCOLOR.append("\t"); _localctx.i++; 
						}
						} 
					}
					setState(1243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				}
			}

			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "MACRO") + "Gmacro("
					+(((CmdMACROContext)_localctx).macro_num!=null?_input.getText(((CmdMACROContext)_localctx).macro_num.start,((CmdMACROContext)_localctx).macro_num.stop):null)
					+","+(((CmdMACROContext)_localctx).x!=null?_input.getText(((CmdMACROContext)_localctx).x.start,((CmdMACROContext)_localctx).x.stop):null)
					+","+(((CmdMACROContext)_localctx).y!=null?_input.getText(((CmdMACROContext)_localctx).y.start,((CmdMACROContext)_localctx).y.stop):null)
					+","+(((CmdMACROContext)_localctx).w_scale!=null?_input.getText(((CmdMACROContext)_localctx).w_scale.start,((CmdMACROContext)_localctx).w_scale.stop):null)
					+","+(((CmdMACROContext)_localctx).h_scale!=null?_input.getText(((CmdMACROContext)_localctx).h_scale.start,((CmdMACROContext)_localctx).h_scale.stop):null)
					+",["+_localctx.sb_D.toString().replace("\t", ", ")      +"]"
					+",["+_localctx.sb_T_other.toString().replace("\t", ", ")+"]"
					+",["+_localctx.sb_T_bg.toString().replace("\t", ", ")   +"]"
					+",["+_localctx.sb_SET.toString().replace("\t", ", ")    +"]"
					+",["+_localctx.sb_CONST.toString().replace("\t", ", ")  +"]"
					+",["+_localctx.sb_STATUS.toString().replace("\t", ", ") +"]"
					+",["+_localctx.sb_COLOR.toString().replace("\t", ", ") +"]"
					+",["+_localctx.sb_OLCOLOR.toString().replace("\t", ", ") +"]"
					+");");

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDEF_MACRO_PARAMSContext extends ParserRuleContext {
		public int i = 1;
		public int i_D = 0;
		public StringBuilder sb_D = new StringBuilder();
		public int i_T_other = 0;
		public StringBuilder sb_T_other = new StringBuilder();
		public int i_T_bg = 0;
		public StringBuilder sb_T_bg = new StringBuilder();
		public int i_SET = 0;
		public StringBuilder sb_SET = new StringBuilder();
		public int i_CONST = 0;
		public StringBuilder sb_CONST = new StringBuilder();
		public int i_STATUS = 0;
		public StringBuilder sb_STATUS = new StringBuilder();
		public int i_COLOR = 0;
		public StringBuilder sb_COLOR = new StringBuilder();
		public int i_OLCOLOR = 0;
		public StringBuilder sb_OLCOLOR = new StringBuilder();
		public Token n_D;
		public Token s;
		public Token n_T_other;
		public Token n_T_bg;
		public Token n_SET;
		public Token n_CONST;
		public Token n_STATUS;
		public Token n_COLOR;
		public Token n_OLCOLOR;
		public TerminalNode C_DEF_MACRO_PARAMS() { return getToken(glParser.C_DEF_MACRO_PARAMS, 0); }
		public List<TerminalNode> IntegerLiteral() { return getTokens(glParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(glParser.IntegerLiteral, i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(glParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(glParser.StringLiteral, i);
		}
		public CmdDEF_MACRO_PARAMSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDEF_MACRO_PARAMS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDEF_MACRO_PARAMS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDEF_MACRO_PARAMS(this);
		}
	}

	public final CmdDEF_MACRO_PARAMSContext cmdDEF_MACRO_PARAMS() throws RecognitionException {
		CmdDEF_MACRO_PARAMSContext _localctx = new CmdDEF_MACRO_PARAMSContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_cmdDEF_MACRO_PARAMS);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(C_DEF_MACRO_PARAMS);
			setState(1247);
			((CmdDEF_MACRO_PARAMSContext)_localctx).n_D = match(IntegerLiteral);
			 ((CmdDEF_MACRO_PARAMSContext)_localctx).i_D =  (((CmdDEF_MACRO_PARAMSContext)_localctx).n_D!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_D.getText()):0);       ((CmdDEF_MACRO_PARAMSContext)_localctx).i =  1; 
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1249);
					if (!( _localctx.i <= _localctx.i_D )) throw new FailedPredicateException(this, " $i <= $i_D ");
					setState(1250);
					((CmdDEF_MACRO_PARAMSContext)_localctx).s = match(StringLiteral);
					 _localctx.sb_D.append((((CmdDEF_MACRO_PARAMSContext)_localctx).s!=null?((CmdDEF_MACRO_PARAMSContext)_localctx).s.getText():null)); if (_localctx.i < _localctx.i_D) _localctx.sb_D.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(1257);
			((CmdDEF_MACRO_PARAMSContext)_localctx).n_T_other = match(IntegerLiteral);
			 ((CmdDEF_MACRO_PARAMSContext)_localctx).i_T_other =  (((CmdDEF_MACRO_PARAMSContext)_localctx).n_T_other!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_T_other.getText()):0); ((CmdDEF_MACRO_PARAMSContext)_localctx).i =  1; 
			setState(1264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1259);
					if (!( _localctx.i <= _localctx.i_T_other )) throw new FailedPredicateException(this, " $i <= $i_T_other ");
					setState(1260);
					((CmdDEF_MACRO_PARAMSContext)_localctx).s = match(StringLiteral);
					 _localctx.sb_T_other.append((((CmdDEF_MACRO_PARAMSContext)_localctx).s!=null?((CmdDEF_MACRO_PARAMSContext)_localctx).s.getText():null)); if (_localctx.i < _localctx.i_T_other) _localctx.sb_T_other.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(1267);
			((CmdDEF_MACRO_PARAMSContext)_localctx).n_T_bg = match(IntegerLiteral);
			 ((CmdDEF_MACRO_PARAMSContext)_localctx).i_T_bg =  (((CmdDEF_MACRO_PARAMSContext)_localctx).n_T_bg!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_T_bg.getText()):0);    ((CmdDEF_MACRO_PARAMSContext)_localctx).i =  1; 
			setState(1274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1269);
					if (!( _localctx.i <= _localctx.i_T_bg )) throw new FailedPredicateException(this, " $i <= $i_T_bg ");
					setState(1270);
					((CmdDEF_MACRO_PARAMSContext)_localctx).s = match(StringLiteral);
					 _localctx.sb_T_bg.append((((CmdDEF_MACRO_PARAMSContext)_localctx).s!=null?((CmdDEF_MACRO_PARAMSContext)_localctx).s.getText():null)); if (_localctx.i < _localctx.i_T_bg) _localctx.sb_T_bg.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(1277);
			((CmdDEF_MACRO_PARAMSContext)_localctx).n_SET = match(IntegerLiteral);
			 ((CmdDEF_MACRO_PARAMSContext)_localctx).i_SET =  (((CmdDEF_MACRO_PARAMSContext)_localctx).n_SET!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_SET.getText()):0);     ((CmdDEF_MACRO_PARAMSContext)_localctx).i =  1; 
			setState(1284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1279);
					if (!( _localctx.i <= _localctx.i_SET )) throw new FailedPredicateException(this, " $i <= $i_SET ");
					setState(1280);
					((CmdDEF_MACRO_PARAMSContext)_localctx).s = match(StringLiteral);
					 _localctx.sb_SET.append((((CmdDEF_MACRO_PARAMSContext)_localctx).s!=null?((CmdDEF_MACRO_PARAMSContext)_localctx).s.getText():null)); if (_localctx.i < _localctx.i_SET) _localctx.sb_SET.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(1287);
			((CmdDEF_MACRO_PARAMSContext)_localctx).n_CONST = match(IntegerLiteral);
			 ((CmdDEF_MACRO_PARAMSContext)_localctx).i_CONST =  (((CmdDEF_MACRO_PARAMSContext)_localctx).n_CONST!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_CONST.getText()):0);   ((CmdDEF_MACRO_PARAMSContext)_localctx).i =  1; 
			setState(1294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1289);
					if (!( _localctx.i <= _localctx.i_CONST )) throw new FailedPredicateException(this, " $i <= $i_CONST ");
					setState(1290);
					((CmdDEF_MACRO_PARAMSContext)_localctx).s = match(StringLiteral);
					 _localctx.sb_CONST.append((((CmdDEF_MACRO_PARAMSContext)_localctx).s!=null?((CmdDEF_MACRO_PARAMSContext)_localctx).s.getText():null)); if (_localctx.i < _localctx.i_CONST) _localctx.sb_CONST.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(1297);
			((CmdDEF_MACRO_PARAMSContext)_localctx).n_STATUS = match(IntegerLiteral);
			 ((CmdDEF_MACRO_PARAMSContext)_localctx).i_STATUS =  (((CmdDEF_MACRO_PARAMSContext)_localctx).n_STATUS!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_STATUS.getText()):0);  ((CmdDEF_MACRO_PARAMSContext)_localctx).i =  1; 
			setState(1304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1299);
					if (!( _localctx.i <= (((CmdDEF_MACRO_PARAMSContext)_localctx).n_STATUS!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_STATUS.getText()):0) )) throw new FailedPredicateException(this, " $i <= $n_STATUS.int ");
					setState(1300);
					((CmdDEF_MACRO_PARAMSContext)_localctx).s = match(StringLiteral);
					 _localctx.sb_STATUS.append((((CmdDEF_MACRO_PARAMSContext)_localctx).s!=null?((CmdDEF_MACRO_PARAMSContext)_localctx).s.getText():null)); if (_localctx.i < (((CmdDEF_MACRO_PARAMSContext)_localctx).n_STATUS!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_STATUS.getText()):0)) _localctx.sb_STATUS.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(1307);
			((CmdDEF_MACRO_PARAMSContext)_localctx).n_COLOR = match(IntegerLiteral);
			 ((CmdDEF_MACRO_PARAMSContext)_localctx).i_COLOR =  (((CmdDEF_MACRO_PARAMSContext)_localctx).n_COLOR!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_COLOR.getText()):0);   ((CmdDEF_MACRO_PARAMSContext)_localctx).i =  1; 
			setState(1314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1309);
					if (!( _localctx.i <= _localctx.i_COLOR )) throw new FailedPredicateException(this, " $i <= $i_COLOR ");
					setState(1310);
					((CmdDEF_MACRO_PARAMSContext)_localctx).s = match(StringLiteral);
					 _localctx.sb_COLOR.append((((CmdDEF_MACRO_PARAMSContext)_localctx).s!=null?((CmdDEF_MACRO_PARAMSContext)_localctx).s.getText():null)); if (_localctx.i < _localctx.i_COLOR) _localctx.sb_COLOR.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(1317);
			((CmdDEF_MACRO_PARAMSContext)_localctx).n_OLCOLOR = match(IntegerLiteral);
			 ((CmdDEF_MACRO_PARAMSContext)_localctx).i_OLCOLOR =  (((CmdDEF_MACRO_PARAMSContext)_localctx).n_OLCOLOR!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_OLCOLOR.getText()):0); ((CmdDEF_MACRO_PARAMSContext)_localctx).i =  1; 
			setState(1324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1319);
					if (!( _localctx.i <= _localctx.i_OLCOLOR )) throw new FailedPredicateException(this, " $i <= $i_OLCOLOR ");
					setState(1320);
					((CmdDEF_MACRO_PARAMSContext)_localctx).s = match(StringLiteral);
					 _localctx.sb_OLCOLOR.append((((CmdDEF_MACRO_PARAMSContext)_localctx).s!=null?((CmdDEF_MACRO_PARAMSContext)_localctx).s.getText():null)); if (_localctx.i < _localctx.i_OLCOLOR) _localctx.sb_OLCOLOR.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "DEF_MACRO_PARAMS") + "Gdef_macro_params("
					+ "["+_localctx.sb_D.toString().replace(      "\t", ", ")+"]"
					+",["+_localctx.sb_T_other.toString().replace("\t", ", ")+"]"
					+",["+_localctx.sb_T_bg.toString().replace(   "\t", ", ")+"]"
					+",["+_localctx.sb_SET.toString().replace(    "\t", ", ")+"]"
					+",["+_localctx.sb_CONST.toString().replace(  "\t", ", ")+"]"
					+",["+_localctx.sb_STATUS.toString().replace( "\t", ", ")+"]"
					+",["+_localctx.sb_COLOR.toString().replace(  "\t", ", ")+"]"
					+",["+_localctx.sb_OLCOLOR.toString().replace("\t", ", ")+"]"
					+");");

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDEF_MACROContext extends ParserRuleContext {
		public int i_D = 0;
		public StringBuilder sb_D = new StringBuilder();
		public int i_T_other = 0;
		public StringBuilder sb_T_other = new StringBuilder();
		public int i_T_bg = 0;
		public StringBuilder sb_T_bg = new StringBuilder();
		public int i_SET = 0;
		public StringBuilder sb_SET = new StringBuilder();
		public int i_CONST = 0;
		public StringBuilder sb_CONST = new StringBuilder();
		public int i_STATUS = 0;
		public StringBuilder sb_STATUS = new StringBuilder();
		public int i_COLOR = 0;
		public StringBuilder sb_COLOR = new StringBuilder();
		public int i_OLCOLOR = 0;
		public StringBuilder sb_OLCOLOR = new StringBuilder();
		public Literal_numbersContext macro_num;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w_scale;
		public Literal_numbersContext h_scale;
		public Token n_D;
		public Token n_T_other;
		public Token n_T_bg;
		public Token n_SET;
		public Token n_CONST;
		public Token n_STATUS;
		public Def_macro_d_listContext a1;
		public Def_macro_t_list_otherContext a2;
		public Def_macro_t_list_bgContext a3;
		public Def_macro_set_listContext a4;
		public Def_macro_const_listContext a5;
		public Def_macro_status_listContext a6;
		public Token n_COLOR;
		public Def_macro_color_listContext a7;
		public Token n_OLCOLOR;
		public Def_macro_olcolor_listContext a8;
		public TerminalNode C_DEF_MACRO() { return getToken(glParser.C_DEF_MACRO, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<TerminalNode> IntegerLiteral() { return getTokens(glParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(glParser.IntegerLiteral, i);
		}
		public Def_macro_d_listContext def_macro_d_list() {
			return getRuleContext(Def_macro_d_listContext.class,0);
		}
		public Def_macro_t_list_otherContext def_macro_t_list_other() {
			return getRuleContext(Def_macro_t_list_otherContext.class,0);
		}
		public Def_macro_t_list_bgContext def_macro_t_list_bg() {
			return getRuleContext(Def_macro_t_list_bgContext.class,0);
		}
		public Def_macro_set_listContext def_macro_set_list() {
			return getRuleContext(Def_macro_set_listContext.class,0);
		}
		public Def_macro_const_listContext def_macro_const_list() {
			return getRuleContext(Def_macro_const_listContext.class,0);
		}
		public Def_macro_status_listContext def_macro_status_list() {
			return getRuleContext(Def_macro_status_listContext.class,0);
		}
		public Def_macro_color_listContext def_macro_color_list() {
			return getRuleContext(Def_macro_color_listContext.class,0);
		}
		public Def_macro_olcolor_listContext def_macro_olcolor_list() {
			return getRuleContext(Def_macro_olcolor_listContext.class,0);
		}
		public CmdDEF_MACROContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDEF_MACRO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdDEF_MACRO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdDEF_MACRO(this);
		}
	}

	public final CmdDEF_MACROContext cmdDEF_MACRO() throws RecognitionException {
		CmdDEF_MACROContext _localctx = new CmdDEF_MACROContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_cmdDEF_MACRO);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			match(C_DEF_MACRO);
			setState(1328);
			((CmdDEF_MACROContext)_localctx).macro_num = literal_numbers();
			 macro_number  = Integer.parseInt((((CmdDEF_MACROContext)_localctx).macro_num!=null?_input.getText(((CmdDEF_MACROContext)_localctx).macro_num.start,((CmdDEF_MACROContext)_localctx).macro_num.stop):null)); 
			setState(1330);
			((CmdDEF_MACROContext)_localctx).x = literal_numbers();
			 macro_x       = Integer.parseInt((((CmdDEF_MACROContext)_localctx).x!=null?_input.getText(((CmdDEF_MACROContext)_localctx).x.start,((CmdDEF_MACROContext)_localctx).x.stop):null));         
			setState(1332);
			((CmdDEF_MACROContext)_localctx).y = literal_numbers();
			 macro_y       = Integer.parseInt((((CmdDEF_MACROContext)_localctx).y!=null?_input.getText(((CmdDEF_MACROContext)_localctx).y.start,((CmdDEF_MACROContext)_localctx).y.stop):null));         
			setState(1334);
			((CmdDEF_MACROContext)_localctx).w_scale = literal_numbers();
			 macro_w_scale = Double.parseDouble((((CmdDEF_MACROContext)_localctx).w_scale!=null?_input.getText(((CmdDEF_MACROContext)_localctx).w_scale.start,((CmdDEF_MACROContext)_localctx).w_scale.stop):null)); 
			setState(1336);
			((CmdDEF_MACROContext)_localctx).h_scale = literal_numbers();
			 macro_h_scale = Double.parseDouble((((CmdDEF_MACROContext)_localctx).h_scale!=null?_input.getText(((CmdDEF_MACROContext)_localctx).h_scale.start,((CmdDEF_MACROContext)_localctx).h_scale.stop):null)); 

												macroPort.def_macro(macro_x,
																	macro_y,
																	macro_w_scale,
																	macro_h_scale);
											
			setState(1339);
			((CmdDEF_MACROContext)_localctx).n_D = match(IntegerLiteral);
			 ((CmdDEF_MACROContext)_localctx).i_D =  (((CmdDEF_MACROContext)_localctx).n_D!=null?Integer.valueOf(((CmdDEF_MACROContext)_localctx).n_D.getText()):0);       
			setState(1341);
			((CmdDEF_MACROContext)_localctx).n_T_other = match(IntegerLiteral);
			 ((CmdDEF_MACROContext)_localctx).i_T_other =  (((CmdDEF_MACROContext)_localctx).n_T_other!=null?Integer.valueOf(((CmdDEF_MACROContext)_localctx).n_T_other.getText()):0); 
			setState(1343);
			((CmdDEF_MACROContext)_localctx).n_T_bg = match(IntegerLiteral);
			 ((CmdDEF_MACROContext)_localctx).i_T_bg =  (((CmdDEF_MACROContext)_localctx).n_T_bg!=null?Integer.valueOf(((CmdDEF_MACROContext)_localctx).n_T_bg.getText()):0);    
			setState(1345);
			((CmdDEF_MACROContext)_localctx).n_SET = match(IntegerLiteral);
			 ((CmdDEF_MACROContext)_localctx).i_SET =  (((CmdDEF_MACROContext)_localctx).n_SET!=null?Integer.valueOf(((CmdDEF_MACROContext)_localctx).n_SET.getText()):0);     
			setState(1347);
			((CmdDEF_MACROContext)_localctx).n_CONST = match(IntegerLiteral);
			 ((CmdDEF_MACROContext)_localctx).i_CONST =  (((CmdDEF_MACROContext)_localctx).n_CONST!=null?Integer.valueOf(((CmdDEF_MACROContext)_localctx).n_CONST.getText()):0);   
			setState(1349);
			((CmdDEF_MACROContext)_localctx).n_STATUS = match(IntegerLiteral);
			 ((CmdDEF_MACROContext)_localctx).i_STATUS =  (((CmdDEF_MACROContext)_localctx).n_STATUS!=null?Integer.valueOf(((CmdDEF_MACROContext)_localctx).n_STATUS.getText()):0);  
			setState(1351);
			((CmdDEF_MACROContext)_localctx).a1 = def_macro_d_list();
			 ((CmdDEF_MACROContext)_localctx).sb_D =  ((CmdDEF_MACROContext)_localctx).a1.array; 
			setState(1353);
			((CmdDEF_MACROContext)_localctx).a2 = def_macro_t_list_other();
			 ((CmdDEF_MACROContext)_localctx).sb_T_other =  ((CmdDEF_MACROContext)_localctx).a2.array; 
			setState(1355);
			((CmdDEF_MACROContext)_localctx).a3 = def_macro_t_list_bg();
			 ((CmdDEF_MACROContext)_localctx).sb_T_bg =  ((CmdDEF_MACROContext)_localctx).a3.array; 
			setState(1357);
			((CmdDEF_MACROContext)_localctx).a4 = def_macro_set_list();
			 ((CmdDEF_MACROContext)_localctx).sb_SET =  ((CmdDEF_MACROContext)_localctx).a4.array; 
			setState(1359);
			((CmdDEF_MACROContext)_localctx).a5 = def_macro_const_list();
			 ((CmdDEF_MACROContext)_localctx).sb_CONST =  ((CmdDEF_MACROContext)_localctx).a5.array; 
			setState(1361);
			((CmdDEF_MACROContext)_localctx).a6 = def_macro_status_list();
			 ((CmdDEF_MACROContext)_localctx).sb_STATUS =  ((CmdDEF_MACROContext)_localctx).a6.array; 
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(1363);
				((CmdDEF_MACROContext)_localctx).n_COLOR = match(IntegerLiteral);
				 ((CmdDEF_MACROContext)_localctx).i_COLOR =  (((CmdDEF_MACROContext)_localctx).n_COLOR!=null?Integer.valueOf(((CmdDEF_MACROContext)_localctx).n_COLOR.getText()):0);   
				setState(1365);
				((CmdDEF_MACROContext)_localctx).a7 = def_macro_color_list();
				 ((CmdDEF_MACROContext)_localctx).sb_COLOR =  ((CmdDEF_MACROContext)_localctx).a7.array;      
				}
				break;
			}
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IntegerLiteral) {
				{
				setState(1370);
				((CmdDEF_MACROContext)_localctx).n_OLCOLOR = match(IntegerLiteral);
				 ((CmdDEF_MACROContext)_localctx).i_OLCOLOR =  (((CmdDEF_MACROContext)_localctx).n_OLCOLOR!=null?Integer.valueOf(((CmdDEF_MACROContext)_localctx).n_OLCOLOR.getText()):0); 
				setState(1372);
				((CmdDEF_MACROContext)_localctx).a8 = def_macro_olcolor_list();
				 ((CmdDEF_MACROContext)_localctx).sb_OLCOLOR =  ((CmdDEF_MACROContext)_localctx).a8.array;      
				}
			}

			}
			_ctx.stop = _input.LT(-1);


			//	countMacro++;
			//	_call_macro = "Macro"+(((CmdDEF_MACROContext)_localctx).macro_num!=null?_input.getText(((CmdDEF_MACROContext)_localctx).macro_num.start,((CmdDEF_MACROContext)_localctx).macro_num.stop):null)+"_"+countMacro+"("+macro_x+","+macro_y+","+macro_w_scale+","+macro_h_scale;

			//	macro_flag = true;
				macroPort.set_m_flag(true);

				macro_args =   "["+_localctx.sb_D.toString().replace("\t", ", ")      +"]"
							 +",["+_localctx.sb_T_other.toString().replace("\t", ", ")+"]"
							 +",["+_localctx.sb_T_bg.toString().replace("\t", ", ")   +"]"
							 +",["+_localctx.sb_SET.toString().replace("\t", ", ")    +"]"
							 +",["+_localctx.sb_CONST.toString().replace("\t", ", ")  +"]"
							 +",["+_localctx.sb_STATUS.toString().replace("\t", ", ") +"]"

							 +",["+_localctx.sb_COLOR.toString().replace("\t", ", ")   +"]"
							 +",["+_localctx.sb_OLCOLOR.toString().replace("\t", ", ") +"]";

				// Список имен технологических параметров (без полей записи),
				// передаваемых макросу для замены параметров $D в макросе
				if (_localctx.i_D > 0) {
					String str_D       = _localctx.sb_D.toString().replace("\t", ", ");
					String _str = "$D=$H=[\"\","+str_D+"];";
			//		println(_str);
					sctnDIAGRAM.add(_str);    sctnDIAGRAM.add("\n");
					sctnKEYBOARD.add(_str);   sctnKEYBOARD.add("\n");
					sctnBACKGROUND.add(_str); sctnBACKGROUND.add("\n");
					sctnFOREGROUND.add(_str); sctnFOREGROUND.add("\n");
			//		sctnTRIGGER.add(_str);    sctnTRIGGER.add("\n");
			//		sctnSHAPELIB.add(_str);   sctnSHAPELIB.add("\n");
			//		sctnCALL_MACRO.add(_str); sctnCALL_MACRO.add("\n");
				}

				// Список текстовых строк для передачи макросу для замены
				// параметров $T в разделах макроса для переднего плана,
				// триггерных функций и/или клавиатуры
				if (_localctx.i_T_other > 0) {
					String str_T_other = _localctx.sb_T_other.toString().replace("\t", ", ");
					String _str = "$T=[\"\","+str_T_other+"];";
			//		println(_str);
					sctnDIAGRAM.add(_str);    sctnDIAGRAM.add("\n");
					sctnKEYBOARD.add(_str);   sctnKEYBOARD.add("\n");
					sctnBACKGROUND.add(_str); sctnBACKGROUND.add("\n");
					sctnFOREGROUND.add(_str); sctnFOREGROUND.add("\n");
			//		sctnTRIGGER.add(_str);    sctnTRIGGER.add("\n");
			//		sctnSHAPELIB.add(_str);   sctnSHAPELIB.add("\n");
			//		sctnCALL_MACRO.add(_str); sctnCALL_MACRO.add("\n");
				}

				// Список текстовых строк для передачи макросу для замены
				// параметров $T в разделе макроса для фона
				if (_localctx.i_T_bg > 0) {
					String str_T_bg    = _localctx.sb_T_bg.toString().replace("\t", ", ");
					String _str = "$T=[\"\","+str_T_bg+"];";
			//		println(_str);
					sctnDIAGRAM.add(_str);    sctnDIAGRAM.add("\n");
					sctnKEYBOARD.add(_str);   sctnKEYBOARD.add("\n");
					sctnBACKGROUND.add(_str); sctnBACKGROUND.add("\n");
					sctnFOREGROUND.add(_str); sctnFOREGROUND.add("\n");
			//		sctnTRIGGER.add(_str);    sctnTRIGGER.add("\n");
			//		sctnSHAPELIB.add(_str);   sctnSHAPELIB.add("\n");
			//		sctnCALL_MACRO.add(_str); sctnCALL_MACRO.add("\n");
				}

				// Список установочных номеров для передачи макросу для замены
				// параметров $SET в макросе
				if (_localctx.i_SET > 0) {
					String str_SET     = _localctx.sb_SET.toString().replace("\t", ", ");
					String _str = "$SET=[\"\","+str_SET+"];";
			//		println(_str);
					sctnDIAGRAM.add(_str);    sctnDIAGRAM.add("\n");
					sctnKEYBOARD.add(_str);   sctnKEYBOARD.add("\n");
					sctnBACKGROUND.add(_str); sctnBACKGROUND.add("\n");
					sctnFOREGROUND.add(_str); sctnFOREGROUND.add("\n");
			//		sctnTRIGGER.add(_str);    sctnTRIGGER.add("\n");
			//		sctnSHAPELIB.add(_str);   sctnSHAPELIB.add("\n");
			//		sctnCALL_MACRO.add(_str); sctnCALL_MACRO.add("\n");
				}

				// Список вещественных/целых чисел для передачи макросу для
				// замены параметров $CONST в макросе
				if (_localctx.i_CONST > 0) {
					String str_CONST   = _localctx.sb_CONST.toString().replace("\t", ", ");
					String _str = "$CONST=[\"\","+str_CONST+"];";
			//		println(_str);
					sctnDIAGRAM.add(_str);    sctnDIAGRAM.add("\n");
					sctnKEYBOARD.add(_str);   sctnKEYBOARD.add("\n");
					sctnBACKGROUND.add(_str); sctnBACKGROUND.add("\n");
					sctnFOREGROUND.add(_str); sctnFOREGROUND.add("\n");
			//		sctnTRIGGER.add(_str);    sctnTRIGGER.add("\n");
			//		sctnSHAPELIB.add(_str);   sctnSHAPELIB.add("\n");
			//		sctnCALL_MACRO.add(_str); sctnCALL_MACRO.add("\n");
				}

				// Список слов состояния для передачи макросу для замены
				// параметров $STATUS в макросе
				if (_localctx.i_STATUS > 0) {
					String str_STATUS  = _localctx.sb_STATUS.toString().replace("\t", ", ");
					String _str = "$STATUS=[\"\","+str_STATUS+"];";
			//		println(_str);
					sctnDIAGRAM.add(_str);    sctnDIAGRAM.add("\n");
					sctnKEYBOARD.add(_str);   sctnKEYBOARD.add("\n");
					sctnBACKGROUND.add(_str); sctnBACKGROUND.add("\n");
					sctnFOREGROUND.add(_str); sctnFOREGROUND.add("\n");
			//		sctnTRIGGER.add(_str);    sctnTRIGGER.add("\n");
			//		sctnSHAPELIB.add(_str);   sctnSHAPELIB.add("\n");
			//		sctnCALL_MACRO.add(_str); sctnCALL_MACRO.add("\n");
				}

				// Список длиной до 100 значений цвета, подставляемых вместо $COLOR,
				// появляющихся в графическом файле макросов. Значениями цвета,
				// передаваемыми макросу, являются имена цвета (красный, зеленый, синий и т.д.).
				// Первое значение цвета замещает все $COLOR1, содержащиеся в файле
				// макроса, второе значение цвета замещает все $COLOR2 и т.д. Количество
				// значений цвета, которые необходимо передать макросу, равняется
				// максимальному значению индекса $COLOR в файле макросов. То есть, если в
				// файле макросов используются индексы $COLOR1 и $COLOR10, то 10 является
				// максимальным значением индекса $COLOR, поэтому требуется передача 10
				// значений цвета в файл макросов.
				if (_localctx.i_COLOR > 0) {
					String str_COLOR  = _localctx.sb_COLOR.toString().replace("\t", ", ");
					String _str = "$COLOR=[\"\","+str_COLOR+"];";
			//		println(_str);
					sctnDIAGRAM.add(_str);    sctnDIAGRAM.add("\n");
					sctnKEYBOARD.add(_str);   sctnKEYBOARD.add("\n");
					sctnBACKGROUND.add(_str); sctnBACKGROUND.add("\n");
					sctnFOREGROUND.add(_str); sctnFOREGROUND.add("\n");
			//		sctnTRIGGER.add(_str);    sctnTRIGGER.add("\n");
			//		sctnSHAPELIB.add(_str);   sctnSHAPELIB.add("\n");
			//		sctnCALL_MACRO.add(_str); sctnCALL_MACRO.add("\n");
				}

				// Список длиной до 100 значений OL-цвета, подставляемых вместо появлений
				// $OL_COLOR в графическом файле макросов. OL-цвета, передаваемые в макрос,
				// определяются в качестве индексов OL-цвета. Первое значение цвета,
				// передаваемое в макрос, замещает все $OL_COLOR1, содержащиеся в файле
				// макроса, второе значение цвета, передаваемое в макрос, замещает все
				// $OL_COLOR2 в файле и т.д. Количество значений OL-цвета, которые необходимо
				// передать макросу, равняется максимальному значению индекса $OL_COLOR в
				// файле макросов.
				if (_localctx.i_OLCOLOR > 0) {
					String str_OLCOLOR  = _localctx.sb_OLCOLOR.toString().replace("\t", ", ");
			//		String _str = "$OLCOLOR=[\"\","+str_OLCOLOR+"];";
					String _str = "$OLCOLOR=[0,"+str_OLCOLOR+"];";
			//		println(_str);
					sctnDIAGRAM.add(_str);    sctnDIAGRAM.add("\n");
					sctnKEYBOARD.add(_str);   sctnKEYBOARD.add("\n");
					sctnBACKGROUND.add(_str); sctnBACKGROUND.add("\n");
					sctnFOREGROUND.add(_str); sctnFOREGROUND.add("\n");
			//		sctnTRIGGER.add(_str);    sctnTRIGGER.add("\n");
			//		sctnSHAPELIB.add(_str);   sctnSHAPELIB.add("\n");
			//		sctnCALL_MACRO.add(_str); sctnCALL_MACRO.add("\n");
				}


		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_macro_d_listContext extends ParserRuleContext {
		public StringBuilder array;
		public int i = 1;
		public StringBuilder cmd = new StringBuilder();
		public Pt_name_patContext s;
		public List<Pt_name_patContext> pt_name_pat() {
			return getRuleContexts(Pt_name_patContext.class);
		}
		public Pt_name_patContext pt_name_pat(int i) {
			return getRuleContext(Pt_name_patContext.class,i);
		}
		public Def_macro_d_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_macro_d_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterDef_macro_d_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitDef_macro_d_list(this);
		}
	}

	public final Def_macro_d_listContext def_macro_d_list() throws RecognitionException {
		Def_macro_d_listContext _localctx = new Def_macro_d_listContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_def_macro_d_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1377);
					if (!( _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_D )) throw new FailedPredicateException(this, " $i<=$cmdDEF_MACRO::i_D ");
					setState(1378);
					((Def_macro_d_listContext)_localctx).s = pt_name_pat();
					 _localctx.cmd.append((((Def_macro_d_listContext)_localctx).s!=null?_input.getText(((Def_macro_d_listContext)_localctx).s.start,((Def_macro_d_listContext)_localctx).s.stop):null)); if (_localctx.i<((CmdDEF_MACROContext)getInvokingContext(73)).i_D) _localctx.cmd.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			 ((Def_macro_d_listContext)_localctx).array =  _localctx.cmd; 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_macro_t_list_otherContext extends ParserRuleContext {
		public StringBuilder array;
		public int i = 1;
		public StringBuilder cmd = new StringBuilder();
		public Token s;
		public List<TerminalNode> StringLiteral() { return getTokens(glParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(glParser.StringLiteral, i);
		}
		public Def_macro_t_list_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_macro_t_list_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterDef_macro_t_list_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitDef_macro_t_list_other(this);
		}
	}

	public final Def_macro_t_list_otherContext def_macro_t_list_other() throws RecognitionException {
		Def_macro_t_list_otherContext _localctx = new Def_macro_t_list_otherContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_def_macro_t_list_other);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1386);
					if (!( _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_T_other )) throw new FailedPredicateException(this, " $i<=$cmdDEF_MACRO::i_T_other ");
					setState(1387);
					((Def_macro_t_list_otherContext)_localctx).s = match(StringLiteral);
					 _localctx.cmd.append((((Def_macro_t_list_otherContext)_localctx).s!=null?((Def_macro_t_list_otherContext)_localctx).s.getText():null)); if (_localctx.i<((CmdDEF_MACROContext)getInvokingContext(73)).i_T_other) _localctx.cmd.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			 ((Def_macro_t_list_otherContext)_localctx).array =  _localctx.cmd; 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_macro_t_list_bgContext extends ParserRuleContext {
		public StringBuilder array;
		public int i = 1;
		public StringBuilder cmd = new StringBuilder();
		public Token s;
		public List<TerminalNode> StringLiteral() { return getTokens(glParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(glParser.StringLiteral, i);
		}
		public Def_macro_t_list_bgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_macro_t_list_bg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterDef_macro_t_list_bg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitDef_macro_t_list_bg(this);
		}
	}

	public final Def_macro_t_list_bgContext def_macro_t_list_bg() throws RecognitionException {
		Def_macro_t_list_bgContext _localctx = new Def_macro_t_list_bgContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_def_macro_t_list_bg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1394);
					if (!( _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_T_bg )) throw new FailedPredicateException(this, " $i<=$cmdDEF_MACRO::i_T_bg ");
					setState(1395);
					((Def_macro_t_list_bgContext)_localctx).s = match(StringLiteral);
					 _localctx.cmd.append((((Def_macro_t_list_bgContext)_localctx).s!=null?((Def_macro_t_list_bgContext)_localctx).s.getText():null)); if (_localctx.i<((CmdDEF_MACROContext)getInvokingContext(73)).i_T_bg) _localctx.cmd.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			 ((Def_macro_t_list_bgContext)_localctx).array =  _localctx.cmd; 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_macro_set_listContext extends ParserRuleContext {
		public StringBuilder array;
		public int i = 1;
		public StringBuilder cmd = new StringBuilder();
		public Token s;
		public List<TerminalNode> SetVariable() { return getTokens(glParser.SetVariable); }
		public TerminalNode SetVariable(int i) {
			return getToken(glParser.SetVariable, i);
		}
		public Def_macro_set_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_macro_set_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterDef_macro_set_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitDef_macro_set_list(this);
		}
	}

	public final Def_macro_set_listContext def_macro_set_list() throws RecognitionException {
		Def_macro_set_listContext _localctx = new Def_macro_set_listContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_def_macro_set_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1402);
					if (!( _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_SET )) throw new FailedPredicateException(this, " $i<=$cmdDEF_MACRO::i_SET ");
					setState(1403);
					((Def_macro_set_listContext)_localctx).s = match(SetVariable);
					 _localctx.cmd.append((((Def_macro_set_listContext)_localctx).s!=null?((Def_macro_set_listContext)_localctx).s.getText():null)); if (_localctx.i<((CmdDEF_MACROContext)getInvokingContext(73)).i_SET) _localctx.cmd.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			 ((Def_macro_set_listContext)_localctx).array =  _localctx.cmd; 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_macro_const_listContext extends ParserRuleContext {
		public StringBuilder array;
		public int i = 1;
		public StringBuilder cmd = new StringBuilder();
		public Literal_numbersContext s;
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public Def_macro_const_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_macro_const_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterDef_macro_const_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitDef_macro_const_list(this);
		}
	}

	public final Def_macro_const_listContext def_macro_const_list() throws RecognitionException {
		Def_macro_const_listContext _localctx = new Def_macro_const_listContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_def_macro_const_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1410);
					if (!( _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_CONST )) throw new FailedPredicateException(this, " $i<=$cmdDEF_MACRO::i_CONST ");
					setState(1411);
					((Def_macro_const_listContext)_localctx).s = literal_numbers();
					 _localctx.cmd.append((((Def_macro_const_listContext)_localctx).s!=null?_input.getText(((Def_macro_const_listContext)_localctx).s.start,((Def_macro_const_listContext)_localctx).s.stop):null)); if (_localctx.i<((CmdDEF_MACROContext)getInvokingContext(73)).i_CONST) _localctx.cmd.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			 ((Def_macro_const_listContext)_localctx).array =  _localctx.cmd; 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_macro_status_listContext extends ParserRuleContext {
		public StringBuilder array;
		public int i = 1;
		public StringBuilder cmd = new StringBuilder();
		public Token s;
		public List<TerminalNode> StatusWord() { return getTokens(glParser.StatusWord); }
		public TerminalNode StatusWord(int i) {
			return getToken(glParser.StatusWord, i);
		}
		public Def_macro_status_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_macro_status_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterDef_macro_status_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitDef_macro_status_list(this);
		}
	}

	public final Def_macro_status_listContext def_macro_status_list() throws RecognitionException {
		Def_macro_status_listContext _localctx = new Def_macro_status_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_def_macro_status_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1419);
					if (!( _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_STATUS )) throw new FailedPredicateException(this, " $i<=$cmdDEF_MACRO::i_STATUS ");
					setState(1420);
					((Def_macro_status_listContext)_localctx).s = match(StatusWord);
					 _localctx.cmd.append("\""+(((Def_macro_status_listContext)_localctx).s!=null?((Def_macro_status_listContext)_localctx).s.getText():null)+"\""); if (_localctx.i<((CmdDEF_MACROContext)getInvokingContext(73)).i_STATUS) _localctx.cmd.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			 ((Def_macro_status_listContext)_localctx).array =  _localctx.cmd; 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_macro_color_listContext extends ParserRuleContext {
		public StringBuilder array;
		public int i = 1;
		public StringBuilder cmd = new StringBuilder();
		public Token s;
		public List<TerminalNode> Color() { return getTokens(glParser.Color); }
		public TerminalNode Color(int i) {
			return getToken(glParser.Color, i);
		}
		public Def_macro_color_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_macro_color_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterDef_macro_color_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitDef_macro_color_list(this);
		}
	}

	public final Def_macro_color_listContext def_macro_color_list() throws RecognitionException {
		Def_macro_color_listContext _localctx = new Def_macro_color_listContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_def_macro_color_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1427);
					if (!( _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_COLOR )) throw new FailedPredicateException(this, " $i<=$cmdDEF_MACRO::i_COLOR ");
					setState(1428);
					((Def_macro_color_listContext)_localctx).s = match(Color);
					 _localctx.cmd.append((((Def_macro_color_listContext)_localctx).s!=null?((Def_macro_color_listContext)_localctx).s.getText():null)); if (_localctx.i<((CmdDEF_MACROContext)getInvokingContext(73)).i_COLOR) _localctx.cmd.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			 ((Def_macro_color_listContext)_localctx).array =  _localctx.cmd; 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_macro_olcolor_listContext extends ParserRuleContext {
		public StringBuilder array;
		public int i = 1;
		public StringBuilder cmd = new StringBuilder();
		public Literal_numbersContext s;
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public Def_macro_olcolor_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_macro_olcolor_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterDef_macro_olcolor_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitDef_macro_olcolor_list(this);
		}
	}

	public final Def_macro_olcolor_listContext def_macro_olcolor_list() throws RecognitionException {
		Def_macro_olcolor_listContext _localctx = new Def_macro_olcolor_listContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_def_macro_olcolor_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1435);
					if (!( _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_OLCOLOR )) throw new FailedPredicateException(this, " $i<=$cmdDEF_MACRO::i_OLCOLOR ");
					setState(1436);
					((Def_macro_olcolor_listContext)_localctx).s = literal_numbers();
					 _localctx.cmd.append((((Def_macro_olcolor_listContext)_localctx).s!=null?_input.getText(((Def_macro_olcolor_listContext)_localctx).s.start,((Def_macro_olcolor_listContext)_localctx).s.stop):null)); if (_localctx.i<((CmdDEF_MACROContext)getInvokingContext(73)).i_OLCOLOR) _localctx.cmd.append("\t"); _localctx.i++; 
					}
					} 
				}
				setState(1443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			 ((Def_macro_olcolor_listContext)_localctx).array =  _localctx.cmd; 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSET_MACRO_BBContext extends ParserRuleContext {
		public Literal_numbersContext macro_num;
		public Literal_numbersContext xBB;
		public Literal_numbersContext yBB;
		public Literal_numbersContext wBB;
		public Literal_numbersContext hBB;
		public TerminalNode C_SET_MACRO_BB() { return getToken(glParser.C_SET_MACRO_BB, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public CmdSET_MACRO_BBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSET_MACRO_BB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdSET_MACRO_BB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdSET_MACRO_BB(this);
		}
	}

	public final CmdSET_MACRO_BBContext cmdSET_MACRO_BB() throws RecognitionException {
		CmdSET_MACRO_BBContext _localctx = new CmdSET_MACRO_BBContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_cmdSET_MACRO_BB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(C_SET_MACRO_BB);
			setState(1445);
			((CmdSET_MACRO_BBContext)_localctx).macro_num = literal_numbers();
			 macro_number = Integer.parseInt((((CmdSET_MACRO_BBContext)_localctx).macro_num!=null?_input.getText(((CmdSET_MACRO_BBContext)_localctx).macro_num.start,((CmdSET_MACRO_BBContext)_localctx).macro_num.stop):null)); 
			setState(1447);
			((CmdSET_MACRO_BBContext)_localctx).xBB = literal_numbers();
			 macro_BBx = Integer.parseInt((((CmdSET_MACRO_BBContext)_localctx).xBB!=null?_input.getText(((CmdSET_MACRO_BBContext)_localctx).xBB.start,((CmdSET_MACRO_BBContext)_localctx).xBB.stop):null)); 
			setState(1449);
			((CmdSET_MACRO_BBContext)_localctx).yBB = literal_numbers();
			 macro_BBy = Integer.parseInt((((CmdSET_MACRO_BBContext)_localctx).yBB!=null?_input.getText(((CmdSET_MACRO_BBContext)_localctx).yBB.start,((CmdSET_MACRO_BBContext)_localctx).yBB.stop):null)); 
			setState(1451);
			((CmdSET_MACRO_BBContext)_localctx).wBB = literal_numbers();
			 macro_BBw = Integer.parseInt((((CmdSET_MACRO_BBContext)_localctx).wBB!=null?_input.getText(((CmdSET_MACRO_BBContext)_localctx).wBB.start,((CmdSET_MACRO_BBContext)_localctx).wBB.stop):null)); 
			setState(1453);
			((CmdSET_MACRO_BBContext)_localctx).hBB = literal_numbers();
			 macro_BBh = Integer.parseInt((((CmdSET_MACRO_BBContext)_localctx).hBB!=null?_input.getText(((CmdSET_MACRO_BBContext)_localctx).hBB.start,((CmdSET_MACRO_BBContext)_localctx).hBB.stop):null)); 

												macroPort.set_macro_bb(	macro_BBx,
																		macro_BBy,
																		macro_BBw,
																		macro_BBh);
											
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEND_MACROContext extends ParserRuleContext {
		public TerminalNode C_END_MACRO() { return getToken(glParser.C_END_MACRO, 0); }
		public TerminalNode M_BACKGROUND() { return getToken(glParser.M_BACKGROUND, 0); }
		public TerminalNode M_DIAGRAM() { return getToken(glParser.M_DIAGRAM, 0); }
		public TerminalNode M_FOREGROUND() { return getToken(glParser.M_FOREGROUND, 0); }
		public TerminalNode M_KEYBOARD() { return getToken(glParser.M_KEYBOARD, 0); }
		public TerminalNode M_TRIGGER() { return getToken(glParser.M_TRIGGER, 0); }
		public CmdEND_MACROContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEND_MACRO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdEND_MACRO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdEND_MACRO(this);
		}
	}

	public final CmdEND_MACROContext cmdEND_MACRO() throws RecognitionException {
		CmdEND_MACROContext _localctx = new CmdEND_MACROContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_cmdEND_MACRO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			match(C_END_MACRO);

						section = Section.I_CALL_MACRO;

						println("Gmacro("  + macro_number
								+","       + (macro_x)
								+","       + (macro_y)
								+","       + (macro_w_scale * macro_BBw)
								+","       + (macro_h_scale * macro_BBh)
								+","       + macro_args
								+");");

						macro_number  = 0;

						macro_x       = 0;
						macro_y       = 0;
						macro_w_scale = 1;
						macro_h_scale = 1;
						macro_BBx     = 0;
						macro_BBy     = 0;
						macro_BBw     = 0;
						macro_BBh     = 0;

						macroPort.end_macro();
					
			setState(1469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case M_BACKGROUND:
				{
				setState(1459);
				match(M_BACKGROUND);
				section = Section.I_BACKGROUND;
				}
				break;
			case M_DIAGRAM:
				{
				setState(1461);
				match(M_DIAGRAM);
				section = Section.I_DIAGRAM;
				}
				break;
			case M_FOREGROUND:
				{
				setState(1463);
				match(M_FOREGROUND);
				section = Section.I_FOREGROUND;
				}
				break;
			case M_KEYBOARD:
				{
				setState(1465);
				match(M_KEYBOARD);
				section = Section.I_KEYBOARD;
				}
				break;
			case M_TRIGGER:
				{
				setState(1467);
				match(M_TRIGGER);
				section = Section.I_TRIGGER;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);

			//	macro_flag = false;
				macroPort.set_m_flag(false);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdMATHContext extends ParserRuleContext {
		public Token pointer;
		public Token offset;
		public Math_equationContext e;
		public TerminalNode C_MATH() { return getToken(glParser.C_MATH, 0); }
		public TerminalNode Ppointer() { return getToken(glParser.Ppointer, 0); }
		public Math_equationContext math_equation() {
			return getRuleContext(Math_equationContext.class,0);
		}
		public TerminalNode Boffset() { return getToken(glParser.Boffset, 0); }
		public TerminalNode Ioffset() { return getToken(glParser.Ioffset, 0); }
		public TerminalNode Roffset() { return getToken(glParser.Roffset, 0); }
		public TerminalNode Soffset() { return getToken(glParser.Soffset, 0); }
		public TerminalNode Spointer() { return getToken(glParser.Spointer, 0); }
		public TerminalNode Aoffset() { return getToken(glParser.Aoffset, 0); }
		public CmdMATHContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdMATH; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdMATH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdMATH(this);
		}
	}

	public final CmdMATHContext cmdMATH() throws RecognitionException {
		CmdMATHContext _localctx = new CmdMATHContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_cmdMATH);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			match(C_MATH);
			setState(1472);
			((CmdMATHContext)_localctx).pointer = match(Ppointer);
			setState(1473);
			((CmdMATHContext)_localctx).offset = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (Spointer - 172)) | (1L << (Ioffset - 172)) | (1L << (Roffset - 172)) | (1L << (Boffset - 172)) | (1L << (Soffset - 172)) | (1L << (Aoffset - 172)))) != 0)) ) {
				((CmdMATHContext)_localctx).offset = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

						EqtnClear();
					
			setState(1475);
			((CmdMATHContext)_localctx).e = math_equation(0);
			}
			_ctx.stop = _input.LT(-1);

				String pointer_name = (((CmdMATHContext)_localctx).pointer!=null?((CmdMATHContext)_localctx).pointer.getText():null).substring(0, 2);
				String pointer_index = (((CmdMATHContext)_localctx).pointer!=null?((CmdMATHContext)_localctx).pointer.getText():null).substring(3).replace("]", "");

				String offset_name = (((CmdMATHContext)_localctx).offset!=null?((CmdMATHContext)_localctx).offset.getText():null).substring(0, 2);
				String offset_index = (((CmdMATHContext)_localctx).offset!=null?((CmdMATHContext)_localctx).offset.getText():null).substring(3).replace("]", "");

				println(UseCommands.get_use_cmds(section, "MATH") +
					"set"+pointer_name+offset_name+"("+pointer_index+","+offset_index+","+((CmdMATHContext)_localctx).e.str+");"
				);

			//	println(" //MATH "+(((CmdMATHContext)_localctx).pointer!=null?((CmdMATHContext)_localctx).pointer.getText():null)+","+(((CmdMATHContext)_localctx).offset!=null?((CmdMATHContext)_localctx).offset.getText():null)+","+((CmdMATHContext)_localctx).e.str+");");

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_equationContext extends ParserRuleContext {
		public String str;
		public Math_primary_eqtnContext math_primary_eqtn() {
			return getRuleContext(Math_primary_eqtnContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(glParser.PLUS, 0); }
		public List<Math_equationContext> math_equation() {
			return getRuleContexts(Math_equationContext.class);
		}
		public Math_equationContext math_equation(int i) {
			return getRuleContext(Math_equationContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(glParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(glParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(glParser.DIV, 0); }
		public Math_equationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterMath_equation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitMath_equation(this);
		}
	}

	public final Math_equationContext math_equation() throws RecognitionException {
		return math_equation(0);
	}

	private Math_equationContext math_equation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_equationContext _localctx = new Math_equationContext(_ctx, _parentState);
		Math_equationContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_math_equation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(1478);
				math_primary_eqtn();
				}
				break;
			case 2:
				{
				setState(1479);
				match(PLUS);
				 EqtnAdd("+"); 
				setState(1481);
				math_equation(6);
				}
				break;
			case 3:
				{
				setState(1482);
				match(MINUS);
				 EqtnAdd("-"); 
				setState(1484);
				math_equation(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1503);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						_localctx = new Math_equationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_equation);
						setState(1487);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1488);
						match(STAR);
						 EqtnAdd("*"); 
						setState(1490);
						math_equation(5);
						}
						break;
					case 2:
						{
						_localctx = new Math_equationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_equation);
						setState(1491);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1492);
						match(DIV);
						 EqtnAdd("/"); 
						setState(1494);
						math_equation(4);
						}
						break;
					case 3:
						{
						_localctx = new Math_equationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_equation);
						setState(1495);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1496);
						match(PLUS);
						 EqtnAdd("+"); 
						setState(1498);
						math_equation(3);
						}
						break;
					case 4:
						{
						_localctx = new Math_equationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_equation);
						setState(1499);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1500);
						match(MINUS);
						 EqtnAdd("-"); 
						setState(1502);
						math_equation(2);
						}
						break;
					}
					} 
				}
				setState(1507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			 ((Math_equationContext)_localctx).str =  EqtnToStr(); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Math_primary_eqtnContext extends ParserRuleContext {
		public Literal_numbersContext literal_numbers;
		public Token ConstVariable;
		public Token ColorVariable;
		public Pt_name_patContext pt_name_pat;
		public Rec_fld_patContext rec_fld_pat;
		public Pointer_patContext pointer_pat;
		public Offset_patContext offset_pat;
		public TerminalNode LPAREN() { return getToken(glParser.LPAREN, 0); }
		public Math_equationContext math_equation() {
			return getRuleContext(Math_equationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(glParser.RPAREN, 0); }
		public TerminalNode EXP() { return getToken(glParser.EXP, 0); }
		public TerminalNode SQRT() { return getToken(glParser.SQRT, 0); }
		public TerminalNode LOG() { return getToken(glParser.LOG, 0); }
		public TerminalNode COS() { return getToken(glParser.COS, 0); }
		public TerminalNode SIN() { return getToken(glParser.SIN, 0); }
		public TerminalNode TAN() { return getToken(glParser.TAN, 0); }
		public TerminalNode ASIN() { return getToken(glParser.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(glParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(glParser.ATAN, 0); }
		public Literal_numbersContext literal_numbers() {
			return getRuleContext(Literal_numbersContext.class,0);
		}
		public TerminalNode ConstVariable() { return getToken(glParser.ConstVariable, 0); }
		public TerminalNode ColorVariable() { return getToken(glParser.ColorVariable, 0); }
		public Pt_name_patContext pt_name_pat() {
			return getRuleContext(Pt_name_patContext.class,0);
		}
		public Rec_fld_patContext rec_fld_pat() {
			return getRuleContext(Rec_fld_patContext.class,0);
		}
		public Pointer_patContext pointer_pat() {
			return getRuleContext(Pointer_patContext.class,0);
		}
		public Offset_patContext offset_pat() {
			return getRuleContext(Offset_patContext.class,0);
		}
		public Math_primary_eqtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_primary_eqtn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterMath_primary_eqtn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitMath_primary_eqtn(this);
		}
	}

	public final Math_primary_eqtnContext math_primary_eqtn() throws RecognitionException {
		Math_primary_eqtnContext _localctx = new Math_primary_eqtnContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_math_primary_eqtn);
		try {
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1508);
				match(LPAREN);
				 EqtnAdd("(");      
				setState(1510);
				math_equation(0);
				setState(1511);
				match(RPAREN);
				 EqtnAdd(")"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				match(EXP);
				setState(1515);
				match(LPAREN);
				 EqtnAdd("fEXP(");  
				setState(1517);
				math_equation(0);
				setState(1518);
				match(RPAREN);
				 EqtnAdd(")"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1521);
				match(SQRT);
				setState(1522);
				match(LPAREN);
				 EqtnAdd("fSQRT("); 
				setState(1524);
				math_equation(0);
				setState(1525);
				match(RPAREN);
				 EqtnAdd(")"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1528);
				match(LOG);
				setState(1529);
				match(LPAREN);
				 EqtnAdd("fLOG(");  
				setState(1531);
				math_equation(0);
				setState(1532);
				match(RPAREN);
				 EqtnAdd(")"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1535);
				match(COS);
				setState(1536);
				match(LPAREN);
				 EqtnAdd("fCOS(");  
				setState(1538);
				math_equation(0);
				setState(1539);
				match(RPAREN);
				 EqtnAdd(")"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1542);
				match(SIN);
				setState(1543);
				match(LPAREN);
				 EqtnAdd("fSIN(");  
				setState(1545);
				math_equation(0);
				setState(1546);
				match(RPAREN);
				 EqtnAdd(")"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1549);
				match(TAN);
				setState(1550);
				match(LPAREN);
				 EqtnAdd("fTIN(");  
				setState(1552);
				math_equation(0);
				setState(1553);
				match(RPAREN);
				 EqtnAdd(")"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1556);
				match(ASIN);
				setState(1557);
				match(LPAREN);
				 EqtnAdd("fASIN("); 
				setState(1559);
				math_equation(0);
				setState(1560);
				match(RPAREN);
				 EqtnAdd(")"); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1563);
				match(ACOS);
				setState(1564);
				match(LPAREN);
				 EqtnAdd("fCOS(");  
				setState(1566);
				math_equation(0);
				setState(1567);
				match(RPAREN);
				 EqtnAdd(")"); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1570);
				match(ATAN);
				setState(1571);
				match(LPAREN);
				 EqtnAdd("fATAN("); 
				setState(1573);
				math_equation(0);
				setState(1574);
				match(RPAREN);
				 EqtnAdd(")"); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1577);
				((Math_primary_eqtnContext)_localctx).literal_numbers = literal_numbers();
				 EqtnAdd((((Math_primary_eqtnContext)_localctx).literal_numbers!=null?_input.getText(((Math_primary_eqtnContext)_localctx).literal_numbers.start,((Math_primary_eqtnContext)_localctx).literal_numbers.stop):null)); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1580);
				((Math_primary_eqtnContext)_localctx).ConstVariable = match(ConstVariable);
				 EqtnAdd((((Math_primary_eqtnContext)_localctx).ConstVariable!=null?((Math_primary_eqtnContext)_localctx).ConstVariable.getText():null)); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1582);
				((Math_primary_eqtnContext)_localctx).ColorVariable = match(ColorVariable);
				 EqtnAdd((((Math_primary_eqtnContext)_localctx).ColorVariable!=null?((Math_primary_eqtnContext)_localctx).ColorVariable.getText():null)); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1584);
				((Math_primary_eqtnContext)_localctx).pt_name_pat = pt_name_pat();
				setState(1586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(1585);
					((Math_primary_eqtnContext)_localctx).rec_fld_pat = rec_fld_pat();
					}
					break;
				}

							if ((((Math_primary_eqtnContext)_localctx).rec_fld_pat!=null?_input.getText(((Math_primary_eqtnContext)_localctx).rec_fld_pat.start,((Math_primary_eqtnContext)_localctx).rec_fld_pat.stop):null)!=null) {
								EqtnAdd("get"+(((Math_primary_eqtnContext)_localctx).rec_fld_pat!=null?_input.getText(((Math_primary_eqtnContext)_localctx).rec_fld_pat.start,((Math_primary_eqtnContext)_localctx).rec_fld_pat.stop):null).replace("\"", " ").trim()+"("+(((Math_primary_eqtnContext)_localctx).pt_name_pat!=null?_input.getText(((Math_primary_eqtnContext)_localctx).pt_name_pat.start,((Math_primary_eqtnContext)_localctx).pt_name_pat.stop):null)+")");
							} else {
								EqtnAdd("getAV("+(((Math_primary_eqtnContext)_localctx).pt_name_pat!=null?_input.getText(((Math_primary_eqtnContext)_localctx).pt_name_pat.start,((Math_primary_eqtnContext)_localctx).pt_name_pat.stop):null)+")");
							}
						
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1590);
				((Math_primary_eqtnContext)_localctx).pointer_pat = pointer_pat();
				setState(1592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1591);
					((Math_primary_eqtnContext)_localctx).offset_pat = offset_pat();
					}
					break;
				}

							if ((((Math_primary_eqtnContext)_localctx).offset_pat!=null?_input.getText(((Math_primary_eqtnContext)_localctx).offset_pat.start,((Math_primary_eqtnContext)_localctx).offset_pat.stop):null)!=null) {
								String pointer_name = (((Math_primary_eqtnContext)_localctx).pointer_pat!=null?_input.getText(((Math_primary_eqtnContext)_localctx).pointer_pat.start,((Math_primary_eqtnContext)_localctx).pointer_pat.stop):null).substring(0, 2);
								String pointer_index = (((Math_primary_eqtnContext)_localctx).pointer_pat!=null?_input.getText(((Math_primary_eqtnContext)_localctx).pointer_pat.start,((Math_primary_eqtnContext)_localctx).pointer_pat.stop):null).substring(3).replace("]", "");

								String offset_name = (((Math_primary_eqtnContext)_localctx).offset_pat!=null?_input.getText(((Math_primary_eqtnContext)_localctx).offset_pat.start,((Math_primary_eqtnContext)_localctx).offset_pat.stop):null).substring(0, 2);
								String offset_index = (((Math_primary_eqtnContext)_localctx).offset_pat!=null?_input.getText(((Math_primary_eqtnContext)_localctx).offset_pat.start,((Math_primary_eqtnContext)_localctx).offset_pat.stop):null).substring(3).replace("]", "");

								EqtnAdd("get"+pointer_name+offset_name+"("+pointer_index+","+offset_index+")");
							} else {
								EqtnAdd((((Math_primary_eqtnContext)_localctx).pointer_pat!=null?_input.getText(((Math_primary_eqtnContext)_localctx).pointer_pat.start,((Math_primary_eqtnContext)_localctx).pointer_pat.stop):null));
							}
						
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdOL_BUTTONContext extends ParserRuleContext {
		public int i_poke_type = 0;
		public int i_progs = 0;
		public int i_args = 0;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Token orientation;
		public Token endcap;
		public Token label_type;
		public Literal_numbersContext button_w;
		public Literal_numbersContext button_h;
		public Literal_numbersContext shape_w;
		public Literal_numbersContext shape_h;
		public Token shape_name;
		public Literal_numbersContext rotation;
		public Token inversion;
		public Token font_type;
		public Literal_numbersContext bitmap_font_num;
		public Token txt;
		public Literal_numbersContext vector_char_w;
		public Literal_numbersContext vector_char_h;
		public Literal_numbersContext line_width;
		public Token func_type;
		public Literal_numbersContext trigger;
		public Token poke_type;
		public Poke_argsContext pt_name;
		public Token diag_num;
		public Token group_num;
		public Token prg_num;
		public Token command_line;
		public Token num_of_progs;
		public Token prog_num;
		public Token num_of_args;
		public Poke_argsContext arg;
		public Poke_argsContext set_num;
		public Token set_val;
		public TerminalNode C_OL_BUTTON() { return getToken(glParser.C_OL_BUTTON, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode HORZ() { return getToken(glParser.HORZ, 0); }
		public TerminalNode VERT() { return getToken(glParser.VERT, 0); }
		public TerminalNode ROUNDED() { return getToken(glParser.ROUNDED, 0); }
		public TerminalNode SQUARED() { return getToken(glParser.SQUARED, 0); }
		public TerminalNode SHAPE_LABEL() { return getToken(glParser.SHAPE_LABEL, 0); }
		public TerminalNode Identifier() { return getToken(glParser.Identifier, 0); }
		public TerminalNode TEXT_LABEL() { return getToken(glParser.TEXT_LABEL, 0); }
		public TerminalNode EXEC_TRIG() { return getToken(glParser.EXEC_TRIG, 0); }
		public TerminalNode EXEC_POKE() { return getToken(glParser.EXEC_POKE, 0); }
		public List<TerminalNode> IntegerLiteral() { return getTokens(glParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(glParser.IntegerLiteral, i);
		}
		public TerminalNode NONE() { return getToken(glParser.NONE, 0); }
		public TerminalNode TTB() { return getToken(glParser.TTB, 0); }
		public TerminalNode RTL() { return getToken(glParser.RTL, 0); }
		public TerminalNode BOTH() { return getToken(glParser.BOTH, 0); }
		public TerminalNode BITMAP() { return getToken(glParser.BITMAP, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(glParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(glParser.StringLiteral, i);
		}
		public TerminalNode VECTOR() { return getToken(glParser.VECTOR, 0); }
		public List<Poke_argsContext> poke_args() {
			return getRuleContexts(Poke_argsContext.class);
		}
		public Poke_argsContext poke_args(int i) {
			return getRuleContext(Poke_argsContext.class,i);
		}
		public CmdOL_BUTTONContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdOL_BUTTON; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdOL_BUTTON(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdOL_BUTTON(this);
		}
	}

	public final CmdOL_BUTTONContext cmdOL_BUTTON() throws RecognitionException {
		CmdOL_BUTTONContext _localctx = new CmdOL_BUTTONContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_cmdOL_BUTTON);


			ST shape_lable = new ST("{"+
				"button_w:<button_w>,"+
				"button_h:<button_h>,"+
				"shape_w:<shape_w>,"+
				"shape_h:<shape_h>,"+
				"shape_name:<shape_name>,"+
				"rotation:<rotation>,"+
				"inversion:<inversion>}"
			);

			ST text_lable_bitmap = new ST ("{"+
				"font_type:\"BITMAP\","+
				"bitmap_font_num:<bitmap_font_num>,"+
				"txt:<txt>}"
			);

			ST text_lable_vector = new ST ("{"+
				"font_type:\"VECTOR\","+
				"vector_char_w:<vector_char_w>,"+
				"vector_char_h:<vector_char_h>,"+
				"line_width:<line_width>,"+
				"txt:<txt>}"
			);

			ST tmplt = new ST("Gol_button(<x>,<y>,<orientation>,<endcap>,<label_type>,<label>,<function_type>,<function>,<args>);");

			boolean first_progs = true;
			boolean first_args = true;

		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			match(C_OL_BUTTON);
			setState(1599);
			((CmdOL_BUTTONContext)_localctx).x = literal_numbers();
			 tmplt.add("x", macroPort.calcX((((CmdOL_BUTTONContext)_localctx).x!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).x.start,((CmdOL_BUTTONContext)_localctx).x.stop):null))); 
			setState(1601);
			((CmdOL_BUTTONContext)_localctx).y = literal_numbers();
			 tmplt.add("y", macroPort.calcY((((CmdOL_BUTTONContext)_localctx).y!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).y.start,((CmdOL_BUTTONContext)_localctx).y.stop):null))); 
			 macroBBox.addPoint((((CmdOL_BUTTONContext)_localctx).x!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).x.start,((CmdOL_BUTTONContext)_localctx).x.stop):null), (((CmdOL_BUTTONContext)_localctx).y!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).y.start,((CmdOL_BUTTONContext)_localctx).y.stop):null)); 
			setState(1604);
			((CmdOL_BUTTONContext)_localctx).orientation = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==HORZ || _la==VERT) ) {
				((CmdOL_BUTTONContext)_localctx).orientation = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 tmplt.add("orientation", (((CmdOL_BUTTONContext)_localctx).orientation!=null?((CmdOL_BUTTONContext)_localctx).orientation.getText():null)); 
			setState(1606);
			((CmdOL_BUTTONContext)_localctx).endcap = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ROUNDED || _la==SQUARED) ) {
				((CmdOL_BUTTONContext)_localctx).endcap = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 tmplt.add("endcap", (((CmdOL_BUTTONContext)_localctx).endcap!=null?((CmdOL_BUTTONContext)_localctx).endcap.getText():null)); 
			setState(1654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHAPE_LABEL:
				{
				{
				setState(1608);
				((CmdOL_BUTTONContext)_localctx).label_type = match(SHAPE_LABEL);
				 tmplt.add("label_type", (((CmdOL_BUTTONContext)_localctx).label_type!=null?((CmdOL_BUTTONContext)_localctx).label_type.getText():null)); 
				setState(1610);
				((CmdOL_BUTTONContext)_localctx).button_w = literal_numbers();
				 shape_lable.add("button_w", macroPort.calcW((((CmdOL_BUTTONContext)_localctx).button_w!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).button_w.start,((CmdOL_BUTTONContext)_localctx).button_w.stop):null))); 
				setState(1612);
				((CmdOL_BUTTONContext)_localctx).button_h = literal_numbers();
				 shape_lable.add("button_h", macroPort.calcH((((CmdOL_BUTTONContext)_localctx).button_h!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).button_h.start,((CmdOL_BUTTONContext)_localctx).button_h.stop):null))); 
				 macroBBox.addRect((((CmdOL_BUTTONContext)_localctx).x!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).x.start,((CmdOL_BUTTONContext)_localctx).x.stop):null), (((CmdOL_BUTTONContext)_localctx).y!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).y.start,((CmdOL_BUTTONContext)_localctx).y.stop):null), (((CmdOL_BUTTONContext)_localctx).button_w!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).button_w.start,((CmdOL_BUTTONContext)_localctx).button_w.stop):null), (((CmdOL_BUTTONContext)_localctx).button_h!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).button_h.start,((CmdOL_BUTTONContext)_localctx).button_h.stop):null)); 
				setState(1615);
				((CmdOL_BUTTONContext)_localctx).shape_w = literal_numbers();
				 shape_lable.add("shape_w", macroPort.calcW((((CmdOL_BUTTONContext)_localctx).shape_w!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).shape_w.start,((CmdOL_BUTTONContext)_localctx).shape_w.stop):null))); 
				setState(1617);
				((CmdOL_BUTTONContext)_localctx).shape_h = literal_numbers();
				 shape_lable.add("shape_h", macroPort.calcW((((CmdOL_BUTTONContext)_localctx).shape_h!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).shape_h.start,((CmdOL_BUTTONContext)_localctx).shape_h.stop):null))); 
				setState(1619);
				((CmdOL_BUTTONContext)_localctx).shape_name = match(Identifier);
				 shape_lable.add("shape_name", (((CmdOL_BUTTONContext)_localctx).shape_name!=null?((CmdOL_BUTTONContext)_localctx).shape_name.getText():null)); 
				setState(1621);
				((CmdOL_BUTTONContext)_localctx).rotation = literal_numbers();
				 shape_lable.add("rotation", (((CmdOL_BUTTONContext)_localctx).rotation!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).rotation.start,((CmdOL_BUTTONContext)_localctx).rotation.stop):null)); 
				setState(1623);
				((CmdOL_BUTTONContext)_localctx).inversion = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << TTB) | (1L << RTL) | (1L << BOTH))) != 0)) ) {
					((CmdOL_BUTTONContext)_localctx).inversion = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 shape_lable.add("inversion", (((CmdOL_BUTTONContext)_localctx).inversion!=null?((CmdOL_BUTTONContext)_localctx).inversion.getText():null)); 
				}
				 tmplt.add("label", shape_lable.render()); 
				}
				break;
			case TEXT_LABEL:
				{
				{
				setState(1628);
				((CmdOL_BUTTONContext)_localctx).label_type = match(TEXT_LABEL);
				 tmplt.add("label_type", (((CmdOL_BUTTONContext)_localctx).label_type!=null?((CmdOL_BUTTONContext)_localctx).label_type.getText():null)); 
				setState(1652);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BITMAP:
					{
					{
					setState(1630);
					((CmdOL_BUTTONContext)_localctx).font_type = match(BITMAP);
					 text_lable_bitmap.add("font_type", (((CmdOL_BUTTONContext)_localctx).font_type!=null?((CmdOL_BUTTONContext)_localctx).font_type.getText():null)); 
					setState(1632);
					((CmdOL_BUTTONContext)_localctx).bitmap_font_num = literal_numbers();
					 text_lable_bitmap.add("bitmap_font_num", (((CmdOL_BUTTONContext)_localctx).bitmap_font_num!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).bitmap_font_num.start,((CmdOL_BUTTONContext)_localctx).bitmap_font_num.stop):null)); 
					setState(1634);
					((CmdOL_BUTTONContext)_localctx).txt = match(StringLiteral);
					 text_lable_bitmap.add("txt", (((CmdOL_BUTTONContext)_localctx).txt!=null?((CmdOL_BUTTONContext)_localctx).txt.getText():null)); 
					}
					 tmplt.add("label", text_lable_bitmap.render()); 
					}
					break;
				case VECTOR:
					{
					{
					setState(1639);
					((CmdOL_BUTTONContext)_localctx).font_type = match(VECTOR);
					 text_lable_vector.add("font_type", (((CmdOL_BUTTONContext)_localctx).font_type!=null?((CmdOL_BUTTONContext)_localctx).font_type.getText():null)); 
					setState(1641);
					((CmdOL_BUTTONContext)_localctx).vector_char_w = literal_numbers();
					 text_lable_vector.add("vector_char_w", macroPort.calcW((((CmdOL_BUTTONContext)_localctx).vector_char_w!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).vector_char_w.start,((CmdOL_BUTTONContext)_localctx).vector_char_w.stop):null))); 
					setState(1643);
					((CmdOL_BUTTONContext)_localctx).vector_char_h = literal_numbers();
					 text_lable_vector.add("vector_char_h", macroPort.calcH((((CmdOL_BUTTONContext)_localctx).vector_char_h!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).vector_char_h.start,((CmdOL_BUTTONContext)_localctx).vector_char_h.stop):null))); 
					setState(1645);
					((CmdOL_BUTTONContext)_localctx).line_width = literal_numbers();
					 text_lable_vector.add("line_width", (((CmdOL_BUTTONContext)_localctx).line_width!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).line_width.start,((CmdOL_BUTTONContext)_localctx).line_width.stop):null)); 
					setState(1647);
					((CmdOL_BUTTONContext)_localctx).txt = match(StringLiteral);
					 text_lable_vector.add("txt", (((CmdOL_BUTTONContext)_localctx).txt!=null?((CmdOL_BUTTONContext)_localctx).txt.getText():null)); 
					}
					 tmplt.add("label", text_lable_vector.render()); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXEC_TRIG:
				{
				{
				setState(1656);
				((CmdOL_BUTTONContext)_localctx).func_type = match(EXEC_TRIG);
				 tmplt.add("function_type", (((CmdOL_BUTTONContext)_localctx).func_type!=null?((CmdOL_BUTTONContext)_localctx).func_type.getText():null)); 
				setState(1658);
				((CmdOL_BUTTONContext)_localctx).trigger = literal_numbers();
				 tmplt.add("function", (((CmdOL_BUTTONContext)_localctx).trigger!=null?_input.getText(((CmdOL_BUTTONContext)_localctx).trigger.start,((CmdOL_BUTTONContext)_localctx).trigger.stop):null)); 
				}
				 tmplt.add("args", "null,null,null"); 
				}
				break;
			case EXEC_POKE:
				{
				{
				setState(1663);
				((CmdOL_BUTTONContext)_localctx).func_type = match(EXEC_POKE);
				 tmplt.add("function_type", (((CmdOL_BUTTONContext)_localctx).func_type!=null?((CmdOL_BUTTONContext)_localctx).func_type.getText():null)); 
				setState(1665);
				((CmdOL_BUTTONContext)_localctx).poke_type = match(IntegerLiteral);
				 tmplt.add("function", (((CmdOL_BUTTONContext)_localctx).poke_type!=null?((CmdOL_BUTTONContext)_localctx).poke_type.getText():null)); 
				 ((CmdOL_BUTTONContext)_localctx).i_poke_type =  (((CmdOL_BUTTONContext)_localctx).poke_type!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).poke_type.getText()):0); 
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					{
					setState(1668);
					if (!( _localctx.i_poke_type == 0 )) throw new FailedPredicateException(this, " $i_poke_type == 0 ");
					setState(1669);
					((CmdOL_BUTTONContext)_localctx).pt_name = poke_args();
					 
											tmplt.add("args", ((CmdOL_BUTTONContext)_localctx).pt_name.str + ",null,null");
										
					}
					}
					break;
				case 2:
					{
					{
					setState(1672);
					if (!( _localctx.i_poke_type == 2 )) throw new FailedPredicateException(this, " $i_poke_type == 2 ");
					setState(1673);
					((CmdOL_BUTTONContext)_localctx).diag_num = match(IntegerLiteral);
					setState(1674);
					((CmdOL_BUTTONContext)_localctx).group_num = match(IntegerLiteral);

											tmplt.add("args", (((CmdOL_BUTTONContext)_localctx).diag_num!=null?((CmdOL_BUTTONContext)_localctx).diag_num.getText():null) + "," + (((CmdOL_BUTTONContext)_localctx).group_num!=null?((CmdOL_BUTTONContext)_localctx).group_num.getText():null) + ",null");
										
					}
					}
					break;
				case 3:
					{
					{
					setState(1676);
					if (!( _localctx.i_poke_type == 3 )) throw new FailedPredicateException(this, " $i_poke_type == 3 ");
					setState(1677);
					((CmdOL_BUTTONContext)_localctx).prg_num = match(IntegerLiteral);

											tmplt.add("args", (((CmdOL_BUTTONContext)_localctx).prg_num!=null?((CmdOL_BUTTONContext)_localctx).prg_num.getText():null) + ",null,null");
										
					}
					}
					break;
				case 4:
					{
					{
					setState(1679);
					if (!( _localctx.i_poke_type == 9 )) throw new FailedPredicateException(this, " $i_poke_type == 9 ");
					setState(1680);
					((CmdOL_BUTTONContext)_localctx).command_line = match(StringLiteral);

											tmplt.add("args", (((CmdOL_BUTTONContext)_localctx).command_line!=null?((CmdOL_BUTTONContext)_localctx).command_line.getText():null) + ",null,null");
										
					}
					}
					break;
				case 5:
					{
					{
					setState(1682);
					if (!( _localctx.i_poke_type == 7 )) throw new FailedPredicateException(this, " $i_poke_type == 7 ");
					 tmplt.add("args", "null,null,["); 
					setState(1684);
					((CmdOL_BUTTONContext)_localctx).num_of_progs = match(IntegerLiteral);
					 ((CmdOL_BUTTONContext)_localctx).i_progs =  0; first_progs = true; 
					setState(1709);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1686);
							if (!( _localctx.i_progs <= (((CmdOL_BUTTONContext)_localctx).num_of_progs!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).num_of_progs.getText()):0) )) throw new FailedPredicateException(this, " $i_progs <= $num_of_progs.int ");
							{
							setState(1687);
							((CmdOL_BUTTONContext)_localctx).prog_num = match(IntegerLiteral);

																if (first_progs) {
																	first_progs = false;
																	tmplt.add("args", "{\"prog\":" + (((CmdOL_BUTTONContext)_localctx).prog_num!=null?((CmdOL_BUTTONContext)_localctx).prog_num.getText():null));		// Открывашка 2
																} else {
																	tmplt.add("args", ",{\"prog\":" + (((CmdOL_BUTTONContext)_localctx).prog_num!=null?((CmdOL_BUTTONContext)_localctx).prog_num.getText():null));
																}
															
							setState(1689);
							((CmdOL_BUTTONContext)_localctx).diag_num = match(IntegerLiteral);
							 tmplt.add("args", ",\"diag\":" + (((CmdOL_BUTTONContext)_localctx).diag_num!=null?((CmdOL_BUTTONContext)_localctx).diag_num.getText():null) + ",\"arg\":["); 
							 DiagNumList.add((((CmdOL_BUTTONContext)_localctx).diag_num!=null?((CmdOL_BUTTONContext)_localctx).diag_num.getText():null)); 
							setState(1692);
							((CmdOL_BUTTONContext)_localctx).num_of_args = match(IntegerLiteral);
							 ((CmdOL_BUTTONContext)_localctx).i_args =  0; first_args = true; 
							setState(1701);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1694);
									if (!( _localctx.i_args < (((CmdOL_BUTTONContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).num_of_args.getText()):0) )) throw new FailedPredicateException(this, " $i_args < $num_of_args.int ");
									setState(1695);
									((CmdOL_BUTTONContext)_localctx).arg = poke_args();

																			if (first_args) {
																				first_args = false;
																				tmplt.add("args",       ((CmdOL_BUTTONContext)_localctx).arg.str);
																			} else {
																				tmplt.add("args", "," + ((CmdOL_BUTTONContext)_localctx).arg.str);
																			}
																		
									 _localctx.i_args++; 
									}
									} 
								}
								setState(1703);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
							}
							 tmplt.add("args", "]"); 
							}
							 _localctx.i_progs++; tmplt.add("args", "}"); 
							}
							} 
						}
						setState(1711);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					}

											tmplt.add("args", "]");											// Закрывашка 1
										
					}
					}
					break;
				case 6:
					{
					{
					setState(1713);
					if (!( _localctx.i_poke_type == 23 )) throw new FailedPredicateException(this, " $i_poke_type == 23 ");
					setState(1714);
					((CmdOL_BUTTONContext)_localctx).set_num = poke_args();
					 tmplt.add("args",       ((CmdOL_BUTTONContext)_localctx).set_num.str); 
					setState(1716);
					((CmdOL_BUTTONContext)_localctx).set_val = match(IntegerLiteral);
					 tmplt.add("args", "," + (((CmdOL_BUTTONContext)_localctx).set_val!=null?((CmdOL_BUTTONContext)_localctx).set_val.getText():null) + ",["); 
					setState(1718);
					((CmdOL_BUTTONContext)_localctx).num_of_progs = match(IntegerLiteral);
					 ((CmdOL_BUTTONContext)_localctx).i_progs =  0; first_progs = true; 
					setState(1742); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1720);
							if (!( _localctx.i_progs <= (((CmdOL_BUTTONContext)_localctx).num_of_progs!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).num_of_progs.getText()):0) )) throw new FailedPredicateException(this, " $i_progs <= $num_of_progs.int ");
							{
							setState(1721);
							((CmdOL_BUTTONContext)_localctx).prog_num = match(IntegerLiteral);

																if (first_progs) {
																	first_progs = false;
																	tmplt.add("args", "{\"prog\":" + (((CmdOL_BUTTONContext)_localctx).prog_num!=null?((CmdOL_BUTTONContext)_localctx).prog_num.getText():null));						// Открывашка 2
																} else {
																	tmplt.add("args", ",{\"prog\":" + (((CmdOL_BUTTONContext)_localctx).prog_num!=null?((CmdOL_BUTTONContext)_localctx).prog_num.getText():null));
																}
															
							setState(1723);
							((CmdOL_BUTTONContext)_localctx).diag_num = match(IntegerLiteral);
							 tmplt.add("args", ",\"diag\":" + (((CmdOL_BUTTONContext)_localctx).diag_num!=null?((CmdOL_BUTTONContext)_localctx).diag_num.getText():null) + ",\"arg\":["); 
							 DiagNumList.add((((CmdOL_BUTTONContext)_localctx).diag_num!=null?((CmdOL_BUTTONContext)_localctx).diag_num.getText():null)); 
							setState(1726);
							((CmdOL_BUTTONContext)_localctx).num_of_args = match(IntegerLiteral);
							 ((CmdOL_BUTTONContext)_localctx).i_args =  0; first_args = true; 
							setState(1736);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1728);
									if (!( (((CmdOL_BUTTONContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).num_of_args.getText()):0) != 0 )) throw new FailedPredicateException(this, " $num_of_args.int != 0 ");
									setState(1729);
									if (!( _localctx.i_args < (((CmdOL_BUTTONContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).num_of_args.getText()):0) )) throw new FailedPredicateException(this, " $i_args < $num_of_args.int ");
									setState(1730);
									((CmdOL_BUTTONContext)_localctx).arg = poke_args();

																			if (first_args) {
																				first_args = false;
																				tmplt.add("args",       ((CmdOL_BUTTONContext)_localctx).arg.str);
																			} else {
																				tmplt.add("args", "," + ((CmdOL_BUTTONContext)_localctx).arg.str);
																			}
																		
									 _localctx.i_args++; 
									}
									} 
								}
								setState(1738);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
							}
							 tmplt.add("args", "]"); 
							}
							 _localctx.i_progs++; tmplt.add("args", "}"); 
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1744); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

											tmplt.add("args", "]");															// Закрывашка 1
										
					}
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "OL_BUTTON") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdOL_RECTANGLEContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public Token state;
		public TerminalNode C_OL_RECTANGLE() { return getToken(glParser.C_OL_RECTANGLE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode OLNORMAL() { return getToken(glParser.OLNORMAL, 0); }
		public TerminalNode INVOKED() { return getToken(glParser.INVOKED, 0); }
		public CmdOL_RECTANGLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdOL_RECTANGLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdOL_RECTANGLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdOL_RECTANGLE(this);
		}
	}

	public final CmdOL_RECTANGLEContext cmdOL_RECTANGLE() throws RecognitionException {
		CmdOL_RECTANGLEContext _localctx = new CmdOL_RECTANGLEContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_cmdOL_RECTANGLE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(C_OL_RECTANGLE);
			setState(1753);
			((CmdOL_RECTANGLEContext)_localctx).x = literal_numbers();
			setState(1754);
			((CmdOL_RECTANGLEContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdOL_RECTANGLEContext)_localctx).x!=null?_input.getText(((CmdOL_RECTANGLEContext)_localctx).x.start,((CmdOL_RECTANGLEContext)_localctx).x.stop):null), (((CmdOL_RECTANGLEContext)_localctx).y!=null?_input.getText(((CmdOL_RECTANGLEContext)_localctx).y.start,((CmdOL_RECTANGLEContext)_localctx).y.stop):null)); 
			setState(1756);
			((CmdOL_RECTANGLEContext)_localctx).w = literal_numbers();
			setState(1757);
			((CmdOL_RECTANGLEContext)_localctx).h = literal_numbers();
			 macroBBox.addRect((((CmdOL_RECTANGLEContext)_localctx).x!=null?_input.getText(((CmdOL_RECTANGLEContext)_localctx).x.start,((CmdOL_RECTANGLEContext)_localctx).x.stop):null), (((CmdOL_RECTANGLEContext)_localctx).y!=null?_input.getText(((CmdOL_RECTANGLEContext)_localctx).y.start,((CmdOL_RECTANGLEContext)_localctx).y.stop):null), (((CmdOL_RECTANGLEContext)_localctx).w!=null?_input.getText(((CmdOL_RECTANGLEContext)_localctx).w.start,((CmdOL_RECTANGLEContext)_localctx).w.stop):null), (((CmdOL_RECTANGLEContext)_localctx).h!=null?_input.getText(((CmdOL_RECTANGLEContext)_localctx).h.start,((CmdOL_RECTANGLEContext)_localctx).h.stop):null)); 
			setState(1759);
			((CmdOL_RECTANGLEContext)_localctx).state = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==OLNORMAL || _la==INVOKED) ) {
				((CmdOL_RECTANGLEContext)_localctx).state = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "OL_RECTANGLE") + "Gol_rectangle("+
					macroPort.calcX((((CmdOL_RECTANGLEContext)_localctx).x!=null?_input.getText(((CmdOL_RECTANGLEContext)_localctx).x.start,((CmdOL_RECTANGLEContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdOL_RECTANGLEContext)_localctx).y!=null?_input.getText(((CmdOL_RECTANGLEContext)_localctx).y.start,((CmdOL_RECTANGLEContext)_localctx).y.stop):null))+","+
					macroPort.calcW((((CmdOL_RECTANGLEContext)_localctx).w!=null?_input.getText(((CmdOL_RECTANGLEContext)_localctx).w.start,((CmdOL_RECTANGLEContext)_localctx).w.stop):null))+","+
					macroPort.calcH((((CmdOL_RECTANGLEContext)_localctx).h!=null?_input.getText(((CmdOL_RECTANGLEContext)_localctx).h.start,((CmdOL_RECTANGLEContext)_localctx).h.stop):null))+","+
					(((CmdOL_RECTANGLEContext)_localctx).state!=null?((CmdOL_RECTANGLEContext)_localctx).state.getText():null)+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPAGEContext extends ParserRuleContext {
		public Literal_numbersContext literal_numbers;
		public TerminalNode C_PAGE() { return getToken(glParser.C_PAGE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public CmdPAGEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPAGE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdPAGE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdPAGE(this);
		}
	}

	public final CmdPAGEContext cmdPAGE() throws RecognitionException {
		CmdPAGEContext _localctx = new CmdPAGEContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_cmdPAGE);

			ST tmplt = new ST("Gpage("+
				"<pg_up_diag>,<pg_rt_diag>,<pg_dn_diag>,<pg_lt_diag>,"+
				"<pg_up_group>,<pg_rt_group>,<pg_dn_group>,<pg_lt_group>);");

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			match(C_PAGE);
			setState(1762);
			((CmdPAGEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("pg_up_diag",  Integer.parseInt((((CmdPAGEContext)_localctx).literal_numbers!=null?_input.getText(((CmdPAGEContext)_localctx).literal_numbers.start,((CmdPAGEContext)_localctx).literal_numbers.stop):null))); 
			setState(1764);
			((CmdPAGEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("pg_rt_diag",  Integer.parseInt((((CmdPAGEContext)_localctx).literal_numbers!=null?_input.getText(((CmdPAGEContext)_localctx).literal_numbers.start,((CmdPAGEContext)_localctx).literal_numbers.stop):null))); 
			setState(1766);
			((CmdPAGEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("pg_dn_diag",  Integer.parseInt((((CmdPAGEContext)_localctx).literal_numbers!=null?_input.getText(((CmdPAGEContext)_localctx).literal_numbers.start,((CmdPAGEContext)_localctx).literal_numbers.stop):null))); 
			setState(1768);
			((CmdPAGEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("pg_lt_diag",  Integer.parseInt((((CmdPAGEContext)_localctx).literal_numbers!=null?_input.getText(((CmdPAGEContext)_localctx).literal_numbers.start,((CmdPAGEContext)_localctx).literal_numbers.stop):null))); 
			setState(1770);
			((CmdPAGEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("pg_up_group", Integer.parseInt((((CmdPAGEContext)_localctx).literal_numbers!=null?_input.getText(((CmdPAGEContext)_localctx).literal_numbers.start,((CmdPAGEContext)_localctx).literal_numbers.stop):null))); 
			setState(1772);
			((CmdPAGEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("pg_rt_group", Integer.parseInt((((CmdPAGEContext)_localctx).literal_numbers!=null?_input.getText(((CmdPAGEContext)_localctx).literal_numbers.start,((CmdPAGEContext)_localctx).literal_numbers.stop):null))); 
			setState(1774);
			((CmdPAGEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("pg_dn_group", Integer.parseInt((((CmdPAGEContext)_localctx).literal_numbers!=null?_input.getText(((CmdPAGEContext)_localctx).literal_numbers.start,((CmdPAGEContext)_localctx).literal_numbers.stop):null))); 
			setState(1776);
			((CmdPAGEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("pg_lt_group", Integer.parseInt((((CmdPAGEContext)_localctx).literal_numbers!=null?_input.getText(((CmdPAGEContext)_localctx).literal_numbers.start,((CmdPAGEContext)_localctx).literal_numbers.stop):null))); 
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "PAGE") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPLOTContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext literal_numbers;
		public Literal_numbersContext y;
		public Token drctn;
		public ValueContext value;
		public Token plt_chr;
		public Token Identifier;
		public Token inv;
		public TerminalNode C_PLOT() { return getToken(glParser.C_PLOT, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode UP() { return getToken(glParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(glParser.DOWN, 0); }
		public TerminalNode LEFT() { return getToken(glParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(glParser.RIGHT, 0); }
		public List<TerminalNode> NONE() { return getTokens(glParser.NONE); }
		public TerminalNode NONE(int i) {
			return getToken(glParser.NONE, i);
		}
		public TerminalNode LINES() { return getToken(glParser.LINES, 0); }
		public TerminalNode SHAPE_PLOT() { return getToken(glParser.SHAPE_PLOT, 0); }
		public TerminalNode SQUAREWAVE() { return getToken(glParser.SQUAREWAVE, 0); }
		public TerminalNode Identifier() { return getToken(glParser.Identifier, 0); }
		public TerminalNode TTB() { return getToken(glParser.TTB, 0); }
		public TerminalNode RTL() { return getToken(glParser.RTL, 0); }
		public TerminalNode BOTH() { return getToken(glParser.BOTH, 0); }
		public CmdPLOTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPLOT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdPLOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdPLOT(this);
		}
	}

	public final CmdPLOTContext cmdPLOT() throws RecognitionException {
		CmdPLOTContext _localctx = new CmdPLOTContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_cmdPLOT);

			ST tmplt = new ST("Gplot(<x>,<y>,"+
				"<plot_line_len>,<direction>,"+
				"<cur_value>,<low_limit>,<high_limit>,"+
				"<plot_char>,<shape_name>,<shapew>,<shapeh>,<rot>,<inv>);");

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			match(C_PLOT);
			setState(1780);
			((CmdPLOTContext)_localctx).x = ((CmdPLOTContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("x", macroPort.calcX((((CmdPLOTContext)_localctx).x!=null?_input.getText(((CmdPLOTContext)_localctx).x.start,((CmdPLOTContext)_localctx).x.stop):null))); 
			setState(1782);
			((CmdPLOTContext)_localctx).y = ((CmdPLOTContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("y", macroPort.calcY((((CmdPLOTContext)_localctx).y!=null?_input.getText(((CmdPLOTContext)_localctx).y.start,((CmdPLOTContext)_localctx).y.stop):null)));
									  macroBBox.addPoint((((CmdPLOTContext)_localctx).x!=null?_input.getText(((CmdPLOTContext)_localctx).x.start,((CmdPLOTContext)_localctx).x.stop):null), (((CmdPLOTContext)_localctx).y!=null?_input.getText(((CmdPLOTContext)_localctx).y.start,((CmdPLOTContext)_localctx).y.stop):null)); 
			setState(1784);
			((CmdPLOTContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("plot_line_len", (((CmdPLOTContext)_localctx).literal_numbers!=null?_input.getText(((CmdPLOTContext)_localctx).literal_numbers.start,((CmdPLOTContext)_localctx).literal_numbers.stop):null)); 
			setState(1786);
			((CmdPLOTContext)_localctx).drctn = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RIGHT) | (1L << LEFT) | (1L << DOWN) | (1L << UP))) != 0)) ) {
				((CmdPLOTContext)_localctx).drctn = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 tmplt.add("direction",  (((CmdPLOTContext)_localctx).drctn!=null?((CmdPLOTContext)_localctx).drctn.getText():null)); 
			setState(1788);
			((CmdPLOTContext)_localctx).value = value();
			 tmplt.add("cur_value",  ((CmdPLOTContext)_localctx).value.str);  
			setState(1790);
			((CmdPLOTContext)_localctx).value = value();
			 tmplt.add("low_limit",  ((CmdPLOTContext)_localctx).value.str);  
			setState(1792);
			((CmdPLOTContext)_localctx).value = value();
			 tmplt.add("high_limit", ((CmdPLOTContext)_localctx).value.str);  
			setState(1794);
			((CmdPLOTContext)_localctx).plt_chr = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LINES) | (1L << SHAPE_PLOT) | (1L << SQUAREWAVE))) != 0)) ) {
				((CmdPLOTContext)_localctx).plt_chr = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 tmplt.add("plot_char",  (((CmdPLOTContext)_localctx).plt_chr!=null?((CmdPLOTContext)_localctx).plt_chr.getText():null)); 
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1796);
				((CmdPLOTContext)_localctx).Identifier = match(Identifier);
				 tmplt.add("shape_name", (((CmdPLOTContext)_localctx).Identifier!=null?((CmdPLOTContext)_localctx).Identifier.getText():null));      
				setState(1798);
				((CmdPLOTContext)_localctx).literal_numbers = literal_numbers();
				 tmplt.add("shapew",     (((CmdPLOTContext)_localctx).literal_numbers!=null?_input.getText(((CmdPLOTContext)_localctx).literal_numbers.start,((CmdPLOTContext)_localctx).literal_numbers.stop):null)); 
				setState(1800);
				((CmdPLOTContext)_localctx).literal_numbers = literal_numbers();
				 tmplt.add("shapeh",     (((CmdPLOTContext)_localctx).literal_numbers!=null?_input.getText(((CmdPLOTContext)_localctx).literal_numbers.start,((CmdPLOTContext)_localctx).literal_numbers.stop):null)); 
				setState(1802);
				((CmdPLOTContext)_localctx).literal_numbers = literal_numbers();
				 tmplt.add("rot",        (((CmdPLOTContext)_localctx).literal_numbers!=null?_input.getText(((CmdPLOTContext)_localctx).literal_numbers.start,((CmdPLOTContext)_localctx).literal_numbers.stop):null)); 
				setState(1804);
				((CmdPLOTContext)_localctx).inv = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << TTB) | (1L << RTL) | (1L << BOTH))) != 0)) ) {
					((CmdPLOTContext)_localctx).inv = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 tmplt.add("inv",        (((CmdPLOTContext)_localctx).inv!=null?((CmdPLOTContext)_localctx).inv.getText():null)); 
				}
			}

			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "PLOT") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPTR_VALUEContext extends ParserRuleContext {
		public Token pointer;
		public Token offset;
		public ValueContext val;
		public TerminalNode C_PTR_VALUE() { return getToken(glParser.C_PTR_VALUE, 0); }
		public TerminalNode Ppointer() { return getToken(glParser.Ppointer, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Boffset() { return getToken(glParser.Boffset, 0); }
		public TerminalNode Ioffset() { return getToken(glParser.Ioffset, 0); }
		public TerminalNode Roffset() { return getToken(glParser.Roffset, 0); }
		public TerminalNode Soffset() { return getToken(glParser.Soffset, 0); }
		public TerminalNode Spointer() { return getToken(glParser.Spointer, 0); }
		public TerminalNode Aoffset() { return getToken(glParser.Aoffset, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(glParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(glParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(glParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(glParser.RBRACKET, i);
		}
		public CmdPTR_VALUEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPTR_VALUE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdPTR_VALUE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdPTR_VALUE(this);
		}
	}

	public final CmdPTR_VALUEContext cmdPTR_VALUE() throws RecognitionException {
		CmdPTR_VALUEContext _localctx = new CmdPTR_VALUEContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_cmdPTR_VALUE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			match(C_PTR_VALUE);
			setState(1810);
			((CmdPTR_VALUEContext)_localctx).pointer = match(Ppointer);
			setState(1811);
			((CmdPTR_VALUEContext)_localctx).offset = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (Spointer - 172)) | (1L << (Ioffset - 172)) | (1L << (Roffset - 172)) | (1L << (Boffset - 172)) | (1L << (Soffset - 172)) | (1L << (Aoffset - 172)))) != 0)) ) {
				((CmdPTR_VALUEContext)_localctx).offset = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1812);
				match(LBRACKET);
				}
				}
				setState(1817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1818);
			((CmdPTR_VALUEContext)_localctx).val = value();
			setState(1822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RBRACKET) {
				{
				{
				setState(1819);
				match(RBRACKET);
				}
				}
				setState(1824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);

				String pointer_name = (((CmdPTR_VALUEContext)_localctx).pointer!=null?((CmdPTR_VALUEContext)_localctx).pointer.getText():null).substring(0, 2);
				String pointer_index = (((CmdPTR_VALUEContext)_localctx).pointer!=null?((CmdPTR_VALUEContext)_localctx).pointer.getText():null).substring(3).replace("]", "");

				String offset_name = (((CmdPTR_VALUEContext)_localctx).offset!=null?((CmdPTR_VALUEContext)_localctx).offset.getText():null).substring(0, 2);
				String offset_index = (((CmdPTR_VALUEContext)_localctx).offset!=null?((CmdPTR_VALUEContext)_localctx).offset.getText():null).substring(3).replace("]", "");

				println(UseCommands.get_use_cmds(section, "PTR_VALUE") +
					"set"+pointer_name+offset_name+"("+pointer_index+","+offset_index+","+((CmdPTR_VALUEContext)_localctx).val.str+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Poke_argsContext extends ParserRuleContext {
		public String str;
		public Token PointName;
		public Token Ppointer;
		public Token Gpointer;
		public Token Dpointer;
		public Token Wpointer;
		public Token Hpointer;
		public Token Opointer;
		public Token SetVariable;
		public Token ConstVariable;
		public Token IntegerLiteral;
		public Token StringLiteral;
		public TerminalNode PointName() { return getToken(glParser.PointName, 0); }
		public TerminalNode RecordField() { return getToken(glParser.RecordField, 0); }
		public TerminalNode Ppointer() { return getToken(glParser.Ppointer, 0); }
		public TerminalNode Gpointer() { return getToken(glParser.Gpointer, 0); }
		public TerminalNode Dpointer() { return getToken(glParser.Dpointer, 0); }
		public TerminalNode Wpointer() { return getToken(glParser.Wpointer, 0); }
		public TerminalNode Hpointer() { return getToken(glParser.Hpointer, 0); }
		public TerminalNode Opointer() { return getToken(glParser.Opointer, 0); }
		public TerminalNode SetVariable() { return getToken(glParser.SetVariable, 0); }
		public TerminalNode ConstVariable() { return getToken(glParser.ConstVariable, 0); }
		public TerminalNode IntegerLiteral() { return getToken(glParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(glParser.StringLiteral, 0); }
		public Poke_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poke_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterPoke_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitPoke_args(this);
		}
	}

	public final Poke_argsContext poke_args() throws RecognitionException {
		Poke_argsContext _localctx = new Poke_argsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_poke_args);
		 ((Poke_argsContext)_localctx).str =  ""; 
		try {
			setState(1868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PointName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1825);
				((Poke_argsContext)_localctx).PointName = match(PointName);
				setState(1827);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1826);
					match(RecordField);
					}
					break;
				}

						((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).PointName!=null?((Poke_argsContext)_localctx).PointName.getText():null);
						// Добавим имя точки в глобальный список
						if(!PointNameList.contains((((Poke_argsContext)_localctx).PointName!=null?((Poke_argsContext)_localctx).PointName.getText():null).substring(1,(((Poke_argsContext)_localctx).PointName!=null?((Poke_argsContext)_localctx).PointName.getText():null).length()-1)))
							PointNameList.add((((Poke_argsContext)_localctx).PointName!=null?((Poke_argsContext)_localctx).PointName.getText():null).substring(1,(((Poke_argsContext)_localctx).PointName!=null?((Poke_argsContext)_localctx).PointName.getText():null).length()-1));
					
				}
				break;
			case Ppointer:
				enterOuterAlt(_localctx, 2);
				{
				setState(1830);
				((Poke_argsContext)_localctx).Ppointer = match(Ppointer);
				setState(1832);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1831);
					match(RecordField);
					}
					break;
				}
				 ((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).Ppointer!=null?((Poke_argsContext)_localctx).Ppointer.getText():null); 
				}
				break;
			case Gpointer:
				enterOuterAlt(_localctx, 3);
				{
				setState(1835);
				((Poke_argsContext)_localctx).Gpointer = match(Gpointer);
				setState(1837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1836);
					match(RecordField);
					}
					break;
				}
				 ((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).Gpointer!=null?((Poke_argsContext)_localctx).Gpointer.getText():null); 
				}
				break;
			case Dpointer:
				enterOuterAlt(_localctx, 4);
				{
				setState(1840);
				((Poke_argsContext)_localctx).Dpointer = match(Dpointer);
				setState(1842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1841);
					match(RecordField);
					}
					break;
				}
				 ((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).Dpointer!=null?((Poke_argsContext)_localctx).Dpointer.getText():null); 
				}
				break;
			case Wpointer:
				enterOuterAlt(_localctx, 5);
				{
				setState(1845);
				((Poke_argsContext)_localctx).Wpointer = match(Wpointer);
				setState(1847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1846);
					match(RecordField);
					}
					break;
				}
				 ((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).Wpointer!=null?((Poke_argsContext)_localctx).Wpointer.getText():null); 
				}
				break;
			case Hpointer:
				enterOuterAlt(_localctx, 6);
				{
				setState(1850);
				((Poke_argsContext)_localctx).Hpointer = match(Hpointer);
				setState(1852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1851);
					match(RecordField);
					}
					break;
				}
				 ((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).Hpointer!=null?((Poke_argsContext)_localctx).Hpointer.getText():null); 
				}
				break;
			case Opointer:
				enterOuterAlt(_localctx, 7);
				{
				setState(1855);
				((Poke_argsContext)_localctx).Opointer = match(Opointer);
				setState(1857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1856);
					match(RecordField);
					}
					break;
				}
				 ((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).Opointer!=null?((Poke_argsContext)_localctx).Opointer.getText():null); 
				}
				break;
			case SetVariable:
				enterOuterAlt(_localctx, 8);
				{
				setState(1860);
				((Poke_argsContext)_localctx).SetVariable = match(SetVariable);
				 ((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).SetVariable!=null?((Poke_argsContext)_localctx).SetVariable.getText():null); 
				}
				break;
			case ConstVariable:
				enterOuterAlt(_localctx, 9);
				{
				setState(1862);
				((Poke_argsContext)_localctx).ConstVariable = match(ConstVariable);
				 ((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).ConstVariable!=null?((Poke_argsContext)_localctx).ConstVariable.getText():null); 
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 10);
				{
				setState(1864);
				((Poke_argsContext)_localctx).IntegerLiteral = match(IntegerLiteral);
				 ((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).IntegerLiteral!=null?((Poke_argsContext)_localctx).IntegerLiteral.getText():null); 
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 11);
				{
				setState(1866);
				((Poke_argsContext)_localctx).StringLiteral = match(StringLiteral);
				 ((Poke_argsContext)_localctx).str =  (((Poke_argsContext)_localctx).StringLiteral!=null?((Poke_argsContext)_localctx).StringLiteral.getText():null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPOKE_FLDContext extends ParserRuleContext {
		public int i_poke_type = 0;
		public int i_progs = 0;
		public int i_args = 0;
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public Token state;
		public Token poke_type;
		public Poke_argsContext pt_name;
		public Token diag_num;
		public Token group_num;
		public Token prg_num;
		public Token num_of_progs;
		public Token prog_num;
		public Token num_of_args;
		public Poke_argsContext arg;
		public Poke_argsContext set_num;
		public Token set_val;
		public TerminalNode C_POKE_FLD() { return getToken(glParser.C_POKE_FLD, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode BlinkPattern() { return getToken(glParser.BlinkPattern, 0); }
		public List<TerminalNode> IntegerLiteral() { return getTokens(glParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(glParser.IntegerLiteral, i);
		}
		public List<Poke_argsContext> poke_args() {
			return getRuleContexts(Poke_argsContext.class);
		}
		public Poke_argsContext poke_args(int i) {
			return getRuleContext(Poke_argsContext.class,i);
		}
		public CmdPOKE_FLDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPOKE_FLD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdPOKE_FLD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdPOKE_FLD(this);
		}
	}

	public final CmdPOKE_FLDContext cmdPOKE_FLD() throws RecognitionException {
		CmdPOKE_FLDContext _localctx = new CmdPOKE_FLDContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_cmdPOKE_FLD);

			ST tmplt = new ST("Gpoke_fld_<type>(<x>,<y>,<w>,<h>,<state>,<variant>);");
			boolean first_progs = true;
			boolean first_args = true;

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			match(C_POKE_FLD);
			setState(1871);
			((CmdPOKE_FLDContext)_localctx).x = literal_numbers();
			 tmplt.add("x", macroPort.calcX((((CmdPOKE_FLDContext)_localctx).x!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).x.start,((CmdPOKE_FLDContext)_localctx).x.stop):null))); 
			setState(1873);
			((CmdPOKE_FLDContext)_localctx).y = literal_numbers();
			 tmplt.add("y", macroPort.calcY((((CmdPOKE_FLDContext)_localctx).y!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).y.start,((CmdPOKE_FLDContext)_localctx).y.stop):null))); macroBBox.addPoint((((CmdPOKE_FLDContext)_localctx).x!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).x.start,((CmdPOKE_FLDContext)_localctx).x.stop):null), (((CmdPOKE_FLDContext)_localctx).y!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).y.start,((CmdPOKE_FLDContext)_localctx).y.stop):null)); 
			setState(1875);
			((CmdPOKE_FLDContext)_localctx).w = literal_numbers();
			 tmplt.add("w", macroPort.calcW((((CmdPOKE_FLDContext)_localctx).w!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).w.start,((CmdPOKE_FLDContext)_localctx).w.stop):null))); 
			setState(1877);
			((CmdPOKE_FLDContext)_localctx).h = literal_numbers();
			 tmplt.add("h", macroPort.calcH((((CmdPOKE_FLDContext)_localctx).h!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).h.start,((CmdPOKE_FLDContext)_localctx).h.stop):null))); macroBBox.addRect((((CmdPOKE_FLDContext)_localctx).x!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).x.start,((CmdPOKE_FLDContext)_localctx).x.stop):null), (((CmdPOKE_FLDContext)_localctx).y!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).y.start,((CmdPOKE_FLDContext)_localctx).y.stop):null), (((CmdPOKE_FLDContext)_localctx).w!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).w.start,((CmdPOKE_FLDContext)_localctx).w.stop):null), (((CmdPOKE_FLDContext)_localctx).h!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).h.start,((CmdPOKE_FLDContext)_localctx).h.stop):null)); 
			setState(1879);
			((CmdPOKE_FLDContext)_localctx).state = match(BlinkPattern);
			 tmplt.add("state", (((CmdPOKE_FLDContext)_localctx).state!=null?((CmdPOKE_FLDContext)_localctx).state.getText():null)); 
			setState(1881);
			((CmdPOKE_FLDContext)_localctx).poke_type = match(IntegerLiteral);
			 ((CmdPOKE_FLDContext)_localctx).i_poke_type =  (((CmdPOKE_FLDContext)_localctx).poke_type!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).poke_type.getText()):0); 
			setState(1960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				{
				setState(1883);
				if (!( _localctx.i_poke_type == 0 )) throw new FailedPredicateException(this, " $i_poke_type == 0 ");
				setState(1884);
				((CmdPOKE_FLDContext)_localctx).pt_name = poke_args();
				 // Синтаксический анализатор не может выполнить действие, пока он не решил, какую альтернативу сосоставить 
								//System.out.println("Process point (0)");
								tmplt.add("type", "pp0");
								tmplt.add("variant", ((CmdPOKE_FLDContext)_localctx).pt_name.str);
							
				}
				}
				break;
			case 2:
				{
				{
				setState(1887);
				if (!( _localctx.i_poke_type == 2 )) throw new FailedPredicateException(this, " $i_poke_type == 2 ");
				setState(1888);
				((CmdPOKE_FLDContext)_localctx).diag_num = match(IntegerLiteral);
				setState(1889);
				((CmdPOKE_FLDContext)_localctx).group_num = match(IntegerLiteral);

								//System.out.println("Diagram and group (2)");
								tmplt.add("type", "dg2");
								tmplt.add("variant", (((CmdPOKE_FLDContext)_localctx).diag_num!=null?((CmdPOKE_FLDContext)_localctx).diag_num.getText():null)+","+(((CmdPOKE_FLDContext)_localctx).group_num!=null?((CmdPOKE_FLDContext)_localctx).group_num.getText():null));
							
				}
				}
				break;
			case 3:
				{
				{
				setState(1891);
				if (!( _localctx.i_poke_type == 3 )) throw new FailedPredicateException(this, " $i_poke_type == 3 ");
				setState(1892);
				((CmdPOKE_FLDContext)_localctx).prg_num = match(IntegerLiteral);

								//System.out.println("Run 1 Application program (3)");
								tmplt.add("type", "ap3");
								tmplt.add("variant", (((CmdPOKE_FLDContext)_localctx).prg_num!=null?((CmdPOKE_FLDContext)_localctx).prg_num.getText():null));
							
				}
				}
				break;
			case 4:
				{
				{
				setState(1894);
				if (!( _localctx.i_poke_type == 7 )) throw new FailedPredicateException(this, " $i_poke_type == 7 ");
				 tmplt.add("variant", "["); 
				setState(1896);
				((CmdPOKE_FLDContext)_localctx).num_of_progs = match(IntegerLiteral);
				 ((CmdPOKE_FLDContext)_localctx).i_progs =  0; first_progs = true; 
				setState(1921);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1898);
						if (!( _localctx.i_progs <= (((CmdPOKE_FLDContext)_localctx).num_of_progs!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).num_of_progs.getText()):0) )) throw new FailedPredicateException(this, " $i_progs <= $num_of_progs.int ");
						{
						setState(1899);
						((CmdPOKE_FLDContext)_localctx).prog_num = match(IntegerLiteral);

													if (first_progs) {
														first_progs = false;
														tmplt.add("variant", "{\"prog\":" + (((CmdPOKE_FLDContext)_localctx).prog_num!=null?((CmdPOKE_FLDContext)_localctx).prog_num.getText():null));		// Открывашка 2
													} else {
														tmplt.add("variant", ",{\"prog\":" + (((CmdPOKE_FLDContext)_localctx).prog_num!=null?((CmdPOKE_FLDContext)_localctx).prog_num.getText():null));
													}
												
						setState(1901);
						((CmdPOKE_FLDContext)_localctx).diag_num = match(IntegerLiteral);
						 tmplt.add("variant", ",\"diag\":" + (((CmdPOKE_FLDContext)_localctx).diag_num!=null?((CmdPOKE_FLDContext)_localctx).diag_num.getText():null) + ",\"arg\":["); 
						 DiagNumList.add((((CmdPOKE_FLDContext)_localctx).diag_num!=null?((CmdPOKE_FLDContext)_localctx).diag_num.getText():null)); 
						setState(1904);
						((CmdPOKE_FLDContext)_localctx).num_of_args = match(IntegerLiteral);
						 ((CmdPOKE_FLDContext)_localctx).i_args =  0; first_args = true; 
						setState(1913);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1906);
								if (!( _localctx.i_args < (((CmdPOKE_FLDContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).num_of_args.getText()):0) )) throw new FailedPredicateException(this, " $i_args < $num_of_args.int ");
								setState(1907);
								((CmdPOKE_FLDContext)_localctx).arg = poke_args();

																if (first_args) {
																	first_args = false;
																	tmplt.add("variant",       ((CmdPOKE_FLDContext)_localctx).arg.str);
																} else {
																	tmplt.add("variant", "," + ((CmdPOKE_FLDContext)_localctx).arg.str);
																}
															
								 _localctx.i_args++; 
								}
								} 
							}
							setState(1915);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
						}
						 tmplt.add("variant", "]"); 
						}
						 _localctx.i_progs++; tmplt.add("variant", "}"); 
						}
						} 
					}
					setState(1923);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}

								tmplt.add("variant", "]");											// Закрывашка 1
								//System.out.println("Run Application programs (7)");
								tmplt.add("type", "ap7");
							
				}
				}
				break;
			case 5:
				{
				{
				setState(1925);
				if (!( _localctx.i_poke_type == 23 )) throw new FailedPredicateException(this, " $i_poke_type == 23 ");
				setState(1926);
				((CmdPOKE_FLDContext)_localctx).set_num = poke_args();
				 tmplt.add("variant",       (((CmdPOKE_FLDContext)_localctx).set_num!=null?_input.getText(((CmdPOKE_FLDContext)_localctx).set_num.start,((CmdPOKE_FLDContext)_localctx).set_num.stop):null)); 
				setState(1928);
				((CmdPOKE_FLDContext)_localctx).set_val = match(IntegerLiteral);
				 tmplt.add("variant", "," + (((CmdPOKE_FLDContext)_localctx).set_val!=null?((CmdPOKE_FLDContext)_localctx).set_val.getText():null) + ",["); 
				setState(1930);
				((CmdPOKE_FLDContext)_localctx).num_of_progs = match(IntegerLiteral);
				 ((CmdPOKE_FLDContext)_localctx).i_progs =  0; first_progs = true; 
				setState(1954); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1932);
						if (!( _localctx.i_progs <= (((CmdPOKE_FLDContext)_localctx).num_of_progs!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).num_of_progs.getText()):0) )) throw new FailedPredicateException(this, " $i_progs <= $num_of_progs.int ");
						{
						setState(1933);
						((CmdPOKE_FLDContext)_localctx).prog_num = match(IntegerLiteral);

													if (first_progs) {
														first_progs = false;
														tmplt.add("variant", "{\"prog\":" + (((CmdPOKE_FLDContext)_localctx).prog_num!=null?((CmdPOKE_FLDContext)_localctx).prog_num.getText():null));					// Открывашка 2
													} else {
														tmplt.add("variant", ",{\"prog\":" + (((CmdPOKE_FLDContext)_localctx).prog_num!=null?((CmdPOKE_FLDContext)_localctx).prog_num.getText():null));
													}
												
						setState(1935);
						((CmdPOKE_FLDContext)_localctx).diag_num = match(IntegerLiteral);
						 tmplt.add("variant", ",\"diag\":" + (((CmdPOKE_FLDContext)_localctx).diag_num!=null?((CmdPOKE_FLDContext)_localctx).diag_num.getText():null) + ",\"arg\":["); 
						 DiagNumList.add((((CmdPOKE_FLDContext)_localctx).diag_num!=null?((CmdPOKE_FLDContext)_localctx).diag_num.getText():null)); 
						setState(1938);
						((CmdPOKE_FLDContext)_localctx).num_of_args = match(IntegerLiteral);
						 ((CmdPOKE_FLDContext)_localctx).i_args =  0; first_args = true; 
						setState(1948);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1940);
								if (!( (((CmdPOKE_FLDContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).num_of_args.getText()):0) != 0 )) throw new FailedPredicateException(this, " $num_of_args.int != 0 ");
								setState(1941);
								if (!( _localctx.i_args < (((CmdPOKE_FLDContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).num_of_args.getText()):0) )) throw new FailedPredicateException(this, " $i_args < $num_of_args.int ");
								setState(1942);
								((CmdPOKE_FLDContext)_localctx).arg = poke_args();

																if (first_args) {
																	first_args = false;
																	tmplt.add("variant",       ((CmdPOKE_FLDContext)_localctx).arg.str);
																} else {
																	tmplt.add("variant", "," + ((CmdPOKE_FLDContext)_localctx).arg.str);
																}
															
								 _localctx.i_args++; 
								}
								} 
							}
							setState(1950);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
						}
						 tmplt.add("variant", "]"); 
						}
						 _localctx.i_progs++; tmplt.add("variant", "}"); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1956); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

								tmplt.add("variant", "]");															// Закрывашка 1
								//System.out.println("Control (23)");
								tmplt.add("type", "ap23");
							
				}
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "POKE_FLD") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPOKE_STATEContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Token state;
		public TerminalNode C_POKE_STATE() { return getToken(glParser.C_POKE_STATE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode BlinkPattern() { return getToken(glParser.BlinkPattern, 0); }
		public CmdPOKE_STATEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPOKE_STATE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdPOKE_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdPOKE_STATE(this);
		}
	}

	public final CmdPOKE_STATEContext cmdPOKE_STATE() throws RecognitionException {
		CmdPOKE_STATEContext _localctx = new CmdPOKE_STATEContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_cmdPOKE_STATE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			match(C_POKE_STATE);
			setState(1963);
			((CmdPOKE_STATEContext)_localctx).x = literal_numbers();
			setState(1964);
			((CmdPOKE_STATEContext)_localctx).y = literal_numbers();
			 macroBBox.addPoint((((CmdPOKE_STATEContext)_localctx).x!=null?_input.getText(((CmdPOKE_STATEContext)_localctx).x.start,((CmdPOKE_STATEContext)_localctx).x.stop):null), (((CmdPOKE_STATEContext)_localctx).y!=null?_input.getText(((CmdPOKE_STATEContext)_localctx).y.start,((CmdPOKE_STATEContext)_localctx).y.stop):null)); 
			setState(1966);
			((CmdPOKE_STATEContext)_localctx).state = match(BlinkPattern);
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "POKE_STATE") + "Gpoke_state("+
					macroPort.calcX((((CmdPOKE_STATEContext)_localctx).x!=null?_input.getText(((CmdPOKE_STATEContext)_localctx).x.start,((CmdPOKE_STATEContext)_localctx).x.stop):null))+","+
					macroPort.calcY((((CmdPOKE_STATEContext)_localctx).y!=null?_input.getText(((CmdPOKE_STATEContext)_localctx).y.start,((CmdPOKE_STATEContext)_localctx).y.stop):null))+","+
					(((CmdPOKE_STATEContext)_localctx).state!=null?((CmdPOKE_STATEContext)_localctx).state.getText():null)+");"
				);

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdRUN_PROGRAMSContext extends ParserRuleContext {
		public int i_progs = 0;
		public int i_args = 0;
		public Token num_of_progs;
		public Token prog_num;
		public Token diag_num;
		public Token num_of_args;
		public Poke_argsContext arg;
		public TerminalNode C_RUN_PROGRAMS() { return getToken(glParser.C_RUN_PROGRAMS, 0); }
		public List<TerminalNode> IntegerLiteral() { return getTokens(glParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(glParser.IntegerLiteral, i);
		}
		public List<Poke_argsContext> poke_args() {
			return getRuleContexts(Poke_argsContext.class);
		}
		public Poke_argsContext poke_args(int i) {
			return getRuleContext(Poke_argsContext.class,i);
		}
		public CmdRUN_PROGRAMSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRUN_PROGRAMS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdRUN_PROGRAMS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdRUN_PROGRAMS(this);
		}
	}

	public final CmdRUN_PROGRAMSContext cmdRUN_PROGRAMS() throws RecognitionException {
		CmdRUN_PROGRAMSContext _localctx = new CmdRUN_PROGRAMSContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_cmdRUN_PROGRAMS);

			ST tmplt = new ST("Grun_programs(<variant>);");
			boolean first_progs = true;
			boolean first_args = true;

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			match(C_RUN_PROGRAMS);
			 tmplt.add("variant", "["); 
			setState(1970);
			((CmdRUN_PROGRAMSContext)_localctx).num_of_progs = match(IntegerLiteral);
			 ((CmdRUN_PROGRAMSContext)_localctx).i_progs =  0; first_progs = true; 
			setState(1994);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1972);
					if (!( _localctx.i_progs <= (((CmdRUN_PROGRAMSContext)_localctx).num_of_progs!=null?Integer.valueOf(((CmdRUN_PROGRAMSContext)_localctx).num_of_progs.getText()):0) )) throw new FailedPredicateException(this, " $i_progs <= $num_of_progs.int ");
					{
					setState(1973);
					((CmdRUN_PROGRAMSContext)_localctx).prog_num = match(IntegerLiteral);

										if (first_progs) {
											first_progs = false;
											tmplt.add("variant", "{\"prog\":" + (((CmdRUN_PROGRAMSContext)_localctx).prog_num!=null?((CmdRUN_PROGRAMSContext)_localctx).prog_num.getText():null));		// Открывашка 2
										} else {
											tmplt.add("variant", ",{\"prog\":" + (((CmdRUN_PROGRAMSContext)_localctx).prog_num!=null?((CmdRUN_PROGRAMSContext)_localctx).prog_num.getText():null));
										}
									
					setState(1975);
					((CmdRUN_PROGRAMSContext)_localctx).diag_num = match(IntegerLiteral);
					 tmplt.add("variant", ",\"diag\":" + (((CmdRUN_PROGRAMSContext)_localctx).diag_num!=null?((CmdRUN_PROGRAMSContext)_localctx).diag_num.getText():null) + ",\"arg\":["); 
					setState(1977);
					((CmdRUN_PROGRAMSContext)_localctx).num_of_args = match(IntegerLiteral);
					 ((CmdRUN_PROGRAMSContext)_localctx).i_args =  0; first_args = true; 
					setState(1986);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1979);
							if (!( _localctx.i_args < (((CmdRUN_PROGRAMSContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdRUN_PROGRAMSContext)_localctx).num_of_args.getText()):0) )) throw new FailedPredicateException(this, " $i_args < $num_of_args.int ");
							setState(1980);
							((CmdRUN_PROGRAMSContext)_localctx).arg = poke_args();

													if (first_args) {
														first_args = false;
														tmplt.add("variant",       ((CmdRUN_PROGRAMSContext)_localctx).arg.str);
													} else {
														tmplt.add("variant", "," + ((CmdRUN_PROGRAMSContext)_localctx).arg.str);
													}
												
							 _localctx.i_args++; 
							}
							} 
						}
						setState(1988);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					}
					 tmplt.add("variant", "]"); 
					}
					 _localctx.i_progs++; tmplt.add("variant", "}"); 
					}
					} 
				}
				setState(1996);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}

					tmplt.add("variant", "]");											// Закрывашка 1
				
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "RUN_PROGRAMS") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSETVALContext extends ParserRuleContext {
		public Literal_numbersContext literal_numbers;
		public TerminalNode C_SETVAL() { return getToken(glParser.C_SETVAL, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public CmdSETVALContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSETVAL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdSETVAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdSETVAL(this);
		}
	}

	public final CmdSETVALContext cmdSETVAL() throws RecognitionException {
		CmdSETVALContext _localctx = new CmdSETVALContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_cmdSETVAL);

			ST tmplt = new ST("Gsetval(<set>,<value>);");

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999);
			match(C_SETVAL);
			setState(2000);
			((CmdSETVALContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("set",   (((CmdSETVALContext)_localctx).literal_numbers!=null?_input.getText(((CmdSETVALContext)_localctx).literal_numbers.start,((CmdSETVALContext)_localctx).literal_numbers.stop):null)); 
			setState(2002);
			((CmdSETVALContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("value", (((CmdSETVALContext)_localctx).literal_numbers!=null?_input.getText(((CmdSETVALContext)_localctx).literal_numbers.start,((CmdSETVALContext)_localctx).literal_numbers.stop):null)); 
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "SETVAL") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdTIMEContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext literal_numbers;
		public Literal_numbersContext y;
		public Def_font_typeContext def_font_type;
		public TerminalNode C_TIME() { return getToken(glParser.C_TIME, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public Def_font_typeContext def_font_type() {
			return getRuleContext(Def_font_typeContext.class,0);
		}
		public CmdTIMEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdTIME; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdTIME(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdTIME(this);
		}
	}

	public final CmdTIMEContext cmdTIME() throws RecognitionException {
		CmdTIMEContext _localctx = new CmdTIMEContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_cmdTIME);

			ST tmplt = new ST("Gtime(<x>,<y>,<format>,<font_type_size>);");

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			match(C_TIME);
			setState(2006);
			((CmdTIMEContext)_localctx).x = ((CmdTIMEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("x", macroPort.calcX((((CmdTIMEContext)_localctx).x!=null?_input.getText(((CmdTIMEContext)_localctx).x.start,((CmdTIMEContext)_localctx).x.stop):null))); 
			setState(2008);
			((CmdTIMEContext)_localctx).y = ((CmdTIMEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("y", macroPort.calcY((((CmdTIMEContext)_localctx).y!=null?_input.getText(((CmdTIMEContext)_localctx).y.start,((CmdTIMEContext)_localctx).y.stop):null)));
									  macroBBox.addPoint((((CmdTIMEContext)_localctx).x!=null?_input.getText(((CmdTIMEContext)_localctx).x.start,((CmdTIMEContext)_localctx).x.stop):null), (((CmdTIMEContext)_localctx).y!=null?_input.getText(((CmdTIMEContext)_localctx).y.start,((CmdTIMEContext)_localctx).y.stop):null)); 
			setState(2010);
			((CmdTIMEContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("format",         (((CmdTIMEContext)_localctx).literal_numbers!=null?_input.getText(((CmdTIMEContext)_localctx).literal_numbers.start,((CmdTIMEContext)_localctx).literal_numbers.stop):null)); 
			setState(2012);
			((CmdTIMEContext)_localctx).def_font_type = def_font_type();
			 tmplt.add("font_type_size", ((CmdTIMEContext)_localctx).def_font_type.str);    
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "TIME") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdXY_PLOTContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext literal_numbers;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public ValueContext value;
		public Token sclflg;
		public Token shape_plot;
		public Token Identifier;
		public Token inv1;
		public Token inv2;
		public TerminalNode C_XY_PLOT() { return getToken(glParser.C_XY_PLOT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode SCALE() { return getToken(glParser.SCALE, 0); }
		public TerminalNode NOSCALE() { return getToken(glParser.NOSCALE, 0); }
		public List<TerminalNode> Identifier() { return getTokens(glParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(glParser.Identifier, i);
		}
		public TerminalNode SHAPE_PLOT() { return getToken(glParser.SHAPE_PLOT, 0); }
		public List<TerminalNode> NONE() { return getTokens(glParser.NONE); }
		public TerminalNode NONE(int i) {
			return getToken(glParser.NONE, i);
		}
		public List<TerminalNode> TTB() { return getTokens(glParser.TTB); }
		public TerminalNode TTB(int i) {
			return getToken(glParser.TTB, i);
		}
		public List<TerminalNode> RTL() { return getTokens(glParser.RTL); }
		public TerminalNode RTL(int i) {
			return getToken(glParser.RTL, i);
		}
		public List<TerminalNode> BOTH() { return getTokens(glParser.BOTH); }
		public TerminalNode BOTH(int i) {
			return getToken(glParser.BOTH, i);
		}
		public CmdXY_PLOTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdXY_PLOT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdXY_PLOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdXY_PLOT(this);
		}
	}

	public final CmdXY_PLOTContext cmdXY_PLOT() throws RecognitionException {
		CmdXY_PLOTContext _localctx = new CmdXY_PLOTContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_cmdXY_PLOT);

			ST tmplt = new ST("Gxy_plot("+
				"<x>,<y>,<w>,<h>,"+
				"<x_pt_name_rec_fld>,<x_low>,<x_high>,"+
				"<y_pt_name_rec_fld>,<y_low>,<y_high>,"+
				"<scale_flag>,<update_rate>,"+
				"<shape_plot>,"+
				"<current_shape>,<shapew1>,<shapeh1>,<rot1>,<inv1>,"+
				"<history_shape>,<shapew2>,<shapeh2>,<rot2>,<inv2>,<n>);");

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			match(C_XY_PLOT);
			setState(2016);
			((CmdXY_PLOTContext)_localctx).x = ((CmdXY_PLOTContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("x", macroPort.calcX((((CmdXY_PLOTContext)_localctx).x!=null?_input.getText(((CmdXY_PLOTContext)_localctx).x.start,((CmdXY_PLOTContext)_localctx).x.stop):null))); 
			setState(2018);
			((CmdXY_PLOTContext)_localctx).y = ((CmdXY_PLOTContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("y", macroPort.calcY((((CmdXY_PLOTContext)_localctx).y!=null?_input.getText(((CmdXY_PLOTContext)_localctx).y.start,((CmdXY_PLOTContext)_localctx).y.stop):null)));
									  macroBBox.addPoint((((CmdXY_PLOTContext)_localctx).x!=null?_input.getText(((CmdXY_PLOTContext)_localctx).x.start,((CmdXY_PLOTContext)_localctx).x.stop):null), (((CmdXY_PLOTContext)_localctx).y!=null?_input.getText(((CmdXY_PLOTContext)_localctx).y.start,((CmdXY_PLOTContext)_localctx).y.stop):null)); 
			setState(2020);
			((CmdXY_PLOTContext)_localctx).w = ((CmdXY_PLOTContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("w", macroPort.calcW((((CmdXY_PLOTContext)_localctx).w!=null?_input.getText(((CmdXY_PLOTContext)_localctx).w.start,((CmdXY_PLOTContext)_localctx).w.stop):null))); 
			setState(2022);
			((CmdXY_PLOTContext)_localctx).h = ((CmdXY_PLOTContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("h", macroPort.calcH((((CmdXY_PLOTContext)_localctx).h!=null?_input.getText(((CmdXY_PLOTContext)_localctx).h.start,((CmdXY_PLOTContext)_localctx).h.stop):null)));
									  macroBBox.addRect((((CmdXY_PLOTContext)_localctx).x!=null?_input.getText(((CmdXY_PLOTContext)_localctx).x.start,((CmdXY_PLOTContext)_localctx).x.stop):null), (((CmdXY_PLOTContext)_localctx).y!=null?_input.getText(((CmdXY_PLOTContext)_localctx).y.start,((CmdXY_PLOTContext)_localctx).y.stop):null), (((CmdXY_PLOTContext)_localctx).w!=null?_input.getText(((CmdXY_PLOTContext)_localctx).w.start,((CmdXY_PLOTContext)_localctx).w.stop):null), (((CmdXY_PLOTContext)_localctx).h!=null?_input.getText(((CmdXY_PLOTContext)_localctx).h.start,((CmdXY_PLOTContext)_localctx).h.stop):null)); 
			setState(2024);
			((CmdXY_PLOTContext)_localctx).value = value();
			 tmplt.add("x_pt_name_rec_fld", ((CmdXY_PLOTContext)_localctx).value.str); 
			setState(2026);
			((CmdXY_PLOTContext)_localctx).value = value();
			 tmplt.add("x_low",             ((CmdXY_PLOTContext)_localctx).value.str); 
			setState(2028);
			((CmdXY_PLOTContext)_localctx).value = value();
			 tmplt.add("x_high",            ((CmdXY_PLOTContext)_localctx).value.str); 
			setState(2030);
			((CmdXY_PLOTContext)_localctx).value = value();
			 tmplt.add("y_pt_name_rec_fld", ((CmdXY_PLOTContext)_localctx).value.str); 
			setState(2032);
			((CmdXY_PLOTContext)_localctx).value = value();
			 tmplt.add("y_low",             ((CmdXY_PLOTContext)_localctx).value.str); 
			setState(2034);
			((CmdXY_PLOTContext)_localctx).value = value();
			 tmplt.add("y_high",            ((CmdXY_PLOTContext)_localctx).value.str); 
			setState(2036);
			((CmdXY_PLOTContext)_localctx).sclflg = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SCALE || _la==NOSCALE) ) {
				((CmdXY_PLOTContext)_localctx).sclflg = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 tmplt.add("scale_flag",        (((CmdXY_PLOTContext)_localctx).sclflg!=null?((CmdXY_PLOTContext)_localctx).sclflg.getText():null)); 
			setState(2038);
			((CmdXY_PLOTContext)_localctx).literal_numbers = literal_numbers();
			 tmplt.add("update_rate",       (((CmdXY_PLOTContext)_localctx).literal_numbers!=null?_input.getText(((CmdXY_PLOTContext)_localctx).literal_numbers.start,((CmdXY_PLOTContext)_localctx).literal_numbers.stop):null)); 
			setState(2065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHAPE_PLOT) {
				{
				setState(2040);
				((CmdXY_PLOTContext)_localctx).shape_plot = match(SHAPE_PLOT);
				 tmplt.add("shape_plot",    (((CmdXY_PLOTContext)_localctx).shape_plot!=null?((CmdXY_PLOTContext)_localctx).shape_plot.getText():null)); 
				setState(2042);
				((CmdXY_PLOTContext)_localctx).Identifier = match(Identifier);
				 tmplt.add("current_shape", (((CmdXY_PLOTContext)_localctx).Identifier!=null?((CmdXY_PLOTContext)_localctx).Identifier.getText():null)); 
				setState(2044);
				((CmdXY_PLOTContext)_localctx).literal_numbers = literal_numbers();
				 tmplt.add("shapew1",       (((CmdXY_PLOTContext)_localctx).literal_numbers!=null?_input.getText(((CmdXY_PLOTContext)_localctx).literal_numbers.start,((CmdXY_PLOTContext)_localctx).literal_numbers.stop):null)); 
				setState(2046);
				((CmdXY_PLOTContext)_localctx).literal_numbers = literal_numbers();
				 tmplt.add("shapeh1",       (((CmdXY_PLOTContext)_localctx).literal_numbers!=null?_input.getText(((CmdXY_PLOTContext)_localctx).literal_numbers.start,((CmdXY_PLOTContext)_localctx).literal_numbers.stop):null)); 
				setState(2048);
				((CmdXY_PLOTContext)_localctx).value = value();
				 tmplt.add("rot1",          ((CmdXY_PLOTContext)_localctx).value.str); 
				setState(2050);
				((CmdXY_PLOTContext)_localctx).inv1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << TTB) | (1L << RTL) | (1L << BOTH))) != 0)) ) {
					((CmdXY_PLOTContext)_localctx).inv1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 tmplt.add("inv1",          (((CmdXY_PLOTContext)_localctx).inv1!=null?((CmdXY_PLOTContext)_localctx).inv1.getText():null)); 
				setState(2052);
				((CmdXY_PLOTContext)_localctx).Identifier = match(Identifier);
				 tmplt.add("history_shape", (((CmdXY_PLOTContext)_localctx).Identifier!=null?((CmdXY_PLOTContext)_localctx).Identifier.getText():null)); 
				setState(2054);
				((CmdXY_PLOTContext)_localctx).literal_numbers = literal_numbers();
				 tmplt.add("shapew2",       (((CmdXY_PLOTContext)_localctx).literal_numbers!=null?_input.getText(((CmdXY_PLOTContext)_localctx).literal_numbers.start,((CmdXY_PLOTContext)_localctx).literal_numbers.stop):null)); 
				setState(2056);
				((CmdXY_PLOTContext)_localctx).literal_numbers = literal_numbers();
				 tmplt.add("shapeh2",       (((CmdXY_PLOTContext)_localctx).literal_numbers!=null?_input.getText(((CmdXY_PLOTContext)_localctx).literal_numbers.start,((CmdXY_PLOTContext)_localctx).literal_numbers.stop):null)); 
				setState(2058);
				((CmdXY_PLOTContext)_localctx).value = value();
				 tmplt.add("rot2",          ((CmdXY_PLOTContext)_localctx).value.str); 
				setState(2060);
				((CmdXY_PLOTContext)_localctx).inv2 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << TTB) | (1L << RTL) | (1L << BOTH))) != 0)) ) {
					((CmdXY_PLOTContext)_localctx).inv2 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 tmplt.add("inv2",          (((CmdXY_PLOTContext)_localctx).inv1!=null?((CmdXY_PLOTContext)_localctx).inv1.getText():null)); 
				setState(2062);
				((CmdXY_PLOTContext)_localctx).literal_numbers = literal_numbers();
				 tmplt.add("n",             (((CmdXY_PLOTContext)_localctx).literal_numbers!=null?_input.getText(((CmdXY_PLOTContext)_localctx).literal_numbers.start,((CmdXY_PLOTContext)_localctx).literal_numbers.stop):null)); 
				}
			}

			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "XY_PLOT") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdTRENDContext extends ParserRuleContext {
		public Literal_numbersContext x;
		public Literal_numbersContext y;
		public Literal_numbersContext w;
		public Literal_numbersContext h;
		public Token ornt;
		public ValueContext value;
		public TerminalNode C_TREND() { return getToken(glParser.C_TREND, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode NOSCALE() { return getToken(glParser.NOSCALE, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode HORZ() { return getToken(glParser.HORZ, 0); }
		public TerminalNode VERT() { return getToken(glParser.VERT, 0); }
		public CmdTRENDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdTREND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdTREND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdTREND(this);
		}
	}

	public final CmdTRENDContext cmdTREND() throws RecognitionException {
		CmdTRENDContext _localctx = new CmdTRENDContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_cmdTREND);

			ST tmplt = new ST("Gtrend("+
				"<x>,<y>,<w>,<h>,<orientation>,<pt_name_rec_fld>,<low_limit>,<high_limit>,<value>,<interval>);");

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			match(C_TREND);
			setState(2068);
			((CmdTRENDContext)_localctx).x = literal_numbers();
			 tmplt.add("x", macroPort.calcX((((CmdTRENDContext)_localctx).x!=null?_input.getText(((CmdTRENDContext)_localctx).x.start,((CmdTRENDContext)_localctx).x.stop):null))); 
			setState(2070);
			((CmdTRENDContext)_localctx).y = literal_numbers();
			 tmplt.add("y", macroPort.calcY((((CmdTRENDContext)_localctx).y!=null?_input.getText(((CmdTRENDContext)_localctx).y.start,((CmdTRENDContext)_localctx).y.stop):null)));
									  macroBBox.addPoint((((CmdTRENDContext)_localctx).x!=null?_input.getText(((CmdTRENDContext)_localctx).x.start,((CmdTRENDContext)_localctx).x.stop):null), (((CmdTRENDContext)_localctx).y!=null?_input.getText(((CmdTRENDContext)_localctx).y.start,((CmdTRENDContext)_localctx).y.stop):null)); 
			setState(2072);
			((CmdTRENDContext)_localctx).w = literal_numbers();
			 tmplt.add("w", macroPort.calcW((((CmdTRENDContext)_localctx).w!=null?_input.getText(((CmdTRENDContext)_localctx).w.start,((CmdTRENDContext)_localctx).w.stop):null))); 
			setState(2074);
			((CmdTRENDContext)_localctx).h = literal_numbers();
			 tmplt.add("h", macroPort.calcH((((CmdTRENDContext)_localctx).h!=null?_input.getText(((CmdTRENDContext)_localctx).h.start,((CmdTRENDContext)_localctx).h.stop):null)));
									  macroBBox.addRect((((CmdTRENDContext)_localctx).x!=null?_input.getText(((CmdTRENDContext)_localctx).x.start,((CmdTRENDContext)_localctx).x.stop):null), (((CmdTRENDContext)_localctx).y!=null?_input.getText(((CmdTRENDContext)_localctx).y.start,((CmdTRENDContext)_localctx).y.stop):null), (((CmdTRENDContext)_localctx).w!=null?_input.getText(((CmdTRENDContext)_localctx).w.start,((CmdTRENDContext)_localctx).w.stop):null), (((CmdTRENDContext)_localctx).h!=null?_input.getText(((CmdTRENDContext)_localctx).h.start,((CmdTRENDContext)_localctx).h.stop):null)); 
			setState(2076);
			((CmdTRENDContext)_localctx).ornt = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==HORZ || _la==VERT) ) {
				((CmdTRENDContext)_localctx).ornt = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 tmplt.add("orientation", (((CmdTRENDContext)_localctx).ornt!=null?((CmdTRENDContext)_localctx).ornt.getText():null)); 
			setState(2078);
			((CmdTRENDContext)_localctx).value = value();
			 tmplt.add("pt_name_rec_fld", ((CmdTRENDContext)_localctx).value.str); 
			setState(2080);
			((CmdTRENDContext)_localctx).value = value();
			 tmplt.add("low_limit", ((CmdTRENDContext)_localctx).value.str); 
			setState(2082);
			((CmdTRENDContext)_localctx).value = value();
			 tmplt.add("high_limit", ((CmdTRENDContext)_localctx).value.str); 
			setState(2084);
			((CmdTRENDContext)_localctx).value = value();
			 tmplt.add("value", ((CmdTRENDContext)_localctx).value.str); 
			setState(2086);
			((CmdTRENDContext)_localctx).value = value();
			 tmplt.add("interval", ((CmdTRENDContext)_localctx).value.str); 
			setState(2088);
			match(NOSCALE);
			}
			_ctx.stop = _input.LT(-1);

				println(UseCommands.get_use_cmds(section, "TREND") + tmplt.render());

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPTR_MOVEContext extends ParserRuleContext {
		public Token pointer_name;
		public ValueContext operand1;
		public ValueContext operand2;
		public ValueContext operand3;
		public TerminalNode C_PTR_MOVE() { return getToken(glParser.C_PTR_MOVE, 0); }
		public TerminalNode Ppointer() { return getToken(glParser.Ppointer, 0); }
		public TerminalNode OP_ADD() { return getToken(glParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(glParser.OP_SUB, 0); }
		public TerminalNode OP_MULT() { return getToken(glParser.OP_MULT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public CmdPTR_MOVEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPTR_MOVE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdPTR_MOVE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdPTR_MOVE(this);
		}
	}

	public final CmdPTR_MOVEContext cmdPTR_MOVE() throws RecognitionException {
		CmdPTR_MOVEContext _localctx = new CmdPTR_MOVEContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_cmdPTR_MOVE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2090);
			match(C_PTR_MOVE);
			setState(2091);
			((CmdPTR_MOVEContext)_localctx).pointer_name = match(Ppointer);
			setState(2101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_ADD:
				{
				{
				setState(2092);
				match(OP_ADD);
				setState(2093);
				((CmdPTR_MOVEContext)_localctx).operand1 = value();
				}
				}
				break;
			case OP_SUB:
				{
				{
				setState(2094);
				match(OP_SUB);
				setState(2095);
				((CmdPTR_MOVEContext)_localctx).operand1 = value();
				}
				}
				break;
			case OP_MULT:
				{
				{
				setState(2096);
				match(OP_MULT);
				setState(2097);
				((CmdPTR_MOVEContext)_localctx).operand1 = value();
				setState(2098);
				((CmdPTR_MOVEContext)_localctx).operand2 = value();
				setState(2099);
				((CmdPTR_MOVEContext)_localctx).operand3 = value();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPOINTERContext extends ParserRuleContext {
		public Token ptr_name;
		public Literal_numbersContext segment;
		public Literal_numbersContext offset;
		public TerminalNode C_POINTER() { return getToken(glParser.C_POINTER, 0); }
		public List<Literal_numbersContext> literal_numbers() {
			return getRuleContexts(Literal_numbersContext.class);
		}
		public Literal_numbersContext literal_numbers(int i) {
			return getRuleContext(Literal_numbersContext.class,i);
		}
		public TerminalNode Ppointer() { return getToken(glParser.Ppointer, 0); }
		public TerminalNode Hpointer() { return getToken(glParser.Hpointer, 0); }
		public CmdPOINTERContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPOINTER; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).enterCmdPOINTER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glParserListener ) ((glParserListener)listener).exitCmdPOINTER(this);
		}
	}

	public final CmdPOINTERContext cmdPOINTER() throws RecognitionException {
		CmdPOINTERContext _localctx = new CmdPOINTERContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_cmdPOINTER);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			match(C_POINTER);
			setState(2104);
			((CmdPOINTERContext)_localctx).ptr_name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Hpointer || _la==Ppointer) ) {
				((CmdPOINTERContext)_localctx).ptr_name = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2105);
			((CmdPOINTERContext)_localctx).segment = literal_numbers();
			setState(2106);
			((CmdPOINTERContext)_localctx).offset = literal_numbers();
			}
			_ctx.stop = _input.LT(-1);

				String pointer_name = (((CmdPOINTERContext)_localctx).ptr_name!=null?((CmdPOINTERContext)_localctx).ptr_name.getText():null).substring(0, 2);
				String pointer_number = (((CmdPOINTERContext)_localctx).ptr_name!=null?((CmdPOINTERContext)_localctx).ptr_name.getText():null).substring(3).replace("]", "");
			//	println("def"+pointer_name+"("+pointer_number+","+(((CmdPOINTERContext)_localctx).segment!=null?_input.getText(((CmdPOINTERContext)_localctx).segment.start,((CmdPOINTERContext)_localctx).segment.stop):null)+","+(((CmdPOINTERContext)_localctx).offset!=null?_input.getText(((CmdPOINTERContext)_localctx).offset.start,((CmdPOINTERContext)_localctx).offset.stop):null)+");");
			//	println(" //POINTER "+(((CmdPOINTERContext)_localctx).ptr_name!=null?((CmdPOINTERContext)_localctx).ptr_name.getText():null)+" "+(((CmdPOINTERContext)_localctx).segment!=null?_input.getText(((CmdPOINTERContext)_localctx).segment.start,((CmdPOINTERContext)_localctx).segment.stop):null)+" "+(((CmdPOINTERContext)_localctx).offset!=null?_input.getText(((CmdPOINTERContext)_localctx).offset.start,((CmdPOINTERContext)_localctx).offset.stop):null));

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 40:
			return cmdLINE_sempred((CmdLINEContext)_localctx, predIndex);
		case 45:
			return cmdPOLYGON_sempred((CmdPOLYGONContext)_localctx, predIndex);
		case 71:
			return cmdMACRO_sempred((CmdMACROContext)_localctx, predIndex);
		case 72:
			return cmdDEF_MACRO_PARAMS_sempred((CmdDEF_MACRO_PARAMSContext)_localctx, predIndex);
		case 74:
			return def_macro_d_list_sempred((Def_macro_d_listContext)_localctx, predIndex);
		case 75:
			return def_macro_t_list_other_sempred((Def_macro_t_list_otherContext)_localctx, predIndex);
		case 76:
			return def_macro_t_list_bg_sempred((Def_macro_t_list_bgContext)_localctx, predIndex);
		case 77:
			return def_macro_set_list_sempred((Def_macro_set_listContext)_localctx, predIndex);
		case 78:
			return def_macro_const_list_sempred((Def_macro_const_listContext)_localctx, predIndex);
		case 79:
			return def_macro_status_list_sempred((Def_macro_status_listContext)_localctx, predIndex);
		case 80:
			return def_macro_color_list_sempred((Def_macro_color_listContext)_localctx, predIndex);
		case 81:
			return def_macro_olcolor_list_sempred((Def_macro_olcolor_listContext)_localctx, predIndex);
		case 85:
			return math_equation_sempred((Math_equationContext)_localctx, predIndex);
		case 87:
			return cmdOL_BUTTON_sempred((CmdOL_BUTTONContext)_localctx, predIndex);
		case 93:
			return cmdPOKE_FLD_sempred((CmdPOKE_FLDContext)_localctx, predIndex);
		case 95:
			return cmdRUN_PROGRAMS_sempred((CmdRUN_PROGRAMSContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cmdLINE_sempred(CmdLINEContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return  section == Section.I_SHAPELIB ;
		}
		return true;
	}
	private boolean cmdPOLYGON_sempred(CmdPOLYGONContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return  section == Section.I_SHAPELIB ;
		}
		return true;
	}
	private boolean cmdMACRO_sempred(CmdMACROContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return  _localctx.i <= _localctx.i_D ;
		case 16:
			return  _localctx.i <= _localctx.i_T_other ;
		case 17:
			return  _localctx.i <= _localctx.i_T_bg ;
		case 18:
			return  _localctx.i <= _localctx.i_SET ;
		case 19:
			return  _localctx.i <= _localctx.i_CONST ;
		case 20:
			return  _localctx.i <= (((CmdMACROContext)_localctx).n_STATUS!=null?Integer.valueOf(((CmdMACROContext)_localctx).n_STATUS.getText()):0) ;
		case 21:
			return  _localctx.i <= _localctx.i_COLOR ;
		case 22:
			return  _localctx.i <= _localctx.i_OLCOLOR ;
		}
		return true;
	}
	private boolean cmdDEF_MACRO_PARAMS_sempred(CmdDEF_MACRO_PARAMSContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return  _localctx.i <= _localctx.i_D ;
		case 24:
			return  _localctx.i <= _localctx.i_T_other ;
		case 25:
			return  _localctx.i <= _localctx.i_T_bg ;
		case 26:
			return  _localctx.i <= _localctx.i_SET ;
		case 27:
			return  _localctx.i <= _localctx.i_CONST ;
		case 28:
			return  _localctx.i <= (((CmdDEF_MACRO_PARAMSContext)_localctx).n_STATUS!=null?Integer.valueOf(((CmdDEF_MACRO_PARAMSContext)_localctx).n_STATUS.getText()):0) ;
		case 29:
			return  _localctx.i <= _localctx.i_COLOR ;
		case 30:
			return  _localctx.i <= _localctx.i_OLCOLOR ;
		}
		return true;
	}
	private boolean def_macro_d_list_sempred(Def_macro_d_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return  _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_D ;
		}
		return true;
	}
	private boolean def_macro_t_list_other_sempred(Def_macro_t_list_otherContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return  _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_T_other ;
		}
		return true;
	}
	private boolean def_macro_t_list_bg_sempred(Def_macro_t_list_bgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return  _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_T_bg ;
		}
		return true;
	}
	private boolean def_macro_set_list_sempred(Def_macro_set_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return  _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_SET ;
		}
		return true;
	}
	private boolean def_macro_const_list_sempred(Def_macro_const_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return  _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_CONST ;
		}
		return true;
	}
	private boolean def_macro_status_list_sempred(Def_macro_status_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return  _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_STATUS ;
		}
		return true;
	}
	private boolean def_macro_color_list_sempred(Def_macro_color_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return  _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_COLOR ;
		}
		return true;
	}
	private boolean def_macro_olcolor_list_sempred(Def_macro_olcolor_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return  _localctx.i<=((CmdDEF_MACROContext)getInvokingContext(73)).i_OLCOLOR ;
		}
		return true;
	}
	private boolean math_equation_sempred(Math_equationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 4);
		case 40:
			return precpred(_ctx, 3);
		case 41:
			return precpred(_ctx, 2);
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean cmdOL_BUTTON_sempred(CmdOL_BUTTONContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return  _localctx.i_poke_type == 0 ;
		case 44:
			return  _localctx.i_poke_type == 2 ;
		case 45:
			return  _localctx.i_poke_type == 3 ;
		case 46:
			return  _localctx.i_poke_type == 9 ;
		case 47:
			return  _localctx.i_poke_type == 7 ;
		case 48:
			return  _localctx.i_progs <= (((CmdOL_BUTTONContext)_localctx).num_of_progs!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).num_of_progs.getText()):0) ;
		case 49:
			return  _localctx.i_args < (((CmdOL_BUTTONContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).num_of_args.getText()):0) ;
		case 50:
			return  _localctx.i_poke_type == 23 ;
		case 51:
			return  _localctx.i_progs <= (((CmdOL_BUTTONContext)_localctx).num_of_progs!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).num_of_progs.getText()):0) ;
		case 52:
			return  (((CmdOL_BUTTONContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).num_of_args.getText()):0) != 0 ;
		case 53:
			return  _localctx.i_args < (((CmdOL_BUTTONContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdOL_BUTTONContext)_localctx).num_of_args.getText()):0) ;
		}
		return true;
	}
	private boolean cmdPOKE_FLD_sempred(CmdPOKE_FLDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return  _localctx.i_poke_type == 0 ;
		case 55:
			return  _localctx.i_poke_type == 2 ;
		case 56:
			return  _localctx.i_poke_type == 3 ;
		case 57:
			return  _localctx.i_poke_type == 7 ;
		case 58:
			return  _localctx.i_progs <= (((CmdPOKE_FLDContext)_localctx).num_of_progs!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).num_of_progs.getText()):0) ;
		case 59:
			return  _localctx.i_args < (((CmdPOKE_FLDContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).num_of_args.getText()):0) ;
		case 60:
			return  _localctx.i_poke_type == 23 ;
		case 61:
			return  _localctx.i_progs <= (((CmdPOKE_FLDContext)_localctx).num_of_progs!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).num_of_progs.getText()):0) ;
		case 62:
			return  (((CmdPOKE_FLDContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).num_of_args.getText()):0) != 0 ;
		case 63:
			return  _localctx.i_args < (((CmdPOKE_FLDContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdPOKE_FLDContext)_localctx).num_of_args.getText()):0) ;
		}
		return true;
	}
	private boolean cmdRUN_PROGRAMS_sempred(CmdRUN_PROGRAMSContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64:
			return  _localctx.i_progs <= (((CmdRUN_PROGRAMSContext)_localctx).num_of_progs!=null?Integer.valueOf(((CmdRUN_PROGRAMSContext)_localctx).num_of_progs.getText()):0) ;
		case 65:
			return  _localctx.i_args < (((CmdRUN_PROGRAMSContext)_localctx).num_of_args!=null?Integer.valueOf(((CmdRUN_PROGRAMSContext)_localctx).num_of_args.getText()):0) ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e1\u083f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\7\2\u00d0\n\2\f\2\16"+
		"\2\u00d3\13\2\3\2\3\2\3\2\3\3\3\3\5\3\u00da\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u00e2\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0120\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0136\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0172\n\13\3\13\3\13\5\13\u0176\n\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u018c\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0193\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u019a\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u01a1\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u01a8\n\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u01af\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u01b6\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u01bd\n\21\5\21\u01bf\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01d0\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\6\24\u01db\n\24\r\24\16\24\u01dc\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u01e9\n\25\r\25"+
		"\16\25\u01ea\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\6\27\u01fa\n\27\r\27\16\27\u01fb\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0206\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u023c\n\30\f\30\16\30\u023f\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u024c\n\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0252\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u025c\n\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u026a"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0273\n\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\5\37\u027d\n\37\3\37\3\37\3\37\3\37\5\37\u0283"+
		"\n\37\3\37\3\37\3\37\3\37\5\37\u0289\n\37\3\37\3\37\3\37\3\37\5\37\u028f"+
		"\n\37\3\37\3\37\3\37\3\37\5\37\u0295\n\37\3 \3 \5 \u0299\n \3 \3 \3 \3"+
		" \5 \u029f\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u02bd\n \3!\3!\3!\3!\6!\u02c3\n!\r!\16"+
		"!\u02c4\3\"\5\"\u02c8\n\"\3\"\3\"\5\"\u02cc\n\"\3\"\3\"\5\"\u02d0\n\""+
		"\3\"\3\"\5\"\u02d4\n\"\3\"\3\"\3\"\5\"\u02d9\n\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\5%\u02f6"+
		"\n%\3%\3%\5%\u02fa\n%\3%\3%\5%\u02fe\n%\3&\3&\3&\3&\3&\5&\u0305\n&\3&"+
		"\3&\3&\3&\5&\u030b\n&\5&\u030d\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\5"+
		"*\u0342\n*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\6,\u0355"+
		"\n,\r,\16,\u0356\3-\3-\3-\3-\3-\3-\5-\u035f\n-\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\5.\u036b\n.\3/\3/\3/\5/\u0370\n/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u038e\n\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\5\63\u03a8\n\63\3\63\3\63\5\63\u03ac\n\63\3"+
		"\63\5\63\u03af\n\63\3\63\3\63\3\63\5\63\u03b4\n\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\3"+
		"9\39\39\69\u03ea\n9\r9\169\u03eb\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0410"+
		"\n;\3;\3;\3;\3;\3;\5;\u0417\n;\3;\3;\3;\3;\3;\3;\3;\7;\u0420\n;\f;\16"+
		";\u0423\13;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3?\3?\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\6B\u0450\nB\rB\16B\u0451\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3"+
		"D\3D\3E\3E\3E\3E\3E\5E\u0469\nE\7E\u046b\nE\fE\16E\u046e\13E\3F\3F\3F"+
		"\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u0493\nI\fI\16I\u0496\13I\3I\3I\3I\3I\7"+
		"I\u049c\nI\fI\16I\u049f\13I\3I\3I\3I\3I\7I\u04a5\nI\fI\16I\u04a8\13I\3"+
		"I\3I\3I\3I\7I\u04ae\nI\fI\16I\u04b1\13I\3I\3I\3I\3I\3I\7I\u04b8\nI\fI"+
		"\16I\u04bb\13I\3I\3I\3I\3I\7I\u04c1\nI\fI\16I\u04c4\13I\3I\3I\3I\3I\3"+
		"I\3I\7I\u04cc\nI\fI\16I\u04cf\13I\5I\u04d1\nI\3I\3I\3I\3I\3I\3I\3I\7I"+
		"\u04da\nI\fI\16I\u04dd\13I\5I\u04df\nI\3J\3J\3J\3J\3J\3J\7J\u04e7\nJ\f"+
		"J\16J\u04ea\13J\3J\3J\3J\3J\3J\7J\u04f1\nJ\fJ\16J\u04f4\13J\3J\3J\3J\3"+
		"J\3J\7J\u04fb\nJ\fJ\16J\u04fe\13J\3J\3J\3J\3J\3J\7J\u0505\nJ\fJ\16J\u0508"+
		"\13J\3J\3J\3J\3J\3J\7J\u050f\nJ\fJ\16J\u0512\13J\3J\3J\3J\3J\3J\7J\u0519"+
		"\nJ\fJ\16J\u051c\13J\3J\3J\3J\3J\3J\7J\u0523\nJ\fJ\16J\u0526\13J\3J\3"+
		"J\3J\3J\3J\7J\u052d\nJ\fJ\16J\u0530\13J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\5K\u055b\nK\3K\3K\3K\3K\3K\5K\u0562\nK\3L\3L"+
		"\3L\3L\7L\u0568\nL\fL\16L\u056b\13L\3M\3M\3M\7M\u0570\nM\fM\16M\u0573"+
		"\13M\3N\3N\3N\7N\u0578\nN\fN\16N\u057b\13N\3O\3O\3O\7O\u0580\nO\fO\16"+
		"O\u0583\13O\3P\3P\3P\3P\7P\u0589\nP\fP\16P\u058c\13P\3Q\3Q\3Q\7Q\u0591"+
		"\nQ\fQ\16Q\u0594\13Q\3R\3R\3R\7R\u0599\nR\fR\16R\u059c\13R\3S\3S\3S\3"+
		"S\7S\u05a2\nS\fS\16S\u05a5\13S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u05c0\nU\3V\3V\3V\3V\3V\3V\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\5W\u05d0\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\7W\u05e2\nW\fW\16W\u05e5\13W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5"+
		"X\u0635\nX\3X\3X\3X\3X\5X\u063b\nX\3X\3X\5X\u063f\nX\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\5Y\u0677\nY\5Y\u0679\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u06a6\nY\fY\16Y\u06a9\13Y\3Y\3Y\3Y\7Y\u06ae"+
		"\nY\fY\16Y\u06b1\13Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\7Y\u06c9\nY\fY\16Y\u06cc\13Y\3Y\3Y\3Y\6Y\u06d1\nY\rY"+
		"\16Y\u06d2\3Y\3Y\5Y\u06d7\nY\5Y\u06d9\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0712\n\\\3]\3]\3]\3]\7]\u0718\n]\f]\16]"+
		"\u071b\13]\3]\3]\7]\u071f\n]\f]\16]\u0722\13]\3^\3^\5^\u0726\n^\3^\3^"+
		"\3^\5^\u072b\n^\3^\3^\3^\5^\u0730\n^\3^\3^\3^\5^\u0735\n^\3^\3^\3^\5^"+
		"\u073a\n^\3^\3^\3^\5^\u073f\n^\3^\3^\3^\5^\u0744\n^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\5^\u074f\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\7_\u077a\n_\f_\16_\u077d\13_\3_\3_\3_\7_\u0782\n_\f_\16_\u0785"+
		"\13_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\7_\u079d\n_\f_\16_\u07a0\13_\3_\3_\3_\6_\u07a5\n_\r_\16_\u07a6\3_\3"+
		"_\5_\u07ab\n_\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\7a\u07c3\na\fa\16a\u07c6\13a\3a\3a\3a\7a\u07cb\na\fa\16a\u07ce"+
		"\13a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\5d\u0814\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0838\nf\3g\3g\3g\3"+
		"g\3g\3g\2\4.\u00ach\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\2\31"+
		"\3\2\u00a3\u00a6\3\2\3\5\3\2\6\7\3\2\b\t\3\2\n\13\3\2\u00ad\u00af\4\2"+
		"\u00ae\u00ae\u00b0\u00b4\3\2\f\r\3\2\16\17\3\2\20\21\3\2\22\23\3\2\24"+
		"\33\3\2\34\35\3\2\36!\4\2\25\26\"$\3\2%\'\4\2!!()\5\2\30\30\32\32*-\3"+
		"\2./\3\2\60\61\4\2\25\26\"#\4\2\36\36\62\64\4\2\u00aa\u00aa\u00ad\u00ad"+
		"\2\u08f4\2\u00d1\3\2\2\2\4\u00d9\3\2\2\2\6\u00e1\3\2\2\2\b\u011f\3\2\2"+
		"\2\n\u0121\3\2\2\2\f\u0127\3\2\2\2\16\u012b\3\2\2\2\20\u012e\3\2\2\2\22"+
		"\u0137\3\2\2\2\24\u014d\3\2\2\2\26\u0177\3\2\2\2\30\u017a\3\2\2\2\32\u017d"+
		"\3\2\2\2\34\u0180\3\2\2\2\36\u0184\3\2\2\2 \u01be\3\2\2\2\"\u01cf\3\2"+
		"\2\2$\u01d1\3\2\2\2&\u01d6\3\2\2\2(\u01e0\3\2\2\2*\u01ec\3\2\2\2,\u01f4"+
		"\3\2\2\2.\u0205\3\2\2\2\60\u025b\3\2\2\2\62\u0269\3\2\2\2\64\u0272\3\2"+
		"\2\2\66\u0274\3\2\2\28\u0276\3\2\2\2:\u0278\3\2\2\2<\u0294\3\2\2\2>\u02bc"+
		"\3\2\2\2@\u02c2\3\2\2\2B\u02d8\3\2\2\2D\u02da\3\2\2\2F\u02e6\3\2\2\2H"+
		"\u02f0\3\2\2\2J\u02ff\3\2\2\2L\u030e\3\2\2\2N\u0321\3\2\2\2P\u0333\3\2"+
		"\2\2R\u033e\3\2\2\2T\u0347\3\2\2\2V\u0354\3\2\2\2X\u035e\3\2\2\2Z\u036a"+
		"\3\2\2\2\\\u036c\3\2\2\2^\u0376\3\2\2\2`\u038f\3\2\2\2b\u039a\3\2\2\2"+
		"d\u03a5\3\2\2\2f\u03b9\3\2\2\2h\u03bc\3\2\2\2j\u03ca\3\2\2\2l\u03d8\3"+
		"\2\2\2n\u03dd\3\2\2\2p\u03e4\3\2\2\2r\u03ed\3\2\2\2t\u0403\3\2\2\2v\u0426"+
		"\3\2\2\2x\u042c\3\2\2\2z\u0430\3\2\2\2|\u0433\3\2\2\2~\u0435\3\2\2\2\u0080"+
		"\u0440\3\2\2\2\u0082\u0443\3\2\2\2\u0084\u0455\3\2\2\2\u0086\u045e\3\2"+
		"\2\2\u0088\u0463\3\2\2\2\u008a\u046f\3\2\2\2\u008c\u0472\3\2\2\2\u008e"+
		"\u0475\3\2\2\2\u0090\u047a\3\2\2\2\u0092\u04e0\3\2\2\2\u0094\u0531\3\2"+
		"\2\2\u0096\u0569\3\2\2\2\u0098\u0571\3\2\2\2\u009a\u0579\3\2\2\2\u009c"+
		"\u0581\3\2\2\2\u009e\u058a\3\2\2\2\u00a0\u0592\3\2\2\2\u00a2\u059a\3\2"+
		"\2\2\u00a4\u05a3\3\2\2\2\u00a6\u05a6\3\2\2\2\u00a8\u05b3\3\2\2\2\u00aa"+
		"\u05c1\3\2\2\2\u00ac\u05cf\3\2\2\2\u00ae\u063e\3\2\2\2\u00b0\u0640\3\2"+
		"\2\2\u00b2\u06da\3\2\2\2\u00b4\u06e3\3\2\2\2\u00b6\u06f5\3\2\2\2\u00b8"+
		"\u0713\3\2\2\2\u00ba\u074e\3\2\2\2\u00bc\u0750\3\2\2\2\u00be\u07ac\3\2"+
		"\2\2\u00c0\u07b2\3\2\2\2\u00c2\u07d1\3\2\2\2\u00c4\u07d7\3\2\2\2\u00c6"+
		"\u07e1\3\2\2\2\u00c8\u0815\3\2\2\2\u00ca\u082c\3\2\2\2\u00cc\u0839\3\2"+
		"\2\2\u00ce\u00d0\5\4\3\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d5\7\2\2\3\u00d5\u00d6\b\2\1\2\u00d6\3\3\2\2\2\u00d7\u00da"+
		"\5\6\4\2\u00d8\u00da\5\b\5\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\5\3\2\2\2\u00db\u00e2\5\24\13\2\u00dc\u00e2\5\26\f\2\u00dd\u00e2\5\30"+
		"\r\2\u00de\u00e2\5\32\16\2\u00df\u00e2\5\34\17\2\u00e0\u00e2\5\36\20\2"+
		"\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\7\3\2\2\2\u00e3"+
		"\u0120\5D#\2\u00e4\u0120\5F$\2\u00e5\u0120\5H%\2\u00e6\u0120\5J&\2\u00e7"+
		"\u0120\5L\'\2\u00e8\u0120\5N(\2\u00e9\u0120\5P)\2\u00ea\u0120\5R*\2\u00eb"+
		"\u0120\5T+\2\u00ec\u0120\5\\/\2\u00ed\u0120\5^\60\2\u00ee\u0120\5`\61"+
		"\2\u00ef\u0120\5b\62\2\u00f0\u0120\5d\63\2\u00f1\u0120\5f\64\2\u00f2\u0120"+
		"\5j\66\2\u00f3\u0120\5l\67\2\u00f4\u0120\5n8\2\u00f5\u0120\5p9\2\u00f6"+
		"\u0120\5r:\2\u00f7\u0120\5t;\2\u00f8\u0120\5v<\2\u00f9\u0120\5x=\2\u00fa"+
		"\u0120\5\u008aF\2\u00fb\u0120\5\u008cG\2\u00fc\u0120\5|?\2\u00fd\u0120"+
		"\5~@\2\u00fe\u0120\5\u0080A\2\u00ff\u0120\5\u0082B\2\u0100\u0120\5\u0084"+
		"C\2\u0101\u0120\5\u0086D\2\u0102\u0120\5\u0088E\2\u0103\u0120\5\u008e"+
		"H\2\u0104\u0120\5z>\2\u0105\u0120\5\u0090I\2\u0106\u0120\5\u0094K\2\u0107"+
		"\u0120\5\u0092J\2\u0108\u0120\5\u00a6T\2\u0109\u0120\5\u00a8U\2\u010a"+
		"\u0120\5\u00aaV\2\u010b\u0120\5\u00b0Y\2\u010c\u0120\5\u00b2Z\2\u010d"+
		"\u0120\5\u00b4[\2\u010e\u0120\5\u00b6\\\2\u010f\u0120\5\u00ccg\2\u0110"+
		"\u0120\5\u00bc_\2\u0111\u0120\5\u00be`\2\u0112\u0120\5\u00b8]\2\u0113"+
		"\u0120\5\u00caf\2\u0114\u0120\5\u00c0a\2\u0115\u0120\5\u00c2b\2\u0116"+
		"\u0120\5\u00c4c\2\u0117\u0120\5\u00c6d\2\u0118\u0120\5\16\b\2\u0119\u0120"+
		"\5\20\t\2\u011a\u0120\5\22\n\2\u011b\u0120\5\n\6\2\u011c\u0120\5\f\7\2"+
		"\u011d\u0120\5h\65\2\u011e\u0120\5\u00c8e\2\u011f\u00e3\3\2\2\2\u011f"+
		"\u00e4\3\2\2\2\u011f\u00e5\3\2\2\2\u011f\u00e6\3\2\2\2\u011f\u00e7\3\2"+
		"\2\2\u011f\u00e8\3\2\2\2\u011f\u00e9\3\2\2\2\u011f\u00ea\3\2\2\2\u011f"+
		"\u00eb\3\2\2\2\u011f\u00ec\3\2\2\2\u011f\u00ed\3\2\2\2\u011f\u00ee\3\2"+
		"\2\2\u011f\u00ef\3\2\2\2\u011f\u00f0\3\2\2\2\u011f\u00f1\3\2\2\2\u011f"+
		"\u00f2\3\2\2\2\u011f\u00f3\3\2\2\2\u011f\u00f4\3\2\2\2\u011f\u00f5\3\2"+
		"\2\2\u011f\u00f6\3\2\2\2\u011f\u00f7\3\2\2\2\u011f\u00f8\3\2\2\2\u011f"+
		"\u00f9\3\2\2\2\u011f\u00fa\3\2\2\2\u011f\u00fb\3\2\2\2\u011f\u00fc\3\2"+
		"\2\2\u011f\u00fd\3\2\2\2\u011f\u00fe\3\2\2\2\u011f\u00ff\3\2\2\2\u011f"+
		"\u0100\3\2\2\2\u011f\u0101\3\2\2\2\u011f\u0102\3\2\2\2\u011f\u0103\3\2"+
		"\2\2\u011f\u0104\3\2\2\2\u011f\u0105\3\2\2\2\u011f\u0106\3\2\2\2\u011f"+
		"\u0107\3\2\2\2\u011f\u0108\3\2\2\2\u011f\u0109\3\2\2\2\u011f\u010a\3\2"+
		"\2\2\u011f\u010b\3\2\2\2\u011f\u010c\3\2\2\2\u011f\u010d\3\2\2\2\u011f"+
		"\u010e\3\2\2\2\u011f\u010f\3\2\2\2\u011f\u0110\3\2\2\2\u011f\u0111\3\2"+
		"\2\2\u011f\u0112\3\2\2\2\u011f\u0113\3\2\2\2\u011f\u0114\3\2\2\2\u011f"+
		"\u0115\3\2\2\2\u011f\u0116\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u0118\3\2"+
		"\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011b\3\2\2\2\u011f"+
		"\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\t\3\2\2\2"+
		"\u0121\u0122\7\u0093\2\2\u0122\u0123\7\u00da\2\2\u0123\u0124\b\6\1\2\u0124"+
		"\u0125\t\2\2\2\u0125\u0126\b\6\1\2\u0126\13\3\2\2\2\u0127\u0128\7j\2\2"+
		"\u0128\u0129\5B\"\2\u0129\u012a\7\u00ac\2\2\u012a\r\3\2\2\2\u012b\u012c"+
		"\7\u0090\2\2\u012c\u012d\b\b\1\2\u012d\17\3\2\2\2\u012e\u012f\7\u0091"+
		"\2\2\u012f\u0130\b\t\1\2\u0130\u0135\5<\37\2\u0131\u0132\7\u00dd\2\2\u0132"+
		"\u0136\b\t\1\2\u0133\u0134\7\u00de\2\2\u0134\u0136\b\t\1\2\u0135\u0131"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0136\21\3\2\2\2\u0137\u0138\7\u0092\2\2"+
		"\u0138\u0139\b\n\1\2\u0139\u013a\5<\37\2\u013a\u013b\b\n\1\2\u013b\u013c"+
		"\5<\37\2\u013c\u013d\b\n\1\2\u013d\u013e\7\u00c4\2\2\u013e\u013f\7\u0094"+
		"\2\2\u013f\u0140\5<\37\2\u0140\u0141\7\u0095\2\2\u0141\u0142\5<\37\2\u0142"+
		"\u0143\7\u00c1\2\2\u0143\u0144\7\u0096\2\2\u0144\u0145\5<\37\2\u0145\u0146"+
		"\7\u0097\2\2\u0146\u0147\5<\37\2\u0147\u0148\7\u0094\2\2\u0148\u0149\5"+
		"<\37\2\u0149\u014a\7\u0095\2\2\u014a\u014b\5<\37\2\u014b\u014c\7\u00c2"+
		"\2\2\u014c\23\3\2\2\2\u014d\u014e\7F\2\2\u014e\u014f\t\3\2\2\u014f\u0150"+
		"\b\13\1\2\u0150\u0151\5B\"\2\u0151\u0152\b\13\1\2\u0152\u0153\5B\"\2\u0153"+
		"\u0154\b\13\1\2\u0154\u0155\5B\"\2\u0155\u0156\b\13\1\2\u0156\u0157\5"+
		"B\"\2\u0157\u0158\b\13\1\2\u0158\u0159\5B\"\2\u0159\u015a\b\13\1\2\u015a"+
		"\u015b\7\u00a7\2\2\u015b\u015c\b\13\1\2\u015c\u015d\t\4\2\2\u015d\u015e"+
		"\b\13\1\2\u015e\u015f\5B\"\2\u015f\u0160\b\13\1\2\u0160\u0161\5B\"\2\u0161"+
		"\u0162\b\13\1\2\u0162\u0163\5B\"\2\u0163\u0164\b\13\1\2\u0164\u0165\5"+
		"B\"\2\u0165\u0166\b\13\1\2\u0166\u0167\5B\"\2\u0167\u0168\b\13\1\2\u0168"+
		"\u0169\5B\"\2\u0169\u016a\b\13\1\2\u016a\u016b\t\5\2\2\u016b\u016c\b\13"+
		"\1\2\u016c\u016d\t\6\2\2\u016d\u0171\b\13\1\2\u016e\u016f\5B\"\2\u016f"+
		"\u0170\b\13\1\2\u0170\u0172\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u0172\3"+
		"\2\2\2\u0172\u0175\3\2\2\2\u0173\u0174\7\u00da\2\2\u0174\u0176\b\13\1"+
		"\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\25\3\2\2\2\u0177\u0178"+
		"\7I\2\2\u0178\u0179\b\f\1\2\u0179\27\3\2\2\2\u017a\u017b\7E\2\2\u017b"+
		"\u017c\b\r\1\2\u017c\31\3\2\2\2\u017d\u017e\7H\2\2\u017e\u017f\b\16\1"+
		"\2\u017f\33\3\2\2\2\u0180\u0181\7J\2\2\u0181\u0182\5B\"\2\u0182\u0183"+
		"\b\17\1\2\u0183\35\3\2\2\2\u0184\u0185\7G\2\2\u0185\37\3\2\2\2\u0186\u0187"+
		"\7\u00a1\2\2\u0187\u018b\b\21\1\2\u0188\u0189\5\"\22\2\u0189\u018a\b\21"+
		"\1\2\u018a\u018c\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u01bf\3\2\2\2\u018d\u018e\7\u00a7\2\2\u018e\u0192\b\21\1\2\u018f\u0190"+
		"\5\"\22\2\u0190\u0191\b\21\1\2\u0191\u0193\3\2\2\2\u0192\u018f\3\2\2\2"+
		"\u0192\u0193\3\2\2\2\u0193\u01bf\3\2\2\2\u0194\u0195\5B\"\2\u0195\u0199"+
		"\b\21\1\2\u0196\u0197\5\"\22\2\u0197\u0198\b\21\1\2\u0198\u019a\3\2\2"+
		"\2\u0199\u0196\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01bf\3\2\2\2\u019b\u019c"+
		"\7\u00a2\2\2\u019c\u01a0\b\21\1\2\u019d\u019e\5\"\22\2\u019e\u019f\b\21"+
		"\1\2\u019f\u01a1\3\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01bf\3\2\2\2\u01a2\u01a3\7\u00dd\2\2\u01a3\u01a7\b\21\1\2\u01a4\u01a5"+
		"\5\"\22\2\u01a5\u01a6\b\21\1\2\u01a6\u01a8\3\2\2\2\u01a7\u01a4\3\2\2\2"+
		"\u01a7\u01a8\3\2\2\2\u01a8\u01bf\3\2\2\2\u01a9\u01aa\7\u00da\2\2\u01aa"+
		"\u01ae\b\21\1\2\u01ab\u01ac\5\"\22\2\u01ac\u01ad\b\21\1\2\u01ad\u01af"+
		"\3\2\2\2\u01ae\u01ab\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01bf\3\2\2\2\u01b0"+
		"\u01b1\58\35\2\u01b1\u01b5\b\21\1\2\u01b2\u01b3\5\"\22\2\u01b3\u01b4\b"+
		"\21\1\2\u01b4\u01b6\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01bf\3\2\2\2\u01b7\u01b8\5:\36\2\u01b8\u01bc\b\21\1\2\u01b9\u01ba\5"+
		"\"\22\2\u01ba\u01bb\b\21\1\2\u01bb\u01bd\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u0186\3\2\2\2\u01be\u018d\3\2"+
		"\2\2\u01be\u0194\3\2\2\2\u01be\u019b\3\2\2\2\u01be\u01a2\3\2\2\2\u01be"+
		"\u01a9\3\2\2\2\u01be\u01b0\3\2\2\2\u01be\u01b7\3\2\2\2\u01bf!\3\2\2\2"+
		"\u01c0\u01c1\5$\23\2\u01c1\u01c2\b\22\1\2\u01c2\u01d0\3\2\2\2\u01c3\u01c4"+
		"\5&\24\2\u01c4\u01c5\b\22\1\2\u01c5\u01d0\3\2\2\2\u01c6\u01c7\5(\25\2"+
		"\u01c7\u01c8\b\22\1\2\u01c8\u01d0\3\2\2\2\u01c9\u01ca\5*\26\2\u01ca\u01cb"+
		"\b\22\1\2\u01cb\u01d0\3\2\2\2\u01cc\u01cd\5,\27\2\u01cd\u01ce\b\22\1\2"+
		"\u01ce\u01d0\3\2\2\2\u01cf\u01c0\3\2\2\2\u01cf\u01c3\3\2\2\2\u01cf\u01c6"+
		"\3\2\2\2\u01cf\u01c9\3\2\2\2\u01cf\u01cc\3\2\2\2\u01d0#\3\2\2\2\u01d1"+
		"\u01d2\b\23\1\2\u01d2\u01d3\5.\30\2\u01d3\u01d4\5\62\32\2\u01d4\u01d5"+
		"\b\23\1\2\u01d5%\3\2\2\2\u01d6\u01da\7\u00bf\2\2\u01d7\u01d8\5$\23\2\u01d8"+
		"\u01d9\b\24\1\2\u01d9\u01db\3\2\2\2\u01da\u01d7\3\2\2\2\u01db\u01dc\3"+
		"\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01df\7\u00c0\2\2\u01df\'\3\2\2\2\u01e0\u01e1\7\u00b6\2\2\u01e1\u01e2"+
		"\5<\37\2\u01e2\u01e3\7\u00d8\2\2\u01e3\u01e4\7\u00d8\2\2\u01e4\u01e8\5"+
		"B\"\2\u01e5\u01e6\5\62\32\2\u01e6\u01e7\b\25\1\2\u01e7\u01e9\3\2\2\2\u01e8"+
		"\u01e5\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb)\3\2\2\2\u01ec\u01ed\7\u00b7\2\2\u01ed\u01ee\5\64\33\2\u01ee"+
		"\u01ef\5\62\32\2\u01ef\u01f0\5\62\32\2\u01f0\u01f1\5\62\32\2\u01f1\u01f2"+
		"\5\62\32\2\u01f2\u01f3\b\26\1\2\u01f3+\3\2\2\2\u01f4\u01f5\7\u00b8\2\2"+
		"\u01f5\u01f9\5B\"\2\u01f6\u01f7\5\62\32\2\u01f7\u01f8\b\27\1\2\u01f8\u01fa"+
		"\3\2\2\2\u01f9\u01f6\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc-\3\2\2\2\u01fd\u01fe\b\30\1\2\u01fe\u0206\5\60\31"+
		"\2\u01ff\u0200\7\u00d1\2\2\u0200\u0201\b\30\1\2\u0201\u0206\5.\30\21\u0202"+
		"\u0203\7\u00d2\2\2\u0203\u0204\b\30\1\2\u0204\u0206\5.\30\20\u0205\u01fd"+
		"\3\2\2\2\u0205\u01ff\3\2\2\2\u0205\u0202\3\2\2\2\u0206\u023d\3\2\2\2\u0207"+
		"\u0208\f\17\2\2\u0208\u0209\7\u00cd\2\2\u0209\u020a\b\30\1\2\u020a\u023c"+
		"\5.\30\20\u020b\u020c\f\16\2\2\u020c\u020d\7\u00cf\2\2\u020d\u020e\b\30"+
		"\1\2\u020e\u023c\5.\30\17\u020f\u0210\f\r\2\2\u0210\u0211\7\u00ce\2\2"+
		"\u0211\u0212\b\30\1\2\u0212\u023c\5.\30\16\u0213\u0214\f\f\2\2\u0214\u0215"+
		"\7\u00d0\2\2\u0215\u0216\b\30\1\2\u0216\u023c\5.\30\r\u0217\u0218\f\13"+
		"\2\2\u0218\u0219\7\u00cb\2\2\u0219\u021a\b\30\1\2\u021a\u023c\5.\30\f"+
		"\u021b\u021c\f\n\2\2\u021c\u021d\7\u00cc\2\2\u021d\u021e\b\30\1\2\u021e"+
		"\u023c\5.\30\13\u021f\u0220\f\5\2\2\u0220\u0221\7\u00c9\2\2\u0221\u0222"+
		"\b\30\1\2\u0222\u023c\5.\30\6\u0223\u0224\f\4\2\2\u0224\u0225\7\u00c8"+
		"\2\2\u0225\u0226\b\30\1\2\u0226\u023c\5.\30\5\u0227\u0228\f\3\2\2\u0228"+
		"\u0229\7\u00ca\2\2\u0229\u022a\b\30\1\2\u022a\u023c\5.\30\4\u022b\u022c"+
		"\f\t\2\2\u022c\u022d\7\u00cb\2\2\u022d\u022e\7\u00b5\2\2\u022e\u023c\b"+
		"\30\1\2\u022f\u0230\f\b\2\2\u0230\u0231\7\u00cc\2\2\u0231\u0232\7\u00b5"+
		"\2\2\u0232\u023c\b\30\1\2\u0233\u0234\f\7\2\2\u0234\u0235\7\u00cb\2\2"+
		"\u0235\u0236\7\u00bc\2\2\u0236\u023c\b\30\1\2\u0237\u0238\f\6\2\2\u0238"+
		"\u0239\7\u00cc\2\2\u0239\u023a\7\u00bc\2\2\u023a\u023c\b\30\1\2\u023b"+
		"\u0207\3\2\2\2\u023b\u020b\3\2\2\2\u023b\u020f\3\2\2\2\u023b\u0213\3\2"+
		"\2\2\u023b\u0217\3\2\2\2\u023b\u021b\3\2\2\2\u023b\u021f\3\2\2\2\u023b"+
		"\u0223\3\2\2\2\u023b\u0227\3\2\2\2\u023b\u022b\3\2\2\2\u023b\u022f\3\2"+
		"\2\2\u023b\u0233\3\2\2\2\u023b\u0237\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e/\3\2\2\2\u023f\u023d\3\2\2\2"+
		"\u0240\u0241\7\u00bd\2\2\u0241\u0242\b\31\1\2\u0242\u0243\5.\30\2\u0243"+
		"\u0244\7\u00be\2\2\u0244\u0245\b\31\1\2\u0245\u025c\3\2\2\2\u0246\u0247"+
		"\5B\"\2\u0247\u0248\b\31\1\2\u0248\u025c\3\2\2\2\u0249\u024b\5\64\33\2"+
		"\u024a\u024c\58\35\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u024e\b\31\1\2\u024e\u025c\3\2\2\2\u024f\u0251\5\66\34"+
		"\2\u0250\u0252\5:\36\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253"+
		"\3\2\2\2\u0253\u0254\b\31\1\2\u0254\u025c\3\2\2\2\u0255\u0256\7\u00b9"+
		"\2\2\u0256\u025c\b\31\1\2\u0257\u0258\7\u00ba\2\2\u0258\u025c\b\31\1\2"+
		"\u0259\u025a\7\u00bb\2\2\u025a\u025c\b\31\1\2\u025b\u0240\3\2\2\2\u025b"+
		"\u0246\3\2\2\2\u025b\u0249\3\2\2\2\u025b\u024f\3\2\2\2\u025b\u0255\3\2"+
		"\2\2\u025b\u0257\3\2\2\2\u025b\u0259\3\2\2\2\u025c\61\3\2\2\2\u025d\u026a"+
		"\7\u00a1\2\2\u025e\u026a\7\u00a2\2\2\u025f\u026a\7\u00a7\2\2\u0260\u026a"+
		"\5B\"\2\u0261\u026a\7\u00dd\2\2\u0262\u026a\7\u00da\2\2\u0263\u026a\7"+
		"\u00a8\2\2\u0264\u026a\7\u00b0\2\2\u0265\u026a\7\u00b1\2\2\u0266\u026a"+
		"\7\u00b2\2\2\u0267\u026a\7\u00b3\2\2\u0268\u026a\7\u00b4\2\2\u0269\u025d"+
		"\3\2\2\2\u0269\u025e\3\2\2\2\u0269\u025f\3\2\2\2\u0269\u0260\3\2\2\2\u0269"+
		"\u0261\3\2\2\2\u0269\u0262\3\2\2\2\u0269\u0263\3\2\2\2\u0269\u0264\3\2"+
		"\2\2\u0269\u0265\3\2\2\2\u0269\u0266\3\2\2\2\u0269\u0267\3\2\2\2\u0269"+
		"\u0268\3\2\2\2\u026a\63\3\2\2\2\u026b\u026c\7\u00db\2\2\u026c\u0273\b"+
		"\33\1\2\u026d\u0273\7\u00ac\2\2\u026e\u0273\7\u00aa\2\2\u026f\u0273\7"+
		"\u00a9\2\2\u0270\u0273\7\u00ab\2\2\u0271\u0273\7\u00ad\2\2\u0272\u026b"+
		"\3\2\2\2\u0272\u026d\3\2\2\2\u0272\u026e\3\2\2\2\u0272\u026f\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273\65\3\2\2\2\u0274\u0275\t\7\2"+
		"\2\u0275\67\3\2\2\2\u0276\u0277\7\u00a8\2\2\u02779\3\2\2\2\u0278\u0279"+
		"\t\b\2\2\u0279;\3\2\2\2\u027a\u027b\7\u00d2\2\2\u027b\u027d\b\37\1\2\u027c"+
		"\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\7\u00d8"+
		"\2\2\u027f\u0295\b\37\1\2\u0280\u0281\7\u00d2\2\2\u0281\u0283\b\37\1\2"+
		"\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285"+
		"\7\u00d9\2\2\u0285\u0295\b\37\1\2\u0286\u0288\5\64\33\2\u0287\u0289\5"+
		"8\35\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028b\b\37\1\2\u028b\u0295\3\2\2\2\u028c\u028e\5\66\34\2\u028d\u028f"+
		"\5:\36\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0291\b\37\1\2\u0291\u0295\3\2\2\2\u0292\u0293\7\u00da\2\2\u0293\u0295"+
		"\b\37\1\2\u0294\u027c\3\2\2\2\u0294\u0282\3\2\2\2\u0294\u0286\3\2\2\2"+
		"\u0294\u028c\3\2\2\2\u0294\u0292\3\2\2\2\u0295=\3\2\2\2\u0296\u0297\7"+
		"\u00d2\2\2\u0297\u0299\b \1\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2"+
		"\u0299\u029a\3\2\2\2\u029a\u029b\7\u00d8\2\2\u029b\u02bd\b \1\2\u029c"+
		"\u029d\7\u00d2\2\2\u029d\u029f\b \1\2\u029e\u029c\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7\u00d9\2\2\u02a1\u02bd\b \1"+
		"\2\u02a2\u02a3\7\u00da\2\2\u02a3\u02bd\b \1\2\u02a4\u02a5\7\u00b5\2\2"+
		"\u02a5\u02bd\b \1\2\u02a6\u02a7\7\u00dd\2\2\u02a7\u02bd\b \1\2\u02a8\u02a9"+
		"\5\64\33\2\u02a9\u02aa\b \1\2\u02aa\u02bd\3\2\2\2\u02ab\u02ac\58\35\2"+
		"\u02ac\u02ad\b \1\2\u02ad\u02bd\3\2\2\2\u02ae\u02af\5\66\34\2\u02af\u02b0"+
		"\b \1\2\u02b0\u02bd\3\2\2\2\u02b1\u02b2\5:\36\2\u02b2\u02b3\b \1\2\u02b3"+
		"\u02bd\3\2\2\2\u02b4\u02b5\7\u00b9\2\2\u02b5\u02bd\b \1\2\u02b6\u02b7"+
		"\7\u00ba\2\2\u02b7\u02bd\b \1\2\u02b8\u02b9\7\u00bb\2\2\u02b9\u02bd\b"+
		" \1\2\u02ba\u02bb\7\u00bc\2\2\u02bb\u02bd\b \1\2\u02bc\u0298\3\2\2\2\u02bc"+
		"\u029e\3\2\2\2\u02bc\u02a2\3\2\2\2\u02bc\u02a4\3\2\2\2\u02bc\u02a6\3\2"+
		"\2\2\u02bc\u02a8\3\2\2\2\u02bc\u02ab\3\2\2\2\u02bc\u02ae\3\2\2\2\u02bc"+
		"\u02b1\3\2\2\2\u02bc\u02b4\3\2\2\2\u02bc\u02b6\3\2\2\2\u02bc\u02b8\3\2"+
		"\2\2\u02bc\u02ba\3\2\2\2\u02bd?\3\2\2\2\u02be\u02bf\5<\37\2\u02bf\u02c0"+
		"\5<\37\2\u02c0\u02c1\b!\1\2\u02c1\u02c3\3\2\2\2\u02c2\u02be\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5A\3\2\2\2"+
		"\u02c6\u02c8\7\u00d2\2\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9\u02d9\7\u00d8\2\2\u02ca\u02cc\7\u00d2\2\2\u02cb\u02ca"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02d9\7\u00d9\2"+
		"\2\u02ce\u02d0\7\u00d1\2\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1\u02d9\7\u00d8\2\2\u02d2\u02d4\7\u00d1\2\2\u02d3\u02d2"+
		"\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d9\7\u00d9\2"+
		"\2\u02d6\u02d9\7\u00ba\2\2\u02d7\u02d9\7\u00bb\2\2\u02d8\u02c7\3\2\2\2"+
		"\u02d8\u02cb\3\2\2\2\u02d8\u02cf\3\2\2\2\u02d8\u02d3\3\2\2\2\u02d8\u02d6"+
		"\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9C\3\2\2\2\u02da\u02db\7K\2\2\u02db\u02dc"+
		"\5B\"\2\u02dc\u02dd\5B\"\2\u02dd\u02de\5B\"\2\u02de\u02df\5B\"\2\u02df"+
		"\u02e0\5B\"\2\u02e0\u02e1\5B\"\2\u02e1\u02e2\b#\1\2\u02e2\u02e3\5B\"\2"+
		"\u02e3\u02e4\5 \21\2\u02e4\u02e5\5 \21\2\u02e5E\3\2\2\2\u02e6\u02e7\7"+
		"L\2\2\u02e7\u02e8\5B\"\2\u02e8\u02e9\5B\"\2\u02e9\u02ea\b$\1\2\u02ea\u02eb"+
		"\5B\"\2\u02eb\u02ec\b$\1\2\u02ec\u02ed\5B\"\2\u02ed\u02ee\5 \21\2\u02ee"+
		"\u02ef\5 \21\2\u02efG\3\2\2\2\u02f0\u02f1\7M\2\2\u02f1\u02f2\7;\2\2\u02f2"+
		"\u02f5\5 \21\2\u02f3\u02f4\7<\2\2\u02f4\u02f6\5 \21\2\u02f5\u02f3\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f8\7=\2\2\u02f8"+
		"\u02fa\5 \21\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fd\3\2"+
		"\2\2\u02fb\u02fc\7>\2\2\u02fc\u02fe\5 \21\2\u02fd\u02fb\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02feI\3\2\2\2\u02ff\u030c\7N\2\2\u0300\u0301\7;\2\2\u0301"+
		"\u0304\5 \21\2\u0302\u0303\7<\2\2\u0303\u0305\5 \21\2\u0304\u0302\3\2"+
		"\2\2\u0304\u0305\3\2\2\2\u0305\u030d\3\2\2\2\u0306\u0307\7<\2\2\u0307"+
		"\u030a\5 \21\2\u0308\u0309\7;\2\2\u0309\u030b\5 \21\2\u030a\u0308\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u0300\3\2\2\2\u030c"+
		"\u0306\3\2\2\2\u030dK\3\2\2\2\u030e\u030f\7O\2\2\u030f\u0310\5B\"\2\u0310"+
		"\u0311\5B\"\2\u0311\u0312\b\'\1\2\u0312\u0313\5B\"\2\u0313\u0314\5B\""+
		"\2\u0314\u0315\b\'\1\2\u0315\u0316\5<\37\2\u0316\u0317\5<\37\2\u0317\u0318"+
		"\5<\37\2\u0318\u0319\5<\37\2\u0319\u031a\t\t\2\2\u031a\u031b\t\n\2\2\u031b"+
		"\u031c\5B\"\2\u031c\u031d\5B\"\2\u031d\u031e\5@!\2\u031e\u031f\5B\"\2"+
		"\u031f\u0320\5 \21\2\u0320M\3\2\2\2\u0321\u0322\7P\2\2\u0322\u0323\5B"+
		"\"\2\u0323\u0324\5B\"\2\u0324\u0325\b(\1\2\u0325\u0326\5B\"\2\u0326\u0327"+
		"\5B\"\2\u0327\u0328\b(\1\2\u0328\u0329\5<\37\2\u0329\u032a\5<\37\2\u032a"+
		"\u032b\5<\37\2\u032b\u032c\5<\37\2\u032c\u032d\5B\"\2\u032d\u032e\5B\""+
		"\2\u032e\u032f\5@!\2\u032f\u0330\5B\"\2\u0330\u0331\5 \21\2\u0331\u0332"+
		"\5 \21\2\u0332O\3\2\2\2\u0333\u0334\7Q\2\2\u0334\u0335\5B\"\2\u0335\u0336"+
		"\5B\"\2\u0336\u0337\b)\1\2\u0337\u0338\5B\"\2\u0338\u0339\5B\"\2\u0339"+
		"\u033a\b)\1\2\u033a\u033b\5B\"\2\u033b\u033c\5 \21\2\u033c\u033d\5 \21"+
		"\2\u033dQ\3\2\2\2\u033e\u0341\7R\2\2\u033f\u0340\6*\17\2\u0340\u0342\5"+
		"B\"\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0344\5@!\2\u0344\u0345\5B\"\2\u0345\u0346\5 \21\2\u0346S\3\2\2\2\u0347"+
		"\u0348\7S\2\2\u0348\u0349\5B\"\2\u0349\u034a\5B\"\2\u034a\u034b\b+\1\2"+
		"\u034b\u034c\5B\"\2\u034c\u034d\5B\"\2\u034d\u034e\5B\"\2\u034e\u034f"+
		"\5V,\2\u034f\u0350\5X-\2\u0350\u0351\5Z.\2\u0351U\3\2\2\2\u0352\u0353"+
		"\7\u00da\2\2\u0353\u0355\b,\1\2\u0354\u0352\3\2\2\2\u0355\u0356\3\2\2"+
		"\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357W\3\2\2\2\u0358\u0359"+
		"\b-\1\2\u0359\u035a\5.\30\2\u035a\u035b\b-\1\2\u035b\u035c\5V,\2\u035c"+
		"\u035d\b-\1\2\u035d\u035f\3\2\2\2\u035e\u0358\3\2\2\2\u035e\u035f\3\2"+
		"\2\2\u035fY\3\2\2\2\u0360\u0361\t\13\2\2\u0361\u0362\5B\"\2\u0362\u0363"+
		"\b.\1\2\u0363\u036b\3\2\2\2\u0364\u0365\t\f\2\2\u0365\u0366\5B\"\2\u0366"+
		"\u0367\5B\"\2\u0367\u0368\5B\"\2\u0368\u0369\b.\1\2\u0369\u036b\3\2\2"+
		"\2\u036a\u0360\3\2\2\2\u036a\u0364\3\2\2\2\u036b[\3\2\2\2\u036c\u036f"+
		"\7T\2\2\u036d\u036e\6/\20\2\u036e\u0370\5B\"\2\u036f\u036d\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\5@!\2\u0372\u0373\5B\""+
		"\2\u0373\u0374\5 \21\2\u0374\u0375\5 \21\2\u0375]\3\2\2\2\u0376\u0377"+
		"\7U\2\2\u0377\u0378\5B\"\2\u0378\u0379\b\60\1\2\u0379\u037a\5B\"\2\u037a"+
		"\u037b\b\60\1\2\u037b\u037c\5B\"\2\u037c\u037d\b\60\1\2\u037d\u037e\5"+
		"<\37\2\u037e\u037f\b\60\1\2\u037f\u0380\t\r\2\2\u0380\u0381\b\60\1\2\u0381"+
		"\u0382\7\u00a2\2\2\u0382\u0383\b\60\1\2\u0383\u0384\t\16\2\2\u0384\u0385"+
		"\b\60\1\2\u0385\u0386\5Z.\2\u0386\u0387\b\60\1\2\u0387\u0388\5<\37\2\u0388"+
		"\u038d\b\60\1\2\u0389\u038a\b\60\1\2\u038a\u038b\5\"\22\2\u038b\u038c"+
		"\b\60\1\2\u038c\u038e\3\2\2\2\u038d\u0389\3\2\2\2\u038d\u038e\3\2\2\2"+
		"\u038e_\3\2\2\2\u038f\u0390\7V\2\2\u0390\u0391\5B\"\2\u0391\u0392\5B\""+
		"\2\u0392\u0393\b\61\1\2\u0393\u0394\5B\"\2\u0394\u0395\5B\"\2\u0395\u0396"+
		"\b\61\1\2\u0396\u0397\5B\"\2\u0397\u0398\5 \21\2\u0398\u0399\5 \21\2\u0399"+
		"a\3\2\2\2\u039a\u039b\7W\2\2\u039b\u039c\5B\"\2\u039c\u039d\5B\"\2\u039d"+
		"\u039e\b\62\1\2\u039e\u039f\5B\"\2\u039f\u03a0\5B\"\2\u03a0\u03a1\b\62"+
		"\1\2\u03a1\u03a2\5 \21\2\u03a2\u03a3\5<\37\2\u03a3\u03a4\t\17\2\2\u03a4"+
		"c\3\2\2\2\u03a5\u03a7\7X\2\2\u03a6\u03a8\7\u00c1\2\2\u03a7\u03a6\3\2\2"+
		"\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\5B\"\2\u03aa\u03ac"+
		"\7\u00c2\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2\2"+
		"\2\u03ad\u03af\7\u00c1\2\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b1\5B\"\2\u03b1\u03b3\b\63\1\2\u03b2\u03b4\7\u00c2"+
		"\2\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"\u03b6\5 \21\2\u03b6\u03b7\t\16\2\2\u03b7\u03b8\5Z.\2\u03b8e\3\2\2\2\u03b9"+
		"\u03ba\7Y\2\2\u03ba\u03bb\5 \21\2\u03bbg\3\2\2\2\u03bc\u03bd\7}\2\2\u03bd"+
		"\u03be\5B\"\2\u03be\u03bf\5B\"\2\u03bf\u03c0\5B\"\2\u03c0\u03c1\5B\"\2"+
		"\u03c1\u03c2\t\20\2\2\u03c2\u03c3\b\65\1\2\u03c3\u03c4\5<\37\2\u03c4\u03c5"+
		"\b\65\1\2\u03c5\u03c6\5<\37\2\u03c6\u03c7\b\65\1\2\u03c7\u03c8\5<\37\2"+
		"\u03c8\u03c9\b\65\1\2\u03c9i\3\2\2\2\u03ca\u03cb\7Z\2\2\u03cb\u03cc\5"+
		"B\"\2\u03cc\u03cd\5B\"\2\u03cd\u03ce\5B\"\2\u03ce\u03cf\5B\"\2\u03cf\u03d0"+
		"\t\20\2\2\u03d0\u03d1\b\66\1\2\u03d1\u03d2\5<\37\2\u03d2\u03d3\b\66\1"+
		"\2\u03d3\u03d4\5<\37\2\u03d4\u03d5\b\66\1\2\u03d5\u03d6\5<\37\2\u03d6"+
		"\u03d7\b\66\1\2\u03d7k\3\2\2\2\u03d8\u03d9\7[\2\2\u03d9\u03da\5B\"\2\u03da"+
		"\u03db\5B\"\2\u03db\u03dc\b\67\1\2\u03dcm\3\2\2\2\u03dd\u03de\7\\\2\2"+
		"\u03de\u03df\5B\"\2\u03df\u03e0\5B\"\2\u03e0\u03e1\b8\1\2\u03e1\u03e2"+
		"\5B\"\2\u03e2\u03e3\5Z.\2\u03e3o\3\2\2\2\u03e4\u03e5\7]\2\2\u03e5\u03e9"+
		"\5B\"\2\u03e6\u03e7\5> \2\u03e7\u03e8\b9\1\2\u03e8\u03ea\3\2\2\2\u03e9"+
		"\u03e6\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2"+
		"\2\2\u03ecq\3\2\2\2\u03ed\u03ee\7^\2\2\u03ee\u03ef\7\u00a7\2\2\u03ef\u03f0"+
		"\7\u00a7\2\2\u03f0\u03f1\7\u00a2\2\2\u03f1\u03f2\7\u00da\2\2\u03f2\u03f3"+
		"\7\u00a7\2\2\u03f3\u03f4\7\u00a7\2\2\u03f4\u03f5\7\u00a2\2\2\u03f5\u03f6"+
		"\7\u00da\2\2\u03f6\u03f7\7\u00a7\2\2\u03f7\u03f8\7\u00a7\2\2\u03f8\u03f9"+
		"\7\u00a2\2\2\u03f9\u03fa\7\u00da\2\2\u03fa\u03fb\7\u00a7\2\2\u03fb\u03fc"+
		"\7\u00a7\2\2\u03fc\u03fd\7\u00a2\2\2\u03fd\u03fe\7\u00da\2\2\u03fe\u03ff"+
		"\7\u00a7\2\2\u03ff\u0400\7\u00a7\2\2\u0400\u0401\7\u00a2\2\2\u0401\u0402"+
		"\7\u00da\2\2\u0402s\3\2\2\2\u0403\u0404\7_\2\2\u0404\u0405\b;\1\2\u0405"+
		"\u0406\t\3\2\2\u0406\u0407\b;\1\2\u0407\u0408\5B\"\2\u0408\u0409\b;\1"+
		"\2\u0409\u040a\5B\"\2\u040a\u040f\b;\1\2\u040b\u040c\79\2\2\u040c\u040d"+
		"\5B\"\2\u040d\u040e\5B\"\2\u040e\u0410\3\2\2\2\u040f\u040b\3\2\2\2\u040f"+
		"\u0410\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0416\b;\1\2\u0412\u0413\7:\2"+
		"\2\u0413\u0414\5B\"\2\u0414\u0415\5B\"\2\u0415\u0417\3\2\2\2\u0416\u0412"+
		"\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\b;\1\2\u0419"+
		"\u041a\5B\"\2\u041a\u041b\b;\1\2\u041b\u0421\b;\1\2\u041c\u041d\5\64\33"+
		"\2\u041d\u041e\b;\1\2\u041e\u0420\3\2\2\2\u041f\u041c\3\2\2\2\u0420\u0423"+
		"\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\3\2\2\2\u0423"+
		"\u0421\3\2\2\2\u0424\u0425\b;\1\2\u0425u\3\2\2\2\u0426\u0427\7`\2\2\u0427"+
		"\u0428\5B\"\2\u0428\u0429\5B\"\2\u0429\u042a\t\21\2\2\u042a\u042b\b<\1"+
		"\2\u042bw\3\2\2\2\u042c\u042d\7a\2\2\u042d\u042e\5B\"\2\u042e\u042f\7"+
		"\u00a2\2\2\u042fy\3\2\2\2\u0430\u0431\7q\2\2\u0431\u0432\5B\"\2\u0432"+
		"{\3\2\2\2\u0433\u0434\7d\2\2\u0434}\3\2\2\2\u0435\u0436\7e\2\2\u0436\u0437"+
		"\5B\"\2\u0437\u0438\5B\"\2\u0438\u0439\b@\1\2\u0439\u043a\5B\"\2\u043a"+
		"\u043b\5B\"\2\u043b\u043c\t\22\2\2\u043c\u043d\t\23\2\2\u043d\u043e\7"+
		"\u00a2\2\2\u043e\u043f\5Z.\2\u043f\177\3\2\2\2\u0440\u0441\7g\2\2\u0441"+
		"\u0442\7\u00a2\2\2\u0442\u0081\3\2\2\2\u0443\u0444\7i\2\2\u0444\u0445"+
		"\bB\1\2\u0445\u0446\5B\"\2\u0446\u0447\bB\1\2\u0447\u0448\7\u00a2\2\2"+
		"\u0448\u0449\bB\1\2\u0449\u044a\5B\"\2\u044a\u044b\bB\1\2\u044b\u044f"+
		"\bB\1\2\u044c\u044d\5> \2\u044d\u044e\bB\1\2\u044e\u0450\3\2\2\2\u044f"+
		"\u044c\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2"+
		"\2\2\u0452\u0453\3\2\2\2\u0453\u0454\bB\1\2\u0454\u0083\3\2\2\2\u0455"+
		"\u0456\7k\2\2\u0456\u0457\5B\"\2\u0457\u0458\5B\"\2\u0458\u0459\bC\1\2"+
		"\u0459\u045a\5B\"\2\u045a\u045b\5B\"\2\u045b\u045c\t\16\2\2\u045c\u045d"+
		"\5Z.\2\u045d\u0085\3\2\2\2\u045e\u045f\7l\2\2\u045f\u0460\bD\1\2\u0460"+
		"\u0461\5.\30\2\u0461\u0462\bD\1\2\u0462\u0087\3\2\2\2\u0463\u0464\7m\2"+
		"\2\u0464\u0465\bE\1\2\u0465\u046c\5B\"\2\u0466\u0468\5<\37\2\u0467\u0469"+
		"\7\u00c3\2\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\3\2\2"+
		"\2\u046a\u0466\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046d"+
		"\3\2\2\2\u046d\u0089\3\2\2\2\u046e\u046c\3\2\2\2\u046f\u0470\7b\2\2\u0470"+
		"\u0471\bF\1\2\u0471\u008b\3\2\2\2\u0472\u0473\7c\2\2\u0473\u0474\bG\1"+
		"\2\u0474\u008d\3\2\2\2\u0475\u0476\7o\2\2\u0476\u0477\bH\1\2\u0477\u0478"+
		"\5.\30\2\u0478\u0479\bH\1\2\u0479\u008f\3\2\2\2\u047a\u047b\7r\2\2\u047b"+
		"\u047c\5B\"\2\u047c\u047d\bI\1\2\u047d\u047e\5B\"\2\u047e\u047f\5B\"\2"+
		"\u047f\u0480\5B\"\2\u0480\u0481\5B\"\2\u0481\u0482\7\u00d8\2\2\u0482\u0483"+
		"\bI\1\2\u0483\u0484\7\u00d8\2\2\u0484\u0485\bI\1\2\u0485\u0486\7\u00d8"+
		"\2\2\u0486\u0487\bI\1\2\u0487\u0488\7\u00d8\2\2\u0488\u0489\bI\1\2\u0489"+
		"\u048a\7\u00d8\2\2\u048a\u048b\bI\1\2\u048b\u048c\7\u00d8\2\2\u048c\u048d"+
		"\bI\1\2\u048d\u0494\bI\1\2\u048e\u048f\6I\21\3\u048f\u0490\5\64\33\2\u0490"+
		"\u0491\bI\1\2\u0491\u0493\3\2\2\2\u0492\u048e\3\2\2\2\u0493\u0496\3\2"+
		"\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0497\3\2\2\2\u0496"+
		"\u0494\3\2\2\2\u0497\u049d\bI\1\2\u0498\u0499\6I\22\3\u0499\u049a\7\u00da"+
		"\2\2\u049a\u049c\bI\1\2\u049b\u0498\3\2\2\2\u049c\u049f\3\2\2\2\u049d"+
		"\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u049d\3\2"+
		"\2\2\u04a0\u04a6\bI\1\2\u04a1\u04a2\6I\23\3\u04a2\u04a3\7\u00da\2\2\u04a3"+
		"\u04a5\bI\1\2\u04a4\u04a1\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3\2"+
		"\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9"+
		"\u04af\bI\1\2\u04aa\u04ab\6I\24\3\u04ab\u04ac\7\u00b9\2\2\u04ac\u04ae"+
		"\bI\1\2\u04ad\u04aa\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b9\bI"+
		"\1\2\u04b3\u04b4\6I\25\3\u04b4\u04b5\5B\"\2\u04b5\u04b6\bI\1\2\u04b6\u04b8"+
		"\3\2\2\2\u04b7\u04b3\3\2\2\2\u04b8\u04bb\3\2\2\2\u04b9\u04b7\3\2\2\2\u04b9"+
		"\u04ba\3\2\2\2\u04ba\u04bc\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bc\u04c2\bI"+
		"\1\2\u04bd\u04be\6I\26\3\u04be\u04bf\7\u00b5\2\2\u04bf\u04c1\bI\1\2\u04c0"+
		"\u04bd\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2"+
		"\2\2\u04c3\u04d0\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04c6\7\u00d8\2\2\u04c6"+
		"\u04c7\bI\1\2\u04c7\u04cd\bI\1\2\u04c8\u04c9\6I\27\3\u04c9\u04ca\7\u00a7"+
		"\2\2\u04ca\u04cc\bI\1\2\u04cb\u04c8\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd"+
		"\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd\3\2"+
		"\2\2\u04d0\u04c5\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04de\3\2\2\2\u04d2"+
		"\u04d3\7\u00d8\2\2\u04d3\u04d4\bI\1\2\u04d4\u04db\bI\1\2\u04d5\u04d6\6"+
		"I\30\3\u04d6\u04d7\5B\"\2\u04d7\u04d8\bI\1\2\u04d8\u04da\3\2\2\2\u04d9"+
		"\u04d5\3\2\2\2\u04da\u04dd\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04dc\3\2"+
		"\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04de\u04d2\3\2\2\2\u04de"+
		"\u04df\3\2\2\2\u04df\u0091\3\2\2\2\u04e0\u04e1\7t\2\2\u04e1\u04e2\7\u00d8"+
		"\2\2\u04e2\u04e8\bJ\1\2\u04e3\u04e4\6J\31\3\u04e4\u04e5\7\u00da\2\2\u04e5"+
		"\u04e7\bJ\1\2\u04e6\u04e3\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2"+
		"\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb"+
		"\u04ec\7\u00d8\2\2\u04ec\u04f2\bJ\1\2\u04ed\u04ee\6J\32\3\u04ee\u04ef"+
		"\7\u00da\2\2\u04ef\u04f1\bJ\1\2\u04f0\u04ed\3\2\2\2\u04f1\u04f4\3\2\2"+
		"\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\3\2\2\2\u04f4\u04f2"+
		"\3\2\2\2\u04f5\u04f6\7\u00d8\2\2\u04f6\u04fc\bJ\1\2\u04f7\u04f8\6J\33"+
		"\3\u04f8\u04f9\7\u00da\2\2\u04f9\u04fb\bJ\1\2\u04fa\u04f7\3\2\2\2\u04fb"+
		"\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff\3\2"+
		"\2\2\u04fe\u04fc\3\2\2\2\u04ff\u0500\7\u00d8\2\2\u0500\u0506\bJ\1\2\u0501"+
		"\u0502\6J\34\3\u0502\u0503\7\u00da\2\2\u0503\u0505\bJ\1\2\u0504\u0501"+
		"\3\2\2\2\u0505\u0508\3\2\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u0509\3\2\2\2\u0508\u0506\3\2\2\2\u0509\u050a\7\u00d8\2\2\u050a\u0510"+
		"\bJ\1\2\u050b\u050c\6J\35\3\u050c\u050d\7\u00da\2\2\u050d\u050f\bJ\1\2"+
		"\u050e\u050b\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511"+
		"\3\2\2\2\u0511\u0513\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u0514\7\u00d8\2"+
		"\2\u0514\u051a\bJ\1\2\u0515\u0516\6J\36\3\u0516\u0517\7\u00da\2\2\u0517"+
		"\u0519\bJ\1\2\u0518\u0515\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2"+
		"\2\2\u051a\u051b\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u051a\3\2\2\2\u051d"+
		"\u051e\7\u00d8\2\2\u051e\u0524\bJ\1\2\u051f\u0520\6J\37\3\u0520\u0521"+
		"\7\u00da\2\2\u0521\u0523\bJ\1\2\u0522\u051f\3\2\2\2\u0523\u0526\3\2\2"+
		"\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2\2\2\u0526\u0524"+
		"\3\2\2\2\u0527\u0528\7\u00d8\2\2\u0528\u052e\bJ\1\2\u0529\u052a\6J \3"+
		"\u052a\u052b\7\u00da\2\2\u052b\u052d\bJ\1\2\u052c\u0529\3\2\2\2\u052d"+
		"\u0530\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0093\3\2"+
		"\2\2\u0530\u052e\3\2\2\2\u0531\u0532\7s\2\2\u0532\u0533\5B\"\2\u0533\u0534"+
		"\bK\1\2\u0534\u0535\5B\"\2\u0535\u0536\bK\1\2\u0536\u0537\5B\"\2\u0537"+
		"\u0538\bK\1\2\u0538\u0539\5B\"\2\u0539\u053a\bK\1\2\u053a\u053b\5B\"\2"+
		"\u053b\u053c\bK\1\2\u053c\u053d\bK\1\2\u053d\u053e\7\u00d8\2\2\u053e\u053f"+
		"\bK\1\2\u053f\u0540\7\u00d8\2\2\u0540\u0541\bK\1\2\u0541\u0542\7\u00d8"+
		"\2\2\u0542\u0543\bK\1\2\u0543\u0544\7\u00d8\2\2\u0544\u0545\bK\1\2\u0545"+
		"\u0546\7\u00d8\2\2\u0546\u0547\bK\1\2\u0547\u0548\7\u00d8\2\2\u0548\u0549"+
		"\bK\1\2\u0549\u054a\5\u0096L\2\u054a\u054b\bK\1\2\u054b\u054c\5\u0098"+
		"M\2\u054c\u054d\bK\1\2\u054d\u054e\5\u009aN\2\u054e\u054f\bK\1\2\u054f"+
		"\u0550\5\u009cO\2\u0550\u0551\bK\1\2\u0551\u0552\5\u009eP\2\u0552\u0553"+
		"\bK\1\2\u0553\u0554\5\u00a0Q\2\u0554\u055a\bK\1\2\u0555\u0556\7\u00d8"+
		"\2\2\u0556\u0557\bK\1\2\u0557\u0558\5\u00a2R\2\u0558\u0559\bK\1\2\u0559"+
		"\u055b\3\2\2\2\u055a\u0555\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u0561\3\2"+
		"\2\2\u055c\u055d\7\u00d8\2\2\u055d\u055e\bK\1\2\u055e\u055f\5\u00a4S\2"+
		"\u055f\u0560\bK\1\2\u0560\u0562\3\2\2\2\u0561\u055c\3\2\2\2\u0561\u0562"+
		"\3\2\2\2\u0562\u0095\3\2\2\2\u0563\u0564\6L!\3\u0564\u0565\5\64\33\2\u0565"+
		"\u0566\bL\1\2\u0566\u0568\3\2\2\2\u0567\u0563\3\2\2\2\u0568\u056b\3\2"+
		"\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u0097\3\2\2\2\u056b"+
		"\u0569\3\2\2\2\u056c\u056d\6M\"\3\u056d\u056e\7\u00da\2\2\u056e\u0570"+
		"\bM\1\2\u056f\u056c\3\2\2\2\u0570\u0573\3\2\2\2\u0571\u056f\3\2\2\2\u0571"+
		"\u0572\3\2\2\2\u0572\u0099\3\2\2\2\u0573\u0571\3\2\2\2\u0574\u0575\6N"+
		"#\3\u0575\u0576\7\u00da\2\2\u0576\u0578\bN\1\2\u0577\u0574\3\2\2\2\u0578"+
		"\u057b\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u009b\3\2"+
		"\2\2\u057b\u0579\3\2\2\2\u057c\u057d\6O$\3\u057d\u057e\7\u00b9\2\2\u057e"+
		"\u0580\bO\1\2\u057f\u057c\3\2\2\2\u0580\u0583\3\2\2\2\u0581\u057f\3\2"+
		"\2\2\u0581\u0582\3\2\2\2\u0582\u009d\3\2\2\2\u0583\u0581\3\2\2\2\u0584"+
		"\u0585\6P%\3\u0585\u0586\5B\"\2\u0586\u0587\bP\1\2\u0587\u0589\3\2\2\2"+
		"\u0588\u0584\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2\2\2\u058a\u058b"+
		"\3\2\2\2\u058b\u009f\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u058e\6Q&\3\u058e"+
		"\u058f\7\u00b5\2\2\u058f\u0591\bQ\1\2\u0590\u058d\3\2\2\2\u0591\u0594"+
		"\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u00a1\3\2\2\2\u0594"+
		"\u0592\3\2\2\2\u0595\u0596\6R\'\3\u0596\u0597\7\u00a7\2\2\u0597\u0599"+
		"\bR\1\2\u0598\u0595\3\2\2\2\u0599\u059c\3\2\2\2\u059a\u0598\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u00a3\3\2\2\2\u059c\u059a\3\2\2\2\u059d\u059e\6S"+
		"(\3\u059e\u059f\5B\"\2\u059f\u05a0\bS\1\2\u05a0\u05a2\3\2\2\2\u05a1\u059d"+
		"\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4"+
		"\u00a5\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05a7\7u\2\2\u05a7\u05a8\5B\""+
		"\2\u05a8\u05a9\bT\1\2\u05a9\u05aa\5B\"\2\u05aa\u05ab\bT\1\2\u05ab\u05ac"+
		"\5B\"\2\u05ac\u05ad\bT\1\2\u05ad\u05ae\5B\"\2\u05ae\u05af\bT\1\2\u05af"+
		"\u05b0\5B\"\2\u05b0\u05b1\bT\1\2\u05b1\u05b2\bT\1\2\u05b2\u00a7\3\2\2"+
		"\2\u05b3\u05b4\7v\2\2\u05b4\u05bf\bU\1\2\u05b5\u05b6\7?\2\2\u05b6\u05c0"+
		"\bU\1\2\u05b7\u05b8\7@\2\2\u05b8\u05c0\bU\1\2\u05b9\u05ba\7B\2\2\u05ba"+
		"\u05c0\bU\1\2\u05bb\u05bc\7C\2\2\u05bc\u05c0\bU\1\2\u05bd\u05be\7D\2\2"+
		"\u05be\u05c0\bU\1\2\u05bf\u05b5\3\2\2\2\u05bf\u05b7\3\2\2\2\u05bf\u05b9"+
		"\3\2\2\2\u05bf\u05bb\3\2\2\2\u05bf\u05bd\3\2\2\2\u05c0\u00a9\3\2\2\2\u05c1"+
		"\u05c2\7w\2\2\u05c2\u05c3\7\u00ad\2\2\u05c3\u05c4\t\b\2\2\u05c4\u05c5"+
		"\bV\1\2\u05c5\u05c6\5\u00acW\2\u05c6\u00ab\3\2\2\2\u05c7\u05c8\bW\1\2"+
		"\u05c8\u05d0\5\u00aeX\2\u05c9\u05ca\7\u00d1\2\2\u05ca\u05cb\bW\1\2\u05cb"+
		"\u05d0\5\u00acW\b\u05cc\u05cd\7\u00d2\2\2\u05cd\u05ce\bW\1\2\u05ce\u05d0"+
		"\5\u00acW\7\u05cf\u05c7\3\2\2\2\u05cf\u05c9\3\2\2\2\u05cf\u05cc\3\2\2"+
		"\2\u05d0\u05e3\3\2\2\2\u05d1\u05d2\f\6\2\2\u05d2\u05d3\7\u00c4\2\2\u05d3"+
		"\u05d4\bW\1\2\u05d4\u05e2\5\u00acW\7\u05d5\u05d6\f\5\2\2\u05d6\u05d7\7"+
		"\u00d4\2\2\u05d7\u05d8\bW\1\2\u05d8\u05e2\5\u00acW\6\u05d9\u05da\f\4\2"+
		"\2\u05da\u05db\7\u00d1\2\2\u05db\u05dc\bW\1\2\u05dc\u05e2\5\u00acW\5\u05dd"+
		"\u05de\f\3\2\2\u05de\u05df\7\u00d2\2\2\u05df\u05e0\bW\1\2\u05e0\u05e2"+
		"\5\u00acW\4\u05e1\u05d1\3\2\2\2\u05e1\u05d5\3\2\2\2\u05e1\u05d9\3\2\2"+
		"\2\u05e1\u05dd\3\2\2\2\u05e2\u05e5\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4"+
		"\3\2\2\2\u05e4\u00ad\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e6\u05e7\7\u00bd\2"+
		"\2\u05e7\u05e8\bX\1\2\u05e8\u05e9\5\u00acW\2\u05e9\u05ea\7\u00be\2\2\u05ea"+
		"\u05eb\bX\1\2\u05eb\u063f\3\2\2\2\u05ec\u05ed\7\u0098\2\2\u05ed\u05ee"+
		"\7\u00bd\2\2\u05ee\u05ef\bX\1\2\u05ef\u05f0\5\u00acW\2\u05f0\u05f1\7\u00be"+
		"\2\2\u05f1\u05f2\bX\1\2\u05f2\u063f\3\2\2\2\u05f3\u05f4\7\u0099\2\2\u05f4"+
		"\u05f5\7\u00bd\2\2\u05f5\u05f6\bX\1\2\u05f6\u05f7\5\u00acW\2\u05f7\u05f8"+
		"\7\u00be\2\2\u05f8\u05f9\bX\1\2\u05f9\u063f\3\2\2\2\u05fa\u05fb\7\u009a"+
		"\2\2\u05fb\u05fc\7\u00bd\2\2\u05fc\u05fd\bX\1\2\u05fd\u05fe\5\u00acW\2"+
		"\u05fe\u05ff\7\u00be\2\2\u05ff\u0600\bX\1\2\u0600\u063f\3\2\2\2\u0601"+
		"\u0602\7\u009b\2\2\u0602\u0603\7\u00bd\2\2\u0603\u0604\bX\1\2\u0604\u0605"+
		"\5\u00acW\2\u0605\u0606\7\u00be\2\2\u0606\u0607\bX\1\2\u0607\u063f\3\2"+
		"\2\2\u0608\u0609\7\u009c\2\2\u0609\u060a\7\u00bd\2\2\u060a\u060b\bX\1"+
		"\2\u060b\u060c\5\u00acW\2\u060c\u060d\7\u00be\2\2\u060d\u060e\bX\1\2\u060e"+
		"\u063f\3\2\2\2\u060f\u0610\7\u009d\2\2\u0610\u0611\7\u00bd\2\2\u0611\u0612"+
		"\bX\1\2\u0612\u0613\5\u00acW\2\u0613\u0614\7\u00be\2\2\u0614\u0615\bX"+
		"\1\2\u0615\u063f\3\2\2\2\u0616\u0617\7\u009e\2\2\u0617\u0618\7\u00bd\2"+
		"\2\u0618\u0619\bX\1\2\u0619\u061a\5\u00acW\2\u061a\u061b\7\u00be\2\2\u061b"+
		"\u061c\bX\1\2\u061c\u063f\3\2\2\2\u061d\u061e\7\u009f\2\2\u061e\u061f"+
		"\7\u00bd\2\2\u061f\u0620\bX\1\2\u0620\u0621\5\u00acW\2\u0621\u0622\7\u00be"+
		"\2\2\u0622\u0623\bX\1\2\u0623\u063f\3\2\2\2\u0624\u0625\7\u00a0\2\2\u0625"+
		"\u0626\7\u00bd\2\2\u0626\u0627\bX\1\2\u0627\u0628\5\u00acW\2\u0628\u0629"+
		"\7\u00be\2\2\u0629\u062a\bX\1\2\u062a\u063f\3\2\2\2\u062b\u062c\5B\"\2"+
		"\u062c\u062d\bX\1\2\u062d\u063f\3\2\2\2\u062e\u062f\7\u00ba\2\2\u062f"+
		"\u063f\bX\1\2\u0630\u0631\7\u00bb\2\2\u0631\u063f\bX\1\2\u0632\u0634\5"+
		"\64\33\2\u0633\u0635\58\35\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u0637\bX\1\2\u0637\u063f\3\2\2\2\u0638\u063a\5\66"+
		"\34\2\u0639\u063b\5:\36\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u063c\3\2\2\2\u063c\u063d\bX\1\2\u063d\u063f\3\2\2\2\u063e\u05e6\3\2"+
		"\2\2\u063e\u05ec\3\2\2\2\u063e\u05f3\3\2\2\2\u063e\u05fa\3\2\2\2\u063e"+
		"\u0601\3\2\2\2\u063e\u0608\3\2\2\2\u063e\u060f\3\2\2\2\u063e\u0616\3\2"+
		"\2\2\u063e\u061d\3\2\2\2\u063e\u0624\3\2\2\2\u063e\u062b\3\2\2\2\u063e"+
		"\u062e\3\2\2\2\u063e\u0630\3\2\2\2\u063e\u0632\3\2\2\2\u063e\u0638\3\2"+
		"\2\2\u063f\u00af\3\2\2\2\u0640\u0641\7x\2\2\u0641\u0642\5B\"\2\u0642\u0643"+
		"\bY\1\2\u0643\u0644\5B\"\2\u0644\u0645\bY\1\2\u0645\u0646\bY\1\2\u0646"+
		"\u0647\t\16\2\2\u0647\u0648\bY\1\2\u0648\u0649\t\24\2\2\u0649\u0678\b"+
		"Y\1\2\u064a\u064b\7\65\2\2\u064b\u064c\bY\1\2\u064c\u064d\5B\"\2\u064d"+
		"\u064e\bY\1\2\u064e\u064f\5B\"\2\u064f\u0650\bY\1\2\u0650\u0651\bY\1\2"+
		"\u0651\u0652\5B\"\2\u0652\u0653\bY\1\2\u0653\u0654\5B\"\2\u0654\u0655"+
		"\bY\1\2\u0655\u0656\7\u00dd\2\2\u0656\u0657\bY\1\2\u0657\u0658\5B\"\2"+
		"\u0658\u0659\bY\1\2\u0659\u065a\t\17\2\2\u065a\u065b\bY\1\2\u065b\u065c"+
		"\3\2\2\2\u065c\u065d\bY\1\2\u065d\u0679\3\2\2\2\u065e\u065f\7\66\2\2\u065f"+
		"\u0676\bY\1\2\u0660\u0661\7\21\2\2\u0661\u0662\bY\1\2\u0662\u0663\5B\""+
		"\2\u0663\u0664\bY\1\2\u0664\u0665\7\u00da\2\2\u0665\u0666\bY\1\2\u0666"+
		"\u0667\3\2\2\2\u0667\u0668\bY\1\2\u0668\u0677\3\2\2\2\u0669\u066a\7\23"+
		"\2\2\u066a\u066b\bY\1\2\u066b\u066c\5B\"\2\u066c\u066d\bY\1\2\u066d\u066e"+
		"\5B\"\2\u066e\u066f\bY\1\2\u066f\u0670\5B\"\2\u0670\u0671\bY\1\2\u0671"+
		"\u0672\7\u00da\2\2\u0672\u0673\bY\1\2\u0673\u0674\3\2\2\2\u0674\u0675"+
		"\bY\1\2\u0675\u0677\3\2\2\2\u0676\u0660\3\2\2\2\u0676\u0669\3\2\2\2\u0677"+
		"\u0679\3\2\2\2\u0678\u064a\3\2\2\2\u0678\u065e\3\2\2\2\u0679\u06d8\3\2"+
		"\2\2\u067a\u067b\7\67\2\2\u067b\u067c\bY\1\2\u067c\u067d\5B\"\2\u067d"+
		"\u067e\bY\1\2\u067e\u067f\3\2\2\2\u067f\u0680\bY\1\2\u0680\u06d9\3\2\2"+
		"\2\u0681\u0682\78\2\2\u0682\u0683\bY\1\2\u0683\u0684\7\u00d8\2\2\u0684"+
		"\u0685\bY\1\2\u0685\u06d6\bY\1\2\u0686\u0687\6Y-\3\u0687\u0688\5\u00ba"+
		"^\2\u0688\u0689\bY\1\2\u0689\u06d7\3\2\2\2\u068a\u068b\6Y.\3\u068b\u068c"+
		"\7\u00d8\2\2\u068c\u068d\7\u00d8\2\2\u068d\u06d7\bY\1\2\u068e\u068f\6"+
		"Y/\3\u068f\u0690\7\u00d8\2\2\u0690\u06d7\bY\1\2\u0691\u0692\6Y\60\3\u0692"+
		"\u0693\7\u00da\2\2\u0693\u06d7\bY\1\2\u0694\u0695\6Y\61\3\u0695\u0696"+
		"\bY\1\2\u0696\u0697\7\u00d8\2\2\u0697\u06af\bY\1\2\u0698\u0699\6Y\62\3"+
		"\u0699\u069a\7\u00d8\2\2\u069a\u069b\bY\1\2\u069b\u069c\7\u00d8\2\2\u069c"+
		"\u069d\bY\1\2\u069d\u069e\bY\1\2\u069e\u069f\7\u00d8\2\2\u069f\u06a7\b"+
		"Y\1\2\u06a0\u06a1\6Y\63\3\u06a1\u06a2\5\u00ba^\2\u06a2\u06a3\bY\1\2\u06a3"+
		"\u06a4\bY\1\2\u06a4\u06a6\3\2\2\2\u06a5\u06a0\3\2\2\2\u06a6\u06a9\3\2"+
		"\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06aa\3\2\2\2\u06a9"+
		"\u06a7\3\2\2\2\u06aa\u06ab\bY\1\2\u06ab\u06ac\3\2\2\2\u06ac\u06ae\bY\1"+
		"\2\u06ad\u0698\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af\u06ad\3\2\2\2\u06af\u06b0"+
		"\3\2\2\2\u06b0\u06b2\3\2\2\2\u06b1\u06af\3\2\2\2\u06b2\u06d7\bY\1\2\u06b3"+
		"\u06b4\6Y\64\3\u06b4\u06b5\5\u00ba^\2\u06b5\u06b6\bY\1\2\u06b6\u06b7\7"+
		"\u00d8\2\2\u06b7\u06b8\bY\1\2\u06b8\u06b9\7\u00d8\2\2\u06b9\u06d0\bY\1"+
		"\2\u06ba\u06bb\6Y\65\3\u06bb\u06bc\7\u00d8\2\2\u06bc\u06bd\bY\1\2\u06bd"+
		"\u06be\7\u00d8\2\2\u06be\u06bf\bY\1\2\u06bf\u06c0\bY\1\2\u06c0\u06c1\7"+
		"\u00d8\2\2\u06c1\u06ca\bY\1\2\u06c2\u06c3\6Y\66\3\u06c3\u06c4\6Y\67\3"+
		"\u06c4\u06c5\5\u00ba^\2\u06c5\u06c6\bY\1\2\u06c6\u06c7\bY\1\2\u06c7\u06c9"+
		"\3\2\2\2\u06c8\u06c2\3\2\2\2\u06c9\u06cc\3\2\2\2\u06ca\u06c8\3\2\2\2\u06ca"+
		"\u06cb\3\2\2\2\u06cb\u06cd\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cd\u06ce\bY"+
		"\1\2\u06ce\u06cf\3\2\2\2\u06cf\u06d1\bY\1\2\u06d0\u06ba\3\2\2\2\u06d1"+
		"\u06d2\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d4\3\2"+
		"\2\2\u06d4\u06d5\bY\1\2\u06d5\u06d7\3\2\2\2\u06d6\u0686\3\2\2\2\u06d6"+
		"\u068a\3\2\2\2\u06d6\u068e\3\2\2\2\u06d6\u0691\3\2\2\2\u06d6\u0694\3\2"+
		"\2\2\u06d6\u06b3\3\2\2\2\u06d7\u06d9\3\2\2\2\u06d8\u067a\3\2\2\2\u06d8"+
		"\u0681\3\2\2\2\u06d9\u00b1\3\2\2\2\u06da\u06db\7~\2\2\u06db\u06dc\5B\""+
		"\2\u06dc\u06dd\5B\"\2\u06dd\u06de\bZ\1\2\u06de\u06df\5B\"\2\u06df\u06e0"+
		"\5B\"\2\u06e0\u06e1\bZ\1\2\u06e1\u06e2\t\25\2\2\u06e2\u00b3\3\2\2\2\u06e3"+
		"\u06e4\7\u0082\2\2\u06e4\u06e5\5B\"\2\u06e5\u06e6\b[\1\2\u06e6\u06e7\5"+
		"B\"\2\u06e7\u06e8\b[\1\2\u06e8\u06e9\5B\"\2\u06e9\u06ea\b[\1\2\u06ea\u06eb"+
		"\5B\"\2\u06eb\u06ec\b[\1\2\u06ec\u06ed\5B\"\2\u06ed\u06ee\b[\1\2\u06ee"+
		"\u06ef\5B\"\2\u06ef\u06f0\b[\1\2\u06f0\u06f1\5B\"\2\u06f1\u06f2\b[\1\2"+
		"\u06f2\u06f3\5B\"\2\u06f3\u06f4\b[\1\2\u06f4\u00b5\3\2\2\2\u06f5\u06f6"+
		"\7\u0083\2\2\u06f6\u06f7\5B\"\2\u06f7\u06f8\b\\\1\2\u06f8\u06f9\5B\"\2"+
		"\u06f9\u06fa\b\\\1\2\u06fa\u06fb\5B\"\2\u06fb\u06fc\b\\\1\2\u06fc\u06fd"+
		"\t\26\2\2\u06fd\u06fe\b\\\1\2\u06fe\u06ff\5<\37\2\u06ff\u0700\b\\\1\2"+
		"\u0700\u0701\5<\37\2\u0701\u0702\b\\\1\2\u0702\u0703\5<\37\2\u0703\u0704"+
		"\b\\\1\2\u0704\u0705\t\27\2\2\u0705\u0711\b\\\1\2\u0706\u0707\7\u00dd"+
		"\2\2\u0707\u0708\b\\\1\2\u0708\u0709\5B\"\2\u0709\u070a\b\\\1\2\u070a"+
		"\u070b\5B\"\2\u070b\u070c\b\\\1\2\u070c\u070d\5B\"\2\u070d\u070e\b\\\1"+
		"\2\u070e\u070f\t\17\2\2\u070f\u0710\b\\\1\2\u0710\u0712\3\2\2\2\u0711"+
		"\u0706\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u00b7\3\2\2\2\u0713\u0714\7\u008a"+
		"\2\2\u0714\u0715\7\u00ad\2\2\u0715\u0719\t\b\2\2\u0716\u0718\7\u00c1\2"+
		"\2\u0717\u0716\3\2\2\2\u0718\u071b\3\2\2\2\u0719\u0717\3\2\2\2\u0719\u071a"+
		"\3\2\2\2\u071a\u071c\3\2\2\2\u071b\u0719\3\2\2\2\u071c\u0720\5<\37\2\u071d"+
		"\u071f\7\u00c2\2\2\u071e\u071d\3\2\2\2\u071f\u0722\3\2\2\2\u0720\u071e"+
		"\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u00b9\3\2\2\2\u0722\u0720\3\2\2\2\u0723"+
		"\u0725\7\u00db\2\2\u0724\u0726\7\u00a8\2\2\u0725\u0724\3\2\2\2\u0725\u0726"+
		"\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u074f\b^\1\2\u0728\u072a\7\u00ad\2"+
		"\2\u0729\u072b\7\u00a8\2\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b"+
		"\u072c\3\2\2\2\u072c\u074f\b^\1\2\u072d\u072f\7\u00a9\2\2\u072e\u0730"+
		"\7\u00a8\2\2\u072f\u072e\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0731\3\2\2"+
		"\2\u0731\u074f\b^\1\2\u0732\u0734\7\u00ac\2\2\u0733\u0735\7\u00a8\2\2"+
		"\u0734\u0733\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u074f"+
		"\b^\1\2\u0737\u0739\7\u00ab\2\2\u0738\u073a\7\u00a8\2\2\u0739\u0738\3"+
		"\2\2\2\u0739\u073a\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u074f\b^\1\2\u073c"+
		"\u073e\7\u00aa\2\2\u073d\u073f\7\u00a8\2\2\u073e\u073d\3\2\2\2\u073e\u073f"+
		"\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u074f\b^\1\2\u0741\u0743\7\u00af\2"+
		"\2\u0742\u0744\7\u00a8\2\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744"+
		"\u0745\3\2\2\2\u0745\u074f\b^\1\2\u0746\u0747\7\u00b9\2\2\u0747\u074f"+
		"\b^\1\2\u0748\u0749\7\u00ba\2\2\u0749\u074f\b^\1\2\u074a\u074b\7\u00d8"+
		"\2\2\u074b\u074f\b^\1\2\u074c\u074d\7\u00da\2\2\u074d\u074f\b^\1\2\u074e"+
		"\u0723\3\2\2\2\u074e\u0728\3\2\2\2\u074e\u072d\3\2\2\2\u074e\u0732\3\2"+
		"\2\2\u074e\u0737\3\2\2\2\u074e\u073c\3\2\2\2\u074e\u0741\3\2\2\2\u074e"+
		"\u0746\3\2\2\2\u074e\u0748\3\2\2\2\u074e\u074a\3\2\2\2\u074e\u074c\3\2"+
		"\2\2\u074f\u00bb\3\2\2\2\u0750\u0751\7\u0085\2\2\u0751\u0752\5B\"\2\u0752"+
		"\u0753\b_\1\2\u0753\u0754\5B\"\2\u0754\u0755\b_\1\2\u0755\u0756\5B\"\2"+
		"\u0756\u0757\b_\1\2\u0757\u0758\5B\"\2\u0758\u0759\b_\1\2\u0759\u075a"+
		"\7\u00a2\2\2\u075a\u075b\b_\1\2\u075b\u075c\7\u00d8\2\2\u075c\u07aa\b"+
		"_\1\2\u075d\u075e\6_8\3\u075e\u075f\5\u00ba^\2\u075f\u0760\b_\1\2\u0760"+
		"\u07ab\3\2\2\2\u0761\u0762\6_9\3\u0762\u0763\7\u00d8\2\2\u0763\u0764\7"+
		"\u00d8\2\2\u0764\u07ab\b_\1\2\u0765\u0766\6_:\3\u0766\u0767\7\u00d8\2"+
		"\2\u0767\u07ab\b_\1\2\u0768\u0769\6_;\3\u0769\u076a\b_\1\2\u076a\u076b"+
		"\7\u00d8\2\2\u076b\u0783\b_\1\2\u076c\u076d\6_<\3\u076d\u076e\7\u00d8"+
		"\2\2\u076e\u076f\b_\1\2\u076f\u0770\7\u00d8\2\2\u0770\u0771\b_\1\2\u0771"+
		"\u0772\b_\1\2\u0772\u0773\7\u00d8\2\2\u0773\u077b\b_\1\2\u0774\u0775\6"+
		"_=\3\u0775\u0776\5\u00ba^\2\u0776\u0777\b_\1\2\u0777\u0778\b_\1\2\u0778"+
		"\u077a\3\2\2\2\u0779\u0774\3\2\2\2\u077a\u077d\3\2\2\2\u077b\u0779\3\2"+
		"\2\2\u077b\u077c\3\2\2\2\u077c\u077e\3\2\2\2\u077d\u077b\3\2\2\2\u077e"+
		"\u077f\b_\1\2\u077f\u0780\3\2\2\2\u0780\u0782\b_\1\2\u0781\u076c\3\2\2"+
		"\2\u0782\u0785\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0786"+
		"\3\2\2\2\u0785\u0783\3\2\2\2\u0786\u07ab\b_\1\2\u0787\u0788\6_>\3\u0788"+
		"\u0789\5\u00ba^\2\u0789\u078a\b_\1\2\u078a\u078b\7\u00d8\2\2\u078b\u078c"+
		"\b_\1\2\u078c\u078d\7\u00d8\2\2\u078d\u07a4\b_\1\2\u078e\u078f\6_?\3\u078f"+
		"\u0790\7\u00d8\2\2\u0790\u0791\b_\1\2\u0791\u0792\7\u00d8\2\2\u0792\u0793"+
		"\b_\1\2\u0793\u0794\b_\1\2\u0794\u0795\7\u00d8\2\2\u0795\u079e\b_\1\2"+
		"\u0796\u0797\6_@\3\u0797\u0798\6_A\3\u0798\u0799\5\u00ba^\2\u0799\u079a"+
		"\b_\1\2\u079a\u079b\b_\1\2\u079b\u079d\3\2\2\2\u079c\u0796\3\2\2\2\u079d"+
		"\u07a0\3\2\2\2\u079e\u079c\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a1\3\2"+
		"\2\2\u07a0\u079e\3\2\2\2\u07a1\u07a2\b_\1\2\u07a2\u07a3\3\2\2\2\u07a3"+
		"\u07a5\b_\1\2\u07a4\u078e\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07a4\3\2"+
		"\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07a9\b_\1\2\u07a9"+
		"\u07ab\3\2\2\2\u07aa\u075d\3\2\2\2\u07aa\u0761\3\2\2\2\u07aa\u0765\3\2"+
		"\2\2\u07aa\u0768\3\2\2\2\u07aa\u0787\3\2\2\2\u07ab\u00bd\3\2\2\2\u07ac"+
		"\u07ad\7\u0086\2\2\u07ad\u07ae\5B\"\2\u07ae\u07af\5B\"\2\u07af\u07b0\b"+
		"`\1\2\u07b0\u07b1\7\u00a2\2\2\u07b1\u00bf\3\2\2\2\u07b2\u07b3\7\u008b"+
		"\2\2\u07b3\u07b4\ba\1\2\u07b4\u07b5\7\u00d8\2\2\u07b5\u07cc\ba\1\2\u07b6"+
		"\u07b7\6aB\3\u07b7\u07b8\7\u00d8\2\2\u07b8\u07b9\ba\1\2\u07b9\u07ba\7"+
		"\u00d8\2\2\u07ba\u07bb\ba\1\2\u07bb\u07bc\7\u00d8\2\2\u07bc\u07c4\ba\1"+
		"\2\u07bd\u07be\6aC\3\u07be\u07bf\5\u00ba^\2\u07bf\u07c0\ba\1\2\u07c0\u07c1"+
		"\ba\1\2\u07c1\u07c3\3\2\2\2\u07c2\u07bd\3\2\2\2\u07c3\u07c6\3\2\2\2\u07c4"+
		"\u07c2\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07c4\3\2"+
		"\2\2\u07c7\u07c8\ba\1\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\ba\1\2\u07ca\u07b6"+
		"\3\2\2\2\u07cb\u07ce\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd"+
		"\u07cf\3\2\2\2\u07ce\u07cc\3\2\2\2\u07cf\u07d0\ba\1\2\u07d0\u00c1\3\2"+
		"\2\2\u07d1\u07d2\7\u008c\2\2\u07d2\u07d3\5B\"\2\u07d3\u07d4\bb\1\2\u07d4"+
		"\u07d5\5B\"\2\u07d5\u07d6\bb\1\2\u07d6\u00c3\3\2\2\2\u07d7\u07d8\7\u008d"+
		"\2\2\u07d8\u07d9\5B\"\2\u07d9\u07da\bc\1\2\u07da\u07db\5B\"\2\u07db\u07dc"+
		"\bc\1\2\u07dc\u07dd\5B\"\2\u07dd\u07de\bc\1\2\u07de\u07df\5Z.\2\u07df"+
		"\u07e0\bc\1\2\u07e0\u00c5\3\2\2\2\u07e1\u07e2\7\u008f\2\2\u07e2\u07e3"+
		"\5B\"\2\u07e3\u07e4\bd\1\2\u07e4\u07e5\5B\"\2\u07e5\u07e6\bd\1\2\u07e6"+
		"\u07e7\5B\"\2\u07e7\u07e8\bd\1\2\u07e8\u07e9\5B\"\2\u07e9\u07ea\bd\1\2"+
		"\u07ea\u07eb\5<\37\2\u07eb\u07ec\bd\1\2\u07ec\u07ed\5<\37\2\u07ed\u07ee"+
		"\bd\1\2\u07ee\u07ef\5<\37\2\u07ef\u07f0\bd\1\2\u07f0\u07f1\5<\37\2\u07f1"+
		"\u07f2\bd\1\2\u07f2\u07f3\5<\37\2\u07f3\u07f4\bd\1\2\u07f4\u07f5\5<\37"+
		"\2\u07f5\u07f6\bd\1\2\u07f6\u07f7\t\n\2\2\u07f7\u07f8\bd\1\2\u07f8\u07f9"+
		"\5B\"\2\u07f9\u0813\bd\1\2\u07fa\u07fb\7\63\2\2\u07fb\u07fc\bd\1\2\u07fc"+
		"\u07fd\7\u00dd\2\2\u07fd\u07fe\bd\1\2\u07fe\u07ff\5B\"\2\u07ff\u0800\b"+
		"d\1\2\u0800\u0801\5B\"\2\u0801\u0802\bd\1\2\u0802\u0803\5<\37\2\u0803"+
		"\u0804\bd\1\2\u0804\u0805\t\17\2\2\u0805\u0806\bd\1\2\u0806\u0807\7\u00dd"+
		"\2\2\u0807\u0808\bd\1\2\u0808\u0809\5B\"\2\u0809\u080a\bd\1\2\u080a\u080b"+
		"\5B\"\2\u080b\u080c\bd\1\2\u080c\u080d\5<\37\2\u080d\u080e\bd\1\2\u080e"+
		"\u080f\t\17\2\2\u080f\u0810\bd\1\2\u0810\u0811\5B\"\2\u0811\u0812\bd\1"+
		"\2\u0812\u0814\3\2\2\2\u0813\u07fa\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u00c7"+
		"\3\2\2\2\u0815\u0816\7\u008e\2\2\u0816\u0817\5B\"\2\u0817\u0818\be\1\2"+
		"\u0818\u0819\5B\"\2\u0819\u081a\be\1\2\u081a\u081b\5B\"\2\u081b\u081c"+
		"\be\1\2\u081c\u081d\5B\"\2\u081d\u081e\be\1\2\u081e\u081f\t\16\2\2\u081f"+
		"\u0820\be\1\2\u0820\u0821\5<\37\2\u0821\u0822\be\1\2\u0822\u0823\5<\37"+
		"\2\u0823\u0824\be\1\2\u0824\u0825\5<\37\2\u0825\u0826\be\1\2\u0826\u0827"+
		"\5<\37\2\u0827\u0828\be\1\2\u0828\u0829\5<\37\2\u0829\u082a\be\1\2\u082a"+
		"\u082b\7\17\2\2\u082b\u00c9\3\2\2\2\u082c\u082d\7\u0089\2\2\u082d\u0837"+
		"\7\u00ad\2\2\u082e\u082f\7\u00c5\2\2\u082f\u0838\5<\37\2\u0830\u0831\7"+
		"\u00c6\2\2\u0831\u0838\5<\37\2\u0832\u0833\7\u00c7\2\2\u0833\u0834\5<"+
		"\37\2\u0834\u0835\5<\37\2\u0835\u0836\5<\37\2\u0836\u0838\3\2\2\2\u0837"+
		"\u082e\3\2\2\2\u0837\u0830\3\2\2\2\u0837\u0832\3\2\2\2\u0838\u00cb\3\2"+
		"\2\2\u0839\u083a\7\u0084\2\2\u083a\u083b\t\30\2\2\u083b\u083c\5B\"\2\u083c"+
		"\u083d\5B\"\2\u083d\u00cd\3\2\2\2\u0082\u00d1\u00d9\u00e1\u011f\u0135"+
		"\u0171\u0175\u018b\u0192\u0199\u01a0\u01a7\u01ae\u01b5\u01bc\u01be\u01cf"+
		"\u01dc\u01ea\u01fb\u0205\u023b\u023d\u024b\u0251\u025b\u0269\u0272\u027c"+
		"\u0282\u0288\u028e\u0294\u0298\u029e\u02bc\u02c4\u02c7\u02cb\u02cf\u02d3"+
		"\u02d8\u02f5\u02f9\u02fd\u0304\u030a\u030c\u0341\u0356\u035e\u036a\u036f"+
		"\u038d\u03a7\u03ab\u03ae\u03b3\u03eb\u040f\u0416\u0421\u0451\u0468\u046c"+
		"\u0494\u049d\u04a6\u04af\u04b9\u04c2\u04cd\u04d0\u04db\u04de\u04e8\u04f2"+
		"\u04fc\u0506\u0510\u051a\u0524\u052e\u055a\u0561\u0569\u0571\u0579\u0581"+
		"\u058a\u0592\u059a\u05a3\u05bf\u05cf\u05e1\u05e3\u0634\u063a\u063e\u0676"+
		"\u0678\u06a7\u06af\u06ca\u06d2\u06d6\u06d8\u0711\u0719\u0720\u0725\u072a"+
		"\u072f\u0734\u0739\u073e\u0743\u074e\u077b\u0783\u079e\u07a6\u07aa\u07c4"+
		"\u07cc\u0813\u0837";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}