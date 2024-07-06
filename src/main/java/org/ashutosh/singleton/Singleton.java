package org.ashutosh.singleton;
//this allows to create multiple instances when there are multiple threads
public class Singleton {
    private static int instances = 0;
    private static Singleton instance = null;
//    public Singleton(){
//        instances++;
//    }
//
    private Singleton(){
        instances++;
        System.out.println("Instance created "+instances);
    }

//    public static Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void print(String message){
        System.out.println(message);
    }

    public static void instancesCreated(){
        System.out.println("Total instances created are "+instances);
    }
}


