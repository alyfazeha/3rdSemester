package JOBSHEET3;
public class Member {
    private int idCardNumber;
    private String name;
    private int borowwingLimit;
    private int loanAmount;

    public Member (int idCardNumber, String name, int borowwingLimit) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.borowwingLimit = borowwingLimit;
    }

    public String getName() {
        return name;
    }
    public int getBorowwingLimit() {
        return borowwingLimit;
    }
    public int getLoanAmmount() {
        return loanAmount;
    }
    public void setLoan(int loan) {
        if (loan > this.borowwingLimit) {
            System.out.println("Sorry, the loan is over the limit.");
        } else {
            this.loanAmount = this.loanAmount + loan;
        }
    }
    public void setInstallment(int installment) {
        if (installment < 0.1 * loanAmount) {
            System.out.println("Sorry, the installment must be 10% of the loan amount");
        } else {
            this.loanAmount = this.loanAmount - installment;
        }
    }
}
