package instagram;

import java.util.ArrayList;

public class Share {

    UserProfile profile;    

    public Share(UserProfile profile) {
        this.profile = profile;
    } 

    ArrayList<Post> sharedPosts = new ArrayList<>();
    ArrayList<Post> recievedPosts = new ArrayList<>();

    ArrayList<Reel> recievedReels =new ArrayList<>();

    public ArrayList<Post> getSharedPosts() {
        return sharedPosts;
    }

    public ArrayList<Post> getRecievedPosts() {
        return recievedPosts;
    }

    public ArrayList<Reel> getRecievedReel() {
        return recievedReels;
    }

    @Override
    public String toString() {
        return "[sharedPosts by =" + sharedPosts + ", recievedPosts=" + recievedPosts + ", recievedReels="
                + recievedReels + "]";
    }

}
