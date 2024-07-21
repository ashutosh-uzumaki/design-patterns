package org.ashutosh.abstract_factory_pattern;

public class WebDev implements Employee{
    @Override
    public int getSalary(){
        System.out.println("Salary of WebDev!");
        return 50000;
    }

    @Override
    public String getName(){
        System.out.println("Web Developer");
        return "Web Developer";
    }
}
