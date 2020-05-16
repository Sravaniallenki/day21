package com.empapp.test;
import com.empapp.model.*;
import com.empapp.service.*;
public class EmployeeTest
{
    public static void main(String[] args)
    {
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
        EmpWage obj = new EmployeeWageBuilder();
        obj.addCompanyEmpWage("HCL",30,10,5,24,120);
        obj.addCompanyEmpWage("AMAZON",20,8,4,20,100);
        obj.computeEmpWage();
        System.out.println("Total Wage For Company Amazon is :" + obj.getTotalWage("Amazon"));

    }
}
