package instagram;

public class Comment {

    UserProfile profile;
    private String comment;

    public Comment(UserProfile profile, String comment) {
        this.profile = profile;
        this.comment = comment;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Comments [profile=" + profile.getProfileName() + ", comment=" + comment + "]";
    }
    

    



}
