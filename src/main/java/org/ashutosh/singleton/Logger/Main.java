package org.ashutosh.singleton.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("LOG!!");
    }
}
