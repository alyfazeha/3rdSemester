package JOBSHEET3;
public class TestCooperative {
    public static void main(String[] args) {
        Member member1 = new Member(111333444, "Donny", 5000000);

        System.out.println("Member Name     : " + member1.getName());
        System.out.println("Loan Limit      : " + member1.getBorowwingLimit());

        System.out.println("\nBorrow 10,000,000");
        member1.setLoan(10000000);
        System.out.println("Current Loan Amount :" + member1.getLoanAmmount());

        System.out.println("\nBorrow 4,000,000");
        member1.setLoan(4000000);
        System.out.println("Current Loan Amount :" + member1.getLoanAmmount());

        System.out.println("\nPaying 100,000 installments");
        member1.setInstallment(100000);
        System.out.println("Current Loan Amount :" + member1.getLoanAmmount());

        System.out.println("\nPaying 3,000,000 installments");
        member1.setInstallment(3000000);
        System.out.println("Current Loan Amount :" + member1.getLoanAmmount());
    }
}
