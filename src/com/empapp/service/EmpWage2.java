package com.empapp.service;
import com.empapp.model.Employee;
public class EmpWage2 implements EmpWage
{
   private static final int WAGEPERHOUR =30;
   private static final int FULLTIMEHOURS = 11;

   
   public int dailyFullWage()
   {
      int dailyEmpWage =0;
      dailyEmpWage =(FULLTIMEHOURS*WAGEPERHOUR);
      return dailyEmpWage;
   }
   Employee emp2 = new Employee();
   
   public void empCheck()
   {

       int empCheck = (int)Math.floor(Math.random()*10)%2;
       if(empCheck == emp2.getFullTime())
        {

            System.out.println("Employee for Company1 is Present");
            System.out.println("Daily Employee Wage for Company1 is :" + dailyFullWage());
        }
        else{
            System.out.println("Employee is Absent");
         }
    }
}

