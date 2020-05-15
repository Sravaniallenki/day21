package com.empapp.service;
import com.empapp.model.Employee;
public class CompEmpWage implements EmpWage
{
         private String COMPANY;
         private int WAGEPERHOUR;
         private int FULLTIMEHOURS;
         private int PARTTIMEHOURS;
         private int NUMOFWORKINGDAYS;
         private int MAXWORKINGHOURS;
         private int TOTALEMPWAGE;
         
         public void setCompany(String COMPANY)
         {
                 this.COMPANY = COMPANY;
         }

         public void setWagePerHour(int WAGEPERHOUR)
         {
                 this.WAGEPERHOUR=WAGEPERHOUR;
         }
         public void setFullTimeHours(int FULLTIMEHOURS)
         {
                 this.FULLTIMEHOURS=FULLTIMEHOURS;
         }
          public void setPartTimeHours(int PARTTIMEHOURS)
         {
                 this.PARTTIMEHOURS=PARTTIMEHOURS;
         }
          public void setNumOfWorkingDays(int NUMOFWORKINGDAYS)
         {
                 this.NUMOFWORKINGDAYS=NUMOFWORKINGDAYS;
         }
         public void setMaxWorkingHours(int  MAXWORKINGHOURS)
         {
                 this.MAXWORKINGHOURS=MAXWORKINGHOURS;
         }
         public int isPresent()
         {
             int status = (int)Math.floor(Math.random()*100)%3;
             return status;
         }


         public int dailyFullWage()
         {
             int dailyEmpWage =0;
             dailyEmpWage =(FULLTIMEHOURS*WAGEPERHOUR);
             return dailyEmpWage;
         }

         
         public int dailyPartWage()
         {
              int dailyEmpWage =0;
              dailyEmpWage =(PARTTIMEHOURS*WAGEPERHOUR);
              return dailyEmpWage;
         }
         Employee emp = new Employee();

         public void computeEmpWage()
         {
               int temp =0;
               int days=1;
               int hours=0;         
         
               while(days<NUMOFWORKINGDAYS && hours<=MAXWORKINGHOURS)
               {
                      switch(isPresent())
                      {
                             case 1:
                                   System.out.println("Employee is Present and Full Time");
                                   System.out.println("Daily Employee Wage is :" + dailyFullWage());
                                   temp = dailyFullWage();
                                   hours+=FULLTIMEHOURS;
                                   break;
                             case 2:
                                   System.out.println("Employee is present and Part Time");
                                   System.out.println("Daily Employee Wage is :" + dailyPartWage());
                                   temp = dailyPartWage();
                                   hours+=PARTTIMEHOURS;
                                   break;
                             case 3:
                                   System.out.println("Employee is Absent");
                                   temp = 0;
                                   hours+=0;
                                   break;
                    }
                    TOTALEMPWAGE+=temp;
                    System.out.println("Total Hours :" + hours);
                    System.out.println("Total Days :" + days);
                    System.out.println("Total Wage for Employee is of Company:" + COMPANY +" is " + TOTALEMPWAGE );
                    days++;
                 }
         }

   
}
