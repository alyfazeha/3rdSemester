package JOBSHEET4;
import java.util.ArrayList;
public class Customer {
    private String idCustomer;
    private String name;
    private String email;
    private ArrayList<Order> purchaseHistory;

    public Customer(String idCustomer, String name, String email) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    public String getIdCustomer() {
        return idCustomer;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList<Order> getPurchaseHistory() {
        return purchaseHistory;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Order placeOrder(String idOrder) {
        Order newOrder = new Order(idOrder, this);
        purchaseHistory.add(newOrder);
        System.out.println("Order " + idOrder + " berhasil dibuat untuk customer: " + this.name);
        return newOrder;
    }

    public void viewOrderHistory() {
        System.out.println("\nPURCHASE HISTORY - " + this.name);
        if (purchaseHistory.isEmpty()) {
            System.out.println("Belum ada riwayat pemesanan.");
        } else {
            for (Order order : purchaseHistory) {
                System.out.println("Order ID: " + order.getIdOrder() + 
                                 " | Date: " + order.getOrderDate() + 
                                 " | Total: " + order.calculateTotal());
            }
        }
        System.out.println();
    }
}
