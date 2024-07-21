package org.ashutosh.abstract_factory_pattern;

public class EmployeeFactory {
    public static Employee getEmployee(EmployeeAbstractFactory eaf) {
        return eaf.createEmployee();
    }
}
