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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link glParser}.
 */
public interface glParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link glParser#gl_start_rule}.
	 * @param ctx the parse tree
	 */
	void enterGl_start_rule(glParser.Gl_start_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#gl_start_rule}.
	 * @param ctx the parse tree
	 */
	void exitGl_start_rule(glParser.Gl_start_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(glParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(glParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(glParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(glParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(glParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(glParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdFONT}.
	 * @param ctx the parse tree
	 */
	void enterCmdFONT(glParser.CmdFONTContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdFONT}.
	 * @param ctx the parse tree
	 */
	void exitCmdFONT(glParser.CmdFONTContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdGCODE}.
	 * @param ctx the parse tree
	 */
	void enterCmdGCODE(glParser.CmdGCODEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdGCODE}.
	 * @param ctx the parse tree
	 */
	void exitCmdGCODE(glParser.CmdGCODEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdSHAPELIB}.
	 * @param ctx the parse tree
	 */
	void enterCmdSHAPELIB(glParser.CmdSHAPELIBContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdSHAPELIB}.
	 * @param ctx the parse tree
	 */
	void exitCmdSHAPELIB(glParser.CmdSHAPELIBContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDEF_SHAPE}.
	 * @param ctx the parse tree
	 */
	void enterCmdDEF_SHAPE(glParser.CmdDEF_SHAPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDEF_SHAPE}.
	 * @param ctx the parse tree
	 */
	void exitCmdDEF_SHAPE(glParser.CmdDEF_SHAPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdEND_SHAPE}.
	 * @param ctx the parse tree
	 */
	void enterCmdEND_SHAPE(glParser.CmdEND_SHAPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdEND_SHAPE}.
	 * @param ctx the parse tree
	 */
	void exitCmdEND_SHAPE(glParser.CmdEND_SHAPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDIAGRAM}.
	 * @param ctx the parse tree
	 */
	void enterCmdDIAGRAM(glParser.CmdDIAGRAMContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDIAGRAM}.
	 * @param ctx the parse tree
	 */
	void exitCmdDIAGRAM(glParser.CmdDIAGRAMContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdKEYBOARD}.
	 * @param ctx the parse tree
	 */
	void enterCmdKEYBOARD(glParser.CmdKEYBOARDContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdKEYBOARD}.
	 * @param ctx the parse tree
	 */
	void exitCmdKEYBOARD(glParser.CmdKEYBOARDContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdBACKGROUND}.
	 * @param ctx the parse tree
	 */
	void enterCmdBACKGROUND(glParser.CmdBACKGROUNDContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdBACKGROUND}.
	 * @param ctx the parse tree
	 */
	void exitCmdBACKGROUND(glParser.CmdBACKGROUNDContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdFOREGROUND}.
	 * @param ctx the parse tree
	 */
	void enterCmdFOREGROUND(glParser.CmdFOREGROUNDContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdFOREGROUND}.
	 * @param ctx the parse tree
	 */
	void exitCmdFOREGROUND(glParser.CmdFOREGROUNDContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdTRIGGER}.
	 * @param ctx the parse tree
	 */
	void enterCmdTRIGGER(glParser.CmdTRIGGERContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdTRIGGER}.
	 * @param ctx the parse tree
	 */
	void exitCmdTRIGGER(glParser.CmdTRIGGERContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdEXIT}.
	 * @param ctx the parse tree
	 */
	void enterCmdEXIT(glParser.CmdEXITContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdEXIT}.
	 * @param ctx the parse tree
	 */
	void exitCmdEXIT(glParser.CmdEXITContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#def_conditional_value}.
	 * @param ctx the parse tree
	 */
	void enterDef_conditional_value(glParser.Def_conditional_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#def_conditional_value}.
	 * @param ctx the parse tree
	 */
	void exitDef_conditional_value(glParser.Def_conditional_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(glParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(glParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(glParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(glParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#compoundExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompoundExpression(glParser.CompoundExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#compoundExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompoundExpression(glParser.CompoundExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(glParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(glParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#qualityExpression}.
	 * @param ctx the parse tree
	 */
	void enterQualityExpression(glParser.QualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#qualityExpression}.
	 * @param ctx the parse tree
	 */
	void exitQualityExpression(glParser.QualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#setExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetExpression(glParser.SetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#setExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetExpression(glParser.SetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(glParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(glParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expr(glParser.Primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expr(glParser.Primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#conditional_value}.
	 * @param ctx the parse tree
	 */
	void enterConditional_value(glParser.Conditional_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#conditional_value}.
	 * @param ctx the parse tree
	 */
	void exitConditional_value(glParser.Conditional_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#pt_name_pat}.
	 * @param ctx the parse tree
	 */
	void enterPt_name_pat(glParser.Pt_name_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#pt_name_pat}.
	 * @param ctx the parse tree
	 */
	void exitPt_name_pat(glParser.Pt_name_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#pointer_pat}.
	 * @param ctx the parse tree
	 */
	void enterPointer_pat(glParser.Pointer_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#pointer_pat}.
	 * @param ctx the parse tree
	 */
	void exitPointer_pat(glParser.Pointer_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#rec_fld_pat}.
	 * @param ctx the parse tree
	 */
	void enterRec_fld_pat(glParser.Rec_fld_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#rec_fld_pat}.
	 * @param ctx the parse tree
	 */
	void exitRec_fld_pat(glParser.Rec_fld_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#offset_pat}.
	 * @param ctx the parse tree
	 */
	void enterOffset_pat(glParser.Offset_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#offset_pat}.
	 * @param ctx the parse tree
	 */
	void exitOffset_pat(glParser.Offset_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(glParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(glParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#prog_args_pat}.
	 * @param ctx the parse tree
	 */
	void enterProg_args_pat(glParser.Prog_args_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#prog_args_pat}.
	 * @param ctx the parse tree
	 */
	void exitProg_args_pat(glParser.Prog_args_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#coordinate_pairs}.
	 * @param ctx the parse tree
	 */
	void enterCoordinate_pairs(glParser.Coordinate_pairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#coordinate_pairs}.
	 * @param ctx the parse tree
	 */
	void exitCoordinate_pairs(glParser.Coordinate_pairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#literal_numbers}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_numbers(glParser.Literal_numbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#literal_numbers}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_numbers(glParser.Literal_numbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdARC}.
	 * @param ctx the parse tree
	 */
	void enterCmdARC(glParser.CmdARCContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdARC}.
	 * @param ctx the parse tree
	 */
	void exitCmdARC(glParser.CmdARCContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdCIRCLE}.
	 * @param ctx the parse tree
	 */
	void enterCmdCIRCLE(glParser.CmdCIRCLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdCIRCLE}.
	 * @param ctx the parse tree
	 */
	void exitCmdCIRCLE(glParser.CmdCIRCLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdCOLOR}.
	 * @param ctx the parse tree
	 */
	void enterCmdCOLOR(glParser.CmdCOLORContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdCOLOR}.
	 * @param ctx the parse tree
	 */
	void exitCmdCOLOR(glParser.CmdCOLORContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdBLINK}.
	 * @param ctx the parse tree
	 */
	void enterCmdBLINK(glParser.CmdBLINKContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdBLINK}.
	 * @param ctx the parse tree
	 */
	void exitCmdBLINK(glParser.CmdBLINKContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDYNAMIC_LINE}.
	 * @param ctx the parse tree
	 */
	void enterCmdDYNAMIC_LINE(glParser.CmdDYNAMIC_LINEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDYNAMIC_LINE}.
	 * @param ctx the parse tree
	 */
	void exitCmdDYNAMIC_LINE(glParser.CmdDYNAMIC_LINEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDYNAMIC_POLYGON}.
	 * @param ctx the parse tree
	 */
	void enterCmdDYNAMIC_POLYGON(glParser.CmdDYNAMIC_POLYGONContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDYNAMIC_POLYGON}.
	 * @param ctx the parse tree
	 */
	void exitCmdDYNAMIC_POLYGON(glParser.CmdDYNAMIC_POLYGONContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdELLIPSE}.
	 * @param ctx the parse tree
	 */
	void enterCmdELLIPSE(glParser.CmdELLIPSEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdELLIPSE}.
	 * @param ctx the parse tree
	 */
	void exitCmdELLIPSE(glParser.CmdELLIPSEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdLINE}.
	 * @param ctx the parse tree
	 */
	void enterCmdLINE(glParser.CmdLINEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdLINE}.
	 * @param ctx the parse tree
	 */
	void exitCmdLINE(glParser.CmdLINEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdMULTI_TEXT}.
	 * @param ctx the parse tree
	 */
	void enterCmdMULTI_TEXT(glParser.CmdMULTI_TEXTContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdMULTI_TEXT}.
	 * @param ctx the parse tree
	 */
	void exitCmdMULTI_TEXT(glParser.CmdMULTI_TEXTContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#multi_text_strings}.
	 * @param ctx the parse tree
	 */
	void enterMulti_text_strings(glParser.Multi_text_stringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#multi_text_strings}.
	 * @param ctx the parse tree
	 */
	void exitMulti_text_strings(glParser.Multi_text_stringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#multi_text_strings_cond}.
	 * @param ctx the parse tree
	 */
	void enterMulti_text_strings_cond(glParser.Multi_text_strings_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#multi_text_strings_cond}.
	 * @param ctx the parse tree
	 */
	void exitMulti_text_strings_cond(glParser.Multi_text_strings_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#def_font_type}.
	 * @param ctx the parse tree
	 */
	void enterDef_font_type(glParser.Def_font_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#def_font_type}.
	 * @param ctx the parse tree
	 */
	void exitDef_font_type(glParser.Def_font_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdPOLYGON}.
	 * @param ctx the parse tree
	 */
	void enterCmdPOLYGON(glParser.CmdPOLYGONContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdPOLYGON}.
	 * @param ctx the parse tree
	 */
	void exitCmdPOLYGON(glParser.CmdPOLYGONContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdPROCESS_PT}.
	 * @param ctx the parse tree
	 */
	void enterCmdPROCESS_PT(glParser.CmdPROCESS_PTContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdPROCESS_PT}.
	 * @param ctx the parse tree
	 */
	void exitCmdPROCESS_PT(glParser.CmdPROCESS_PTContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdRECTANGLE}.
	 * @param ctx the parse tree
	 */
	void enterCmdRECTANGLE(glParser.CmdRECTANGLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdRECTANGLE}.
	 * @param ctx the parse tree
	 */
	void exitCmdRECTANGLE(glParser.CmdRECTANGLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdSHAPE}.
	 * @param ctx the parse tree
	 */
	void enterCmdSHAPE(glParser.CmdSHAPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdSHAPE}.
	 * @param ctx the parse tree
	 */
	void exitCmdSHAPE(glParser.CmdSHAPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdTEXT}.
	 * @param ctx the parse tree
	 */
	void enterCmdTEXT(glParser.CmdTEXTContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdTEXT}.
	 * @param ctx the parse tree
	 */
	void exitCmdTEXT(glParser.CmdTEXTContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdTRIG_ON}.
	 * @param ctx the parse tree
	 */
	void enterCmdTRIG_ON(glParser.CmdTRIG_ONContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdTRIG_ON}.
	 * @param ctx the parse tree
	 */
	void exitCmdTRIG_ON(glParser.CmdTRIG_ONContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdOL_GAUGE}.
	 * @param ctx the parse tree
	 */
	void enterCmdOL_GAUGE(glParser.CmdOL_GAUGEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdOL_GAUGE}.
	 * @param ctx the parse tree
	 */
	void exitCmdOL_GAUGE(glParser.CmdOL_GAUGEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdBAR}.
	 * @param ctx the parse tree
	 */
	void enterCmdBAR(glParser.CmdBARContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdBAR}.
	 * @param ctx the parse tree
	 */
	void exitCmdBAR(glParser.CmdBARContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdCURSOR}.
	 * @param ctx the parse tree
	 */
	void enterCmdCURSOR(glParser.CmdCURSORContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdCURSOR}.
	 * @param ctx the parse tree
	 */
	void exitCmdCURSOR(glParser.CmdCURSORContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDATE}.
	 * @param ctx the parse tree
	 */
	void enterCmdDATE(glParser.CmdDATEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDATE}.
	 * @param ctx the parse tree
	 */
	void exitCmdDATE(glParser.CmdDATEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDEF_FKEY_GROUP}.
	 * @param ctx the parse tree
	 */
	void enterCmdDEF_FKEY_GROUP(glParser.CmdDEF_FKEY_GROUPContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDEF_FKEY_GROUP}.
	 * @param ctx the parse tree
	 */
	void exitCmdDEF_FKEY_GROUP(glParser.CmdDEF_FKEY_GROUPContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDEF_QUAL}.
	 * @param ctx the parse tree
	 */
	void enterCmdDEF_QUAL(glParser.CmdDEF_QUALContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDEF_QUAL}.
	 * @param ctx the parse tree
	 */
	void exitCmdDEF_QUAL(glParser.CmdDEF_QUALContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDIAG_DISP}.
	 * @param ctx the parse tree
	 */
	void enterCmdDIAG_DISP(glParser.CmdDIAG_DISPContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDIAG_DISP}.
	 * @param ctx the parse tree
	 */
	void exitCmdDIAG_DISP(glParser.CmdDIAG_DISPContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDOT}.
	 * @param ctx the parse tree
	 */
	void enterCmdDOT(glParser.CmdDOTContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDOT}.
	 * @param ctx the parse tree
	 */
	void exitCmdDOT(glParser.CmdDOTContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdEF_STATE}.
	 * @param ctx the parse tree
	 */
	void enterCmdEF_STATE(glParser.CmdEF_STATEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdEF_STATE}.
	 * @param ctx the parse tree
	 */
	void exitCmdEF_STATE(glParser.CmdEF_STATEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdLOOP}.
	 * @param ctx the parse tree
	 */
	void enterCmdLOOP(glParser.CmdLOOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdLOOP}.
	 * @param ctx the parse tree
	 */
	void exitCmdLOOP(glParser.CmdLOOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdENDLOOP}.
	 * @param ctx the parse tree
	 */
	void enterCmdENDLOOP(glParser.CmdENDLOOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdENDLOOP}.
	 * @param ctx the parse tree
	 */
	void exitCmdENDLOOP(glParser.CmdENDLOOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdENTRY_FLD}.
	 * @param ctx the parse tree
	 */
	void enterCmdENTRY_FLD(glParser.CmdENTRY_FLDContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdENTRY_FLD}.
	 * @param ctx the parse tree
	 */
	void exitCmdENTRY_FLD(glParser.CmdENTRY_FLDContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdFORCE_UPDATE}.
	 * @param ctx the parse tree
	 */
	void enterCmdFORCE_UPDATE(glParser.CmdFORCE_UPDATEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdFORCE_UPDATE}.
	 * @param ctx the parse tree
	 */
	void exitCmdFORCE_UPDATE(glParser.CmdFORCE_UPDATEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdFUNC_KEY}.
	 * @param ctx the parse tree
	 */
	void enterCmdFUNC_KEY(glParser.CmdFUNC_KEYContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdFUNC_KEY}.
	 * @param ctx the parse tree
	 */
	void exitCmdFUNC_KEY(glParser.CmdFUNC_KEYContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdGTEXT}.
	 * @param ctx the parse tree
	 */
	void enterCmdGTEXT(glParser.CmdGTEXTContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdGTEXT}.
	 * @param ctx the parse tree
	 */
	void exitCmdGTEXT(glParser.CmdGTEXTContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdIF}.
	 * @param ctx the parse tree
	 */
	void enterCmdIF(glParser.CmdIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdIF}.
	 * @param ctx the parse tree
	 */
	void exitCmdIF(glParser.CmdIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdIF_CHANGED}.
	 * @param ctx the parse tree
	 */
	void enterCmdIF_CHANGED(glParser.CmdIF_CHANGEDContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdIF_CHANGED}.
	 * @param ctx the parse tree
	 */
	void exitCmdIF_CHANGED(glParser.CmdIF_CHANGEDContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdELSE}.
	 * @param ctx the parse tree
	 */
	void enterCmdELSE(glParser.CmdELSEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdELSE}.
	 * @param ctx the parse tree
	 */
	void exitCmdELSE(glParser.CmdELSEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdENDIF}.
	 * @param ctx the parse tree
	 */
	void enterCmdENDIF(glParser.CmdENDIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdENDIF}.
	 * @param ctx the parse tree
	 */
	void exitCmdENDIF(glParser.CmdENDIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdIFELSE}.
	 * @param ctx the parse tree
	 */
	void enterCmdIFELSE(glParser.CmdIFELSEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdIFELSE}.
	 * @param ctx the parse tree
	 */
	void exitCmdIFELSE(glParser.CmdIFELSEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdMACRO}.
	 * @param ctx the parse tree
	 */
	void enterCmdMACRO(glParser.CmdMACROContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdMACRO}.
	 * @param ctx the parse tree
	 */
	void exitCmdMACRO(glParser.CmdMACROContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDEF_MACRO_PARAMS}.
	 * @param ctx the parse tree
	 */
	void enterCmdDEF_MACRO_PARAMS(glParser.CmdDEF_MACRO_PARAMSContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDEF_MACRO_PARAMS}.
	 * @param ctx the parse tree
	 */
	void exitCmdDEF_MACRO_PARAMS(glParser.CmdDEF_MACRO_PARAMSContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdDEF_MACRO}.
	 * @param ctx the parse tree
	 */
	void enterCmdDEF_MACRO(glParser.CmdDEF_MACROContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdDEF_MACRO}.
	 * @param ctx the parse tree
	 */
	void exitCmdDEF_MACRO(glParser.CmdDEF_MACROContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#def_macro_d_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_macro_d_list(glParser.Def_macro_d_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#def_macro_d_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_macro_d_list(glParser.Def_macro_d_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#def_macro_t_list_other}.
	 * @param ctx the parse tree
	 */
	void enterDef_macro_t_list_other(glParser.Def_macro_t_list_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#def_macro_t_list_other}.
	 * @param ctx the parse tree
	 */
	void exitDef_macro_t_list_other(glParser.Def_macro_t_list_otherContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#def_macro_t_list_bg}.
	 * @param ctx the parse tree
	 */
	void enterDef_macro_t_list_bg(glParser.Def_macro_t_list_bgContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#def_macro_t_list_bg}.
	 * @param ctx the parse tree
	 */
	void exitDef_macro_t_list_bg(glParser.Def_macro_t_list_bgContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#def_macro_set_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_macro_set_list(glParser.Def_macro_set_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#def_macro_set_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_macro_set_list(glParser.Def_macro_set_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#def_macro_const_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_macro_const_list(glParser.Def_macro_const_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#def_macro_const_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_macro_const_list(glParser.Def_macro_const_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#def_macro_status_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_macro_status_list(glParser.Def_macro_status_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#def_macro_status_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_macro_status_list(glParser.Def_macro_status_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#def_macro_color_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_macro_color_list(glParser.Def_macro_color_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#def_macro_color_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_macro_color_list(glParser.Def_macro_color_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#def_macro_olcolor_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_macro_olcolor_list(glParser.Def_macro_olcolor_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#def_macro_olcolor_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_macro_olcolor_list(glParser.Def_macro_olcolor_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdSET_MACRO_BB}.
	 * @param ctx the parse tree
	 */
	void enterCmdSET_MACRO_BB(glParser.CmdSET_MACRO_BBContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdSET_MACRO_BB}.
	 * @param ctx the parse tree
	 */
	void exitCmdSET_MACRO_BB(glParser.CmdSET_MACRO_BBContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdEND_MACRO}.
	 * @param ctx the parse tree
	 */
	void enterCmdEND_MACRO(glParser.CmdEND_MACROContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdEND_MACRO}.
	 * @param ctx the parse tree
	 */
	void exitCmdEND_MACRO(glParser.CmdEND_MACROContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdMATH}.
	 * @param ctx the parse tree
	 */
	void enterCmdMATH(glParser.CmdMATHContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdMATH}.
	 * @param ctx the parse tree
	 */
	void exitCmdMATH(glParser.CmdMATHContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#math_equation}.
	 * @param ctx the parse tree
	 */
	void enterMath_equation(glParser.Math_equationContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#math_equation}.
	 * @param ctx the parse tree
	 */
	void exitMath_equation(glParser.Math_equationContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#math_primary_eqtn}.
	 * @param ctx the parse tree
	 */
	void enterMath_primary_eqtn(glParser.Math_primary_eqtnContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#math_primary_eqtn}.
	 * @param ctx the parse tree
	 */
	void exitMath_primary_eqtn(glParser.Math_primary_eqtnContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdOL_BUTTON}.
	 * @param ctx the parse tree
	 */
	void enterCmdOL_BUTTON(glParser.CmdOL_BUTTONContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdOL_BUTTON}.
	 * @param ctx the parse tree
	 */
	void exitCmdOL_BUTTON(glParser.CmdOL_BUTTONContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdOL_RECTANGLE}.
	 * @param ctx the parse tree
	 */
	void enterCmdOL_RECTANGLE(glParser.CmdOL_RECTANGLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdOL_RECTANGLE}.
	 * @param ctx the parse tree
	 */
	void exitCmdOL_RECTANGLE(glParser.CmdOL_RECTANGLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdPAGE}.
	 * @param ctx the parse tree
	 */
	void enterCmdPAGE(glParser.CmdPAGEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdPAGE}.
	 * @param ctx the parse tree
	 */
	void exitCmdPAGE(glParser.CmdPAGEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdPLOT}.
	 * @param ctx the parse tree
	 */
	void enterCmdPLOT(glParser.CmdPLOTContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdPLOT}.
	 * @param ctx the parse tree
	 */
	void exitCmdPLOT(glParser.CmdPLOTContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdPTR_VALUE}.
	 * @param ctx the parse tree
	 */
	void enterCmdPTR_VALUE(glParser.CmdPTR_VALUEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdPTR_VALUE}.
	 * @param ctx the parse tree
	 */
	void exitCmdPTR_VALUE(glParser.CmdPTR_VALUEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#poke_args}.
	 * @param ctx the parse tree
	 */
	void enterPoke_args(glParser.Poke_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#poke_args}.
	 * @param ctx the parse tree
	 */
	void exitPoke_args(glParser.Poke_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdPOKE_FLD}.
	 * @param ctx the parse tree
	 */
	void enterCmdPOKE_FLD(glParser.CmdPOKE_FLDContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdPOKE_FLD}.
	 * @param ctx the parse tree
	 */
	void exitCmdPOKE_FLD(glParser.CmdPOKE_FLDContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdPOKE_STATE}.
	 * @param ctx the parse tree
	 */
	void enterCmdPOKE_STATE(glParser.CmdPOKE_STATEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdPOKE_STATE}.
	 * @param ctx the parse tree
	 */
	void exitCmdPOKE_STATE(glParser.CmdPOKE_STATEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdRUN_PROGRAMS}.
	 * @param ctx the parse tree
	 */
	void enterCmdRUN_PROGRAMS(glParser.CmdRUN_PROGRAMSContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdRUN_PROGRAMS}.
	 * @param ctx the parse tree
	 */
	void exitCmdRUN_PROGRAMS(glParser.CmdRUN_PROGRAMSContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdSETVAL}.
	 * @param ctx the parse tree
	 */
	void enterCmdSETVAL(glParser.CmdSETVALContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdSETVAL}.
	 * @param ctx the parse tree
	 */
	void exitCmdSETVAL(glParser.CmdSETVALContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdTIME}.
	 * @param ctx the parse tree
	 */
	void enterCmdTIME(glParser.CmdTIMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdTIME}.
	 * @param ctx the parse tree
	 */
	void exitCmdTIME(glParser.CmdTIMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdXY_PLOT}.
	 * @param ctx the parse tree
	 */
	void enterCmdXY_PLOT(glParser.CmdXY_PLOTContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdXY_PLOT}.
	 * @param ctx the parse tree
	 */
	void exitCmdXY_PLOT(glParser.CmdXY_PLOTContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdTREND}.
	 * @param ctx the parse tree
	 */
	void enterCmdTREND(glParser.CmdTRENDContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdTREND}.
	 * @param ctx the parse tree
	 */
	void exitCmdTREND(glParser.CmdTRENDContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdPTR_MOVE}.
	 * @param ctx the parse tree
	 */
	void enterCmdPTR_MOVE(glParser.CmdPTR_MOVEContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdPTR_MOVE}.
	 * @param ctx the parse tree
	 */
	void exitCmdPTR_MOVE(glParser.CmdPTR_MOVEContext ctx);
	/**
	 * Enter a parse tree produced by {@link glParser#cmdPOINTER}.
	 * @param ctx the parse tree
	 */
	void enterCmdPOINTER(glParser.CmdPOINTERContext ctx);
	/**
	 * Exit a parse tree produced by {@link glParser#cmdPOINTER}.
	 * @param ctx the parse tree
	 */
	void exitCmdPOINTER(glParser.CmdPOINTERContext ctx);
}