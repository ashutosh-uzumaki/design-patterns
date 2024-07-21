package org.ashutosh.abstract_factory_pattern;

public class Devops implements Employee{
    @Override
    public int getSalary(){
        System.out.println("Salary of Devops!");
        return 50000;
    }

    @Override
    public String getName(){
        System.out.println("DEVOPS");
        return "devops";
    }
}
