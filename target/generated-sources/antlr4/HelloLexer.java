// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, NUM=34, IDENT=35, RETURN=36, CONTINUE=37, BREAK=38, 
		WS=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''"
	};
	public static final String[] ruleNames = {
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"NUM", "IDENT", "RETURN", "CONTINUE", "BREAK", "WS"
	};


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u00d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\7#\u00b0\n#\f#\16#\u00b3"+
		"\13#\5#\u00b5\n#\3$\3$\7$\u00b9\n$\f$\16$\u00bc\13$\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\6(\u00ce\n(\r(\16(\u00cf\3(\3(\2\2"+
		")\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)\3\2\7\3\2\63;\3\2\62;\6\2C\\aac|\uac02\ud7a5\7"+
		"\2\62;C\\aac|\uac02\ud7a5\5\2\13\f\17\17\"\"\u00d6\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7V\3\2\2\2\t[\3\2\2\2\13"+
		"^\3\2\2\2\ra\3\2\2\2\17e\3\2\2\2\21i\3\2\2\2\23k\3\2\2\2\25n\3\2\2\2\27"+
		"p\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2!{\3\2\2\2#~"+
		"\3\2\2\2%\u0082\3\2\2\2\'\u0085\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2"+
		"-\u008c\3\2\2\2/\u008f\3\2\2\2\61\u0091\3\2\2\2\63\u0093\3\2\2\2\65\u0095"+
		"\3\2\2\2\67\u0097\3\2\2\29\u009a\3\2\2\2;\u009c\3\2\2\2=\u00a0\3\2\2\2"+
		"?\u00a5\3\2\2\2A\u00a7\3\2\2\2C\u00a9\3\2\2\2E\u00b4\3\2\2\2G\u00b6\3"+
		"\2\2\2I\u00bd\3\2\2\2K\u00c2\3\2\2\2M\u00c8\3\2\2\2O\u00cd\3\2\2\2QR\7"+
		"\61\2\2R\4\3\2\2\2ST\7\uacf7\2\2TU\7\uc6ab\2\2U\6\3\2\2\2VW\7\uc746\2"+
		"\2WX\7\"\2\2XY\7\ubc1a\2\2YZ\7\ubcf7\2\2Z\b\3\2\2\2[\\\7\uad6e\2\2\\]"+
		"\7\ud606\2\2]\n\3\2\2\2^_\7\ud657\2\2_`\7\uc7a7\2\2`\f\3\2\2\2ab\7.\2"+
		"\2bc\7\"\2\2cd\7]\2\2d\16\3\2\2\2ef\7\uc776\2\2fg\7\ub77e\2\2gh\7\uba76"+
		"\2\2h\20\3\2\2\2ij\7}\2\2j\22\3\2\2\2kl\7\ub77e\2\2lm\7\uba76\2\2m\24"+
		"\3\2\2\2no\7\177\2\2o\26\3\2\2\2pq\7_\2\2qr\7\ub97e\2\2r\30\3\2\2\2st"+
		"\7*\2\2t\32\3\2\2\2uv\7,\2\2v\34\3\2\2\2wx\7.\2\2x\36\3\2\2\2yz\7\60\2"+
		"\2z \3\2\2\2{|\7>\2\2|}\7/\2\2}\"\3\2\2\2~\177\7\uc546\2\2\177\u0080\7"+
		"\ub2ca\2\2\u0080\u0081\7\uba76\2\2\u0081$\3\2\2\2\u0082\u0083\7\ud63b"+
		"\2\2\u0083\u0084\7\uc742\2\2\u0084&\3\2\2\2\u0085\u0086\7_\2\2\u0086\u0087"+
		"\7\uc742\2\2\u0087(\3\2\2\2\u0088\u0089\7\ud2c2\2\2\u0089*\3\2\2\2\u008a"+
		"\u008b\7]\2\2\u008b,\3\2\2\2\u008c\u008d\7_\2\2\u008d\u008e\7\uc746\2"+
		"\2\u008e.\3\2\2\2\u008f\u0090\7~\2\2\u0090\60\3\2\2\2\u0091\u0092\7_\2"+
		"\2\u0092\62\3\2\2\2\u0093\u0094\7%\2\2\u0094\64\3\2\2\2\u0095\u0096\7"+
		"\'\2\2\u0096\66\3\2\2\2\u0097\u0098\7\uacc6\2\2\u0098\u0099\7\uc18f\2"+
		"\2\u00998\3\2\2\2\u009a\u009b\7+\2\2\u009b:\3\2\2\2\u009c\u009d\7\uafba"+
		"\2\2\u009d\u009e\7\ub7ee\2\2\u009e\u009f\7\ubbfa\2\2\u009f<\3\2\2\2\u00a0"+
		"\u00a1\7\uac02\2\2\u00a1\u00a2\7\uc83a\2\2\u00a2\u00a3\7\uc626\2\2\u00a3"+
		"\u00a4\7\uae32\2\2\u00a4>\3\2\2\2\u00a5\u00a6\7-\2\2\u00a6@\3\2\2\2\u00a7"+
		"\u00a8\7/\2\2\u00a8B\3\2\2\2\u00a9\u00aa\7_\2\2\u00aa\u00ab\7\ub296\2"+
		"\2\u00abD\3\2\2\2\u00ac\u00b5\7\62\2\2\u00ad\u00b1\t\2\2\2\u00ae\u00b0"+
		"\t\3\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00ac\3\2"+
		"\2\2\u00b4\u00ad\3\2\2\2\u00b5F\3\2\2\2\u00b6\u00ba\t\4\2\2\u00b7\u00b9"+
		"\t\5\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bbH\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\ub0b6"+
		"\2\2\u00be\u00bf\7\ubcf6\2\2\u00bf\u00c0\7\ub0b6\2\2\u00c0\u00c1\7\uae32"+
		"\2\2\u00c1J\3\2\2\2\u00c2\u00c3\7\ub2e6\2\2\u00c3\u00c4\7\uc2de\2\2\u00c4"+
		"\u00c5\7\"\2\2\u00c5\u00c6\7\uc706\2\2\u00c6\u00c7\7\ub85e\2\2\u00c7L"+
		"\3\2\2\2\u00c8\u00c9\7\ub09a\2\2\u00c9\u00ca\7\uac02\2\2\u00ca\u00cb\7"+
		"\uae32\2\2\u00cbN\3\2\2\2\u00cc\u00ce\t\6\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\b(\2\2\u00d2P\3\2\2\2\b\2\u00b1\u00b4\u00b8\u00ba\u00cf"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}