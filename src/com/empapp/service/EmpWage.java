package comm.empapp.service;
import com.empapp.model.*;
import java.util.*;
public interface EmpWage
{

    public void EmployeeWageBuilder();
    public void addCompanyEmpWage(String company, int wagePerHours,int fullTimeHours,int partTimeHours,int numOfWorkingDays,int maxWorkingHours);
    public void computeEmpWage();
    public int dailyFullWage(CompanyEmpWage emp);
    public int dailyPartWage(CompanyEmpWage emp);
}
