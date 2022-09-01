public class SmartPhone extends Device {
    private float size;
    private String broadBandCommunication;

    public String getBroadBandCommunication() {
        return broadBandCommunication;
    }

    public void setBroadBandCommunication(String broadBandCommunication) {
        this.broadBandCommunication = broadBandCommunication;
    }


    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void printSmartPhoneDetails(Object device) {
        System.out.println("SmartPhone{ brandName: " + ((SmartPhone) device).getBrandName() + ", modelName: " + ((SmartPhone) device).getModelName() + ", hardDisk: "
                + ((SmartPhone) device).getHardDriveCapacity() + ", memory: " + ((SmartPhone) device).getMemory() + ", cpu Speed: " + ((SmartPhone) device).getCpuSpeed() + ", Price: " + ((SmartPhone) device).getPrice() + ", Screen Size: " + ((SmartPhone) device).getSize() + ", Broad Band Communication: " +
                ((SmartPhone) device).getBroadBandCommunication() + " }");
    }


}
