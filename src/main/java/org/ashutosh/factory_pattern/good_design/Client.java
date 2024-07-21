package org.ashutosh.factory_pattern.good_design;

public class Client {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("Web developer");
        System.out.println(employee.getSalary());
        employee = EmployeeFactory.getEmployee("devops");
        System.out.println(employee.getSalary());
    }
}
