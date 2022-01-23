package org.ops.ovation.mmi.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.ops.ovation.mmi.util.JsonUtil;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

/** */
public class MacroBoundingBox {

	public static JsonValue  json_BBval;
	public static JsonObject json_BBobj;

	public static String  macro_name;	/* имя макроса */
	public static Integer x;			/* Координата x верхнего левого угла прямоугольника формы */
	public static Integer y;			/* Координата y верхнего левого угла прямоугольника формы */
	public static Integer h;			/* Высота прямоугольника формы */
	public static Integer w;			/* Ширина прямоугольника формы */

	/** */
	public MacroBoundingBox() {
	}

	/** */
	public MacroBoundingBox(String filename) {
		_set_json_file(filename);
	}

	/** */
	protected static String _readFile(String fileName, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(fileName));
		return new String(encoded, encoding);
	}

	/** */
	public static void _set_json_file(String filename) {
		String BB_file_name = filename;
		String BB_file = null;
		try {
			BB_file = _readFile(BB_file_name, Charset.defaultCharset());
			json_BBval = Json.parse(BB_file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** */
	public static void _set_macro_name(String macroName) {
		macro_name = macroName;
		JsonObject defaultObject = new JsonObject();
		json_BBobj = JsonUtil.getObject(json_BBval.asObject(), macro_name, defaultObject);
		_get_BB();
	}

	/** */
	public static void _get_BB() {
		x = JsonUtil.getInt(json_BBobj, "x", 0);
		y = JsonUtil.getInt(json_BBobj, "y", 0);
		w = JsonUtil.getInt(json_BBobj, "w", 0);
		h = JsonUtil.getInt(json_BBobj, "h", 0);
	}

	/** */
	public String toString() {
		String tmp = "";
		tmp = tmp.concat("{ ");
		tmp = tmp.concat(MacroBoundingBox.x + " ");
		tmp = tmp.concat(MacroBoundingBox.y + " ");
		tmp = tmp.concat(MacroBoundingBox.w + " ");
		tmp = tmp.concat(MacroBoundingBox.h + " ");
		tmp = tmp.concat(" }");
		return tmp;
	}
	/** */
	public static void main(String[] args) {
		MacroBoundingBox BBox = new MacroBoundingBox("u3s_macroBB.json");

		System.out.println("u3s_macroBB.json");
		System.out.println("13029");

		MacroBoundingBox._set_macro_name("13029");
		System.out.println(BBox.toString());
	}
}
