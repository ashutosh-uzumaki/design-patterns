package org.ashutosh.factory;

public class ConsoleLogger implements Logger{
    private static ConsoleLogger consoleLogger;

    private ConsoleLogger(){}

    public static ConsoleLogger getInstance(){
        if(consoleLogger == null){
            consoleLogger = new ConsoleLogger();
        }
        return consoleLogger;
    }

    @Override
    public void log(String message){
        System.out.println("Console Logger :"+ message);
    }
}
