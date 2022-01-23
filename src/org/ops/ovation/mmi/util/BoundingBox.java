//----------------------------------------------------------------------
// Copyright (C) 2019 Oleg Sergeev [sergoleg@gmail.com]
//----------------------------------------------------------------------

package org.ops.ovation.mmi.util;

/**
 * Ovation ® Graphics Language
 * 
 * Задача - создать ограничивающий прямоугольник вокруг макроса.
 * 
 * Bounding Box (BBox, ограничивающий параллелепипед) — это некая простая фигура
 * (обычно, параллелепипед), ограничивающая форму более сложной геометрической модели.
 * 
 * Bounding Box играет роль габаритного контейнера для такой модели.
 * 
 * Как упрощённая аппроксимация сложной фигуры, Bounding Box контейнер используются
 * для быстрого и простого определения расположения объекта в пространстве.
 */

public class BoundingBox {

	private double xmin = Double.POSITIVE_INFINITY;
	private double xmax = Double.NEGATIVE_INFINITY;
	private double ymin = Double.POSITIVE_INFINITY;
	private double ymax = Double.NEGATIVE_INFINITY;

	/** */
	public BoundingBox() {
		xmin = 16383;
		xmax = 0;
		ymin = 16383;
		ymax = 0;
	}

	/** */
	public BoundingBox(double a_x, double a_y, double b_x, double b_y) {
		xmin = Math.min(a_x, b_x);
		xmax = Math.max(a_x, b_x);
		ymin = Math.min(a_y, b_y);
		ymax = Math.max(a_y, b_y);
	}

	/** */
	public void start() {
		xmin = 16383;
		xmax = 0;
		ymin = 16383;
		ymax = 0;
	}

	/**
	 * Convert String to Double.
	 *
	 * @param string String to be converted.
	 * @return Converted Double.
	 */
	private static Double convertStringToDouble(String string) {
		try {
			return Double.parseDouble(string);
		} catch (NumberFormatException exception) {
			// Output expected NumberFormatException.
		} catch (Exception exception) {
			// Output unexpected Exceptions.
		}
		return null;
	}

	/** */
	public void addPoint(double x, double y) {
		xmin = Math.min(xmin, x);
		xmax = Math.max(xmax, x);
		ymin = Math.min(ymin, y);
		ymax = Math.max(ymax, y);
	}

	/** */
	public void addPoint(String x, String y) {
		if (null == convertStringToDouble(x)) return;
		if (null == convertStringToDouble(y)) return;

		xmin = Math.min(xmin, Double.parseDouble(x));
		xmax = Math.max(xmax, Double.parseDouble(x));
		ymin = Math.min(ymin, Double.parseDouble(y));
		ymax = Math.max(ymax, Double.parseDouble(y));
	}

	/** */
	public void addRect(String x, String y, String w, String h) {
		if (null == convertStringToDouble(x)) return;
		if (null == convertStringToDouble(y)) return;
		if (null == convertStringToDouble(w)) return;
		if (null == convertStringToDouble(h)) return;

		xmin = Math.min(xmin, Double.parseDouble(x));						// left
		xmax = Math.max(xmax, Double.parseDouble(x)+Double.parseDouble(w));	// right
		ymin = Math.min(ymin, Double.parseDouble(y));						// top
		ymax = Math.max(ymax, Double.parseDouble(y)+Double.parseDouble(h));	// bottom
	}

	/** */
	public void addCircle(String center_x, String center_y, String radius) {
		if (null == convertStringToDouble(center_x)) return;
		if (null == convertStringToDouble(center_y)) return;
		if (null == convertStringToDouble(radius)) return;

		// Вычисление виртуального радиуса
		double rx = Double.parseDouble(radius);	// virtual x radius
		double w = 1120;						// drawing area width = diagram width
		double h =  800;						// drawing area height = diagram height 
		double ry = rx * (w/h);					// virtual y radius

		xmin = Math.min(xmin, Double.parseDouble(center_x)-rx);
		xmax = Math.max(xmax, Double.parseDouble(center_x)+rx);
		ymin = Math.min(ymin, Double.parseDouble(center_y)-ry);
		ymax = Math.max(ymax, Double.parseDouble(center_y)+ry);
	}

	/** */
	public void addEllipse(String x, String y, String hr, String vr) {
		if (null == convertStringToDouble(x)) return;
		if (null == convertStringToDouble(y)) return;
		if (null == convertStringToDouble(hr)) return;
		if (null == convertStringToDouble(vr)) return;

		xmin = Math.min(xmin, Double.parseDouble(x)-Double.parseDouble(hr));
		xmax = Math.max(xmax, Double.parseDouble(x)+Double.parseDouble(hr));
		ymin = Math.min(ymin, Double.parseDouble(y)-Double.parseDouble(vr));
		ymax = Math.max(ymax, Double.parseDouble(y)+Double.parseDouble(vr));
	}

	/** */
	public void addArc(String sa_x, String sa_y, String sa_w, String sa_h, String sa_angle1, String sa_angle2) {
		if (null == convertStringToDouble(sa_x)) return;
		if (null == convertStringToDouble(sa_y)) return;
		if (null == convertStringToDouble(sa_w)) return;
		if (null == convertStringToDouble(sa_h)) return;
		if (null == convertStringToDouble(sa_angle1)) return;
		if (null == convertStringToDouble(sa_angle2)) return;

		double a_x      = Double.parseDouble(sa_x);
		double a_y      = Double.parseDouble(sa_y);
		double a_w      = Double.parseDouble(sa_w);
		double a_h      = Double.parseDouble(sa_h);
		double a_angle1 = Double.parseDouble(sa_angle1);
		double a_angle2 = Double.parseDouble(sa_angle2);

//		a_angle2 = Integer.parseInt($aaangle2.text);
		double	x = a_x+(a_w/2),
				y = a_y+(a_h/2),
				startAngle = a_angle1,
				arc = a_angle2,
				radius = a_w/2,
				yRadius = a_h/2;
		double segAngle, theta, angle, angleMid, segs, ax, ay, bx, by, cx, cy;
		if (Math.abs(arc)>360) { arc = 360; }
		segs = Math.ceil(Math.abs(arc)/6);
		segAngle = arc/segs;
		theta = -(segAngle/180)*Math.PI;
		angle = -(startAngle/180)*Math.PI;
		if (segs>0) {
			ax = x+Math.cos(startAngle/180*Math.PI)*radius;
			ay = y+Math.sin(-startAngle/180*Math.PI)*yRadius;
//			sb.append("M "+Math.round(ax)+" "+Math.round(ay));
			/*macroBBox.*/addPoint(Math.round(ax), Math.round(ay));
			for (int i = 0; i<segs; i++) {
				angle += theta;
				angleMid = angle-(theta/2);
				bx = x+Math.cos(angle)*radius;
				by = y+Math.sin(angle)*yRadius;
				cx = x+Math.cos(angleMid)*(radius/Math.cos(theta/2));
				cy = y+Math.sin(angleMid)*(yRadius/Math.cos(theta/2));
//				sb.append(" Q "+Math.round(cx)+" "+Math.round(cy)+" "+Math.round(bx)+" "+Math.round(by));
				/*macroBBox.*/addPoint(Math.round(cx), Math.round(cy));
				/*macroBBox.*/addPoint(Math.round(bx), Math.round(by));
			}
		}
	}

	/** */
	public void addBar(
			String x,							// Исходная координата прямоугольника
			String y,							// Исходная координата прямоугольника
			String w,							// Ширина прямоугольника - размер прямоугольника в направлении, перпендикулярном направлению заполнения
			String h,							// Высота прямоугольника - максимально допустимый размер прямоугольника в направлении его заполнения
			String direction) {
		if (null == convertStringToDouble(x)) return;
		if (null == convertStringToDouble(y)) return;
		if (null == convertStringToDouble(w)) return;
		if (null == convertStringToDouble(h)) return;

		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;

		// Исходной точкой может являться:
		//    - Нижний левый угол прямоугольника (с заполнением up).
		//    - Верхний левый угол прямоугольника (с заполнением down или right или bias).
		//    - Верхний правый угол прямоугольника (с заполнением left).
		switch (direction) {
		case "UP":		// снизу вверх
			x1 = Double.parseDouble(x);
			y2 = Double.parseDouble(y);
			y1 = y2 - Double.parseDouble(h);
			x2 = x1 + Double.parseDouble(w);
			break;
		case "BIAS":	// вверх или вниз от позиции с нулевым значением
		case "DOWN":	// сверху вниз
			x1 = Double.parseDouble(x);
			y1 = Double.parseDouble(y);
			x2 = x1 + Double.parseDouble(w);
			y2 = y1 + Double.parseDouble(h);
			break;
		case "RIGHT":	// слева направо
			x1 = Double.parseDouble(x);
			y1 = Double.parseDouble(y);
			x2 = x1 + Double.parseDouble(h);
			y2 = y1 + Double.parseDouble(w);
			break;
		case "LEFT":	// справа налево
			x2 = Double.parseDouble(x);
			y1 = Double.parseDouble(y);
			x1 = x2 - Double.parseDouble(h);
			y2 = y1 + Double.parseDouble(w);
			break;
		}

		xmin = Math.min(xmin, x1);
		xmax = Math.max(xmax, x2);
		ymin = Math.min(ymin, y1);
		ymax = Math.max(ymax, y2);
	}

	/** */
	public void addShape(String x, String y, String w, String h) {
		if (null == convertStringToDouble(x)) return;
		if (null == convertStringToDouble(y)) return;
		if (null == convertStringToDouble(w)) return;
		if (null == convertStringToDouble(h)) return;

		xmin = Math.min(xmin, Double.parseDouble(x));
		xmax = Math.max(xmax, Double.parseDouble(x)+Double.parseDouble(w));
		ymin = Math.min(ymin, Double.parseDouble(y));
		ymax = Math.max(ymax, Double.parseDouble(y)+Double.parseDouble(h));
	}

	/** */
	public void addMultiText(String x, String y) {
		if (null == convertStringToDouble(x)) return;
		if (null == convertStringToDouble(y)) return;

		xmin = Math.min(xmin, Double.parseDouble(x));
		xmax = Math.max(xmax, Double.parseDouble(x)+66);
		ymin = Math.min(ymin, Double.parseDouble(y));
		ymax = Math.max(ymax, Double.parseDouble(y)+120);
	}

	/** */
	public void addText(String x, String y) {
		if (null == convertStringToDouble(x)) return;
		if (null == convertStringToDouble(y)) return;

		xmin = Math.min(xmin, Double.parseDouble(x));
		xmax = Math.max(xmax, Double.parseDouble(x)+66);
		ymin = Math.min(ymin, Double.parseDouble(y));
		ymax = Math.max(ymax, Double.parseDouble(y)+120);
	}

	/** */
	public void addGtext(String x, String y) {
		if (null == convertStringToDouble(x)) return;
		if (null == convertStringToDouble(y)) return;

		xmin = Math.min(xmin, Double.parseDouble(x));
		xmax = Math.max(xmax, Double.parseDouble(x)+66);
		ymin = Math.min(ymin, Double.parseDouble(y));
		ymax = Math.max(ymax, Double.parseDouble(y)+120);
	}

	/** */
	public void addDOT(String x, String y, String size) {
		if (null == convertStringToDouble(x)) return;
		if (null == convertStringToDouble(y)) return;
//		if (null == convertStringToDouble(w)) return;
//		if (null == convertStringToDouble(h)) return;

		xmin = Math.min(xmin, Double.parseDouble(x));
//		xmax = Math.max(xmax, Double.parseDouble(x)+Double.parseDouble(w));
		ymin = Math.min(ymin, Double.parseDouble(y));
//		ymax = Math.max(ymax, Double.parseDouble(y)+Double.parseDouble(h));
	}

	/** */
	public int get_xmin()   { return (int)xmin; }
	public int get_xmax()   { return (int)xmax; }
	public int get_ymin()   { return (int)ymin; }
	public int get_ymax()   { return (int)ymax; }
	public int get_height() { return (int)(ymax - ymin); }
	public int get_width()  { return (int)(xmax - xmin); }

	/** */
	public double height() { return ymax - ymin; }

	/** */
	public double width() { return xmax - xmin; }

	/**
	 * 	Gmacro(14900,14092,7109,0.935897,0.975754,
	 *		{ x: 234, y: 421, x2: 702, y2: 889, width: 468, height: 468 } );
	 * (int)Math.round(3.8)
	 */
	public String toString() {
		return "{ " +
				"\"x\": "  + (int)Math.round(xmin)        + ", " +
				"\"y\": "  + (int)Math.round(ymin)        + ", " +
				"\"x2\": " + (int)Math.round(xmax)        + ", " +
				"\"y2\": " + (int)Math.round(ymax)        + ", " +
				"\"w\": "  + (int)Math.round(xmax - xmin) + ", " +
				"\"h\": "  + (int)Math.round(ymax - ymin) +
				" },";
	}

	/** */
	public String toTransform() {
		int tx = (int) - xmin;
		int ty = (int) - ymin;
		return "macro_set.transform(\"" + "...T" + tx + "," + ty + "\");";
	}

	/** */
	public static void main(String[] args) {
		BoundingBox rect = new BoundingBox();
		System.out.println(rect);

//		rect.addPoint(400, 400);
//		rect.addPoint(300, 300);
//		rect.addPoint(200, 200);
//		rect.addPoint(100, 100);

//		rect.addPoint("75.0", "75.0");
//		rect.addPoint("55.0", "55.0");
//		rect.addPoint("44.0", "444.0");

//		rect.addRect("3090", "99", "370", "467");

		// ARC 3267 2938 2185 3059 26 128 1 solid outline
		rect.addArc("3267", "2938", "2185", "3059", "26", "128");

		System.out.println(rect);
	}
}
