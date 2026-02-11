package JOBSHEET6;
class Smartphone extends ElectronicsProduct {
    boolean simCard;

    public Smartphone() {
        super();
        this.simCard = false;
    }

    public Smartphone(String idProduct, String name, int price, int batteryLife, int ram, boolean simCard) {
        super(idProduct, name, price, batteryLife, ram);
        this.simCard = simCard;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sim Card Present: " + simCard);
    }
}
    
