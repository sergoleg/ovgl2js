//----------------------------------------------------------------------
// Copyright (C) 2019 Oleg Sergeev [sergoleg@gmail.com]
//----------------------------------------------------------------------

package org.ops.ovation.mmi.util;

/**
 * Команда MACRO используется для интегрирования отдельной видеограммы в
 * главную. Допускается вложение макросов в макросы.
 * <p>
 * При переходе от системы координат макроса к родительской системе координат
 * учитываются:
 * <ul>
 * <li>Виртуальные координаты верхнего левого угла макроса (параметры v_x, v_y)
 * в родительской системе координат.</li>
 * <li>Масштабные коэффициенты ширины и высоты макроса в родительской системе
 * координат.
 * <li>Позиция верхнего левого угла ограничивающего прямоугольника макроса
 * (параметры b_xmin, b_ymin) в системе координат макроса.</li> 
 * </ul>
 * <p>
 * Задача - перейти от системы координат макроса к родительской системе
 * координата (видеограммы или макроса).
 * <p>
 * 
 * @author Oleg Sergeev
 */
public class MacroCoordinateSystem {

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

	// Матрица преобразования. Сначала это - единичная матрица
	private double[][] matrix = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

	/**
	 * Тождественная система координат - идентичная системе координат видеограммы
	 */
	public MacroCoordinateSystem() {
		this.v_x = 0.0;
		this.v_y = 0.0;
		this.v_wscale = 1.0;
		this.v_hscale = 1.0;
		this.b_xmin = 0.0;
		this.b_ymin = 0.0;

		translate(-this.b_xmin, -this.b_ymin);
		scale(this.v_wscale, this.v_hscale);
		translate(this.v_x, this.v_y);
	}

	/**
	 * Тождественная система координат - идентичная системе координат видеограммы
	 */
	public MacroCoordinateSystem(
			double v_x,      double v_y,
			double v_wscale, double v_hscale,
			double b_xmin,   double b_ymin) {
		this.v_x = v_x;
		this.v_y = v_y;
		this.v_wscale = v_wscale;
		this.v_hscale = v_hscale;
		this.b_xmin = b_xmin;
		this.b_ymin = b_ymin;

		translate(-this.b_xmin, -this.b_ymin);
		scale(this.v_wscale, this.v_hscale);
		translate(this.v_x, this.v_y);
	}

	/**
	 * Перейти от дочерней к родительской системе координат для оси X
	 * 
	 * <pre>
	 * | scx shx  tx | = | m00 m01 m02 |
	 * | shy scy  ty | = | m10 m11 m12 |
	 * |   0   0   1 | = |   0   0   1 |
	 * </pre>
	 * 
	 * @param child_X - Значение координаты X в дочерней системе координат
	 * @return Значение координаты X в родительской системе координат
	 */
	public double get_parent_X(double child_X) {
		double mx = child_X;
		double my = 0;
		double xs;
		xs = (double) (mx * matrix[0][0] + my * matrix[0][1] + matrix[0][2]);
		return xs;
	}

	/**
	 * Перейти от дочерней к родительской системе координат для оси Y
	 * 
	 * @param child_Y - Значение координаты Y в дочерней системе координат
	 * @return Значение координаты Y в родительской системе координат
	 */
	public double get_parent_Y(double child_Y) {
		double mx = 0;
		double my = child_Y;
		double ys;
		ys = (double) (mx * matrix[1][0] + my * matrix[1][1] + matrix[1][2]);
		return ys;
	}

	/** */
	public double get_parent_W(double child_W) {
		double ws;
		ws = (double) (child_W * this.v_wscale);
		return ws;
	}

	/** */
	public double get_parent_H(double child_H) {
		double ws;
		ws = (double) (child_H * this.v_hscale);
		return ws;
	}

	/**
	 * Преобразование "Перенос"
	 * 
	 * @param dx смещение по x
	 * @param dy смещение по y
	 */
	public void translate(double dx, double dy) {
		// Матрица переноса
		double[][] t = { { 1, 0, dx }, { 0, 1, dy }, { 0, 0, 1 } };
		// Перемножаем матрицы. Результат записываем в исходную matrix
		matrix = multMatrixes(t, matrix);
	}

	/**
	 * Преобразование "Масштабирование"
	 * 
	 * @param sx коэффициент растяжения по оси X
	 * @param sy коэффициент растяжения по оси Y
	 */
	public void scale(double sx, double sy) {
		// Матрица масштабирования
		double[][] s = { { sx, 0, 0 }, { 0, sy, 0 }, { 0, 0, 1 } };

		// Перемножаем матрицы. Результат записываем в исходную matrix
		matrix = multMatrixes(s, matrix);
	}

	/**
	 * Преобразование "Поворот" вокруг начала координат
	 * 
	 * @param alpha угол поворота в градусах
	 */
	public void rotate(double alpha) {
		// переводим угол в радианы
		alpha = Math.toRadians(alpha);
		// Матрица поворота
		double[][] r = { { Math.cos(alpha), -Math.sin(alpha), 0 }, { Math.sin(alpha), Math.cos(alpha), 0 },
				{ 0, 0, 1 } };
		// Перемножаем матрицы. Результат записываем в исходную matrix
		matrix = multMatrixes(r, matrix);
	}

	/**
	 * Преобразование "Поворот" вокруг произвольной точки x0, y0
	 * 
	 * @param alpha угол поворота в градусах
	 * @param x0    x-координата центра поворота
	 * @param y0    y-координата центра поворота
	 */
	public void rotate(double alpha, double x0, double y0) {
		// переводим угол в радианы
		alpha = Math.toRadians(alpha);
		// Матрица поворота
//		double[][] r = {
//				{ Math.cos(alpha), -Math.sin(alpha), 0 },
//				{ Math.sin(alpha),  Math.cos(alpha), 0 },
//				{               0,                0, 1 }
//		};
		// три последовательных преобразования
		translate(-x0, -y0);
		rotate(alpha);
		translate(x0, y0);
	}

	/**
	 * Умножение матриц a * b по правилу "строка на столбец"
	 * 
	 * @param a первая матрица
	 * @param b вторая матрица
	 * @return результат умножения матриц
	 */
	private double[][] multMatrixes(double[][] a, double[][] b) {
		double[][] result = new double[a.length][b.length];
		// цикл по строкам матрицы-результата
		for (int i = 0; i < result.length; i++) {
			// цикл по элементам строк матрицы результата
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = 0;
				for (int k = 0; k < b.length; k++) {
					result[i][j] += a[i][k] * b[k][j];
					// это краткая запись такого:
					// result[i][k] = result[i][k] + a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

	/** */
	public static void main(String[] args) {

		System.out.println("CoordinateSystem v_x = 0.0, v_y = 0.0, v_wscale = 1.0, v_hscale = 1.0, b_xmin = 0.0, b_ymin = 0.0");
		MacroCoordinateSystem diag = new MacroCoordinateSystem();
		System.out.println("X =  99 = " + diag.get_parent_X(99.0));
		System.out.println("Y = 300 = " + diag.get_parent_Y(300.0));

		double v_x = 11683.0;
		double v_y = 1603.0;
		double v_wscale = 3.187224;
		double v_hscale = 2.118816;
		double b_xmin = 99.0;
		double b_ymin = 300.0;

		System.out.println("CoordinateSystem v_x = " + v_x + 
				", v_y = " + v_y +
				", v_wscale = " + v_wscale +
				", v_hscale = " + v_hscale +
				", b_xmin = " + b_xmin +
				", b_ymin = " + b_ymin);

		MacroCoordinateSystem macro = new MacroCoordinateSystem(v_x, v_y, v_wscale, v_hscale, b_xmin, b_ymin);
		System.out.println("X =  99 = " + macro.get_parent_X(99.0));
		System.out.println("Y = 300 = " + macro.get_parent_Y(300.0));

//		System.out.println("macro W = " + macro.get_parent_W(5.0));
//		System.out.println("macro H = " + macro.get_parent_H(7.0));
	}
}
