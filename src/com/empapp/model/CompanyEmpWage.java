package com.empapp.model;
public class CompanyEmpWage
{
      public String company; 
      public final int wagePerHours; 
      public final int fullTimeHours; 
      public final int partTimeHours; 
      public final int numOfWorkingDays;
      public final int maxWorkingHours;
      public int totalEmpWage;

      public CompanyEmpWage(String company, int wagePerHours,int fullTimeHours, int partTimeHours, int numOfWorkingDays, int maxWorkingHours)

      {

            this.company = company;
            this.wagePerHours = wagePerHours;
            this.fullTimeHours = fullTimeHours;
            this.partTimeHours = partTimeHours;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxWorkingHours = maxWorkingHours;

      }

      public void setTotalEmpWage(int totalEmpWage)

      {

            this.totalEmpWage = totalEmpWage;

      }

      public String toString()

      {

            return "Total Employee Wage for Company :" + company +" is : " +totalEmpWage;

      }

}
