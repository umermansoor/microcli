package org.kozmobytes.microcli;

import org.kozmobytes.microcli.util.CliUtils;
import org.antlr.runtime.tree.Tree;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.Loader;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import org.kozmobytes.microcli.help.*;
import static org.kozmobytes.microcli.util.FileUtils.closeQuietly;
import static org.kozmobytes.microcli.util.CliUtils.getReleaseVersionString;

/**
 * Main CLI client side module
 * @author umermansoor
 */
public class CliClient 
{
    private CliSessionState sessionState  = null;
    private CliHelp help;
        
    public CliClient(CliSessionState cliSessionState, CliCompleter cliCommands)
    {
        this.sessionState = cliSessionState;
    }

    /**
     * Load help from the YAML file
     * @return 
     */
    private CliHelp loadHelp()
    {
        final InputStream is = this.getClass().getResourceAsStream("/org/kozmobytes/help/CliHelp.yaml");
        
        try
        {
            assert is != null;
            final Constructor constructor = new Constructor(CliHelp.class);
            TypeDescription desc = new TypeDescription(CliHelp.class);
            desc.putListPropertyType("commands", CliHelpItem.class);
            final Yaml yaml = new Yaml(new Loader(constructor));
            return (CliHelp) yaml.load(is);
         }
        finally
        {
            closeQuietly(is);
        }
    }
    
    /**
     * Print program info banner
     */
    public void printBanner()
    {
        sessionState.out.println("Welcome to Micro CLI version " + CliUtils.getReleaseVersionString() + "\n"); 
    }
    
    /**
     * Main statement execution function. Calls appropriate handler function based 
     * on the type of the command
     * @param statement
     * @throws Exception 
     */
    public void executeStatement(String statement) throws Exception
    {
        Tree tree = CliCompiler.compileQuery(statement); 
        switch (tree.getType()) 
        {
            case CliAntlrParser.CMD_EXIT:
                cleanupAndExit();
                break;
            case CliAntlrParser.CMD_HELP:
                executeHelp(tree);
                break;
            case CliAntlrParser.CMD_SHOW_VERSION:
                executeShowVersion();
                break;
            case CliAntlrParser.CMD_CONNECT:
                executeConnect();
                break;
        }  
    }
    
    /**
     * Exit the program
     */
    private void cleanupAndExit()
    {
        // do some cleanup tasks....
        System.exit(0);
    }
    
    /**
     * Execute "help" command
     * @param tree 
     */
    private void executeHelp(Tree tree) 
    {
        if (help == null)
            help = loadHelp();
        
        if (tree.getChildCount() > 0)
        {
            String token = tree.getChild(0).getText();
            for (CliHelpItem ch : help.commands)
            {
                if (token.equals(ch.name))
                {
                    sessionState.out.println(ch.help);
                    break;
                }
            }
        }
        else
        {
            printBanner();
            sessionState.out.println(help.banner);
            sessionState.out.println(help.help);
        }
    }
    
    /**
     * Execute "show version" command
     */
    private void executeShowVersion()
    {
        sessionState.out.println(getReleaseVersionString());
    }
    
    /**
     * Execute "connect" command
     */
    private void executeConnect()
    {
        sessionState.out.println("Connect is not implemented yet.");
    }
}
