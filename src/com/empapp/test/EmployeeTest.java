package com.empapp.test;
import com.empapp.model.Employee;
import com.empapp.service.*;
public class EmployeeTest
{
    public static void main(String[] args)
    {
       System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
       EmpWage obj1 = new EmpWage1();
       EmpWage obj2 = new EmpWage2();
       obj1.empCheck();
       obj2.empCheck();
    }
}
