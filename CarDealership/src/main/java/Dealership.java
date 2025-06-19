import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class Dealership {

    public static final String FILE_PATH = "Garage.csv";

    public static void addVehicle(Scanner scanner) {
        Car car = InputVehicle.recordVehicle(scanner, true);
        PSVFileManager.saveVehicle(car, PSVFileManager.FILE_PATH);
        System.out.println("Vehicle added successfully.");
    }

    public static void removeVehicle(Scanner scanner) {
        List<Car> carList = PSVFileManager.readPSV(PSVFileManager.FILE_PATH);
        System.out.println("Enter the VIN of the vehicle to remove:");
        String vinToRemove = scanner.nextLine();

        boolean removed = carList.removeIf(car -> car.getVin().equalsIgnoreCase(vinToRemove));

        if (removed) {
            // Rewrite the file without the removed vehicle
            try (FileWriter fileWriter = new FileWriter(PSVFileManager.FILE_PATH, false)) { // overwrite mode
                for (Car car : carList) {
                    fileWriter.write(PSVFileManager.objectToPSV(car) + "\n");
                }
            } catch (Exception e) {
                System.out.println("Error writing to file: " + e.getMessage());
                return;
            }
            System.out.println("Vehicle removed successfully.");
        } else {
            System.out.println("Vehicle with VIN " + vinToRemove + " not found.");
        }
    }

    public static void listVehicles() {
        List<Car> carList = PSVFileManager.readPSV(PSVFileManager.FILE_PATH);
        if (carList.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            for (Car car : carList) {
                System.out.println(PSVFileManager.objectToPSV(car));
            }
        }
    }
}