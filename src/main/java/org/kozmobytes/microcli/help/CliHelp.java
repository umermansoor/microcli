package org.kozmobytes.microcli.help;

import java.util.List;
import java.io.*;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.Loader;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author umermansoor
 */
public class CliHelp 
{
    public String banner;
    public String help;
    
    public List<CliHelpItem> commands;
}
