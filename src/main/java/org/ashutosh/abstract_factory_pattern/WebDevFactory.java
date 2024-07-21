package org.ashutosh.abstract_factory_pattern;

import org.ashutosh.factory_pattern.bad_design.WebDev;

public class WebDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee(){
        return (Employee) new WebDev();
    }

}
