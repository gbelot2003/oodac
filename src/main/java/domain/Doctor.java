package domain;

/**
 * Created by gbelot on 06-10-17.
 */
public class Doctor extends Employee {

    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action..");
    }

    private void prescribeMedicine() {
        System.out.println("Prescribing Medicens..");
    }

    private void diagnosePatients() {
        System.out.println("Diagnosing patients");
    }

    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }

}
