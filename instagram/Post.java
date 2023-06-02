package instagram;

import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalTime;

public class Post extends Content{  
    private int id;  
    private String imageUrl;
    

    public Post(UserProfile profile, int id, String caption, String imageUrl, LocalDate uploadedDate) {
        this.profile = profile;
        this.caption = caption;
        this.imageUrl = imageUrl;
        this.id = id;
        this.uploadedDate = uploadedDate;
                
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  

   
    

    @Override
    public String toString() {
        return "Post [profileName=" + this.profile.getProfileName() + ", id=" + id + ", imageUrl=" + imageUrl + ", caption=" + this.caption + ", uploaded date=" + this.getUploadedDate() + ", likes=" + this.getLikes() + ", comments=" + this.getCommentsList() + "]";
    }

 

    
}
