package instagram;

import java.util.ArrayList;
import java.util.Collections;

public class Feed {

    UserProfile profile;
    Story story;

    public Feed(UserProfile profile) {
        this.profile = profile;
    }

    ArrayList<Post> postsOfFollowingUsers = new ArrayList<>();
    ArrayList<Reel> reelsOfFollowingUsers = new ArrayList<>();
    ArrayList<Story> storiesOfFollowingUsers = new ArrayList<>();


    public ArrayList<Post> getPostsOfFollowingUsers() {
        Collections.sort(this.postsOfFollowingUsers, new Content().reversed());
        return postsOfFollowingUsers;
    }

    public ArrayList<Reel> getReelsOfFollowingUsers() {
        Collections.sort(this.reelsOfFollowingUsers, new Content().reversed());
        return reelsOfFollowingUsers;
    }

    public ArrayList<Story> getStoriesOfFollowingUsers() {  
        Collections.sort(this.reelsOfFollowingUsers, new Content().reversed());      
        return storiesOfFollowingUsers;
    }  

    @Override
    public String toString() {
        return "Feed [profileName=" + profile.getProfileName() + ", story=" + this.profile.myStories
                + ", postsOfFollowingUsers=" + this.getPostsOfFollowingUsers()
                + ", reelsOfFollowingUsers=" + this.getReelsOfFollowingUsers() + ", storiesOfFollowingUsers="
                + this.getStoriesOfFollowingUsers() + "]";
    }
}
