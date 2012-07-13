package org.kozmobytes.microcli;

import org.kozmobytes.microcli.CliAntlrParser;
import org.kozmobytes.microcli.CliAntlrLexer;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;


/**
 *
 * @author umermansoor
 */
public class CliCompiler 
{
    // ANTLR does not provide case-insensitive tokenization support
    // out of the box. So we override the LA (lookahead) function
    // of the ANTLRStringStream class. Note: This doesn't change the
    // token text-- but just relaxes the matching rules to match
    // in upper case. [Logic borrowed from Hive code.]
    //
    // Also see discussion on this topic in:
    // http://www.antlr.org/wiki/pages/viewpage.action?pageId=1782.
    public static class ANTLRNoCaseStringStream  extends ANTLRStringStream
    {
        public ANTLRNoCaseStringStream(String input)
        {
            super(input);
        }

        public int LA(int i)
        {
            int returnChar = super.LA(i);
            if (returnChar == CharStream.EOF)
            {
                return returnChar;
            }
            else if (returnChar == 0)
            {
                return returnChar;
            }

            return Character.toUpperCase((char)returnChar);
        }
    }
    public static Tree compileQuery(String query)
    {
        Tree queryTree;

        try
        {
            ANTLRNoCaseStringStream input = new ANTLRNoCaseStringStream(query);

            CliAntlrLexer lexer = new CliAntlrLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            CliAntlrParser parser = new CliAntlrParser(tokens);

            // start parsing...
        queryTree = (Tree)(parser.root().getTree());

            // semantic analysis if any...
            //  [tbd]

        }
        catch(Exception e)
        {
            // if there was an exception we don't want to process request any further
            throw new RuntimeException(e.getMessage(), e);
        }

        return queryTree;
    }
    
}