package org.kozmobytes.microcli;

/**
 * CLI commands to be used only by jline's command completer. 
 * @author umermansoor
 */
public class CliCompleter 
{
    // List of all the system commands
    private static final String[] commands = 
    {
            "show version",
            "connect",
            "quit",
            "help",
            "exit",
            "help connect",
            "help show version",
            "help quit",
            "help exit",
            "help help",
            "help ?",
            "?"
    };
    
    public String[] getCommands()
    {
        return commands;
    }
}
