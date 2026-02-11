package JOBSHEET2;
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.length = 10;
        rect1.wide = 5;

        rect1.displayInfo();
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getCircumference());
    }
}
