package instagram;

import java.time.LocalDate;

public class Post extends Content {

    private String imageOrVideoUrl;

    public Post(UserProfile profile, int id, String caption, String imageOrVideoUrl, LocalDate uploadedDate) {
        this.profile = profile;
        this.caption = caption;
        this.imageOrVideoUrl = imageOrVideoUrl;
        this.id = id;
        this.uploadedDate = uploadedDate;
    }  

    public String getimageOrVideoUrl() {
        return imageOrVideoUrl;
    }

    public void setimageOrVideoUrl(String imageOrVideoUrl) {
        this.imageOrVideoUrl = imageOrVideoUrl;
    }

    public boolean upload() {
        for (Post mypost : this.profile.myPosts) {
            if (mypost.getId() == id) {
                return false;
            }
        }
        this.profile.myPosts.add(this);
        for (UserProfile profile : this.profile.following) {
            profile.getFeed().postsOfFollowingUsers.add(this);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Post [profileName=" + this.profile.getProfileName() + ", id=" + id + ", imageOrVideoUrl=" + imageOrVideoUrl
                + ", caption=" + this.caption + ", uploaded date=" + this.getUploadedDate() + ", likes="
                + this.getLikes() + ", comments=" + this.getCommentsList() + " , tags=" + this.getTags() + "]";
    }

}
