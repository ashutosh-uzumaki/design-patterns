package org.ashutosh.factory_pattern.good_design;

public class EmployeeFactory {
    public static Employee getEmployee(String type){
        if(type.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDev();
        }else{
            return new Devops();
        }
    }
}
