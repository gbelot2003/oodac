package domain;

/**
 * Created by gbelot on 06-10-17.
 */
public class Nurse extends Employee {
    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action..");
    }

    private void checkVitalSings()
    {
        System.out.println("Checking vitals..");
    }

    private void drawBlood()
    {
        System.out.println("drawing blood");
    }

    private void CleanPatientArea()
    {
        System.out.println("Cleaning Patients Area");
    }

    public void performDuties() {
        CleanPatientArea();
        drawBlood();
        checkVitalSings();
    }

}
