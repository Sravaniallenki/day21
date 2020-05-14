package com.empapp.service;
import com.empapp.model.Employee;
public class EmpWage2 implements EmpWage
{
   private static final int WAGEPERHOUR =30;
   private static final int FULLTIMEHOURS = 11;
   private static final int PARTTIMEHOURS = 5;

   
   public int dailyFullWage()
   {
      int dailyEmpWage =0;
      dailyEmpWage =(FULLTIMEHOURS*WAGEPERHOUR);
      return dailyEmpWage;
   }

   public int dailyPartWage()
   {
      int dailyEmpWage = 0;
      dailyEmpWage =(FULLTIMEHOURS*WAGEPERHOUR);
      return dailyEmpWage;
   }

   Employee emp2 = new Employee();
   
   public void empCheck()
   {

       int empCheck = (int)Math.floor(Math.random()*10)%2;
       if(empCheck == emp2.getFullTime())
        {

            System.out.println("Employee for Company1 is FullTime");
            System.out.println("Daily Employee Wage for Company1 is :" + dailyFullWage());
        }
        else if(empCheck == emp2.getPartTime())
        {

            System.out.println("Employee for Company1 is PartTime");
            System.out.println("Daily Employee Wage for Company1 is :" + dailyPartWage());
        }
       else{

            System.out.println("Employee is Absent");
         }
    }
}

