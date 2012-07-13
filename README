# Micro CLI v 0.1
# Last updated: July 10, 2012 @ 10pm MST.
# Released under Apache Software License v2.0

# Libraries/Dependencies used:
# ============================
# Important ones are described below:
# JLine: for handling console input. Handles command history & tab completion <http://jline.sourceforge.net/>
# (Apache) Commons CLI: for parsing & handling command line options passed to the program (e.g. microcli.jar --v) <http://commons.apache.org/cli/> 
# ANTLRv3: for interpreting commands and arguments <http://www.antlr.org/> 

# Build Instructions:
# ===================
# Micro CLI uses ANTLR to parse commands. ANTLR 
# To (re)Generate Grammar
# You will need to install ANTLR3 and add the JAR to CLASSPATH
# e.g.
export CLASSPATH=/Users/umermansoor/Documents/java-code/antlr3/antlr-3.3-complete.jar:$CLASSPATH

# After creating the Grammar (.g) file, run the following command to generate Lexer, Parser, etc. Source for Java:
java org.antlr.Tool CliAntlr.g


# The Micro CLI project is uses Maven to build. Change to the main project directory (one containing pom.xml) and run the following command:

mvn clean package

# This will generate the jar file. I like one jar file will all the dependencies bundled into it. To launch Micro CLI, run the following command:

java -jar ./target/microcli-jar-with-dependencies.jar

# Note: Feel free to change maven packaging and assembly type as you like.


