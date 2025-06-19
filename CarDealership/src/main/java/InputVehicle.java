import java.util.Scanner;

public class InputVehicle {
    public static Car recordVehicle(Scanner scanner, boolean addVehicle){
        double price = 0;
        int year = 0;
        double mileage = 0;

        System.out.println("Enter the vin");
        String vin = scanner.nextLine();

        System.out.println("Enter the model of the vehicle: "); //model
        String model = scanner.nextLine();

        while (true){ //year
            System.out.println("Enter the year of the vehicle: ");
            String userInput = scanner.nextLine();
            try {
                year = Integer.parseInt(userInput);
                break;
            }catch (NumberFormatException e){
                System.out.println("Incorrect value format. Try again. ");
            }
        }

        System.out.println("Enter the color of the vehicle: "); //color
        String color = scanner.nextLine();

        System.out.println("Enter the type of vehicle it is: "); //Car type (convertible, truck, etc.)
        String type = scanner.nextLine();

        while (true){ //mileage
            System.out.println("Enter the mileage of the vehicle: ");
            String userInput = scanner.nextLine();
            try {
                mileage = Double.parseDouble(userInput);
                break;
            }catch (NumberFormatException e){
                System.out.println("Incorrect value format. Try again. ");
            }
        }

        while (true){ //price
            System.out.println("Enter the price of the vehicle: ");
            String userInput = scanner.nextLine();
            try {
                price = Double.parseDouble(userInput);
                break;
            }catch (NumberFormatException e){
                System.out.println("Incorrect value format. Try again. ");
            }
        }


        return new Car(vin,model,year,color,type,mileage,price); //Make object "Car"
    }
}
