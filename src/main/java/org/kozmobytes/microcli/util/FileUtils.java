package org.kozmobytes.microcli.util;

import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Common file utilities
 * @author umermansoor
 */
public class FileUtils 
{
    private static Logger logger = LoggerFactory.getLogger(FileUtils.class);

    /**
     * Closes the file, quietly
     * @param c 
     */
    public static void closeQuietly(Closeable c)
    {
        try
        {
            if (c != null)
                c.close();
        }
        catch (Exception e)
        {
            logger.warn("Failed closing " + c, e);
        }
    }
    
    /*
     * Return the filename which is used by jline to store historical 
     * commands 
     */
    public final static String getHistoryFilename()
    {
        return ".mcli.history";
        // [tbd] Read from properties
    }
    
}
