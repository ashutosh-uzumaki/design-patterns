package org.ashutosh.factory_pattern.good_design;

public class WebDev implements Employee{
    @Override
    public int getSalary(){
        System.out.println("Salary of a web dev!");
        return 500000;
    }
}
