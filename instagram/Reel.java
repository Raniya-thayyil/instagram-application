package instagram;

public class Reel extends Content {

    private String videoUrl;

    public Reel(int id, UserProfile profile, String caption, String videoUrl) {
        this.profile = profile;
        this.caption = caption;
        this.videoUrl = videoUrl;
        this.id = id;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public boolean uploadReel() {

        for (Reel myReel : this.profile.myReels) {
            if (myReel.getId() == id) {
                return false;
            }
        }
        this.profile.myReels.add(this);
        for (UserProfile profile : this.profile.following) {
            profile.getFeed().reelsOfFollowingUsers.add(this);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reel [profileName=" + this.profile.getProfileName() + ",id=" + id + ", videoUrl=" + videoUrl
                + ", caption=" + this.caption + ", likes=" + this.getLikes()
                + " , comments=" + this.getCommentsList() + "]";
    }

}
