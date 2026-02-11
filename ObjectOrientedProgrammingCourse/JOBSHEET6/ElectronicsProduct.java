package JOBSHEET6;
public class ElectronicsProduct {
    String idProduct;
    String name;
    int price;
    int batteryLife;
    int ram;

    public ElectronicsProduct() {
        this.idProduct = "Unknown";
        this.name = "Generic Product";
        this.price = 0;
        this.batteryLife = 0;
        this.ram = 0;
    }
    
    public ElectronicsProduct(String idProduct, String name, int price, int batteryLife, int ram) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.batteryLife = batteryLife;
        this.ram = ram;
    }

    public void displayInfo() {
        System.out.println("ID: " + idProduct);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Battery Life: " + batteryLife + " hrs");
        System.out.println("RAM: " + ram + " GB");
    }
}
