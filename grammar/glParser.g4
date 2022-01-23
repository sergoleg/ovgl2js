//----------------------------------------------------------------------
// Copyright (C) 2019 Oleg Sergeev [sergoleg@gmail.com]
//----------------------------------------------------------------------

/**
 * Ovation ® Graphics Language
 * <p>
 * Файл исходного кода Библиотеки форм содержит следующие допустимые ключевые слова:
 * <ul>
 * <li>SHAPELIB</li>
 * <li>DEF_SHAPE</li>
 * <li>LINE</li>
 * <li>POLYGON</li>
 * <li>ARC</li>
 * <li>DOT</li>
 * <li>ELLIPSE</li>
 * <li>RECTANGLE</li>
 * <li>END_SHAPE</li>
 * </ul>
 * Команды исходного кода Библиотеки форм используют другой синтаксис или иные правила
 * по сравнению с аналогичными командами в языке исходного кода графики. (См.
 * Справочное руководство по языку обработки задач графической информации для АСУ
 * ТП Ovation). Синтаксис этих команд применяется только к Библиотеке форм.
 * <p>
 * В любом месте в файле формата исходного кода разрешены комментарии. Комментарий
 * начинается с символа звездочки (*) и завершается в конце строки. Любые символы после
 * символа “*” в данной строке игнорируются. В отличие от графических файлов, комментарии
 * можно помещать в списки параметров любых указанных выше команд.
 * <p>
 * Обратите внимание, что все комментарии при записи файлов Библиотеки форм теряются,
 * независимо от того, какая версия была загружена. Иными словами, в любое время при
 * внесении изменений в Библиотеку форм (с помощью главного окна GBNT) новый файл
 * исходного кода не будет содержать никаких комментариев. Таким образом, комментарии не
 * следует добавлять до тех пор, пока изменения в Библиотеке форм не будут завершены. *
 */
parser grammar glParser;

options {
	language = Java;
	tokenVocab = glLexer;
}

@parser::header {
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
}

@parser::members {

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

}

/** **************************************************************************/
gl_start_rule
:
	(
		stat
	)*
	(
		EOF
		{
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
	)
;

stat
:
	label		// Метки секций
	| command	// Команды

;

/** Метки секций */
label
:
	cmdDIAGRAM				// модифицировано 07.08.2019
	| cmdKEYBOARD
	| cmdBACKGROUND
	| cmdFOREGROUND
	| cmdTRIGGER
	| cmdEXIT
;

/** Команды */
command
:
	cmdARC					// Line pattern and/or fill pattern
	| cmdCIRCLE				// Line pattern and/or fill pattern
	| cmdCOLOR				// Color name parameter
	| cmdBLINK				// Blink state			// модифицировано 07.07.2019
	| cmdDYNAMIC_LINE		// Line pattern
	| cmdDYNAMIC_POLYGON	// Line pattern and/or fill pattern. Только в Ovation
	| cmdELLIPSE			// Line pattern and/or fill pattern
	| cmdLINE				// Line pattern
	| cmdMULTI_TEXT			// List of strings (same number as entered for default case)
	| cmdPOLYGON			// Line pattern and/or fill pattern name
	| cmdPROCESS_PT			// Record field
	| cmdRECTANGLE			// Line pattern and/or fill pattern
	| cmdSHAPE				// Shape name
	| cmdTEXT				// Text string
	| cmdTRIG_ON			// Trigger number

	| cmdBAR
	| cmdCURSOR
	| cmdDATE
	| cmdDEF_FKEY_GROUP
	| cmdDEF_QUAL
	| cmdDIAG_DISP
	| cmdDOT
	| cmdEF_STATE
	| cmdELSE
	| cmdENDIF
	| cmdENDLOOP
	| cmdENTRY_FLD
	| cmdFORCE_UPDATE
	| cmdFUNC_KEY
	| cmdGTEXT
	| cmdIF
	| cmdIF_CHANGED
	| cmdIFELSE
	| cmdLOOP
	| cmdMACRO
	| cmdDEF_MACRO
	| cmdDEF_MACRO_PARAMS
	| cmdSET_MACRO_BB
	| cmdEND_MACRO
	| cmdMATH
	| cmdOL_BUTTON
	| cmdOL_RECTANGLE
	| cmdPAGE
	| cmdPLOT
	| cmdPOINTER
	| cmdPOKE_FLD
	| cmdPOKE_STATE
	| cmdPTR_VALUE

	| cmdPTR_MOVE

	| cmdRUN_PROGRAMS
	| cmdSETVAL
	| cmdTIME
	| cmdXY_PLOT
	| cmdSHAPELIB
	| cmdDEF_SHAPE
	| cmdEND_SHAPE

	| cmdFONT				// добавлено 07.08.2019
	| cmdGCODE				// добавлено 07.08.2019
	| cmdOL_GAUGE			// добавлено 07.08.2019
	| cmdTREND				// добавлено 09.08.2019
;

/* FONT “name” style */
cmdFONT
@init {
	ST template = new ST("Gfont(<name>,\"<style>\");");
}
@after {
	String output = template.render();
//	println(UseCommands.get_use_cmds(section, "FONT") + output);
}
:
	C_FONT
	StringLiteral
		{ template.add("name", $StringLiteral.text); }
	style = ( FontStyleRegular | FontStyleBoldItalic | FontStyleItalic | FontStyleBold )
		{ template.add("style", $style.text); }
;

/** Команда GCODE используется для выбора внутренней функции */
cmdGCODE
:
	C_GCODE literal_numbers Dpointer
;

/** SHAPELIB */
cmdSHAPELIB
:
	C_SHAPELIB
	{ section = Section.I_SHAPELIB; }
;

/** shapelib DEF_SHAPE shape_number shape_name */
cmdDEF_SHAPE
:
	C_DEF_SHAPE					{ if (!shape_first) { println(","); } shape_first = false; }
	shape_number = value
	(
		shape_name = Identifier
		{
			if (bruteForce($shape_name.text.replace("\"", ""), keywords))
				print ($shape_name.text.replace("\"", "") + ":{make:function(){var trgt = new PIXI.Graphics();");
			else
				print ("//" + $shape_name.text.replace("\"", "") + ":{make:'");
		}
		| name = ID
		{
			if (bruteForce($shape_name.text.replace("\"", ""), keywords))
				print ($name.text.replace("\"", "")       + ":{make:function(){var trgt = new PIXI.Graphics();");
			else
				print ("//" + $name.text.replace("\"", "")       + ":{make:'");
		}
	)
;

/** END_SHAPE \xorigin \yorigin * w=852,h=859  [x=-23 y=0 w=875 h=886]
 * 
 * В любом месте в файле формата исходного кода разрешены комментарии. Комментарий
 * начинается с символа звездочки (*) и завершается в конце строки. Любые символы после
 * символа “*” в данной строке игнорируются. В отличие от графических файлов, комментарии
 * можно помещать в списки параметров любых указанных выше команд.
 * 
 * \xorigin координата "x" начало координат формы. Начало координат формы должно
 *         лежать в пределах формы, поэтому диапазон для начало координат: от 0 до
 *         shape_width-1 (ширина_формы-1). Это значение задают в виртуальных
 *         координатах. Параметр shape_width вычисляется внутри программы.
 * 
 * \yorigin координата "y" начало координат формы. Начало координат формы должно
 *         лежать в пределах формы, поэтому диапазон для начало координат: от 0 до
 *         shape_height-1 (высота_формы-1). Это значение задают в виртуальных
 *         координатах. Параметр shape_height вычисляется внутри программы.
 * 
 */
cmdEND_SHAPE
/*
@after {
	println("return shape;}");
}
*/
:
	C_END_SHAPE			{ print ("return trgt;},"); }
	xorigin = value		{ print ("x0:"+$xorigin.text+","); }
	yorigin = value		{ print ("y0:"+$yorigin.text+"}"); }
	STAR															// *
	WEQUALS sw = value	//{ print ("w:"+$sw.text); }					// w=852
																	// ,
	HEQUALS sh = value	//{ print ("h:"+$sh.text+"}"); }				// h=859
	LBRACKET														// [
	XEQUALS x = value	//{ print   (" shape.xf="+$x.text+";"); }	// x=-23
	YEQUALS y = value	//{ print   (" shape.yf="+$y.text+";"); }	// y=0
	WEQUALS w = value	//{ print   (" shape.wf="+$w.text+";"); }	// w=875
	HEQUALS h = value	//{ println (" shape.hf="+$h.text+";"); }	// h=886
	RBRACKET														// ]
;

/** Раздел видеограммы */
/*
 * DIAGRAM diag_type 0 x y w h background zoom_flag
 *         revision_num 0 0 16384 16384 update_rate positioning
 *         sizing [subscreen#] [diag_title]
 */
cmdDIAGRAM
@init {
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
}
@after {
	section = Section.I_DIAGRAM;

	diagTitle_number++;

	if (diagTitle_number == 1) {
		diagParam = tmpltDiag.render();
		diagType = $d.text;
		diagType = diagType.replace("\"", "");
		if (!macroPort.get_m_flag()) {
			String output = t.render();
			println(output);
			switch ($d.text)
			{
				case "\"MAIN\"":   diagTypeNumber = DIAG_TYPE_MAIN;   break;
				case "\"SUBWIN\"": diagTypeNumber = DIAG_TYPE_SUBWIN; break;
				case "\"WINDOW\"": diagTypeNumber = DIAG_TYPE_WINDOW; break;
			}
		}
	}
}
:
	L_DIAGRAM d = ( MAIN | SUBWIN | WINDOW )
						{ tmpltDiag.add("diag_type",      $d.text);                                t.add("diag_type",      $d.text); }
	literal_numbers		{ tmpltDiag.add("icon_num",       $literal_numbers.text);                  t.add("icon_num",       $literal_numbers.text); }
	literal_numbers		{ tmpltDiag.add("x",              macroPort.calcX($literal_numbers.text)); t.add("x",              macroPort.calcX($literal_numbers.text)); }
	literal_numbers		{ tmpltDiag.add("y",              macroPort.calcY($literal_numbers.text)); t.add("y",              macroPort.calcY($literal_numbers.text)); }
	literal_numbers		{ tmpltDiag.add("w",              macroPort.calcW($literal_numbers.text)); t.add("w",              macroPort.calcW($literal_numbers.text)); }
	literal_numbers		{ tmpltDiag.add("h",              macroPort.calcH($literal_numbers.text)); t.add("h",              macroPort.calcH($literal_numbers.text)); }
	Color				{ tmpltDiag.add("bg_color",       $Color.text);                            t.add("bg_color",       $Color.text); }
	zoom_flag = ( ZOOMABLE | NON_ZOOMABLE )
						{ tmpltDiag.add("zoom_flag",      $zoom_flag.text);                        t.add("zoom_flag",      $zoom_flag.text); }
	literal_numbers		{ tmpltDiag.add("revision_num",   $literal_numbers.text);                  t.add("revision_num",   $literal_numbers.text); }
	literal_numbers		{ tmpltDiag.add("x_extents",      $literal_numbers.text);                  t.add("x_extents",      $literal_numbers.text); }
	literal_numbers		{ tmpltDiag.add("y_extents",      $literal_numbers.text);                  t.add("y_extents",      $literal_numbers.text); }
	literal_numbers		{ tmpltDiag.add("width_extents",  $literal_numbers.text);                  t.add("width_extents",  $literal_numbers.text); }
	literal_numbers		{ tmpltDiag.add("height_extents", $literal_numbers.text);                  t.add("height_extents", $literal_numbers.text); }
	literal_numbers		{ tmpltDiag.add("update_rate",    $literal_numbers.text);                  t.add("update_rate",    $literal_numbers.text); }
	p = ( DEFAULT_POSITION | FIXED_POSITION )
						{ tmpltDiag.add("positioning",    $p.text);                                t.add("positioning",    $p.text); }
	s = ( DEFAULT_SIZE | FIXED_SIZE )
						{ tmpltDiag.add("sizing",         $s.text);                                t.add("sizing",         $s.text); }
	(
		literal_numbers
		{
			tmpltDiag.remove("subscreen_num"); tmpltDiag.add("subscreen_num", $literal_numbers.text);
			        t.remove("subscreen_num");         t.add("subscreen_num", $literal_numbers.text);
		}
	)?
	(
		StringLiteral
		{
			tmpltDiag.remove("diag_title"); tmpltDiag.add("diag_title", $StringLiteral.text);
                    t.remove("diag_title");         t.add("diag_title", $StringLiteral.text);
			if (diagTitle_first) {
				diagTitle_first = false;
				diagTitle = $StringLiteral.text;
			}
		}
	)?
;

/** Секция клавиатуры видеокадра */
cmdKEYBOARD
:
	L_KEYBOARD
	{
		if (section == Section.I_TRIGGER) println("}");
		ret_from_trigger_section = section = Section.I_KEYBOARD;
	}
;

/** Секция заднего фона видеокадра */
cmdBACKGROUND
:
	L_BACKGROUND
	{
		if (section == Section.I_TRIGGER) println("}");
		ret_from_trigger_section = section = Section.I_BACKGROUND;
	}
;

/** Секция переднего фона видеокадра */
cmdFOREGROUND
:
	L_FOREGROUND
	{
		if (section == Section.I_TRIGGER) println("}");
		ret_from_trigger_section = section = Section.I_FOREGROUND;
	}
;

/** Секция триггера видеокадра */
cmdTRIGGER
:
	L_TRIGGER n = literal_numbers
	{
		if (section == Section.I_TRIGGER) {
			println("}");
			println("XXXL.prototype.TRIGGER_" + $n.text + " = function() {");
		} else {
			sctnTRIGGER.add("XXXL.prototype.TRIGGER_" + $n.text + " = function() {");
			sctnTRIGGER.add("\n");
		}

		section = ret_from_trigger_section; 
		println("if (trig_on(" + $n.text + ") && this.TRIGGER_" + $n.text + ") this.TRIGGER_" + $n.text + "();");

		section = Section.I_TRIGGER;
	}
;

/** Команда - конец видеокакдра */
cmdEXIT
:
	L_EXIT
;

/** Условный параметр (значение) */
def_conditional_value [String arg_name] returns [ArrayList<String> arg_result]
@init {
	$arg_result = new ArrayList<String>();
	statement_name = $arg_name;
}
:
	// - шаблон линии      ("line_pat")
	// - узор-заполнитель  ("fill_pat")
	//----------------------------------------------------------------------
	LineFillPattern {
		$arg_result.add($LineFillPattern.text);
		$arg_result.add($arg_name+"="+$LineFillPattern.text+";");
	}
	( conditionalExpression	{ $arg_result.add($conditionalExpression.str); } )?

	// - названия цвета    ("fg_color", "bg_color", "er_color", "ol_color")
	//----------------------------------------------------------------------
	| Color {
		$arg_result.add($Color.text);
		$arg_result.add($arg_name+"="+$Color.text+";");
	}
	( conditionalExpression { $arg_result.add($conditionalExpression.str); } )?

	// - номер триггера    ("integer_literal")
	//----------------------------------------------------------------------
	| literal_numbers {
		$arg_result.add($literal_numbers.text);
		$arg_result.add($arg_name+"="+$literal_numbers.text+";");
	}
	( conditionalExpression { $arg_result.add($conditionalExpression.str); } )?

	// - состояния мигания ("fg_blink", "bg_blink")
	//----------------------------------------------------------------------
	| BlinkPattern {
		$arg_result.add($BlinkPattern.text);
		$arg_result.add($arg_name+"="+$BlinkPattern.text+";");
	}
	( conditionalExpression { $arg_result.add($conditionalExpression.str); } )?

	// - название формы ("shape_name")
	//----------------------------------------------------------------------
	| Identifier {
		$arg_result.add($Identifier.text);
		$arg_result.add($arg_name+"="+$Identifier.text+";");
	}
	( conditionalExpression { $arg_result.add($conditionalExpression.str); } )?

	// - текстовая строка  ("string_literal")
	//----------------------------------------------------------------------
	| StringLiteral {
		$arg_result.add($StringLiteral.text);
		$arg_result.add($arg_name+"="+$StringLiteral.text+";");
	}
	( conditionalExpression { $arg_result.add($conditionalExpression.str); } )?

	// - поле записи технологического параметра ("record_field_pat") // добавлено 08.08.2019
	//----------------------------------------------------------------------
	| rec_fld_pat {
		$arg_result.add($rec_fld_pat.text);
		$arg_result.add($arg_name+"="+$rec_fld_pat.text+";");
	}
	( conditionalExpression { $arg_result.add($conditionalExpression.str); } )?

	// - оффсеты внутренних переменных ("offset_pat") 				// добавлено 09.08.2019
	//----------------------------------------------------------------------
	| offset_pat {
		$arg_result.add($offset_pat.text);
		$arg_result.add($arg_name+"="+$offset_pat.text+";");
	}
	( conditionalExpression { $arg_result.add($conditionalExpression.str); } )?
;

/** Условные выражения */
conditionalExpression returns [String str]
:
	simpleExpression     { $str=$simpleExpression.str;   } // - простое выражение
	| compoundExpression { $str=$compoundExpression.str; } // - составное (сложное) выражение
	| caseExpression     { $str=$caseExpression.str;     } // - выражения выбора
	| qualityExpression  { $str=$qualityExpression.str;  } // - выражение качества
	| setExpression      { $str=$setExpression.str;      } // - выражение уставок ( позволяет менять значение параметра, основываясь на значении уставки)
;

/** Простые выражения */
simpleExpression returns [String str]
:
	(
		{ ExprClear(); }
		smpl_expression = expression cond_value = conditional_value
		{ $str="if "+$smpl_expression.str+" {"+statement_name+"="+$cond_value.text+";} "; }

	)
;

/** Составные (сложные) выражения */
compoundExpression returns [String str]
locals [boolean first = true, String tmp]
@init { $str = ""; }
:
	(
		LBRACE
		(
			smpl_expression = simpleExpression
			{
				$tmp = $smpl_expression.str;
				if ($first) {
					$first = false;
				} else {
					$tmp = $tmp.replace("if ", "else if ");
				}
				$str = $str + $tmp;
			}

		)+ RBRACE
	)
;

/** Выражения выбора */
caseExpression returns [String str]
locals [int counter=0] @init { $str = ""; }
:
	(
		CaseExp
		point = value
		initial_val = IntegerLiteral
		increment = IntegerLiteral
		count = literal_numbers
		(
			cond_value = conditional_value
			{
				$counter++;
				int ll = ($initial_val.int+($increment.int*($counter)));
				int hl = ($initial_val.int+($increment.int*(($counter)+1)));
				$str = $str + "if (("+$point.str+">="+ll+")&&("+$point.str+"<"+hl+")) {"+statement_name+"="+$cond_value.text+";} ";
			}
		)+
	)
;

/** Выражения качества */
qualityExpression returns [String str] @init { $str = ""; }
:
	(
		QualityExp
		pt_name_pat
		fair_quality_cond_value = conditional_value
		poor_quality_cond_value = conditional_value
		bad_quality_cond_value = conditional_value
		timedout_quality_cond_value = conditional_value
		{
			$str = $str + "if (vStatus("+$pt_name_pat.text+",\"=\",\"FAIR\")"+") {"+statement_name+"="+$fair_quality_cond_value.text+";} ";
			$str = $str + "if (vStatus("+$pt_name_pat.text+",\"=\",\"POOR\")"+") {"+statement_name+"="+$poor_quality_cond_value.text+";} ";
			$str = $str + "if (vStatus("+$pt_name_pat.text+",\"=\",\"BAD\")" +") {"+statement_name+"="+$bad_quality_cond_value.text+";} ";
			$str = $str + "if (vStatus("+$pt_name_pat.text+",\"=\",\"ON0\")" +") {"+statement_name+"="+$timedout_quality_cond_value.text+";} ";
		}
	)
;

/** Установочные выражения */
setExpression returns [String str]
locals [int counter=0] @init { $str = ""; }
:
	(
		set_variable = SetExp
		num = literal_numbers
		(
			cond_value = conditional_value
			{
				$counter++;
				$str = $str + "if ("+$set_variable.text+"=="+$counter+") {"+statement_name+"="+$cond_value.text+";} ";
			}

		)+
	)
;

/** Простое выражение (Simple Expression) */
expression returns [String str] @after { $str = ExprToStr(); }
:
	primary_expr
	| PLUS                 { ExprAdd("+" ); } expression
	| MINUS                { ExprAdd("-" ); } expression
	| expression LT        { ExprAdd("<" ); } expression
	| expression GT        { ExprAdd(">" ); } expression
	| expression LTEQ      { ExprAdd("<="); } expression
	| expression GTEQ      { ExprAdd(">="); } expression
	| expression EQUALS    { ExprAdd("=="); } expression
	| expression NOTEQUALS { ExprAdd("!="); } expression
	| expression EQUALS StatusWord
		{
			//ExprAddStatusVariable(",\"=\","+status.getMask($StatusWord.text)+","+status.getPattern($StatusWord.text)+")");
			ExprAddStatusVariable(",\"=\",\""+$StatusWord.text+"\")");
		}
	| expression NOTEQUALS StatusWord
		{
			//ExprAddStatusVariable(",\"<>\","+status.getMask($StatusWord.text)+","+status.getPattern($StatusWord.text)+")");
			ExprAddStatusVariable(",\"<>\",\""+$StatusWord.text+"\")");
		}
	| expression EQUALS StatusVariable
		{
			ExprAddStatusVariable(",\"=\","+$StatusVariable.text+")");
		}
	| expression NOTEQUALS StatusVariable
		{
			ExprAddStatusVariable(",\"<>\","+$StatusVariable.text+")");
		}
	| expression AND { ExprAdd("&&"); } expression
	| expression OR  { ExprAdd("||"); } expression
	| expression EOR { ExprAdd("^" ); } expression
;

/** Первичное выражение */
primary_expr
:
	LPAREN { ExprAdd("("); } expression RPAREN { ExprAdd(")"); }

	| literal_numbers { ExprAdd($literal_numbers.text); }

	| pt_name_pat ( rec_fld_pat )?
	{
		if ($rec_fld_pat.text!=null) {
			ExprAdd("get"+$rec_fld_pat.text.replace("\"", " ").trim()+"("+$pt_name_pat.text+")");
		} else {
			ExprAdd("getAV("+$pt_name_pat.text+")");
		}
	}

	| pointer_pat ( offset_pat )?
	{
		if ($offset_pat.text!=null) {
			String pointer_name = $pointer_pat.text.substring(0, 2);
			String pointer_index = $pointer_pat.text.substring(3).replace("]", "");
			String offset_name = $offset_pat.text.substring(0, 2);
			String offset_index = $offset_pat.text.substring(3).replace("]", "");
			ExprAdd("get"+pointer_name+offset_name+"("+pointer_index+","+offset_index+")");
		} else {
			ExprAdd($pointer_pat.text);
		}
	}

	| SetVariable { ExprAdd($SetVariable.text); }
	| ConstVariable { ExprAdd($ConstVariable.text); }
	| ColorVariable { ExprAdd($ColorVariable.text); }
;

/** Значение, используемое в случае оценки простого выражения (simple_expression) */
conditional_value
:
	LineFillPattern
	| BlinkPattern
	| Color			// color_pattern

	| literal_numbers
	| Identifier	// shape_pattern

	| StringLiteral	// string_pattern

	| RecordField	// field_pattern

	| Ioffset
	| Roffset
	| Boffset
	| Soffset
	| Aoffset		// offset_field
;

pt_name_pat
:
	PointName
	{
		// Добавим имя точки в глобальный список
		if(!PointNameList.contains($PointName.text.substring(1,$PointName.text.length()-1)))
			PointNameList.add($PointName.text.substring(1,$PointName.text.length()-1));
	}
	| Dpointer // Macro pointer
	| Hpointer // Highway pointer
	| Gpointer // Group pointer
	| Wpointer // Window pointer
	| Ppointer // Scratch pad pointer
;

pointer_pat
:
	Ppointer
	| Spointer
	| Opointer
;

rec_fld_pat
:
	RecordField
;

offset_pat
:
	Ioffset
	| Roffset
	| Boffset
	| Spointer
	| Soffset
	| Aoffset
;

value returns [String str] @init { $str = ""; }
:
	  ( MINUS {$str="-";} )? IntegerLiteral       { $str=$str+$IntegerLiteral.text; }
	| ( MINUS {$str="-";} )? FloatingPointLiteral { $str=$str+$FloatingPointLiteral.text; }
	| pt_name_pat ( rec_fld_pat )?
	{
		if ($rec_fld_pat.text!=null) {
			$str="get"+$rec_fld_pat.text.replace("\"", " ").trim()+"("+$pt_name_pat.text+")";
		} else {
			$str="getAV("+$pt_name_pat.text+")";
		}
	}
	| pointer_pat ( offset_pat )?
	{
		if ($offset_pat.text!=null) {
			String pointer_name = $pointer_pat.text.substring(0, 2);
			String pointer_index = $pointer_pat.text.substring(3).replace("]", "");
			String offset_name = $offset_pat.text.substring(0, 2);
			String offset_index = $offset_pat.text.substring(3).replace("]", "");
			$str="get"+pointer_name+offset_name+"("+pointer_index+","+offset_index+")";
		} else {
			$str=$pointer_pat.text;
		}
	}
	| StringLiteral { $str=$str+$StringLiteral.text; }
;

prog_args_pat returns [String str] @init { $str = ""; }
:
	  ( MINUS {$str="-";} )? IntegerLiteral       { $str=$str+$IntegerLiteral.text;       }
	| ( MINUS {$str="-";} )? FloatingPointLiteral { $str=$str+$FloatingPointLiteral.text; }
	| StringLiteral  { $str=$StringLiteral.text;        }
	| StatusWord     { $str="\""+$StatusWord.text+"\""; }
	| Identifier     { $str=$Identifier.text;           }
	| pt_name_pat    { $str=$pt_name_pat.text;          }
	| rec_fld_pat    { $str=$rec_fld_pat.text;          }
	| pointer_pat    { $str=$pointer_pat.text;          }
	| offset_pat     { $str=$offset_pat.text;           }
	| SetVariable    { $str=$SetVariable.text;          }
	| ConstVariable  { $str=$ConstVariable.text;        }
	| ColorVariable  { $str=$ColorVariable.text;        }
	| StatusVariable { $str=$StatusVariable.text;       }
;

coordinate_pairs returns [int n]
locals
[int i=0, StringBuilder px = new StringBuilder(), StringBuilder py = new StringBuilder(), String prefix = ""]
@after {
	coordinate_pairs_X = "["+$px.toString()+"]";
	coordinate_pairs_Y = "["+$py.toString()+"]";
}
:
	(
		x = value
		y = value
		{
			macroBBox.addPoint($x.str, $y.str);
			$px.append($prefix); $px.append(macroPort.calcX($x.str));
			$py.append($prefix); $py.append(macroPort.calcY($y.str));
			$i++;
			$n=$i;
			$prefix=",";
		}
	)+
;

literal_numbers
:
	( MINUS )? IntegerLiteral
	| ( MINUS )? FloatingPointLiteral

	| ( PLUS )? IntegerLiteral			// 09.08.2019
	| ( PLUS )? FloatingPointLiteral	// 09.08.2019

	| ConstVariable
	| ColorVariable
;

// START Commands with Conditional Parameters 
//===========================================

/**
 * Команда ARC (дуга)
 * shapelib ARC x y w h angle1 angle2 lw lp fp
 */
cmdARC
locals [String _line_pat, String _fill_pat]
@after {
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 3) {
		print($line_pat.arg_result.get(1));
		println($line_pat.arg_result.get(2));
		$_line_pat = "line_pat";
	}
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 2)
		$_line_pat = $line_pat.arg_result.get(0);

	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 3) {
		print($fill_pat.arg_result.get(1));
		println($fill_pat.arg_result.get(2));
		$_fill_pat = "fill_pat";
	}
	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 2)
		$_fill_pat = $fill_pat.arg_result.get(0);

	if (section == Section.I_SHAPELIB) {
		print("sARC(trgt,"+$x.text+","+$y.text+","+
			$w.text+","+$h.text+","+
			$angle1.text+","+$angle2.text+","+
			$line_width.text+","+$_line_pat.toUpperCase()+","+$_fill_pat.toUpperCase()+");"
		);
	} else {
		println(UseCommands.get_use_cmds(section, "ARC") + "Garc("+
			macroPort.calcX($x.text)+","+
			macroPort.calcY($y.text)+","+
			macroPort.calcW($w.text)+","+
			macroPort.calcH($h.text)+","+
			$angle1.text+","+
			$angle2.text+","+
			$line_width.text+","+
			$_line_pat.toUpperCase()+","+
			$_fill_pat.toUpperCase()+");"
		);
	}
}
:
	CC_ARC
	x = literal_numbers
	y = literal_numbers
	w = literal_numbers
	h = literal_numbers
	angle1 = literal_numbers
	angle2 = literal_numbers
		{ macroBBox.addArc($x.text, $y.text, $w.text, $h.text, $angle1.text, $angle2.text); }
	line_width = literal_numbers
	line_pat = def_conditional_value ["line_pat"]
	fill_pat = def_conditional_value ["fill_pat"]
;

/** Команда CIRCLE (окружность) */
cmdCIRCLE
locals [String _line_pat, String _fill_pat]
@after {
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 3) {
		print($line_pat.arg_result.get(1));
		println($line_pat.arg_result.get(2));
		$_line_pat = "line_pat";
	}
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 2)
		$_line_pat = $line_pat.arg_result.get(0);

	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 3) {
		print($fill_pat.arg_result.get(1));
		println($fill_pat.arg_result.get(2));
		$_fill_pat = "fill_pat";
	}
	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 2)
		$_fill_pat = $fill_pat.arg_result.get(0);

//
// CIRCLE cx cy r line_width line_pat [conditional] fill_pat [conditional]
//
	println(UseCommands.get_use_cmds(section, "CIRCLE") + "Gcircle("+
		macroPort.calcX($cx.text)+","+
		macroPort.calcY($cy.text)+","+
		macroPort.calcW($r.text)+","+
		$line_width.text+","+
		$_line_pat+","+
		$_fill_pat+");"
	);

//
// ELLIPSE cx cy hr vr line_width line_pat [conditional] fill_pat [conditional]
//
//	println("Gellipse("+
//		macroPort.calcX($cx.text)+","+
//		macroPort.calcY($cy.text)+","+
//		macroPort.calcW($r.text)+","+
//		(macro_BBy*macro_h_scale/2)+","+
//		$line_width.text+","+
//		$_line_pat+","+
//		$_fill_pat+");"
//	);

}
:
	CC_CIRCLE
	cx = literal_numbers
	cy = literal_numbers					{ macroBBox.addPoint($cx.text, $cy.text); }
	r = literal_numbers						{ macroBBox.addCircle($cx.text, $cy.text, $r.text); }
	line_width = literal_numbers
	line_pat = def_conditional_value ["line_pat"]
	fill_pat = def_conditional_value ["fill_pat"]
;

/** Команда COLOR (цвет) */
cmdCOLOR
locals [String _fg_color, String _bg_color, String _er_color, String _ol_color]
@after {

	try {
		if ($fg_color.arg_result != null) {
			if ($fg_color.arg_result.size() == 3) {
				print($fg_color.arg_result.get(1));		//color_expression_print($fg_color.arg_result.get(2));
				println($fg_color.arg_result.get(2));
				$_fg_color = "fg_color";
			}
			if ($fg_color.arg_result.size() == 2)
				$_fg_color = $fg_color.arg_result.get(0);
		}
	}
	catch(Exception e) {
		//System.out.println("Null Pointer ");
		$_fg_color = "null";
	}

	try {
		if ($bg_color.arg_result != null) {
			if ($bg_color.arg_result.size() == 3) {
				print($bg_color.arg_result.get(1));		//color_expression_print($bg_color.arg_result.get(2));
				println($bg_color.arg_result.get(2));
				$_bg_color = "bg_color";
			}
			if ($bg_color.arg_result.size() == 2)
				$_bg_color = $bg_color.arg_result.get(0);
		}
	}
	catch(Exception e) {
		//System.out.println("Null Pointer ");
		$_bg_color = "null";
	}

	try {
		if ($er_color.arg_result != null) {
			if ($er_color.arg_result.size() == 3) {
				print($er_color.arg_result.get(1));		//color_expression_print($er_color.arg_result.get(2));
				println($er_color.arg_result.get(2));
				$_er_color = "er_color";
			}
			if ($er_color.arg_result.size() == 2)
				$_er_color = $er_color.arg_result.get(0);
		}
	}
	catch(Exception e) {
		//System.out.println("Null Pointer ");
		$_er_color = "null";
	}

	try {
		if ($ol_color.arg_result != null) {
			if ($ol_color.arg_result.size() == 3) {
				print($ol_color.arg_result.get(1));		//color_expression_print($ol_color.arg_result.get(2));
				println($ol_color.arg_result.get(2));
				$_ol_color = "ol_color";
			}
			if ($ol_color.arg_result.size() == 2)
				$_ol_color = $ol_color.arg_result.get(0);
		}
	}
	catch(Exception e) {
		//System.out.println("Null Pointer ");
		$_ol_color = "null";
	}

	println(UseCommands.get_use_cmds(section, "COLOR") + "Gcolor("
		+$_fg_color
		+","+$_bg_color
		+","+$_er_color
		+","+$_ol_color
		+");"
	);
}
:
	CC_COLOR
	  FG fg_color = def_conditional_value ["fg_color"]
	( BG bg_color = def_conditional_value ["bg_color"] )?
	( ER er_color = def_conditional_value ["er_color"] )?
	( OL ol_color = def_conditional_value ["ol_color"] )?
;

/** Команда BLINK (мигание) - бывает и так [BLINK BG OFF FG OFF] */
cmdBLINK
locals [String _fg_blink, String _bg_blink]
@after {

	try {
		if ($fg_blink.arg_result != null) {
			if ($fg_blink.arg_result.size() == 3) {
				print($fg_blink.arg_result.get(1));
				println($fg_blink.arg_result.get(2));
				$_fg_blink = "fg_blink";
			}
			if ($fg_blink.arg_result.size() == 2)
				$_fg_blink = $fg_blink.arg_result.get(0);
		}
	}
	catch(Exception e) {
		//System.out.println("Null Pointer ");
		$_fg_blink = "null";
	}

	try {
		if ($bg_blink.arg_result != null) {
			if ($bg_blink.arg_result.size() == 3) {
				print($bg_blink.arg_result.get(1));
				println($bg_blink.arg_result.get(2));
				$_bg_blink = "bg_blink";
			}
			if ($bg_blink.arg_result.size() == 2)
				$_bg_blink = $bg_blink.arg_result.get(0);
		}
	}
	catch(Exception e) {
		//System.out.println("Null Pointer ");
		$_bg_blink = "null";
	}

	println(UseCommands.get_use_cmds(section, "COLOR") + "Gblink("
		+$_fg_blink
		+","+$_bg_blink
		+");"
	);
}
:
	CC_BLINK
	(
		( FG fg_blink = def_conditional_value ["fg_blink"] ( BG bg_blink = def_conditional_value ["bg_blink"] )? )
		|
		( BG bg_blink = def_conditional_value ["bg_blink"] ( FG fg_blink = def_conditional_value ["fg_blink"] )? )
	)
;

/** Команда DYNAMIC_LINE (динамическая линия) */
cmdDYNAMIC_LINE
locals [String _line_pat]
@after {
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 3) {
		print($line_pat.arg_result.get(1));
		println($line_pat.arg_result.get(2));
		$_line_pat = "line_pat";
	}
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 2)
		$_line_pat = $line_pat.arg_result.get(0);

	println(UseCommands.get_use_cmds(section, "DYNAMIC_LINE") + "Gdynamic_line("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+","+
		macroPort.calcW($w.text)+","+
		macroPort.calcH($h.text)+","+
		$x_low_limit.str+","+
		$x_high_limit.str+","+
		$y_low_limit.str+","+
		$y_high_limit.str+","+
		$fitted.text+","+
		$scales.text+","+
		$update_rate.text+","+
//		$pairs.n+",px,py,"+
			$pairs.n+","+
			coordinate_pairs_X+","+
			coordinate_pairs_Y+","+
		$line_width.text+","+
		$_line_pat+");"
	);
}
:
	CC_DYNAMIC_LINE
	x = literal_numbers
	y = literal_numbers							{ macroBBox.addPoint($x.text, $y.text); }
	w = literal_numbers
	h = literal_numbers							{ macroBBox.addRect($x.text, $y.text, $w.text, $h.text); }
	x_low_limit = value
	x_high_limit = value
	y_low_limit = value
	y_high_limit = value
	fitted = ( NOT_FITTED | FITTED )
	scales = ( SCALE | NOSCALE )
	update_rate = literal_numbers
	nnn = literal_numbers
	pairs = coordinate_pairs
	line_width = literal_numbers
	line_pat = def_conditional_value ["line_pat"]
;

/** Команда DYNAMIC_POLYGON (динамический многоугольник) */
cmdDYNAMIC_POLYGON
locals [String _line_pat, String _fill_pat]
@after {
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 3) {
		print($line_pat.arg_result.get(1));
		println($line_pat.arg_result.get(2));
		$_line_pat = "line_pat";
	}
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 2)
		$_line_pat = $line_pat.arg_result.get(0);

	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 3) {
		print($fill_pat.arg_result.get(1));
		println($fill_pat.arg_result.get(2));
		$_fill_pat = "fill_pat";
	}
	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 2)
		$_fill_pat = $fill_pat.arg_result.get(0);

	println(UseCommands.get_use_cmds(section, "DYNAMIC_POLYGON") + "Gdynamic_polygon("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+","+
		macroPort.calcW($w.text)+","+
		macroPort.calcH($h.text)+","+
		$x_low_limit.str+","+
		$x_high_limit.str+","+
		$y_low_limit.str+","+
		$y_high_limit.str+","+
		$update_rate.text+","+
//		$pairs.n+",px,py,"+
			$pairs.n+","+
			coordinate_pairs_X+","+
			coordinate_pairs_Y+","+
		$line_width.text+","+
		$_line_pat+","+
		$_fill_pat+");"
	);
}
:
	CC_DYNAMIC_POLYGON
	x = literal_numbers
	y = literal_numbers							{ macroBBox.addPoint($x.text, $y.text); }
	w = literal_numbers
	h = literal_numbers							{ macroBBox.addRect($x.text, $y.text, $w.text, $h.text); }
	x_low_limit = value
	x_high_limit = value
	y_low_limit = value
	y_high_limit = value
	update_rate = literal_numbers
	nnn = literal_numbers
	pairs = coordinate_pairs
	line_width = literal_numbers
	line_pat = def_conditional_value ["line_pat"]
	fill_pat = def_conditional_value ["fill_pat"]
;

/**
 * Команда ELLIPSE (эллипс)
 * shapelib ELLIPSE x y horz_radius vert_radius lw lp fp
 */
cmdELLIPSE
locals [String _line_pat, String _fill_pat]
@after {
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 3) {
		print($line_pat.arg_result.get(1));
		println($line_pat.arg_result.get(2));
		$_line_pat = "line_pat";
	}
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 2)
		$_line_pat = $line_pat.arg_result.get(0);

	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 3) {
		print($fill_pat.arg_result.get(1));
		println($fill_pat.arg_result.get(2));
		$_fill_pat = "fill_pat";
	}
	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 2)
		$_fill_pat = $fill_pat.arg_result.get(0);

	if (section == Section.I_SHAPELIB) {
		print("sELLIPSE(trgt,"+$x.text+","+$y.text+","+
			$hr.text+","+$vr.text+","+
			$line_width.text+","+$_line_pat.toUpperCase()+","+$_fill_pat.toUpperCase()+");"
		);
	} else {
		println(UseCommands.get_use_cmds(section, "ELLIPSE") + "Gellipse("+
			macroPort.calcX($x.text)+","+
			macroPort.calcY($y.text)+","+
			macroPort.calcW($hr.text)+","+
			macroPort.calcH($vr.text)+","+
			$line_width.text+","+
			$_line_pat.toUpperCase()+","+
			$_fill_pat.toUpperCase()+");"
		);
	}
}
:
	CC_ELLIPSE
	x = literal_numbers
	y = literal_numbers							{ macroBBox.addPoint($x.text, $y.text); }
	hr = literal_numbers
	vr = literal_numbers						{ macroBBox.addEllipse($x.text, $y.text, $hr.text, $vr.text); }
	line_width = literal_numbers
	line_pat = def_conditional_value ["line_pat"]
	fill_pat = def_conditional_value ["fill_pat"]
;

/**
 * Команда LINE (линия)
 * shapelib LINE n x1 y1 x2 y2 ... xn yn lw lp
 */
cmdLINE
locals [String _line_pat]
@after {
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 3) {
		print($line_pat.arg_result.get(1));
		println($line_pat.arg_result.get(2));
		$_line_pat = "line_pat";
	}
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 2)
		$_line_pat = $line_pat.arg_result.get(0);

	if (section == Section.I_SHAPELIB) {
		print("sLINE(trgt,"+$pairs.n+","+coordinate_pairs_X+","+coordinate_pairs_Y+","+
			$line_width.text+","+$_line_pat.toUpperCase()+");"
		);
	} else {
		println(UseCommands.get_use_cmds(section, "LINE") + "Gline("+
//			$pairs.n+",px,py,"+
				$pairs.n+","+
				coordinate_pairs_X+","+
				coordinate_pairs_Y+","+
			$line_width.text+","+
			$_line_pat.toUpperCase()+");"
		);
	}

}
:
	CC_LINE
	( { section == Section.I_SHAPELIB }? n = literal_numbers )? // для shapelib
	pairs = coordinate_pairs
	line_width = literal_numbers
	line_pat = def_conditional_value ["line_pat"]
;

/** Команда MULTI_TEXT (множество строк) */
cmdMULTI_TEXT
@after {
	println(UseCommands.get_use_cmds(section, "MULTI_TEXT") + "Gmulti_text("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+","+
		$justify.text+","+
		$spacing.text+","+
		$sss.n+",strings"+","+
		$font_type.str+");"
	);
}
:
	CC_MULTI_TEXT
	x = literal_numbers
	y = literal_numbers							{ macroBBox.addPoint($x.text, $y.text); }
	justify = literal_numbers
	spacing = literal_numbers
	nnn = literal_numbers
	sss = multi_text_strings
	multi_text_strings_cond
	font_type = def_font_type
;

multi_text_strings returns [int n]
locals [int i=0]
:
	(
		StringLiteral
			{
				println("strings["+$i+"]="+$StringLiteral.text+";");
				$i++; $n=$i;
			}
	)+
;

/*
 * Не дописанный бред
 */ 
multi_text_strings_cond
:
	( { ExprClear(); }
		expression         { println("if "+$expression.str+" {"); }
		multi_text_strings { println("}"); }
	)?
;

def_font_type returns [String str]
:
	font_type = ( BITMAP | BITMAP_OVER )
	bitmap_font_num = literal_numbers
	{ $str = $font_type.text + ", " + $bitmap_font_num.text + ", null, null, null"; }

	| font_type = ( VECTOR | VECTOR_OVER )
	char_w = literal_numbers
	char_h = literal_numbers
	line_width = literal_numbers
	{ $str = $font_type.text + ", null, " + macroPort.calcW($char_w.text) + ", " + macroPort.calcH($char_h.text) + ", " + $line_width.text; }
;

/**
 * Команда POLYGON (многоугольник)
 * shapelib POLYGON n x1 y1 x2 y2 ... xn yn lw lp fp
 */
cmdPOLYGON
locals [String _line_pat, String _fill_pat]
@after {
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 3) {
		print($line_pat.arg_result.get(1));
		println($line_pat.arg_result.get(2));
		$_line_pat = "line_pat";
	}
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 2)
		$_line_pat = $line_pat.arg_result.get(0);

	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 3) {
		print($fill_pat.arg_result.get(1));
		println($fill_pat.arg_result.get(2));
		$_fill_pat = "fill_pat";
	}
	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 2)
		$_fill_pat = $fill_pat.arg_result.get(0);

	if (section == Section.I_SHAPELIB) {
		print("sPOLYGON(trgt,"+$pairs.n+","+coordinate_pairs_X+","+coordinate_pairs_Y+","+
			$line_width.text+","+$_line_pat.toUpperCase()+","+$_fill_pat.toUpperCase()+");"
		);
	} else {
		println(UseCommands.get_use_cmds(section, "POLYGON") + "Gpolygon("+
//			$pairs.n+",px,py,"+
				$pairs.n+","+
				coordinate_pairs_X+","+
				coordinate_pairs_Y+","+
			$line_width.text+","+
			$_line_pat.toUpperCase()+","+
			$_fill_pat.toUpperCase()+");"
		);
	}
}
:
	CC_POLYGON
	( { section == Section.I_SHAPELIB }? n = literal_numbers )? // для shapelib
	pairs = coordinate_pairs
	line_width = literal_numbers
	line_pat = def_conditional_value ["line_pat"]
	fill_pat = def_conditional_value ["fill_pat"]
;

/** Команда PROCESS_PT (технологический параметр) */
cmdPROCESS_PT
locals [String process_pt_value, boolean flag_expr = false, String expr]
@init {
	ST template = new ST("Gprocess_pt("+
		"<x>,<y>,<number_of_chars>,<decimal_places>,<format>,"+
		"<quality>,<orientation>,<font_type>,"+
		"<str_value>,<value>,"+
		"<low_limit>,<high_limit>);");
	template.add("low_limit", "null");
	template.add("high_limit", "null");
}
@after {

	if ($flag_expr) {
		print("pr_pt_val=" + $process_pt_value + ";");
		String tmp_str = $process_pt_value;
		String tmp_pnt = tmp_str.substring(tmp_str.indexOf("("), tmp_str.indexOf(")")+1);
//		println("// tmp_pnt          =   " + tmp_pnt);
//		println("// expr             =   " + $expr);
		String tmp_expr = $expr;
		tmp_expr = tmp_expr.replace("{=\"", "{pr_pt_val=get").replace("\";}", tmp_pnt + ";}" );
		println(tmp_expr);
		template.remove("value"); template.add("value", "pr_pt_val");
	}

	String output = template.render();
	println(UseCommands.get_use_cmds(section, "PROCESS_PT") + output);
}
:
	CC_PROCESS_PT
	x = literal_numbers		{ template.add("x", macroPort.calcX($x.text)); }
	y = literal_numbers		{ template.add("y", macroPort.calcY($y.text));
							  macroBBox.addPoint($x.text, $y.text); }

	literal_numbers			{ template.add("number_of_chars", $literal_numbers.text); }
	value					{ template.add("decimal_places", $value.str); }
	format = ( RIGHT | RIGHT0 | LEFT | HEX | HEX_H | BINARY | EXPONENTIAL | TECHNICAL )
							{ template.add("format", $format.text); }
	quality = BlinkPattern
							{ template.add("quality", $quality.text); }
	ornt = ( HORZ | VERT )	{ template.add("orientation", $ornt.text); }
	font_type = def_font_type
							{ template.add("font_type", $font_type.str); }
	point = value
	{
		template.add("str_value", "'" + $point.str + "'");
		template.add("value", $point.str);
		$process_pt_value = $point.str;
	}
(
	{ statement_name = ""; }
//	simpleExpression		{ $flag_expr = true; $expr = $simpleExpression.str; }
	conditionalExpression	{ $flag_expr = true; $expr = $conditionalExpression.str; }
)? // 0 or 1
//(
//	low_limit = value		{ template.add("low_limit", $low_limit.str); }
//	high_limit = value		{ template.add("high_limit", $high_limit.str); }
//)? // 0 or 1
;

/**
 * Команда RECTANGLE (прямоугольник)
 * shapelib RECTANGLE x y w h lw lp fp
 */
cmdRECTANGLE
locals [String _line_pat, String _fill_pat]
@after {
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 3) {
		print($line_pat.arg_result.get(1));
		println($line_pat.arg_result.get(2));
		$_line_pat = "line_pat";
	}
	if ($line_pat.arg_result != null && $line_pat.arg_result.size() == 2)
		$_line_pat = $line_pat.arg_result.get(0);

	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 3) {
		print($fill_pat.arg_result.get(1));
		println($fill_pat.arg_result.get(2));
		$_fill_pat = "fill_pat";
	}
	if ($fill_pat.arg_result != null && $fill_pat.arg_result.size() == 2)
		$_fill_pat = $fill_pat.arg_result.get(0);

	if (section == Section.I_SHAPELIB) {
		print("sRECTANGLE(trgt,"+$x.text+","+$y.text+","+
			$w.text+","+$h.text+","+
			$line_width.text+","+$_line_pat.toUpperCase()+","+$_fill_pat.toUpperCase()+");"
		);
	} else {
		println(UseCommands.get_use_cmds(section, "RECTANGLE") + "Grectangle("+
			macroPort.calcX($x.text)+","+
			macroPort.calcY($y.text)+","+
			macroPort.calcW($w.text)+","+
			macroPort.calcH($h.text)+","+
			$line_width.text+","+
			$_line_pat.toUpperCase()+","+
			$_fill_pat.toUpperCase()+");"
		);
	}
}
:
	CC_RECTANGLE
	x = literal_numbers
	y = literal_numbers							{ macroBBox.addPoint($x.text, $y.text); }
	w = literal_numbers
	h = literal_numbers							{ macroBBox.addRect($x.text, $y.text, $w.text, $h.text); }
	line_width = literal_numbers
	line_pat = def_conditional_value ["line_pat"]
	fill_pat = def_conditional_value ["fill_pat"]
;

/** Команда SHAPE (графическое изображение из Библиотеки Форм) */
cmdSHAPE
locals [String _shape_name]
@after {
	if ($shape_name.arg_result != null && $shape_name.arg_result.size() == 3) {
		print($shape_name.arg_result.get(1));
		println($shape_name.arg_result.get(2));
		$_shape_name = "shape_name";
	}
	if ($shape_name.arg_result != null && $shape_name.arg_result.size() == 2)
		$_shape_name = $shape_name.arg_result.get(0);

	println(UseCommands.get_use_cmds(section, "SHAPE") + "Gshape("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+","+
		macroPort.calcW($w.text)+","+
		macroPort.calcH($h.text)+","+
		$_shape_name+","+
		$rotation.str+","+
		$inversion.text+");"
	);
}
:
	CC_SHAPE
	x = literal_numbers
	y = literal_numbers							{ macroBBox.addPoint($x.text, $y.text); }
	w = literal_numbers
	h = literal_numbers							{ macroBBox.addShape($x.text, $y.text, $w.text, $h.text); }
	shape_name = def_conditional_value ["shape_name"]
	rotation = value
	inversion = ( NONE | TTB | RTL | BOTH )
;

/** Команда TEXT (текстовая строка) */
cmdTEXT
locals [String _string_literal]
@after {
	// Есть Условный параметр (значение)
	if ($string_literal.arg_result != null && $string_literal.arg_result.size() == 3) {
		print($string_literal.arg_result.get(1));
		println($string_literal.arg_result.get(2));
		$_string_literal = "string_literal";
	}
	// Нет Условный параметр (значение)
	if ($string_literal.arg_result != null && $string_literal.arg_result.size() == 2) {
		$_string_literal = $string_literal.arg_result.get(0);
	}
	println(UseCommands.get_use_cmds(section, "TEXT") + "Gtext("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+","+
		$_string_literal+","+
		$ornt.text+","+
		$font_type.str+");"
	);
}
:
	CC_TEXT
	( '[' )?	// Any token followed by ? occurs 0 or 1 times
	x = literal_numbers
	( ']' )?
	( '[' )?
	y = literal_numbers		{ macroBBox.addPoint($x.text, $y.text); }
	( ']' )?
	string_literal = def_conditional_value ["string_literal"]
	ornt = ( HORZ | VERT )
	font_type = def_font_type
;

/** Команда TRIG_ON (активизация (запуска) зоны "trigger") */
cmdTRIG_ON
locals [String _integer_literal]
@after {
	if ($integer_literal.arg_result != null && $integer_literal.arg_result.size() == 3) {
		print($integer_literal.arg_result.get(1));
		println($integer_literal.arg_result.get(2));
		$_integer_literal = "integer_literal";
	}
	if ($integer_literal.arg_result != null && $integer_literal.arg_result.size() == 2)
		$_integer_literal = $integer_literal.arg_result.get(0);

	println(UseCommands.get_use_cmds(section, "TRIG_ON") + "Gtrig_on("+$_integer_literal+");");
}
:
	CC_TRIG_ON
	integer_literal = def_conditional_value ["integer_literal"]
;

// STOP Commands with Conditional Parameters 
//===========================================

/** Команда OL_GAUGE (гистограмма в стиле OPEN LOOK) */
cmdOL_GAUGE
@init {
	ST tmplt = new ST("Gol_gauge(<x>,<y>,<w>,<h>,<direction>,<cur_value>,<low_limit>,<high_limit>);");
}
@after {
	if (parserMode != MODE_PREPROCESSOR)
		println(UseCommands.get_use_cmds(section, "OL_GAUGE") + tmplt.render());
}
:
	C_OL_GAUGE
	x = literal_numbers
	y = literal_numbers
	w = literal_numbers
	h = literal_numbers
	direction = ( LEFT | RIGHT | DOWN | UP | BIAS )
		{
			macroBBox.addBar($x.text, $y.text, $w.text, $h.text, $direction.text);
			tmplt.add("direction",  $direction.text);
			// Исходной точкой может являться:
			//  - Нижний левый угол прямоугольника (с заполнением up).
			//  - Верхний левый угол прямоугольника (с заполнением down или right или bias).
			//  - Верхний правый угол прямоугольника (с заполнением left).
			switch ($direction.text) {
			case "\"UP\"":		// снизу вверх - отлажено
				tmplt.add("x", macroPort.calcX($x.text));
				tmplt.add("y", macroPort.calcY($y.text));
				tmplt.add("w", macroPort.calcW($w.text));
				tmplt.add("h", macroPort.calcH($h.text));
				break;
			case "\"BIAS\"":	// вверх или вниз от позиции с нулевым значением
				tmplt.add("x", macroPort.calcX($x.text));
				tmplt.add("y", macroPort.calcY($y.text));
				tmplt.add("w", macroPort.calcW($w.text));
				tmplt.add("h", macroPort.calcH($h.text));
				break;
			case "\"DOWN\"":	// сверху вниз - отлажено
				tmplt.add("x", macroPort.calcX($x.text));
				tmplt.add("y", macroPort.calcY($y.text));
				tmplt.add("w", macroPort.calcW($w.text));
				tmplt.add("h", macroPort.calcH($h.text));
				break;
			case "\"RIGHT\"":	// слева направо - отлажено
				tmplt.add("x", macroPort.calcX($x.text));
				tmplt.add("y", macroPort.calcY($y.text));
				tmplt.add("w", macroPort.calcH($w.text));//( W * H_scale)
				tmplt.add("h", macroPort.calcW($h.text));//( H * W_scale)
				break;
			case "\"LEFT\"":	// справа налево - отлажено
				tmplt.add("x", macroPort.calcX($x.text));
				tmplt.add("y", macroPort.calcY($y.text));
				tmplt.add("w", macroPort.calcH($w.text));//( W * H_scale)
				tmplt.add("h", macroPort.calcW($h.text));//( H * W_scale)
				break;
			}
		}
	cur_value = value	{ tmplt.add("cur_value", $value.str); }
	low_limit = value	{ tmplt.add("low_limit", $value.str); }
	high_limit = value	{ tmplt.add("high_limit", $value.str); }
;

/** Команда BAR (заполняемый прямоугольник) */
cmdBAR
@init {
	ST tmplt = new ST("Gbar(<x>,<y>,<w>,<h>,<direction>,<cur_value>,<low_limit>,<high_limit>);");
}
@after {
	if (parserMode != MODE_PREPROCESSOR)
		println(UseCommands.get_use_cmds(section, "BAR") + tmplt.render());
}
:
	C_BAR
	x = literal_numbers
	y = literal_numbers
	w = literal_numbers
	h = literal_numbers
	direction = ( LEFT | RIGHT | DOWN | UP | BIAS )
		{
			macroBBox.addBar($x.text, $y.text, $w.text, $h.text, $direction.text);
			tmplt.add("direction", $direction.text);
			// Исходной точкой может являться:
			//  - Нижний левый угол прямоугольника (с заполнением up).
			//  - Верхний левый угол прямоугольника (с заполнением down или right или bias).
			//  - Верхний правый угол прямоугольника (с заполнением left).
			switch ($direction.text) {
			case "\"UP\"":		// снизу вверх - отлажено
				tmplt.add("x", macroPort.calcX($x.text));
				tmplt.add("y", macroPort.calcY($y.text));
				tmplt.add("w", macroPort.calcW($w.text));
				tmplt.add("h", macroPort.calcH($h.text));
				break;
			case "\"BIAS\"":	// вверх или вниз от позиции с нулевым значением
				tmplt.add("x", macroPort.calcX($x.text));
				tmplt.add("y", macroPort.calcY($y.text));
				tmplt.add("w", macroPort.calcW($w.text));
				tmplt.add("h", macroPort.calcH($h.text));
				break;
			case "\"DOWN\"":	// сверху вниз - отлажено
				tmplt.add("x", macroPort.calcX($x.text));
				tmplt.add("y", macroPort.calcY($y.text));
				tmplt.add("w", macroPort.calcW($w.text));
				tmplt.add("h", macroPort.calcH($h.text));
				break;
			case "\"RIGHT\"":	// слева направо - отлажено
				tmplt.add("x", macroPort.calcX($x.text));
				tmplt.add("y", macroPort.calcY($y.text));
				tmplt.add("w", macroPort.calcH($w.text));//( W * H_scale)
				tmplt.add("h", macroPort.calcW($h.text));//( H * W_scale)
				break;
			case "\"LEFT\"":	// справа налево - отлажено
				tmplt.add("x", macroPort.calcX($x.text));
				tmplt.add("y", macroPort.calcY($y.text));
				tmplt.add("w", macroPort.calcH($w.text));//( W * H_scale)
				tmplt.add("h", macroPort.calcW($h.text));//( H * W_scale)
				break;
			}
		}
	cur_value = value	{ tmplt.add("cur_value", $value.str); }
	low_limit = value	{ tmplt.add("low_limit", $value.str); }
	high_limit = value	{ tmplt.add("high_limit", $value.str); }
;

/** Команда CURSOR (курсор) */
cmdCURSOR
@after {
	println(UseCommands.get_use_cmds(section, "CURSOR") + "Gcursor("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+");"
	);
}
:
	C_CURSOR
	x = literal_numbers
	y = literal_numbers			{ macroBBox.addPoint($x.text, $y.text); }
;

/** Команда DATE (текущая дата) */
cmdDATE
@after {
	println(UseCommands.get_use_cmds(section, "DATE") + "Gdate("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+","+
		$format.text+","+
		$font_type.str+");"
	);
}
:
	C_DATE
	x = literal_numbers
	y = literal_numbers			{ macroBBox.addPoint($x.text, $y.text); }
	format = literal_numbers
	font_type = def_font_type
;

/** Команда DEF_FKEY_GROUP (определение набора функциональных кнопок) */
cmdDEF_FKEY_GROUP
locals [ StringBuilder arg = new StringBuilder(); ]
@init { boolean first = true; }
@after {
	println(UseCommands.get_use_cmds(section, "DEF_FKEY_GROUP") +
		"Gdef_fkey_group("+$group.text+",\""+ $arg.toString()+"\");"
	);
}
:
	C_DEF_FKEY_GROUP group = literal_numbers
	(
		a = prog_args_pat
		{
			if (!first) { $arg.append("\t"); }
			first = false;
			$arg.append($a.str.replace("\"", " ").trim());
		}
	)+
;

/** Команда DEF_QUAL (цвета по умолчанию) */
cmdDEF_QUAL
@after {
	if (!macroPort.get_m_flag()) 
		println(UseCommands.get_use_cmds(section, "DEF_QUAL")
			+"Gdef_qual("
			+$G_fgcolor.text		+","+$G_bgcolor.text	+","+$G_blink.text	+","+$G_string.text
			+","+$F_fgcolor.text	+","+$F_bgcolor.text	+","+$F_blink.text	+","+$F_string.text
			+","+$P_fgcolor.text	+","+$P_bgcolor.text	+","+$P_blink.text	+","+$P_string.text
			+","+$B_fgcolor.text	+","+$B_bgcolor.text	+","+$B_blink.text	+","+$B_string.text
			+","+$T_fgcolor.text	+","+$T_bgcolor.text	+","+$T_blink.text	+","+$T_string.text
		+");");
}
:
	C_DEF_QUAL
	G_fgcolor = Color G_bgcolor = Color G_blink = BlinkPattern G_string = StringLiteral // Good
	F_fgcolor = Color F_bgcolor = Color F_blink = BlinkPattern F_string = StringLiteral // Fair
	P_fgcolor = Color P_bgcolor = Color P_blink = BlinkPattern P_string = StringLiteral // Poor
	B_fgcolor = Color B_bgcolor = Color B_blink = BlinkPattern B_string = StringLiteral // Bad
	T_fgcolor = Color T_bgcolor = Color T_blink = BlinkPattern T_string = StringLiteral // Timed-out
;

/** Команда DIAG_DISP (замена текущего видеокадра на новый видеокадр) */
cmdDIAG_DISP
locals [ StringBuilder cmd = new StringBuilder(); ]
@init { boolean first = true; }
@after { println(UseCommands.get_use_cmds(section, "DIAG_DISP") + $cmd.toString()); }
:
	C_DIAG_DISP								{ $cmd.append("Gdiag_disp("); }
	diag_type = ( MAIN | SUBWIN | WINDOW )	{ $cmd.append($diag_type.text+","); }
	diag_num = literal_numbers				{ $cmd.append($diag_num.text+","); }
//											{ DiagNumList.add($diag_num.text); }
	group_num = literal_numbers				{ $cmd.append($group_num.text+","); }
	( POSITION x = literal_numbers y = literal_numbers )?
											{ $cmd.append($x.text+","+$y.text+","); }
	( SIZE w = literal_numbers h = literal_numbers )?
											{ $cmd.append($w.text+","+$h.text+","); }
	num_sids = literal_numbers				{ $cmd.append($num_sids.text+","); }

	{ $cmd.append("["); }

	(
		pnt = pt_name_pat
		{
			if (!first) { $cmd.append(","); }
			first = false;
			$cmd.append($pnt.text);
		}
	)*
	{ $cmd.append("]);"); }
;

/**
 * Команда DOT (точка)
 * shapelib DOT x y size
 */
cmdDOT
@after {
	if (section == Section.I_SHAPELIB) {
		print("sDOT(trgt,"+$x.text+","+$y.text+","+
			$size.text.toUpperCase()+");"
		);
	} else {
		println(UseCommands.get_use_cmds(section, "DOT") +
			"Gdot("+macroPort.calcX($x.text)+","+macroPort.calcY($y.text)+","+
				$size.text.toUpperCase()+");"
		);
	}
}
:
	C_DOT
	x = literal_numbers
	y = literal_numbers
	size = ( SMALL | MEDIUM | LARGE )	{ macroBBox.addDOT($x.text, $y.text, $size.text); }
;

/** Команда EF_STATE (активизировать или не активизировать поле) */
cmdEF_STATE
@after {
	println(UseCommands.get_use_cmds(section, "EF_STATE") + "Gef_state("+
		$entry_fld.text+
		$state.text+");"
	);
}
:
	C_EF_STATE
	entry_fld = literal_numbers
	state = BlinkPattern
;

/** Команды LOOP (цикл) */
cmdLOOP
@after {
	println("for (i = 0; i < "+$n.text+"; i++) {");
}
:
	C_LOOP
	n = literal_numbers
;

cmdENDLOOP
@after { println("}"); }
:
	C_ENDLOOP
;

/** Команда ENTRY_FLD (область ввода дополнительной информации) */
cmdENTRY_FLD
@after {
	println(UseCommands.get_use_cmds(section, "ENTRY_FLD") + "Gentry_fld("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+","+
		$l.text+","+
		$number.text+","+
		$type.text+","+
		$format.text+","+
		$state.text+","+
		$font_type.str+");"
	);
}
:
	C_ENTRY_FLD
	x = literal_numbers
	y = literal_numbers			{ macroBBox.addPoint($x.text, $y.text); }
	l = literal_numbers
	number = literal_numbers
	type = ( OPERATOR | PROGRAM | BOTH )
	format = ( ASCII | INT | REAL | BYTE | HEX | EXPONENTIAL )
	state = BlinkPattern
	font_type = def_font_type
;

/** Команда FORCE_UPDATE (перерисовка отображаемых на экране элементов) */
cmdFORCE_UPDATE
@after {
	println(UseCommands.get_use_cmds(section, "FORCE_UPDATE") + "Gforce_update("+$state.text+");");
}
:
	C_FORCE_UPDATE
	state = BlinkPattern
;

/** Команда FUNC_KEY (программируемая функциональная клавиша) */
cmdFUNC_KEY
locals [ StringBuilder cmd = new StringBuilder(); ]
@init { boolean first = true; }
@after { println(UseCommands.get_use_cmds(section, "FUNC_KEY") + $cmd.toString()); }
:
	C_FUNC_KEY					{ $cmd.append("Gfunc_key(");        }
	key_num = literal_numbers	{ $cmd.append($key_num.text+",");   }
	state = BlinkPattern		{ $cmd.append($state.text+",");     }
	num_lists = literal_numbers	{ $cmd.append($num_lists.text+","); }

	{ $cmd.append("\""); }

	(
		arg = prog_args_pat
		{
			if (!first) { $cmd.append("\t"); }
			first = false;
			$cmd.append($arg.text);
		}
	)+
	{ $cmd.append("\");"); }
;

/** Команда GTEXT (одна из трех текстовых строк группы) */
cmdGTEXT
@after {
	println(UseCommands.get_use_cmds(section, "GTEXT") + "Ggtext("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+","+
		$str_num.text+","+
		$num_of_chars.text+","+
		$orientation.text+","+
		$font_type.str+");"
	);
}
:
	C_GTEXT
	x = literal_numbers
	y = literal_numbers				{ macroBBox.addPoint($x.text, $y.text); }
	str_num = literal_numbers
	num_of_chars = literal_numbers
	orientation = ( HORZ | VERT )
	font_type = def_font_type
;

/** Команда IF */
cmdIF
:
	C_IF		{ ExprClear(); }
	expression	{ println("if "+$expression.str+" {"); }
;

/** Команда IF_CHANGED */
cmdIF_CHANGED
:
	C_IF_CHANGED				{ println("if (true) {"); }
	deadband = literal_numbers
	( changed_operand = value ( ',' )? )*
;

/** Команда ELSE */
cmdELSE
:
	C_ELSE	{ println("} else {"); }
;

/** Команда END */
cmdENDIF
:
	C_ENDIF	{ println("}"); }
;

/**
 * Команды IFELSE // ??? IFELSE ($D1 ID = $D1 ID)
 * 
 * Команды IFELSE/ELSE/ENDIF действуют в режиме трио.
 * Эти команды используются для определения набора команд
 * графического отображения, выполняемых при удовлетворении
 * условия, и для определения другого набора команд графического
 * отображения, выполняемых в случае неудовлетворения этого же условия.
 * Все команды, следующие за командой IFELSE до команды ELSE,
 * выполняются при удовлетворении условия, а все команды, следующие
 * за командой ELSE до команды ENDIF, выполняются в случае
 * неудовлетворения того же самого условия.
 */
cmdIFELSE
:
	C_IFELSE	{ ExprClear(); }
	expression	{ println("if "+$expression.str+" {"); }
;

/** Команда MACRO (макрос) */
cmdMACRO
locals [
	int i = 1,
	int i_D       = 0, StringBuilder sb_D       = new StringBuilder(),
	int i_T_other = 0, StringBuilder sb_T_other = new StringBuilder(),
	int i_T_bg    = 0, StringBuilder sb_T_bg    = new StringBuilder(),
	int i_SET     = 0, StringBuilder sb_SET     = new StringBuilder(),
	int i_CONST   = 0, StringBuilder sb_CONST   = new StringBuilder(),
	int i_STATUS  = 0, StringBuilder sb_STATUS  = new StringBuilder(),
	int i_COLOR   = 0, StringBuilder sb_COLOR   = new StringBuilder(),
	int i_OLCOLOR = 0, StringBuilder sb_OLCOLOR = new StringBuilder()
]
@after {
	println(UseCommands.get_use_cmds(section, "MACRO") + "Gmacro("
		+$macro_num.text
		+","+$x.text
		+","+$y.text
		+","+$w_scale.text
		+","+$h_scale.text
		+",["+$sb_D.toString().replace("\t", ", ")      +"]"
		+",["+$sb_T_other.toString().replace("\t", ", ")+"]"
		+",["+$sb_T_bg.toString().replace("\t", ", ")   +"]"
		+",["+$sb_SET.toString().replace("\t", ", ")    +"]"
		+",["+$sb_CONST.toString().replace("\t", ", ")  +"]"
		+",["+$sb_STATUS.toString().replace("\t", ", ") +"]"
		+",["+$sb_COLOR.toString().replace("\t", ", ") +"]"
		+",["+$sb_OLCOLOR.toString().replace("\t", ", ") +"]"
		+");");
}
:
	C_MACRO
	macro_num = literal_numbers
									{
										_MacroFileNames.add("macro"+$macro_num.text);
										_MacroNumber.add($macro_num.text);
										_MacroSection.add(section);
									}
	x = literal_numbers
	y = literal_numbers
	w_scale = literal_numbers
	h_scale = literal_numbers
	n_D       = IntegerLiteral		{ $i_D        = $n_D.int;       } /* имена параметров */
	n_T_other = IntegerLiteral		{ $i_T_other  = $n_T_other.int; } /* текстовые строки в разделах макроса для переднего плана, триггерных функций и/или клавиатуры */
	n_T_bg    = IntegerLiteral		{ $i_T_bg     = $n_T_bg.int;    } /* текстовые строки в разделах макроса для фона */
	n_SET     = IntegerLiteral		{ $i_SET      = $n_SET.int;     } /* установочные параметры */
	n_CONST   = IntegerLiteral		{ $i_CONST    = $n_CONST.int;   } /* константы */
	n_STATUS  = IntegerLiteral		{ $i_STATUS   = $n_STATUS.int;  } /* слова состояния */

	/* имена параметров */
	{ $i = 1; }
	( { $i <= $i_D }? s1 = pt_name_pat
		{ $sb_D.append($s1.text); if ($i < $i_D) $sb_D.append("\t"); $i++; }
	)*

	/* текстовые строки в разделах макроса для переднего плана, триггерных функций и/или клавиатуры */
	{ $i = 1; }
	( { $i <= $i_T_other }? s2 = StringLiteral
		{ $sb_T_other.append($s2.text); if ($i < $i_T_other) $sb_T_other.append("\t"); $i++; }
	)*

	/* текстовые строки в разделах макроса для фона */
	{ $i = 1; }
	( { $i <= $i_T_bg }? s3 = StringLiteral
		{ $sb_T_bg.append($s3.text); if ($i < $i_T_bg) $sb_T_bg.append("\t"); $i++; }
	)*

	/* установочные параметры */
	{ $i = 1; }
	( { $i <= $i_SET }? s4 = SetVariable
		{ $sb_SET.append($s4.text); if ($i < $i_SET) $sb_SET.append("\t"); $i++; }
	)*

	/* константы */
	{ $i = 1; }
	( { $i <= $i_CONST }? s5 = literal_numbers /*ConstVariable*/
		{ $sb_CONST.append($s5.text); if ($i < $i_CONST) $sb_CONST.append("\t"); $i++; }
	)*

	/* слова состояния */
	{ $i = 1; }
	( { $i <= $n_STATUS.int }? s6 = StatusWord
		{ $sb_STATUS.append($s6.text); if ($i < $n_STATUS.int) $sb_STATUS.append("\t"); $i++; }
	)*

	(
		n_COLOR = IntegerLiteral	{ $i_COLOR    = $n_COLOR.int;   } /* цвет */
		{ $i = 1; }
		( { $i <= $i_COLOR }? s7 = Color
			{ $sb_COLOR.append($s7.text); if ($i < $i_COLOR) $sb_COLOR.append("\t"); $i++; }
		)*
	)? // 0 or 1 times

	(
		n_OLCOLOR = IntegerLiteral	{ $i_OLCOLOR  = $n_OLCOLOR.int; } /* OL цвет */
		{ $i = 1; }
		( { $i <= $i_OLCOLOR }? s8 = literal_numbers
			{ $sb_OLCOLOR.append($s8.text); if ($i < $i_OLCOLOR) $sb_OLCOLOR.append("\t"); $i++; }
		)*
	)? // 0 or 1 times
;

/* 
 * Команда DEF_MACRO_PARAMS позволяет пользователю создавать/редактировать
 * метки описания параметров макроса, а также примечания к макросам и комментарии.
 * 
 * Синтаксис
 * 
 * DEF_MACRO_PARAMS
 *    #$D desc$D2 ... desc$Dn
 *    #$T desc$T1 desc$T2 ... desc$Tn
 *    #$T(bg) desc$T1(bg) desc$T2(bg) ... desc$Tn(bg
 *    #$Set desc$Set1 desc$Set2 ... desc$Setn
 *    #$Const desc$Const1 desc$Const2 ... desc$Constn
 *    #$Status desc$Status1 desc$Status2 ... desc$Statusn
 *    #$Color desc$Color1 desc$Color2 ... desc$Colorn
 *    #$OLcolor desc$OLcolor1 desc$OLcolor2 ... desc$OLcolorn
 */
cmdDEF_MACRO_PARAMS
locals [
	int i         = 1,
	int i_D       = 0, StringBuilder sb_D       = new StringBuilder(),
	int i_T_other = 0, StringBuilder sb_T_other = new StringBuilder(),
	int i_T_bg    = 0, StringBuilder sb_T_bg    = new StringBuilder(),
	int i_SET     = 0, StringBuilder sb_SET     = new StringBuilder(),
	int i_CONST   = 0, StringBuilder sb_CONST   = new StringBuilder(),
	int i_STATUS  = 0, StringBuilder sb_STATUS  = new StringBuilder(),
	int i_COLOR   = 0, StringBuilder sb_COLOR   = new StringBuilder(),
	int i_OLCOLOR = 0, StringBuilder sb_OLCOLOR = new StringBuilder()
]
@after {
	println(UseCommands.get_use_cmds(section, "DEF_MACRO_PARAMS") + "Gdef_macro_params("
		+ "["+$sb_D.toString().replace(      "\t", ", ")+"]"
		+",["+$sb_T_other.toString().replace("\t", ", ")+"]"
		+",["+$sb_T_bg.toString().replace(   "\t", ", ")+"]"
		+",["+$sb_SET.toString().replace(    "\t", ", ")+"]"
		+",["+$sb_CONST.toString().replace(  "\t", ", ")+"]"
		+",["+$sb_STATUS.toString().replace( "\t", ", ")+"]"
		+",["+$sb_COLOR.toString().replace(  "\t", ", ")+"]"
		+",["+$sb_OLCOLOR.toString().replace("\t", ", ")+"]"
		+");");
}
:
	C_DEF_MACRO_PARAMS
	n_D = IntegerLiteral		{ $i_D          = $n_D.int;       $i = 1; }
	( { $i <= $i_D }? s = StringLiteral
		{ $sb_D.append($s.text); if ($i < $i_D) $sb_D.append("\t"); $i++; }
	)*

	n_T_other = IntegerLiteral	{ $i_T_other    = $n_T_other.int; $i = 1; }
	( { $i <= $i_T_other }? s = StringLiteral
		{ $sb_T_other.append($s.text); if ($i < $i_T_other) $sb_T_other.append("\t"); $i++; }
	)*

	n_T_bg = IntegerLiteral		{ $i_T_bg       = $n_T_bg.int;    $i = 1; }
	( { $i <= $i_T_bg }? s = StringLiteral
		{ $sb_T_bg.append($s.text); if ($i < $i_T_bg) $sb_T_bg.append("\t"); $i++; }
	)*

	n_SET = IntegerLiteral		{ $i_SET        = $n_SET.int;     $i = 1; }
	( { $i <= $i_SET }? s = StringLiteral
		{ $sb_SET.append($s.text); if ($i < $i_SET) $sb_SET.append("\t"); $i++; }
	)*

	n_CONST = IntegerLiteral	{ $i_CONST      = $n_CONST.int;   $i = 1; }
	( { $i <= $i_CONST }? s = StringLiteral
		{ $sb_CONST.append($s.text); if ($i < $i_CONST) $sb_CONST.append("\t"); $i++; }
	)*

	n_STATUS = IntegerLiteral	{ $i_STATUS     = $n_STATUS.int;  $i = 1; }
	( { $i <= $n_STATUS.int }? s=StringLiteral
		{ $sb_STATUS.append($s.text); if ($i < $n_STATUS.int) $sb_STATUS.append("\t"); $i++; }
	)*

	n_COLOR = IntegerLiteral	{ $i_COLOR      = $n_COLOR.int;   $i = 1; }
	( { $i <= $i_COLOR }? s = StringLiteral
		{ $sb_COLOR.append($s.text); if ($i < $i_COLOR) $sb_COLOR.append("\t"); $i++; }
	)*

	n_OLCOLOR = IntegerLiteral	{ $i_OLCOLOR    = $n_OLCOLOR.int; $i = 1; }
	( { $i <= $i_OLCOLOR }? s = StringLiteral
		{ $sb_OLCOLOR.append($s.text); if ($i < $i_OLCOLOR) $sb_OLCOLOR.append("\t"); $i++; }
	)*
;

/** Команда DEF_MACRO (макрос) */
cmdDEF_MACRO
locals [
	int i_D       = 0, StringBuilder sb_D       = new StringBuilder(),
	int i_T_other = 0, StringBuilder sb_T_other = new StringBuilder(),
	int i_T_bg    = 0, StringBuilder sb_T_bg    = new StringBuilder(),
	int i_SET     = 0, StringBuilder sb_SET     = new StringBuilder(),
	int i_CONST   = 0, StringBuilder sb_CONST   = new StringBuilder(),
	int i_STATUS  = 0, StringBuilder sb_STATUS  = new StringBuilder(),

	int i_COLOR   = 0, StringBuilder sb_COLOR   = new StringBuilder(),
	int i_OLCOLOR = 0, StringBuilder sb_OLCOLOR = new StringBuilder()
]
@after {

//	countMacro++;
//	_call_macro = "Macro"+$macro_num.text+"_"+countMacro+"("+macro_x+","+macro_y+","+macro_w_scale+","+macro_h_scale;

//	macro_flag = true;
	macroPort.set_m_flag(true);

	macro_args =   "["+$sb_D.toString().replace("\t", ", ")      +"]"
				 +",["+$sb_T_other.toString().replace("\t", ", ")+"]"
				 +",["+$sb_T_bg.toString().replace("\t", ", ")   +"]"
				 +",["+$sb_SET.toString().replace("\t", ", ")    +"]"
				 +",["+$sb_CONST.toString().replace("\t", ", ")  +"]"
				 +",["+$sb_STATUS.toString().replace("\t", ", ") +"]"

				 +",["+$sb_COLOR.toString().replace("\t", ", ")   +"]"
				 +",["+$sb_OLCOLOR.toString().replace("\t", ", ") +"]";

	// Список имен технологических параметров (без полей записи),
	// передаваемых макросу для замены параметров \$D в макросе
	if ($i_D > 0) {
		String str_D       = $sb_D.toString().replace("\t", ", ");
		String _str = "\$D=\$H=[\"\","+str_D+"];";
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
	// параметров \$T в разделах макроса для переднего плана,
	// триггерных функций и/или клавиатуры
	if ($i_T_other > 0) {
		String str_T_other = $sb_T_other.toString().replace("\t", ", ");
		String _str = "\$T=[\"\","+str_T_other+"];";
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
	// параметров \$T в разделе макроса для фона
	if ($i_T_bg > 0) {
		String str_T_bg    = $sb_T_bg.toString().replace("\t", ", ");
		String _str = "\$T=[\"\","+str_T_bg+"];";
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
	// параметров \$SET в макросе
	if ($i_SET > 0) {
		String str_SET     = $sb_SET.toString().replace("\t", ", ");
		String _str = "\$SET=[\"\","+str_SET+"];";
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
	// замены параметров \$CONST в макросе
	if ($i_CONST > 0) {
		String str_CONST   = $sb_CONST.toString().replace("\t", ", ");
		String _str = "\$CONST=[\"\","+str_CONST+"];";
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
	// параметров \$STATUS в макросе
	if ($i_STATUS > 0) {
		String str_STATUS  = $sb_STATUS.toString().replace("\t", ", ");
		String _str = "\$STATUS=[\"\","+str_STATUS+"];";
//		println(_str);
		sctnDIAGRAM.add(_str);    sctnDIAGRAM.add("\n");
		sctnKEYBOARD.add(_str);   sctnKEYBOARD.add("\n");
		sctnBACKGROUND.add(_str); sctnBACKGROUND.add("\n");
		sctnFOREGROUND.add(_str); sctnFOREGROUND.add("\n");
//		sctnTRIGGER.add(_str);    sctnTRIGGER.add("\n");
//		sctnSHAPELIB.add(_str);   sctnSHAPELIB.add("\n");
//		sctnCALL_MACRO.add(_str); sctnCALL_MACRO.add("\n");
	}

	// Список длиной до 100 значений цвета, подставляемых вместо \$COLOR,
	// появляющихся в графическом файле макросов. Значениями цвета,
	// передаваемыми макросу, являются имена цвета (красный, зеленый, синий и т.д.).
	// Первое значение цвета замещает все \$COLOR1, содержащиеся в файле
	// макроса, второе значение цвета замещает все \$COLOR2 и т.д. Количество
	// значений цвета, которые необходимо передать макросу, равняется
	// максимальному значению индекса \$COLOR в файле макросов. То есть, если в
	// файле макросов используются индексы \$COLOR1 и \$COLOR10, то 10 является
	// максимальным значением индекса \$COLOR, поэтому требуется передача 10
	// значений цвета в файл макросов.
	if ($i_COLOR > 0) {
		String str_COLOR  = $sb_COLOR.toString().replace("\t", ", ");
		String _str = "\$COLOR=[\"\","+str_COLOR+"];";
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
	// \$OL_COLOR в графическом файле макросов. OL-цвета, передаваемые в макрос,
	// определяются в качестве индексов OL-цвета. Первое значение цвета,
	// передаваемое в макрос, замещает все \$OL_COLOR1, содержащиеся в файле
	// макроса, второе значение цвета, передаваемое в макрос, замещает все
	// \$OL_COLOR2 в файле и т.д. Количество значений OL-цвета, которые необходимо
	// передать макросу, равняется максимальному значению индекса \$OL_COLOR в
	// файле макросов.
	if ($i_OLCOLOR > 0) {
		String str_OLCOLOR  = $sb_OLCOLOR.toString().replace("\t", ", ");
//		String _str = "\$OLCOLOR=[\"\","+str_OLCOLOR+"];";
		String _str = "\$OLCOLOR=[0,"+str_OLCOLOR+"];";
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
:
	C_DEF_MACRO
	macro_num = literal_numbers	{ macro_number  = Integer.parseInt($macro_num.text); }

	x = literal_numbers			{ macro_x       = Integer.parseInt($x.text);         }
	y = literal_numbers			{ macro_y       = Integer.parseInt($y.text);         }
	w_scale = literal_numbers	{ macro_w_scale = Double.parseDouble($w_scale.text); }
	h_scale = literal_numbers	{ macro_h_scale = Double.parseDouble($h_scale.text); }
								{
									macroPort.def_macro(macro_x,
														macro_y,
														macro_w_scale,
														macro_h_scale);
								}
	n_D = IntegerLiteral		{ $i_D          = $n_D.int;       }
	n_T_other = IntegerLiteral	{ $i_T_other    = $n_T_other.int; }
	n_T_bg = IntegerLiteral		{ $i_T_bg       = $n_T_bg.int;    }
	n_SET = IntegerLiteral		{ $i_SET        = $n_SET.int;     }
	n_CONST = IntegerLiteral	{ $i_CONST      = $n_CONST.int;   }
	n_STATUS = IntegerLiteral	{ $i_STATUS     = $n_STATUS.int;  }
	a1 = def_macro_d_list		{ $sb_D         = $a1.array; }
	a2 = def_macro_t_list_other	{ $sb_T_other   = $a2.array; }
	a3 = def_macro_t_list_bg	{ $sb_T_bg      = $a3.array; }
	a4 = def_macro_set_list		{ $sb_SET       = $a4.array; }
	a5 = def_macro_const_list	{ $sb_CONST     = $a5.array; }
	a6 = def_macro_status_list	{ $sb_STATUS    = $a6.array; }
(
	n_COLOR = IntegerLiteral	{ $i_COLOR    = $n_COLOR.int;   }
	a7 = def_macro_color_list	{ $sb_COLOR   = $a7.array;      }
)? // 0 or 1 times
(
	n_OLCOLOR = IntegerLiteral	{ $i_OLCOLOR  = $n_OLCOLOR.int; }
	a8 = def_macro_olcolor_list	{ $sb_OLCOLOR = $a8.array;      }
)? // 0 or 1 times
//	( literal_numbers | Color )*			// 0 or more
;

/** макрос - имена параметров */
def_macro_d_list returns [StringBuilder array]
locals [int i=1, StringBuilder cmd = new StringBuilder()]
@after { $array = $cmd; }
:
	(
		{ $i<=$cmdDEF_MACRO::i_D }? s = pt_name_pat
		{ $cmd.append($s.text); if ($i<$cmdDEF_MACRO::i_D) $cmd.append("\t"); $i++; }

	)*
;

/** макрос - текстовые строки в разделах макроса для переднего плана, триггерных функций и/или клавиатуры */
def_macro_t_list_other returns [StringBuilder array]
locals [int i=1, StringBuilder cmd = new StringBuilder()]
@after { $array = $cmd; }
:
	(
		{ $i<=$cmdDEF_MACRO::i_T_other }? s = StringLiteral
		{ $cmd.append($s.text); if ($i<$cmdDEF_MACRO::i_T_other) $cmd.append("\t"); $i++; }
	)*
;

/** макрос - текстовые строки в разделах макроса для фона */
def_macro_t_list_bg returns [StringBuilder array]
locals [int i=1, StringBuilder cmd = new StringBuilder()]
@after { $array = $cmd; }
:
	(
		{ $i<=$cmdDEF_MACRO::i_T_bg }? s = StringLiteral
		{ $cmd.append($s.text); if ($i<$cmdDEF_MACRO::i_T_bg) $cmd.append("\t"); $i++; }
	)*
;

/** макрос - установочные параметры */
def_macro_set_list returns [StringBuilder array]
locals [int i=1, StringBuilder cmd = new StringBuilder()]
@after { $array = $cmd; }
:
	(
		{ $i<=$cmdDEF_MACRO::i_SET }? s = SetVariable	/*literal_numbers*/
		{ $cmd.append($s.text); if ($i<$cmdDEF_MACRO::i_SET) $cmd.append("\t"); $i++; }
	)*
;

/** макрос - константы */
def_macro_const_list returns [StringBuilder array]
locals [int i=1, StringBuilder cmd = new StringBuilder()]
@after { $array = $cmd; }
:
	(
		{ $i<=$cmdDEF_MACRO::i_CONST }? s = literal_numbers
		{ $cmd.append($s.text); if ($i<$cmdDEF_MACRO::i_CONST) $cmd.append("\t"); $i++; }
	)*
;

/** макрос - слова состояния */
def_macro_status_list returns [StringBuilder array]
locals [int i=1, StringBuilder cmd = new StringBuilder()]
@after { $array = $cmd; }
:
	(
		{ $i<=$cmdDEF_MACRO::i_STATUS }? s = StatusWord
		{ $cmd.append("\""+$s.text+"\""); if ($i<$cmdDEF_MACRO::i_STATUS) $cmd.append("\t"); $i++; }
	)*
;

/** макрос - цвет */
def_macro_color_list returns [StringBuilder array]
locals [int i=1, StringBuilder cmd = new StringBuilder()]
@after { $array = $cmd; }
:
	(
		{ $i<=$cmdDEF_MACRO::i_COLOR }? s = Color
		{ $cmd.append($s.text); if ($i<$cmdDEF_MACRO::i_COLOR) $cmd.append("\t"); $i++; }
	)*
;

/** макрос - OL цвет */
def_macro_olcolor_list returns [StringBuilder array]
locals [int i=1, StringBuilder cmd = new StringBuilder()]
@after { $array = $cmd; }
:
	(
		{ $i<=$cmdDEF_MACRO::i_OLCOLOR }? s = literal_numbers
		{ $cmd.append($s.text); if ($i<$cmdDEF_MACRO::i_OLCOLOR) $cmd.append("\t"); $i++; }
	)*
;

/** Команда SET_MACRO (макрос) */
cmdSET_MACRO_BB
:
	C_SET_MACRO_BB
	macro_num = literal_numbers	{ macro_number = Integer.parseInt($macro_num.text); }
	xBB = literal_numbers		{ macro_BBx = Integer.parseInt($xBB.text); }
	yBB = literal_numbers		{ macro_BBy = Integer.parseInt($yBB.text); }
	wBB = literal_numbers		{ macro_BBw = Integer.parseInt($wBB.text); }
	hBB = literal_numbers		{ macro_BBh = Integer.parseInt($hBB.text); }
								{
									macroPort.set_macro_bb(	macro_BBx,
															macro_BBy,
															macro_BBw,
															macro_BBh);
								}
;

/** Команда END_MACRO (макрос) */
cmdEND_MACRO
@after {
//	macro_flag = false;
	macroPort.set_m_flag(false);
}
:
	C_END_MACRO
		{
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
		}

	(
		  M_BACKGROUND		{section = Section.I_BACKGROUND;}
		| M_DIAGRAM			{section = Section.I_DIAGRAM;}
		| M_FOREGROUND		{section = Section.I_FOREGROUND;}
		| M_KEYBOARD		{section = Section.I_KEYBOARD;}
		| M_TRIGGER			{section = Section.I_TRIGGER;}
	)
;

/** Команда MATH (математическое выражение) */
cmdMATH
@after {
	String pointer_name = $pointer.text.substring(0, 2);
	String pointer_index = $pointer.text.substring(3).replace("]", "");

	String offset_name = $offset.text.substring(0, 2);
	String offset_index = $offset.text.substring(3).replace("]", "");

	println(UseCommands.get_use_cmds(section, "MATH") +
		"set"+pointer_name+offset_name+"("+pointer_index+","+offset_index+","+$e.str+");"
	);

//	println(" //MATH "+$pointer.text+","+$offset.text+","+$e.str+");");
}
:
	C_MATH
	pointer = Ppointer
	offset = ( Boffset | Ioffset | Roffset | Soffset | Spointer | Aoffset )
		{
			EqtnClear();
		}
	e = math_equation
;

/** Уравнение в инфиксной записи */
math_equation returns [String str]
@after { $str = EqtnToStr(); }
:
	math_primary_eqtn
	|				PLUS	{ EqtnAdd("+"); }	math_equation
	|				MINUS	{ EqtnAdd("-"); }	math_equation
	| math_equation	STAR	{ EqtnAdd("*"); }	math_equation
	| math_equation DIV		{ EqtnAdd("/"); }	math_equation
	| math_equation	PLUS	{ EqtnAdd("+"); }	math_equation
	| math_equation	MINUS	{ EqtnAdd("-"); }	math_equation
;

math_primary_eqtn
:
			LPAREN		{ EqtnAdd("(");      }	math_equation RPAREN	{ EqtnAdd(")"); }
	| EXP	LPAREN		{ EqtnAdd("fEXP(");  }	math_equation RPAREN	{ EqtnAdd(")"); }
	| SQRT	LPAREN		{ EqtnAdd("fSQRT("); }	math_equation RPAREN	{ EqtnAdd(")"); }
	| LOG	LPAREN		{ EqtnAdd("fLOG(");  }	math_equation RPAREN	{ EqtnAdd(")"); }
	| COS	LPAREN		{ EqtnAdd("fCOS(");  }	math_equation RPAREN	{ EqtnAdd(")"); }
	| SIN	LPAREN		{ EqtnAdd("fSIN(");  }	math_equation RPAREN	{ EqtnAdd(")"); }
	| TAN	LPAREN		{ EqtnAdd("fTIN(");  }	math_equation RPAREN	{ EqtnAdd(")"); }
	| ASIN	LPAREN		{ EqtnAdd("fASIN("); }	math_equation RPAREN	{ EqtnAdd(")"); }
	| ACOS	LPAREN		{ EqtnAdd("fCOS(");  }	math_equation RPAREN	{ EqtnAdd(")"); }
	| ATAN	LPAREN		{ EqtnAdd("fATAN("); }	math_equation RPAREN	{ EqtnAdd(")"); }
	| literal_numbers	{ EqtnAdd($literal_numbers.text); }
	| ConstVariable		{ EqtnAdd($ConstVariable.text); }
	| ColorVariable		{ EqtnAdd($ColorVariable.text); }
	| pt_name_pat ( rec_fld_pat )?
		{
			if ($rec_fld_pat.text!=null) {
				EqtnAdd("get"+$rec_fld_pat.text.replace("\"", " ").trim()+"("+$pt_name_pat.text+")");
			} else {
				EqtnAdd("getAV("+$pt_name_pat.text+")");
			}
		}
	| pointer_pat ( offset_pat )?
		{
			if ($offset_pat.text!=null) {
				String pointer_name = $pointer_pat.text.substring(0, 2);
				String pointer_index = $pointer_pat.text.substring(3).replace("]", "");

				String offset_name = $offset_pat.text.substring(0, 2);
				String offset_index = $offset_pat.text.substring(3).replace("]", "");

				EqtnAdd("get"+pointer_name+offset_name+"("+pointer_index+","+offset_index+")");
			} else {
				EqtnAdd($pointer_pat.text);
			}
		}
;

/** Команда OL_BUTTON (кнопка в стиле OPEN LOOK) */
cmdOL_BUTTON
locals [
	int i_poke_type = 0,
	int i_progs = 0,
	int i_args = 0,
]
@init {

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
}
@after {
	println(UseCommands.get_use_cmds(section, "OL_BUTTON") + tmplt.render());
}
:
	C_OL_BUTTON
	x = literal_numbers				{ tmplt.add("x", macroPort.calcX($x.text)); }
	y = literal_numbers				{ tmplt.add("y", macroPort.calcY($y.text)); }
									{ macroBBox.addPoint($x.text, $y.text); }

	orientation = ( HORZ | VERT )	{ tmplt.add("orientation", $orientation.text); }
	endcap = ( ROUNDED | SQUARED )	{ tmplt.add("endcap", $endcap.text); }
	(
		(
			label_type = SHAPE_LABEL					{ tmplt.add("label_type", $label_type.text); }

			button_w = literal_numbers					{ shape_lable.add("button_w", macroPort.calcW($button_w.text)); }
			button_h = literal_numbers					{ shape_lable.add("button_h", macroPort.calcH($button_h.text)); }
														{ macroBBox.addRect($x.text, $y.text, $button_w.text, $button_h.text); }
			shape_w = literal_numbers					{ shape_lable.add("shape_w", macroPort.calcW($shape_w.text)); }
			shape_h = literal_numbers					{ shape_lable.add("shape_h", macroPort.calcW($shape_h.text)); }

			shape_name = Identifier						{ shape_lable.add("shape_name", $shape_name.text); }
			rotation = literal_numbers					{ shape_lable.add("rotation", $rotation.text); }
			inversion = ( NONE | TTB | RTL | BOTH )		{ shape_lable.add("inversion", $inversion.text); }

		)												{ tmplt.add("label", shape_lable.render()); }

		|

		(
			label_type = TEXT_LABEL						{ tmplt.add("label_type", $label_type.text); }
			(
				(
					font_type = BITMAP					{ text_lable_bitmap.add("font_type", $font_type.text); }
					bitmap_font_num = literal_numbers	{ text_lable_bitmap.add("bitmap_font_num", $bitmap_font_num.text); }
					txt = StringLiteral					{ text_lable_bitmap.add("txt", $txt.text); }

				)										{ tmplt.add("label", text_lable_bitmap.render()); }

				|

				(
					font_type = VECTOR					{ text_lable_vector.add("font_type", $font_type.text); }
					vector_char_w = literal_numbers		{ text_lable_vector.add("vector_char_w", macroPort.calcW($vector_char_w.text)); }
					vector_char_h = literal_numbers		{ text_lable_vector.add("vector_char_h", macroPort.calcH($vector_char_h.text)); }
					line_width = literal_numbers		{ text_lable_vector.add("line_width", $line_width.text); }
					txt = StringLiteral					{ text_lable_vector.add("txt", $txt.text); }

				)										{ tmplt.add("label", text_lable_vector.render()); }
			)
		)
	)
	(
		(
			func_type = EXEC_TRIG						{ tmplt.add("function_type", $func_type.text); }
			trigger = literal_numbers					{ tmplt.add("function", $trigger.text); }

		)												{ tmplt.add("args", "null,null,null"); }

		|

		(
			func_type = EXEC_POKE						{ tmplt.add("function_type", $func_type.text); }
//			poke_type = literal_numbers					{ tmplt.add("function", $poke_type.text); }
			poke_type = IntegerLiteral					{ tmplt.add("function", $poke_type.text); }
														{ $i_poke_type = $poke_type.int; }
			//======================================================================
			(
				// Точка процесса
				// Process point
				// POKE_FLD x y w h state   0   pt_name
				// Имя технологического параметра, имя фиктивной точки, $-указатель ($P, $G, $D, $W, $H или $O)
				(
					{ $i_poke_type == 0 }?
					pt_name = poke_args
					{ 
						tmplt.add("args", $pt_name.str + ",null,null");
					}
				)
			|
				// Видеограмма и группа
				// Diagram and group
				// POKE_FLD x y w h state   2   diag_num   group_num
				(
					{ $i_poke_type == 2 }?
					diag_num = IntegerLiteral
					group_num = IntegerLiteral
					{
						tmplt.add("args", $diag_num.text + "," + $group_num.text + ",null");
					}
				)
			|
				// Выполнение одной прикладной программы (без возможности передачи программе аргументов)
				// Run 1 Application program (no arguments can be passed to it)
				// POKE_FLD x y w h state   3   prog_num
				(
					{ $i_poke_type == 3 }?
					prg_num = IntegerLiteral
					{
						tmplt.add("args", $prg_num.text + ",null,null");
					}
				)
			|
				// Команда операционной системы
				// Operating system command
				// POKE_FLD x y w h state   9   command_line
				(
					{ $i_poke_type == 9 }?
					command_line = StringLiteral
					{
						tmplt.add("args", $command_line.text + ",null,null");
					}
				)
			|
				// Выполнение одной или нескольких прикладных программ (с возможностью передачи аргументов)
				// Run 1 or more Application programs (arguments can be passed)
				// POKE_FLD x y w h state   7   num_of_progs prog_num1 diag_num1 num_of_args1 arg_list1 ...
				//                                           prog_numN diag_numN num_of_argsN arg_listN
				(
				/**************************************************/
					{ $i_poke_type == 7 }?
					{ tmplt.add("args", "null,null,["); }								// Открывашка 1
					num_of_progs = IntegerLiteral	{ $i_progs = 0; first_progs = true; }
					(
						{ $i_progs <= $num_of_progs.int }?
						(
							prog_num    = IntegerLiteral
								{
									if (first_progs) {
										first_progs = false;
										tmplt.add("args", "{\"prog\":" + $prog_num.text);		// Открывашка 2
									} else {
										tmplt.add("args", ",{\"prog\":" + $prog_num.text);
									}
								}
							diag_num    = IntegerLiteral	{ tmplt.add("args", ",\"diag\":" + $diag_num.text + ",\"arg\":["); }	// Открывашка 3
															{ DiagNumList.add($diag_num.text); }
							num_of_args = IntegerLiteral	{ $i_args = 0; first_args = true; }
							(
								{ $i_args < $num_of_args.int }?
									arg = poke_args
									{
										if (first_args) {
											first_args = false;
											tmplt.add("args",       $arg.str);
										} else {
											tmplt.add("args", "," + $arg.str);
										}
									}
								{ $i_args++; }
							)* // 0 or more times - важное отличие типа 7 от типа 23
							{ tmplt.add("args", "]"); }																				// Закрывашка 3
						)
						{ $i_progs++; tmplt.add("args", "}"); }									// Закрывашка 2
					)* // 0 or more times - важное отличие типа 7 от типа 23
					{
						tmplt.add("args", "]");											// Закрывашка 1
					}
				/**************************************************/
				)
			|
				// Управление
				// Control
				// POKE_FLD x y w h state   23  set_num set_val num_of_progs prog_num1 diag_num1 num_of_args1 arg_list1 ...
				//                                                           prog_numN diag_numN num_of_argsN arg_listN
				(
				/**************************************************/
					{ $i_poke_type == 23 }?
					set_num = poke_args				{ tmplt.add("args",       $set_num.str); }
					set_val = IntegerLiteral		{ tmplt.add("args", "," + $set_val.text + ",["); }	// Открывашка 1
					num_of_progs = IntegerLiteral	{ $i_progs = 0; first_progs = true; }
					(
						{ $i_progs <= $num_of_progs.int }?
						(
							prog_num    = IntegerLiteral
								{
									if (first_progs) {
										first_progs = false;
										tmplt.add("args", "{\"prog\":" + $prog_num.text);						// Открывашка 2
									} else {
										tmplt.add("args", ",{\"prog\":" + $prog_num.text);
									}
								}
							diag_num    = IntegerLiteral	{ tmplt.add("args", ",\"diag\":" + $diag_num.text + ",\"arg\":["); }	// Открывашка 3
															{ DiagNumList.add($diag_num.text); }
							num_of_args = IntegerLiteral	{ $i_args = 0; first_args = true; }
							(
								{ $num_of_args.int != 0 }?			// бывает и 0 аргументов !!!
								{ $i_args < $num_of_args.int }?
									arg = poke_args
									{
										if (first_args) {
											first_args = false;
											tmplt.add("args",       $arg.str);
										} else {
											tmplt.add("args", "," + $arg.str);
										}
									}
								{ $i_args++; }
							)* // 0 or more times - важное отличие типа 23 от типа 7
							{ tmplt.add("args", "]"); }																				// Закрывашка 3
						)
						{ $i_progs++; tmplt.add("args", "}"); }													// Закрывашка 2
					)+ // 1 or more times - важное отличие типа 23 от типа 7
					{
						tmplt.add("args", "]");															// Закрывашка 1
					}
				/**************************************************/
				)
			)
			//======================================================================
		)
	)
;

/** Команда OL_RECTANGLE (прямоугольник в стиле OPEN LOOK) */
cmdOL_RECTANGLE
@after {
	println(UseCommands.get_use_cmds(section, "OL_RECTANGLE") + "Gol_rectangle("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+","+
		macroPort.calcW($w.text)+","+
		macroPort.calcH($h.text)+","+
		$state.text+");"
	);
}
:
	C_OL_RECTANGLE
	x = literal_numbers
	y = literal_numbers				{ macroBBox.addPoint($x.text, $y.text); }
	w = literal_numbers
	h = literal_numbers				{ macroBBox.addRect($x.text, $y.text, $w.text, $h.text); }
	state = ( OLNORMAL | INVOKED )
;

/** Команда PAGE (определяет видеокадры, которые будут выбираться при
 * нажатии клавиш перехода на клавиатуре или кнопке перехода в окне
 * видеокадра)
 */
cmdPAGE
@init {
	ST tmplt = new ST("Gpage("+
		"<pg_up_diag>,<pg_rt_diag>,<pg_dn_diag>,<pg_lt_diag>,"+
		"<pg_up_group>,<pg_rt_group>,<pg_dn_group>,<pg_lt_group>);");
}
@after {
	println(UseCommands.get_use_cmds(section, "PAGE") + tmplt.render());
}
:
	C_PAGE
	literal_numbers	{ tmplt.add("pg_up_diag",  Integer.parseInt($literal_numbers.text)); }
	literal_numbers	{ tmplt.add("pg_rt_diag",  Integer.parseInt($literal_numbers.text)); }
	literal_numbers	{ tmplt.add("pg_dn_diag",  Integer.parseInt($literal_numbers.text)); }
	literal_numbers	{ tmplt.add("pg_lt_diag",  Integer.parseInt($literal_numbers.text)); }
	literal_numbers	{ tmplt.add("pg_up_group", Integer.parseInt($literal_numbers.text)); }
	literal_numbers	{ tmplt.add("pg_rt_group", Integer.parseInt($literal_numbers.text)); }
	literal_numbers	{ tmplt.add("pg_dn_group", Integer.parseInt($literal_numbers.text)); }
	literal_numbers	{ tmplt.add("pg_lt_group", Integer.parseInt($literal_numbers.text)); }
;

/** Команда PLOT (график технологического параметра во времени) */
cmdPLOT
@init {
	ST tmplt = new ST("Gplot(<x>,<y>,"+
		"<plot_line_len>,<direction>,"+
		"<cur_value>,<low_limit>,<high_limit>,"+
		"<plot_char>,<shape_name>,<shapew>,<shapeh>,<rot>,<inv>);");
}
@after {
	println(UseCommands.get_use_cmds(section, "PLOT") + tmplt.render());
}
:
	C_PLOT
	x = literal_numbers	{ tmplt.add("x", macroPort.calcX($x.text)); }
	y = literal_numbers	{ tmplt.add("y", macroPort.calcY($y.text));
						  macroBBox.addPoint($x.text, $y.text); }

	literal_numbers	{ tmplt.add("plot_line_len", $literal_numbers.text); }
	drctn = ( UP | DOWN | LEFT | RIGHT )
					{ tmplt.add("direction",  $drctn.text); }
	value			{ tmplt.add("cur_value",  $value.str);  }
	value			{ tmplt.add("low_limit",  $value.str);  }
	value			{ tmplt.add("high_limit", $value.str);  }
	plt_chr = ( NONE | LINES | SHAPE_PLOT | SQUAREWAVE )
					{ tmplt.add("plot_char",  $plt_chr.text); }
	(
		Identifier		{ tmplt.add("shape_name", $Identifier.text);      }
		literal_numbers	{ tmplt.add("shapew",     $literal_numbers.text); }
		literal_numbers	{ tmplt.add("shapeh",     $literal_numbers.text); }
		literal_numbers	{ tmplt.add("rot",        $literal_numbers.text); }
		inv = ( NONE | TTB | RTL | BOTH )
						{ tmplt.add("inv",        $inv.text); }
	)?
;

/** Команда PTR_VALUE (изменение данных в обозначаемом указателем месте) */
cmdPTR_VALUE
@after {
	String pointer_name = $pointer.text.substring(0, 2);
	String pointer_index = $pointer.text.substring(3).replace("]", "");

	String offset_name = $offset.text.substring(0, 2);
	String offset_index = $offset.text.substring(3).replace("]", "");

	println(UseCommands.get_use_cmds(section, "PTR_VALUE") +
		"set"+pointer_name+offset_name+"("+pointer_index+","+offset_index+","+$val.str+");"
	);
}
:
	C_PTR_VALUE
	pointer = Ppointer
	offset = (
		Boffset
		| Ioffset
		| Roffset
		| Soffset
		| Spointer
		| Aoffset
	)
	( LBRACKET )*	// Any token followed by * can occur 0 or more times
	val = value
	( RBRACKET )*
;

/**
 * Аргументы команды POKE_FLD
 * Имя технологического параметра, имя фиктивной точки, $-указатель ($P, $G, $D, $W, $H или $O)
 * Строки
 */
poke_args returns [String str] @init { $str = ""; }
:
	PointName ( RecordField )?
	{
		$str = $PointName.text;
		// Добавим имя точки в глобальный список
		if(!PointNameList.contains($PointName.text.substring(1,$PointName.text.length()-1)))
			PointNameList.add($PointName.text.substring(1,$PointName.text.length()-1));
	}
	| Ppointer ( RecordField )? { $str = $Ppointer.text; } // Scratch pad pointer
	| Gpointer ( RecordField )? { $str = $Gpointer.text; } // Group pointer
	| Dpointer ( RecordField )? { $str = $Dpointer.text; } // Macro pointer
	| Wpointer ( RecordField )? { $str = $Wpointer.text; } // Window pointer
	| Hpointer ( RecordField )? { $str = $Hpointer.text; } // Highway pointer
	| Opointer ( RecordField )? { $str = $Opointer.text; } // Onscreen pointer

//	| Spointer // Entry field pointer

	| SetVariable { $str = $SetVariable.text; }

	| ConstVariable { $str = $ConstVariable.text; }

//	| IntegerLiteral нельзя применить - failed predicate для Control (23)
	| IntegerLiteral	{ $str = $IntegerLiteral.text; }

	| StringLiteral		{ $str = $StringLiteral.text; }
;

/** Команда POKE_FLD (активная прямоугольная область) */
/* Не реализовано 24.08.2019
		// Многозвенная видеограмма
		// Ladder diagram
		// POKE_FLD x y w h state   6   ladder_shape_num bit_num

		// Отображение окна и передача точек $W
		// Display window and pass $W points
		// POKE_FLD x y w h state   8   diag_num group_num pt_name1 pt_name2 ... pt_nameN

		// Команда операционной системы
		// Operating system command
		// POKE_FLD x y w h state   9   command_line

		// Справка (пока не реализована)
		// Help
		// POKE_FLD x y w h state   20  "file:keyname"
*/
cmdPOKE_FLD
locals [
	int i_poke_type = 0,
	int i_progs = 0,
	int i_args = 0,
]
@init {
	ST tmplt = new ST("Gpoke_fld_<type>(<x>,<y>,<w>,<h>,<state>,<variant>);");
	boolean first_progs = true;
	boolean first_args = true;
}
@after {
	println(UseCommands.get_use_cmds(section, "POKE_FLD") + tmplt.render());
}
:
	C_POKE_FLD
	x = literal_numbers		{ tmplt.add("x", macroPort.calcX($x.text)); }
	y = literal_numbers		{ tmplt.add("y", macroPort.calcY($y.text)); macroBBox.addPoint($x.text, $y.text); }
	w = literal_numbers		{ tmplt.add("w", macroPort.calcW($w.text)); }
	h = literal_numbers		{ tmplt.add("h", macroPort.calcH($h.text)); macroBBox.addRect($x.text, $y.text, $w.text, $h.text); }

	state = BlinkPattern	{ tmplt.add("state", $state.text); }

	// Общая стратегия приняти решения ANTLR состоит в том, чтобы найти все жизнеспособные альтернативы,
	// а затем игнорировать альтернативы, защищенные (ложными) предикатами

	poke_type = IntegerLiteral	{ $i_poke_type = $poke_type.int; }
	(
		// Точка процесса
		// Process point
		// POKE_FLD x y w h state   0   pt_name
		// Имя технологического параметра, имя фиктивной точки, $-указатель ($P, $G, $D, $W, $H или $O)
		(
			{ $i_poke_type == 0 }?
			pt_name = poke_args
			{ // Синтаксический анализатор не может выполнить действие, пока он не решил, какую альтернативу сосоставить 
				//System.out.println("Process point (0)");
				tmplt.add("type", "pp0");
				tmplt.add("variant", $pt_name.str);
			}
		)
	|
		// Видеограмма и группа
		// Diagram and group
		// POKE_FLD x y w h state   2   diag_num   group_num
		(
			{ $i_poke_type == 2 }?
			diag_num = IntegerLiteral
//										{ DiagNumList.add($diag_num.text); }
			group_num = IntegerLiteral
			{
				//System.out.println("Diagram and group (2)");
				tmplt.add("type", "dg2");
				tmplt.add("variant", $diag_num.text+","+$group_num.text);
			}
		)
	|
		// Выполнение одной прикладной программы (без возможности передачи программе аргументов)
		// Run 1 Application program (no arguments can be passed to it)
		// POKE_FLD x y w h state   3   prog_num
		(
			{ $i_poke_type == 3 }?
			prg_num = IntegerLiteral
			{
				//System.out.println("Run 1 Application program (3)");
				tmplt.add("type", "ap3");
				tmplt.add("variant", $prg_num.text);
			}
		)
	|
		// Выполнение одной или нескольких прикладных программ (с возможностью передачи аргументов)
		// Run 1 or more Application programs (arguments can be passed)
		// POKE_FLD x y w h state   7   num_of_progs prog_num1 diag_num1 num_of_args1 arg_list1 ...
		//                                           prog_numN diag_numN num_of_argsN arg_listN
		(
		/**************************************************/
			{ $i_poke_type == 7 }?
			{ tmplt.add("variant", "["); }											// Открывашка 1
			num_of_progs = IntegerLiteral	{ $i_progs = 0; first_progs = true; }
			(
				{ $i_progs <= $num_of_progs.int }?
				(
					prog_num    = IntegerLiteral
						{
							if (first_progs) {
								first_progs = false;
								tmplt.add("variant", "{\"prog\":" + $prog_num.text);		// Открывашка 2
							} else {
								tmplt.add("variant", ",{\"prog\":" + $prog_num.text);
							}
						}
					diag_num    = IntegerLiteral	{ tmplt.add("variant", ",\"diag\":" + $diag_num.text + ",\"arg\":["); }	// Открывашка 3
													{ DiagNumList.add($diag_num.text); }
					num_of_args = IntegerLiteral	{ $i_args = 0; first_args = true; }
					(
						{ $i_args < $num_of_args.int }?
							arg = poke_args
							{
								if (first_args) {
									first_args = false;
									tmplt.add("variant",       $arg.str);
								} else {
									tmplt.add("variant", "," + $arg.str);
								}
							}
						{ $i_args++; }
					)* // 0 or more times - важное отличие типа 7 от типа 23
//					)+ // 1 or more times - важное отличие типа 7 от типа 23
					{ tmplt.add("variant", "]"); }																			// Закрывашка 3
				)
				{ $i_progs++; tmplt.add("variant", "}"); }									// Закрывашка 2
			)* // 0 or more times - важное отличие типа 7 от типа 23
//			)+ // 1 or more times - важное отличие типа 7 от типа 23
			{
				tmplt.add("variant", "]");											// Закрывашка 1
				//System.out.println("Run Application programs (7)");
				tmplt.add("type", "ap7");
			}
		/**************************************************/
		)
	|
		// Управление
		// Control
		// POKE_FLD x y w h state   23  set_num set_val num_of_progs prog_num1 diag_num1 num_of_args1 arg_list1 ...
		//                                                           prog_numN diag_numN num_of_argsN arg_listN
		(
		/**************************************************/
			{ $i_poke_type == 23 }?
			//set_num = SetVariable			{ tmplt.add("variant",       $set_num.text); }
			set_num = poke_args				{ tmplt.add("variant",       $set_num.text); }
			set_val = IntegerLiteral		{ tmplt.add("variant", "," + $set_val.text + ",["); }	// Открывашка 1
			num_of_progs = IntegerLiteral	{ $i_progs = 0; first_progs = true; }
			(
				{ $i_progs <= $num_of_progs.int }?
				(
					prog_num    = IntegerLiteral
						{
							if (first_progs) {
								first_progs = false;
								tmplt.add("variant", "{\"prog\":" + $prog_num.text);					// Открывашка 2
							} else {
								tmplt.add("variant", ",{\"prog\":" + $prog_num.text);
							}
						}
					diag_num    = IntegerLiteral	{ tmplt.add("variant", ",\"diag\":" + $diag_num.text + ",\"arg\":["); }	// Открывашка 3
													{ DiagNumList.add($diag_num.text); }
					num_of_args = IntegerLiteral	{ $i_args = 0; first_args = true; }
					(
						{ $num_of_args.int != 0 }?			// бывает и 0 аргументов !!!
						{ $i_args < $num_of_args.int }?
							arg = poke_args
							{
								if (first_args) {
									first_args = false;
									tmplt.add("variant",       $arg.str);
								} else {
									tmplt.add("variant", "," + $arg.str);
								}
							}
						{ $i_args++; }
//					)+ // 1 or more times - важное отличие типа 23 от типа 7
					)* // 0 or more times - важное отличие типа 23 от типа 7
					{ tmplt.add("variant", "]"); }																			// Закрывашка 3
				)
				{ $i_progs++; tmplt.add("variant", "}"); }												// Закрывашка 2
			)+ // 1 or more times - важное отличие типа 23 от типа 7
//			)* // 0 or more times - важное отличие типа 23 от типа 7
			{
				tmplt.add("variant", "]");															// Закрывашка 1
				//System.out.println("Control (23)");
				tmplt.add("type", "ap23");
			}
		/**************************************************/
		)
	)
;

/** Команда POKE_STATE (делает поле ввода доступным или не доступным) */
cmdPOKE_STATE
@after {
	println(UseCommands.get_use_cmds(section, "POKE_STATE") + "Gpoke_state("+
		macroPort.calcX($x.text)+","+
		macroPort.calcY($y.text)+","+
		$state.text+");"
	);
}
:
	C_POKE_STATE
	x = literal_numbers
	y = literal_numbers		{ macroBBox.addPoint($x.text, $y.text); }
	state = BlinkPattern
;

/** Команда RUN_PROGRAMS (выполнение прикладной программы) */
cmdRUN_PROGRAMS
locals [
	int i_progs = 0,
	int i_args = 0,
]
@init {
	ST tmplt = new ST("Grun_programs(<variant>);");
	boolean first_progs = true;
	boolean first_args = true;
}
@after {
	println(UseCommands.get_use_cmds(section, "RUN_PROGRAMS") + tmplt.render());
}
:
	// RUN_PROGRAMS programs
	// prog_1 diag_1 #args_1 arg1 ... arguments_1
	// prog_2 diag_2 #args_2 arg2 ... arguments_2
	// .
	// prog_n diag_n #args_n argn ... arguments_n
	C_RUN_PROGRAMS
	{ tmplt.add("variant", "["); }											// Открывашка 1
	num_of_progs = IntegerLiteral	{ $i_progs = 0; first_progs = true; }
	(
		{ $i_progs <= $num_of_progs.int }?
		(
			prog_num    = IntegerLiteral
				{
					if (first_progs) {
						first_progs = false;
						tmplt.add("variant", "{\"prog\":" + $prog_num.text);		// Открывашка 2
					} else {
						tmplt.add("variant", ",{\"prog\":" + $prog_num.text);
					}
				}
			diag_num    = IntegerLiteral	{ tmplt.add("variant", ",\"diag\":" + $diag_num.text + ",\"arg\":["); }	// Открывашка 3
//											{ DiagNumList.add($diag_num.text); }
			num_of_args = IntegerLiteral	{ $i_args = 0; first_args = true; }
			(
				{ $i_args < $num_of_args.int }?
					arg = poke_args
					{
						if (first_args) {
							first_args = false;
							tmplt.add("variant",       $arg.str);
						} else {
							tmplt.add("variant", "," + $arg.str);
						}
					}
				{ $i_args++; }
			)*
			{ tmplt.add("variant", "]"); }																			// Закрывашка 3
		)
		{ $i_progs++; tmplt.add("variant", "}"); }									// Закрывашка 2
	)*
	{
		tmplt.add("variant", "]");											// Закрывашка 1
	}
;

/** Команда SETVAL (установка значений глобальных переменных уставок) */
cmdSETVAL
@init {
	ST tmplt = new ST("Gsetval(<set>,<value>);");
}
@after {
	println(UseCommands.get_use_cmds(section, "SETVAL") + tmplt.render());
}
:
	C_SETVAL
	literal_numbers	{ tmplt.add("set",   $literal_numbers.text); }
	literal_numbers	{ tmplt.add("value", $literal_numbers.text); }
;

/** Команда TIME (текущее время) */
cmdTIME
@init {
	ST tmplt = new ST("Gtime(<x>,<y>,<format>,<font_type_size>);");
}
@after {
	println(UseCommands.get_use_cmds(section, "TIME") + tmplt.render());
}
:
	C_TIME
	x = literal_numbers	{ tmplt.add("x", macroPort.calcX($x.text)); }
	y = literal_numbers	{ tmplt.add("y", macroPort.calcY($y.text));
						  macroBBox.addPoint($x.text, $y.text); }

	literal_numbers	{ tmplt.add("format",         $literal_numbers.text); }
	def_font_type	{ tmplt.add("font_type_size", $def_font_type.str);    }
;

/** Команда XY_PLOT (два технологических параметров в системе координат x, y во времени (график)) */
cmdXY_PLOT
@init {
	ST tmplt = new ST("Gxy_plot("+
		"<x>,<y>,<w>,<h>,"+
		"<x_pt_name_rec_fld>,<x_low>,<x_high>,"+
		"<y_pt_name_rec_fld>,<y_low>,<y_high>,"+
		"<scale_flag>,<update_rate>,"+
		"<shape_plot>,"+
		"<current_shape>,<shapew1>,<shapeh1>,<rot1>,<inv1>,"+
		"<history_shape>,<shapew2>,<shapeh2>,<rot2>,<inv2>,<n>);");
}
@after {
	println(UseCommands.get_use_cmds(section, "XY_PLOT") + tmplt.render());
}
:
	C_XY_PLOT
	x = literal_numbers	{ tmplt.add("x", macroPort.calcX($x.text)); }
	y = literal_numbers	{ tmplt.add("y", macroPort.calcY($y.text));
						  macroBBox.addPoint($x.text, $y.text); }

	w = literal_numbers	{ tmplt.add("w", macroPort.calcW($w.text)); }
	h = literal_numbers	{ tmplt.add("h", macroPort.calcH($h.text));
						  macroBBox.addRect($x.text, $y.text, $w.text, $h.text); }

	value			{ tmplt.add("x_pt_name_rec_fld", $value.str); }
	value			{ tmplt.add("x_low",             $value.str); }
	value			{ tmplt.add("x_high",            $value.str); }
	value			{ tmplt.add("y_pt_name_rec_fld", $value.str); }
	value			{ tmplt.add("y_low",             $value.str); }
	value			{ tmplt.add("y_high",            $value.str); }
	sclflg = ( SCALE | NOSCALE )
					{ tmplt.add("scale_flag",        $sclflg.text); }
	literal_numbers	{ tmplt.add("update_rate",       $literal_numbers.text); }
	(
		shape_plot = SHAPE_PLOT	{ tmplt.add("shape_plot",    $shape_plot.text); }
		Identifier				{ tmplt.add("current_shape", $Identifier.text); }
		literal_numbers			{ tmplt.add("shapew1",       $literal_numbers.text); }
		literal_numbers			{ tmplt.add("shapeh1",       $literal_numbers.text); }
		value					{ tmplt.add("rot1",          $value.str); }
		inv1 = ( NONE | TTB | RTL | BOTH )
								{ tmplt.add("inv1",          $inv1.text); }
		Identifier				{ tmplt.add("history_shape", $Identifier.text); }
		literal_numbers			{ tmplt.add("shapew2",       $literal_numbers.text); }
		literal_numbers			{ tmplt.add("shapeh2",       $literal_numbers.text); }
		value					{ tmplt.add("rot2",          $value.str); }
		inv2 = ( NONE | TTB | RTL | BOTH )
								{ tmplt.add("inv2",          $inv1.text); }
		literal_numbers			{ tmplt.add("n",             $literal_numbers.text); }
	)?
;

cmdTREND
@init {
	ST tmplt = new ST("Gtrend("+
		"<x>,<y>,<w>,<h>,<orientation>,<pt_name_rec_fld>,<low_limit>,<high_limit>,<value>,<interval>);");
}
@after {
	println(UseCommands.get_use_cmds(section, "TREND") + tmplt.render());
}
:
	C_TREND
	x = literal_numbers	{ tmplt.add("x", macroPort.calcX($x.text)); }
	y = literal_numbers	{ tmplt.add("y", macroPort.calcY($y.text));
						  macroBBox.addPoint($x.text, $y.text); }

	w = literal_numbers	{ tmplt.add("w", macroPort.calcW($w.text)); }
	h = literal_numbers	{ tmplt.add("h", macroPort.calcH($h.text));
						  macroBBox.addRect($x.text, $y.text, $w.text, $h.text); }

	ornt = ( HORZ | VERT ) { tmplt.add("orientation", $ornt.text); }

	value		{ tmplt.add("pt_name_rec_fld", $value.str); }

	value		{ tmplt.add("low_limit", $value.str); }
	value		{ tmplt.add("high_limit", $value.str); }
	value		{ tmplt.add("value", $value.str); }
	value		{ tmplt.add("interval", $value.str); }
	NOSCALE
;

/** Команда PTR_MOVE */
cmdPTR_MOVE 
:
	C_PTR_MOVE
	pointer_name = Ppointer
	(
		  ( OP_ADD operand1 = value )
		  |
		  ( OP_SUB operand1 = value )
		  |
		  ( OP_MULT operand1 = value operand2 = value operand3 = value )
	)
;

/** Команда POINTER (инициализация указателя адресом области памяти) */
cmdPOINTER
@after {
	String pointer_name = $ptr_name.text.substring(0, 2);
	String pointer_number = $ptr_name.text.substring(3).replace("]", "");
//	println("def"+pointer_name+"("+pointer_number+","+$segment.text+","+$offset.text+");");
//	println(" //POINTER "+$ptr_name.text+" "+$segment.text+" "+$offset.text);
}
:
	C_POINTER
	ptr_name = (
		Ppointer
		| Hpointer
	)
	segment = literal_numbers
	offset = literal_numbers
;

// [EOF] glParser.g4
