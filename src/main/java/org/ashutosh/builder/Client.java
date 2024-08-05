package org.ashutosh.builder;

public class Client {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        System.out.println(director1.createStudent());
        Director director2 = new Director(new MBAStudentBuilder());
        System.out.println(director2.createStudent());
    }
}
