package instagram;

import java.time.LocalDate;

public class Story extends Content{

    UserProfile profile;

    private String imageOrVideoUrl;
    private String text;   

    public Story(UserProfile profileName, String texts, String imageOrVideoUrl, LocalDate updatedDate) {

        this.imageOrVideoUrl = imageOrVideoUrl;
        this.text = texts;
        this.uploadedDate = updatedDate;
        this.profile = profileName;
    }

    public void updateStory() {
        LocalDate date = this.uploadedDate;
        LocalDate oneDayAfter = date.plusDays(1);

        this.profile.myStories.add(this);

        for (UserProfile profile : this.profile.following) {
            profile.getFeed().storiesOfFollowingUsers.add(this);
        }

        if (LocalDate.now().compareTo(oneDayAfter) == 0) {
            this.profile.myStories.remove(this);
            for (UserProfile profile : this.profile.following) {
                profile.getFeed().storiesOfFollowingUsers.remove(this);
            } 
        }
    } 

    public void delete() {
        this.profile.myStories.remove(this);
        for (UserProfile profile : this.profile.following) {
            profile.getFeed().storiesOfFollowingUsers.remove(this);
        } 
    }

    @Override
    public String toString() {
        return "Story [profile name=" + profile.getProfileName() + ", imageOrVideoUrl=" + imageOrVideoUrl + ", text="
                + text
                + ", updatedDate=" + uploadedDate + "]";
    }

}
