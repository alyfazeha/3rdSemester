package JOBSHEET4;
import java.util.Date;
import java.util.ArrayList;
public class Order {
    private String idOrder;
    private Date orderDate;
    private Customer orderedBy;
    private ArrayList<Product> orderedItems;

    public Order(String idOrder, Customer orderedBy) {
        this.idOrder = idOrder;
        this.orderDate = new Date();
        this.orderedBy = orderedBy;
        this.orderedItems = new ArrayList<>();
    }

    public String getIdOrder() {
        return idOrder;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public Customer getOrderedBy() {
        return orderedBy;
    }
    public ArrayList<Product> getOrderedItems() {
        return orderedItems;
    }
    public void setOrderDate(Date newDate) {
        this.orderDate = newDate;
    }

    public void addProduct(Product product) {
        if (product.getStock() > 0) {
            orderedItems.add(product);
            product.decreaseStock(1);
            System.out.println("Product " + product.getName() + " ditambahkan ke order " + this.idOrder);
        } else {
            System.out.println("Stock product " + product.getName() + " habis!");
        }
    }

    public int calculateTotal() {
        int total = 0;
        for (Product product : orderedItems) {
            total += product.getPrice();
        }
        return total;
    }

    public boolean confirmOrder() {
        if (!orderedItems.isEmpty()) {
            System.out.println("\nORDER CONFIRMATION\n");
            System.out.println("Order ID: " + this.idOrder);
            System.out.println("Customer: " + this.orderedBy.getName());
            System.out.println("Date: " + this.orderDate);
            System.out.println("Items ordered:");
            for (Product product : orderedItems) {
                System.out.println("- " + product.getName() + " (Rp" + product.getPrice() + ")");
            }
            System.out.println("Total: Rp" + calculateTotal());
            System.out.println("\nOrder berhasil dikonfirmasi!\n");
            return true;
        } else {
            System.out.println("Order kosong, tidak dapat dikonfirmasi.");
            return false;
        }
    }
}