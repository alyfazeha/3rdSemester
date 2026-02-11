package UTS;

class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(UserProfile profile) {
        super(profile);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        System.out.println(profile.getName() + " (Customer) applying for verification with document " + doc);
    }
    
    protected void setVerificationStatus(boolean status) {
        this.verificationStatus = status;
    }
}
