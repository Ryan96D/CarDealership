import java.util.List;
import java.util.Scanner;

public class SearchVehicle {

    public static void byPrice(String filePath, Scanner scanner) {
        List<Car> cars = PSVFileManager.readPSV(filePath);
        System.out.print("Enter minimum price: ");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter maximum price: ");
        double max = Double.parseDouble(scanner.nextLine());

        for (Car car : cars) {
            if (car.getPrice() >= min && car.getPrice() <= max) {
                System.out.println(PSVFileManager.objectToPSV(car));
            }
        }
    }

    public static void byMakeModel(String filePath, Scanner scanner) {
        List<Car> cars = PSVFileManager.readPSV(filePath);
        System.out.print("Enter model to search for: ");
        String model = scanner.nextLine().toLowerCase();

        for (Car car : cars) {
            if (car.getModel().toLowerCase().contains(model)) {
                System.out.println(PSVFileManager.objectToPSV(car));
            }
        }
    }

    public static void byYear(String filePath, Scanner scanner) {
        List<Car> cars = PSVFileManager.readPSV(filePath);
        System.out.print("Enter start year: ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter end year: ");
        int end = Integer.parseInt(scanner.nextLine());

        for (Car car : cars) {
            if (car.getYear() >= start && car.getYear() <= end) {
                System.out.println(PSVFileManager.objectToPSV(car));
            }
        }
    }

    public static void byColor(String filePath, Scanner scanner) {
        List<Car> cars = PSVFileManager.readPSV(filePath);
        System.out.print("Enter color to search for: ");
        String color = scanner.nextLine().toLowerCase();

        for (Car car : cars) {
            if (car.getColor().toLowerCase().contains(color)) {
                System.out.println(PSVFileManager.objectToPSV(car));
            }
        }
    }

    public static void byMileage(String filePath, Scanner scanner) {
        List<Car> cars = PSVFileManager.readPSV(filePath);
        System.out.print("Enter minimum mileage: ");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter maximum mileage: ");
        double max = Double.parseDouble(scanner.nextLine());

        for (Car car : cars) {
            if (car.getMileage() >= min && car.getMileage() <= max) {
                System.out.println(PSVFileManager.objectToPSV(car));
            }
        }
    }

    public static void byType(String filePath, Scanner scanner) {
        List<Car> cars = PSVFileManager.readPSV(filePath);
        System.out.print("Enter vehicle type (e.g., SUV, truck): ");
        String type = scanner.nextLine().toLowerCase();

        for (Car car : cars) {
            if (car.getType().toLowerCase().contains(type)) {
                System.out.println(PSVFileManager.objectToPSV(car));
            }
        }
    }
}