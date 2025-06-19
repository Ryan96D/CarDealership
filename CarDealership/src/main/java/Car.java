public class Car {
    private String vin;
    private String model;
    private int year;
    private String color;
    private String type;
    private double mileage;
    private double price;

    public Car(String vin, String model, int year, String color, String type, double mileage, double price) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
        this.mileage = mileage;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
