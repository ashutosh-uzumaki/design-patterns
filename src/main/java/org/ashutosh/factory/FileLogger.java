package org.ashutosh.factory;

import java.io.File;

public class FileLogger implements Logger{
    private static FileLogger fileLogger;

    private FileLogger(){}

    public static FileLogger getInstance(){
        if(fileLogger == null){
            fileLogger = new FileLogger();
        }
        return fileLogger;
    }

    @Override
    public void log(String message){
        System.out.println("File Logger: "+message);
    }
}
