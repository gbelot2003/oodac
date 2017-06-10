package fabric.process;

/**
 * Created by gbelot on 06-10-17.
 */
public class SmarthPhoneManufacturingPorcess extends GeneralManufacturingProcess {

    public SmarthPhoneManufacturingPorcess(String name) {
        super(name);
    }

    protected void assambleDevice() {
        System.out.println("Assabling Divece");
    }

    protected void testDevice() {
        System.out.println("Testing Divece");
    }

    protected void packagesDevice() {
        System.out.println("Packaing Divece");
    }

    protected void storeDevice() {
        System.out.println("Storing Divece");
    }
}
