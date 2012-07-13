package org.kozmobytes.microcli;

import org.apache.commons.cli.*;

/**
 * Used to process the command line arguments and take appropriate actions
 * @author umermansoor
 */
public class CliOptions 
{
    private static CLIOptions options = null; // Info about command line options

    /*
     * Executable name
     */
    private static final String TOOL_NAME = "mcli";

    /*
     * List of all command line arguments
     */
    private static final String DAEMON_OPTION_LONG     = "daemon";
    private static final String DAEMON_OPTION_SHORT    = "d";
    
    private static final String FOLDER_OPTION_LONG     = "folder";
    private static final String FOLDER_OPTION_SHORT     = "f";
    
    private static final String MYSQL_OPTION_LONG      = "mysql";
    private static final String MYSQL_OPTION_SHORT      = "m";
    
    private static final String REDISHOST_OPTION_LONG  = "rhost";
    private static final String REDISHOST_OPTION_SHORT  = "r";
    
    private static final String REDISAUTH_OPTION_LONG  = "rauth";
    private static final String REDISAUTH_OPTION_SHORT  = "a";
    
    private static final String PASSWORD_OPTION_LONG   = "password";
    private static final String PASSWORD_OPTION_SHORT   = "p";
    
    private static final String HELP_OPTION_LONG       = "help";
    private static final String HELP_OPTION_SHORT       = "?";
    
    private static final String VERBOSE_OPTION_LONG    = "verbose";
    private static final String VERBOSE_OPTION_SHORT    = "v";

    /*
     * Default values for the command line arguments
     */
    private static final String DEFAULT_DAEMON    = "micro-cli";
    private static final String DEFAULT_FOLDER    = "/var/log";
    private static final String DEFAULT_MYSQL     = "mysql";
    private static final String DEFAULT_REDISHOST = "127.0.0.1";
    private static final String DEFAULT_REDISAUTH = "password";
    
    static
    {
        options = new CLIOptions();
        options.addOption(DAEMON_OPTION_SHORT, DAEMON_OPTION_LONG, "PROCESSNAME", "daemon process name");
        options.addOption(FOLDER_OPTION_SHORT, FOLDER_OPTION_LONG, "FOLDERPATH", "log folder");
        options.addOption(MYSQL_OPTION_SHORT, MYSQL_OPTION_LONG, "MYSQL", "MySQL daemon name");
        options.addOption(REDISHOST_OPTION_SHORT, REDISHOST_OPTION_LONG, "HOSTNAME", "redis hostname or IP (e.g. 127.0.0.1)");
        options.addOption(REDISAUTH_OPTION_SHORT, REDISAUTH_OPTION_LONG, "AUTHSTRING", "redis authentication string ");
        options.addOption(PASSWORD_OPTION_SHORT, PASSWORD_OPTION_LONG, "PASSWORD", "system Password");
        options.addOption(VERBOSE_OPTION_SHORT, VERBOSE_OPTION_LONG, "verbose output when using batch mode");
        options.addOption(HELP_OPTION_SHORT, HELP_OPTION_LONG, "usage help");
    }
    
    private static void printUsage()
    {
        new HelpFormatter().printHelp(TOOL_NAME, options);
    }
    
    public void processArgs(CliSessionState css, String[] args)
    {
        CommandLineParser parser = new GnuParser();

        try
        {
            CommandLine cmd = parser.parse(options, args, false);

            if (cmd.hasOption(DAEMON_OPTION_LONG))
                css.daemon = cmd.getOptionValue(DAEMON_OPTION_LONG);
            else
                css.daemon = DEFAULT_DAEMON;
            
            if (cmd.hasOption(FOLDER_OPTION_LONG))
                css.folder = cmd.getOptionValue(FOLDER_OPTION_LONG);
            else
                css.folder = DEFAULT_FOLDER;
            
            if (cmd.hasOption(MYSQL_OPTION_LONG))
                css.mysqlTable = cmd.getOptionValue(MYSQL_OPTION_LONG);
            else
                css.redisHost = DEFAULT_MYSQL;
                    
            if (cmd.hasOption(REDISHOST_OPTION_LONG))
                css.redisHost = cmd.getOptionValue(REDISHOST_OPTION_LONG);
            else
                css.redisHost = DEFAULT_REDISHOST;
            
            if (cmd.hasOption(VERBOSE_OPTION_LONG))
                css.verbose = true;
            
            if (cmd.hasOption(HELP_OPTION_LONG))
            {
                printUsage();
                System.exit(1);
            }

            // Abort if there are any unrecognized arguments left
            if (cmd.getArgs().length > 0)
            {
                System.err.printf("Unknown argument: %s\n", cmd.getArgs()[0]);
                System.err.println();
                printUsage();
                System.exit(1);
            }
            
        }
        catch (ParseException e)
        {
            System.err.println(e.getMessage());
            System.err.println();
            printUsage();
            System.exit(1);
        }
    }
    
    /**
     * [Copied from the Cassandra project]
     */
    private static class CLIOptions extends Options
    {
        /**
         * Add option with argument and argument name
         * @param opt shortcut for option name
         * @param longOpt complete option name
         * @param argName argument name
         * @param description description of the option
         * @return updated Options object
         */
        public Options addOption(String opt, String longOpt, String argName, String description)
        {
            Option option = new Option(opt, longOpt, true, description);
            option.setArgName(argName);

            return addOption(option);
        }

        /**
         * Add option without argument
         * @param opt shortcut for option name
         * @param longOpt complete option name
         * @param description description of the option
         * @return updated Options object
         */
        public Options addOption(String opt, String longOpt, String description)
        {
            return addOption(new Option(opt, longOpt, false, description));
        }
    } 
}
