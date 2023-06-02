package instagram;

import java.util.ArrayList;

public class Feed {

    UserProfile profile;
    Story story;

    public Feed(UserProfile profile) {
        this.profile = profile;
    }

    ArrayList<Post> postsOfFollowingUsers = new ArrayList<>();
    ArrayList<Reel> reelsOfFollowingUsers = new ArrayList<>();
    ArrayList<Story> storiesOfFollowingUsers = new ArrayList<>();

    public void addContentToFeed() {
        for (UserProfile profile : this.profile.following) {
            this.postsOfFollowingUsers.addAll(profile.myPosts);
            this.reelsOfFollowingUsers.addAll(profile.myReels);
            this.storiesOfFollowingUsers.addAll(profile.myStories);

            this.story = this.profile.getMystory();
        }
    }

    public ArrayList<Post> getPostsOfFollowingUsers() {
        return postsOfFollowingUsers;
    }

    public ArrayList<Reel> getReelsOfFollowingUsers() {
        return reelsOfFollowingUsers;
    }

    public ArrayList<Story> getStoriesOfFollowingUsers() {
        return storiesOfFollowingUsers;
    }  

    @Override
    public String toString() {
        return "Feed [profileName=" + profile.getProfileName() + ", story=" + this.profile.myStories
                + ", postsOfFollowingUsers=" +  this.getPostsOfFollowingUsers()
                + ", reelsOfFollowingUsers=" + this.getReelsOfFollowingUsers() + ", storiesOfFollowingUsers="
                + this.getStoriesOfFollowingUsers() + "]";
    }

}
