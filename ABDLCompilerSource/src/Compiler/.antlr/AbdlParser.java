// Generated from /mnt/d/lfa/BDL-Board-Description-Language/ABDLCompilerSource/src/Compiler/Abdl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbdlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, Type=48, String=49, ID=50, Int=51, Comment=52, WS=53, 
		ERRORS=54;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_functDef = 2, RULE_onMove = 3, RULE_block = 4, 
		RULE_statements = 5, RULE_functionCallStatement = 6, RULE_forStatement = 7, 
		RULE_whileStatement = 8, RULE_ifStatement = 9, RULE_elseIf = 10, RULE_elseStatement = 11, 
		RULE_varDeclaration = 12, RULE_varAttrib = 13, RULE_functionCall = 14, 
		RULE_returnStat = 15, RULE_expr = 16, RULE_args = 17, RULE_typedArgs = 18, 
		RULE_point = 19, RULE_board = 20;
	public static final String[] ruleNames = {
		"program", "main", "functDef", "onMove", "block", "statements", "functionCallStatement", 
		"forStatement", "whileStatement", "ifStatement", "elseIf", "elseStatement", 
		"varDeclaration", "varAttrib", "functionCall", "returnStat", "expr", "args", 
		"typedArgs", "point", "board"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "':'", "'end'", "'endmain'", "';'", "'('", "')'", "'on_move'", 
		"'for'", "'from'", "'to'", "'do'", "'done'", "'while'", "'if'", "'then'", 
		"'endif'", "'else'", "'let'", "'='", "'can_move'", "'move'", "'print'", 
		"'return'", "'^'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'/='", "'null'", "'width'", "'height'", "'current_player'", 
		"','", "'['", "']'", "'board'", "'.'", "'piece_name'", "'owner'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Type", "String", "ID", "Int", "Comment", "WS", "ERRORS"
	};
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
	public String getGrammarFileName() { return "Abdl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AbdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AbdlParser.EOF, 0); }
		public List<FunctDefContext> functDef() {
			return getRuleContexts(FunctDefContext.class);
		}
		public FunctDefContext functDef(int i) {
			return getRuleContext(FunctDefContext.class,i);
		}
		public List<OnMoveContext> onMove() {
			return getRuleContexts(OnMoveContext.class);
		}
		public OnMoveContext onMove(int i) {
			return getRuleContext(OnMoveContext.class,i);
		}
		public List<MainContext> main() {
			return getRuleContexts(MainContext.class);
		}
		public MainContext main(int i) {
			return getRuleContext(MainContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << Type) | (1L << ID))) != 0)) {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
				case ID:
					{
					setState(42);
					functDef();
					}
					break;
				case T__7:
					{
					setState(43);
					onMove();
					}
					break;
				case T__0:
					{
					setState(44);
					main();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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

	public static class MainContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(T__1);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(54);
				statements();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(60);
				match(T__2);
				setState(61);
				match(T__0);
				}
				break;
			case T__3:
				{
				setState(62);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(65);
			match(T__4);
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

	public static class FunctDefContext extends ParserRuleContext {
		public Token func_name;
		public TypedArgsContext typedArgs() {
			return getRuleContext(TypedArgsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AbdlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbdlParser.ID, i);
		}
		public TerminalNode Type() { return getToken(AbdlParser.Type, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public FunctDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functDef; }
	}

	public final FunctDefContext functDef() throws RecognitionException {
		FunctDefContext _localctx = new FunctDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(67);
				match(Type);
				}
			}

			setState(70);
			((FunctDefContext)_localctx).func_name = match(ID);
			setState(71);
			match(T__5);
			setState(72);
			typedArgs();
			setState(73);
			match(T__6);
			setState(74);
			match(T__1);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(75);
				statements();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__2);
			setState(82);
			match(ID);
			setState(83);
			match(T__4);
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

	public static class OnMoveContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public OnMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onMove; }
	}

	public final OnMoveContext onMove() throws RecognitionException {
		OnMoveContext _localctx = new OnMoveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_onMove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__7);
			setState(86);
			match(T__1);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(87);
				statements();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__2);
			setState(94);
			match(T__7);
			setState(95);
			match(T__4);
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
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				forStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				whileStatement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				ifStatement();
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

	public static class StatementsContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarAttribContext varAttrib() {
			return getRuleContext(VarAttribContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				varAttrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				functionCallStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				returnStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				block();
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			functionCall();
			setState(110);
			match(T__4);
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
		public Token var;
		public ExprContext bottom;
		public ExprContext up;
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__8);
			setState(113);
			((ForStatementContext)_localctx).var = match(ID);
			setState(114);
			match(T__9);
			setState(115);
			((ForStatementContext)_localctx).bottom = expr(0);
			setState(116);
			match(T__10);
			setState(117);
			((ForStatementContext)_localctx).up = expr(0);
			setState(118);
			match(T__11);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(119);
				statements();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__12);
			setState(126);
			match(T__4);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__13);
			setState(129);
			expr(0);
			setState(130);
			match(T__11);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(131);
				statements();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(T__12);
			setState(138);
			match(T__4);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__14);
			setState(141);
			expr(0);
			setState(142);
			match(T__15);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(143);
				statements();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					elseIf();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(155);
				elseStatement();
				}
			}

			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(158);
				match(T__2);
				setState(159);
				match(T__14);
				}
				break;
			case T__16:
				{
				setState(160);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			match(T__4);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__17);
			setState(166);
			match(T__14);
			setState(167);
			expr(0);
			setState(168);
			match(T__15);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(169);
				statements();
				}
				}
				setState(174);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__17);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(176);
				statements();
				}
				}
				setState(181);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public TerminalNode Type() { return getToken(AbdlParser.Type, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__18);
			setState(183);
			match(ID);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(184);
				match(T__1);
				setState(185);
				match(Type);
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(188);
				match(T__19);
				setState(189);
				expr(0);
				}
			}

			setState(192);
			match(T__4);
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

	public static class VarAttribContext extends ParserRuleContext {
		public Token var;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public VarAttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAttrib; }
	}

	public final VarAttribContext varAttrib() throws RecognitionException {
		VarAttribContext _localctx = new VarAttribContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varAttrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((VarAttribContext)_localctx).var = match(ID);
			setState(195);
			match(T__19);
			setState(196);
			expr(0);
			setState(197);
			match(T__4);
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
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CanMoveCallContext extends FunctionCallContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CanMoveCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCallContext extends FunctionCallContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public FuncCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
	}
	public static class PrintCallContext extends FunctionCallContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public PrintCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
	}
	public static class MoveCallContext extends FunctionCallContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public MoveCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new CanMoveCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((CanMoveCallContext)_localctx).funcName = match(T__20);
				setState(200);
				match(T__5);
				setState(201);
				args();
				setState(202);
				match(T__6);
				}
				break;
			case T__21:
				_localctx = new MoveCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((MoveCallContext)_localctx).funcName = match(T__21);
				setState(205);
				match(T__5);
				setState(206);
				args();
				setState(207);
				match(T__6);
				}
				break;
			case T__22:
				_localctx = new PrintCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				((PrintCallContext)_localctx).funcName = match(T__22);
				setState(210);
				match(T__5);
				setState(211);
				args();
				setState(212);
				match(T__6);
				}
				break;
			case ID:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				((FuncCallContext)_localctx).funcName = match(ID);
				setState(215);
				match(T__5);
				setState(216);
				args();
				setState(217);
				match(T__6);
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

	public static class ReturnStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__23);
			setState(222);
			expr(0);
			setState(223);
			match(T__4);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprFunctionCallContext extends ExprContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public ExprFunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParentContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode String() { return getToken(AbdlParser.String, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBoardContext extends ExprContext {
		public BoardContext board() {
			return getRuleContext(BoardContext.class,0);
		}
		public ExprBoardContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPointContext extends ExprContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ExprPointContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIntContext extends ExprContext {
		public TerminalNode Int() { return getToken(AbdlParser.Int, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCurrPlayerContext extends ExprContext {
		public ExprCurrPlayerContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNullContext extends ExprContext {
		public ExprNullContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprHeightContext extends ExprContext {
		public ExprHeightContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprWidthContext extends ExprContext {
		public ExprWidthContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(226);
				((ExprFunctionCallContext)_localctx).funcName = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) ) {
					((ExprFunctionCallContext)_localctx).funcName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				match(T__5);
				setState(228);
				args();
				setState(229);
				match(T__6);
				}
				break;
			case 2:
				{
				_localctx = new ExprBoardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				board();
				}
				break;
			case 3:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(T__5);
				setState(233);
				expr(0);
				setState(234);
				match(T__6);
				}
				break;
			case 4:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(Int);
				}
				break;
			case 5:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(String);
				}
				break;
			case 6:
				{
				_localctx = new ExprPointContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				point();
				}
				break;
			case 7:
				{
				_localctx = new ExprNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(T__36);
				}
				break;
			case 8:
				{
				_localctx = new ExprWidthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(T__37);
				}
				break;
			case 9:
				{
				_localctx = new ExprHeightContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(T__38);
				}
				break;
			case 10:
				{
				_localctx = new ExprCurrPlayerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(T__39);
				}
				break;
			case 11:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(247);
						((ExprOpContext)_localctx).op = match(T__24);
						setState(248);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(250);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(251);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(253);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(254);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(256);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(257);
						expr(13);
						}
						break;
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__43) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				setState(263);
				expr(0);
				}
			}

			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(266);
				match(T__40);
				setState(267);
				expr(0);
				}
				}
				setState(272);
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

	public static class TypedArgsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AbdlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbdlParser.ID, i);
		}
		public List<TerminalNode> Type() { return getTokens(AbdlParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(AbdlParser.Type, i);
		}
		public TypedArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedArgs; }
	}

	public final TypedArgsContext typedArgs() throws RecognitionException {
		TypedArgsContext _localctx = new TypedArgsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typedArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(273);
				match(ID);
				setState(274);
				match(T__1);
				setState(275);
				match(Type);
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(278);
				match(T__40);
				{
				setState(279);
				match(ID);
				setState(280);
				match(T__1);
				setState(281);
				match(Type);
				}
				}
				}
				setState(286);
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

	public static class PointContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__41);
			setState(288);
			expr(0);
			setState(289);
			match(T__40);
			setState(290);
			expr(0);
			setState(291);
			match(T__42);
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

	public static class BoardContext extends ParserRuleContext {
		public Token prop;
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public BoardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board; }
	}

	public final BoardContext board() throws RecognitionException {
		BoardContext _localctx = new BoardContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_board);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__43);
			setState(294);
			point();
			setState(295);
			match(T__44);
			setState(296);
			((BoardContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__46) ) {
				((BoardContext)_localctx).prop = (Token)_errHandler.recoverInline(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u012d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\3\5\3"+
		"B\n\3\3\3\3\3\3\4\5\4G\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4R"+
		"\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\7\n\u0087\n\n\f\n\16\n\u008a\13\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\7\13\u0093\n\13\f\13\16\13\u0096\13\13\3\13\7\13\u0099\n\13\f\13"+
		"\16\13\u009c\13\13\3\13\5\13\u009f\n\13\3\13\3\13\3\13\5\13\u00a4\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00ad\n\f\f\f\16\f\u00b0\13\f\3\r\3"+
		"\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\16\3\16\3\16\3\16\5\16\u00bd\n"+
		"\16\3\16\3\16\5\16\u00c1\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00de\n\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00f7\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0105\n\22\f\22\16\22\u0108\13\22\3\23\5\23"+
		"\u010b\n\23\3\23\3\23\7\23\u010f\n\23\f\23\16\23\u0112\13\23\3\24\3\24"+
		"\3\24\5\24\u0117\n\24\3\24\3\24\3\24\3\24\7\24\u011d\n\24\f\24\16\24\u0120"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\2\3"+
		"\"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\4\2\27\30\64\64"+
		"\3\2\34\36\3\2\37 \3\2!&\3\2\60\61\2\u0144\2\61\3\2\2\2\4\66\3\2\2\2\6"+
		"F\3\2\2\2\bW\3\2\2\2\nf\3\2\2\2\fm\3\2\2\2\16o\3\2\2\2\20r\3\2\2\2\22"+
		"\u0082\3\2\2\2\24\u008e\3\2\2\2\26\u00a7\3\2\2\2\30\u00b1\3\2\2\2\32\u00b8"+
		"\3\2\2\2\34\u00c4\3\2\2\2\36\u00dd\3\2\2\2 \u00df\3\2\2\2\"\u00f6\3\2"+
		"\2\2$\u010a\3\2\2\2&\u0116\3\2\2\2(\u0121\3\2\2\2*\u0127\3\2\2\2,\60\5"+
		"\6\4\2-\60\5\b\5\2.\60\5\4\3\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2"+
		"\3\65\3\3\2\2\2\66\67\7\3\2\2\67;\7\4\2\28:\5\f\7\298\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>?\7\5\2\2?B\7\3\2\2@B\7\6\2"+
		"\2A>\3\2\2\2A@\3\2\2\2BC\3\2\2\2CD\7\7\2\2D\5\3\2\2\2EG\7\62\2\2FE\3\2"+
		"\2\2FG\3\2\2\2GH\3\2\2\2HI\7\64\2\2IJ\7\b\2\2JK\5&\24\2KL\7\t\2\2LP\7"+
		"\4\2\2MO\5\f\7\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3"+
		"\2\2\2ST\7\5\2\2TU\7\64\2\2UV\7\7\2\2V\7\3\2\2\2WX\7\n\2\2X\\\7\4\2\2"+
		"Y[\5\f\7\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2"+
		"\2\2_`\7\5\2\2`a\7\n\2\2ab\7\7\2\2b\t\3\2\2\2cg\5\20\t\2dg\5\22\n\2eg"+
		"\5\24\13\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\13\3\2\2\2hn\5\32\16\2in\5\34"+
		"\17\2jn\5\16\b\2kn\5 \21\2ln\5\n\6\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3"+
		"\2\2\2ml\3\2\2\2n\r\3\2\2\2op\5\36\20\2pq\7\7\2\2q\17\3\2\2\2rs\7\13\2"+
		"\2st\7\64\2\2tu\7\f\2\2uv\5\"\22\2vw\7\r\2\2wx\5\"\22\2x|\7\16\2\2y{\5"+
		"\f\7\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2"+
		"\177\u0080\7\17\2\2\u0080\u0081\7\7\2\2\u0081\21\3\2\2\2\u0082\u0083\7"+
		"\20\2\2\u0083\u0084\5\"\22\2\u0084\u0088\7\16\2\2\u0085\u0087\5\f\7\2"+
		"\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\17\2\2"+
		"\u008c\u008d\7\7\2\2\u008d\23\3\2\2\2\u008e\u008f\7\21\2\2\u008f\u0090"+
		"\5\"\22\2\u0090\u0094\7\22\2\2\u0091\u0093\5\f\7\2\u0092\u0091\3\2\2\2"+
		"\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\5\26\f\2\u0098\u0097\3\2\2\2"+
		"\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\5\30\r\2\u009e\u009d\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a1\7\5\2\2\u00a1\u00a4"+
		"\7\21\2\2\u00a2\u00a4\7\23\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6\25\3\2\2\2\u00a7\u00a8"+
		"\7\24\2\2\u00a8\u00a9\7\21\2\2\u00a9\u00aa\5\"\22\2\u00aa\u00ae\7\22\2"+
		"\2\u00ab\u00ad\5\f\7\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b5\7\24\2\2\u00b2\u00b4\5\f\7\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\31\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\7\25\2\2\u00b9\u00bc\7\64\2\2\u00ba\u00bb\7"+
		"\4\2\2\u00bb\u00bd\7\62\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bf\7\26\2\2\u00bf\u00c1\5\"\22\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\7\2\2\u00c3"+
		"\33\3\2\2\2\u00c4\u00c5\7\64\2\2\u00c5\u00c6\7\26\2\2\u00c6\u00c7\5\""+
		"\22\2\u00c7\u00c8\7\7\2\2\u00c8\35\3\2\2\2\u00c9\u00ca\7\27\2\2\u00ca"+
		"\u00cb\7\b\2\2\u00cb\u00cc\5$\23\2\u00cc\u00cd\7\t\2\2\u00cd\u00de\3\2"+
		"\2\2\u00ce\u00cf\7\30\2\2\u00cf\u00d0\7\b\2\2\u00d0\u00d1\5$\23\2\u00d1"+
		"\u00d2\7\t\2\2\u00d2\u00de\3\2\2\2\u00d3\u00d4\7\31\2\2\u00d4\u00d5\7"+
		"\b\2\2\u00d5\u00d6\5$\23\2\u00d6\u00d7\7\t\2\2\u00d7\u00de\3\2\2\2\u00d8"+
		"\u00d9\7\64\2\2\u00d9\u00da\7\b\2\2\u00da\u00db\5$\23\2\u00db\u00dc\7"+
		"\t\2\2\u00dc\u00de\3\2\2\2\u00dd\u00c9\3\2\2\2\u00dd\u00ce\3\2\2\2\u00dd"+
		"\u00d3\3\2\2\2\u00dd\u00d8\3\2\2\2\u00de\37\3\2\2\2\u00df\u00e0\7\32\2"+
		"\2\u00e0\u00e1\5\"\22\2\u00e1\u00e2\7\7\2\2\u00e2!\3\2\2\2\u00e3\u00e4"+
		"\b\22\1\2\u00e4\u00e5\t\2\2\2\u00e5\u00e6\7\b\2\2\u00e6\u00e7\5$\23\2"+
		"\u00e7\u00e8\7\t\2\2\u00e8\u00f7\3\2\2\2\u00e9\u00f7\5*\26\2\u00ea\u00eb"+
		"\7\b\2\2\u00eb\u00ec\5\"\22\2\u00ec\u00ed\7\t\2\2\u00ed\u00f7\3\2\2\2"+
		"\u00ee\u00f7\7\65\2\2\u00ef\u00f7\7\63\2\2\u00f0\u00f7\5(\25\2\u00f1\u00f7"+
		"\7\'\2\2\u00f2\u00f7\7(\2\2\u00f3\u00f7\7)\2\2\u00f4\u00f7\7*\2\2\u00f5"+
		"\u00f7\7\64\2\2\u00f6\u00e3\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00ea\3"+
		"\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6"+
		"\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7\u0106\3\2\2\2\u00f8\u00f9\f\21\2\2\u00f9"+
		"\u00fa\7\33\2\2\u00fa\u0105\5\"\22\21\u00fb\u00fc\f\20\2\2\u00fc\u00fd"+
		"\t\3\2\2\u00fd\u0105\5\"\22\21\u00fe\u00ff\f\17\2\2\u00ff\u0100\t\4\2"+
		"\2\u0100\u0105\5\"\22\20\u0101\u0102\f\16\2\2\u0102\u0103\t\5\2\2\u0103"+
		"\u0105\5\"\22\17\u0104\u00f8\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u00fe\3"+
		"\2\2\2\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107#\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\5\"\22\2"+
		"\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0110\3\2\2\2\u010c\u010d"+
		"\7+\2\2\u010d\u010f\5\"\22\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111%\3\2\2\2\u0112\u0110\3\2\2\2"+
		"\u0113\u0114\7\64\2\2\u0114\u0115\7\4\2\2\u0115\u0117\7\62\2\2\u0116\u0113"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011e\3\2\2\2\u0118\u0119\7+\2\2\u0119"+
		"\u011a\7\64\2\2\u011a\u011b\7\4\2\2\u011b\u011d\7\62\2\2\u011c\u0118\3"+
		"\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\'\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7,\2\2\u0122\u0123\5\"\22\2"+
		"\u0123\u0124\7+\2\2\u0124\u0125\5\"\22\2\u0125\u0126\7-\2\2\u0126)\3\2"+
		"\2\2\u0127\u0128\7.\2\2\u0128\u0129\5(\25\2\u0129\u012a\7/\2\2\u012a\u012b"+
		"\t\6\2\2\u012b+\3\2\2\2\35/\61;AFP\\fm|\u0088\u0094\u009a\u009e\u00a3"+
		"\u00ae\u00b5\u00bc\u00c0\u00dd\u00f6\u0104\u0106\u010a\u0110\u0116\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}