package com.empapp.service;
import com.empapp.model.Employee;

public class EmployeeManage
{
  Employee emp = new Employee();
   public boolean EmployeeStatus()
    {

         int status=(int)(Math.random()*10)%2;
         System.out.println(status);
         if(status == 1){
            emp.setStatus(true);
            return true;
         }
         else{
            emp.setStatus(false);
         return false;
         }
     }
}
