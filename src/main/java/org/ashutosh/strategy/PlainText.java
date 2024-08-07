package org.ashutosh.strategy;

public class PlainText implements TextEditor{
    @Override
    public String formatText(String text){
        return text;
    }
}
