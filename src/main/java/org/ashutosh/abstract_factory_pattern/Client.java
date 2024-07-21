package org.ashutosh.abstract_factory_pattern;

public class Client {
    public static void main(String[] args) {
        Employee devops = EmployeeFactory.getEmployee(new DevopsFactory());
        devops.getName();
        devops.getSalary();

        Employee webdev = EmployeeFactory.getEmployee(new WebDevFactory());
        webdev.getSalary();
        webdev.getName();
    }
}
