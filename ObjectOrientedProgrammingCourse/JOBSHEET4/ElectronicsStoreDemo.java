package JOBSHEET4;
public class ElectronicsStoreDemo {
    public static void main(String[] args) {
        Product p1 = new Product("123", "Laptop", 30000, 12);
        Product p2 = new Product("124", "Mouse Gaming", 500, 25);
        Product p3 = new Product("125", "Keyboard Mechanical", 1200, 15);
        
        System.out.println();
        p1.displayDetailProduct();
        p1.decreaseStock(4);
        p1.increaseStock(2);
        p1.displayDetailProduct();
        
        System.out.println();
        Customer customer1 = new Customer("C001", "Andi Prasetyo", "andi@email.com");
        Customer customer2 = new Customer("C002", "Sari Indah", "sari@email.com");
        
        System.out.println();
        Order order1 = customer1.placeOrder("O001");
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.confirmOrder();
        
        Order order2 = customer2.placeOrder("O002");
        order2.addProduct(p3);
        order2.addProduct(p2);
        order2.confirmOrder();
        
        System.out.println();
        customer1.viewOrderHistory();
        customer2.viewOrderHistory();
        
        System.out.println();
        p1.displayDetailProduct();
        p2.displayDetailProduct();
        p3.displayDetailProduct();
    }
}