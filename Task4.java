
public class Main {

    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice("Samsung", "Galaxy Tab", 299.99f);
        Smartphone smartphone = new Smartphone("Apple", "iPhone 14", 999.99f, "iOS");

        System.out.print("ElectronicDevice info: ");
        device.displayInfo();

        System.out.print("\nSmartphone info: ");
        smartphone.displayInfo();
    }
}

class ElectronicDevice {

    String brand;
    String model;
    float price;

    public ElectronicDevice(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayInfo() {
        System.out.printf("\nBrand: %s \t Model: %s \t Price: %.2f", brand, model, price);
    }
}

class Smartphone extends ElectronicDevice {

    String OS;

    public Smartphone(String brand, String model, float price, String OS) {
        super(brand, model, price);

        this.OS = OS;
    }
    @Override

    void displayInfo(){
         System.out.printf("\nBrand: %s \t Model: %s \t Price: %.2f \t Operation System: %s", brand, model, price, OS);
    }
}
