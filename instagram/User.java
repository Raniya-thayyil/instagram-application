package instagram;

public class User {
    private String username;
    private String password;
    private String email;
    private UserProfile profile;
    private Instagram instagram;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public boolean setUsername(String username) {
        for (User user : this.instagram.usersList) {
            if (user.getUsername() == username)
                return false;
        }
        this.username = username;
        return true;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        for (User user : this.instagram.usersList) {
            if (user.getPassword() == password) {
                return false;
            }
        }
        this.password = password;
        return true;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        for (User user : this.instagram.usersList) {
            if (user.getEmail() == password) {
                return false;
            }
        }
        this.email = email;
        return true;
    }

    public boolean createProfile(Instagram instagram, String profileName, String bio, String image) {

        for (UserProfile profile : instagram.profiles) {
            if (profile.getProfileName() == profileName) {
                return false;
            }
        }
        UserProfile myProfile = new UserProfile(this, profileName, password, image);
        this.profile = myProfile;
        instagram.profiles.add(myProfile);
        return true;
    }

    public UserProfile getProfile() {
        return profile;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", email=" + email + "]";
    }

}
