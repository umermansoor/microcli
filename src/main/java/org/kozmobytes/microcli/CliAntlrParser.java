// $ANTLR 3.3 Nov 30, 2010 12:50:56 CliAntlr.g 2012-07-08 00:08:49

package org.kozmobytes.microcli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CliAntlrParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CMD_CONNECT", "CMD_EXIT", "CMD_HELP", "CMD_SHOW_VERSION", "CMD_NO_OP", "CMD_ID_LIST", "SEMICOLON", "CONNECT", "HELP", "EXIT", "QUIT", "SHOW", "VERSION", "Identifier", "StringLiteral", "IP_ADDRESS", "IntegerPositiveLiteral", "SingleStringCharacter", "EscapeSequence", "SingleEscapeCharacter", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "NonEscapeCharacter", "EscapeCharacter", "HexDigit", "DecimalDigit", "Letter", "Digit", "Alnum", "WS", "'/'", "'?'", "'.'"
    };
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

    // delegates
    // delegators


        public CliAntlrParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CliAntlrParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CliAntlrParser.tokenNames; }
    public String getGrammarFileName() { return "CliAntlr.g"; }


        public void reportError(RecognitionException e) 
        {
            String errorMessage = "Syntax error at position " + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames());

            throw new RuntimeException(errorMessage);
        }


    public static class root_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // CliAntlr.g:71:1: root : statement ( SEMICOLON )? EOF -> statement ;
    public final CliAntlrParser.root_return root() throws RecognitionException {
        CliAntlrParser.root_return retval = new CliAntlrParser.root_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMICOLON2=null;
        Token EOF3=null;
        CliAntlrParser.statement_return statement1 = null;


        CommonTree SEMICOLON2_tree=null;
        CommonTree EOF3_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CliAntlr.g:71:5: ( statement ( SEMICOLON )? EOF -> statement )
            // CliAntlr.g:71:7: statement ( SEMICOLON )? EOF
            {
            pushFollow(FOLLOW_statement_in_root150);
            statement1=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());
            // CliAntlr.g:71:17: ( SEMICOLON )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // CliAntlr.g:0:0: SEMICOLON
                    {
                    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_root152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON2);


                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root155); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 71:32: -> statement
            {
                adaptor.addChild(root_0, stream_statement.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // CliAntlr.g:73:1: statement : ( connectStatement | exitStatement | helpStatement | showStatement | -> ^( CMD_NO_OP ) );
    public final CliAntlrParser.statement_return statement() throws RecognitionException {
        CliAntlrParser.statement_return retval = new CliAntlrParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliAntlrParser.connectStatement_return connectStatement4 = null;

        CliAntlrParser.exitStatement_return exitStatement5 = null;

        CliAntlrParser.helpStatement_return helpStatement6 = null;

        CliAntlrParser.showStatement_return showStatement7 = null;



        try {
            // CliAntlr.g:74:5: ( connectStatement | exitStatement | helpStatement | showStatement | -> ^( CMD_NO_OP ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case CONNECT:
                {
                alt2=1;
                }
                break;
            case EXIT:
            case QUIT:
                {
                alt2=2;
                }
                break;
            case HELP:
            case 36:
                {
                alt2=3;
                }
                break;
            case SHOW:
                {
                alt2=4;
                }
                break;
            case EOF:
            case SEMICOLON:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // CliAntlr.g:74:7: connectStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_connectStatement_in_statement171);
                    connectStatement4=connectStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connectStatement4.getTree());

                    }
                    break;
                case 2 :
                    // CliAntlr.g:75:7: exitStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exitStatement_in_statement179);
                    exitStatement5=exitStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exitStatement5.getTree());

                    }
                    break;
                case 3 :
                    // CliAntlr.g:76:7: helpStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_helpStatement_in_statement187);
                    helpStatement6=helpStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, helpStatement6.getTree());

                    }
                    break;
                case 4 :
                    // CliAntlr.g:77:7: showStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showStatement_in_statement195);
                    showStatement7=showStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showStatement7.getTree());

                    }
                    break;
                case 5 :
                    // CliAntlr.g:78:7: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 78:7: -> ^( CMD_NO_OP )
                    {
                        // CliAntlr.g:78:10: ^( CMD_NO_OP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_NO_OP, "CMD_NO_OP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class connectStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "connectStatement"
    // CliAntlr.g:81:1: connectStatement : ( CONNECT host '/' port ( username password )? -> ^( CMD_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( CMD_CONNECT ip_address port ( username password )? ) );
    public final CliAntlrParser.connectStatement_return connectStatement() throws RecognitionException {
        CliAntlrParser.connectStatement_return retval = new CliAntlrParser.connectStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONNECT8=null;
        Token char_literal10=null;
        Token CONNECT14=null;
        Token char_literal16=null;
        CliAntlrParser.host_return host9 = null;

        CliAntlrParser.port_return port11 = null;

        CliAntlrParser.username_return username12 = null;

        CliAntlrParser.password_return password13 = null;

        CliAntlrParser.ip_address_return ip_address15 = null;

        CliAntlrParser.port_return port17 = null;

        CliAntlrParser.username_return username18 = null;

        CliAntlrParser.password_return password19 = null;


        CommonTree CONNECT8_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree CONNECT14_tree=null;
        CommonTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_port=new RewriteRuleSubtreeStream(adaptor,"rule port");
        RewriteRuleSubtreeStream stream_ip_address=new RewriteRuleSubtreeStream(adaptor,"rule ip_address");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_host=new RewriteRuleSubtreeStream(adaptor,"rule host");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // CliAntlr.g:82:5: ( CONNECT host '/' port ( username password )? -> ^( CMD_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( CMD_CONNECT ip_address port ( username password )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CONNECT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==Identifier) ) {
                    alt5=1;
                }
                else if ( (LA5_1==IP_ADDRESS) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // CliAntlr.g:82:7: CONNECT host '/' port ( username password )?
                    {
                    CONNECT8=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT8);

                    pushFollow(FOLLOW_host_in_connectStatement226);
                    host9=host();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_host.add(host9.getTree());
                    char_literal10=(Token)match(input,35,FOLLOW_35_in_connectStatement228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal10);

                    pushFollow(FOLLOW_port_in_connectStatement230);
                    port11=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port11.getTree());
                    // CliAntlr.g:82:29: ( username password )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==Identifier) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // CliAntlr.g:82:30: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement233);
                            username12=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username12.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement235);
                            password13=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password13.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: username, password, host, port
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:9: -> ^( CMD_CONNECT host port ( username password )? )
                    {
                        // CliAntlr.g:83:12: ^( CMD_CONNECT host port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_CONNECT, "CMD_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_host.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // CliAntlr.g:83:36: ( username password )?
                        if ( stream_username.hasNext()||stream_password.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_username.reset();
                        stream_password.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // CliAntlr.g:84:7: CONNECT ip_address '/' port ( username password )?
                    {
                    CONNECT14=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT14);

                    pushFollow(FOLLOW_ip_address_in_connectStatement272);
                    ip_address15=ip_address();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ip_address.add(ip_address15.getTree());
                    char_literal16=(Token)match(input,35,FOLLOW_35_in_connectStatement274); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal16);

                    pushFollow(FOLLOW_port_in_connectStatement276);
                    port17=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port17.getTree());
                    // CliAntlr.g:84:35: ( username password )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Identifier) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // CliAntlr.g:84:36: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement279);
                            username18=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username18.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement281);
                            password19=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password19.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: password, username, ip_address, port
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:9: -> ^( CMD_CONNECT ip_address port ( username password )? )
                    {
                        // CliAntlr.g:85:12: ^( CMD_CONNECT ip_address port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_CONNECT, "CMD_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_ip_address.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // CliAntlr.g:85:42: ( username password )?
                        if ( stream_password.hasNext()||stream_username.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_password.reset();
                        stream_username.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "connectStatement"

    public static class showStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showStatement"
    // CliAntlr.g:88:1: showStatement : showVersion ;
    public final CliAntlrParser.showStatement_return showStatement() throws RecognitionException {
        CliAntlrParser.showStatement_return retval = new CliAntlrParser.showStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliAntlrParser.showVersion_return showVersion20 = null;



        try {
            // CliAntlr.g:89:5: ( showVersion )
            // CliAntlr.g:89:7: showVersion
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_showVersion_in_showStatement325);
            showVersion20=showVersion();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, showVersion20.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showStatement"

    public static class helpStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "helpStatement"
    // CliAntlr.g:92:1: helpStatement : ( HELP HELP -> ^( CMD_HELP CMD_HELP ) | HELP CONNECT -> ^( CMD_HELP CMD_CONNECT ) | HELP EXIT -> ^( CMD_HELP CMD_EXIT ) | HELP QUIT -> ^( CMD_HELP CMD_EXIT ) | HELP SHOW VERSION -> ^( CMD_HELP CMD_SHOW_VERSION ) | HELP -> ^( CMD_HELP ) | '?' -> ^( CMD_HELP ) );
    public final CliAntlrParser.helpStatement_return helpStatement() throws RecognitionException {
        CliAntlrParser.helpStatement_return retval = new CliAntlrParser.helpStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HELP21=null;
        Token HELP22=null;
        Token HELP23=null;
        Token CONNECT24=null;
        Token HELP25=null;
        Token EXIT26=null;
        Token HELP27=null;
        Token QUIT28=null;
        Token HELP29=null;
        Token SHOW30=null;
        Token VERSION31=null;
        Token HELP32=null;
        Token char_literal33=null;

        CommonTree HELP21_tree=null;
        CommonTree HELP22_tree=null;
        CommonTree HELP23_tree=null;
        CommonTree CONNECT24_tree=null;
        CommonTree HELP25_tree=null;
        CommonTree EXIT26_tree=null;
        CommonTree HELP27_tree=null;
        CommonTree QUIT28_tree=null;
        CommonTree HELP29_tree=null;
        CommonTree SHOW30_tree=null;
        CommonTree VERSION31_tree=null;
        CommonTree HELP32_tree=null;
        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_HELP=new RewriteRuleTokenStream(adaptor,"token HELP");
        RewriteRuleTokenStream stream_VERSION=new RewriteRuleTokenStream(adaptor,"token VERSION");
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");

        try {
            // CliAntlr.g:93:5: ( HELP HELP -> ^( CMD_HELP CMD_HELP ) | HELP CONNECT -> ^( CMD_HELP CMD_CONNECT ) | HELP EXIT -> ^( CMD_HELP CMD_EXIT ) | HELP QUIT -> ^( CMD_HELP CMD_EXIT ) | HELP SHOW VERSION -> ^( CMD_HELP CMD_SHOW_VERSION ) | HELP -> ^( CMD_HELP ) | '?' -> ^( CMD_HELP ) )
            int alt6=7;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==HELP) ) {
                switch ( input.LA(2) ) {
                case HELP:
                    {
                    alt6=1;
                    }
                    break;
                case CONNECT:
                    {
                    alt6=2;
                    }
                    break;
                case EXIT:
                    {
                    alt6=3;
                    }
                    break;
                case QUIT:
                    {
                    alt6=4;
                    }
                    break;
                case SHOW:
                    {
                    alt6=5;
                    }
                    break;
                case EOF:
                case SEMICOLON:
                    {
                    alt6=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA6_0==36) ) {
                alt6=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // CliAntlr.g:93:7: HELP HELP
                    {
                    HELP21=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP21);

                    HELP22=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP22);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 94:9: -> ^( CMD_HELP CMD_HELP )
                    {
                        // CliAntlr.g:94:12: ^( CMD_HELP CMD_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_HELP, "CMD_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(CMD_HELP, "CMD_HELP"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // CliAntlr.g:95:7: HELP CONNECT
                    {
                    HELP23=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP23);

                    CONNECT24=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_helpStatement371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT24);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 96:9: -> ^( CMD_HELP CMD_CONNECT )
                    {
                        // CliAntlr.g:96:12: ^( CMD_HELP CMD_CONNECT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_HELP, "CMD_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(CMD_CONNECT, "CMD_CONNECT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // CliAntlr.g:97:7: HELP EXIT
                    {
                    HELP25=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP25);

                    EXIT26=(Token)match(input,EXIT,FOLLOW_EXIT_in_helpStatement398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT26);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 98:9: -> ^( CMD_HELP CMD_EXIT )
                    {
                        // CliAntlr.g:98:12: ^( CMD_HELP CMD_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_HELP, "CMD_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(CMD_EXIT, "CMD_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // CliAntlr.g:99:7: HELP QUIT
                    {
                    HELP27=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP27);

                    QUIT28=(Token)match(input,QUIT,FOLLOW_QUIT_in_helpStatement425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT28);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 100:9: -> ^( CMD_HELP CMD_EXIT )
                    {
                        // CliAntlr.g:100:12: ^( CMD_HELP CMD_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_HELP, "CMD_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(CMD_EXIT, "CMD_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // CliAntlr.g:101:7: HELP SHOW VERSION
                    {
                    HELP29=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP29);

                    SHOW30=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW30);

                    VERSION31=(Token)match(input,VERSION,FOLLOW_VERSION_in_helpStatement454); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VERSION.add(VERSION31);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 102:9: -> ^( CMD_HELP CMD_SHOW_VERSION )
                    {
                        // CliAntlr.g:102:12: ^( CMD_HELP CMD_SHOW_VERSION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_HELP, "CMD_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(CMD_SHOW_VERSION, "CMD_SHOW_VERSION"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // CliAntlr.g:103:7: HELP
                    {
                    HELP32=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP32);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 104:9: -> ^( CMD_HELP )
                    {
                        // CliAntlr.g:104:12: ^( CMD_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_HELP, "CMD_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // CliAntlr.g:105:7: '?'
                    {
                    char_literal33=(Token)match(input,36,FOLLOW_36_in_helpStatement501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal33);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 106:9: -> ^( CMD_HELP )
                    {
                        // CliAntlr.g:106:12: ^( CMD_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_HELP, "CMD_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "helpStatement"

    public static class exitStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exitStatement"
    // CliAntlr.g:109:1: exitStatement : ( QUIT -> ^( CMD_EXIT ) | EXIT -> ^( CMD_EXIT ) );
    public final CliAntlrParser.exitStatement_return exitStatement() throws RecognitionException {
        CliAntlrParser.exitStatement_return retval = new CliAntlrParser.exitStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUIT34=null;
        Token EXIT35=null;

        CommonTree QUIT34_tree=null;
        CommonTree EXIT35_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");

        try {
            // CliAntlr.g:110:5: ( QUIT -> ^( CMD_EXIT ) | EXIT -> ^( CMD_EXIT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==QUIT) ) {
                alt7=1;
            }
            else if ( (LA7_0==EXIT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // CliAntlr.g:110:7: QUIT
                    {
                    QUIT34=(Token)match(input,QUIT,FOLLOW_QUIT_in_exitStatement536); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT34);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 110:12: -> ^( CMD_EXIT )
                    {
                        // CliAntlr.g:110:15: ^( CMD_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_EXIT, "CMD_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // CliAntlr.g:111:7: EXIT
                    {
                    EXIT35=(Token)match(input,EXIT,FOLLOW_EXIT_in_exitStatement550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT35);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 111:12: -> ^( CMD_EXIT )
                    {
                        // CliAntlr.g:111:15: ^( CMD_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_EXIT, "CMD_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exitStatement"

    public static class showVersion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showVersion"
    // CliAntlr.g:114:1: showVersion : SHOW VERSION -> ^( CMD_SHOW_VERSION ) ;
    public final CliAntlrParser.showVersion_return showVersion() throws RecognitionException {
        CliAntlrParser.showVersion_return retval = new CliAntlrParser.showVersion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW36=null;
        Token VERSION37=null;

        CommonTree SHOW36_tree=null;
        CommonTree VERSION37_tree=null;
        RewriteRuleTokenStream stream_VERSION=new RewriteRuleTokenStream(adaptor,"token VERSION");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // CliAntlr.g:115:5: ( SHOW VERSION -> ^( CMD_SHOW_VERSION ) )
            // CliAntlr.g:115:7: SHOW VERSION
            {
            SHOW36=(Token)match(input,SHOW,FOLLOW_SHOW_in_showVersion573); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW36);

            VERSION37=(Token)match(input,VERSION,FOLLOW_VERSION_in_showVersion575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VERSION.add(VERSION37);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:9: -> ^( CMD_SHOW_VERSION )
            {
                // CliAntlr.g:116:12: ^( CMD_SHOW_VERSION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_SHOW_VERSION, "CMD_SHOW_VERSION"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showVersion"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // CliAntlr.g:120:1: command : Identifier ;
    public final CliAntlrParser.command_return command() throws RecognitionException {
        CliAntlrParser.command_return retval = new CliAntlrParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier38=null;

        CommonTree Identifier38_tree=null;

        try {
            // CliAntlr.g:120:9: ( Identifier )
            // CliAntlr.g:120:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier38=(Token)match(input,Identifier,FOLLOW_Identifier_in_command609); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier38_tree = (CommonTree)adaptor.create(Identifier38);
            adaptor.addChild(root_0, Identifier38_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class host_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host"
    // CliAntlr.g:123:1: host : host_name -> ^( CMD_ID_LIST host_name ) ;
    public final CliAntlrParser.host_return host() throws RecognitionException {
        CliAntlrParser.host_return retval = new CliAntlrParser.host_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliAntlrParser.host_name_return host_name39 = null;


        RewriteRuleSubtreeStream stream_host_name=new RewriteRuleSubtreeStream(adaptor,"rule host_name");
        try {
            // CliAntlr.g:124:5: ( host_name -> ^( CMD_ID_LIST host_name ) )
            // CliAntlr.g:124:7: host_name
            {
            pushFollow(FOLLOW_host_name_in_host630);
            host_name39=host_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_host_name.add(host_name39.getTree());


            // AST REWRITE
            // elements: host_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 125:9: -> ^( CMD_ID_LIST host_name )
            {
                // CliAntlr.g:125:12: ^( CMD_ID_LIST host_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_ID_LIST, "CMD_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_host_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host"

    public static class username_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "username"
    // CliAntlr.g:128:1: username : Identifier ;
    public final CliAntlrParser.username_return username() throws RecognitionException {
        CliAntlrParser.username_return retval = new CliAntlrParser.username_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier40=null;

        CommonTree Identifier40_tree=null;

        try {
            // CliAntlr.g:128:9: ( Identifier )
            // CliAntlr.g:128:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier40=(Token)match(input,Identifier,FOLLOW_Identifier_in_username658); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier40_tree = (CommonTree)adaptor.create(Identifier40);
            adaptor.addChild(root_0, Identifier40_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"

    public static class password_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "password"
    // CliAntlr.g:131:1: password : StringLiteral ;
    public final CliAntlrParser.password_return password() throws RecognitionException {
        CliAntlrParser.password_return retval = new CliAntlrParser.password_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral41=null;

        CommonTree StringLiteral41_tree=null;

        try {
            // CliAntlr.g:131:9: ( StringLiteral )
            // CliAntlr.g:131:11: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral41=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_password670); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral41_tree = (CommonTree)adaptor.create(StringLiteral41);
            adaptor.addChild(root_0, StringLiteral41_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "password"

    public static class host_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host_name"
    // CliAntlr.g:134:1: host_name : Identifier ( '.' Identifier )* ;
    public final CliAntlrParser.host_name_return host_name() throws RecognitionException {
        CliAntlrParser.host_name_return retval = new CliAntlrParser.host_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier42=null;
        Token char_literal43=null;
        Token Identifier44=null;

        CommonTree Identifier42_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree Identifier44_tree=null;

        try {
            // CliAntlr.g:135:5: ( Identifier ( '.' Identifier )* )
            // CliAntlr.g:135:7: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier42=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name687); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier42_tree = (CommonTree)adaptor.create(Identifier42);
            adaptor.addChild(root_0, Identifier42_tree);
            }
            // CliAntlr.g:135:18: ( '.' Identifier )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // CliAntlr.g:135:19: '.' Identifier
            	    {
            	    char_literal43=(Token)match(input,37,FOLLOW_37_in_host_name690); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal43_tree = (CommonTree)adaptor.create(char_literal43);
            	    adaptor.addChild(root_0, char_literal43_tree);
            	    }
            	    Identifier44=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name692); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier44_tree = (CommonTree)adaptor.create(Identifier44);
            	    adaptor.addChild(root_0, Identifier44_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host_name"

    public static class ip_address_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip_address"
    // CliAntlr.g:138:1: ip_address : IP_ADDRESS -> ^( CMD_ID_LIST IP_ADDRESS ) ;
    public final CliAntlrParser.ip_address_return ip_address() throws RecognitionException {
        CliAntlrParser.ip_address_return retval = new CliAntlrParser.ip_address_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IP_ADDRESS45=null;

        CommonTree IP_ADDRESS45_tree=null;
        RewriteRuleTokenStream stream_IP_ADDRESS=new RewriteRuleTokenStream(adaptor,"token IP_ADDRESS");

        try {
            // CliAntlr.g:139:5: ( IP_ADDRESS -> ^( CMD_ID_LIST IP_ADDRESS ) )
            // CliAntlr.g:139:7: IP_ADDRESS
            {
            IP_ADDRESS45=(Token)match(input,IP_ADDRESS,FOLLOW_IP_ADDRESS_in_ip_address715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IP_ADDRESS.add(IP_ADDRESS45);



            // AST REWRITE
            // elements: IP_ADDRESS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:9: -> ^( CMD_ID_LIST IP_ADDRESS )
            {
                // CliAntlr.g:140:12: ^( CMD_ID_LIST IP_ADDRESS )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CMD_ID_LIST, "CMD_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_IP_ADDRESS.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ip_address"

    public static class port_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port"
    // CliAntlr.g:143:1: port : IntegerPositiveLiteral ;
    public final CliAntlrParser.port_return port() throws RecognitionException {
        CliAntlrParser.port_return retval = new CliAntlrParser.port_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerPositiveLiteral46=null;

        CommonTree IntegerPositiveLiteral46_tree=null;

        try {
            // CliAntlr.g:144:5: ( IntegerPositiveLiteral )
            // CliAntlr.g:144:7: IntegerPositiveLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerPositiveLiteral46=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_port753); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerPositiveLiteral46_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral46);
            adaptor.addChild(root_0, IntegerPositiveLiteral46_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_root150 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_root152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connectStatement_in_statement171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitStatement_in_statement179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_helpStatement_in_statement187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showStatement_in_statement195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement224 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_host_in_connectStatement226 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_connectStatement228 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_port_in_connectStatement230 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_username_in_connectStatement233 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_password_in_connectStatement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement270 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ip_address_in_connectStatement272 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_connectStatement274 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_port_in_connectStatement276 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_username_in_connectStatement279 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_password_in_connectStatement281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showVersion_in_showStatement325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement342 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_HELP_in_helpStatement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement369 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CONNECT_in_helpStatement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement396 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EXIT_in_helpStatement398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement423 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_QUIT_in_helpStatement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement450 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement452 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_VERSION_in_helpStatement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_helpStatement501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIT_in_exitStatement536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exitStatement550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showVersion573 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_VERSION_in_showVersion575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_command609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_name_in_host630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_username658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_password670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_host_name687 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_host_name690 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Identifier_in_host_name692 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_IP_ADDRESS_in_ip_address715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_port753 = new BitSet(new long[]{0x0000000000000002L});

}