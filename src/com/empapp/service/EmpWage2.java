package com.empapp.service;
import com.empapp.model.Employee;
public class EmpWage2 implements EmpWage
{
   private static final int WAGEPERHOUR =30;
   private static final int FULLTIMEHOURS = 11;
   private static final int PARTTIMEHOURS = 5;
   int monthlyWage = 0;
   int temp=0;
   int days=1;
   int hours=0;


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
        while(days<21 && hours<100)
         {
               switch(emp2.isPresent())
                {
                   case  1:
                            System.out.println("Employee for Company2 is Present and Full Time");
                            System.out.println("Daily Employee Wage is :" + dailyFullWage());
                            temp = dailyFullWage();
                            hours+=FULLTIMEHOURS;
                            break;
                   case  2:
                            System.out.println("Employee for Company2 is Present and part Time");
                            System.out.println("Daily Employee Wage for Company2 is :" + dailyPartWage());
                            temp = dailyPartWage();
                            hours+=PARTTIMEHOURS;
                            break;
                   case  0:
                            System.out.println("Employee for Compamy2 is Absent");
                            temp = 0 ;
                            hours+=0;
                            break;
                }
                monthlyWage+=temp;
                System.out.println("Total Hours :" + hours);
                System.out.println("Total Days :" + days);
                System.out.println("Monthly Wage Employee of Company2 is :" + monthlyWage);
                days++;

        }
    }
}

