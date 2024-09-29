package org.ashutosh.singleton;

public class MultiThreadEnv {
    private static MultiThreadEnv instances;

    private MultiThreadEnv(){}

    public static synchronized MultiThreadEnv getInstance(){
        if(instances == null){
            instances = new MultiThreadEnv();
        }
        return instances;
    }
}
