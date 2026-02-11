package JOBSHEET6;

public class ElectronicsDemo {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone();
        System.out.println("== Default Smartphone ==");
        phone1.displayInfo();

        Smartphone phone2 = new Smartphone("P001", "Galaxy S25", 1200, 24, 12, true);
        System.out.println("\n== Parameterized Smartphone ==");
        phone2.displayInfo();

        Laptop laptop1 = new Laptop("L001", "MacBook Pro", 2500, 15, 16, "Backlit");
        System.out.println("\n== Laptop ==");
        laptop1.displayInfo();

        laptop1.price = 2300;  
        laptop1.keyboardType = "Mechanical"; 
        System.out.println("\n== Laptop After Modification ==");
        laptop1.displayInfo();
    }

}
