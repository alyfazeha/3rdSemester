package JOBSHEET6;
class Laptop extends ElectronicsProduct {
    String keyboardType;

    public Laptop() {
        super();
        this.keyboardType = "Standard";
    }

    public Laptop(String idProduct, String name, int price, int batteryLife, int ram, String keyboardType) {
        super(idProduct, name, price, batteryLife, ram);
        this.keyboardType = keyboardType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Keyboard Type: " + keyboardType);
    }
}