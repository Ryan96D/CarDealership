import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void showMenu(){
        System.out.println("\nMain Menu:\n" +
                "(1) Add vehicle \n" +
                "(2) Remove vehicle \n" +
                "(3) Find vehicles within a price range \n" +
                "(4) Find vehicles by make / model \n" +
                "(5) Find vehicles by year range \n" +
                "(6) Find vehicles by color \n" +
                "(7) Find vehicles by mileage range \n" +
                "(8) Find vehicles by type (car, truck, SUV, van) \n" +
                "(9) List ALL vehicles \n" +
                "(99) Exit Program \n");
    }

    public static void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {  // Infinite loop until the user exits
            showMenu();
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.println("Add vehicle selected.");
                    Dealership.addVehicle(scanner);
                    break;

                case 2:
                    System.out.println("Remove vehicle selected.");
                    Dealership.removeVehicle(scanner);
                    break;

                case 3:
                    System.out.println("Find vehicles within a price range selected.");
                    SearchVehicle.byPrice(PSVFileManager.FILE_PATH, scanner);
                    break;

                case 4:
                    System.out.println("Find vehicles by make / model selected.");
                    SearchVehicle.byMakeModel(PSVFileManager.FILE_PATH, scanner);
                    break;

                case 5:
                    System.out.println("Find vehicles by year range selected.");
                    SearchVehicle.byYear(PSVFileManager.FILE_PATH, scanner);
                    break;

                case 6:
                    System.out.println("Find vehicles by color selected.");
                    SearchVehicle.byColor(PSVFileManager.FILE_PATH, scanner);
                    break;

                case 7:
                    System.out.println("Find vehicles by mileage range selected.");
                    SearchVehicle.byMileage(PSVFileManager.FILE_PATH, scanner);
                    break;

                case 8:
                    System.out.println("Find vehicles by type selected.");
                    SearchVehicle.byType(PSVFileManager.FILE_PATH, scanner);
                    break;

                case 9:
                    System.out.println("Listing all vehicles.");
                    Dealership.listVehicles();
                    break;

                case 99:
                    System.out.println("Exiting program.");
                    return; // End the program by returning from the method

                default:
                    System.out.println("Invalid selection. Please choose from the menu.");
            }
        }
    }
}




