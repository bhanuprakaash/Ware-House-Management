import java.util.Scanner;

public class LaptopMenu {
    public void showLaptopMenu(){
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = new Laptop();
        System.out.println("Which Laptop shall we store: ");
        System.out.print("1.Enter Brand Name:  ");
        laptop.setBrandName(scanner.next());
        System.out.print("2.Enter Model Name: ");
        laptop.setModelName(scanner.next());
        System.out.print("3.Enter hard Drive Capacity: ");
        laptop.setHardDriveCapacity(scanner.nextInt());
        System.out.print("4.Enter memory: ");
        laptop.setMemory(scanner.nextInt());
        System.out.print("5.Enter the CPU speed: ");
        laptop.setCpuSpeed(scanner.nextFloat());
        System.out.print("6.Enter the Price: ");
        laptop.setPrice(scanner.nextFloat());
        System.out.print("7.Enter the Screen Size: ");
        laptop.setScreenSize(scanner.nextFloat());

        ShelfNewVersion shelfNewVersion = new ShelfNewVersion();
        shelfNewVersion.addNewDevice(laptop);
        System.out.println();
    }
}
