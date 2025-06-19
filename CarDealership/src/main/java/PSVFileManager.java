import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PSVFileManager {

    public static final String FILE_PATH = "Garage.csv";

    public static void saveVehicle(Car car, String file) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            String psvLine = objectToPSV(car);
            fileWriter.write(psvLine + "\n");
        } catch (IOException e) {
            System.out.println("Saving Vehicle to PSV error" + file);
            System.out.println(e.getMessage());
        }
    }

    public static List<Car> readPSV(String file) {
        List<Car> carList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                Car car = psvToObject(line);
                if (car != null) {
                    carList.add(car);
                }
            }

        } catch (IOException e) {
            System.out.println("File read error " + file);
            System.out.println(e.getMessage());
        }

        return carList;
    }



    public static String objectToPSV(Car car) {
        return String.format("%s|%s|%d|%s|%s|%.3f|%.2f",
                car.getVin(),car.getModel(), car.getYear(), car.getColor(), car.getType(), car.getMileage(), car.getPrice());
    }

    public static Car psvToObject(String psvLine) {
        String[] carInfo = psvLine.split("\\|");

        if (carInfo.length != 7) {
            return null;
        }
        String vin = carInfo[0];
        String model = carInfo[1];
        int year = Integer.parseInt(carInfo[2]);
        String color = carInfo[3];
        String type = carInfo[4];
        double mileage = Double.parseDouble(carInfo[5]);
        double price = Double.parseDouble(carInfo[6]);

        return new Car(vin,model, year, color, type, mileage, price);
    }





}
