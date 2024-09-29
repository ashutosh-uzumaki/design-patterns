package org.ashutosh.factory;


public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = LoggerFactory.getLogger(LoggerType.CONSOLE);
        consoleLogger.log("Logging !!!!!!");
        Logger fileLogger = LoggerFactory.getLogger(LoggerType.FILE);
        fileLogger.log("Logging !!!!!!");
    }
}
