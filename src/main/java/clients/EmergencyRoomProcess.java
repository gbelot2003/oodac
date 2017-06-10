package clients;

import domain.Doctor;
import domain.Employee;
import domain.Nurse;
import process.HospitalMagnament;

/**
 * Created by gbelot on 06-10-17.
 */
public class EmergencyRoomProcess {

    public static void main(String args[])
    {
        HospitalMagnament ERDirector = new HospitalMagnament();
        Employee peggy = new Nurse(1, "Peggy", "Emmergency", true);

        ERDirector.callUpon(peggy);

        Employee suzan = new Doctor(2, "Suzan", "Emmergency", true);
        ERDirector.callUpon(suzan);
    }
}
