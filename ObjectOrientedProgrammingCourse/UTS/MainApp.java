package UTS;

public class MainApp {
   public static void main(String[] args) {
        UserProfile custProf = new UserProfile(101, "cust123", 
        "Alyfa", 25, "Alyfa@mail.com", "SIM.pdf");
        Customer Alyfa = new Customer(custProf);

        UserProfile adminProf = new UserProfile(999, "adminpass", 
        "Zahra", 35, "Zahra@admin.com", "ID.png");
        Admin Zahra = new Admin(adminProf);

        Alyfa.logIn(101, "cust123");
        Alyfa.applyVerification("KTP.pdf");
        System.out.println("Alyfa's Status: " + Alyfa.getVerificationStatus());
        
        Zahra.logIn(999, "adminpass");
        Zahra.updateVehicleDetails("V-001");
        Zahra.verifyUser(Alyfa);
        
        System.out.println("\nAlyfa's Status setelah verifikasi Admin: " + Alyfa.getVerificationStatus());
        
        Alyfa.logOut();
        Zahra.logOut();
    } 
}
