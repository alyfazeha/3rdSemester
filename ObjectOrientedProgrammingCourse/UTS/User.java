package UTS;

public class User {
    protected UserProfile profile;

    public User(UserProfile profile) {
        this.profile = profile;
    }

    public boolean logIn(int userId, String password) {
        if (profile.getUserId() == userId && profile.getPassword().equals(password)) {
            System.out.println("\nSUCCESS: " + profile.getName() + " logged in.");
            return true;
        } else {
            System.out.println("\nFAIL: Login failed for ID " + userId);
            return false;
        }
    }

    public void recoverPassword() {
        System.out.println(profile.getName() + " password recovery initiated.");
    }

    public void logOut() {
        System.out.println(profile.getName() + " logged out.");
    }
}
