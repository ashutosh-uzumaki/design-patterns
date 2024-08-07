package org.ashutosh.strategy;

public class Client {
    public static void main(String[] args) {
        TextFormatter textFormatter = new TextFormatter(new PlainText());
        String plain = textFormatter.formattedText("Ashutosh loves F1 and drag race");

        System.out.println(plain);
    }
}
