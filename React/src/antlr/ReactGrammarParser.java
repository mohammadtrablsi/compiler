// Generated from C:/Users/felux/IdeaProjects/React/src\ReactGrammar.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReactGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IMPORT=5, FROM=6, AS=7, DEFAULT=8, EXPORT=9, 
		CLASS=10, ID=11, SRC=12, HREF=13, TITLE=14, CLASSNAME=15, FUNCTION=16, 
		RETURN=17, IF=18, ELSE=19, ELSEIF=20, SWITCH=21, CASE=22, DO=23, FOR=24, 
		WHILE=25, BREAK=26, FOREACH=27, MAP=28, CONTINUE=29, TRUE=30, FALSE=31, 
		NULL=32, THIS=33, TRY=34, CATCH=35, FINALLY=36, WITH=37, DEBUGGER=38, 
		VAR=39, CONST=40, LET=41, ENUM=42, ASYNC=43, AWAIT=44, CURRENT=45, INSTANCE_OF=46, 
		IN=47, EXTEND=48, RENDER=49, TYPE=50, PLUS=51, MINUS=52, MULTIPLY=53, 
		DIVIDE=54, MODULO=55, INCREMENT=56, DECREMENT=57, LSHIFT=58, RSHIFT=59, 
		BITWISE_AND=60, BITWISE_OR=61, BITWISE_XOR=62, LOGICAL_AND=63, LOGICAL_OR=64, 
		LOGICAL_NOT=65, ASSIGN=66, EQUALS=67, STRICT_EQUALS=68, NOT_EQUALS=69, 
		STRICT_NOT_EQUALS=70, LESS_THAN=71, MORE_THAN=72, LESS_THAN_OR_EQUAL_TO=73, 
		MORE_THAN_OR_EQUAL_TO=74, DIV_TAG=75, PARAGRAPH_TAG=76, H1_TAG=77, H2_TAG=78, 
		H3_TAG=79, H4_TAG=80, H5_TAG=81, H6_TAG=82, SPAN_TAG=83, IMG_TAG=84, A_LINK_TAG=85, 
		BUTTON_TAG=86, VIDEO_TAG=87, AUDIO_TAG=88, UL_TAG=89, OL_TAG=90, LI_TAG=91, 
		SOURCE_TAG=92, BR_TAG=93, HR_TAG=94, FORM_TAG=95, INPUT_TAG=96, LABEL_TAG=97, 
		VALUE=98, PLACE_HOLDER=99, ON_CLICK=100, ON_SUBMIT=101, REF=102, USE_HOOK=103, 
		LPAREN=104, RPAREN=105, LBRACE=106, RBRACE=107, LBRACKET=108, RBRACKET=109, 
		ARROW=110, DOT=111, COMMA=112, SEMICOLON=113, COLON=114, QUOTE=115, STRING=116, 
		NUMERIC=117, INT=118, NULL_VAL=119, WS=120, JsxComment=121, LINE_COMMENT=122, 
		BLOCK_COMMENT=123, IDENTIFIER=124, JSX_IDENTIFIER=125, CHARACTERS=126;
	public static final int
		RULE_program = 0, RULE_import_statement = 1, RULE_specific_identifier = 2, 
		RULE_statement = 3, RULE_class = 4, RULE_class_identifier = 5, RULE_class_body = 6, 
		RULE_function = 7, RULE_function_identifier = 8, RULE_arrowfunction = 9, 
		RULE_arrow_function_identifier = 10, RULE_function_body = 11, RULE_functionCall = 12, 
		RULE_parameter_list = 13, RULE_returnStatement = 14, RULE_declaration = 15, 
		RULE_data_type = 16, RULE_element = 17, RULE_object = 18, RULE_key_value_pair = 19, 
		RULE_assignment = 20, RULE_usehooks = 21, RULE_useEffect = 22, RULE_useRef = 23, 
		RULE_useState = 24, RULE_jsxStatement = 25, RULE_div = 26, RULE_p = 27, 
		RULE_br = 28, RULE_hr = 29, RULE_h1 = 30, RULE_h2 = 31, RULE_h3 = 32, 
		RULE_h4 = 33, RULE_h5 = 34, RULE_h6 = 35, RULE_span = 36, RULE_img = 37, 
		RULE_a = 38, RULE_hrefAttr = 39, RULE_button = 40, RULE_form = 41, RULE_formAttr = 42, 
		RULE_buttonAttr = 43, RULE_input = 44, RULE_inputAttr = 45, RULE_label = 46, 
		RULE_ul = 47, RULE_ol = 48, RULE_li = 49, RULE_video = 50, RULE_audio = 51, 
		RULE_mediaAttr = 52, RULE_source = 53, RULE_srcAttr = 54, RULE_typeAttr = 55, 
		RULE_attributes = 56, RULE_component = 57, RULE_props = 58, RULE_jsxContent = 59, 
		RULE_text = 60, RULE_condition = 61, RULE_ifStatement = 62, RULE_elseIf = 63, 
		RULE_else = 64, RULE_switchStatement = 65, RULE_switchBody = 66, RULE_case = 67, 
		RULE_defaultCase = 68, RULE_caseBody = 69, RULE_whileStatement = 70, RULE_doWhileStatement = 71, 
		RULE_forStatement = 72, RULE_initialCondition = 73, RULE_increment = 74, 
		RULE_foreachStatement = 75, RULE_mapStatement = 76, RULE_block = 77, RULE_expression = 78, 
		RULE_comparison_list = 79, RULE_comparison = 80, RULE_logical_comparison = 81, 
		RULE_comparison_links = 82, RULE_varModifier = 83, RULE_number = 84;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "import_statement", "specific_identifier", "statement", "class", 
			"class_identifier", "class_body", "function", "function_identifier", 
			"arrowfunction", "arrow_function_identifier", "function_body", "functionCall", 
			"parameter_list", "returnStatement", "declaration", "data_type", "element", 
			"object", "key_value_pair", "assignment", "usehooks", "useEffect", "useRef", 
			"useState", "jsxStatement", "div", "p", "br", "hr", "h1", "h2", "h3", 
			"h4", "h5", "h6", "span", "img", "a", "hrefAttr", "button", "form", "formAttr", 
			"buttonAttr", "input", "inputAttr", "label", "ul", "ol", "li", "video", 
			"audio", "mediaAttr", "source", "srcAttr", "typeAttr", "attributes", 
			"component", "props", "jsxContent", "text", "condition", "ifStatement", 
			"elseIf", "else", "switchStatement", "switchBody", "case", "defaultCase", 
			"caseBody", "whileStatement", "doWhileStatement", "forStatement", "initialCondition", 
			"increment", "foreachStatement", "mapStatement", "block", "expression", 
			"comparison_list", "comparison", "logical_comparison", "comparison_links", 
			"varModifier", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+='", "'-='", "'*='", "'/='", "'import'", "'from'", "'as'", "'default'", 
			"'export'", "'class'", "'id'", "'src'", "'href'", "'title'", "'className'", 
			"'function'", "'return'", "'if'", "'else'", "'else if'", "'switch'", 
			"'case'", "'do'", "'for'", "'while'", "'break'", "'foreach'", "'map'", 
			"'continue'", "'true'", "'false'", "'null'", "'this'", "'try'", "'catch'", 
			"'finally'", "'with'", "'debugger'", "'var'", "'const'", "'let'", "'enum'", 
			"'async'", "'await'", "'current'", "'instanceof'", "'in'", "'extends'", 
			"'render'", "'type'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
			"'<<'", "'>>'", "'&'", "'|'", "'^'", "'&&'", "'||'", "'!'", "'='", "'=='", 
			"'==='", "'!='", "'!=='", "'<'", "'>'", "'<='", "'>='", "'div'", "'p'", 
			"'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'h6'", "'span'", "'img'", "'a'", 
			"'button'", "'video'", "'audio'", "'ul'", "'ol'", "'li'", "'source'", 
			"'br'", "'hr'", "'form'", "'input'", "'label'", "'value'", "'placeholder'", 
			"'onClick'", "'onSubmit'", "'ref'", null, "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'=>'", "'.'", "','", "';'", "':'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "IMPORT", "FROM", "AS", "DEFAULT", "EXPORT", 
			"CLASS", "ID", "SRC", "HREF", "TITLE", "CLASSNAME", "FUNCTION", "RETURN", 
			"IF", "ELSE", "ELSEIF", "SWITCH", "CASE", "DO", "FOR", "WHILE", "BREAK", 
			"FOREACH", "MAP", "CONTINUE", "TRUE", "FALSE", "NULL", "THIS", "TRY", 
			"CATCH", "FINALLY", "WITH", "DEBUGGER", "VAR", "CONST", "LET", "ENUM", 
			"ASYNC", "AWAIT", "CURRENT", "INSTANCE_OF", "IN", "EXTEND", "RENDER", 
			"TYPE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "INCREMENT", 
			"DECREMENT", "LSHIFT", "RSHIFT", "BITWISE_AND", "BITWISE_OR", "BITWISE_XOR", 
			"LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", "ASSIGN", "EQUALS", "STRICT_EQUALS", 
			"NOT_EQUALS", "STRICT_NOT_EQUALS", "LESS_THAN", "MORE_THAN", "LESS_THAN_OR_EQUAL_TO", 
			"MORE_THAN_OR_EQUAL_TO", "DIV_TAG", "PARAGRAPH_TAG", "H1_TAG", "H2_TAG", 
			"H3_TAG", "H4_TAG", "H5_TAG", "H6_TAG", "SPAN_TAG", "IMG_TAG", "A_LINK_TAG", 
			"BUTTON_TAG", "VIDEO_TAG", "AUDIO_TAG", "UL_TAG", "OL_TAG", "LI_TAG", 
			"SOURCE_TAG", "BR_TAG", "HR_TAG", "FORM_TAG", "INPUT_TAG", "LABEL_TAG", 
			"VALUE", "PLACE_HOLDER", "ON_CLICK", "ON_SUBMIT", "REF", "USE_HOOK", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "ARROW", 
			"DOT", "COMMA", "SEMICOLON", "COLON", "QUOTE", "STRING", "NUMERIC", "INT", 
			"NULL_VAL", "WS", "JsxComment", "LINE_COMMENT", "BLOCK_COMMENT", "IDENTIFIER", 
			"JSX_IDENTIFIER", "CHARACTERS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReactGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactGrammarParser.EOF, 0); }
		public List<Import_statementContext> import_statement() {
			return getRuleContexts(Import_statementContext.class);
		}
		public Import_statementContext import_statement(int i) {
			return getRuleContext(Import_statementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(170);
				import_statement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFAULT) | (1L << EXPORT) | (1L << CLASS) | (1L << FUNCTION) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << FOREACH) | (1L << THIS) | (1L << VAR) | (1L << CONST) | (1L << LET) | (1L << ASYNC))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (USE_HOOK - 103)) | (1L << (LBRACE - 103)) | (1L << (NUMERIC - 103)) | (1L << (IDENTIFIER - 103)))) != 0)) {
				{
				{
				setState(176);
				statement();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactGrammarParser.IMPORT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactGrammarParser.SEMICOLON, 0); }
		public TerminalNode FROM() { return getToken(ReactGrammarParser.FROM, 0); }
		public List<TerminalNode> STRING() { return getTokens(ReactGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ReactGrammarParser.STRING, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode CHARACTERS() { return getToken(ReactGrammarParser.CHARACTERS, 0); }
		public TerminalNode DEFAULT() { return getToken(ReactGrammarParser.DEFAULT, 0); }
		public List<Specific_identifierContext> specific_identifier() {
			return getRuleContexts(Specific_identifierContext.class);
		}
		public Specific_identifierContext specific_identifier(int i) {
			return getRuleContext(Specific_identifierContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(ReactGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactGrammarParser.RBRACE, 0); }
		public TerminalNode AS() { return getToken(ReactGrammarParser.AS, 0); }
		public List<TerminalNode> USE_HOOK() { return getTokens(ReactGrammarParser.USE_HOOK); }
		public TerminalNode USE_HOOK(int i) {
			return getToken(ReactGrammarParser.USE_HOOK, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactGrammarParser.COMMA, i);
		}
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitImport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(IMPORT);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT || _la==LBRACE || _la==IDENTIFIER) {
				{
				setState(203);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(185);
					match(DEFAULT);
					}
					break;
				case IDENTIFIER:
					{
					setState(186);
					specific_identifier();
					}
					break;
				case LBRACE:
					{
					setState(187);
					match(LBRACE);
					setState(190);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(188);
						specific_identifier();
						}
						break;
					case USE_HOOK:
						{
						setState(189);
						match(USE_HOOK);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(192);
						match(COMMA);
						setState(195);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(193);
							specific_identifier();
							}
							break;
						case USE_HOOK:
							{
							setState(194);
							match(USE_HOOK);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(202);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(205);
				match(FROM);
				setState(206);
				_la = _input.LA(1);
				if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (STRING - 116)) | (1L << (IDENTIFIER - 116)) | (1L << (CHARACTERS - 116)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(207);
					match(AS);
					setState(208);
					specific_identifier();
					}
				}

				}
			}

			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(213);
				match(STRING);
				}
			}

			setState(216);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specific_identifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public Specific_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specific_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterSpecific_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitSpecific_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitSpecific_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specific_identifierContext specific_identifier() throws RecognitionException {
		Specific_identifierContext _localctx = new Specific_identifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_specific_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public MapStatementContext mapStatement() {
			return getRuleContext(MapStatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ReactGrammarParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ArrowfunctionContext arrowfunction() {
			return getRuleContext(ArrowfunctionContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UsehooksContext usehooks() {
			return getRuleContext(UsehooksContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				switchStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				doWhileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				foreachStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				mapStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				declaration();
				setState(228);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(230);
				assignment();
				setState(231);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(233);
				expression(0);
				setState(234);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(236);
				function();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(237);
				arrowfunction();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(238);
				class_();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(239);
				functionCall();
				setState(240);
				match(SEMICOLON);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(242);
				usehooks();
				setState(243);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassContext extends ParserRuleContext {
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			class_identifier();
			setState(248);
			class_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_identifierContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ReactGrammarParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode EXPORT() { return getToken(ReactGrammarParser.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(ReactGrammarParser.DEFAULT, 0); }
		public TerminalNode EXTEND() { return getToken(ReactGrammarParser.EXTEND, 0); }
		public Class_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterClass_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitClass_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitClass_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_identifierContext class_identifier() throws RecognitionException {
		Class_identifierContext _localctx = new Class_identifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(250);
				match(EXPORT);
				}
			}

			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(253);
				match(DEFAULT);
				}
			}

			setState(256);
			match(CLASS);
			setState(257);
			match(IDENTIFIER);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTEND) {
				{
				setState(258);
				match(EXTEND);
				setState(259);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ReactGrammarParser.LBRACE, 0); }
		public TerminalNode RENDER() { return getToken(ReactGrammarParser.RENDER, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public TerminalNode RBRACE() { return getToken(ReactGrammarParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LBRACE);
			setState(263);
			match(RENDER);
			setState(264);
			match(LPAREN);
			setState(265);
			match(RPAREN);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFAULT) | (1L << EXPORT) | (1L << CLASS) | (1L << FUNCTION) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << FOREACH) | (1L << THIS) | (1L << VAR) | (1L << CONST) | (1L << LET) | (1L << ASYNC))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (USE_HOOK - 103)) | (1L << (LBRACE - 103)) | (1L << (NUMERIC - 103)) | (1L << (IDENTIFIER - 103)))) != 0)) {
				{
				{
				setState(266);
				statement();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(272);
				returnStatement();
				}
			}

			setState(275);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Function_identifierContext function_identifier() {
			return getRuleContext(Function_identifierContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			function_identifier();
			setState(278);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_identifierContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ReactGrammarParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public TerminalNode EXPORT() { return getToken(ReactGrammarParser.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(ReactGrammarParser.DEFAULT, 0); }
		public TerminalNode ASYNC() { return getToken(ReactGrammarParser.ASYNC, 0); }
		public Function_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterFunction_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitFunction_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitFunction_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_identifierContext function_identifier() throws RecognitionException {
		Function_identifierContext _localctx = new Function_identifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(280);
				match(EXPORT);
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(283);
				match(DEFAULT);
				}
			}

			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(286);
				match(ASYNC);
				}
			}

			setState(289);
			match(FUNCTION);
			setState(290);
			match(IDENTIFIER);
			setState(291);
			match(LPAREN);
			setState(292);
			parameter_list();
			setState(293);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowfunctionContext extends ParserRuleContext {
		public Arrow_function_identifierContext arrow_function_identifier() {
			return getRuleContext(Arrow_function_identifierContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public ArrowfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterArrowfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitArrowfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitArrowfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowfunctionContext arrowfunction() throws RecognitionException {
		ArrowfunctionContext _localctx = new ArrowfunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrowfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			arrow_function_identifier();
			setState(296);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_function_identifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactGrammarParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(ReactGrammarParser.ARROW, 0); }
		public TerminalNode EXPORT() { return getToken(ReactGrammarParser.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(ReactGrammarParser.DEFAULT, 0); }
		public TerminalNode ASYNC() { return getToken(ReactGrammarParser.ASYNC, 0); }
		public Arrow_function_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_function_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterArrow_function_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitArrow_function_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitArrow_function_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_function_identifierContext arrow_function_identifier() throws RecognitionException {
		Arrow_function_identifierContext _localctx = new Arrow_function_identifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrow_function_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(298);
				match(EXPORT);
				}
			}

			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(301);
				match(DEFAULT);
				}
			}

			setState(304);
			match(CONST);
			setState(305);
			match(IDENTIFIER);
			setState(306);
			match(ASSIGN);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(307);
				match(ASYNC);
				}
			}

			setState(310);
			match(LPAREN);
			setState(311);
			parameter_list();
			setState(312);
			match(RPAREN);
			setState(313);
			match(ARROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ReactGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactGrammarParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(LBRACE);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFAULT) | (1L << EXPORT) | (1L << CLASS) | (1L << FUNCTION) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << FOREACH) | (1L << THIS) | (1L << VAR) | (1L << CONST) | (1L << LET) | (1L << ASYNC))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (USE_HOOK - 103)) | (1L << (LBRACE - 103)) | (1L << (NUMERIC - 103)) | (1L << (IDENTIFIER - 103)))) != 0)) {
				{
				{
				setState(316);
				statement();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(322);
				returnStatement();
				}
			}

			setState(325);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(ReactGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ReactGrammarParser.DOT, i);
		}
		public List<TerminalNode> CURRENT() { return getTokens(ReactGrammarParser.CURRENT); }
		public TerminalNode CURRENT(int i) {
			return getToken(ReactGrammarParser.CURRENT, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(IDENTIFIER);
				setState(328);
				match(LPAREN);
				setState(329);
				parameter_list();
				setState(330);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(IDENTIFIER);
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(337);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(333);
						match(DOT);
						setState(334);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(335);
						match(DOT);
						setState(336);
						match(CURRENT);
						}
						break;
					}
					}
					setState(339); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				setState(341);
				match(LPAREN);
				setState(342);
				parameter_list();
				setState(343);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactGrammarParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ReactGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ReactGrammarParser.DOT, i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (STRING - 116)) | (1L << (NUMERIC - 116)) | (1L << (IDENTIFIER - 116)) | (1L << (CHARACTERS - 116)))) != 0)) {
				{
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(347);
					data_type();
					}
					break;
				case 2:
					{
					{
					setState(348);
					match(IDENTIFIER);
					setState(349);
					match(DOT);
					setState(352);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(350);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(351);
						functionCall();
						}
						break;
					}
					}
					}
					break;
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==IDENTIFIER) {
					{
					setState(364);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(356);
						match(COMMA);
						setState(357);
						data_type();
						}
						break;
					case IDENTIFIER:
						{
						{
						setState(358);
						match(IDENTIFIER);
						setState(359);
						match(DOT);
						setState(362);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(360);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(361);
							functionCall();
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ReactGrammarParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactGrammarParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode CHARACTERS() { return getToken(ReactGrammarParser.CHARACTERS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public JsxStatementContext jsxStatement() {
			return getRuleContext(JsxStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(RETURN);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(372);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(373);
				match(CHARACTERS);
				}
				break;
			case 3:
				{
				setState(374);
				expression(0);
				}
				break;
			case 4:
				{
				setState(375);
				functionCall();
				}
				break;
			case 5:
				{
				setState(376);
				condition();
				}
				break;
			case 6:
				{
				{
				setState(377);
				match(LPAREN);
				setState(378);
				jsxStatement();
				setState(379);
				match(RPAREN);
				}
				}
				break;
			}
			setState(383);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONST() { return getToken(ReactGrammarParser.CONST, 0); }
		public TerminalNode LBRACKET() { return getToken(ReactGrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ReactGrammarParser.RBRACKET, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration);
		int _la;
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				varModifier();
				setState(386);
				match(IDENTIFIER);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(387);
					match(ASSIGN);
					setState(388);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(CONST);
				setState(392);
				match(IDENTIFIER);
				setState(393);
				match(ASSIGN);
				setState(394);
				match(LBRACKET);
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NULL:
				case STRING:
				case NUMERIC:
				case IDENTIFIER:
				case CHARACTERS:
					{
					setState(395);
					element();
					}
					break;
				case LBRACE:
				case RBRACKET:
					{
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACE) {
						{
						{
						setState(396);
						object();
						}
						}
						setState(401);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(404);
				match(RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ReactGrammarParser.STRING, 0); }
		public TerminalNode CHARACTERS() { return getToken(ReactGrammarParser.CHARACTERS, 0); }
		public TerminalNode NUMERIC() { return getToken(ReactGrammarParser.NUMERIC, 0); }
		public TerminalNode TRUE() { return getToken(ReactGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ReactGrammarParser.FALSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode NULL() { return getToken(ReactGrammarParser.NULL, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (STRING - 116)) | (1L << (NUMERIC - 116)) | (1L << (IDENTIFIER - 116)) | (1L << (CHARACTERS - 116)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactGrammarParser.COMMA, i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			data_type();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(410);
				match(COMMA);
				setState(411);
				data_type();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(ReactGrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ReactGrammarParser.LBRACE, i);
		}
		public List<Key_value_pairContext> key_value_pair() {
			return getRuleContexts(Key_value_pairContext.class);
		}
		public Key_value_pairContext key_value_pair(int i) {
			return getRuleContext(Key_value_pairContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ReactGrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ReactGrammarParser.RBRACE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactGrammarParser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(417);
			match(LBRACE);
			setState(418);
			key_value_pair();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(419);
				match(COMMA);
				setState(420);
				key_value_pair();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(RBRACE);
			}
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(428);
				match(COMMA);
				setState(429);
				match(LBRACE);
				setState(430);
				key_value_pair();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(431);
					match(COMMA);
					setState(432);
					key_value_pair();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438);
				match(RBRACE);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_value_pairContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(ReactGrammarParser.COLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Key_value_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterKey_value_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitKey_value_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitKey_value_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_value_pairContext key_value_pair() throws RecognitionException {
		Key_value_pairContext _localctx = new Key_value_pairContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_key_value_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(IDENTIFIER);
			setState(446);
			match(COLON);
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(447);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(448);
				data_type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAssignContext extends AssignmentContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACKET() { return getToken(ReactGrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ReactGrammarParser.RBRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode NUMERIC() { return getToken(ReactGrammarParser.NUMERIC, 0); }
		public TerminalNode CHARACTERS() { return getToken(ReactGrammarParser.CHARACTERS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitArrayAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitArrayAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends AssignmentContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode CHARACTERS() { return getToken(ReactGrammarParser.CHARACTERS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectAssignContext extends AssignmentContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(ReactGrammarParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode CHARACTERS() { return getToken(ReactGrammarParser.CHARACTERS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterObjectAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitObjectAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitObjectAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisAssignContext extends AssignmentContext {
		public TerminalNode THIS() { return getToken(ReactGrammarParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(ReactGrammarParser.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode CHARACTERS() { return getToken(ReactGrammarParser.CHARACTERS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThisAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterThisAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitThisAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitThisAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(IDENTIFIER);
				setState(452);
				match(ASSIGN);
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(453);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(454);
					match(CHARACTERS);
					}
					break;
				case 3:
					{
					setState(455);
					functionCall();
					}
					break;
				case 4:
					{
					setState(456);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ObjectAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(IDENTIFIER);
				setState(460);
				match(DOT);
				setState(461);
				match(IDENTIFIER);
				setState(462);
				match(ASSIGN);
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(463);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(464);
					match(CHARACTERS);
					}
					break;
				case 3:
					{
					setState(465);
					functionCall();
					}
					break;
				case 4:
					{
					setState(466);
					expression(0);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ThisAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(THIS);
				setState(470);
				match(DOT);
				setState(471);
				match(IDENTIFIER);
				setState(472);
				match(ASSIGN);
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(473);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(474);
					match(CHARACTERS);
					}
					break;
				case 3:
					{
					setState(475);
					functionCall();
					}
					break;
				case 4:
					{
					setState(476);
					expression(0);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(IDENTIFIER);
				setState(480);
				match(LBRACKET);
				setState(481);
				_la = _input.LA(1);
				if ( !(_la==NUMERIC || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(482);
				match(RBRACKET);
				setState(483);
				match(ASSIGN);
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(484);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(485);
					match(CHARACTERS);
					}
					break;
				case 3:
					{
					setState(486);
					functionCall();
					}
					break;
				case 4:
					{
					setState(487);
					expression(0);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsehooksContext extends ParserRuleContext {
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
		}
		public UseEffectContext useEffect() {
			return getRuleContext(UseEffectContext.class,0);
		}
		public UseRefContext useRef() {
			return getRuleContext(UseRefContext.class,0);
		}
		public UsehooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usehooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterUsehooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitUsehooks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitUsehooks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsehooksContext usehooks() throws RecognitionException {
		UsehooksContext _localctx = new UsehooksContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_usehooks);
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				useState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				useEffect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				useRef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseEffectContext extends ParserRuleContext {
		public TerminalNode USE_HOOK() { return getToken(ReactGrammarParser.USE_HOOK, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ReactGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ReactGrammarParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ReactGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ReactGrammarParser.RPAREN, i);
		}
		public TerminalNode ARROW() { return getToken(ReactGrammarParser.ARROW, 0); }
		public TerminalNode LBRACE() { return getToken(ReactGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactGrammarParser.RBRACE, 0); }
		public TerminalNode COMMA() { return getToken(ReactGrammarParser.COMMA, 0); }
		public TerminalNode LBRACKET() { return getToken(ReactGrammarParser.LBRACKET, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(ReactGrammarParser.RBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public UseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContext useEffect() throws RecognitionException {
		UseEffectContext _localctx = new UseEffectContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_useEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(USE_HOOK);
			setState(498);
			match(LPAREN);
			setState(499);
			match(LPAREN);
			setState(500);
			match(RPAREN);
			setState(501);
			match(ARROW);
			setState(502);
			match(LBRACE);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFAULT) | (1L << EXPORT) | (1L << CLASS) | (1L << FUNCTION) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << FOREACH) | (1L << THIS) | (1L << VAR) | (1L << CONST) | (1L << LET) | (1L << ASYNC))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (USE_HOOK - 103)) | (1L << (LBRACE - 103)) | (1L << (NUMERIC - 103)) | (1L << (IDENTIFIER - 103)))) != 0)) {
				{
				{
				setState(503);
				statement();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(RBRACE);
			setState(510);
			match(COMMA);
			setState(511);
			match(LBRACKET);
			setState(512);
			parameter_list();
			setState(513);
			match(RBRACKET);
			setState(514);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseRefContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactGrammarParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode USE_HOOK() { return getToken(ReactGrammarParser.USE_HOOK, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public UseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefContext useRef() throws RecognitionException {
		UseRefContext _localctx = new UseRefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(CONST);
			setState(517);
			match(IDENTIFIER);
			setState(518);
			match(ASSIGN);
			setState(519);
			match(USE_HOOK);
			setState(520);
			match(LPAREN);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (STRING - 116)) | (1L << (NUMERIC - 116)) | (1L << (IDENTIFIER - 116)) | (1L << (CHARACTERS - 116)))) != 0)) {
				{
				{
				setState(521);
				data_type();
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseStateContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactGrammarParser.CONST, 0); }
		public TerminalNode LBRACKET() { return getToken(ReactGrammarParser.LBRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode COMMA() { return getToken(ReactGrammarParser.COMMA, 0); }
		public TerminalNode RBRACKET() { return getToken(ReactGrammarParser.RBRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode USE_HOOK() { return getToken(ReactGrammarParser.USE_HOOK, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public UseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterUseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitUseState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitUseState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateContext useState() throws RecognitionException {
		UseStateContext _localctx = new UseStateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_useState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(CONST);
			setState(530);
			match(LBRACKET);
			setState(531);
			match(IDENTIFIER);
			setState(532);
			match(COMMA);
			setState(533);
			match(IDENTIFIER);
			setState(534);
			match(RBRACKET);
			setState(535);
			match(ASSIGN);
			setState(536);
			match(USE_HOOK);
			setState(537);
			match(LPAREN);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (STRING - 116)) | (1L << (NUMERIC - 116)) | (1L << (IDENTIFIER - 116)) | (1L << (CHARACTERS - 116)))) != 0)) {
				{
				{
				setState(538);
				data_type();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(544);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsxStatementContext extends ParserRuleContext {
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public H1Context h1() {
			return getRuleContext(H1Context.class,0);
		}
		public H2Context h2() {
			return getRuleContext(H2Context.class,0);
		}
		public H3Context h3() {
			return getRuleContext(H3Context.class,0);
		}
		public H4Context h4() {
			return getRuleContext(H4Context.class,0);
		}
		public H5Context h5() {
			return getRuleContext(H5Context.class,0);
		}
		public H6Context h6() {
			return getRuleContext(H6Context.class,0);
		}
		public SpanContext span() {
			return getRuleContext(SpanContext.class,0);
		}
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public BrContext br() {
			return getRuleContext(BrContext.class,0);
		}
		public HrContext hr() {
			return getRuleContext(HrContext.class,0);
		}
		public VideoContext video() {
			return getRuleContext(VideoContext.class,0);
		}
		public AudioContext audio() {
			return getRuleContext(AudioContext.class,0);
		}
		public UlContext ul() {
			return getRuleContext(UlContext.class,0);
		}
		public OlContext ol() {
			return getRuleContext(OlContext.class,0);
		}
		public LiContext li() {
			return getRuleContext(LiContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public JsxStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterJsxStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitJsxStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitJsxStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxStatementContext jsxStatement() throws RecognitionException {
		JsxStatementContext _localctx = new JsxStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jsxStatement);
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				div();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				p();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				h1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(549);
				h2();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(550);
				h3();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(551);
				h4();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(552);
				h5();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(553);
				h6();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(554);
				span();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(555);
				img();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(556);
				a();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(557);
				button();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(558);
				form();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(559);
				input();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(560);
				label();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(561);
				br();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(562);
				hr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(563);
				video();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(564);
				audio();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(565);
				ul();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(566);
				ol();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(567);
				li();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(568);
				component();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> DIV_TAG() { return getTokens(ReactGrammarParser.DIV_TAG); }
		public TerminalNode DIV_TAG(int i) {
			return getToken(ReactGrammarParser.DIV_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_div);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(LESS_THAN);
			setState(572);
			match(DIV_TAG);
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(573);
				attributes();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			match(MORE_THAN);
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(580);
					jsxContent();
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(586);
			match(LESS_THAN);
			setState(587);
			match(DIVIDE);
			setState(588);
			match(DIV_TAG);
			setState(589);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> PARAGRAPH_TAG() { return getTokens(ReactGrammarParser.PARAGRAPH_TAG); }
		public TerminalNode PARAGRAPH_TAG(int i) {
			return getToken(ReactGrammarParser.PARAGRAPH_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(LESS_THAN);
			setState(592);
			match(PARAGRAPH_TAG);
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(593);
				attributes();
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(599);
			match(MORE_THAN);
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(600);
					jsxContent();
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(606);
			match(LESS_THAN);
			setState(607);
			match(DIVIDE);
			setState(608);
			match(PARAGRAPH_TAG);
			setState(609);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ReactGrammarParser.LESS_THAN, 0); }
		public TerminalNode BR_TAG() { return getToken(ReactGrammarParser.BR_TAG, 0); }
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public TerminalNode MORE_THAN() { return getToken(ReactGrammarParser.MORE_THAN, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public BrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_br; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterBr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitBr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitBr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrContext br() throws RecognitionException {
		BrContext _localctx = new BrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_br);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(LESS_THAN);
			setState(612);
			match(BR_TAG);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(613);
				attributes();
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(619);
			match(DIVIDE);
			setState(620);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HrContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ReactGrammarParser.LESS_THAN, 0); }
		public TerminalNode HR_TAG() { return getToken(ReactGrammarParser.HR_TAG, 0); }
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public TerminalNode MORE_THAN() { return getToken(ReactGrammarParser.MORE_THAN, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public HrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterHr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitHr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitHr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HrContext hr() throws RecognitionException {
		HrContext _localctx = new HrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_hr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(LESS_THAN);
			setState(623);
			match(HR_TAG);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(624);
				attributes();
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(630);
			match(DIVIDE);
			setState(631);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class H1Context extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> H1_TAG() { return getTokens(ReactGrammarParser.H1_TAG); }
		public TerminalNode H1_TAG(int i) {
			return getToken(ReactGrammarParser.H1_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public H1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterH1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitH1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitH1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H1Context h1() throws RecognitionException {
		H1Context _localctx = new H1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_h1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(LESS_THAN);
			setState(634);
			match(H1_TAG);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(635);
				attributes();
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(641);
			match(MORE_THAN);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					jsxContent();
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(648);
			match(LESS_THAN);
			setState(649);
			match(DIVIDE);
			setState(650);
			match(H1_TAG);
			setState(651);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class H2Context extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> H2_TAG() { return getTokens(ReactGrammarParser.H2_TAG); }
		public TerminalNode H2_TAG(int i) {
			return getToken(ReactGrammarParser.H2_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public H2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterH2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitH2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitH2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H2Context h2() throws RecognitionException {
		H2Context _localctx = new H2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_h2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(LESS_THAN);
			setState(654);
			match(H2_TAG);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(655);
				attributes();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(661);
			match(MORE_THAN);
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(662);
					jsxContent();
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(668);
			match(LESS_THAN);
			setState(669);
			match(DIVIDE);
			setState(670);
			match(H2_TAG);
			setState(671);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class H3Context extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> H3_TAG() { return getTokens(ReactGrammarParser.H3_TAG); }
		public TerminalNode H3_TAG(int i) {
			return getToken(ReactGrammarParser.H3_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public H3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterH3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitH3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitH3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H3Context h3() throws RecognitionException {
		H3Context _localctx = new H3Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_h3);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(LESS_THAN);
			setState(674);
			match(H3_TAG);
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(675);
				attributes();
				}
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(681);
			match(MORE_THAN);
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(682);
					jsxContent();
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(688);
			match(LESS_THAN);
			setState(689);
			match(DIVIDE);
			setState(690);
			match(H3_TAG);
			setState(691);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class H4Context extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> H4_TAG() { return getTokens(ReactGrammarParser.H4_TAG); }
		public TerminalNode H4_TAG(int i) {
			return getToken(ReactGrammarParser.H4_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public H4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterH4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitH4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitH4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H4Context h4() throws RecognitionException {
		H4Context _localctx = new H4Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_h4);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(LESS_THAN);
			setState(694);
			match(H4_TAG);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(695);
				attributes();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			match(MORE_THAN);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(702);
					jsxContent();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(708);
			match(LESS_THAN);
			setState(709);
			match(DIVIDE);
			setState(710);
			match(H4_TAG);
			setState(711);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class H5Context extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> H5_TAG() { return getTokens(ReactGrammarParser.H5_TAG); }
		public TerminalNode H5_TAG(int i) {
			return getToken(ReactGrammarParser.H5_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public H5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterH5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitH5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitH5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H5Context h5() throws RecognitionException {
		H5Context _localctx = new H5Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_h5);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(LESS_THAN);
			setState(714);
			match(H5_TAG);
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(715);
				attributes();
				}
				}
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721);
			match(MORE_THAN);
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					jsxContent();
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(728);
			match(LESS_THAN);
			setState(729);
			match(DIVIDE);
			setState(730);
			match(H5_TAG);
			setState(731);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class H6Context extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> H6_TAG() { return getTokens(ReactGrammarParser.H6_TAG); }
		public TerminalNode H6_TAG(int i) {
			return getToken(ReactGrammarParser.H6_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public H6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterH6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitH6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitH6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H6Context h6() throws RecognitionException {
		H6Context _localctx = new H6Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_h6);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(LESS_THAN);
			setState(734);
			match(H6_TAG);
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(735);
				attributes();
				}
				}
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(741);
			match(MORE_THAN);
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(742);
					jsxContent();
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(748);
			match(LESS_THAN);
			setState(749);
			match(DIVIDE);
			setState(750);
			match(H6_TAG);
			setState(751);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpanContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> SPAN_TAG() { return getTokens(ReactGrammarParser.SPAN_TAG); }
		public TerminalNode SPAN_TAG(int i) {
			return getToken(ReactGrammarParser.SPAN_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public SpanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_span; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitSpan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitSpan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpanContext span() throws RecognitionException {
		SpanContext _localctx = new SpanContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_span);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(LESS_THAN);
			setState(754);
			match(SPAN_TAG);
			setState(755);
			match(MORE_THAN);
			setState(759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(756);
					jsxContent();
					}
					} 
				}
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(762);
			match(LESS_THAN);
			setState(763);
			match(DIVIDE);
			setState(764);
			match(SPAN_TAG);
			setState(765);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImgContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ReactGrammarParser.LESS_THAN, 0); }
		public TerminalNode IMG_TAG() { return getToken(ReactGrammarParser.IMG_TAG, 0); }
		public SrcAttrContext srcAttr() {
			return getRuleContext(SrcAttrContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public TerminalNode MORE_THAN() { return getToken(ReactGrammarParser.MORE_THAN, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_img);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(LESS_THAN);
			setState(768);
			match(IMG_TAG);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(769);
				attributes();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(775);
			srcAttr();
			setState(776);
			match(DIVIDE);
			setState(777);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> A_LINK_TAG() { return getTokens(ReactGrammarParser.A_LINK_TAG); }
		public TerminalNode A_LINK_TAG(int i) {
			return getToken(ReactGrammarParser.A_LINK_TAG, i);
		}
		public HrefAttrContext hrefAttr() {
			return getRuleContext(HrefAttrContext.class,0);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_a);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(LESS_THAN);
			setState(780);
			match(A_LINK_TAG);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(781);
				attributes();
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(787);
			hrefAttr();
			setState(788);
			match(MORE_THAN);
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(789);
					jsxContent();
					}
					} 
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(795);
			match(LESS_THAN);
			setState(796);
			match(DIVIDE);
			setState(797);
			match(A_LINK_TAG);
			setState(798);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HrefAttrContext extends ParserRuleContext {
		public TerminalNode HREF() { return getToken(ReactGrammarParser.HREF, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ReactGrammarParser.STRING, 0); }
		public TerminalNode JSX_IDENTIFIER() { return getToken(ReactGrammarParser.JSX_IDENTIFIER, 0); }
		public HrefAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hrefAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterHrefAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitHrefAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitHrefAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HrefAttrContext hrefAttr() throws RecognitionException {
		HrefAttrContext _localctx = new HrefAttrContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hrefAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(HREF);
			setState(801);
			match(ASSIGN);
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSX_IDENTIFIER:
				{
				{
				setState(802);
				match(JSX_IDENTIFIER);
				}
				}
				break;
			case STRING:
				{
				setState(803);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ButtonContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> BUTTON_TAG() { return getTokens(ReactGrammarParser.BUTTON_TAG); }
		public TerminalNode BUTTON_TAG(int i) {
			return getToken(ReactGrammarParser.BUTTON_TAG, i);
		}
		public ButtonAttrContext buttonAttr() {
			return getRuleContext(ButtonAttrContext.class,0);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_button);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(LESS_THAN);
			setState(807);
			match(BUTTON_TAG);
			setState(808);
			buttonAttr();
			setState(809);
			match(MORE_THAN);
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(810);
					jsxContent();
					}
					} 
				}
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(816);
			match(LESS_THAN);
			setState(817);
			match(DIVIDE);
			setState(818);
			match(BUTTON_TAG);
			setState(819);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> FORM_TAG() { return getTokens(ReactGrammarParser.FORM_TAG); }
		public TerminalNode FORM_TAG(int i) {
			return getToken(ReactGrammarParser.FORM_TAG, i);
		}
		public FormAttrContext formAttr() {
			return getRuleContext(FormAttrContext.class,0);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(LESS_THAN);
			setState(822);
			match(FORM_TAG);
			setState(823);
			formAttr();
			setState(824);
			match(MORE_THAN);
			setState(828);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(825);
					jsxContent();
					}
					} 
				}
				setState(830);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(831);
			match(LESS_THAN);
			setState(832);
			match(DIVIDE);
			setState(833);
			match(FORM_TAG);
			setState(834);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormAttrContext extends ParserRuleContext {
		public TerminalNode ON_SUBMIT() { return getToken(ReactGrammarParser.ON_SUBMIT, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode LBRACE() { return getToken(ReactGrammarParser.LBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(ReactGrammarParser.ARROW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ReactGrammarParser.RBRACE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public FormAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterFormAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitFormAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitFormAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormAttrContext formAttr() throws RecognitionException {
		FormAttrContext _localctx = new FormAttrContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formAttr);
		int _la;
		try {
			setState(852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_SUBMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				match(ON_SUBMIT);
				setState(837);
				match(ASSIGN);
				setState(838);
				match(LBRACE);
				setState(839);
				match(LPAREN);
				setState(840);
				parameter_list();
				setState(841);
				match(RPAREN);
				setState(842);
				match(ARROW);
				setState(843);
				functionCall();
				setState(844);
				match(RBRACE);
				}
				break;
			case ID:
			case CLASSNAME:
			case MORE_THAN:
			case REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==CLASSNAME || _la==REF) {
					{
					{
					setState(846);
					attributes();
					}
					}
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ButtonAttrContext extends ParserRuleContext {
		public TerminalNode ON_CLICK() { return getToken(ReactGrammarParser.ON_CLICK, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ReactGrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ReactGrammarParser.LBRACE, i);
		}
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(ReactGrammarParser.ARROW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ReactGrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ReactGrammarParser.RBRACE, i);
		}
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public ButtonAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterButtonAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitButtonAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitButtonAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonAttrContext buttonAttr() throws RecognitionException {
		ButtonAttrContext _localctx = new ButtonAttrContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_buttonAttr);
		int _la;
		try {
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_CLICK:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				match(ON_CLICK);
				setState(855);
				match(ASSIGN);
				setState(856);
				match(LBRACE);
				setState(857);
				match(LPAREN);
				setState(858);
				parameter_list();
				setState(859);
				match(RPAREN);
				setState(860);
				match(ARROW);
				setState(861);
				match(LBRACE);
				setState(862);
				functionCall();
				setState(863);
				match(RBRACE);
				setState(864);
				match(RBRACE);
				}
				break;
			case ID:
			case CLASSNAME:
			case MORE_THAN:
			case REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==CLASSNAME || _la==REF) {
					{
					{
					setState(866);
					attributes();
					}
					}
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ReactGrammarParser.LESS_THAN, 0); }
		public TerminalNode INPUT_TAG() { return getToken(ReactGrammarParser.INPUT_TAG, 0); }
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public TerminalNode MORE_THAN() { return getToken(ReactGrammarParser.MORE_THAN, 0); }
		public List<InputAttrContext> inputAttr() {
			return getRuleContexts(InputAttrContext.class);
		}
		public InputAttrContext inputAttr(int i) {
			return getRuleContext(InputAttrContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(LESS_THAN);
			setState(875);
			match(INPUT_TAG);
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (TYPE - 50)) | (1L << (VALUE - 50)) | (1L << (PLACE_HOLDER - 50)))) != 0)) {
				{
				{
				setState(876);
				inputAttr();
				}
				}
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(882);
			match(DIVIDE);
			setState(883);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputAttrContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ReactGrammarParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ReactGrammarParser.STRING, 0); }
		public TerminalNode JSX_IDENTIFIER() { return getToken(ReactGrammarParser.JSX_IDENTIFIER, 0); }
		public TerminalNode PLACE_HOLDER() { return getToken(ReactGrammarParser.PLACE_HOLDER, 0); }
		public TerminalNode VALUE() { return getToken(ReactGrammarParser.VALUE, 0); }
		public InputAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterInputAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitInputAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitInputAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputAttrContext inputAttr() throws RecognitionException {
		InputAttrContext _localctx = new InputAttrContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inputAttr);
		try {
			setState(903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				match(TYPE);
				setState(886);
				match(ASSIGN);
				setState(889);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JSX_IDENTIFIER:
					{
					{
					setState(887);
					match(JSX_IDENTIFIER);
					}
					}
					break;
				case STRING:
					{
					setState(888);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case PLACE_HOLDER:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				match(PLACE_HOLDER);
				setState(892);
				match(ASSIGN);
				setState(895);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JSX_IDENTIFIER:
					{
					{
					setState(893);
					match(JSX_IDENTIFIER);
					}
					}
					break;
				case STRING:
					{
					setState(894);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(897);
				match(VALUE);
				setState(898);
				match(ASSIGN);
				setState(901);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JSX_IDENTIFIER:
					{
					{
					setState(899);
					match(JSX_IDENTIFIER);
					}
					}
					break;
				case STRING:
					{
					setState(900);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> LABEL_TAG() { return getTokens(ReactGrammarParser.LABEL_TAG); }
		public TerminalNode LABEL_TAG(int i) {
			return getToken(ReactGrammarParser.LABEL_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_label);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(LESS_THAN);
			setState(906);
			match(LABEL_TAG);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(907);
				attributes();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(913);
			match(MORE_THAN);
			setState(917);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(914);
					jsxContent();
					}
					} 
				}
				setState(919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(920);
			match(LESS_THAN);
			setState(921);
			match(DIVIDE);
			setState(922);
			match(LABEL_TAG);
			setState(923);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UlContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> UL_TAG() { return getTokens(ReactGrammarParser.UL_TAG); }
		public TerminalNode UL_TAG(int i) {
			return getToken(ReactGrammarParser.UL_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public UlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterUl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitUl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitUl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UlContext ul() throws RecognitionException {
		UlContext _localctx = new UlContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ul);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(LESS_THAN);
			setState(926);
			match(UL_TAG);
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(927);
				attributes();
				}
				}
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(933);
			match(MORE_THAN);
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(934);
					jsxContent();
					}
					} 
				}
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(940);
			match(LESS_THAN);
			setState(941);
			match(DIVIDE);
			setState(942);
			match(UL_TAG);
			setState(943);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> OL_TAG() { return getTokens(ReactGrammarParser.OL_TAG); }
		public TerminalNode OL_TAG(int i) {
			return getToken(ReactGrammarParser.OL_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public OlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterOl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitOl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitOl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlContext ol() throws RecognitionException {
		OlContext _localctx = new OlContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ol);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(LESS_THAN);
			setState(946);
			match(OL_TAG);
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(947);
				attributes();
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(953);
			match(MORE_THAN);
			setState(957);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(954);
					jsxContent();
					}
					} 
				}
				setState(959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(960);
			match(LESS_THAN);
			setState(961);
			match(DIVIDE);
			setState(962);
			match(OL_TAG);
			setState(963);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> LI_TAG() { return getTokens(ReactGrammarParser.LI_TAG); }
		public TerminalNode LI_TAG(int i) {
			return getToken(ReactGrammarParser.LI_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public LiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_li; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterLi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitLi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitLi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiContext li() throws RecognitionException {
		LiContext _localctx = new LiContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_li);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(LESS_THAN);
			setState(966);
			match(LI_TAG);
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==CLASSNAME || _la==REF) {
				{
				{
				setState(967);
				attributes();
				}
				}
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(973);
			match(MORE_THAN);
			setState(977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(974);
					jsxContent();
					}
					} 
				}
				setState(979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(980);
			match(LESS_THAN);
			setState(981);
			match(DIVIDE);
			setState(982);
			match(LI_TAG);
			setState(983);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VideoContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> VIDEO_TAG() { return getTokens(ReactGrammarParser.VIDEO_TAG); }
		public TerminalNode VIDEO_TAG(int i) {
			return getToken(ReactGrammarParser.VIDEO_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<MediaAttrContext> mediaAttr() {
			return getRuleContexts(MediaAttrContext.class);
		}
		public MediaAttrContext mediaAttr(int i) {
			return getRuleContext(MediaAttrContext.class,i);
		}
		public List<SourceContext> source() {
			return getRuleContexts(SourceContext.class);
		}
		public SourceContext source(int i) {
			return getRuleContext(SourceContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public VideoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_video; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterVideo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitVideo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitVideo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VideoContext video() throws RecognitionException {
		VideoContext _localctx = new VideoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_video);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(LESS_THAN);
			setState(986);
			match(VIDEO_TAG);
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << SRC) | (1L << CLASSNAME) | (1L << TYPE))) != 0) || _la==REF) {
				{
				{
				setState(987);
				mediaAttr();
				}
				}
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(993);
			match(MORE_THAN);
			setState(997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(994);
					source();
					}
					} 
				}
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1000);
				match(IDENTIFIER);
				}
				}
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1006);
			match(LESS_THAN);
			setState(1007);
			match(DIVIDE);
			setState(1008);
			match(VIDEO_TAG);
			setState(1009);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AudioContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactGrammarParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactGrammarParser.LESS_THAN, i);
		}
		public List<TerminalNode> AUDIO_TAG() { return getTokens(ReactGrammarParser.AUDIO_TAG); }
		public TerminalNode AUDIO_TAG(int i) {
			return getToken(ReactGrammarParser.AUDIO_TAG, i);
		}
		public List<TerminalNode> MORE_THAN() { return getTokens(ReactGrammarParser.MORE_THAN); }
		public TerminalNode MORE_THAN(int i) {
			return getToken(ReactGrammarParser.MORE_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public List<MediaAttrContext> mediaAttr() {
			return getRuleContexts(MediaAttrContext.class);
		}
		public MediaAttrContext mediaAttr(int i) {
			return getRuleContext(MediaAttrContext.class,i);
		}
		public List<SourceContext> source() {
			return getRuleContexts(SourceContext.class);
		}
		public SourceContext source(int i) {
			return getRuleContext(SourceContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public AudioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_audio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterAudio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitAudio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitAudio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AudioContext audio() throws RecognitionException {
		AudioContext _localctx = new AudioContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_audio);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(LESS_THAN);
			setState(1012);
			match(AUDIO_TAG);
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << SRC) | (1L << CLASSNAME) | (1L << TYPE))) != 0) || _la==REF) {
				{
				{
				setState(1013);
				mediaAttr();
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1019);
			match(MORE_THAN);
			setState(1023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1020);
					source();
					}
					} 
				}
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1026);
				match(IDENTIFIER);
				}
				}
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1032);
			match(LESS_THAN);
			setState(1033);
			match(DIVIDE);
			setState(1034);
			match(AUDIO_TAG);
			setState(1035);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MediaAttrContext extends ParserRuleContext {
		public SrcAttrContext srcAttr() {
			return getRuleContext(SrcAttrContext.class,0);
		}
		public TypeAttrContext typeAttr() {
			return getRuleContext(TypeAttrContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public MediaAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterMediaAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitMediaAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitMediaAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaAttrContext mediaAttr() throws RecognitionException {
		MediaAttrContext _localctx = new MediaAttrContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_mediaAttr);
		try {
			setState(1040);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SRC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				srcAttr();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1038);
				typeAttr();
				}
				break;
			case ID:
			case CLASSNAME:
			case REF:
				enterOuterAlt(_localctx, 3);
				{
				setState(1039);
				attributes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ReactGrammarParser.LESS_THAN, 0); }
		public TerminalNode SOURCE_TAG() { return getToken(ReactGrammarParser.SOURCE_TAG, 0); }
		public TerminalNode MORE_THAN() { return getToken(ReactGrammarParser.MORE_THAN, 0); }
		public List<MediaAttrContext> mediaAttr() {
			return getRuleContexts(MediaAttrContext.class);
		}
		public MediaAttrContext mediaAttr(int i) {
			return getRuleContext(MediaAttrContext.class,i);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(LESS_THAN);
			setState(1043);
			match(SOURCE_TAG);
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << SRC) | (1L << CLASSNAME) | (1L << TYPE))) != 0) || _la==REF) {
				{
				{
				setState(1044);
				mediaAttr();
				}
				}
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1050);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SrcAttrContext extends ParserRuleContext {
		public TerminalNode SRC() { return getToken(ReactGrammarParser.SRC, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ReactGrammarParser.STRING, 0); }
		public TerminalNode JSX_IDENTIFIER() { return getToken(ReactGrammarParser.JSX_IDENTIFIER, 0); }
		public SrcAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_srcAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterSrcAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitSrcAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitSrcAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcAttrContext srcAttr() throws RecognitionException {
		SrcAttrContext _localctx = new SrcAttrContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_srcAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			match(SRC);
			setState(1053);
			match(ASSIGN);
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSX_IDENTIFIER:
				{
				{
				setState(1054);
				match(JSX_IDENTIFIER);
				}
				}
				break;
			case STRING:
				{
				setState(1055);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAttrContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ReactGrammarParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(ReactGrammarParser.STRING, 0); }
		public TerminalNode JSX_IDENTIFIER() { return getToken(ReactGrammarParser.JSX_IDENTIFIER, 0); }
		public TypeAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterTypeAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitTypeAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitTypeAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAttrContext typeAttr() throws RecognitionException {
		TypeAttrContext _localctx = new TypeAttrContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(TYPE);
			setState(1059);
			match(ASSIGN);
			setState(1062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSX_IDENTIFIER:
				{
				{
				setState(1060);
				match(JSX_IDENTIFIER);
				}
				}
				break;
			case STRING:
				{
				setState(1061);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode CLASSNAME() { return getToken(ReactGrammarParser.CLASSNAME, 0); }
		public TerminalNode ID() { return getToken(ReactGrammarParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ReactGrammarParser.STRING, 0); }
		public TerminalNode JSX_IDENTIFIER() { return getToken(ReactGrammarParser.JSX_IDENTIFIER, 0); }
		public TerminalNode REF() { return getToken(ReactGrammarParser.REF, 0); }
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_attributes);
		int _la;
		try {
			setState(1073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case CLASSNAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1064);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==CLASSNAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1065);
				match(ASSIGN);
				setState(1068);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JSX_IDENTIFIER:
					{
					{
					setState(1066);
					match(JSX_IDENTIFIER);
					}
					}
					break;
				case STRING:
					{
					setState(1067);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(REF);
				setState(1071);
				match(ASSIGN);
				setState(1072);
				match(JSX_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ReactGrammarParser.LESS_THAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public TerminalNode MORE_THAN() { return getToken(ReactGrammarParser.MORE_THAN, 0); }
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(LESS_THAN);
			setState(1076);
			match(IDENTIFIER);
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1077);
				props();
				}
				}
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1083);
			match(DIVIDE);
			setState(1084);
			match(MORE_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public TerminalNode JSX_IDENTIFIER() { return getToken(ReactGrammarParser.JSX_IDENTIFIER, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public PropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsContext props() throws RecognitionException {
		PropsContext _localctx = new PropsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_props);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(IDENTIFIER);
			setState(1087);
			match(ASSIGN);
			setState(1090);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSX_IDENTIFIER:
				{
				setState(1088);
				match(JSX_IDENTIFIER);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case STRING:
			case NUMERIC:
			case IDENTIFIER:
			case CHARACTERS:
				{
				setState(1089);
				data_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsxContentContext extends ParserRuleContext {
		public JsxStatementContext jsxStatement() {
			return getRuleContext(JsxStatementContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ReactGrammarParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ReactGrammarParser.RBRACE, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public MapStatementContext mapStatement() {
			return getRuleContext(MapStatementContext.class,0);
		}
		public JsxContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterJsxContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitJsxContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitJsxContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxContentContext jsxContent() throws RecognitionException {
		JsxContentContext _localctx = new JsxContentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jsxContent);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				jsxStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1093);
				match(LBRACE);
				setState(1094);
				expression(0);
				setState(1095);
				match(RBRACE);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1097);
				text();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1098);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1099);
				switchStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1100);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1101);
				doWhileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1102);
				forStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1103);
				foreachStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1104);
				mapStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1108); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1107);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1110); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			comparison_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ReactGrammarParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(IF);
			setState(1115);
			match(LPAREN);
			setState(1116);
			condition();
			setState(1117);
			match(RPAREN);
			setState(1118);
			block();
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE || _la==ELSEIF) {
				{
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(1119);
					elseIf();
					}
					}
					setState(1124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1125);
				else_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(ReactGrammarParser.ELSEIF, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(ELSEIF);
			setState(1129);
			match(LPAREN);
			setState(1130);
			condition();
			setState(1131);
			match(RPAREN);
			setState(1132);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ReactGrammarParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(ELSE);
			setState(1135);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(ReactGrammarParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public SwitchBodyContext switchBody() {
			return getRuleContext(SwitchBodyContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(SWITCH);
			setState(1138);
			match(LPAREN);
			setState(1139);
			match(IDENTIFIER);
			setState(1140);
			match(RPAREN);
			setState(1141);
			switchBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ReactGrammarParser.LBRACE, 0); }
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ReactGrammarParser.RBRACE, 0); }
		public List<CaseContext> case_() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case_(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public SwitchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterSwitchBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitSwitchBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitSwitchBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBodyContext switchBody() throws RecognitionException {
		SwitchBodyContext _localctx = new SwitchBodyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_switchBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			match(LBRACE);
			setState(1145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1144);
				case_();
				}
				}
				setState(1147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(1149);
			defaultCase();
			setState(1150);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseContext extends ParserRuleContext {
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
	 
		public CaseContext() { }
		public void copyFrom(CaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberCaseContext extends CaseContext {
		public TerminalNode CASE() { return getToken(ReactGrammarParser.CASE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ReactGrammarParser.COLON, 0); }
		public CaseBodyContext caseBody() {
			return getRuleContext(CaseBodyContext.class,0);
		}
		public NumberCaseContext(CaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterNumberCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitNumberCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitNumberCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharCaseContext extends CaseContext {
		public TerminalNode CASE() { return getToken(ReactGrammarParser.CASE, 0); }
		public TerminalNode CHARACTERS() { return getToken(ReactGrammarParser.CHARACTERS, 0); }
		public TerminalNode COLON() { return getToken(ReactGrammarParser.COLON, 0); }
		public CaseBodyContext caseBody() {
			return getRuleContext(CaseBodyContext.class,0);
		}
		public CharCaseContext(CaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterCharCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitCharCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitCharCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_case);
		try {
			setState(1161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				_localctx = new NumberCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				match(CASE);
				setState(1153);
				number();
				setState(1154);
				match(COLON);
				setState(1155);
				caseBody();
				}
				break;
			case 2:
				_localctx = new CharCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1157);
				match(CASE);
				setState(1158);
				match(CHARACTERS);
				setState(1159);
				match(COLON);
				setState(1160);
				caseBody();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultCaseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(ReactGrammarParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(ReactGrammarParser.COLON, 0); }
		public CaseBodyContext caseBody() {
			return getRuleContext(CaseBodyContext.class,0);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitDefaultCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitDefaultCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_defaultCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			match(DEFAULT);
			setState(1164);
			match(COLON);
			setState(1165);
			caseBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactGrammarParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactGrammarParser.SEMICOLON, 0); }
		public CaseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterCaseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitCaseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitCaseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBodyContext caseBody() throws RecognitionException {
		CaseBodyContext _localctx = new CaseBodyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_caseBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1167);
					statement();
					}
					} 
				}
				setState(1172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(1173);
				match(BREAK);
				setState(1174);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ReactGrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			match(WHILE);
			setState(1178);
			match(LPAREN);
			setState(1179);
			condition();
			setState(1180);
			match(RPAREN);
			setState(1181);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ReactGrammarParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ReactGrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ReactGrammarParser.SEMICOLON, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			match(DO);
			setState(1184);
			block();
			setState(1185);
			match(WHILE);
			setState(1186);
			match(LPAREN);
			setState(1187);
			condition();
			setState(1188);
			match(RPAREN);
			setState(1189);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ReactGrammarParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public InitialConditionContext initialCondition() {
			return getRuleContext(InitialConditionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ReactGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReactGrammarParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(FOR);
			setState(1192);
			match(LPAREN);
			setState(1193);
			initialCondition();
			setState(1194);
			match(SEMICOLON);
			setState(1195);
			condition();
			setState(1196);
			match(SEMICOLON);
			setState(1197);
			increment();
			setState(1198);
			match(RPAREN);
			setState(1199);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialConditionContext extends ParserRuleContext {
		public InitialConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialCondition; }
	 
		public InitialConditionContext() { }
		public void copyFrom(InitialConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitialConditionDeclarationContext extends InitialConditionContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialConditionDeclarationContext(InitialConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterInitialConditionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitInitialConditionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitInitialConditionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitialConditionAssignmentContext extends InitialConditionContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialConditionAssignmentContext(InitialConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterInitialConditionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitInitialConditionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitInitialConditionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitialConditionVariableContext extends InitialConditionContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public InitialConditionVariableContext(InitialConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterInitialConditionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitInitialConditionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitInitialConditionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialConditionContext initialCondition() throws RecognitionException {
		InitialConditionContext _localctx = new InitialConditionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_initialCondition);
		try {
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				_localctx = new InitialConditionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				varModifier();
				setState(1202);
				match(IDENTIFIER);
				setState(1203);
				match(ASSIGN);
				setState(1204);
				expression(0);
				}
				break;
			case 2:
				_localctx = new InitialConditionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				match(IDENTIFIER);
				setState(1207);
				match(ASSIGN);
				setState(1208);
				expression(0);
				}
				break;
			case 3:
				_localctx = new InitialConditionVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1209);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(ReactGrammarParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(ReactGrammarParser.DECREMENT, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_increment);
		int _la;
		try {
			setState(1219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1212);
				match(IDENTIFIER);
				setState(1213);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1214);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				match(IDENTIFIER);
				setState(1216);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1217);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1218);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(ReactGrammarParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(ReactGrammarParser.LPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(ReactGrammarParser.IN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactGrammarParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			match(FOREACH);
			setState(1222);
			match(LPAREN);
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << LET))) != 0)) {
				{
				setState(1223);
				varModifier();
				}
			}

			setState(1226);
			match(IDENTIFIER);
			setState(1227);
			match(IN);
			setState(1228);
			match(IDENTIFIER);
			setState(1229);
			match(RPAREN);
			setState(1230);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapStatementContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(ReactGrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ReactGrammarParser.LBRACE, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(ReactGrammarParser.DOT, 0); }
		public TerminalNode MAP() { return getToken(ReactGrammarParser.MAP, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ReactGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ReactGrammarParser.LPAREN, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ReactGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ReactGrammarParser.RPAREN, i);
		}
		public TerminalNode ARROW() { return getToken(ReactGrammarParser.ARROW, 0); }
		public TerminalNode RETURN() { return getToken(ReactGrammarParser.RETURN, 0); }
		public List<TerminalNode> RBRACE() { return getTokens(ReactGrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ReactGrammarParser.RBRACE, i);
		}
		public JsxStatementContext jsxStatement() {
			return getRuleContext(JsxStatementContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public MapStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterMapStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitMapStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitMapStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapStatementContext mapStatement() throws RecognitionException {
		MapStatementContext _localctx = new MapStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_mapStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(LBRACE);
			setState(1233);
			match(IDENTIFIER);
			setState(1234);
			match(DOT);
			setState(1235);
			match(MAP);
			setState(1236);
			match(LPAREN);
			setState(1237);
			match(LPAREN);
			setState(1238);
			parameter_list();
			setState(1239);
			match(RPAREN);
			setState(1240);
			match(ARROW);
			setState(1241);
			match(LBRACE);
			setState(1242);
			match(RETURN);
			setState(1243);
			match(LPAREN);
			setState(1251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
			case LBRACE:
				{
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(1244);
					block();
					}
					}
					setState(1249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LESS_THAN:
				{
				setState(1250);
				jsxStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1253);
			match(RPAREN);
			setState(1254);
			match(RBRACE);
			setState(1255);
			match(RPAREN);
			setState(1256);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ReactGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactGrammarParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(LBRACE);
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFAULT) | (1L << EXPORT) | (1L << CLASS) | (1L << FUNCTION) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << FOR) | (1L << WHILE) | (1L << FOREACH) | (1L << THIS) | (1L << VAR) | (1L << CONST) | (1L << LET) | (1L << ASYNC))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (USE_HOOK - 103)) | (1L << (LBRACE - 103)) | (1L << (NUMERIC - 103)) | (1L << (IDENTIFIER - 103)))) != 0)) {
				{
				{
				setState(1259);
				statement();
				}
				}
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1265);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactGrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ReactGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ReactGrammarParser.DOT, i);
		}
		public TerminalNode NUMERIC() { return getToken(ReactGrammarParser.NUMERIC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(ReactGrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(ReactGrammarParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(ReactGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ReactGrammarParser.MINUS, 0); }
		public TerminalNode ASSIGN() { return getToken(ReactGrammarParser.ASSIGN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1268);
				match(IDENTIFIER);
				setState(1273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1269);
						match(DOT);
						setState(1270);
						match(IDENTIFIER);
						}
						} 
					}
					setState(1275);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				}
				}
				break;
			case NUMERIC:
				{
				setState(1276);
				match(NUMERIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1279);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1280);
						match(MULTIPLY);
						setState(1281);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1282);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1283);
						match(DIVIDE);
						setState(1284);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1285);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1286);
						match(PLUS);
						setState(1287);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1288);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1289);
						match(MINUS);
						setState(1290);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1291);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1292);
						match(PLUS);
						setState(1293);
						match(ASSIGN);
						setState(1294);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1295);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1296);
						match(MULTIPLY);
						setState(1297);
						match(ASSIGN);
						setState(1298);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1299);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1300);
						match(MINUS);
						setState(1301);
						match(ASSIGN);
						setState(1302);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1304);
						match(DIVIDE);
						setState(1305);
						match(ASSIGN);
						setState(1306);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(1311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comparison_listContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<Comparison_linksContext> comparison_links() {
			return getRuleContexts(Comparison_linksContext.class);
		}
		public Comparison_linksContext comparison_links(int i) {
			return getRuleContext(Comparison_linksContext.class,i);
		}
		public Comparison_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterComparison_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitComparison_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitComparison_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_listContext comparison_list() throws RecognitionException {
		Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_comparison_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1312);
				comparison();
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LOGICAL_AND - 63)) | (1L << (LOGICAL_OR - 63)) | (1L << (LOGICAL_NOT - 63)))) != 0)) {
					{
					{
					setState(1313);
					comparison_links();
					setState(1314);
					comparison();
					}
					}
					setState(1320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactGrammarParser.IDENTIFIER, 0); }
		public Logical_comparisonContext logical_comparison() {
			return getRuleContext(Logical_comparisonContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			match(IDENTIFIER);
			setState(1324);
			logical_comparison();
			setState(1325);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_comparisonContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ReactGrammarParser.LESS_THAN, 0); }
		public TerminalNode MORE_THAN() { return getToken(ReactGrammarParser.MORE_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL_TO() { return getToken(ReactGrammarParser.LESS_THAN_OR_EQUAL_TO, 0); }
		public TerminalNode MORE_THAN_OR_EQUAL_TO() { return getToken(ReactGrammarParser.MORE_THAN_OR_EQUAL_TO, 0); }
		public TerminalNode EQUALS() { return getToken(ReactGrammarParser.EQUALS, 0); }
		public TerminalNode STRICT_EQUALS() { return getToken(ReactGrammarParser.STRICT_EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(ReactGrammarParser.NOT_EQUALS, 0); }
		public TerminalNode STRICT_NOT_EQUALS() { return getToken(ReactGrammarParser.STRICT_NOT_EQUALS, 0); }
		public Logical_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterLogical_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitLogical_comparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitLogical_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_comparisonContext logical_comparison() throws RecognitionException {
		Logical_comparisonContext _localctx = new Logical_comparisonContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_logical_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (EQUALS - 67)) | (1L << (STRICT_EQUALS - 67)) | (1L << (NOT_EQUALS - 67)) | (1L << (STRICT_NOT_EQUALS - 67)) | (1L << (LESS_THAN - 67)) | (1L << (MORE_THAN - 67)) | (1L << (LESS_THAN_OR_EQUAL_TO - 67)) | (1L << (MORE_THAN_OR_EQUAL_TO - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_linksContext extends ParserRuleContext {
		public TerminalNode LOGICAL_OR() { return getToken(ReactGrammarParser.LOGICAL_OR, 0); }
		public TerminalNode LOGICAL_AND() { return getToken(ReactGrammarParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_NOT() { return getToken(ReactGrammarParser.LOGICAL_NOT, 0); }
		public Comparison_linksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_links; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterComparison_links(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitComparison_links(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitComparison_links(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_linksContext comparison_links() throws RecognitionException {
		Comparison_linksContext _localctx = new Comparison_linksContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_comparison_links);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LOGICAL_AND - 63)) | (1L << (LOGICAL_OR - 63)) | (1L << (LOGICAL_NOT - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ReactGrammarParser.VAR, 0); }
		public TerminalNode LET() { return getToken(ReactGrammarParser.LET, 0); }
		public TerminalNode CONST() { return getToken(ReactGrammarParser.CONST, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitVarModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << LET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMERIC() { return getToken(ReactGrammarParser.NUMERIC, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactGrammarListener ) ((ReactGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactGrammarVisitor ) return ((ReactGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(NUMERIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 78:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001~\u0538\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0001"+
		"\u0000\u0005\u0000\u00ac\b\u0000\n\u0000\f\u0000\u00af\t\u0000\u0001\u0000"+
		"\u0005\u0000\u00b2\b\u0000\n\u0000\f\u0000\u00b5\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u00bf\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00c4\b\u0001\u0005\u0001\u00c6\b\u0001\n\u0001\f\u0001\u00c9\t"+
		"\u0001\u0001\u0001\u0003\u0001\u00cc\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00d2\b\u0001\u0003\u0001\u00d4\b\u0001"+
		"\u0001\u0001\u0003\u0001\u00d7\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00f6\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0003\u0005\u00fc\b\u0005\u0001\u0005\u0003\u0005"+
		"\u00ff\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0105\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u010c\b\u0006\n\u0006\f\u0006\u010f\t\u0006\u0001\u0006\u0003"+
		"\u0006\u0112\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0003\b\u011a\b\b\u0001\b\u0003\b\u011d\b\b\u0001\b\u0003"+
		"\b\u0120\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0003\n\u012c\b\n\u0001\n\u0003\n\u012f\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u0135\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u013e\b\u000b\n\u000b\f"+
		"\u000b\u0141\t\u000b\u0001\u000b\u0003\u000b\u0144\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0004\f\u0152\b\f\u000b\f\f\f\u0153\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u015a\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0161\b\r\u0003\r\u0163\b\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u016b\b\r\u0005\r\u016d\b\r\n\r\f\r\u0170\t\r"+
		"\u0003\r\u0172\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u017e\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0186\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u018e\b\u000f\n"+
		"\u000f\f\u000f\u0191\t\u000f\u0003\u000f\u0193\b\u000f\u0001\u000f\u0003"+
		"\u000f\u0196\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u019d\b\u0011\n\u0011\f\u0011\u01a0\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01a6\b\u0012\n\u0012"+
		"\f\u0012\u01a9\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01b2\b\u0012\n\u0012"+
		"\f\u0012\u01b5\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01b9\b\u0012"+
		"\n\u0012\f\u0012\u01bc\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u01c2\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01ca\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u01d4\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01de"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01e9\b\u0014\u0003"+
		"\u0014\u01eb\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01f0"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u01f9\b\u0016\n\u0016\f\u0016\u01fc\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u020b\b\u0017\n\u0017\f\u0017\u020e\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u021c\b\u0018\n\u0018\f\u0018\u021f\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u023a\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u023f\b"+
		"\u001a\n\u001a\f\u001a\u0242\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0246\b\u001a\n\u001a\f\u001a\u0249\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u0253\b\u001b\n\u001b\f\u001b\u0256\t\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u025a\b\u001b\n\u001b\f\u001b\u025d\t\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u0267\b\u001c\n\u001c\f\u001c\u026a\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u0272\b\u001d\n\u001d\f\u001d\u0275\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u027d\b\u001e\n"+
		"\u001e\f\u001e\u0280\t\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0284"+
		"\b\u001e\n\u001e\f\u001e\u0287\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u0291\b\u001f\n\u001f\f\u001f\u0294\t\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0298\b\u001f\n\u001f\f\u001f\u029b\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u02a5"+
		"\b \n \f \u02a8\t \u0001 \u0001 \u0005 \u02ac\b \n \f \u02af\t \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0005!\u02b9\b!\n!"+
		"\f!\u02bc\t!\u0001!\u0001!\u0005!\u02c0\b!\n!\f!\u02c3\t!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u02cd\b\"\n\"\f"+
		"\"\u02d0\t\"\u0001\"\u0001\"\u0005\"\u02d4\b\"\n\"\f\"\u02d7\t\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u02e1\b"+
		"#\n#\f#\u02e4\t#\u0001#\u0001#\u0005#\u02e8\b#\n#\f#\u02eb\t#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u02f6\b$\n$"+
		"\f$\u02f9\t$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0005"+
		"%\u0303\b%\n%\f%\u0306\t%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0005&\u030f\b&\n&\f&\u0312\t&\u0001&\u0001&\u0001&\u0005&\u0317\b&"+
		"\n&\f&\u031a\t&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0325\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0005"+
		"(\u032c\b(\n(\f(\u032f\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u033b\b)\n)\f)\u033e\t)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0005*\u0350\b*\n*\f*\u0353\t*\u0003*\u0355\b*"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0005+\u0364\b+\n+\f+\u0367\t+\u0003+\u0369\b+"+
		"\u0001,\u0001,\u0001,\u0005,\u036e\b,\n,\f,\u0371\t,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0003-\u037a\b-\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u0380\b-\u0001-\u0001-\u0001-\u0001-\u0003-\u0386\b-\u0003-\u0388"+
		"\b-\u0001.\u0001.\u0001.\u0005.\u038d\b.\n.\f.\u0390\t.\u0001.\u0001."+
		"\u0005.\u0394\b.\n.\f.\u0397\t.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0005/\u03a1\b/\n/\f/\u03a4\t/\u0001/\u0001/\u0005/\u03a8"+
		"\b/\n/\f/\u03ab\t/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00050\u03b5\b0\n0\f0\u03b8\t0\u00010\u00010\u00050\u03bc\b0\n0\f0\u03bf"+
		"\t0\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00051\u03c9"+
		"\b1\n1\f1\u03cc\t1\u00011\u00011\u00051\u03d0\b1\n1\f1\u03d3\t1\u0001"+
		"1\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00052\u03dd\b2\n2"+
		"\f2\u03e0\t2\u00012\u00012\u00052\u03e4\b2\n2\f2\u03e7\t2\u00012\u0005"+
		"2\u03ea\b2\n2\f2\u03ed\t2\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00053\u03f7\b3\n3\f3\u03fa\t3\u00013\u00013\u00053\u03fe\b3"+
		"\n3\f3\u0401\t3\u00013\u00053\u0404\b3\n3\f3\u0407\t3\u00013\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00034\u0411\b4\u00015\u00015\u0001"+
		"5\u00055\u0416\b5\n5\f5\u0419\t5\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00036\u0421\b6\u00017\u00017\u00017\u00017\u00037\u0427\b7\u00018\u0001"+
		"8\u00018\u00018\u00038\u042d\b8\u00018\u00018\u00018\u00038\u0432\b8\u0001"+
		"9\u00019\u00019\u00059\u0437\b9\n9\f9\u043a\t9\u00019\u00019\u00019\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u0443\b:\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0452"+
		"\b;\u0001<\u0004<\u0455\b<\u000b<\f<\u0456\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0005>\u0461\b>\n>\f>\u0464\t>\u0001>\u0003"+
		">\u0467\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0004B\u047a"+
		"\bB\u000bB\fB\u047b\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0003C\u048a\bC\u0001D\u0001D\u0001D\u0001"+
		"D\u0001E\u0005E\u0491\bE\nE\fE\u0494\tE\u0001E\u0001E\u0003E\u0498\bE"+
		"\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0003I\u04bb\bI\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0003J\u04c4\bJ\u0001K\u0001K\u0001K\u0003K\u04c9\bK\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0005L\u04de"+
		"\bL\nL\fL\u04e1\tL\u0001L\u0003L\u04e4\bL\u0001L\u0001L\u0001L\u0001L"+
		"\u0001L\u0001M\u0001M\u0005M\u04ed\bM\nM\fM\u04f0\tM\u0001M\u0001M\u0001"+
		"N\u0001N\u0001N\u0001N\u0005N\u04f8\bN\nN\fN\u04fb\tN\u0001N\u0003N\u04fe"+
		"\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0005N\u051c"+
		"\bN\nN\fN\u051f\tN\u0001O\u0001O\u0001O\u0001O\u0005O\u0525\bO\nO\fO\u0528"+
		"\tO\u0003O\u052a\bO\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0001S\u0001S\u0001T\u0001T\u0001T\u0000\u0001\u009cU\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u0000\t\u0003\u0000tt||~~\u0004\u0000\u001e"+
		" tu||~~\u0002\u0000uu||\u0002\u0000\u000b\u000b\u000f\u000f\u0001\u0000"+
		"\u0001\u0004\u0001\u000089\u0001\u0000CJ\u0001\u0000?A\u0001\u0000\')"+
		"\u05a6\u0000\u00ad\u0001\u0000\u0000\u0000\u0002\u00b8\u0001\u0000\u0000"+
		"\u0000\u0004\u00da\u0001\u0000\u0000\u0000\u0006\u00f5\u0001\u0000\u0000"+
		"\u0000\b\u00f7\u0001\u0000\u0000\u0000\n\u00fb\u0001\u0000\u0000\u0000"+
		"\f\u0106\u0001\u0000\u0000\u0000\u000e\u0115\u0001\u0000\u0000\u0000\u0010"+
		"\u0119\u0001\u0000\u0000\u0000\u0012\u0127\u0001\u0000\u0000\u0000\u0014"+
		"\u012b\u0001\u0000\u0000\u0000\u0016\u013b\u0001\u0000\u0000\u0000\u0018"+
		"\u0159\u0001\u0000\u0000\u0000\u001a\u0171\u0001\u0000\u0000\u0000\u001c"+
		"\u0173\u0001\u0000\u0000\u0000\u001e\u0195\u0001\u0000\u0000\u0000 \u0197"+
		"\u0001\u0000\u0000\u0000\"\u0199\u0001\u0000\u0000\u0000$\u01a1\u0001"+
		"\u0000\u0000\u0000&\u01bd\u0001\u0000\u0000\u0000(\u01ea\u0001\u0000\u0000"+
		"\u0000*\u01ef\u0001\u0000\u0000\u0000,\u01f1\u0001\u0000\u0000\u0000."+
		"\u0204\u0001\u0000\u0000\u00000\u0211\u0001\u0000\u0000\u00002\u0239\u0001"+
		"\u0000\u0000\u00004\u023b\u0001\u0000\u0000\u00006\u024f\u0001\u0000\u0000"+
		"\u00008\u0263\u0001\u0000\u0000\u0000:\u026e\u0001\u0000\u0000\u0000<"+
		"\u0279\u0001\u0000\u0000\u0000>\u028d\u0001\u0000\u0000\u0000@\u02a1\u0001"+
		"\u0000\u0000\u0000B\u02b5\u0001\u0000\u0000\u0000D\u02c9\u0001\u0000\u0000"+
		"\u0000F\u02dd\u0001\u0000\u0000\u0000H\u02f1\u0001\u0000\u0000\u0000J"+
		"\u02ff\u0001\u0000\u0000\u0000L\u030b\u0001\u0000\u0000\u0000N\u0320\u0001"+
		"\u0000\u0000\u0000P\u0326\u0001\u0000\u0000\u0000R\u0335\u0001\u0000\u0000"+
		"\u0000T\u0354\u0001\u0000\u0000\u0000V\u0368\u0001\u0000\u0000\u0000X"+
		"\u036a\u0001\u0000\u0000\u0000Z\u0387\u0001\u0000\u0000\u0000\\\u0389"+
		"\u0001\u0000\u0000\u0000^\u039d\u0001\u0000\u0000\u0000`\u03b1\u0001\u0000"+
		"\u0000\u0000b\u03c5\u0001\u0000\u0000\u0000d\u03d9\u0001\u0000\u0000\u0000"+
		"f\u03f3\u0001\u0000\u0000\u0000h\u0410\u0001\u0000\u0000\u0000j\u0412"+
		"\u0001\u0000\u0000\u0000l\u041c\u0001\u0000\u0000\u0000n\u0422\u0001\u0000"+
		"\u0000\u0000p\u0431\u0001\u0000\u0000\u0000r\u0433\u0001\u0000\u0000\u0000"+
		"t\u043e\u0001\u0000\u0000\u0000v\u0451\u0001\u0000\u0000\u0000x\u0454"+
		"\u0001\u0000\u0000\u0000z\u0458\u0001\u0000\u0000\u0000|\u045a\u0001\u0000"+
		"\u0000\u0000~\u0468\u0001\u0000\u0000\u0000\u0080\u046e\u0001\u0000\u0000"+
		"\u0000\u0082\u0471\u0001\u0000\u0000\u0000\u0084\u0477\u0001\u0000\u0000"+
		"\u0000\u0086\u0489\u0001\u0000\u0000\u0000\u0088\u048b\u0001\u0000\u0000"+
		"\u0000\u008a\u0492\u0001\u0000\u0000\u0000\u008c\u0499\u0001\u0000\u0000"+
		"\u0000\u008e\u049f\u0001\u0000\u0000\u0000\u0090\u04a7\u0001\u0000\u0000"+
		"\u0000\u0092\u04ba\u0001\u0000\u0000\u0000\u0094\u04c3\u0001\u0000\u0000"+
		"\u0000\u0096\u04c5\u0001\u0000\u0000\u0000\u0098\u04d0\u0001\u0000\u0000"+
		"\u0000\u009a\u04ea\u0001\u0000\u0000\u0000\u009c\u04fd\u0001\u0000\u0000"+
		"\u0000\u009e\u0529\u0001\u0000\u0000\u0000\u00a0\u052b\u0001\u0000\u0000"+
		"\u0000\u00a2\u052f\u0001\u0000\u0000\u0000\u00a4\u0531\u0001\u0000\u0000"+
		"\u0000\u00a6\u0533\u0001\u0000\u0000\u0000\u00a8\u0535\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ac\u0003\u0002\u0001\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b3\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\u0006\u0003"+
		"\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005\u0000\u0000\u0001\u00b7\u0001\u0001\u0000\u0000"+
		"\u0000\u00b8\u00d3\u0005\u0005\u0000\u0000\u00b9\u00cc\u0005\b\u0000\u0000"+
		"\u00ba\u00cc\u0003\u0004\u0002\u0000\u00bb\u00be\u0005j\u0000\u0000\u00bc"+
		"\u00bf\u0003\u0004\u0002\u0000\u00bd\u00bf\u0005g\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c3\u0005p\u0000\u0000\u00c1\u00c4\u0003"+
		"\u0004\u0002\u0000\u00c2\u00c4\u0005g\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0005k\u0000\u0000\u00cb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ba\u0001\u0000\u0000\u0000\u00cb\u00bb\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0006\u0000"+
		"\u0000\u00ce\u00d1\u0007\u0000\u0000\u0000\u00cf\u00d0\u0005\u0007\u0000"+
		"\u0000\u00d0\u00d2\u0003\u0004\u0002\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d3\u00cb\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d7\u0005t\u0000\u0000"+
		"\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005q\u0000\u0000\u00d9"+
		"\u0003\u0001\u0000\u0000\u0000\u00da\u00db\u0005|\u0000\u0000\u00db\u0005"+
		"\u0001\u0000\u0000\u0000\u00dc\u00f6\u0003|>\u0000\u00dd\u00f6\u0003\u0082"+
		"A\u0000\u00de\u00f6\u0003\u008cF\u0000\u00df\u00f6\u0003\u008eG\u0000"+
		"\u00e0\u00f6\u0003\u0090H\u0000\u00e1\u00f6\u0003\u0096K\u0000\u00e2\u00f6"+
		"\u0003\u0098L\u0000\u00e3\u00e4\u0003\u001e\u000f\u0000\u00e4\u00e5\u0005"+
		"q\u0000\u0000\u00e5\u00f6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003(\u0014"+
		"\u0000\u00e7\u00e8\u0005q\u0000\u0000\u00e8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0003\u009cN\u0000\u00ea\u00eb\u0005q\u0000\u0000\u00eb\u00f6"+
		"\u0001\u0000\u0000\u0000\u00ec\u00f6\u0003\u000e\u0007\u0000\u00ed\u00f6"+
		"\u0003\u0012\t\u0000\u00ee\u00f6\u0003\b\u0004\u0000\u00ef\u00f0\u0003"+
		"\u0018\f\u0000\u00f0\u00f1\u0005q\u0000\u0000\u00f1\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0003*\u0015\u0000\u00f3\u00f4\u0005q\u0000\u0000"+
		"\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00dc\u0001\u0000\u0000\u0000"+
		"\u00f5\u00dd\u0001\u0000\u0000\u0000\u00f5\u00de\u0001\u0000\u0000\u0000"+
		"\u00f5\u00df\u0001\u0000\u0000\u0000\u00f5\u00e0\u0001\u0000\u0000\u0000"+
		"\u00f5\u00e1\u0001\u0000\u0000\u0000\u00f5\u00e2\u0001\u0000\u0000\u0000"+
		"\u00f5\u00e3\u0001\u0000\u0000\u0000\u00f5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00f5\u00e9\u0001\u0000\u0000\u0000\u00f5\u00ec\u0001\u0000\u0000\u0000"+
		"\u00f5\u00ed\u0001\u0000\u0000\u0000\u00f5\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f6\u0007\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003\n\u0005\u0000\u00f8"+
		"\u00f9\u0003\f\u0006\u0000\u00f9\t\u0001\u0000\u0000\u0000\u00fa\u00fc"+
		"\u0005\t\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005"+
		"\b\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005\n\u0000"+
		"\u0000\u0101\u0104\u0005|\u0000\u0000\u0102\u0103\u00050\u0000\u0000\u0103"+
		"\u0105\u0005|\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u000b\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0005j\u0000\u0000\u0107\u0108\u00051\u0000\u0000\u0108\u0109\u0005h"+
		"\u0000\u0000\u0109\u010d\u0005i\u0000\u0000\u010a\u010c\u0003\u0006\u0003"+
		"\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u0110\u0112\u0003\u001c\u000e\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005k\u0000\u0000\u0114\r\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0003\u0010\b\u0000\u0116\u0117\u0003\u0016\u000b\u0000\u0117"+
		"\u000f\u0001\u0000\u0000\u0000\u0118\u011a\u0005\t\u0000\u0000\u0119\u0118"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011c"+
		"\u0001\u0000\u0000\u0000\u011b\u011d\u0005\b\u0000\u0000\u011c\u011b\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u0005+\u0000\u0000\u011f\u011e\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0005\u0010\u0000\u0000\u0122\u0123\u0005|\u0000"+
		"\u0000\u0123\u0124\u0005h\u0000\u0000\u0124\u0125\u0003\u001a\r\u0000"+
		"\u0125\u0126\u0005i\u0000\u0000\u0126\u0011\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0003\u0014\n\u0000\u0128\u0129\u0003\u0016\u000b\u0000\u0129\u0013"+
		"\u0001\u0000\u0000\u0000\u012a\u012c\u0005\t\u0000\u0000\u012b\u012a\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0001"+
		"\u0000\u0000\u0000\u012d\u012f\u0005\b\u0000\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0005(\u0000\u0000\u0131\u0132\u0005|\u0000\u0000"+
		"\u0132\u0134\u0005B\u0000\u0000\u0133\u0135\u0005+\u0000\u0000\u0134\u0133"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0005h\u0000\u0000\u0137\u0138\u0003"+
		"\u001a\r\u0000\u0138\u0139\u0005i\u0000\u0000\u0139\u013a\u0005n\u0000"+
		"\u0000\u013a\u0015\u0001\u0000\u0000\u0000\u013b\u013f\u0005j\u0000\u0000"+
		"\u013c\u013e\u0003\u0006\u0003\u0000\u013d\u013c\u0001\u0000\u0000\u0000"+
		"\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000"+
		"\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0144\u0003\u001c\u000e\u0000"+
		"\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0005k\u0000\u0000\u0146"+
		"\u0017\u0001\u0000\u0000\u0000\u0147\u0148\u0005|\u0000\u0000\u0148\u0149"+
		"\u0005h\u0000\u0000\u0149\u014a\u0003\u001a\r\u0000\u014a\u014b\u0005"+
		"i\u0000\u0000\u014b\u015a\u0001\u0000\u0000\u0000\u014c\u0151\u0005|\u0000"+
		"\u0000\u014d\u014e\u0005o\u0000\u0000\u014e\u0152\u0005|\u0000\u0000\u014f"+
		"\u0150\u0005o\u0000\u0000\u0150\u0152\u0005-\u0000\u0000\u0151\u014d\u0001"+
		"\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0153\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0005"+
		"h\u0000\u0000\u0156\u0157\u0003\u001a\r\u0000\u0157\u0158\u0005i\u0000"+
		"\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0147\u0001\u0000\u0000"+
		"\u0000\u0159\u014c\u0001\u0000\u0000\u0000\u015a\u0019\u0001\u0000\u0000"+
		"\u0000\u015b\u0163\u0003 \u0010\u0000\u015c\u015d\u0005|\u0000\u0000\u015d"+
		"\u0160\u0005o\u0000\u0000\u015e\u0161\u0005|\u0000\u0000\u015f\u0161\u0003"+
		"\u0018\f\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u015b\u0001\u0000"+
		"\u0000\u0000\u0162\u015c\u0001\u0000\u0000\u0000\u0163\u016e\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0005p\u0000\u0000\u0165\u016d\u0003 \u0010\u0000"+
		"\u0166\u0167\u0005|\u0000\u0000\u0167\u016a\u0005o\u0000\u0000\u0168\u016b"+
		"\u0005|\u0000\u0000\u0169\u016b\u0003\u0018\f\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016d\u0001"+
		"\u0000\u0000\u0000\u016c\u0164\u0001\u0000\u0000\u0000\u016c\u0166\u0001"+
		"\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0172\u0001"+
		"\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0162\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u001b\u0001"+
		"\u0000\u0000\u0000\u0173\u017d\u0005\u0011\u0000\u0000\u0174\u017e\u0005"+
		"|\u0000\u0000\u0175\u017e\u0005~\u0000\u0000\u0176\u017e\u0003\u009cN"+
		"\u0000\u0177\u017e\u0003\u0018\f\u0000\u0178\u017e\u0003z=\u0000\u0179"+
		"\u017a\u0005h\u0000\u0000\u017a\u017b\u00032\u0019\u0000\u017b\u017c\u0005"+
		"i\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u0174\u0001\u0000"+
		"\u0000\u0000\u017d\u0175\u0001\u0000\u0000\u0000\u017d\u0176\u0001\u0000"+
		"\u0000\u0000\u017d\u0177\u0001\u0000\u0000\u0000\u017d\u0178\u0001\u0000"+
		"\u0000\u0000\u017d\u0179\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0005q\u0000\u0000\u0180\u001d\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0003\u00a6S\u0000\u0182\u0185\u0005|\u0000\u0000\u0183"+
		"\u0184\u0005B\u0000\u0000\u0184\u0186\u0003\u009cN\u0000\u0185\u0183\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0196\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0005(\u0000\u0000\u0188\u0189\u0005|\u0000"+
		"\u0000\u0189\u018a\u0005B\u0000\u0000\u018a\u0192\u0005l\u0000\u0000\u018b"+
		"\u0193\u0003\"\u0011\u0000\u018c\u018e\u0003$\u0012\u0000\u018d\u018c"+
		"\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0193"+
		"\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u018b"+
		"\u0001\u0000\u0000\u0000\u0192\u018f\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0001\u0000\u0000\u0000\u0194\u0196\u0005m\u0000\u0000\u0195\u0181\u0001"+
		"\u0000\u0000\u0000\u0195\u0187\u0001\u0000\u0000\u0000\u0196\u001f\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0007\u0001\u0000\u0000\u0198!\u0001\u0000"+
		"\u0000\u0000\u0199\u019e\u0003 \u0010\u0000\u019a\u019b\u0005p\u0000\u0000"+
		"\u019b\u019d\u0003 \u0010\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d"+
		"\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019f#\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005j\u0000\u0000\u01a2\u01a7\u0003"+
		"&\u0013\u0000\u01a3\u01a4\u0005p\u0000\u0000\u01a4\u01a6\u0003&\u0013"+
		"\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0005k\u0000\u0000\u01ab\u01ba\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0005p\u0000\u0000\u01ad\u01ae\u0005j\u0000\u0000\u01ae\u01b3"+
		"\u0003&\u0013\u0000\u01af\u01b0\u0005p\u0000\u0000\u01b0\u01b2\u0003&"+
		"\u0013\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b7\u0005k\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b8\u01ac\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000"+
		"\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bb%\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0005|\u0000\u0000\u01be\u01c1\u0005r\u0000\u0000\u01bf\u01c2"+
		"\u0005|\u0000\u0000\u01c0\u01c2\u0003 \u0010\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\'\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0005|\u0000\u0000\u01c4\u01c9\u0005B\u0000\u0000\u01c5"+
		"\u01ca\u0005|\u0000\u0000\u01c6\u01ca\u0005~\u0000\u0000\u01c7\u01ca\u0003"+
		"\u0018\f\u0000\u01c8\u01ca\u0003\u009cN\u0000\u01c9\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c6\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca\u01eb\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0005|\u0000\u0000\u01cc\u01cd\u0005o\u0000\u0000"+
		"\u01cd\u01ce\u0005|\u0000\u0000\u01ce\u01d3\u0005B\u0000\u0000\u01cf\u01d4"+
		"\u0005|\u0000\u0000\u01d0\u01d4\u0005~\u0000\u0000\u01d1\u01d4\u0003\u0018"+
		"\f\u0000\u01d2\u01d4\u0003\u009cN\u0000\u01d3\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01eb\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d6\u0005!\u0000\u0000\u01d6\u01d7\u0005o\u0000\u0000\u01d7"+
		"\u01d8\u0005|\u0000\u0000\u01d8\u01dd\u0005B\u0000\u0000\u01d9\u01de\u0005"+
		"|\u0000\u0000\u01da\u01de\u0005~\u0000\u0000\u01db\u01de\u0003\u0018\f"+
		"\u0000\u01dc\u01de\u0003\u009cN\u0000\u01dd\u01d9\u0001\u0000\u0000\u0000"+
		"\u01dd\u01da\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000"+
		"\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de\u01eb\u0001\u0000\u0000\u0000"+
		"\u01df\u01e0\u0005|\u0000\u0000\u01e0\u01e1\u0005l\u0000\u0000\u01e1\u01e2"+
		"\u0007\u0002\u0000\u0000\u01e2\u01e3\u0005m\u0000\u0000\u01e3\u01e8\u0005"+
		"B\u0000\u0000\u01e4\u01e9\u0005|\u0000\u0000\u01e5\u01e9\u0005~\u0000"+
		"\u0000\u01e6\u01e9\u0003\u0018\f\u0000\u01e7\u01e9\u0003\u009cN\u0000"+
		"\u01e8\u01e4\u0001\u0000\u0000\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01c3\u0001\u0000\u0000\u0000"+
		"\u01ea\u01cb\u0001\u0000\u0000\u0000\u01ea\u01d5\u0001\u0000\u0000\u0000"+
		"\u01ea\u01df\u0001\u0000\u0000\u0000\u01eb)\u0001\u0000\u0000\u0000\u01ec"+
		"\u01f0\u00030\u0018\u0000\u01ed\u01f0\u0003,\u0016\u0000\u01ee\u01f0\u0003"+
		".\u0017\u0000\u01ef\u01ec\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0+\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0005g\u0000\u0000\u01f2\u01f3\u0005h\u0000\u0000\u01f3"+
		"\u01f4\u0005h\u0000\u0000\u01f4\u01f5\u0005i\u0000\u0000\u01f5\u01f6\u0005"+
		"n\u0000\u0000\u01f6\u01fa\u0005j\u0000\u0000\u01f7\u01f9\u0003\u0006\u0003"+
		"\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0005k\u0000\u0000\u01fe\u01ff\u0005p\u0000\u0000\u01ff"+
		"\u0200\u0005l\u0000\u0000\u0200\u0201\u0003\u001a\r\u0000\u0201\u0202"+
		"\u0005m\u0000\u0000\u0202\u0203\u0005i\u0000\u0000\u0203-\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0005(\u0000\u0000\u0205\u0206\u0005|\u0000\u0000"+
		"\u0206\u0207\u0005B\u0000\u0000\u0207\u0208\u0005g\u0000\u0000\u0208\u020c"+
		"\u0005h\u0000\u0000\u0209\u020b\u0003 \u0010\u0000\u020a\u0209\u0001\u0000"+
		"\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020f\u0001\u0000"+
		"\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0210\u0005i\u0000"+
		"\u0000\u0210/\u0001\u0000\u0000\u0000\u0211\u0212\u0005(\u0000\u0000\u0212"+
		"\u0213\u0005l\u0000\u0000\u0213\u0214\u0005|\u0000\u0000\u0214\u0215\u0005"+
		"p\u0000\u0000\u0215\u0216\u0005|\u0000\u0000\u0216\u0217\u0005m\u0000"+
		"\u0000\u0217\u0218\u0005B\u0000\u0000\u0218\u0219\u0005g\u0000\u0000\u0219"+
		"\u021d\u0005h\u0000\u0000\u021a\u021c\u0003 \u0010\u0000\u021b\u021a\u0001"+
		"\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0220\u0001"+
		"\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0221\u0005"+
		"i\u0000\u0000\u02211\u0001\u0000\u0000\u0000\u0222\u023a\u00034\u001a"+
		"\u0000\u0223\u023a\u00036\u001b\u0000\u0224\u023a\u0003<\u001e\u0000\u0225"+
		"\u023a\u0003>\u001f\u0000\u0226\u023a\u0003@ \u0000\u0227\u023a\u0003"+
		"B!\u0000\u0228\u023a\u0003D\"\u0000\u0229\u023a\u0003F#\u0000\u022a\u023a"+
		"\u0003H$\u0000\u022b\u023a\u0003J%\u0000\u022c\u023a\u0003L&\u0000\u022d"+
		"\u023a\u0003P(\u0000\u022e\u023a\u0003R)\u0000\u022f\u023a\u0003X,\u0000"+
		"\u0230\u023a\u0003\\.\u0000\u0231\u023a\u00038\u001c\u0000\u0232\u023a"+
		"\u0003:\u001d\u0000\u0233\u023a\u0003d2\u0000\u0234\u023a\u0003f3\u0000"+
		"\u0235\u023a\u0003^/\u0000\u0236\u023a\u0003`0\u0000\u0237\u023a\u0003"+
		"b1\u0000\u0238\u023a\u0003r9\u0000\u0239\u0222\u0001\u0000\u0000\u0000"+
		"\u0239\u0223\u0001\u0000\u0000\u0000\u0239\u0224\u0001\u0000\u0000\u0000"+
		"\u0239\u0225\u0001\u0000\u0000\u0000\u0239\u0226\u0001\u0000\u0000\u0000"+
		"\u0239\u0227\u0001\u0000\u0000\u0000\u0239\u0228\u0001\u0000\u0000\u0000"+
		"\u0239\u0229\u0001\u0000\u0000\u0000\u0239\u022a\u0001\u0000\u0000\u0000"+
		"\u0239\u022b\u0001\u0000\u0000\u0000\u0239\u022c\u0001\u0000\u0000\u0000"+
		"\u0239\u022d\u0001\u0000\u0000\u0000\u0239\u022e\u0001\u0000\u0000\u0000"+
		"\u0239\u022f\u0001\u0000\u0000\u0000\u0239\u0230\u0001\u0000\u0000\u0000"+
		"\u0239\u0231\u0001\u0000\u0000\u0000\u0239\u0232\u0001\u0000\u0000\u0000"+
		"\u0239\u0233\u0001\u0000\u0000\u0000\u0239\u0234\u0001\u0000\u0000\u0000"+
		"\u0239\u0235\u0001\u0000\u0000\u0000\u0239\u0236\u0001\u0000\u0000\u0000"+
		"\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u0238\u0001\u0000\u0000\u0000"+
		"\u023a3\u0001\u0000\u0000\u0000\u023b\u023c\u0005G\u0000\u0000\u023c\u0240"+
		"\u0005K\u0000\u0000\u023d\u023f\u0003p8\u0000\u023e\u023d\u0001\u0000"+
		"\u0000\u0000\u023f\u0242\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000"+
		"\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0243\u0001\u0000"+
		"\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0243\u0247\u0005H\u0000"+
		"\u0000\u0244\u0246\u0003v;\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0246"+
		"\u0249\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247"+
		"\u0248\u0001\u0000\u0000\u0000\u0248\u024a\u0001\u0000\u0000\u0000\u0249"+
		"\u0247\u0001\u0000\u0000\u0000\u024a\u024b\u0005G\u0000\u0000\u024b\u024c"+
		"\u00056\u0000\u0000\u024c\u024d\u0005K\u0000\u0000\u024d\u024e\u0005H"+
		"\u0000\u0000\u024e5\u0001\u0000\u0000\u0000\u024f\u0250\u0005G\u0000\u0000"+
		"\u0250\u0254\u0005L\u0000\u0000\u0251\u0253\u0003p8\u0000\u0252\u0251"+
		"\u0001\u0000\u0000\u0000\u0253\u0256\u0001\u0000\u0000\u0000\u0254\u0252"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0257"+
		"\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0257\u025b"+
		"\u0005H\u0000\u0000\u0258\u025a\u0003v;\u0000\u0259\u0258\u0001\u0000"+
		"\u0000\u0000\u025a\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000"+
		"\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025e\u0001\u0000"+
		"\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025e\u025f\u0005G\u0000"+
		"\u0000\u025f\u0260\u00056\u0000\u0000\u0260\u0261\u0005L\u0000\u0000\u0261"+
		"\u0262\u0005H\u0000\u0000\u02627\u0001\u0000\u0000\u0000\u0263\u0264\u0005"+
		"G\u0000\u0000\u0264\u0268\u0005]\u0000\u0000\u0265\u0267\u0003p8\u0000"+
		"\u0266\u0265\u0001\u0000\u0000\u0000\u0267\u026a\u0001\u0000\u0000\u0000"+
		"\u0268\u0266\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000"+
		"\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000"+
		"\u026b\u026c\u00056\u0000\u0000\u026c\u026d\u0005H\u0000\u0000\u026d9"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0005G\u0000\u0000\u026f\u0273\u0005"+
		"^\u0000\u0000\u0270\u0272\u0003p8\u0000\u0271\u0270\u0001\u0000\u0000"+
		"\u0000\u0272\u0275\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0276\u0001\u0000\u0000"+
		"\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0276\u0277\u00056\u0000\u0000"+
		"\u0277\u0278\u0005H\u0000\u0000\u0278;\u0001\u0000\u0000\u0000\u0279\u027a"+
		"\u0005G\u0000\u0000\u027a\u027e\u0005M\u0000\u0000\u027b\u027d\u0003p"+
		"8\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027d\u0280\u0001\u0000\u0000"+
		"\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000"+
		"\u0000\u027f\u0281\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000"+
		"\u0000\u0281\u0285\u0005H\u0000\u0000\u0282\u0284\u0003v;\u0000\u0283"+
		"\u0282\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000\u0000\u0285"+
		"\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286"+
		"\u0288\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u0005G\u0000\u0000\u0289\u028a\u00056\u0000\u0000\u028a\u028b\u0005"+
		"M\u0000\u0000\u028b\u028c\u0005H\u0000\u0000\u028c=\u0001\u0000\u0000"+
		"\u0000\u028d\u028e\u0005G\u0000\u0000\u028e\u0292\u0005N\u0000\u0000\u028f"+
		"\u0291\u0003p8\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291\u0294\u0001"+
		"\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292\u0293\u0001"+
		"\u0000\u0000\u0000\u0293\u0295\u0001\u0000\u0000\u0000\u0294\u0292\u0001"+
		"\u0000\u0000\u0000\u0295\u0299\u0005H\u0000\u0000\u0296\u0298\u0003v;"+
		"\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0298\u029b\u0001\u0000\u0000"+
		"\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000"+
		"\u0000\u029a\u029c\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000"+
		"\u0000\u029c\u029d\u0005G\u0000\u0000\u029d\u029e\u00056\u0000\u0000\u029e"+
		"\u029f\u0005N\u0000\u0000\u029f\u02a0\u0005H\u0000\u0000\u02a0?\u0001"+
		"\u0000\u0000\u0000\u02a1\u02a2\u0005G\u0000\u0000\u02a2\u02a6\u0005O\u0000"+
		"\u0000\u02a3\u02a5\u0003p8\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a9\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a9\u02ad\u0005H\u0000\u0000\u02aa\u02ac"+
		"\u0003v;\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ac\u02af\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0005G\u0000\u0000\u02b1\u02b2\u00056\u0000\u0000"+
		"\u02b2\u02b3\u0005O\u0000\u0000\u02b3\u02b4\u0005H\u0000\u0000\u02b4A"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005G\u0000\u0000\u02b6\u02ba\u0005"+
		"P\u0000\u0000\u02b7\u02b9\u0003p8\u0000\u02b8\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bd\u0001\u0000\u0000"+
		"\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd\u02c1\u0005H\u0000\u0000"+
		"\u02be\u02c0\u0003v;\u0000\u02bf\u02be\u0001\u0000\u0000\u0000\u02c0\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c4\u0001\u0000\u0000\u0000\u02c3\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005G\u0000\u0000\u02c5\u02c6\u0005"+
		"6\u0000\u0000\u02c6\u02c7\u0005P\u0000\u0000\u02c7\u02c8\u0005H\u0000"+
		"\u0000\u02c8C\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005G\u0000\u0000\u02ca"+
		"\u02ce\u0005Q\u0000\u0000\u02cb\u02cd\u0003p8\u0000\u02cc\u02cb\u0001"+
		"\u0000\u0000\u0000\u02cd\u02d0\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001"+
		"\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d1\u02d5\u0005"+
		"H\u0000\u0000\u02d2\u02d4\u0003v;\u0000\u02d3\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d7\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d8\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005G\u0000\u0000"+
		"\u02d9\u02da\u00056\u0000\u0000\u02da\u02db\u0005Q\u0000\u0000\u02db\u02dc"+
		"\u0005H\u0000\u0000\u02dcE\u0001\u0000\u0000\u0000\u02dd\u02de\u0005G"+
		"\u0000\u0000\u02de\u02e2\u0005R\u0000\u0000\u02df\u02e1\u0003p8\u0000"+
		"\u02e0\u02df\u0001\u0000\u0000\u0000\u02e1\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e5\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e9\u0005H\u0000\u0000\u02e6\u02e8\u0003v;\u0000\u02e7\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000\u0000\u0000\u02e9\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02ec"+
		"\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02ec\u02ed"+
		"\u0005G\u0000\u0000\u02ed\u02ee\u00056\u0000\u0000\u02ee\u02ef\u0005R"+
		"\u0000\u0000\u02ef\u02f0\u0005H\u0000\u0000\u02f0G\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f2\u0005G\u0000\u0000\u02f2\u02f3\u0005S\u0000\u0000\u02f3\u02f7"+
		"\u0005H\u0000\u0000\u02f4\u02f6\u0003v;\u0000\u02f5\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0001\u0000"+
		"\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005G\u0000"+
		"\u0000\u02fb\u02fc\u00056\u0000\u0000\u02fc\u02fd\u0005S\u0000\u0000\u02fd"+
		"\u02fe\u0005H\u0000\u0000\u02feI\u0001\u0000\u0000\u0000\u02ff\u0300\u0005"+
		"G\u0000\u0000\u0300\u0304\u0005T\u0000\u0000\u0301\u0303\u0003p8\u0000"+
		"\u0302\u0301\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000\u0000"+
		"\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000"+
		"\u0305\u0307\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0307\u0308\u0003l6\u0000\u0308\u0309\u00056\u0000\u0000\u0309\u030a"+
		"\u0005H\u0000\u0000\u030aK\u0001\u0000\u0000\u0000\u030b\u030c\u0005G"+
		"\u0000\u0000\u030c\u0310\u0005U\u0000\u0000\u030d\u030f\u0003p8\u0000"+
		"\u030e\u030d\u0001\u0000\u0000\u0000\u030f\u0312\u0001\u0000\u0000\u0000"+
		"\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000\u0000"+
		"\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000"+
		"\u0313\u0314\u0003N\'\u0000\u0314\u0318\u0005H\u0000\u0000\u0315\u0317"+
		"\u0003v;\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0317\u031a\u0001\u0000"+
		"\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000"+
		"\u0000\u0000\u0319\u031b\u0001\u0000\u0000\u0000\u031a\u0318\u0001\u0000"+
		"\u0000\u0000\u031b\u031c\u0005G\u0000\u0000\u031c\u031d\u00056\u0000\u0000"+
		"\u031d\u031e\u0005U\u0000\u0000\u031e\u031f\u0005H\u0000\u0000\u031fM"+
		"\u0001\u0000\u0000\u0000\u0320\u0321\u0005\r\u0000\u0000\u0321\u0324\u0005"+
		"B\u0000\u0000\u0322\u0325\u0005}\u0000\u0000\u0323\u0325\u0005t\u0000"+
		"\u0000\u0324\u0322\u0001\u0000\u0000\u0000\u0324\u0323\u0001\u0000\u0000"+
		"\u0000\u0325O\u0001\u0000\u0000\u0000\u0326\u0327\u0005G\u0000\u0000\u0327"+
		"\u0328\u0005V\u0000\u0000\u0328\u0329\u0003V+\u0000\u0329\u032d\u0005"+
		"H\u0000\u0000\u032a\u032c\u0003v;\u0000\u032b\u032a\u0001\u0000\u0000"+
		"\u0000\u032c\u032f\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0330\u0001\u0000\u0000"+
		"\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u0330\u0331\u0005G\u0000\u0000"+
		"\u0331\u0332\u00056\u0000\u0000\u0332\u0333\u0005V\u0000\u0000\u0333\u0334"+
		"\u0005H\u0000\u0000\u0334Q\u0001\u0000\u0000\u0000\u0335\u0336\u0005G"+
		"\u0000\u0000\u0336\u0337\u0005_\u0000\u0000\u0337\u0338\u0003T*\u0000"+
		"\u0338\u033c\u0005H\u0000\u0000\u0339\u033b\u0003v;\u0000\u033a\u0339"+
		"\u0001\u0000\u0000\u0000\u033b\u033e\u0001\u0000\u0000\u0000\u033c\u033a"+
		"\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u033f"+
		"\u0001\u0000\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033f\u0340"+
		"\u0005G\u0000\u0000\u0340\u0341\u00056\u0000\u0000\u0341\u0342\u0005_"+
		"\u0000\u0000\u0342\u0343\u0005H\u0000\u0000\u0343S\u0001\u0000\u0000\u0000"+
		"\u0344\u0345\u0005e\u0000\u0000\u0345\u0346\u0005B\u0000\u0000\u0346\u0347"+
		"\u0005j\u0000\u0000\u0347\u0348\u0005h\u0000\u0000\u0348\u0349\u0003\u001a"+
		"\r\u0000\u0349\u034a\u0005i\u0000\u0000\u034a\u034b\u0005n\u0000\u0000"+
		"\u034b\u034c\u0003\u0018\f\u0000\u034c\u034d\u0005k\u0000\u0000\u034d"+
		"\u0355\u0001\u0000\u0000\u0000\u034e\u0350\u0003p8\u0000\u034f\u034e\u0001"+
		"\u0000\u0000\u0000\u0350\u0353\u0001\u0000\u0000\u0000\u0351\u034f\u0001"+
		"\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u0355\u0001"+
		"\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0354\u0344\u0001"+
		"\u0000\u0000\u0000\u0354\u0351\u0001\u0000\u0000\u0000\u0355U\u0001\u0000"+
		"\u0000\u0000\u0356\u0357\u0005d\u0000\u0000\u0357\u0358\u0005B\u0000\u0000"+
		"\u0358\u0359\u0005j\u0000\u0000\u0359\u035a\u0005h\u0000\u0000\u035a\u035b"+
		"\u0003\u001a\r\u0000\u035b\u035c\u0005i\u0000\u0000\u035c\u035d\u0005"+
		"n\u0000\u0000\u035d\u035e\u0005j\u0000\u0000\u035e\u035f\u0003\u0018\f"+
		"\u0000\u035f\u0360\u0005k\u0000\u0000\u0360\u0361\u0005k\u0000\u0000\u0361"+
		"\u0369\u0001\u0000\u0000\u0000\u0362\u0364\u0003p8\u0000\u0363\u0362\u0001"+
		"\u0000\u0000\u0000\u0364\u0367\u0001\u0000\u0000\u0000\u0365\u0363\u0001"+
		"\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0369\u0001"+
		"\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0368\u0356\u0001"+
		"\u0000\u0000\u0000\u0368\u0365\u0001\u0000\u0000\u0000\u0369W\u0001\u0000"+
		"\u0000\u0000\u036a\u036b\u0005G\u0000\u0000\u036b\u036f\u0005`\u0000\u0000"+
		"\u036c\u036e\u0003Z-\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036e\u0371"+
		"\u0001\u0000\u0000\u0000\u036f\u036d\u0001\u0000\u0000\u0000\u036f\u0370"+
		"\u0001\u0000\u0000\u0000\u0370\u0372\u0001\u0000\u0000\u0000\u0371\u036f"+
		"\u0001\u0000\u0000\u0000\u0372\u0373\u00056\u0000\u0000\u0373\u0374\u0005"+
		"H\u0000\u0000\u0374Y\u0001\u0000\u0000\u0000\u0375\u0376\u00052\u0000"+
		"\u0000\u0376\u0379\u0005B\u0000\u0000\u0377\u037a\u0005}\u0000\u0000\u0378"+
		"\u037a\u0005t\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u0378"+
		"\u0001\u0000\u0000\u0000\u037a\u0388\u0001\u0000\u0000\u0000\u037b\u037c"+
		"\u0005c\u0000\u0000\u037c\u037f\u0005B\u0000\u0000\u037d\u0380\u0005}"+
		"\u0000\u0000\u037e\u0380\u0005t\u0000\u0000\u037f\u037d\u0001\u0000\u0000"+
		"\u0000\u037f\u037e\u0001\u0000\u0000\u0000\u0380\u0388\u0001\u0000\u0000"+
		"\u0000\u0381\u0382\u0005b\u0000\u0000\u0382\u0385\u0005B\u0000\u0000\u0383"+
		"\u0386\u0005}\u0000\u0000\u0384\u0386\u0005t\u0000\u0000\u0385\u0383\u0001"+
		"\u0000\u0000\u0000\u0385\u0384\u0001\u0000\u0000\u0000\u0386\u0388\u0001"+
		"\u0000\u0000\u0000\u0387\u0375\u0001\u0000\u0000\u0000\u0387\u037b\u0001"+
		"\u0000\u0000\u0000\u0387\u0381\u0001\u0000\u0000\u0000\u0388[\u0001\u0000"+
		"\u0000\u0000\u0389\u038a\u0005G\u0000\u0000\u038a\u038e\u0005a\u0000\u0000"+
		"\u038b\u038d\u0003p8\u0000\u038c\u038b\u0001\u0000\u0000\u0000\u038d\u0390"+
		"\u0001\u0000\u0000\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038f"+
		"\u0001\u0000\u0000\u0000\u038f\u0391\u0001\u0000\u0000\u0000\u0390\u038e"+
		"\u0001\u0000\u0000\u0000\u0391\u0395\u0005H\u0000\u0000\u0392\u0394\u0003"+
		"v;\u0000\u0393\u0392\u0001\u0000\u0000\u0000\u0394\u0397\u0001\u0000\u0000"+
		"\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000"+
		"\u0000\u0396\u0398\u0001\u0000\u0000\u0000\u0397\u0395\u0001\u0000\u0000"+
		"\u0000\u0398\u0399\u0005G\u0000\u0000\u0399\u039a\u00056\u0000\u0000\u039a"+
		"\u039b\u0005a\u0000\u0000\u039b\u039c\u0005H\u0000\u0000\u039c]\u0001"+
		"\u0000\u0000\u0000\u039d\u039e\u0005G\u0000\u0000\u039e\u03a2\u0005Y\u0000"+
		"\u0000\u039f\u03a1\u0003p8\u0000\u03a0\u039f\u0001\u0000\u0000\u0000\u03a1"+
		"\u03a4\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2"+
		"\u03a3\u0001\u0000\u0000\u0000\u03a3\u03a5\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a9\u0005H\u0000\u0000\u03a6\u03a8"+
		"\u0003v;\u0000\u03a7\u03a6\u0001\u0000\u0000\u0000\u03a8\u03ab\u0001\u0000"+
		"\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000"+
		"\u0000\u0000\u03aa\u03ac\u0001\u0000\u0000\u0000\u03ab\u03a9\u0001\u0000"+
		"\u0000\u0000\u03ac\u03ad\u0005G\u0000\u0000\u03ad\u03ae\u00056\u0000\u0000"+
		"\u03ae\u03af\u0005Y\u0000\u0000\u03af\u03b0\u0005H\u0000\u0000\u03b0_"+
		"\u0001\u0000\u0000\u0000\u03b1\u03b2\u0005G\u0000\u0000\u03b2\u03b6\u0005"+
		"Z\u0000\u0000\u03b3\u03b5\u0003p8\u0000\u03b4\u03b3\u0001\u0000\u0000"+
		"\u0000\u03b5\u03b8\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b9\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b9\u03bd\u0005H\u0000\u0000"+
		"\u03ba\u03bc\u0003v;\u0000\u03bb\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bf"+
		"\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000\u03bd\u03be"+
		"\u0001\u0000\u0000\u0000\u03be\u03c0\u0001\u0000\u0000\u0000\u03bf\u03bd"+
		"\u0001\u0000\u0000\u0000\u03c0\u03c1\u0005G\u0000\u0000\u03c1\u03c2\u0005"+
		"6\u0000\u0000\u03c2\u03c3\u0005Z\u0000\u0000\u03c3\u03c4\u0005H\u0000"+
		"\u0000\u03c4a\u0001\u0000\u0000\u0000\u03c5\u03c6\u0005G\u0000\u0000\u03c6"+
		"\u03ca\u0005[\u0000\u0000\u03c7\u03c9\u0003p8\u0000\u03c8\u03c7\u0001"+
		"\u0000\u0000\u0000\u03c9\u03cc\u0001\u0000\u0000\u0000\u03ca\u03c8\u0001"+
		"\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000\u03cb\u03cd\u0001"+
		"\u0000\u0000\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cd\u03d1\u0005"+
		"H\u0000\u0000\u03ce\u03d0\u0003v;\u0000\u03cf\u03ce\u0001\u0000\u0000"+
		"\u0000\u03d0\u03d3\u0001\u0000\u0000\u0000\u03d1\u03cf\u0001\u0000\u0000"+
		"\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2\u03d4\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d1\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005G\u0000\u0000"+
		"\u03d5\u03d6\u00056\u0000\u0000\u03d6\u03d7\u0005[\u0000\u0000\u03d7\u03d8"+
		"\u0005H\u0000\u0000\u03d8c\u0001\u0000\u0000\u0000\u03d9\u03da\u0005G"+
		"\u0000\u0000\u03da\u03de\u0005W\u0000\u0000\u03db\u03dd\u0003h4\u0000"+
		"\u03dc\u03db\u0001\u0000\u0000\u0000\u03dd\u03e0\u0001\u0000\u0000\u0000"+
		"\u03de\u03dc\u0001\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000"+
		"\u03df\u03e1\u0001\u0000\u0000\u0000\u03e0\u03de\u0001\u0000\u0000\u0000"+
		"\u03e1\u03e5\u0005H\u0000\u0000\u03e2\u03e4\u0003j5\u0000\u03e3\u03e2"+
		"\u0001\u0000\u0000\u0000\u03e4\u03e7\u0001\u0000\u0000\u0000\u03e5\u03e3"+
		"\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03eb"+
		"\u0001\u0000\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e8\u03ea"+
		"\u0005|\u0000\u0000\u03e9\u03e8\u0001\u0000\u0000\u0000\u03ea\u03ed\u0001"+
		"\u0000\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ee\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001"+
		"\u0000\u0000\u0000\u03ee\u03ef\u0005G\u0000\u0000\u03ef\u03f0\u00056\u0000"+
		"\u0000\u03f0\u03f1\u0005W\u0000\u0000\u03f1\u03f2\u0005H\u0000\u0000\u03f2"+
		"e\u0001\u0000\u0000\u0000\u03f3\u03f4\u0005G\u0000\u0000\u03f4\u03f8\u0005"+
		"X\u0000\u0000\u03f5\u03f7\u0003h4\u0000\u03f6\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f7\u03fa\u0001\u0000\u0000\u0000\u03f8\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fb\u0001\u0000\u0000"+
		"\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000\u03fb\u03ff\u0005H\u0000\u0000"+
		"\u03fc\u03fe\u0003j5\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fe\u0401"+
		"\u0001\u0000\u0000\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff\u0400"+
		"\u0001\u0000\u0000\u0000\u0400\u0405\u0001\u0000\u0000\u0000\u0401\u03ff"+
		"\u0001\u0000\u0000\u0000\u0402\u0404\u0005|\u0000\u0000\u0403\u0402\u0001"+
		"\u0000\u0000\u0000\u0404\u0407\u0001\u0000\u0000\u0000\u0405\u0403\u0001"+
		"\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406\u0408\u0001"+
		"\u0000\u0000\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0408\u0409\u0005"+
		"G\u0000\u0000\u0409\u040a\u00056\u0000\u0000\u040a\u040b\u0005X\u0000"+
		"\u0000\u040b\u040c\u0005H\u0000\u0000\u040cg\u0001\u0000\u0000\u0000\u040d"+
		"\u0411\u0003l6\u0000\u040e\u0411\u0003n7\u0000\u040f\u0411\u0003p8\u0000"+
		"\u0410\u040d\u0001\u0000\u0000\u0000\u0410\u040e\u0001\u0000\u0000\u0000"+
		"\u0410\u040f\u0001\u0000\u0000\u0000\u0411i\u0001\u0000\u0000\u0000\u0412"+
		"\u0413\u0005G\u0000\u0000\u0413\u0417\u0005\\\u0000\u0000\u0414\u0416"+
		"\u0003h4\u0000\u0415\u0414\u0001\u0000\u0000\u0000\u0416\u0419\u0001\u0000"+
		"\u0000\u0000\u0417\u0415\u0001\u0000\u0000\u0000\u0417\u0418\u0001\u0000"+
		"\u0000\u0000\u0418\u041a\u0001\u0000\u0000\u0000\u0419\u0417\u0001\u0000"+
		"\u0000\u0000\u041a\u041b\u0005H\u0000\u0000\u041bk\u0001\u0000\u0000\u0000"+
		"\u041c\u041d\u0005\f\u0000\u0000\u041d\u0420\u0005B\u0000\u0000\u041e"+
		"\u0421\u0005}\u0000\u0000\u041f\u0421\u0005t\u0000\u0000\u0420\u041e\u0001"+
		"\u0000\u0000\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0421m\u0001\u0000"+
		"\u0000\u0000\u0422\u0423\u00052\u0000\u0000\u0423\u0426\u0005B\u0000\u0000"+
		"\u0424\u0427\u0005}\u0000\u0000\u0425\u0427\u0005t\u0000\u0000\u0426\u0424"+
		"\u0001\u0000\u0000\u0000\u0426\u0425\u0001\u0000\u0000\u0000\u0427o\u0001"+
		"\u0000\u0000\u0000\u0428\u0429\u0007\u0003\u0000\u0000\u0429\u042c\u0005"+
		"B\u0000\u0000\u042a\u042d\u0005}\u0000\u0000\u042b\u042d\u0005t\u0000"+
		"\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042c\u042b\u0001\u0000\u0000"+
		"\u0000\u042d\u0432\u0001\u0000\u0000\u0000\u042e\u042f\u0005f\u0000\u0000"+
		"\u042f\u0430\u0005B\u0000\u0000\u0430\u0432\u0005}\u0000\u0000\u0431\u0428"+
		"\u0001\u0000\u0000\u0000\u0431\u042e\u0001\u0000\u0000\u0000\u0432q\u0001"+
		"\u0000\u0000\u0000\u0433\u0434\u0005G\u0000\u0000\u0434\u0438\u0005|\u0000"+
		"\u0000\u0435\u0437\u0003t:\u0000\u0436\u0435\u0001\u0000\u0000\u0000\u0437"+
		"\u043a\u0001\u0000\u0000\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438"+
		"\u0439\u0001\u0000\u0000\u0000\u0439\u043b\u0001\u0000\u0000\u0000\u043a"+
		"\u0438\u0001\u0000\u0000\u0000\u043b\u043c\u00056\u0000\u0000\u043c\u043d"+
		"\u0005H\u0000\u0000\u043ds\u0001\u0000\u0000\u0000\u043e\u043f\u0005|"+
		"\u0000\u0000\u043f\u0442\u0005B\u0000\u0000\u0440\u0443\u0005}\u0000\u0000"+
		"\u0441\u0443\u0003 \u0010\u0000\u0442\u0440\u0001\u0000\u0000\u0000\u0442"+
		"\u0441\u0001\u0000\u0000\u0000\u0443u\u0001\u0000\u0000\u0000\u0444\u0452"+
		"\u00032\u0019\u0000\u0445\u0446\u0005j\u0000\u0000\u0446\u0447\u0003\u009c"+
		"N\u0000\u0447\u0448\u0005k\u0000\u0000\u0448\u0452\u0001\u0000\u0000\u0000"+
		"\u0449\u0452\u0003x<\u0000\u044a\u0452\u0003|>\u0000\u044b\u0452\u0003"+
		"\u0082A\u0000\u044c\u0452\u0003\u008cF\u0000\u044d\u0452\u0003\u008eG"+
		"\u0000\u044e\u0452\u0003\u0090H\u0000\u044f\u0452\u0003\u0096K\u0000\u0450"+
		"\u0452\u0003\u0098L\u0000\u0451\u0444\u0001\u0000\u0000\u0000\u0451\u0445"+
		"\u0001\u0000\u0000\u0000\u0451\u0449\u0001\u0000\u0000\u0000\u0451\u044a"+
		"\u0001\u0000\u0000\u0000\u0451\u044b\u0001\u0000\u0000\u0000\u0451\u044c"+
		"\u0001\u0000\u0000\u0000\u0451\u044d\u0001\u0000\u0000\u0000\u0451\u044e"+
		"\u0001\u0000\u0000\u0000\u0451\u044f\u0001\u0000\u0000\u0000\u0451\u0450"+
		"\u0001\u0000\u0000\u0000\u0452w\u0001\u0000\u0000\u0000\u0453\u0455\u0005"+
		"|\u0000\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0455\u0456\u0001\u0000"+
		"\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0456\u0457\u0001\u0000"+
		"\u0000\u0000\u0457y\u0001\u0000\u0000\u0000\u0458\u0459\u0003\u009eO\u0000"+
		"\u0459{\u0001\u0000\u0000\u0000\u045a\u045b\u0005\u0012\u0000\u0000\u045b"+
		"\u045c\u0005h\u0000\u0000\u045c\u045d\u0003z=\u0000\u045d\u045e\u0005"+
		"i\u0000\u0000\u045e\u0466\u0003\u009aM\u0000\u045f\u0461\u0003~?\u0000"+
		"\u0460\u045f\u0001\u0000\u0000\u0000\u0461\u0464\u0001\u0000\u0000\u0000"+
		"\u0462\u0460\u0001\u0000\u0000\u0000\u0462\u0463\u0001\u0000\u0000\u0000"+
		"\u0463\u0465\u0001\u0000\u0000\u0000\u0464\u0462\u0001\u0000\u0000\u0000"+
		"\u0465\u0467\u0003\u0080@\u0000\u0466\u0462\u0001\u0000\u0000\u0000\u0466"+
		"\u0467\u0001\u0000\u0000\u0000\u0467}\u0001\u0000\u0000\u0000\u0468\u0469"+
		"\u0005\u0014\u0000\u0000\u0469\u046a\u0005h\u0000\u0000\u046a\u046b\u0003"+
		"z=\u0000\u046b\u046c\u0005i\u0000\u0000\u046c\u046d\u0003\u009aM\u0000"+
		"\u046d\u007f\u0001\u0000\u0000\u0000\u046e\u046f\u0005\u0013\u0000\u0000"+
		"\u046f\u0470\u0003\u009aM\u0000\u0470\u0081\u0001\u0000\u0000\u0000\u0471"+
		"\u0472\u0005\u0015\u0000\u0000\u0472\u0473\u0005h\u0000\u0000\u0473\u0474"+
		"\u0005|\u0000\u0000\u0474\u0475\u0005i\u0000\u0000\u0475\u0476\u0003\u0084"+
		"B\u0000\u0476\u0083\u0001\u0000\u0000\u0000\u0477\u0479\u0005j\u0000\u0000"+
		"\u0478\u047a\u0003\u0086C\u0000\u0479\u0478\u0001\u0000\u0000\u0000\u047a"+
		"\u047b\u0001\u0000\u0000\u0000\u047b\u0479\u0001\u0000\u0000\u0000\u047b"+
		"\u047c\u0001\u0000\u0000\u0000\u047c\u047d\u0001\u0000\u0000\u0000\u047d"+
		"\u047e\u0003\u0088D\u0000\u047e\u047f\u0005k\u0000\u0000\u047f\u0085\u0001"+
		"\u0000\u0000\u0000\u0480\u0481\u0005\u0016\u0000\u0000\u0481\u0482\u0003"+
		"\u00a8T\u0000\u0482\u0483\u0005r\u0000\u0000\u0483\u0484\u0003\u008aE"+
		"\u0000\u0484\u048a\u0001\u0000\u0000\u0000\u0485\u0486\u0005\u0016\u0000"+
		"\u0000\u0486\u0487\u0005~\u0000\u0000\u0487\u0488\u0005r\u0000\u0000\u0488"+
		"\u048a\u0003\u008aE\u0000\u0489\u0480\u0001\u0000\u0000\u0000\u0489\u0485"+
		"\u0001\u0000\u0000\u0000\u048a\u0087\u0001\u0000\u0000\u0000\u048b\u048c"+
		"\u0005\b\u0000\u0000\u048c\u048d\u0005r\u0000\u0000\u048d\u048e\u0003"+
		"\u008aE\u0000\u048e\u0089\u0001\u0000\u0000\u0000\u048f\u0491\u0003\u0006"+
		"\u0003\u0000\u0490\u048f\u0001\u0000\u0000\u0000\u0491\u0494\u0001\u0000"+
		"\u0000\u0000\u0492\u0490\u0001\u0000\u0000\u0000\u0492\u0493\u0001\u0000"+
		"\u0000\u0000\u0493\u0497\u0001\u0000\u0000\u0000\u0494\u0492\u0001\u0000"+
		"\u0000\u0000\u0495\u0496\u0005\u001a\u0000\u0000\u0496\u0498\u0005q\u0000"+
		"\u0000\u0497\u0495\u0001\u0000\u0000\u0000\u0497\u0498\u0001\u0000\u0000"+
		"\u0000\u0498\u008b\u0001\u0000\u0000\u0000\u0499\u049a\u0005\u0019\u0000"+
		"\u0000\u049a\u049b\u0005h\u0000\u0000\u049b\u049c\u0003z=\u0000\u049c"+
		"\u049d\u0005i\u0000\u0000\u049d\u049e\u0003\u009aM\u0000\u049e\u008d\u0001"+
		"\u0000\u0000\u0000\u049f\u04a0\u0005\u0017\u0000\u0000\u04a0\u04a1\u0003"+
		"\u009aM\u0000\u04a1\u04a2\u0005\u0019\u0000\u0000\u04a2\u04a3\u0005h\u0000"+
		"\u0000\u04a3\u04a4\u0003z=\u0000\u04a4\u04a5\u0005i\u0000\u0000\u04a5"+
		"\u04a6\u0005q\u0000\u0000\u04a6\u008f\u0001\u0000\u0000\u0000\u04a7\u04a8"+
		"\u0005\u0018\u0000\u0000\u04a8\u04a9\u0005h\u0000\u0000\u04a9\u04aa\u0003"+
		"\u0092I\u0000\u04aa\u04ab\u0005q\u0000\u0000\u04ab\u04ac\u0003z=\u0000"+
		"\u04ac\u04ad\u0005q\u0000\u0000\u04ad\u04ae\u0003\u0094J\u0000\u04ae\u04af"+
		"\u0005i\u0000\u0000\u04af\u04b0\u0003\u009aM\u0000\u04b0\u0091\u0001\u0000"+
		"\u0000\u0000\u04b1\u04b2\u0003\u00a6S\u0000\u04b2\u04b3\u0005|\u0000\u0000"+
		"\u04b3\u04b4\u0005B\u0000\u0000\u04b4\u04b5\u0003\u009cN\u0000\u04b5\u04bb"+
		"\u0001\u0000\u0000\u0000\u04b6\u04b7\u0005|\u0000\u0000\u04b7\u04b8\u0005"+
		"B\u0000\u0000\u04b8\u04bb\u0003\u009cN\u0000\u04b9\u04bb\u0005|\u0000"+
		"\u0000\u04ba\u04b1\u0001\u0000\u0000\u0000\u04ba\u04b6\u0001\u0000\u0000"+
		"\u0000\u04ba\u04b9\u0001\u0000\u0000\u0000\u04bb\u0093\u0001\u0000\u0000"+
		"\u0000\u04bc\u04bd\u0005|\u0000\u0000\u04bd\u04be\u0007\u0004\u0000\u0000"+
		"\u04be\u04c4\u0003\u009cN\u0000\u04bf\u04c0\u0005|\u0000\u0000\u04c0\u04c4"+
		"\u0007\u0005\u0000\u0000\u04c1\u04c2\u0007\u0005\u0000\u0000\u04c2\u04c4"+
		"\u0005|\u0000\u0000\u04c3\u04bc\u0001\u0000\u0000\u0000\u04c3\u04bf\u0001"+
		"\u0000\u0000\u0000\u04c3\u04c1\u0001\u0000\u0000\u0000\u04c4\u0095\u0001"+
		"\u0000\u0000\u0000\u04c5\u04c6\u0005\u001b\u0000\u0000\u04c6\u04c8\u0005"+
		"h\u0000\u0000\u04c7\u04c9\u0003\u00a6S\u0000\u04c8\u04c7\u0001\u0000\u0000"+
		"\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000"+
		"\u0000\u04ca\u04cb\u0005|\u0000\u0000\u04cb\u04cc\u0005/\u0000\u0000\u04cc"+
		"\u04cd\u0005|\u0000\u0000\u04cd\u04ce\u0005i\u0000\u0000\u04ce\u04cf\u0003"+
		"\u009aM\u0000\u04cf\u0097\u0001\u0000\u0000\u0000\u04d0\u04d1\u0005j\u0000"+
		"\u0000\u04d1\u04d2\u0005|\u0000\u0000\u04d2\u04d3\u0005o\u0000\u0000\u04d3"+
		"\u04d4\u0005\u001c\u0000\u0000\u04d4\u04d5\u0005h\u0000\u0000\u04d5\u04d6"+
		"\u0005h\u0000\u0000\u04d6\u04d7\u0003\u001a\r\u0000\u04d7\u04d8\u0005"+
		"i\u0000\u0000\u04d8\u04d9\u0005n\u0000\u0000\u04d9\u04da\u0005j\u0000"+
		"\u0000\u04da\u04db\u0005\u0011\u0000\u0000\u04db\u04e3\u0005h\u0000\u0000"+
		"\u04dc\u04de\u0003\u009aM\u0000\u04dd\u04dc\u0001\u0000\u0000\u0000\u04de"+
		"\u04e1\u0001\u0000\u0000\u0000\u04df\u04dd\u0001\u0000\u0000\u0000\u04df"+
		"\u04e0\u0001\u0000\u0000\u0000\u04e0\u04e4\u0001\u0000\u0000\u0000\u04e1"+
		"\u04df\u0001\u0000\u0000\u0000\u04e2\u04e4\u00032\u0019\u0000\u04e3\u04df"+
		"\u0001\u0000\u0000\u0000\u04e3\u04e2\u0001\u0000\u0000\u0000\u04e4\u04e5"+
		"\u0001\u0000\u0000\u0000\u04e5\u04e6\u0005i\u0000\u0000\u04e6\u04e7\u0005"+
		"k\u0000\u0000\u04e7\u04e8\u0005i\u0000\u0000\u04e8\u04e9\u0005k\u0000"+
		"\u0000\u04e9\u0099\u0001\u0000\u0000\u0000\u04ea\u04ee\u0005j\u0000\u0000"+
		"\u04eb\u04ed\u0003\u0006\u0003\u0000\u04ec\u04eb\u0001\u0000\u0000\u0000"+
		"\u04ed\u04f0\u0001\u0000\u0000\u0000\u04ee\u04ec\u0001\u0000\u0000\u0000"+
		"\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef\u04f1\u0001\u0000\u0000\u0000"+
		"\u04f0\u04ee\u0001\u0000\u0000\u0000\u04f1\u04f2\u0005k\u0000\u0000\u04f2"+
		"\u009b\u0001\u0000\u0000\u0000\u04f3\u04f4\u0006N\uffff\uffff\u0000\u04f4"+
		"\u04f9\u0005|\u0000\u0000\u04f5\u04f6\u0005o\u0000\u0000\u04f6\u04f8\u0005"+
		"|\u0000\u0000\u04f7\u04f5\u0001\u0000\u0000\u0000\u04f8\u04fb\u0001\u0000"+
		"\u0000\u0000\u04f9\u04f7\u0001\u0000\u0000\u0000\u04f9\u04fa\u0001\u0000"+
		"\u0000\u0000\u04fa\u04fe\u0001\u0000\u0000\u0000\u04fb\u04f9\u0001\u0000"+
		"\u0000\u0000\u04fc\u04fe\u0005u\u0000\u0000\u04fd\u04f3\u0001\u0000\u0000"+
		"\u0000\u04fd\u04fc\u0001\u0000\u0000\u0000\u04fe\u051d\u0001\u0000\u0000"+
		"\u0000\u04ff\u0500\n\n\u0000\u0000\u0500\u0501\u00055\u0000\u0000\u0501"+
		"\u051c\u0003\u009cN\u000b\u0502\u0503\n\t\u0000\u0000\u0503\u0504\u0005"+
		"6\u0000\u0000\u0504\u051c\u0003\u009cN\n\u0505\u0506\n\b\u0000\u0000\u0506"+
		"\u0507\u00053\u0000\u0000\u0507\u051c\u0003\u009cN\t\u0508\u0509\n\u0007"+
		"\u0000\u0000\u0509\u050a\u00054\u0000\u0000\u050a\u051c\u0003\u009cN\b"+
		"\u050b\u050c\n\u0006\u0000\u0000\u050c\u050d\u00053\u0000\u0000\u050d"+
		"\u050e\u0005B\u0000\u0000\u050e\u051c\u0003\u009cN\u0007\u050f\u0510\n"+
		"\u0005\u0000\u0000\u0510\u0511\u00055\u0000\u0000\u0511\u0512\u0005B\u0000"+
		"\u0000\u0512\u051c\u0003\u009cN\u0006\u0513\u0514\n\u0004\u0000\u0000"+
		"\u0514\u0515\u00054\u0000\u0000\u0515\u0516\u0005B\u0000\u0000\u0516\u051c"+
		"\u0003\u009cN\u0005\u0517\u0518\n\u0003\u0000\u0000\u0518\u0519\u0005"+
		"6\u0000\u0000\u0519\u051a\u0005B\u0000\u0000\u051a\u051c\u0003\u009cN"+
		"\u0004\u051b\u04ff\u0001\u0000\u0000\u0000\u051b\u0502\u0001\u0000\u0000"+
		"\u0000\u051b\u0505\u0001\u0000\u0000\u0000\u051b\u0508\u0001\u0000\u0000"+
		"\u0000\u051b\u050b\u0001\u0000\u0000\u0000\u051b\u050f\u0001\u0000\u0000"+
		"\u0000\u051b\u0513\u0001\u0000\u0000\u0000\u051b\u0517\u0001\u0000\u0000"+
		"\u0000\u051c\u051f\u0001\u0000\u0000\u0000\u051d\u051b\u0001\u0000\u0000"+
		"\u0000\u051d\u051e\u0001\u0000\u0000\u0000\u051e\u009d\u0001\u0000\u0000"+
		"\u0000\u051f\u051d\u0001\u0000\u0000\u0000\u0520\u0526\u0003\u00a0P\u0000"+
		"\u0521\u0522\u0003\u00a4R\u0000\u0522\u0523\u0003\u00a0P\u0000\u0523\u0525"+
		"\u0001\u0000\u0000\u0000\u0524\u0521\u0001\u0000\u0000\u0000\u0525\u0528"+
		"\u0001\u0000\u0000\u0000\u0526\u0524\u0001\u0000\u0000\u0000\u0526\u0527"+
		"\u0001\u0000\u0000\u0000\u0527\u052a\u0001\u0000\u0000\u0000\u0528\u0526"+
		"\u0001\u0000\u0000\u0000\u0529\u0520\u0001\u0000\u0000\u0000\u0529\u052a"+
		"\u0001\u0000\u0000\u0000\u052a\u009f\u0001\u0000\u0000\u0000\u052b\u052c"+
		"\u0005|\u0000\u0000\u052c\u052d\u0003\u00a2Q\u0000\u052d\u052e\u0003\u009c"+
		"N\u0000\u052e\u00a1\u0001\u0000\u0000\u0000\u052f\u0530\u0007\u0006\u0000"+
		"\u0000\u0530\u00a3\u0001\u0000\u0000\u0000\u0531\u0532\u0007\u0007\u0000"+
		"\u0000\u0532\u00a5\u0001\u0000\u0000\u0000\u0533\u0534\u0007\b\u0000\u0000"+
		"\u0534\u00a7\u0001\u0000\u0000\u0000\u0535\u0536\u0005u\u0000\u0000\u0536"+
		"\u00a9\u0001\u0000\u0000\u0000\u0080\u00ad\u00b3\u00be\u00c3\u00c7\u00cb"+
		"\u00d1\u00d3\u00d6\u00f5\u00fb\u00fe\u0104\u010d\u0111\u0119\u011c\u011f"+
		"\u012b\u012e\u0134\u013f\u0143\u0151\u0153\u0159\u0160\u0162\u016a\u016c"+
		"\u016e\u0171\u017d\u0185\u018f\u0192\u0195\u019e\u01a7\u01b3\u01ba\u01c1"+
		"\u01c9\u01d3\u01dd\u01e8\u01ea\u01ef\u01fa\u020c\u021d\u0239\u0240\u0247"+
		"\u0254\u025b\u0268\u0273\u027e\u0285\u0292\u0299\u02a6\u02ad\u02ba\u02c1"+
		"\u02ce\u02d5\u02e2\u02e9\u02f7\u0304\u0310\u0318\u0324\u032d\u033c\u0351"+
		"\u0354\u0365\u0368\u036f\u0379\u037f\u0385\u0387\u038e\u0395\u03a2\u03a9"+
		"\u03b6\u03bd\u03ca\u03d1\u03de\u03e5\u03eb\u03f8\u03ff\u0405\u0410\u0417"+
		"\u0420\u0426\u042c\u0431\u0438\u0442\u0451\u0456\u0462\u0466\u047b\u0489"+
		"\u0492\u0497\u04ba\u04c3\u04c8\u04df\u04e3\u04ee\u04f9\u04fd\u051b\u051d"+
		"\u0526\u0529";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}