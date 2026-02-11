package UTS;

class Admin extends User {
    public Admin(UserProfile profile) {
        super(profile);
    }

    public void updateVehicleDetails(String vehicleId) {
        System.out.println(profile.getName() + " (Admin) updating details for Vehicle ID " + vehicleId);
    }

    public void addVehicle(String vehicle) {
        System.out.println(profile.getName() + " (Admin) adding new vehicle: " + vehicle);
    }

    public void retrieveComplain() {
        System.out.println(profile.getName() + " (Admin) retrieving customer complaints.");
    }

    public void verifyUser(Customer customer) {
        System.out.println(profile.getName() + " (Admin) verifying customer " + customer.profile.getName());
        customer.setVerificationStatus(true);
        System.out.println("Verification successful! Status updated to TRUE.");
    }
}