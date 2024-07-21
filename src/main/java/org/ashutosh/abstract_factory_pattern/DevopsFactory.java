package org.ashutosh.abstract_factory_pattern;


public class DevopsFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee(){
        return new Devops();
    }
}
