import java.util.Scanner;

public class Menu {
    public static final int SELECT_COMPUTER = 1;
    private static final int SELECT_LAPTOP = 2;
    private static final int SELECT_SMARTPHONE = 3;

    public  void showMainMenu(){
        System.out.println("Select the Option: ");
        System.out.println("1.Add Device");
        System.out.println("2.Remove Device");
        System.out.println("3.Filter Devices");
        System.out.println("4.Print information of all Devices");
        System.out.println("5.Print price list of all Devices");
        System.out.println("6.Close the Application");
        System.out.println();
        }

    public void showDeviceMenu(){
        System.out.println("Which Device Shall We Store");
        System.out.println("1.Computer");
        System.out.println("2.Laptop");
        System.out.println("3.Smart Phone");
        System.out.print("Select Device Type: ");

        Scanner scanner = new Scanner(System.in);

        int selectDeviceType= scanner.nextInt();
        System.out.println();

       switch (selectDeviceType){
           case SELECT_COMPUTER -> {
               ComputerMenu computerMenu = new ComputerMenu();
               computerMenu.showComputerMenu();
           }
           case SELECT_LAPTOP -> {
               LaptopMenu laptopMenu = new LaptopMenu();
               laptopMenu.showLaptopMenu();
           }
           case SELECT_SMARTPHONE ->{
               SmartPhoneMenu smartPhoneMenu = new SmartPhoneMenu();
               smartPhoneMenu.showSmartPhoneMenu();
           }
           default -> {
               System.out.println("No Such Menu Item");
           }
       }
    }
    }

