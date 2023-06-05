package instagram;

import java.time.LocalDate;

public class Post extends Content {

    private String imageUrl;

    public Post(UserProfile profile, int id, String caption, String imageUrl, LocalDate uploadedDate) {
        this.profile = profile;
        this.caption = caption;
        this.imageUrl = imageUrl;
        this.id = id;
        this.uploadedDate = uploadedDate;
    }

    public Post() {

    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean uploadPost() {
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

        return "Post [profileName=" + this.profile.getProfileName() + ", id=" + id + ", imageUrl=" + imageUrl
                + ", caption=" + this.caption + ", uploaded date=" + this.getUploadedDate() + ", likes="
                + this.getLikes() + ", comments=" + this.getCommentsList() + " , tags=" + this.getTags() + "]";
    }

}
