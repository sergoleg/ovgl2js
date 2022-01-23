//----------------------------------------------------------------------
// Copyright (C) 2019 Oleg Sergeev [sergoleg@gmail.com]
//----------------------------------------------------------------------

package org.ops.ovation.mmi.util;

import java.util.ArrayList;

/**
 * Ovation ® Graphics Language
 * <p>
 * Макросы используются для интегрирования отдельной видеограммы в главную.
 * Допускается вложение макросов в макросы.
 * <p>
 * Задача - описать цепочку вложенных систем координат видеограмм Ovation.
 * <p>
 * Задача - перейти от системы координат макроса к родительской системе
 * координата (видеограммы или макроса).
 */

public class MacroPort {

	/**
	 * Виртуальная координата x (0 ... 16383) для расположения верхнего левого угла
	 * макроса
	 */
	private double v_x;

	/**
	 * Виртуальная координата y (0 ... 16383) для расположения верхнего левого угла
	 * макроса
	 */
	private double v_y;

	/**
	 * Масштабный коэффициент ширины (положительное вещественное число)
	 */
	private double v_wscale;

	/**
	 * Масштабный коэффициент высоты (положительное вещественное число)
	 */
	private double v_hscale;

	/**
	 * Позиция x верхнего левого угла ограничивающего прямоугольника макроса в
	 * системе координат макроса
	 */
	private double b_xmin;

	/**
	 * Позиция y верхнего левого угла ограничивающего прямоугольника макроса в
	 * системе координат макроса
	 */
	private double b_ymin;

	private static int level = 0;

	// Создается новый список и указывается начальный размер внутреннего массива
	private	static ArrayList<MacroCoordinateSystem> arrayCS = new ArrayList<>(7);

	/** */
	public MacroPort() {
		this.v_x = 0.0;
		this.v_y = 0.0;
		this.v_wscale = 1.0;
		this.v_hscale = 1.0;
		this.b_xmin = 0.0;
		this.b_ymin = 0.0;
		MacroCoordinateSystem diag = new MacroCoordinateSystem();
		arrayCS.add(level, diag);	// Удаление элемента по индексу
	}

	/** */
	public static void set_m_flag(boolean flag) {
		if (flag)
			level += 1;
		else {
			level -= 1;
		}
	}

	/** */
	public boolean get_m_flag() {
		if (level != 0)
			return true;
		else
			return false;
	}

	/** */
	public void def_macro(double x, double y, double sсx, double sсy) {
		this.v_x = x;
		this.v_y = y;
		this.v_wscale = sсx;
		this.v_hscale = sсy;
	}

	/** */
	public void def_macro(Integer x, Integer y, double sсx, double sсy) {
		this.v_x = x;
		this.v_y = y;
		this.v_wscale = sсx;
		this.v_hscale = sсy;
	}

	/** */
	public void def_macro(String x, String y, String sсx, String sсy) {
		this.v_x = Double.parseDouble(x);
		this.v_y = Double.parseDouble(y);
		this.v_wscale = Double.parseDouble(sсx);
		this.v_hscale = Double.parseDouble(sсy);
	}

	/** */
	public void set_macro_bb(double x, double y, double w, double h) {
		this.b_xmin = x;
		this.b_ymin = y;
		MacroCoordinateSystem macro = new MacroCoordinateSystem(this.v_x, this.v_y, this.v_wscale, this.v_hscale, this.b_xmin, this.b_ymin);
		arrayCS.add(level, macro);	// Новый элемент добавляется в указанную позицию
	}

	/** */
	public void set_macro_bb(Integer x, Integer y, Integer w, Integer h) {
		this.b_xmin = x;
		this.b_ymin = y;
		MacroCoordinateSystem macro = new MacroCoordinateSystem(this.v_x, this.v_y, this.v_wscale, this.v_hscale, this.b_xmin, this.b_ymin);
		arrayCS.add(level, macro);	// Новый элемент добавляется в указанную позицию
	}

	/** */
	public void set_macro_bb(String x, String y, String w, String h) {
		this.b_xmin = Double.parseDouble(x);
		this.b_ymin = Double.parseDouble(y);
		MacroCoordinateSystem macro = new MacroCoordinateSystem(this.v_x, this.v_y, this.v_wscale, this.v_hscale, this.b_xmin, this.b_ymin);
		arrayCS.add(level, macro);	// Новый элемент добавляется в указанную позицию
	}

	/** */
	public void end_macro() {
		arrayCS.remove(level);		// Удаление элемента по индексу
	}

	/** */
	public boolean numeralOrNot(String str) {
		if (str == null || str.isEmpty())
			return false;

		int commaCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.')
				commaCount++;

			if ((!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.' && str.charAt(i) != '-') || commaCount > 1)
				return false;

		}
		return true;
	}

	/**
	 * Задача рассчитать координату в level = 0
	 */
	public String calcX(String _x) {
		if (_x == "null")		return _x;
		if (!numeralOrNot(_x))	return _x;

		int cur_level = level;

		double cur_x = Double.parseDouble(_x);

		while (cur_level >= 0) {
			MacroCoordinateSystem cur_Element = arrayCS.get(cur_level);
			cur_x = cur_Element.get_parent_X(cur_x);
			cur_level--;
		}

		int x = (int)Math.round(cur_x);

		return "" + x;
	}

	/** */
	public String calcY(String _y) {
		if (_y == "null")		return _y;
		if (!numeralOrNot(_y))	return _y;

		int cur_level = level;
		double cur_y = Double.parseDouble(_y);

		while (cur_level >= 0) {
			MacroCoordinateSystem cur_Element = arrayCS.get(cur_level);
			cur_y = cur_Element.get_parent_Y(cur_y);
			cur_level--;
		}

		int y = (int)Math.round(cur_y);

		return "" + y;
	}

	/** */
	public String calcW(String _width) {
		if (_width == "null")		return _width;
		if (!numeralOrNot(_width))	return _width;

		int cur_level = level;
		double cur_w = Double.parseDouble(_width);

		while (cur_level >= 0) {
			MacroCoordinateSystem cur_Element = arrayCS.get(cur_level);
			cur_w = cur_Element.get_parent_W(cur_w);
			cur_level--;
		}

		int w = (int)Math.round(cur_w);

		return "" + w;
	}

	/** */
	public String calcH(String _height) {
		if (_height == "null")		return _height;
		if (!numeralOrNot(_height))	return _height;

		int cur_level = level;
		double cur_h = Double.parseDouble(_height);

		while (cur_level >= 0) {
			MacroCoordinateSystem cur_Element = arrayCS.get(cur_level);
			cur_h = cur_Element.get_parent_H(cur_h);
			cur_level--;
		}

		int h = (int)Math.round(cur_h);

		return "" + h;
	}

	/** */
	public static void main(String[] args) {
		MacroPort macro_Port = new MacroPort();

		System.out.println("Level = " + level);
		System.out.println("");
		System.out.println("in  POLYGON 99 300 99 750 132 700 132 350 528 350 561 300 1 solid solid");
		System.out.println("out POLYGON " +
				macro_Port.calcX( "99") + " " + macro_Port.calcY("300") + " " +
				macro_Port.calcX( "99") + " " + macro_Port.calcY("750") + " " +
				macro_Port.calcX("132") + " " + macro_Port.calcY("700") + " " +
				macro_Port.calcX("132") + " " + macro_Port.calcY("350") + " " +
				macro_Port.calcX("528") + " " + macro_Port.calcY("350") + " " +
				macro_Port.calcX("561") + " " + macro_Port.calcY("300") + " " + "1 solid solid");

		macro_Port.set_m_flag(true);
		System.out.println("in  DEF_Macro 103 11683 1603 3.187224 2.118816 0 0 0 0 0 0 0 0");
		macro_Port.def_macro("11683", "1603", "3.187224", "2.118816");
		System.out.println("in  SET_MACRO_BB 103 99 300 462 450");
		macro_Port.set_macro_bb("99", "300", "462", "450");

		System.out.println("Level = " + level);
		System.out.println("");
		System.out.println("in  POLYGON 99 300 99 750 132 700 132 350 528 350 561 300 1 solid solid");
		System.out.println("out POLYGON " +
				macro_Port.calcX( "99") + " " + macro_Port.calcY("300") + " " +
				macro_Port.calcX( "99") + " " + macro_Port.calcY("750") + " " +
				macro_Port.calcX("132") + " " + macro_Port.calcY("700") + " " +
				macro_Port.calcX("132") + " " + macro_Port.calcY("350") + " " +
				macro_Port.calcX("528") + " " + macro_Port.calcY("350") + " " +
				macro_Port.calcX("561") + " " + macro_Port.calcY("300") + " " + "1 solid solid");
		System.out.println("in  END_MACRO I_FOREGROUND");
		macro_Port.end_macro();

//		macro_Port.set_m_flag(false);
//		System.out.println("Level = " + level);
//		System.out.println("X = " + macro_Port.calcX("20"));
//		System.out.println("Y = " + macro_Port.calcY("10"));
//		System.out.println("W = " + macro_Port.calcW("6"));
//		System.out.println("H = " + macro_Port.calcH("12"));

	} // main
}
