package org.ashutosh.abstract_factory_pattern;

import org.ashutosh.factory_pattern.good_design.EmployeeFactory;

public class Client {
    public static void main(String[] args) {
        Employee devops = (Employee) EmployeeFactory.getEmployee(new DevopsFactory().toString());
        devops.getName();
        devops.getSalary();

        Employee webdev = (Employee) EmployeeFactory.getEmployee(new WebDevFactory().toString());
        webdev.getSalary();
        webdev.getName();
    }
}
