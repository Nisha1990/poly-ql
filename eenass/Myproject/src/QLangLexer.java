// Generated from QLang.g4 by ANTLR 4.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLangLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, WS=14, COMMENT=15, Ident=16, Int=17, 
		Str=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'||'", "'>'", "'+'", "'-'", "'*'", "'/'", "'<'", "'=='", "'>='", "'!='", 
		"'!'", "'<='", "'&&'", "WS", "COMMENT", "Ident", "Int", "Str"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "WS", "COMMENT", "Ident", "Int", "Str"
	};


	public QLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QLang.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20N\n\20\f\20\16\20Q\13\20\3\20"+
		"\3\20\3\20\3\21\3\21\7\21X\n\21\f\21\16\21[\13\21\3\22\6\22^\n\22\r\22"+
		"\16\22_\3\23\3\23\7\23d\n\23\f\23\16\23g\13\23\3\23\3\23\2\2\24\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\3\2\5\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|m\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\3\'\3\2\2\2\5*\3\2\2\2\7,\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r\62"+
		"\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2\239\3\2\2\2\25<\3\2\2\2\27?\3\2\2"+
		"\2\31A\3\2\2\2\33D\3\2\2\2\35G\3\2\2\2\37I\3\2\2\2!U\3\2\2\2#]\3\2\2\2"+
		"%a\3\2\2\2\'(\7~\2\2()\7~\2\2)\4\3\2\2\2*+\7@\2\2+\6\3\2\2\2,-\7-\2\2"+
		"-\b\3\2\2\2./\7/\2\2/\n\3\2\2\2\60\61\7,\2\2\61\f\3\2\2\2\62\63\7\61\2"+
		"\2\63\16\3\2\2\2\64\65\7>\2\2\65\20\3\2\2\2\66\67\7?\2\2\678\7?\2\28\22"+
		"\3\2\2\29:\7@\2\2:;\7?\2\2;\24\3\2\2\2<=\7#\2\2=>\7?\2\2>\26\3\2\2\2?"+
		"@\7#\2\2@\30\3\2\2\2AB\7>\2\2BC\7?\2\2C\32\3\2\2\2DE\7(\2\2EF\7(\2\2F"+
		"\34\3\2\2\2GH\t\2\2\2H\36\3\2\2\2IJ\7\61\2\2JK\7,\2\2KO\3\2\2\2LN\13\2"+
		"\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7,"+
		"\2\2ST\7\61\2\2T \3\2\2\2UY\t\3\2\2VX\t\4\2\2WV\3\2\2\2X[\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\"\3\2\2\2[Y\3\2\2\2\\^\4\62;\2]\\\3\2\2\2^_\3\2\2\2"+
		"_]\3\2\2\2_`\3\2\2\2`$\3\2\2\2ae\7$\2\2bd\13\2\2\2cb\3\2\2\2dg\3\2\2\2"+
		"ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7$\2\2i&\3\2\2\2\7\2OY_e\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}