package clients;

import DAO.EmployeeDAO;
import domain.Employee;
import domain.Nurse;
import reports.EmployeesReportFormatter;
import reports.FormatType;

public class ClientModule {

    public static void main(String args[])
    {
        Employee peggy = new Nurse(1, "Pegy", "Accounting", true);
        ClientModule.hireEmployee(peggy);
        printEmployee(peggy, FormatType.CSV);
    }

    public static void hireEmployee(Employee employee)
    {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);

    }

    public static void terminateEmployee(Employee employee)
    {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployee(Employee employee, FormatType formatType)
    {
        EmployeesReportFormatter formatter = new EmployeesReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmploee());

    }
}
