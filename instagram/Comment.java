package instagram;

import java.util.ArrayList;

public class Comment {

    UserProfile profile;
    
    private String comment;
    private int id;
    ArrayList<Comment> replys = new ArrayList<>();

    public Comment(UserProfile profile, int id, String comment) {
        this.profile = profile;
        this.comment = comment;
        this.id = id;
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

    public ArrayList<Comment> getReplys() {
        return replys;
    }

    public void setReplys(ArrayList<Comment> replys) {
        this.replys = replys;
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Comment [profile=" + profile + ", comment=" + comment + ", id=" + id + ", replys=" + replys + "]";
    } 

       
}
