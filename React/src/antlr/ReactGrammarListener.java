// Generated from C:/Users/felux/IdeaProjects/React/src\ReactGrammar.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactGrammarParser}.
 */
public interface ReactGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(ReactGrammarParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(ReactGrammarParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#specific_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSpecific_identifier(ReactGrammarParser.Specific_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#specific_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSpecific_identifier(ReactGrammarParser.Specific_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ReactGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ReactGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(ReactGrammarParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(ReactGrammarParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#class_identifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_identifier(ReactGrammarParser.Class_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#class_identifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_identifier(ReactGrammarParser.Class_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(ReactGrammarParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(ReactGrammarParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ReactGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ReactGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_identifier(ReactGrammarParser.Function_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_identifier(ReactGrammarParser.Function_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#arrowfunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowfunction(ReactGrammarParser.ArrowfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#arrowfunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowfunction(ReactGrammarParser.ArrowfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#arrow_function_identifier}.
	 * @param ctx the parse tree
	 */
	void enterArrow_function_identifier(ReactGrammarParser.Arrow_function_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#arrow_function_identifier}.
	 * @param ctx the parse tree
	 */
	void exitArrow_function_identifier(ReactGrammarParser.Arrow_function_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(ReactGrammarParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(ReactGrammarParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ReactGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ReactGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(ReactGrammarParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(ReactGrammarParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ReactGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ReactGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ReactGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ReactGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(ReactGrammarParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(ReactGrammarParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ReactGrammarParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ReactGrammarParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ReactGrammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ReactGrammarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#key_value_pair}.
	 * @param ctx the parse tree
	 */
	void enterKey_value_pair(ReactGrammarParser.Key_value_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#key_value_pair}.
	 * @param ctx the parse tree
	 */
	void exitKey_value_pair(ReactGrammarParser.Key_value_pairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ReactGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ReactGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectAssign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterObjectAssign(ReactGrammarParser.ObjectAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectAssign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitObjectAssign(ReactGrammarParser.ObjectAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisAssign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterThisAssign(ReactGrammarParser.ThisAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisAssign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitThisAssign(ReactGrammarParser.ThisAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAssign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(ReactGrammarParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAssign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(ReactGrammarParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#usehooks}.
	 * @param ctx the parse tree
	 */
	void enterUsehooks(ReactGrammarParser.UsehooksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#usehooks}.
	 * @param ctx the parse tree
	 */
	void exitUsehooks(ReactGrammarParser.UsehooksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void enterUseEffect(ReactGrammarParser.UseEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void exitUseEffect(ReactGrammarParser.UseEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#useRef}.
	 * @param ctx the parse tree
	 */
	void enterUseRef(ReactGrammarParser.UseRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#useRef}.
	 * @param ctx the parse tree
	 */
	void exitUseRef(ReactGrammarParser.UseRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#useState}.
	 * @param ctx the parse tree
	 */
	void enterUseState(ReactGrammarParser.UseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#useState}.
	 * @param ctx the parse tree
	 */
	void exitUseState(ReactGrammarParser.UseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#jsxStatement}.
	 * @param ctx the parse tree
	 */
	void enterJsxStatement(ReactGrammarParser.JsxStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#jsxStatement}.
	 * @param ctx the parse tree
	 */
	void exitJsxStatement(ReactGrammarParser.JsxStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ReactGrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ReactGrammarParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(ReactGrammarParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(ReactGrammarParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#br}.
	 * @param ctx the parse tree
	 */
	void enterBr(ReactGrammarParser.BrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#br}.
	 * @param ctx the parse tree
	 */
	void exitBr(ReactGrammarParser.BrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#hr}.
	 * @param ctx the parse tree
	 */
	void enterHr(ReactGrammarParser.HrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#hr}.
	 * @param ctx the parse tree
	 */
	void exitHr(ReactGrammarParser.HrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#h1}.
	 * @param ctx the parse tree
	 */
	void enterH1(ReactGrammarParser.H1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#h1}.
	 * @param ctx the parse tree
	 */
	void exitH1(ReactGrammarParser.H1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#h2}.
	 * @param ctx the parse tree
	 */
	void enterH2(ReactGrammarParser.H2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#h2}.
	 * @param ctx the parse tree
	 */
	void exitH2(ReactGrammarParser.H2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#h3}.
	 * @param ctx the parse tree
	 */
	void enterH3(ReactGrammarParser.H3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#h3}.
	 * @param ctx the parse tree
	 */
	void exitH3(ReactGrammarParser.H3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#h4}.
	 * @param ctx the parse tree
	 */
	void enterH4(ReactGrammarParser.H4Context ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#h4}.
	 * @param ctx the parse tree
	 */
	void exitH4(ReactGrammarParser.H4Context ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#h5}.
	 * @param ctx the parse tree
	 */
	void enterH5(ReactGrammarParser.H5Context ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#h5}.
	 * @param ctx the parse tree
	 */
	void exitH5(ReactGrammarParser.H5Context ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#h6}.
	 * @param ctx the parse tree
	 */
	void enterH6(ReactGrammarParser.H6Context ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#h6}.
	 * @param ctx the parse tree
	 */
	void exitH6(ReactGrammarParser.H6Context ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#span}.
	 * @param ctx the parse tree
	 */
	void enterSpan(ReactGrammarParser.SpanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#span}.
	 * @param ctx the parse tree
	 */
	void exitSpan(ReactGrammarParser.SpanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#img}.
	 * @param ctx the parse tree
	 */
	void enterImg(ReactGrammarParser.ImgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#img}.
	 * @param ctx the parse tree
	 */
	void exitImg(ReactGrammarParser.ImgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(ReactGrammarParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(ReactGrammarParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#hrefAttr}.
	 * @param ctx the parse tree
	 */
	void enterHrefAttr(ReactGrammarParser.HrefAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#hrefAttr}.
	 * @param ctx the parse tree
	 */
	void exitHrefAttr(ReactGrammarParser.HrefAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(ReactGrammarParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(ReactGrammarParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(ReactGrammarParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(ReactGrammarParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#formAttr}.
	 * @param ctx the parse tree
	 */
	void enterFormAttr(ReactGrammarParser.FormAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#formAttr}.
	 * @param ctx the parse tree
	 */
	void exitFormAttr(ReactGrammarParser.FormAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#buttonAttr}.
	 * @param ctx the parse tree
	 */
	void enterButtonAttr(ReactGrammarParser.ButtonAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#buttonAttr}.
	 * @param ctx the parse tree
	 */
	void exitButtonAttr(ReactGrammarParser.ButtonAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(ReactGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(ReactGrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#inputAttr}.
	 * @param ctx the parse tree
	 */
	void enterInputAttr(ReactGrammarParser.InputAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#inputAttr}.
	 * @param ctx the parse tree
	 */
	void exitInputAttr(ReactGrammarParser.InputAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(ReactGrammarParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(ReactGrammarParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#ul}.
	 * @param ctx the parse tree
	 */
	void enterUl(ReactGrammarParser.UlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#ul}.
	 * @param ctx the parse tree
	 */
	void exitUl(ReactGrammarParser.UlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#ol}.
	 * @param ctx the parse tree
	 */
	void enterOl(ReactGrammarParser.OlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#ol}.
	 * @param ctx the parse tree
	 */
	void exitOl(ReactGrammarParser.OlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#li}.
	 * @param ctx the parse tree
	 */
	void enterLi(ReactGrammarParser.LiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#li}.
	 * @param ctx the parse tree
	 */
	void exitLi(ReactGrammarParser.LiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#video}.
	 * @param ctx the parse tree
	 */
	void enterVideo(ReactGrammarParser.VideoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#video}.
	 * @param ctx the parse tree
	 */
	void exitVideo(ReactGrammarParser.VideoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#audio}.
	 * @param ctx the parse tree
	 */
	void enterAudio(ReactGrammarParser.AudioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#audio}.
	 * @param ctx the parse tree
	 */
	void exitAudio(ReactGrammarParser.AudioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#mediaAttr}.
	 * @param ctx the parse tree
	 */
	void enterMediaAttr(ReactGrammarParser.MediaAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#mediaAttr}.
	 * @param ctx the parse tree
	 */
	void exitMediaAttr(ReactGrammarParser.MediaAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(ReactGrammarParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(ReactGrammarParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#srcAttr}.
	 * @param ctx the parse tree
	 */
	void enterSrcAttr(ReactGrammarParser.SrcAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#srcAttr}.
	 * @param ctx the parse tree
	 */
	void exitSrcAttr(ReactGrammarParser.SrcAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#typeAttr}.
	 * @param ctx the parse tree
	 */
	void enterTypeAttr(ReactGrammarParser.TypeAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#typeAttr}.
	 * @param ctx the parse tree
	 */
	void exitTypeAttr(ReactGrammarParser.TypeAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(ReactGrammarParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(ReactGrammarParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(ReactGrammarParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(ReactGrammarParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#props}.
	 * @param ctx the parse tree
	 */
	void enterProps(ReactGrammarParser.PropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#props}.
	 * @param ctx the parse tree
	 */
	void exitProps(ReactGrammarParser.PropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void enterJsxContent(ReactGrammarParser.JsxContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void exitJsxContent(ReactGrammarParser.JsxContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(ReactGrammarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(ReactGrammarParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ReactGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ReactGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ReactGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ReactGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(ReactGrammarParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(ReactGrammarParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(ReactGrammarParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(ReactGrammarParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ReactGrammarParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ReactGrammarParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(ReactGrammarParser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(ReactGrammarParser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberCase}
	 * labeled alternative in {@link ReactGrammarParser#case}.
	 * @param ctx the parse tree
	 */
	void enterNumberCase(ReactGrammarParser.NumberCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberCase}
	 * labeled alternative in {@link ReactGrammarParser#case}.
	 * @param ctx the parse tree
	 */
	void exitNumberCase(ReactGrammarParser.NumberCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharCase}
	 * labeled alternative in {@link ReactGrammarParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCharCase(ReactGrammarParser.CharCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharCase}
	 * labeled alternative in {@link ReactGrammarParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCharCase(ReactGrammarParser.CharCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(ReactGrammarParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(ReactGrammarParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void enterCaseBody(ReactGrammarParser.CaseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void exitCaseBody(ReactGrammarParser.CaseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ReactGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ReactGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ReactGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ReactGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ReactGrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ReactGrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitialConditionDeclaration}
	 * labeled alternative in {@link ReactGrammarParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void enterInitialConditionDeclaration(ReactGrammarParser.InitialConditionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitialConditionDeclaration}
	 * labeled alternative in {@link ReactGrammarParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void exitInitialConditionDeclaration(ReactGrammarParser.InitialConditionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitialConditionAssignment}
	 * labeled alternative in {@link ReactGrammarParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void enterInitialConditionAssignment(ReactGrammarParser.InitialConditionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitialConditionAssignment}
	 * labeled alternative in {@link ReactGrammarParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void exitInitialConditionAssignment(ReactGrammarParser.InitialConditionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitialConditionVariable}
	 * labeled alternative in {@link ReactGrammarParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void enterInitialConditionVariable(ReactGrammarParser.InitialConditionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitialConditionVariable}
	 * labeled alternative in {@link ReactGrammarParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void exitInitialConditionVariable(ReactGrammarParser.InitialConditionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(ReactGrammarParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(ReactGrammarParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(ReactGrammarParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(ReactGrammarParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#mapStatement}.
	 * @param ctx the parse tree
	 */
	void enterMapStatement(ReactGrammarParser.MapStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#mapStatement}.
	 * @param ctx the parse tree
	 */
	void exitMapStatement(ReactGrammarParser.MapStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ReactGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ReactGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ReactGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ReactGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void enterComparison_list(ReactGrammarParser.Comparison_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void exitComparison_list(ReactGrammarParser.Comparison_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ReactGrammarParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ReactGrammarParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#logical_comparison}.
	 * @param ctx the parse tree
	 */
	void enterLogical_comparison(ReactGrammarParser.Logical_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#logical_comparison}.
	 * @param ctx the parse tree
	 */
	void exitLogical_comparison(ReactGrammarParser.Logical_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#comparison_links}.
	 * @param ctx the parse tree
	 */
	void enterComparison_links(ReactGrammarParser.Comparison_linksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#comparison_links}.
	 * @param ctx the parse tree
	 */
	void exitComparison_links(ReactGrammarParser.Comparison_linksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(ReactGrammarParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(ReactGrammarParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ReactGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ReactGrammarParser.NumberContext ctx);
}