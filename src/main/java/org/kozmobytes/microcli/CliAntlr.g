grammar CliAntlr;

// Micro CLI Grammer
// By: Umer Mansoor <umermk3@gmail.com>

// Set the option to produce Abstract Syntax Tree
options 
{
    output=AST;
    ASTLabelType=CommonTree;
    backtrack=true;
}

tokens 
{
    //
    // Top-level commands which correspond to various 
    // top-level CLI statements.
    //
    CMD_CONNECT;
    CMD_EXIT;
    CMD_HELP;
    CMD_SHOW_VERSION;
    CMD_NO_OP;
    CMD_ID_LIST;
}

@parser::header {
package org.kozmobytes.microcli;
}

@lexer::header {
package org.kozmobytes.microcli;
}

@lexer::members
{
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
}

@parser::members
{
    public void reportError(RecognitionException e) 
    {
        String errorMessage = "Syntax error at position " + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames());

        throw new RuntimeException(errorMessage);
    }
}

//
// Parser Section
//

// the root CMD
root: statement SEMICOLON? EOF -> statement;

statement
    : connectStatement
    | exitStatement
    | helpStatement
    | showStatement
    | -> ^(CMD_NO_OP)
    ;

connectStatement
    : CONNECT host '/' port (username password)?
        -> ^(CMD_CONNECT host port (username password)?)
    | CONNECT ip_address '/' port (username password)?
        -> ^(CMD_CONNECT ip_address port (username password)?)
    ;

showStatement
    : showVersion
    ;

helpStatement
    : HELP HELP 
        -> ^(CMD_HELP CMD_HELP)
    | HELP CONNECT 
        -> ^(CMD_HELP CMD_CONNECT)
    | HELP EXIT 
        -> ^(CMD_HELP CMD_EXIT)
    | HELP QUIT 
        -> ^(CMD_HELP CMD_EXIT)
    | HELP SHOW VERSION
        -> ^(CMD_HELP CMD_SHOW_VERSION)
    | HELP 
        -> ^(CMD_HELP)
    | '?'    
        -> ^(CMD_HELP)
    ;

exitStatement
    : QUIT -> ^(CMD_EXIT)
    | EXIT -> ^(CMD_EXIT)
    ;

showVersion
    : SHOW VERSION
        -> ^(CMD_SHOW_VERSION)
    ;

      
command : Identifier
    ;

host    
    : host_name
        -> ^(CMD_ID_LIST host_name)
    ;

username: Identifier
    ;

password: StringLiteral
    ;

host_name
    : Identifier ('.' Identifier)*
    ;
    
ip_address
    : IP_ADDRESS 
        -> ^(CMD_ID_LIST IP_ADDRESS)
    ;

port    
    : IntegerPositiveLiteral
    ;
//
// Lexer Section
//

//
// Keywords (in alphabetical order for convenience)
//
// CLI is case-insensitive with respect to these keywords.
// However, they MUST be listed in upper case here.
// 
CONNECT:     'CONNECT';
HELP:        'HELP';
EXIT:        'EXIT';
QUIT:        'QUIT';
SHOW:        'SHOW';
VERSION:     'VERSION';


IP_ADDRESS 
    : IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral
    ;

// literals
StringLiteral
    : '\'' SingleStringCharacter* '\''
    ;

fragment SingleStringCharacter
    : ~('\'' | '\\')
    | '\\' EscapeSequence
    ;

fragment SingleEscapeCharacter
    : '\'' | '"' | '\\' | 'b' | 'f' | 'n' | 'r' | 't' | 'v'
    ;

fragment EscapeSequence
    : CharacterEscapeSequence
    | '0'
    | HexEscapeSequence
    | UnicodeEscapeSequence
    ;


fragment CharacterEscapeSequence
    : SingleEscapeCharacter
    | NonEscapeCharacter
    ;

fragment NonEscapeCharacter
    : ~(EscapeCharacter)
    ;
fragment HexEscapeSequence
    : 'x' HexDigit HexDigit
    ;

fragment UnicodeEscapeSequence
    : 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigit
    : DecimalDigit | ('a'..'f') | ('A'..'F')
    ;

fragment EscapeCharacter
    : SingleEscapeCharacter
    | DecimalDigit
    | 'x'
    | 'u'
    ;

fragment DecimalDigit
    : ('0'..'9')
    ;

// private syntactic rules
fragment
Letter
    : 'a'..'z' 
    | 'A'..'Z'
    ;

fragment
Digit
    : '0'..'9'
    ;

fragment
Alnum
    : Letter
    | Digit
    ;

// syntactic Elements
IntegerPositiveLiteral
   : Digit+
   ;

Identifier
    : (Letter | Alnum) (Alnum | '_' | '-' )*
    ;

// Whitespace characters
WS
    :  (' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}  // whitepace
    ;

SEMICOLON
    : ';'
    ;