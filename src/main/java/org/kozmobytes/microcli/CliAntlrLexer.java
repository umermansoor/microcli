// $ANTLR 3.3 Nov 30, 2010 12:50:56 CliAntlr.g 2012-07-08 00:08:49

package org.kozmobytes.microcli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CliAntlrLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int CMD_CONNECT=4;
    public static final int CMD_EXIT=5;
    public static final int CMD_HELP=6;
    public static final int CMD_SHOW_VERSION=7;
    public static final int CMD_NO_OP=8;
    public static final int CMD_ID_LIST=9;
    public static final int SEMICOLON=10;
    public static final int CONNECT=11;
    public static final int HELP=12;
    public static final int EXIT=13;
    public static final int QUIT=14;
    public static final int SHOW=15;
    public static final int VERSION=16;
    public static final int Identifier=17;
    public static final int StringLiteral=18;
    public static final int IP_ADDRESS=19;
    public static final int IntegerPositiveLiteral=20;
    public static final int SingleStringCharacter=21;
    public static final int EscapeSequence=22;
    public static final int SingleEscapeCharacter=23;
    public static final int CharacterEscapeSequence=24;
    public static final int HexEscapeSequence=25;
    public static final int UnicodeEscapeSequence=26;
    public static final int NonEscapeCharacter=27;
    public static final int EscapeCharacter=28;
    public static final int HexDigit=29;
    public static final int DecimalDigit=30;
    public static final int Letter=31;
    public static final int Digit=32;
    public static final int Alnum=33;
    public static final int WS=34;

        public void reportError(RecognitionException e) 
        {
            StringBuilder errorMessage = new StringBuilder("Syntax error at position " + e.charPositionInLine + ": ");

            if (e instanceof NoViableAltException)
            {
                int index = e.charPositionInLine;
                String error = this.input.substring(index, index);
                String statement = this.input.substring(0, this.input.size() - 1);

                errorMessage.append("unexpected \"" + error + "\" for `" + statement + "`.");
            }
            else
            {
                errorMessage.append(this.getErrorMessage(e, this.getTokenNames()));
            }

            throw new RuntimeException(errorMessage.toString());
        }


    // delegates
    // delegators

    public CliAntlrLexer() {;} 
    public CliAntlrLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CliAntlrLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "CliAntlr.g"; }

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:28:7: ( '/' )
            // CliAntlr.g:28:9: '/'
            {
            match('/'); 

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
            // CliAntlr.g:29:7: ( '?' )
            // CliAntlr.g:29:9: '?'
            {
            match('?'); 

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
            // CliAntlr.g:30:7: ( '.' )
            // CliAntlr.g:30:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "CONNECT"
    public final void mCONNECT() throws RecognitionException {
        try {
            int _type = CONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:156:8: ( 'CONNECT' )
            // CliAntlr.g:156:14: 'CONNECT'
            {
            match("CONNECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONNECT"

    // $ANTLR start "HELP"
    public final void mHELP() throws RecognitionException {
        try {
            int _type = HELP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:157:5: ( 'HELP' )
            // CliAntlr.g:157:14: 'HELP'
            {
            match("HELP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HELP"

    // $ANTLR start "EXIT"
    public final void mEXIT() throws RecognitionException {
        try {
            int _type = EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:158:5: ( 'EXIT' )
            // CliAntlr.g:158:14: 'EXIT'
            {
            match("EXIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT"

    // $ANTLR start "QUIT"
    public final void mQUIT() throws RecognitionException {
        try {
            int _type = QUIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:159:5: ( 'QUIT' )
            // CliAntlr.g:159:14: 'QUIT'
            {
            match("QUIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUIT"

    // $ANTLR start "SHOW"
    public final void mSHOW() throws RecognitionException {
        try {
            int _type = SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:160:5: ( 'SHOW' )
            // CliAntlr.g:160:14: 'SHOW'
            {
            match("SHOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHOW"

    // $ANTLR start "VERSION"
    public final void mVERSION() throws RecognitionException {
        try {
            int _type = VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:161:8: ( 'VERSION' )
            // CliAntlr.g:161:14: 'VERSION'
            {
            match("VERSION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERSION"

    // $ANTLR start "IP_ADDRESS"
    public final void mIP_ADDRESS() throws RecognitionException {
        try {
            int _type = IP_ADDRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:165:5: ( IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral )
            // CliAntlr.g:165:7: IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral
            {
            mIntegerPositiveLiteral(); 
            match('.'); 
            mIntegerPositiveLiteral(); 
            match('.'); 
            mIntegerPositiveLiteral(); 
            match('.'); 
            mIntegerPositiveLiteral(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP_ADDRESS"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:170:5: ( '\\'' ( SingleStringCharacter )* '\\'' )
            // CliAntlr.g:170:7: '\\'' ( SingleStringCharacter )* '\\''
            {
            match('\''); 
            // CliAntlr.g:170:12: ( SingleStringCharacter )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CliAntlr.g:170:12: SingleStringCharacter
            	    {
            	    mSingleStringCharacter(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "SingleStringCharacter"
    public final void mSingleStringCharacter() throws RecognitionException {
        try {
            // CliAntlr.g:174:5: (~ ( '\\'' | '\\\\' ) | '\\\\' EscapeSequence )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='\\') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // CliAntlr.g:174:7: ~ ( '\\'' | '\\\\' )
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
                case 2 :
                    // CliAntlr.g:175:7: '\\\\' EscapeSequence
                    {
                    match('\\'); 
                    mEscapeSequence(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "SingleStringCharacter"

    // $ANTLR start "SingleEscapeCharacter"
    public final void mSingleEscapeCharacter() throws RecognitionException {
        try {
            // CliAntlr.g:179:5: ( '\\'' | '\"' | '\\\\' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
            // CliAntlr.g:
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SingleEscapeCharacter"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // CliAntlr.g:183:5: ( CharacterEscapeSequence | '0' | HexEscapeSequence | UnicodeEscapeSequence )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='\u0000' && LA3_0<='/')||(LA3_0>=':' && LA3_0<='t')||(LA3_0>='v' && LA3_0<='w')||(LA3_0>='y' && LA3_0<='\uFFFF')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='0') ) {
                alt3=2;
            }
            else if ( (LA3_0=='x') ) {
                alt3=3;
            }
            else if ( (LA3_0=='u') ) {
                alt3=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // CliAntlr.g:183:7: CharacterEscapeSequence
                    {
                    mCharacterEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // CliAntlr.g:184:7: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 3 :
                    // CliAntlr.g:185:7: HexEscapeSequence
                    {
                    mHexEscapeSequence(); 

                    }
                    break;
                case 4 :
                    // CliAntlr.g:186:7: UnicodeEscapeSequence
                    {
                    mUnicodeEscapeSequence(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "CharacterEscapeSequence"
    public final void mCharacterEscapeSequence() throws RecognitionException {
        try {
            // CliAntlr.g:191:5: ( SingleEscapeCharacter | NonEscapeCharacter )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"'||LA4_0=='\''||LA4_0=='\\'||LA4_0=='b'||LA4_0=='f'||LA4_0=='n'||LA4_0=='r'||LA4_0=='t'||LA4_0=='v') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='/')||(LA4_0>=':' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='a')||(LA4_0>='c' && LA4_0<='e')||(LA4_0>='g' && LA4_0<='m')||(LA4_0>='o' && LA4_0<='q')||LA4_0=='s'||LA4_0=='w'||(LA4_0>='y' && LA4_0<='\uFFFF')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // CliAntlr.g:191:7: SingleEscapeCharacter
                    {
                    mSingleEscapeCharacter(); 

                    }
                    break;
                case 2 :
                    // CliAntlr.g:192:7: NonEscapeCharacter
                    {
                    mNonEscapeCharacter(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "CharacterEscapeSequence"

    // $ANTLR start "NonEscapeCharacter"
    public final void mNonEscapeCharacter() throws RecognitionException {
        try {
            // CliAntlr.g:196:5: (~ ( EscapeCharacter ) )
            // CliAntlr.g:196:7: ~ ( EscapeCharacter )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='a')||(input.LA(1)>='c' && input.LA(1)<='e')||(input.LA(1)>='g' && input.LA(1)<='m')||(input.LA(1)>='o' && input.LA(1)<='q')||input.LA(1)=='s'||input.LA(1)=='w'||(input.LA(1)>='y' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "NonEscapeCharacter"

    // $ANTLR start "HexEscapeSequence"
    public final void mHexEscapeSequence() throws RecognitionException {
        try {
            // CliAntlr.g:199:5: ( 'x' HexDigit HexDigit )
            // CliAntlr.g:199:7: 'x' HexDigit HexDigit
            {
            match('x'); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "HexEscapeSequence"

    // $ANTLR start "UnicodeEscapeSequence"
    public final void mUnicodeEscapeSequence() throws RecognitionException {
        try {
            // CliAntlr.g:203:5: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // CliAntlr.g:203:7: 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UnicodeEscapeSequence"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // CliAntlr.g:207:5: ( DecimalDigit | ( 'a' .. 'f' ) | ( 'A' .. 'F' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt5=1;
                }
                break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                {
                alt5=2;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // CliAntlr.g:207:7: DecimalDigit
                    {
                    mDecimalDigit(); 

                    }
                    break;
                case 2 :
                    // CliAntlr.g:207:22: ( 'a' .. 'f' )
                    {
                    // CliAntlr.g:207:22: ( 'a' .. 'f' )
                    // CliAntlr.g:207:23: 'a' .. 'f'
                    {
                    matchRange('a','f'); 

                    }


                    }
                    break;
                case 3 :
                    // CliAntlr.g:207:35: ( 'A' .. 'F' )
                    {
                    // CliAntlr.g:207:35: ( 'A' .. 'F' )
                    // CliAntlr.g:207:36: 'A' .. 'F'
                    {
                    matchRange('A','F'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "EscapeCharacter"
    public final void mEscapeCharacter() throws RecognitionException {
        try {
            // CliAntlr.g:211:5: ( SingleEscapeCharacter | DecimalDigit | 'x' | 'u' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case '\"':
            case '\'':
            case '\\':
            case 'b':
            case 'f':
            case 'n':
            case 'r':
            case 't':
            case 'v':
                {
                alt6=1;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt6=2;
                }
                break;
            case 'x':
                {
                alt6=3;
                }
                break;
            case 'u':
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // CliAntlr.g:211:7: SingleEscapeCharacter
                    {
                    mSingleEscapeCharacter(); 

                    }
                    break;
                case 2 :
                    // CliAntlr.g:212:7: DecimalDigit
                    {
                    mDecimalDigit(); 

                    }
                    break;
                case 3 :
                    // CliAntlr.g:213:7: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 4 :
                    // CliAntlr.g:214:7: 'u'
                    {
                    match('u'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "EscapeCharacter"

    // $ANTLR start "DecimalDigit"
    public final void mDecimalDigit() throws RecognitionException {
        try {
            // CliAntlr.g:218:5: ( ( '0' .. '9' ) )
            // CliAntlr.g:218:7: ( '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "DecimalDigit"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // CliAntlr.g:224:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // CliAntlr.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // CliAntlr.g:230:5: ( '0' .. '9' )
            // CliAntlr.g:230:7: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Alnum"
    public final void mAlnum() throws RecognitionException {
        try {
            // CliAntlr.g:235:5: ( Letter | Digit )
            // CliAntlr.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Alnum"

    // $ANTLR start "IntegerPositiveLiteral"
    public final void mIntegerPositiveLiteral() throws RecognitionException {
        try {
            int _type = IntegerPositiveLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:241:4: ( ( Digit )+ )
            // CliAntlr.g:241:6: ( Digit )+
            {
            // CliAntlr.g:241:6: ( Digit )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // CliAntlr.g:241:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IntegerPositiveLiteral"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:245:5: ( ( Letter | Alnum ) ( Alnum | '_' | '-' )* )
            // CliAntlr.g:245:7: ( Letter | Alnum ) ( Alnum | '_' | '-' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // CliAntlr.g:245:24: ( Alnum | '_' | '-' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='-'||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // CliAntlr.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "Identifier"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:250:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // CliAntlr.g:250:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CliAntlr.g:254:5: ( ';' )
            // CliAntlr.g:254:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    public void mTokens() throws RecognitionException {
        // CliAntlr.g:1:8: ( T__35 | T__36 | T__37 | CONNECT | HELP | EXIT | QUIT | SHOW | VERSION | IP_ADDRESS | StringLiteral | IntegerPositiveLiteral | Identifier | WS | SEMICOLON )
        int alt9=15;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // CliAntlr.g:1:10: T__35
                {
                mT__35(); 

                }
                break;
            case 2 :
                // CliAntlr.g:1:16: T__36
                {
                mT__36(); 

                }
                break;
            case 3 :
                // CliAntlr.g:1:22: T__37
                {
                mT__37(); 

                }
                break;
            case 4 :
                // CliAntlr.g:1:28: CONNECT
                {
                mCONNECT(); 

                }
                break;
            case 5 :
                // CliAntlr.g:1:36: HELP
                {
                mHELP(); 

                }
                break;
            case 6 :
                // CliAntlr.g:1:41: EXIT
                {
                mEXIT(); 

                }
                break;
            case 7 :
                // CliAntlr.g:1:46: QUIT
                {
                mQUIT(); 

                }
                break;
            case 8 :
                // CliAntlr.g:1:51: SHOW
                {
                mSHOW(); 

                }
                break;
            case 9 :
                // CliAntlr.g:1:56: VERSION
                {
                mVERSION(); 

                }
                break;
            case 10 :
                // CliAntlr.g:1:64: IP_ADDRESS
                {
                mIP_ADDRESS(); 

                }
                break;
            case 11 :
                // CliAntlr.g:1:75: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 12 :
                // CliAntlr.g:1:89: IntegerPositiveLiteral
                {
                mIntegerPositiveLiteral(); 

                }
                break;
            case 13 :
                // CliAntlr.g:1:112: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 14 :
                // CliAntlr.g:1:123: WS
                {
                mWS(); 

                }
                break;
            case 15 :
                // CliAntlr.g:1:126: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\4\uffff\6\14\1\25\4\uffff\6\14\2\uffff\1\25\7\14\1\45\1\46\1\47"+
        "\1\50\2\14\4\uffff\3\14\1\56\1\57\2\uffff";
    static final String DFA9_eofS =
        "\60\uffff";
    static final String DFA9_minS =
        "\1\11\3\uffff\1\117\1\105\1\130\1\125\1\110\1\105\1\55\4\uffff\1"+
        "\116\1\114\2\111\1\117\1\122\2\uffff\1\55\1\116\1\120\2\124\1\127"+
        "\1\123\1\105\4\55\1\111\1\103\4\uffff\1\117\1\124\1\116\2\55\2\uffff";
    static final String DFA9_maxS =
        "\1\172\3\uffff\1\117\1\105\1\130\1\125\1\110\1\105\1\172\4\uffff"+
        "\1\116\1\114\2\111\1\117\1\122\2\uffff\1\172\1\116\1\120\2\124\1"+
        "\127\1\123\1\105\4\172\1\111\1\103\4\uffff\1\117\1\124\1\116\2\172"+
        "\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\7\uffff\1\13\1\15\1\16\1\17\6\uffff\1\14\1"+
        "\12\16\uffff\1\5\1\6\1\7\1\10\5\uffff\1\4\1\11";
    static final String DFA9_specialS =
        "\60\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\15\2\uffff\1\15\22\uffff\1\15\6\uffff\1\13\6\uffff\1\3\1"+
            "\1\12\12\1\uffff\1\16\3\uffff\1\2\1\uffff\2\14\1\4\1\14\1\6"+
            "\2\14\1\5\10\14\1\7\1\14\1\10\2\14\1\11\4\14\6\uffff\32\14",
            "",
            "",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\14\1\26\1\uffff\12\27\7\uffff\32\14\4\uffff\1\14\1\uffff"+
            "\32\14",
            "",
            "",
            "",
            "",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "",
            "\1\14\1\26\1\uffff\12\27\7\uffff\32\14\4\uffff\1\14\1\uffff"+
            "\32\14",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__35 | T__36 | T__37 | CONNECT | HELP | EXIT | QUIT | SHOW | VERSION | IP_ADDRESS | StringLiteral | IntegerPositiveLiteral | Identifier | WS | SEMICOLON );";
        }
    }
 

}