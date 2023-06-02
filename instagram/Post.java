package instagram;

import java.net.URL;
import java.util.ArrayList;

public class Post {

    UserProfile profile;
    private URL image;
    private String caption;
    private int likes;
    ArrayList<Comment> comments = new ArrayList<>();

    private String name = profile.getUsername();

    public Post(URL image, String caption, int likes, String name) {
        this.image = image;
        this.caption = caption;
        this.likes = likes;
        this.name = name;
    }

    



    
}
