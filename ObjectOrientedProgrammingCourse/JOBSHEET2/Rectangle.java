package JOBSHEET2;
public class Rectangle {
    public int length;
    public int wide;

    public void displayInfo() {
        System.out.println("Panjang : " + length);
        System.out.println("Lebar   : " + wide);
    }
    public int getArea() {
        return length * wide;
    }
    public int getCircumference() {
        return 2 * (length + wide);
    }
}
