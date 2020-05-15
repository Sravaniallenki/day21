package com.empapp.service;
import com.empapp.model.Employee;
public class EmpWage1 extends CompEmpWage implements EmpWage
{
   private String COMPANY = "AMAZON";
   private static final int WAGEPERHOUR =20;
   private static final int FULLTIMEHOURS = 8;
   private static final int PARTTIMEHOURS = 4;
   private static final int NUMOFWORKINGDAYS = 22;
   private static final int MAXWORKINGHOURS = 100;

   public EmpWage1()
   {
        this.setCompany(COMPANY);
        this.setWagePerHour(WAGEPERHOUR);
        this.setFullTimeHours(FULLTIMEHOURS);
        this.setPartTimeHours(PARTTIMEHOURS);
        this.setNumOfWorkingDays(NUMOFWORKINGDAYS);
        this.setMaxWorkingHours(MAXWORKINGHOURS);
   }

}
