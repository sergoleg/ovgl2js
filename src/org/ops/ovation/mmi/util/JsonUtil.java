/*******************************************************************************
 * Copyright (c) 2017 EclipseSource.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package org.ops.ovation.mmi.util;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class JsonUtil {

	private JsonUtil() {
	}

	public static int getInt(JsonObject object, String field) {
		final JsonValue value = object.get(field);
		throwExceptionIfNull(value, field);
		return value.asInt();
	}

	public static int getInt(JsonObject object, String field, int defaultValue) {
		final JsonValue value = object.get(field);
		if (value == null) {
			return defaultValue;
		} else {
			return value.asInt();
		}
	}

	public static long getLong(JsonObject object, String field) {
		final JsonValue value = object.get(field);
		throwExceptionIfNull(value, field);
		return value.asLong();
	}

	public static long getLong(JsonObject object, String field, long defaultValue) {
		final JsonValue value = object.get(field);
		if (value == null) {
			return defaultValue;
		} else {
			return value.asLong();
		}
	}

	public static double getDouble(JsonObject object, String field) {
		final JsonValue value = object.get(field);
		throwExceptionIfNull(value, field);
		return value.asDouble();
	}

	public static double getDouble(JsonObject object, String field, double defaultValue) {
		final JsonValue value = object.get(field);
		if (value == null) {
			return defaultValue;
		} else {
			return value.asDouble();
		}
	}

	public static float getFloat(JsonObject object, String field) {
		final JsonValue value = object.get(field);
		throwExceptionIfNull(value, field);
		return value.asFloat();
	}

	public static float getFloat(JsonObject object, String field, float defaultValue) {
		final JsonValue value = object.get(field);
		if (value == null) {
			return defaultValue;
		} else {
			return value.asFloat();
		}
	}

	public static String getString(JsonObject object, String field) {
		final JsonValue value = object.get(field);
		throwExceptionIfNull(value, field);
		return value.asString();
	}

	public static String getString(JsonObject object, String field, String defaultValue) {
		final JsonValue value = object.get(field);
		if (value == null) {
			return defaultValue;
		} else {
			return value.asString();
		}
	}

	public static boolean getBoolean(JsonObject object, String field) {
		final JsonValue value = object.get(field);
		throwExceptionIfNull(value, field);
		return value.asBoolean();
	}

	public static boolean getBoolean(JsonObject object, String field, boolean defaultValue) {
		final JsonValue value = object.get(field);
		if (value == null) {
			return defaultValue;
		} else {
			return value.asBoolean();
		}
	}

	public static JsonArray getArray(JsonObject object, String field) {
		final JsonValue value = object.get(field);
		throwExceptionIfNull(value, field);
		return value.asArray();
	}

	public static JsonArray getArray(JsonObject object, String field, JsonArray defaultValue) {
		final JsonValue value = object.get(field);
		if (value == null) {
			return defaultValue;
		} else {
			return value.asArray();
		}
	}

	public static JsonObject getObject(JsonObject object, String field) {
		final JsonValue value = object.get(field);
		throwExceptionIfNull(value, field);
		return value.asObject();
	}

	public static JsonObject getObject(JsonObject object, String field, JsonObject defaultValue) {
		final JsonValue value = object.get(field);
		if (value == null) {
			return defaultValue;
		} else {
			return value.asObject();
		}
	}

	private static void throwExceptionIfNull(JsonValue value, String field) {
		if (value == null) {
			throw new IllegalArgumentException("No field found named : " + field);
		}

	}

}
