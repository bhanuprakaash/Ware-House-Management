public class Laptop extends Device{
    private float screenSize;

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public void printLaptopDetails(Object device) {
        System.out.println("Laptop{ brandName: " + ((Laptop) device).getBrandName() + ", modelName: " + ((Laptop) device).getModelName() + ", hardDisk: "
                + ((Laptop) device).getHardDriveCapacity() + ", memory: " + ((Laptop) device).getMemory() + ", cpu Speed: " + ((Laptop) device).getCpuSpeed() + ", Price: " + ((Laptop) device).getPrice() + ", Screen Size: " + ((Laptop) device).getScreenSize() + " }");
    }
}
