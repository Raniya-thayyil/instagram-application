package instagram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Content {

    UserProfile profile;

    protected String caption;

    protected int likes;
    private int comments;
    private Comment comment;
    protected LocalDate uploadedDate;
    // protected LocalDateTime uploadedDateTime;

    ArrayList<UserProfile> likedUsersList = new ArrayList<>();
    ArrayList<Comment> commentsList = new ArrayList<>();
    ArrayList<UserProfile> tags = new ArrayList<>();

    public int getLikes() {
        return this.likedUsersList.size();
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return this.commentsList.size();
    }

    public ArrayList<UserProfile> getLikedUsersList() {
        return likedUsersList;
    }

    public ArrayList<Comment> getCommentsList() {
        return commentsList;
    }

    public ArrayList<UserProfile> getTags() {
        return tags;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public UserProfile getProfile() {
        return profile;
    }
    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public LocalDate getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(LocalDate uploadedDate) {
        this.uploadedDate = uploadedDate;
    }


   

    @Override
    public String toString() {
        return "Instagram [profile=" + profile + ", caption=" + caption + ", likes=" + likes + ", comments=" + comments
                + ", comment=" + comment + ", likedUsersList=" + likedUsersList + ", commentsList=" + commentsList
                + ", tags=" + tags + "]";
    }  

    


    
}
