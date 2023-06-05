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

    @Override
    public String toString() {
        return "Story [profile name=" + profile.getProfileName() + ", imageOrVideoUrl=" + imageOrVideoUrl + ", text="
                + text
                + ", updatedDate=" + uploadedDate + "]";
    }

}
