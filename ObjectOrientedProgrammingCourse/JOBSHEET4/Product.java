package JOBSHEET4;
public class Product {
    private String idProduct;
    private String name;
    private int price;
    private int stock;

    public Product(String idProduct, String name, int price, int stock) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getIdProduct() {
        return idProduct;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void decreaseStock(int decreaseStock) {
        if (this.stock >= decreaseStock) {
            this.stock = this.stock - decreaseStock;
            System.out.println("Stock Updated : " + this.stock);
        } else {
            System.out.println("Stock tidak mencukupi! Stock tersedia: " + this.stock);
        }
    }

    public void increaseStock(int increaseStock) {
        this.stock = this.stock + increaseStock;
        System.out.println("Stock Updated : " + this.stock);
    }

    public void displayDetailProduct() {
        System.out.println("\nDETAIL PRODUCT\n");
        System.out.println("ID Product      : " + this.idProduct);
        System.out.println("Name Product    : " + this.name);
        System.out.println("Price           : " + this.price);
        System.out.println("Stock           : " + this.stock);
        System.out.println();
    }
}
