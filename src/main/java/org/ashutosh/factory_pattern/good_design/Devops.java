package org.ashutosh.factory_pattern.good_design;

public class Devops implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Salary of devops!");
        return 50000;
    }
}
