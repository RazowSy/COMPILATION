package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SEP=5;
    public static final int RULE_MAJ=6;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_ESPACE=7;
    public static final int RULE_SYMBOL=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'function' )
            // InternalMyDsl.g:11:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( ':' )
            // InternalMyDsl.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'read' )
            // InternalMyDsl.g:13:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( '%' )
            // InternalMyDsl.g:14:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'write' )
            // InternalMyDsl.g:15:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( ',' )
            // InternalMyDsl.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( ':=' )
            // InternalMyDsl.g:17:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'if' )
            // InternalMyDsl.g:18:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'then' )
            // InternalMyDsl.g:19:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'else' )
            // InternalMyDsl.g:20:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'fi' )
            // InternalMyDsl.g:21:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'while' )
            // InternalMyDsl.g:22:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( 'do' )
            // InternalMyDsl.g:23:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( 'od' )
            // InternalMyDsl.g:24:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'for' )
            // InternalMyDsl.g:25:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'foreach' )
            // InternalMyDsl.g:26:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( 'in' )
            // InternalMyDsl.g:27:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( 'nop' )
            // InternalMyDsl.g:28:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( '(' )
            // InternalMyDsl.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( ')' )
            // InternalMyDsl.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'nil' )
            // InternalMyDsl.g:31:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'hd' )
            // InternalMyDsl.g:32:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( 'tl' )
            // InternalMyDsl.g:33:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'not' )
            // InternalMyDsl.g:34:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'cons' )
            // InternalMyDsl.g:35:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'list' )
            // InternalMyDsl.g:36:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( '=?' )
            // InternalMyDsl.g:37:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'or' )
            // InternalMyDsl.g:38:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'and' )
            // InternalMyDsl.g:39:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_SEP"
    public final void mRULE_SEP() throws RecognitionException {
        try {
            int _type = RULE_SEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1861:10: ( ';' )
            // InternalMyDsl.g:1861:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEP"

    // $ANTLR start "RULE_MAJ"
    public final void mRULE_MAJ() throws RecognitionException {
        try {
            int _type = RULE_MAJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1863:10: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' )* )
            // InternalMyDsl.g:1863:12: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' )*
            {
            matchRange('A','Z'); 
            // InternalMyDsl.g:1863:21: ( 'A' .. 'Z' | 'a' .. 'z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAJ"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1865:13: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )? )
            // InternalMyDsl.g:1865:15: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )?
            {
            matchRange('a','z'); 
            // InternalMyDsl.g:1865:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:1865:54: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='&'||LA5_0=='+'||(LA5_0>='-' && LA5_0<='/')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:1865:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    {
            	    // InternalMyDsl.g:1865:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='-') ) {
            	        int LA3_1 = input.LA(2);

            	        if ( (LA3_1=='>') ) {
            	            alt3=2;
            	        }
            	        else if ( ((LA3_1>='0' && LA3_1<='9')||(LA3_1>='A' && LA3_1<='Z')||(LA3_1>='a' && LA3_1<='z')) ) {
            	            alt3=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 3, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA3_0=='&'||LA3_0=='+'||(LA3_0>='.' && LA3_0<='/')||LA3_0=='_') ) {
            	        alt3=1;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMyDsl.g:1865:56: ( '-' | '+' | '.' | '/' | '_' | '&' )
            	            {
            	            if ( input.LA(1)=='&'||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='/')||input.LA(1)=='_' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1865:82: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1865:88: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyDsl.g:1865:120: ( '?' | '!' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='!'||LA6_0=='?') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_ESPACE"
    public final void mRULE_ESPACE() throws RecognitionException {
        try {
            int _type = RULE_ESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1867:13: ( '\\n' )
            // InternalMyDsl.g:1867:15: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESPACE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1869:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1869:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1869:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1869:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1869:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1871:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1871:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1871:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1871:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1873:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1873:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1873:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1873:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1873:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:1873:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1873:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1873:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1873:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:1873:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1873:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1875:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:1875:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:1875:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1875:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1877:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1877:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:1877:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1877:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalMyDsl.g:1877:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1877:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1877:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:1877:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1879:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1879:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1879:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1881:16: ( . )
            // InternalMyDsl.g:1881:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_SEP | RULE_MAJ | RULE_SYMBOL | RULE_ESPACE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=40;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalMyDsl.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: RULE_SEP
                {
                mRULE_SEP(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:193: RULE_MAJ
                {
                mRULE_MAJ(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:202: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:214: RULE_ESPACE
                {
                mRULE_ESPACE(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:226: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:234: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:243: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:255: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:271: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:287: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:295: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\43\1\47\1\43\1\uffff\1\43\1\uffff\6\43\2\uffff\3\43\1\37\1\43\1\uffff\1\77\1\43\1\102\1\37\2\uffff\3\37\2\uffff\1\43\1\111\1\43\1\uffff\1\43\1\101\2\uffff\1\43\1\uffff\2\43\1\uffff\1\117\1\120\1\43\1\122\1\43\1\124\1\125\1\126\2\43\2\uffff\1\132\2\43\1\uffff\1\43\2\uffff\1\77\7\uffff\1\43\1\uffff\1\140\4\43\2\uffff\1\43\1\uffff\1\43\3\uffff\1\146\1\147\1\150\1\uffff\2\43\1\153\2\43\1\uffff\1\156\2\43\1\161\1\162\3\uffff\1\163\1\164\1\uffff\2\43\1\uffff\1\167\1\170\4\uffff\2\43\2\uffff\1\43\1\174\1\175\2\uffff";
    static final String DFA18_eofS =
        "\176\uffff";
    static final String DFA18_minS =
        "\1\0\1\60\1\75\1\60\1\uffff\1\60\1\uffff\6\60\2\uffff\3\60\1\77\1\60\1\uffff\2\60\1\11\1\101\2\uffff\2\0\1\52\2\uffff\1\60\1\41\1\60\1\uffff\2\60\2\uffff\1\60\1\uffff\2\60\1\uffff\2\41\1\60\1\41\1\60\3\41\2\60\2\uffff\1\41\2\60\1\uffff\1\60\2\uffff\1\60\7\uffff\1\60\1\uffff\1\41\4\60\2\uffff\1\60\1\uffff\1\60\3\uffff\3\41\1\uffff\2\60\1\41\2\60\1\uffff\1\41\2\60\2\41\3\uffff\2\41\1\uffff\2\60\1\uffff\2\41\4\uffff\2\60\2\uffff\1\60\2\41\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\1\uffff\6\172\2\uffff\3\172\1\77\1\172\1\uffff\2\172\1\40\1\172\2\uffff\2\uffff\1\57\2\uffff\3\172\1\uffff\2\172\2\uffff\1\172\1\uffff\2\172\1\uffff\12\172\2\uffff\3\172\1\uffff\1\172\2\uffff\1\172\7\uffff\1\172\1\uffff\5\172\2\uffff\1\172\1\uffff\1\172\3\uffff\3\172\1\uffff\5\172\1\uffff\5\172\3\uffff\2\172\1\uffff\2\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA18_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\6\uffff\1\23\1\24\5\uffff\1\36\4\uffff\1\42\1\43\3\uffff\1\47\1\50\3\uffff\1\40\2\uffff\1\7\1\2\1\uffff\1\4\2\uffff\1\6\12\uffff\1\23\1\24\3\uffff\1\33\1\uffff\1\36\1\37\1\uffff\1\42\1\41\1\47\1\43\1\44\1\45\1\46\1\uffff\1\13\5\uffff\1\10\1\21\1\uffff\1\27\1\uffff\1\15\1\16\1\34\3\uffff\1\26\5\uffff\1\17\5\uffff\1\22\1\30\1\25\2\uffff\1\35\2\uffff\1\3\2\uffff\1\11\1\12\1\31\1\32\2\uffff\1\5\1\14\3\uffff\1\20\1\1";
    static final String DFA18_specialS =
        "\1\1\32\uffff\1\0\1\2\141\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\37\1\36\1\27\2\37\1\36\22\37\1\36\1\37\1\33\2\37\1\4\1\37\1\34\1\15\1\16\2\37\1\6\2\37\1\35\12\32\1\2\1\24\1\37\1\22\3\37\32\25\3\37\1\30\1\31\1\37\1\23\1\26\1\20\1\12\1\11\1\1\1\26\1\17\1\7\2\26\1\21\1\26\1\14\1\13\2\26\1\3\1\26\1\10\2\26\1\5\3\26\uff85\37",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\10\44\1\41\5\44\1\42\5\44\1\40\5\44",
            "\1\46",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\4\44\1\50\25\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\7\44\1\53\11\44\1\52\10\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\5\44\1\55\7\44\1\56\14\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\7\44\1\57\3\44\1\60\16\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\13\44\1\61\16\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\16\44\1\62\13\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\3\44\1\63\15\44\1\64\10\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\10\44\1\66\5\44\1\65\13\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\3\44\1\71\26\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\16\44\1\72\13\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\10\44\1\73\21\44",
            "\1\74",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\15\44\1\75\14\44",
            "",
            "\12\101\7\uffff\32\100\4\uffff\1\101\1\uffff\32\100",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\2\103\2\uffff\1\103\22\uffff\1\103",
            "\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "\0\105",
            "\0\105",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\15\44\1\110\14\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\21\44\1\112\10\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\12\113\7\uffff\32\113\6\uffff\32\113",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\1\114\31\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\10\44\1\115\21\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\10\44\1\116\21\44",
            "",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\4\44\1\121\25\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\22\44\1\123\7\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\17\44\1\127\3\44\1\130\6\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\13\44\1\131\16\44",
            "",
            "",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\15\44\1\133\14\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\22\44\1\134\7\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\3\44\1\135\26\44",
            "",
            "",
            "\12\101\7\uffff\32\100\4\uffff\1\101\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\2\44\1\136\27\44",
            "",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\4\44\1\137\25\44",
            "\12\113\7\uffff\32\113\4\uffff\1\45\1\uffff\32\113",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\3\44\1\141\26\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\23\44\1\142\6\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\13\44\1\143\16\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\15\44\1\144\14\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\4\44\1\145\25\44",
            "",
            "",
            "",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\22\44\1\151\7\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\23\44\1\152\6\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\23\44\1\154\6\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\1\155\31\44",
            "",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\4\44\1\157\25\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\4\44\1\160\25\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "",
            "",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\10\44\1\165\21\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\2\44\1\166\27\44",
            "",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\16\44\1\171\13\44",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\7\44\1\172\22\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\45\1\uffff\15\44\1\173\14\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\43\4\uffff\1\43\4\uffff\1\43\1\uffff\3\43\12\44\5\uffff\1\43\1\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_SEP | RULE_MAJ | RULE_SYMBOL | RULE_ESPACE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_27 = input.LA(1);

                        s = -1;
                        if ( ((LA18_27>='\u0000' && LA18_27<='\uFFFF')) ) {s = 69;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='f') ) {s = 1;}

                        else if ( (LA18_0==':') ) {s = 2;}

                        else if ( (LA18_0=='r') ) {s = 3;}

                        else if ( (LA18_0=='%') ) {s = 4;}

                        else if ( (LA18_0=='w') ) {s = 5;}

                        else if ( (LA18_0==',') ) {s = 6;}

                        else if ( (LA18_0=='i') ) {s = 7;}

                        else if ( (LA18_0=='t') ) {s = 8;}

                        else if ( (LA18_0=='e') ) {s = 9;}

                        else if ( (LA18_0=='d') ) {s = 10;}

                        else if ( (LA18_0=='o') ) {s = 11;}

                        else if ( (LA18_0=='n') ) {s = 12;}

                        else if ( (LA18_0=='(') ) {s = 13;}

                        else if ( (LA18_0==')') ) {s = 14;}

                        else if ( (LA18_0=='h') ) {s = 15;}

                        else if ( (LA18_0=='c') ) {s = 16;}

                        else if ( (LA18_0=='l') ) {s = 17;}

                        else if ( (LA18_0=='=') ) {s = 18;}

                        else if ( (LA18_0=='a') ) {s = 19;}

                        else if ( (LA18_0==';') ) {s = 20;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')) ) {s = 21;}

                        else if ( (LA18_0=='b'||LA18_0=='g'||(LA18_0>='j' && LA18_0<='k')||LA18_0=='m'||(LA18_0>='p' && LA18_0<='q')||LA18_0=='s'||(LA18_0>='u' && LA18_0<='v')||(LA18_0>='x' && LA18_0<='z')) ) {s = 22;}

                        else if ( (LA18_0=='\n') ) {s = 23;}

                        else if ( (LA18_0=='^') ) {s = 24;}

                        else if ( (LA18_0=='_') ) {s = 25;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 26;}

                        else if ( (LA18_0=='\"') ) {s = 27;}

                        else if ( (LA18_0=='\'') ) {s = 28;}

                        else if ( (LA18_0=='/') ) {s = 29;}

                        else if ( (LA18_0=='\t'||LA18_0=='\r'||LA18_0==' ') ) {s = 30;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='$')||LA18_0=='&'||(LA18_0>='*' && LA18_0<='+')||(LA18_0>='-' && LA18_0<='.')||LA18_0=='<'||(LA18_0>='>' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_28 = input.LA(1);

                        s = -1;
                        if ( ((LA18_28>='\u0000' && LA18_28<='\uFFFF')) ) {s = 69;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}