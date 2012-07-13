package org.kozmobytes.microcli;

import java.io.File;
import java.io.IOException;
import jline.ConsoleReader;
import jline.History;
import jline.SimpleCompletor;
import static org.kozmobytes.microcli.util.FileUtils.getHistoryFilename;
import static org.kozmobytes.microcli.util.CliUtils.getPrompt;

/**
 * Micro Command Line Interface (CLI) created to serve as boiler plate 
 * (template)
 * The code and concepts are inspired from the Apache Cassandra project.
 * 
 * by: umer <umermk3@gmail.com>
 * Last Updated: July 8, 2012
 *
 */

public class App 
{
    /**
     * Session state store to hold variables such as hostname, I/O streams, etc.
     */
    public  static CliSessionState sessionState = new CliSessionState();
    
    /**
     * Complete list of all commands to be used by JLine's command completer 
     */
    private static CliCompleter cliCommands = new CliCompleter();
    
    private static SimpleCompletor commandCompletor = null;
    
    /*
     * Main CLI client side module
     */
    private static CliClient cliClient;
    
    /**
     * JLine's console reader
     */
    private static ConsoleReader reader = null;

    /**
     * Application entry point
     * @param args - command line arguments
     * @throws IOException 
     */
    public static void main( String[] args ) throws IOException
    {
        CliOptions cliOptions = new CliOptions();
        cliOptions.processArgs(sessionState, args); // process command line 
                                                    // arguments

        reader = new ConsoleReader();
        commandCompletor = new SimpleCompletor(cliCommands.getCommands());
        reader.addCompletor(commandCompletor);
        reader.setBellEnabled(false);

        String historyFile = System.getProperty("user.home") + File.separator + getHistoryFilename();

        try
        {
            History history = new History(new File(historyFile));
            reader.setHistory(history);
        }
        catch (IOException exp)
        {
            sessionState.err.printf("Unable to open %s for writing %n", historyFile);
        }
        
        if ( cliClient == null )
            cliClient = new CliClient(sessionState, cliCommands);
        
        cliClient.printBanner();

        displayAndGo();    
    }
    
    /**
     * Display the prompt, accept and process user input
     */
    private static void displayAndGo()
    {
        String prompt;
        String line = "";
        String currentStatement = "";
        boolean inMultiLineStatement = false;
        
        while (line != null)
        {
            prompt = (inMultiLineStatement) ? "...\t" : getPrompt();

            try
            {
                line = reader.readLine(prompt);
            }
            catch (IOException e)
            {
                // retry on I/O Exception
            }

            if (line == null)
                return;

            line = line.trim();

            // skipping empty and comment lines
            if (line.isEmpty() || line.startsWith("!!"))
                continue;

            currentStatement += line;

            if (line.endsWith(";") || line.equals("?"))
            {
                processStatementInteractive(currentStatement);
                currentStatement = "";
                inMultiLineStatement = false;
            }
            else
            {
                currentStatement += " "; // ready for new line, in compound/multi line mode
                inMultiLineStatement = true;
            }
        }
    }
    
    /**
     * Process the CLI input command
     * @param query 
     */
    public static void processStatementInteractive(String query)
    {
        try
        {
            cliClient.executeStatement(query);
        }
        catch (Exception e)
        {
            sessionState.err.println("Bad command or file name: " + e);
        }
    }
    
    
}
