package fabric.client;

import fabric.process.GeneralManufacturingProcess;
import fabric.process.SmarthPhoneManufacturingPorcess;

/**
 * Created by gbelot on 06-10-17.
 */
public class DiveceFactory {
    public static void main(String args[]) {
        GeneralManufacturingProcess manufacture = new SmarthPhoneManufacturingPorcess("Iphones");
        manufacture.launchProcess();
    }
}
