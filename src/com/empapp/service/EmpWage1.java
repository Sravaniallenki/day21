package com.empapp.service;
import com.empapp.model.Employee;
public class EmpWage1 extends CompEmpWage implements EmpWage
{
   private static final int WAGEPERHOUR =20;
   private static final int FULLTIMEHOURS = 8;
   private static final int PARTTIMEHOURS = 4;
   public EmpWage1()
   {

        this.setWagePerHour(WAGEPERHOUR);
        this.setFullTimeHours(FULLTIMEHOURS);
        this.setPartTimeHours(PARTTIMEHOURS);
   }

}
