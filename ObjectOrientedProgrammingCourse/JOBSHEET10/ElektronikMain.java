package JOBSHEET10;
public class ElektronikMain {
    public static void main(String[] args) {
        Kipas kipas1 = new Kipas(250000, "Putih", "Maspion", "Angin Dingin");
        kipas1.getInfo();

        Kulkas kulkas1 = new Kulkas(1500000, "Silver", "Polytron", 2);
        kulkas1.getInfo();

        SmartFridge smartFridge1 = new SmartFridge(300, 3, 5000000, "Hitam", "Samsung");
        smartFridge1.getInfo();
        smartFridge1.naikkanVolume(10);
        System.out.println("Volume Smart Fridge setelah dinaikkan: " + smartFridge1.getVolume());
        smartFridge1.turunkanVolume(5);
        System.out.println("Volume Smart Fridge setelah diturunkan: " + smartFridge1.getVolume());
        System.out.println();

        TV tv1 = new TV(4000000, "Hitam", "LG", "LED", 20);
        tv1.getInfo();
        tv1.naikkanVolume(15);
        System.out.println("Volume TV setelah dinaikkan: " + tv1.getVolume());
        tv1.turunkanVolume(10);
        System.out.println("Volume TV setelah diturunkan: " + tv1.getVolume()); 
    }
}
