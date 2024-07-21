package org.ashutosh.factory_pattern.bad_design;

public class DevopsEng implements Employee{
    @Override
    public int getSalary(){
        System.out.println("getting salary of devops engineer");
        return 0;
    }
}
