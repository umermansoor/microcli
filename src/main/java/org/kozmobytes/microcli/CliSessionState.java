package org.kozmobytes.microcli;

import java.io.InputStream;
import java.io.PrintStream;

/**
 *
 * @author umermansoor
 */
public class CliSessionState 
{
    public String daemon;
    public String password;
    public String redisHost;
    public String redisAuth;
    public String mysqlTable;
    public String folder;
    public boolean verbose = false;
    
    /*
     * Streams to read/write from
     */
    public InputStream in;
    public PrintStream out;
    public PrintStream err;
    
    public CliSessionState()
    {
        in = System.in;
        out = System.out;
        err = System.err;
    }
    
    public void setOut(PrintStream newOut)
    {
        this.out = newOut;
    }

    public void setErr(PrintStream newErr)
    {
        this.err = newErr;
    }

}
