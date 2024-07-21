package org.ashutosh.factory_pattern.bad_design;

public class Client {
    public static void main(String[] args) {
        Employee employee = new DevopsEng(); //promotes
        System.out.println(employee.getSalary());
    }
}
