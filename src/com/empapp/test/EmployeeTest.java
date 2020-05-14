package com.empapp.test;
import com.empapp.model.*;
import com.empapp.service.EmployeeManage;
public class EmployeeTest
{
    public static void main(String[] args)
    {
       System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
       
       EmployeeManage employeemanage = new EmployeeManage();
       boolean status= employeemanage.EmployeeStatus();
       if(status==true){
               System.out.println("Present");
       }else{
               System.out.println("Absent");
       }
    }
}
