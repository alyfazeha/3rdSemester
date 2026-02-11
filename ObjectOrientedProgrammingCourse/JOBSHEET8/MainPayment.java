package JOBSHEET8;
public class MainPayment {
    public static void main(String[] args) {
        CreditCardPayment creditPayment = new CreditCardPayment(250000.0, "1234-5678-9876-5432");
        EWalletPayment ewalletPayment = new EWalletPayment(150000.0, "EWL-20251031");

        System.out.println("====== Credit Card Payment =======");
        creditPayment.showAmount();
        creditPayment.processPayment();

        System.out.println("======== E-Wallet Payment ========");
        ewalletPayment.showAmount();
        ewalletPayment.processPayment();
    }
}
