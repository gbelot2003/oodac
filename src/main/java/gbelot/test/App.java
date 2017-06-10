package gbelot.test;

import clients.ClientModule;
import domain.Employee;


public class App {

    public static void main(String arg[])
    {
        Employee peggy = new Employee(1, "Pegy", "Accounting", true);
        ClientModule.hireEmployee(peggy);
    }
}
