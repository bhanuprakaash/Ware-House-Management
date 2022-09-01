import java.util.Scanner;

public class ComputerMenu {

    public void showComputerMenu(){
        Scanner scanner = new Scanner(System.in);
        Computer computer= new Computer();
        System.out.println();
        System.out.println("Which Computer shall we store");
        System.out.print("Brand Name:  ");
        computer.setBrandName(scanner.next());
        System.out.print("Model Name:  ");
        computer.setModelName(scanner.next());
        System.out.print("Form Factor:  ");
        computer.setFormFactor(scanner.next());
        System.out.print("HardDisk Capacity:  ");
        computer.setHardDriveCapacity(scanner.nextInt());
        System.out.print("Memory:  ");
        computer.setMemory(scanner.nextInt());
        System.out.print("CPU Speed:  ");
        computer.setCpuSpeed(scanner.nextFloat());
        System.out.print("Price:  ");
        computer.setPrice(scanner.nextFloat());
        System.out.println();

        ShelfNewVersion shelfNewVersion = new ShelfNewVersion();
        shelfNewVersion.addNewDevice(computer);

    }



}
