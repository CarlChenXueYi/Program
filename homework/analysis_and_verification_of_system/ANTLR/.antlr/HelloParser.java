// Generated from /root/Program/homework/analysis_and_verification_of_system/ANTLR/Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, WS=20, BVAL=21, VAR=22, AVAL=23;
	public static final int
		RULE_mainnode = 0, RULE_expr = 1, RULE_bexpr = 2, RULE_sequencenode = 3, 
		RULE_lessernode = 4, RULE_equalnode = 5, RULE_andnode = 6, RULE_notnode = 7, 
		RULE_ornode = 8, RULE_plusnode = 9, RULE_minusnode = 10, RULE_timesnode = 11, 
		RULE_bracketnode = 12, RULE_blocknode = 13, RULE_assigmentnode = 14, RULE_statement = 15, 
		RULE_ifnode = 16, RULE_whilenode = 17, RULE_boolnode = 18, RULE_varnode = 19, 
		RULE_intnode = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"mainnode", "expr", "bexpr", "sequencenode", "lessernode", "equalnode", 
			"andnode", "notnode", "ornode", "plusnode", "minusnode", "timesnode", 
			"bracketnode", "blocknode", "assigmentnode", "statement", "ifnode", "whilenode", 
			"boolnode", "varnode", "intnode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'=='", "'&&'", "'!'", "'||'", "'+'", "'-'", "'*'", "'('", 
			"')'", "'{'", "'}'", "':='", "';'", "'if'", "'then'", "'else'", "'while'", 
			"'do'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "BVAL", "VAR", 
			"AVAL"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainnodeContext extends ParserRuleContext {
		public SequencenodeContext sequencenode() {
			return getRuleContext(SequencenodeContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainnode; }
	}

	public final MainnodeContext mainnode() throws RecognitionException {
		MainnodeContext _localctx = new MainnodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mainnode);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				sequencenode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				statement();
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

	public static class ExprContext extends ParserRuleContext {
		public BracketnodeContext bracketnode() {
			return getRuleContext(BracketnodeContext.class,0);
		}
		public VarnodeContext varnode() {
			return getRuleContext(VarnodeContext.class,0);
		}
		public IntnodeContext intnode() {
			return getRuleContext(IntnodeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinusnodeContext minusnode() {
			return getRuleContext(MinusnodeContext.class,0);
		}
		public PlusnodeContext plusnode() {
			return getRuleContext(PlusnodeContext.class,0);
		}
		public TimesnodeContext timesnode() {
			return getRuleContext(TimesnodeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(47);
				bracketnode();
				}
				break;
			case VAR:
				{
				setState(48);
				varnode();
				}
				break;
			case AVAL:
				{
				setState(49);
				intnode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(52);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(53);
						minusnode();
						setState(54);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(57);
						plusnode();
						setState(58);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(61);
						timesnode();
						setState(62);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class BexprContext extends ParserRuleContext {
		public BracketnodeContext bracketnode() {
			return getRuleContext(BracketnodeContext.class,0);
		}
		public NotnodeContext notnode() {
			return getRuleContext(NotnodeContext.class,0);
		}
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessernodeContext lessernode() {
			return getRuleContext(LessernodeContext.class,0);
		}
		public EqualnodeContext equalnode() {
			return getRuleContext(EqualnodeContext.class,0);
		}
		public BoolnodeContext boolnode() {
			return getRuleContext(BoolnodeContext.class,0);
		}
		public AndnodeContext andnode() {
			return getRuleContext(AndnodeContext.class,0);
		}
		public OrnodeContext ornode() {
			return getRuleContext(OrnodeContext.class,0);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
	}

	public final BexprContext bexpr() throws RecognitionException {
		return bexpr(0);
	}

	private BexprContext bexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexprContext _localctx = new BexprContext(_ctx, _parentState);
		BexprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_bexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(70);
				bracketnode();
				}
				break;
			case 2:
				{
				setState(71);
				notnode();
				setState(72);
				bexpr(6);
				}
				break;
			case 3:
				{
				setState(74);
				expr(0);
				setState(75);
				lessernode();
				setState(76);
				expr(0);
				}
				break;
			case 4:
				{
				setState(78);
				expr(0);
				setState(79);
				equalnode();
				setState(80);
				expr(0);
				}
				break;
			case 5:
				{
				setState(82);
				boolnode();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(85);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(86);
						andnode();
						setState(87);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(89);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(90);
						ornode();
						setState(91);
						bexpr(5);
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class SequencenodeContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SequencenodeContext sequencenode() {
			return getRuleContext(SequencenodeContext.class,0);
		}
		public SequencenodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequencenode; }
	}

	public final SequencenodeContext sequencenode() throws RecognitionException {
		SequencenodeContext _localctx = new SequencenodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sequencenode);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				statement();
				setState(99);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				statement();
				setState(102);
				sequencenode();
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

	public static class LessernodeContext extends ParserRuleContext {
		public LessernodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessernode; }
	}

	public final LessernodeContext lessernode() throws RecognitionException {
		LessernodeContext _localctx = new LessernodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lessernode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__0);
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

	public static class EqualnodeContext extends ParserRuleContext {
		public EqualnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalnode; }
	}

	public final EqualnodeContext equalnode() throws RecognitionException {
		EqualnodeContext _localctx = new EqualnodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equalnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__1);
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

	public static class AndnodeContext extends ParserRuleContext {
		public AndnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andnode; }
	}

	public final AndnodeContext andnode() throws RecognitionException {
		AndnodeContext _localctx = new AndnodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_andnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__2);
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

	public static class NotnodeContext extends ParserRuleContext {
		public NotnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notnode; }
	}

	public final NotnodeContext notnode() throws RecognitionException {
		NotnodeContext _localctx = new NotnodeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_notnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__3);
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

	public static class OrnodeContext extends ParserRuleContext {
		public OrnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ornode; }
	}

	public final OrnodeContext ornode() throws RecognitionException {
		OrnodeContext _localctx = new OrnodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ornode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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

	public static class PlusnodeContext extends ParserRuleContext {
		public PlusnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusnode; }
	}

	public final PlusnodeContext plusnode() throws RecognitionException {
		PlusnodeContext _localctx = new PlusnodeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_plusnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__5);
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

	public static class MinusnodeContext extends ParserRuleContext {
		public MinusnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusnode; }
	}

	public final MinusnodeContext minusnode() throws RecognitionException {
		MinusnodeContext _localctx = new MinusnodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_minusnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__6);
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

	public static class TimesnodeContext extends ParserRuleContext {
		public TimesnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timesnode; }
	}

	public final TimesnodeContext timesnode() throws RecognitionException {
		TimesnodeContext _localctx = new TimesnodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_timesnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__7);
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

	public static class BracketnodeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BracketnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketnode; }
	}

	public final BracketnodeContext bracketnode() throws RecognitionException {
		BracketnodeContext _localctx = new BracketnodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bracketnode);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__8);
				setState(123);
				expr(0);
				setState(124);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__8);
				setState(127);
				bexpr(0);
				setState(128);
				match(T__9);
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

	public static class BlocknodeContext extends ParserRuleContext {
		public SequencenodeContext sequencenode() {
			return getRuleContext(SequencenodeContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlocknodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocknode; }
	}

	public final BlocknodeContext blocknode() throws RecognitionException {
		BlocknodeContext _localctx = new BlocknodeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blocknode);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__10);
				setState(133);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__10);
				setState(135);
				sequencenode();
				setState(136);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(T__10);
				setState(139);
				statement();
				setState(140);
				match(T__11);
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

	public static class AssigmentnodeContext extends ParserRuleContext {
		public VarnodeContext varnode() {
			return getRuleContext(VarnodeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigmentnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigmentnode; }
	}

	public final AssigmentnodeContext assigmentnode() throws RecognitionException {
		AssigmentnodeContext _localctx = new AssigmentnodeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assigmentnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			varnode();
			setState(145);
			match(T__12);
			setState(146);
			expr(0);
			setState(147);
			match(T__13);
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
		public AssigmentnodeContext assigmentnode() {
			return getRuleContext(AssigmentnodeContext.class,0);
		}
		public WhilenodeContext whilenode() {
			return getRuleContext(WhilenodeContext.class,0);
		}
		public IfnodeContext ifnode() {
			return getRuleContext(IfnodeContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				assigmentnode();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				whilenode();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				ifnode();
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

	public static class IfnodeContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public List<BlocknodeContext> blocknode() {
			return getRuleContexts(BlocknodeContext.class);
		}
		public BlocknodeContext blocknode(int i) {
			return getRuleContext(BlocknodeContext.class,i);
		}
		public IfnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifnode; }
	}

	public final IfnodeContext ifnode() throws RecognitionException {
		IfnodeContext _localctx = new IfnodeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__14);
			setState(155);
			bexpr(0);
			setState(156);
			match(T__15);
			setState(157);
			blocknode();
			setState(158);
			match(T__16);
			setState(159);
			blocknode();
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

	public static class WhilenodeContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BlocknodeContext blocknode() {
			return getRuleContext(BlocknodeContext.class,0);
		}
		public WhilenodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilenode; }
	}

	public final WhilenodeContext whilenode() throws RecognitionException {
		WhilenodeContext _localctx = new WhilenodeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whilenode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__17);
			setState(162);
			bexpr(0);
			setState(163);
			match(T__18);
			setState(164);
			blocknode();
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

	public static class BoolnodeContext extends ParserRuleContext {
		public TerminalNode BVAL() { return getToken(HelloParser.BVAL, 0); }
		public BoolnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolnode; }
	}

	public final BoolnodeContext boolnode() throws RecognitionException {
		BoolnodeContext _localctx = new BoolnodeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(BVAL);
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

	public static class VarnodeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(HelloParser.VAR, 0); }
		public VarnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varnode; }
	}

	public final VarnodeContext varnode() throws RecognitionException {
		VarnodeContext _localctx = new VarnodeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(VAR);
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

	public static class IntnodeContext extends ParserRuleContext {
		public TerminalNode AVAL() { return getToken(HelloParser.AVAL, 0); }
		public IntnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intnode; }
	}

	public final IntnodeContext intnode() throws RecognitionException {
		IntnodeContext _localctx = new IntnodeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_intnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(AVAL);
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
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 2:
			return bexpr_sempred((BexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00af\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2/\n\2\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3C\n"+
		"\3\f\3\16\3F\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4V\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0085\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0091\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u009b\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\26\2\4\4\6\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\2\2\u00ab\2.\3\2\2\2\4\64\3\2\2\2\6U\3\2\2\2\bj\3\2\2\2\n"+
		"l\3\2\2\2\fn\3\2\2\2\16p\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24v\3\2\2\2\26"+
		"x\3\2\2\2\30z\3\2\2\2\32\u0084\3\2\2\2\34\u0090\3\2\2\2\36\u0092\3\2\2"+
		"\2 \u009a\3\2\2\2\"\u009c\3\2\2\2$\u00a3\3\2\2\2&\u00a8\3\2\2\2(\u00aa"+
		"\3\2\2\2*\u00ac\3\2\2\2,/\5\b\5\2-/\5 \21\2.,\3\2\2\2.-\3\2\2\2/\3\3\2"+
		"\2\2\60\61\b\3\1\2\61\65\5\32\16\2\62\65\5(\25\2\63\65\5*\26\2\64\60\3"+
		"\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65D\3\2\2\2\66\67\f\7\2\2\678\5\26"+
		"\f\289\5\4\3\b9C\3\2\2\2:;\f\6\2\2;<\5\24\13\2<=\5\4\3\7=C\3\2\2\2>?\f"+
		"\5\2\2?@\5\30\r\2@A\5\4\3\6AC\3\2\2\2B\66\3\2\2\2B:\3\2\2\2B>\3\2\2\2"+
		"CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\5\3\2\2\2FD\3\2\2\2GH\b\4\1\2HV\5\32\16"+
		"\2IJ\5\20\t\2JK\5\6\4\bKV\3\2\2\2LM\5\4\3\2MN\5\n\6\2NO\5\4\3\2OV\3\2"+
		"\2\2PQ\5\4\3\2QR\5\f\7\2RS\5\4\3\2SV\3\2\2\2TV\5&\24\2UG\3\2\2\2UI\3\2"+
		"\2\2UL\3\2\2\2UP\3\2\2\2UT\3\2\2\2Va\3\2\2\2WX\f\7\2\2XY\5\16\b\2YZ\5"+
		"\6\4\bZ`\3\2\2\2[\\\f\6\2\2\\]\5\22\n\2]^\5\6\4\7^`\3\2\2\2_W\3\2\2\2"+
		"_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca\3\2\2\2de\5 \21"+
		"\2ef\5 \21\2fk\3\2\2\2gh\5 \21\2hi\5\b\5\2ik\3\2\2\2jd\3\2\2\2jg\3\2\2"+
		"\2k\t\3\2\2\2lm\7\3\2\2m\13\3\2\2\2no\7\4\2\2o\r\3\2\2\2pq\7\5\2\2q\17"+
		"\3\2\2\2rs\7\6\2\2s\21\3\2\2\2tu\7\7\2\2u\23\3\2\2\2vw\7\b\2\2w\25\3\2"+
		"\2\2xy\7\t\2\2y\27\3\2\2\2z{\7\n\2\2{\31\3\2\2\2|}\7\13\2\2}~\5\4\3\2"+
		"~\177\7\f\2\2\177\u0085\3\2\2\2\u0080\u0081\7\13\2\2\u0081\u0082\5\6\4"+
		"\2\u0082\u0083\7\f\2\2\u0083\u0085\3\2\2\2\u0084|\3\2\2\2\u0084\u0080"+
		"\3\2\2\2\u0085\33\3\2\2\2\u0086\u0087\7\r\2\2\u0087\u0091\7\16\2\2\u0088"+
		"\u0089\7\r\2\2\u0089\u008a\5\b\5\2\u008a\u008b\7\16\2\2\u008b\u0091\3"+
		"\2\2\2\u008c\u008d\7\r\2\2\u008d\u008e\5 \21\2\u008e\u008f\7\16\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u0086\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u008c\3\2"+
		"\2\2\u0091\35\3\2\2\2\u0092\u0093\5(\25\2\u0093\u0094\7\17\2\2\u0094\u0095"+
		"\5\4\3\2\u0095\u0096\7\20\2\2\u0096\37\3\2\2\2\u0097\u009b\5\36\20\2\u0098"+
		"\u009b\5$\23\2\u0099\u009b\5\"\22\2\u009a\u0097\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u0099\3\2\2\2\u009b!\3\2\2\2\u009c\u009d\7\21\2\2\u009d\u009e"+
		"\5\6\4\2\u009e\u009f\7\22\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7\23\2"+
		"\2\u00a1\u00a2\5\34\17\2\u00a2#\3\2\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5"+
		"\5\6\4\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7\5\34\17\2\u00a7%\3\2\2\2\u00a8"+
		"\u00a9\7\27\2\2\u00a9\'\3\2\2\2\u00aa\u00ab\7\30\2\2\u00ab)\3\2\2\2\u00ac"+
		"\u00ad\7\31\2\2\u00ad+\3\2\2\2\r.\64BDU_aj\u0084\u0090\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}