import java.util.Scanner;

public class SmartPhoneMenu {
    
    public void showSmartPhoneMenu(){
        Scanner scanner = new Scanner(System.in);
        SmartPhone smartphone= new SmartPhone();
        System.out.println("Which SmartPhone shall we store");
        System.out.print("Brand Name:  ");
        smartphone.setBrandName(scanner.next());
        System.out.print("Model Name:  ");
        smartphone.setModelName(scanner.next());
        System.out.print("HardDisk Capacity:  ");
        smartphone.setHardDriveCapacity(scanner.nextInt());
        System.out.print("Memory:  ");
        smartphone.setMemory(scanner.nextInt());
        System.out.print("CPU Speed:  ");
        smartphone.setCpuSpeed(scanner.nextFloat());
        System.out.print("Price:  ");
        smartphone.setPrice(scanner.nextFloat());
        System.out.print("size: ");
        smartphone.setSize(scanner.nextFloat());
        System.out.print("BroadBand Communication: ");
        smartphone.setBroadBandCommunication(scanner.next());

        ShelfNewVersion shelfNewVersion = new ShelfNewVersion();
        shelfNewVersion.addNewDevice(smartphone);
        System.out.println();
    }


}
