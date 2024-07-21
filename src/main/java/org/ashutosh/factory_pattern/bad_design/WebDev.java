package org.ashutosh.factory_pattern.bad_design;

public class WebDev implements Employee{
    @Override
    public int getSalary(){
        System.out.println("getting salary of web developer!");
        return 500000;
    }
}
