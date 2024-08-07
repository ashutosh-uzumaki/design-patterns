package org.ashutosh.strategy;

public class HTMLText implements TextEditor{
    @Override
    public String formatText(String text){
        return "<html> <body>" +text + "</body></html>";
    }
}
