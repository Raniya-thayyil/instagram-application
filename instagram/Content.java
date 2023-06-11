package instagram;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Content implements Comparator<Content>{

    UserProfile profile;

    protected int id;
    protected String caption;

    protected int likes;
    private int comments;
    
    protected LocalDate uploadedDate;    

    ArrayList<UserProfile> likedUsersList = new ArrayList<>();
    ArrayList<Comment> commentsList = new ArrayList<>();
    ArrayList<UserProfile> tags = new ArrayList<>();

    public int getLikes() {
        return this.likedUsersList.size();
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return this.commentsList.size();
    }

    public ArrayList<UserProfile> getLikedUsersList() {
        return likedUsersList;
    }

    public ArrayList<Comment> getCommentsList() {
        return commentsList;
    }

    public ArrayList<UserProfile> getTags() {
        return tags;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public UserProfile getProfile() {
        return profile;
    }
    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public LocalDate getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(LocalDate uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }   

    public void like(UserProfile profile) { 
        this.likedUsersList.add(profile);
    }

    public boolean comment(UserProfile profile, String comment, int commentId) {
        Comment commentOnContent = new Comment(profile, commentId, comment);
        for (Comment remark : this.commentsList) {
            if (remark.getId() == commentId) {
                return false;
            }
        }
        this.commentsList.add(commentOnContent);
        return true;
    }

    public void replyToComment(UserProfile profile, int commentId, String replyComment) {
        Comment replyToComment = new Comment(this.profile, commentId, replyComment);
        for (Comment comment : this.commentsList) {
            if (comment.getId() == commentId) {
                comment.replys.add(replyToComment);
            }
        }   
    }

    public void delete() {
        if (this.profile.myPosts.contains(this)) {
            this.profile.myPosts.remove(this);
            for (UserProfile profile : this.profile.following) {
                profile.getFeed().postsOfFollowingUsers.remove(this);
            }
        } else if (this.profile.myReels.contains(this)) {
            this.profile.myReels.remove(this);
            for (UserProfile profile : this.profile.following) {
                profile.getFeed().reelsOfFollowingUsers.remove(this);
            }
        } 
    }

    public void edit(String newCaption) {
        if (this.profile.myPosts.contains(this)) {
            this.setCaption(newCaption);

        } else if (this.profile.myReels.contains(this)) {
            this.setCaption(newCaption);
        }       
    }

    public void tagUser(UserProfile profile) {
        this.tags.add(profile);        
    }

    public void share(UserProfile profile) {
        if (this.profile.following.contains(profile)) {
            profile.getShareDetail().sharedContents.add(this);
        }        
    }

    @Override
    public int compare(Content firstContent, Content nextContent) {
        int compareValue = firstContent.getUploadedDate().compareTo(nextContent.getUploadedDate());
        return compareValue;        
    }

    @Override
    public String toString() {
        return "Instagram [profile=" + profile + ", caption=" + caption + ", likes=" + likes + ", comments=" + comments
                + ", likedUsersList=" + likedUsersList + ", commentsList=" + commentsList
                + ", tags=" + tags + "]";
    }    
}
