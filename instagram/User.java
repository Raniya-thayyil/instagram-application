package instagram;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private String gender;

    ArrayList<UserProfile> profiles = new ArrayList<>();

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void createProfile(String username, String password) {
        UserProfile myProfile = new UserProfile(this, username, password);
        this.profiles.add(myProfile);

    }

    


    
}
