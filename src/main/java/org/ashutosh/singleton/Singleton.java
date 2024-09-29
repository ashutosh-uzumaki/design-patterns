package org.ashutosh.singleton;

public class Singleton {
    private static Singleton instances;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instances == null){
            instances = new Singleton();
        }
        return instances;
    }
}
