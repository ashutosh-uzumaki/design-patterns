package org.ashutosh.singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton employee = new Singleton();
//        employee.print("Message from the employee");
//
//        Singleton student = new Singleton();
//        student.print("Message from the student");

//        Singleton employee = Singleton.getInstance();
//        employee.print("Message from the employee");
//
//        Singleton student = Singleton.getInstance();
//        student.print("Message from the employee");
//        Singleton.instancesCreated();


        //WHAT IF THERE ARE MULTIPLE THREADS
        Thread thread1 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            singleton.print("INSTANCE FROM THREAD 1");
        });
        Thread thread2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            singleton.print("INSTANCE FROM THREAD 2");
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();;
        }

    }
}
