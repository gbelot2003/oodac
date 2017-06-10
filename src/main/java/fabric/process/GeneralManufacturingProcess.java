package fabric.process;

/**
 * Created by gbelot on 06-10-17.
 */
public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess(String name) {
        this.processName = name;
    }

    protected abstract void assambleDevice();

    protected abstract void testDevice();

    protected abstract void packagesDevice();

    protected abstract void storeDevice();

    public void launchProcess() {
        if (processName != null && !processName.isEmpty()) {
            assambleDevice();
            testDevice();
            packagesDevice();
            storeDevice();
        } else {
            System.out.println("No Process name specify");
        }

    }
}
