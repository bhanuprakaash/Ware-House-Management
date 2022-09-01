import java.util.ArrayList;
import java.util.Scanner;

public class ShelfNewVersion implements Shelf {

    private static final ArrayList<Device> devices = new ArrayList<>();
    SmartPhone smartPhone = new SmartPhone();
    Laptop laptop = new Laptop();
    Computer computer = new Computer();



    @Override
    public void addNewDevice(Object device) {
        if (device instanceof Computer) {
            devices.add((Computer) device);
        } else if (device instanceof SmartPhone) {
            devices.add((SmartPhone) device);

        } else if (device instanceof Laptop) {
            devices.add((Laptop) device);
        }

    }

    @Override
    public void removeDevice(int index) {
        devices.remove(index);
        System.out.println();
    }

    @Override
    public Device getFromIndex(int index) {
        return devices.get(index);
    }

    @Override
    public int getSize() {
        return devices.size();
    }

    public void displayAllDevices() {

        for (Object device : devices)
            if (device instanceof Computer) {
                computer.printComputerDetails(device);
            } else if (device instanceof SmartPhone) {
                smartPhone.printSmartPhoneDetails(device);
            } else if (device instanceof Laptop) {
                laptop.printLaptopDetails(device);
            } else System.out.println("None");
    }

    public void printPriceListonDevices() {
        for (int space = 0; space < getSize(); space++) {
            float computerPrice = getFromIndex(space).getPrice();
            float gstForComputer = ((computerPrice / 100) * 18);
            System.out.println("space " + space + " : " + computerPrice + "Rs + " + gstForComputer + "Rs (18% GST) = " + (computerPrice + gstForComputer) + " Rs Total");
        }
        System.out.println();
    }

    public void filterDevices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the brand-name or Model-name");
        String userInput = scanner.next();
        for (int space = 0; space < getSize(); space++) {
            if (checkBrandAndModelName(space, userInput)) {
                System.out.print("Space " + space + " : ");
                printDeviceDetails(getFromIndex(space));
            }
        }
        System.out.println();

    }

    public void printDeviceDetails(Object device) {
        if (device instanceof Computer) {
            computer.printComputerDetails(device);
        } else if (device instanceof SmartPhone) {
            smartPhone.printSmartPhoneDetails(device);

        } else if (device instanceof Laptop) {
            laptop.printLaptopDetails(device);

        } else {
            System.out.println("None");
        }
        System.out.println();
    }


    public Boolean containsBrandName(int space, String userInput) {
        return getFromIndex(space).getBrandName().toLowerCase().contains(userInput.toLowerCase());
    }

    public Boolean containsModelName(int space, String userInput) {
        return getFromIndex(space).getModelName().toLowerCase().contains(userInput.toLowerCase());
    }

    public Boolean checkBrandAndModelName(int space, String userInput) {
        return containsBrandName(space, userInput) || containsModelName(space, userInput);
    }


}
