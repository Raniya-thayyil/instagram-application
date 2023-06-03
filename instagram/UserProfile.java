package instagram;

import java.time.LocalDate;
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

    public void setProfilePicture(String profilePicture) {
        this.profilePictureUrl = profilePicture;
    }

    public int getFollowersCount() {
        this.followersCount =  this.followers.size();
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

    public boolean uploadPost(int id, String caption, String image, LocalDate date) {
        Post post = new Post(this, id, caption, image, date);
        for (Post mypost : this.myPosts) {
            if (mypost.getId() == id) {
                return false;
            }
        }
        this.myPosts.add(post);
        return true;

    }

    public void uploadReel(int id, String caption, String videoUrl) {
        Reel reel = new Reel(id, this, caption, videoUrl);
        this.myReels.add(reel);
    }

    public boolean deletePost(int id) {
        for (Post post : this.myPosts) {
            if (id == post.getId()) {
                this.myPosts.remove(post);
                return true;
            }
        }
        return false;
    }

    public void editPost(int postId, String editedCaption) {
        for (Post post : this.myPosts) {
            if (post.getId() == postId) {
                post.setCaption(editedCaption);
            }
        }
    }

    public void likePost(UserProfile profile, int id) {
        for (Post post : profile.myPosts) {
            if (post.getId() == id) {
                post.likedUsersList.add(profile);
            }
        }
    }

    public void likeReel(UserProfile profile, int id) {
        for (Reel reel : profile.myReels) {
            if (reel.getId() == id) {
                reel.likedUsersList.add(profile);
            }
        }
    }

    public void commentReel(UserProfile profile, int id, String comment) {

        Comment myComment = new Comment(this, comment);
        for (Reel reel : profile.myReels) {
            if (reel.getId() == id) {
                reel.commentsList.add(myComment);
            }
        }
    }

    public void commentPost(UserProfile profile, int id, String comment) {

        Comment myComment = new Comment(this, comment);
        for (Post post : profile.myPosts) {
            if (post.getId() == id) {
                post.commentsList.add(myComment);
            }
        }
    }

    public void sharePost() {

    }

    public boolean tagUser(UserProfile profile, int postId) {
        for (Post post : this.myPosts) {
            if (post.getId() == postId) {
                post.tags.add(profile);
                return true;
            }
        }
        return false;

    }

    public boolean searchUserProfile(Instagram instagram, String profilename) {
        for (UserProfile profile : instagram.profiles) {
            if (profile.getProfileName() == profilename) {
                return true;
            }
        }
        return false;

    }

    public void updateStory(String texts, String imageOrVideoUrl, LocalDate updatedDate) {
        LocalDate date = updatedDate;
        LocalDate oneDayAfter = date.plusDays(1);

        mystory = new Story(this, texts, imageOrVideoUrl, updatedDate);
        this.myStories.add(mystory);

        if (LocalDate.now().compareTo(oneDayAfter) == 0) {
            this.myStories.remove(mystory);

        }

    }

    @Override
    public String toString() {
        return "UserProfile [user=" + user + ", profileName=" + profileName + ", profilePictureUrl=" + profilePictureUrl
                + ", followersCount=" + this.getFollowersCount() + ", followingCount=" + this.getFollowingCount()
                + ", bio=" + bio + "]";
    }

}
