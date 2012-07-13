package org.kozmobytes.microcli.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.util.*;

/**
 * Common CLI Utilities
 * @author umermansoor
 */
public class CliUtils 
{
    private static Logger logger = LoggerFactory.getLogger(CliUtils.class);
    
    /**
     * Returns the version of the program
     * @return 
     */
    public static String getReleaseVersionString()
    {
        try
        {
            InputStream in = CliUtils.class.getClassLoader().getResourceAsStream("org/kozmobytes/help/version.properties");
            
            if (in == null)
            {
                return "Unknown";
            }
            
            Properties props = new Properties();
            props.load(in);
            return props.getProperty("Version");
        }
        catch (Exception e)
        {
            logger.warn("Unable to load version.properties", e);
            return "debug version";
        }
    }
    
    /**
     * Returns the prompt
     * @return 
     */
    public static String getPrompt()
    {
        return "> ";
        // [tbd] read from a file?
    }
    
    
}
