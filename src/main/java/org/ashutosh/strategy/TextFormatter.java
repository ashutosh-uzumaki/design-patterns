package org.ashutosh.strategy;

public class TextFormatter {
    private TextEditor textEditor;

    TextFormatter(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    public String formattedText(String text){
        return textEditor.formatText(text);
    }
}
