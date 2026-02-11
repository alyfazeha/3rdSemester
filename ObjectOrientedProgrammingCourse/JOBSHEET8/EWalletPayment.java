package JOBSHEET8;
class EWalletPayment extends Payment {
    private String walletId;

    public EWalletPayment(double amount, String walletId) {
        super(amount);
        this.walletId = walletId;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing e-wallet payment...");
        System.out.println("Wallet ID       : " + walletId);
        System.out.println("Amount          : Rp " + amount);
        System.out.println("E-wallet payment successful!\n");
    }
}
