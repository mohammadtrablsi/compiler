// Generated from C:/Users/felux/IdeaProjects/React/src\ReactGrammar.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(ReactGrammarParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#specific_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecific_identifier(ReactGrammarParser.Specific_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ReactGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(ReactGrammarParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#class_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_identifier(ReactGrammarParser.Class_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(ReactGrammarParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ReactGrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_identifier(ReactGrammarParser.Function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#arrowfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowfunction(ReactGrammarParser.ArrowfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#arrow_function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_function_identifier(ReactGrammarParser.Arrow_function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(ReactGrammarParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ReactGrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(ReactGrammarParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ReactGrammarParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ReactGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(ReactGrammarParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(ReactGrammarParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ReactGrammarParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#key_value_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_value_pair(ReactGrammarParser.Key_value_pairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ReactGrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectAssign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectAssign(ReactGrammarParser.ObjectAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisAssign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssign(ReactGrammarParser.ThisAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAssign}
	 * labeled alternative in {@link ReactGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssign(ReactGrammarParser.ArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#usehooks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsehooks(ReactGrammarParser.UsehooksContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#useEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffect(ReactGrammarParser.UseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(ReactGrammarParser.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#useState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseState(ReactGrammarParser.UseStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#jsxStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxStatement(ReactGrammarParser.JsxStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ReactGrammarParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(ReactGrammarParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#br}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBr(ReactGrammarParser.BrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#hr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHr(ReactGrammarParser.HrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#h1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1(ReactGrammarParser.H1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#h2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2(ReactGrammarParser.H2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#h3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3(ReactGrammarParser.H3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#h4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH4(ReactGrammarParser.H4Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#h5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5(ReactGrammarParser.H5Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#h6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH6(ReactGrammarParser.H6Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#span}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpan(ReactGrammarParser.SpanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#img}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(ReactGrammarParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(ReactGrammarParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#hrefAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHrefAttr(ReactGrammarParser.HrefAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(ReactGrammarParser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(ReactGrammarParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#formAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormAttr(ReactGrammarParser.FormAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#buttonAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonAttr(ReactGrammarParser.ButtonAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ReactGrammarParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#inputAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputAttr(ReactGrammarParser.InputAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(ReactGrammarParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#ul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUl(ReactGrammarParser.UlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#ol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOl(ReactGrammarParser.OlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#li}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLi(ReactGrammarParser.LiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#video}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVideo(ReactGrammarParser.VideoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#audio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudio(ReactGrammarParser.AudioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#mediaAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaAttr(ReactGrammarParser.MediaAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(ReactGrammarParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#srcAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrcAttr(ReactGrammarParser.SrcAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#typeAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAttr(ReactGrammarParser.TypeAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(ReactGrammarParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(ReactGrammarParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProps(ReactGrammarParser.PropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#jsxContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxContent(ReactGrammarParser.JsxContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ReactGrammarParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ReactGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ReactGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(ReactGrammarParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(ReactGrammarParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ReactGrammarParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#switchBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBody(ReactGrammarParser.SwitchBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberCase}
	 * labeled alternative in {@link ReactGrammarParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberCase(ReactGrammarParser.NumberCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharCase}
	 * labeled alternative in {@link ReactGrammarParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharCase(ReactGrammarParser.CharCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(ReactGrammarParser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#caseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBody(ReactGrammarParser.CaseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ReactGrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(ReactGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ReactGrammarParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitialConditionDeclaration}
	 * labeled alternative in {@link ReactGrammarParser#initialCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialConditionDeclaration(ReactGrammarParser.InitialConditionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitialConditionAssignment}
	 * labeled alternative in {@link ReactGrammarParser#initialCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialConditionAssignment(ReactGrammarParser.InitialConditionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitialConditionVariable}
	 * labeled alternative in {@link ReactGrammarParser#initialCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialConditionVariable(ReactGrammarParser.InitialConditionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(ReactGrammarParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(ReactGrammarParser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#mapStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapStatement(ReactGrammarParser.MapStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ReactGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ReactGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#comparison_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_list(ReactGrammarParser.Comparison_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(ReactGrammarParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#logical_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_comparison(ReactGrammarParser.Logical_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#comparison_links}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_links(ReactGrammarParser.Comparison_linksContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(ReactGrammarParser.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ReactGrammarParser.NumberContext ctx);
}