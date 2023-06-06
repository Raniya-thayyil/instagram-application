package instagram;

import java.util.ArrayList;

public class UserProfile {

    private User user;
    private String profileName;
    private String profilePictureUrl;
    private int followersCount;
    private int followingCount;
    private String bio;
    private Feed feed;
    private Story mystory;
    private Share shareDetail;

    ArrayList<UserProfile> followers = new ArrayList<>();
    ArrayList<UserProfile> following = new ArrayList<>();
    ArrayList<Post> myPosts = new ArrayList<>();
    ArrayList<Reel> myReels = new ArrayList<>();
    ArrayList<Story> myStories = new ArrayList<>();

    public UserProfile(User user, String profileName, String bio, String profilePictureUrl) {
        this.user = user;
        this.bio = bio;
        this.profileName = profileName;
        this.profilePictureUrl = profilePictureUrl;
        this.feed = new Feed(this);
        this.shareDetail = new Share(this);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfilePicture() {
        return profilePictureUrl;
    }

    public Share getShareDetail() {
        return shareDetail;
    }

    public void setShareDetail(Share shareDetail) {
        this.shareDetail = shareDetail;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePictureUrl = profilePicture;
    }

    public int getFollowersCount() {
        this.followersCount = this.followers.size();
        return this.followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    public int getFollowingCount() {
        this.followingCount = this.following.size();
        return this.followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Story getMystory() {
        return mystory;
    }

    public ArrayList<Story> getMyStories() {
        return myStories;
    }

    public void follow(UserProfile profile) {
        this.following.add(profile);
    }

    public void unFollow(UserProfile profile) {
        this.following.remove(profile);
        profile.followers.remove(this);
    }

    public boolean acceptRequestFrom(UserProfile profile) {
        this.followers.add(profile);
        return true;
    }

    public boolean searchUserProfile(Instagram instagram, String profilename) {
        for (UserProfile profile : instagram.profiles) {
            if (profile.getProfileName() == profilename) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "UserProfile [profileName=" + profileName + ", profilePictureUrl=" + profilePictureUrl
                + ", followersCount=" + this.getFollowersCount() + ", followingCount=" + this.getFollowingCount()
                + ", bio=" + bio + "]";
    }
}
