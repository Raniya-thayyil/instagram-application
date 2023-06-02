package instagram;

public class Story {

    // Reel reel;
    // Post post;
    UserProfile profile;
    private String imageOrVideoUrl;
    private String text;

    // public Story(Reel reel) {
    //     this.reel = reel;
    // }

    // public Story(Post post) {
    //     this.post = post;
    // }

    public Story(String texts, String imageOrVideoUrl) {
        this.imageOrVideoUrl = imageOrVideoUrl;
        this.text = texts;

    }

    @Override
    public String toString() {
        return "Story [imageOrVideoUrl=" + imageOrVideoUrl + ", text=" + text + "]";
    }

}
