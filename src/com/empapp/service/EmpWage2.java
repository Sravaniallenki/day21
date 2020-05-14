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
      dailyEmpWage = (PARTTIMEHOURS*WAGEPERHOUR);
      return dailyEmpWage;
    }

   Employee emp2 = new Employee();

   public void empCheck()
   {
     switch(emp2.isPresent())
     {
        case  1:
                System.out.println("Employee for Company1 is Present and Full Time");
                System.out.println("Daily Employee Wage is :" + dailyFullWage());
                break;
        case  2:
               System.out.println("Employee for Company1 is Present and part Time");
               System.out.println("Daily Employee Wage for Company1 is :" + dailyPartWage());
               break;
        case  0:
               System.out.println("Employee for Compamy1 is Absent");
               break;

        }
    }
}

