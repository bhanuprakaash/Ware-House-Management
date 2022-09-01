public class Computer extends Device {
    private String formFactor;

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public void printComputerDetails(Object device) {
        System.out.println("Computer{ brandName: " + ((Computer) device).getBrandName() + ", modelName: " + ((Computer) device).getBrandName() + ", formFactor: " + ((Computer) device).getFormFactor() + ", hardDisk: "
                + ((Computer) device).getHardDriveCapacity() + " memory: " + ((Computer) device).getMemory() + ", cpu Speed: " + ((Computer) device).getCpuSpeed() + ", Price: " + ((Computer) device).getPrice() + " }");

    }

}
