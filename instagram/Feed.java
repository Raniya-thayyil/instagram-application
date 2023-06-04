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

    public void addContentToFeed() {
        for (UserProfile profile : this.profile.following) {
            this.postsOfFollowingUsers.addAll(profile.myPosts);
            this.reelsOfFollowingUsers.addAll(profile.myReels);
            this.storiesOfFollowingUsers.addAll(profile.myStories);

            this.story = this.profile.getMystory();
        }
    }

    public ArrayList<Post> getPostsOfFollowingUsers() {
        Collections.sort(this.postsOfFollowingUsers, new sortPost().reversed());
        return postsOfFollowingUsers;
    }

    public ArrayList<Reel> getReelsOfFollowingUsers() {
        Collections.sort(this.reelsOfFollowingUsers, new sortReel());
        return reelsOfFollowingUsers;
    }

    public ArrayList<Story> getStoriesOfFollowingUsers() {
        return storiesOfFollowingUsers;
    }

    public void sharePost(UserProfile profile, int postIdToShare, String profileNameOfPostHolder) {

        for (Post post : this.postsOfFollowingUsers) {
            if (post.getId() == postIdToShare && post.getProfile().getProfileName() == profileNameOfPostHolder) {
                this.profile.getShareDetail().sharedPosts.add(post);
                profile.getShareDetail().recievedPosts.add(post);
            }
        }
    }

    public void shareReel(UserProfile profile, int reelIdToShare, String profileNameOfReelHolder) {

        for (Reel reel : this.reelsOfFollowingUsers) {
            if (reel.getId() == reelIdToShare && reel.getProfile().getProfileName() == profileNameOfReelHolder) {
                profile.getShareDetail().recievedReels.add(reel);
            }
        }
    }

    @Override
    public String toString() {
        return "Feed [profileName=" + profile.getProfileName() + ", story=" + this.profile.myStories
                + ", postsOfFollowingUsers=" + this.getPostsOfFollowingUsers()
                + ", reelsOfFollowingUsers=" + this.getReelsOfFollowingUsers() + ", storiesOfFollowingUsers="
                + this.getStoriesOfFollowingUsers() + "]";
    }
}
