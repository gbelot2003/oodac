package DAO;

import database.DatabaseConnectionManager;
import domain.Employee;

public class EmployeeDAO {

     DatabaseConnectionManager connectionManager;

     public void saveEmployee(Employee employee)
     {

         System.out.println("Save employee----" + employee);
     }

     public void deleteEmployee(Employee employee)
     {
         System.out.println("Delete employee---" + employee);
     }

}
