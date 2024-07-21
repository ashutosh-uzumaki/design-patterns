package org.ashutosh.abstract_factory_pattern;

public class WebDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee(){
        return new WebDev();
    }

}
