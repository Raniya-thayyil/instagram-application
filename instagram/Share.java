package instagram;

import java.util.ArrayList;

public class Share {

    UserProfile profile;

    public Share(UserProfile profile) {
        this.profile = profile;
    }

    ArrayList<Content> sharedContents = new ArrayList<>();

    public ArrayList<Content> getSharedContents() {
        return sharedContents;
    }

    @Override
    public String toString() {
        return "Share [sharedContents by=" + sharedContents + "]";
    }

}
