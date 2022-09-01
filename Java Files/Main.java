import java.util.Scanner;

public class Main {
    public static final int ADD_NEW_DEVICE = 1;
    public static final int REMOVE_DEVICE = 2;
    public static final int FILTER_DEVICES = 3;
    public static final int PRINT_ALL_DEVICES_INFO = 4;
    public static final int PRINT_PRICE_LIST = 5;
    public static final int CLOSE = 6;

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        ShelfNewVersion shelfNewVersion = new ShelfNewVersion();

        int selectMenuItem;
        do {
            menu.showMainMenu();
            System.out.print("Enter the number: ");
            selectMenuItem = scanner.nextInt();
            switch (selectMenuItem) {
                case ADD_NEW_DEVICE -> menu.showDeviceMenu();
                case REMOVE_DEVICE -> {
                    shelfNewVersion.displayAllDevices();
                    System.out.println();
                    System.out.print("Enter the index to delete: ");
                    shelfNewVersion.removeDevice(scanner.nextInt());
                    System.out.println("DELETED!!!");
                    System.out.println();
                }
                case FILTER_DEVICES -> {
                    shelfNewVersion.filterDevices();
                    System.out.println();
                }
                case PRINT_ALL_DEVICES_INFO -> {
                    shelfNewVersion.displayAllDevices();
                    System.out.println();
                }
                case PRINT_PRICE_LIST -> shelfNewVersion.printPriceListonDevices();
                case CLOSE -> {
                    System.out.println("CLOSED!!");
                    System.out.println("SEE YOU ;)");
                }
                default -> System.out.println("No Such Menu Item");
            }

        }while (selectMenuItem < 6) ;
    }
}
