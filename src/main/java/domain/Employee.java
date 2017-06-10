package domain;

/**
 * Created by gbelot on 06-09-17.
 */
public class Employee {
    private long Id;
    private String name;
    private String department;
    private boolean working;

    public Employee(long id, String name, String department, boolean working)
    {
        super();
        this.Id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
