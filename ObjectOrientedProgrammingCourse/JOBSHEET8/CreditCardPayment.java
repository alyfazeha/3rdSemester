package JOBSHEET8;
class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
        System.out.println("Card Number     : " + cardNumber);
        System.out.println("Amount          : Rp " + amount);
        System.out.println("Credit card payment successful!\n");
    }
}
