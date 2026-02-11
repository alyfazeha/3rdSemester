package JOBSHEET8;
public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void showAmount() {
        System.out.println("Total payment amount: Rp " + amount);
    }

    public abstract void processPayment();
}
