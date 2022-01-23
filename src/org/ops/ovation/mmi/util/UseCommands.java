//----------------------------------------------------------------------
// Copyright (C) 2019 Oleg Sergeev [sergoleg@gmail.com]
//----------------------------------------------------------------------

package org.ops.ovation.mmi.util;

import java.util.HashMap;

import org.ops.ovation.mmi.gl.glParser.Section;

/**
 * Ovation ® Graphics Language
 */

public class UseCommands {

	/** Разделы видеограммы */
	public enum Sctn {
		I_BACKGROUND,
		I_DIAGRAM,
		I_FOREGROUND,
		I_KEYBOARD,
		I_TRIGGER,
		I_SHAPELIB,
		I_CALL_MACRO,
		I_BODY_MACRO
	};
//	public static Sctn section = Sctn.I_DIAGRAM;

	/** Объявляем и инициализируем массив */
	public static boolean[] set_use_cmds_flags(
			boolean fBACKGROUND,
			boolean fDIAGRAM,
			boolean fFOREGROUND,
			boolean fKEYBOARD,
			boolean fTRIGGER)
	{
		boolean[] array = {
				fBACKGROUND,
				fDIAGRAM,
				fFOREGROUND,
				fKEYBOARD,
				fTRIGGER
				};
		return array;
	}

	public static HashMap<String, boolean[]> _Use_Cmds = new HashMap<String, boolean[]>() {
		/** */
		private static final long serialVersionUID = 3539160965633660871L;
		{
		//MAIN COMMANDS                                BACKGROUND
		//                                                    DIAGRAM
		//                                                           FOREGROUND
		//                                                                  KEYBOARD
		//                                                                         TRIGGER
		put("ARC",					set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("ARCPOLYGON",			set_use_cmds_flags( true, false,  true, false,  true));
		put("BAR",					set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("BMP_IMAGE",			set_use_cmds_flags( true, false,  true, false,  true));
		put("CIRCLE",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("COLOR",				set_use_cmds_flags( true, false,  true,  true,  true));	// +
		put("CURSOR",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("DATE",					set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("DEF_FKEY_GROUP",		set_use_cmds_flags(false,  true, false, false, false));	// +
		put("DEF_MACRO_PARAMS",		set_use_cmds_flags(false,  true, false, false, false));	// +
		put("DEF_QUAL",				set_use_cmds_flags(false,  true, false, false, false));	// +
		put("DIAG_DISP",			set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("DOT",					set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("DYNAMIC_LINE",			set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("DYNAMIC_POLYGON",		set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("EF_STATE",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("ELLIPSE",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("ELLIPSEPOLYGON",		set_use_cmds_flags( true, false,  true, false,  true));
		put("ENTRY_FLD",			set_use_cmds_flags(false, false, false,  true, false));	// +
		put("FKEY_STATE",			set_use_cmds_flags( true, false,  true, false,  true));
		put("FONT",					set_use_cmds_flags( true, false,  true,  true,  true));	// +
		put("FORCE_UPDATE",			set_use_cmds_flags(false, false,  true, false, false));	// +
		put("FUNC_KEY",				set_use_cmds_flags(false, false, false,  true, false));	// +
		put("GCODE",				set_use_cmds_flags( true, false,  true, false,  true));
		put("GTEXT",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("IF_CHANGED/ENDIF",		set_use_cmds_flags( true, false,  true, false,  true));
		put("IF/ENDIF",				set_use_cmds_flags( true, false,  true, false,  true));
		put("IFELSE/ELSE/ENDIF",	set_use_cmds_flags( true, false,  true, false,  true));
		put("LINE",					set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("LOAD_FKEY_GROUP",		set_use_cmds_flags( true, false,  true, false,  true));
		put("LOOP/ENDLOOP",			set_use_cmds_flags( true, false,  true, false,  true));
		put("MACRO",				set_use_cmds_flags( true,  true,  true,  true,  true));	// +
		put("MATH",					set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("MULTI_TEXT",			set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("OL_BUTTON",			set_use_cmds_flags(false, false, false,  true, false));	// +
		put("OL_CHECKBOX",			set_use_cmds_flags(false, false, false,  true, false));
		put("OL_CHOICE",			set_use_cmds_flags(false, false, false,  true, false));
		put("OL_CYLINDER",			set_use_cmds_flags( true, false,  true, false,  true));
		put("OL_EVENT_MENU",		set_use_cmds_flags(false, false, false,  true, false));
		put("OL_GAUGE",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("OL_SLIDER",			set_use_cmds_flags(false, false, false,  true, false));
		put("OL_RECTANGLE",			set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("OL_RECTPOLYGON",		set_use_cmds_flags( true, false,  true, false,  true));
		put("PAGE",					set_use_cmds_flags(false, false, false,  true, false));	// +
		put("PLOT",					set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("POINTER",				set_use_cmds_flags( true,  true,  true, false,  true));			// ??? !!!
		put("POKE_FLD",				set_use_cmds_flags(false, false, false,  true, false));	// +
		put("POKE_STATE",			set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("POLYGON",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("PROCESS_PT",			set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("PTR_EQUAL",			set_use_cmds_flags( true,  true,  true, false,  true));
		put("PTR_LOOP/P_ENDLP",		set_use_cmds_flags( true,  true,  true, false,  true));
		put("PTR_MOVE",				set_use_cmds_flags( true,  true,  true, false,  true));			// ??? !!!
		put("PTR_VALUE",			set_use_cmds_flags( true,  true,  true, false,  true));	// +
		put("RECTANGLE",			set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("RECTPOLYGON",			set_use_cmds_flags( true, false,  true, false,  true));
		put("RUN_PROGRAMS",			set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("SETVAL",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("SHAPE",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("TEXT",					set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("TIME",					set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("TREND",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("TRIG_ON",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		put("XY_PLOT",				set_use_cmds_flags( true, false,  true, false,  true));	// +
		}
	};

	/** Объявляем и инициализируем массив */
	public static String get_use_cmds(Sctn section, String cmd) {
		boolean[] array = _Use_Cmds.get(cmd);

		boolean flag = true;

		if (section == Sctn.I_BACKGROUND) flag = array[0];
		if (section == Sctn.I_DIAGRAM)    flag = array[1];
		if (section == Sctn.I_FOREGROUND) flag = array[2];
		if (section == Sctn.I_KEYBOARD)   flag = array[3];
		if (section == Sctn.I_TRIGGER)    flag = array[4];

//		if (flag)
			return "";
//		else
//			return "//";
	}

	/** Объявляем и инициализируем массив */
	public static String get_use_cmds(Section section, String cmd) {
		boolean[] array = _Use_Cmds.get(cmd);

		boolean flag = true;

		if (section == Section.I_BACKGROUND) flag = array[0];
		if (section == Section.I_DIAGRAM)    flag = array[1];
		if (section == Section.I_FOREGROUND) flag = array[2];
		if (section == Section.I_KEYBOARD)   flag = array[3];
		if (section == Section.I_TRIGGER)    flag = array[4];

//		if (flag)
			return "";
//		else
//			return "//";
	}

	/** */
	public static void main(String[] args) {
		System.out.println("Section = BACKGROUND, Command = XY_PLOT, return = " + UseCommands.get_use_cmds(Sctn.I_BACKGROUND, "XY_PLOT"));
		System.out.println("Section = DIAGRAM,    Command = XY_PLOT, return = " + UseCommands.get_use_cmds(Sctn.I_DIAGRAM, "XY_PLOT"));
		System.out.println("Section = FOREGROUND, Command = XY_PLOT, return = " + UseCommands.get_use_cmds(Sctn.I_FOREGROUND, "XY_PLOT"));
		System.out.println("Section = KEYBOARD,   Command = XY_PLOT, return = " + UseCommands.get_use_cmds(Sctn.I_KEYBOARD, "XY_PLOT"));
		System.out.println("Section = TRIGGER,    Command = XY_PLOT, return = " + UseCommands.get_use_cmds(Sctn.I_TRIGGER, "XY_PLOT"));
	}
}
