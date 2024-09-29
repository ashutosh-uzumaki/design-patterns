package org.ashutosh.factory;

import java.io.File;

public class LoggerFactory {
    public static Logger getLogger(LoggerType loggerType){
        switch(loggerType){
            case CONSOLE: return ConsoleLogger.getInstance();
            case FILE: return FileLogger.getInstance();
            default: throw new IllegalArgumentException("Unknown logger type");
        }
    }
}
