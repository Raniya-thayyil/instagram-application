package instagram;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

   public static void main(String[] args) {

    Instagram instagram = new Instagram();

    User abin = new User("abin", "abin2123", "abin@gmail.com");
    abin.createProfile(instagram, "abin_abi", "hi i am abi", "https://www.google.com/image");
    UserProfile abin_abi = abin.getProfile();

    User manu = new User("manu_m", "manu123", "man@gmail.com");   
    manu.createProfile(instagram, "manu_man", "hey there", "https://www.google.com/image1");
    UserProfile manu_man = manu.getProfile();

    User jo = new User("jo_jo", "jo#21", "jo@gmail.com");    
    jo.createProfile(instagram, "jo_ann", "call me jo", "https://www.google.com/image1");
    UserProfile jo_ann = jo.getProfile();

    abin_abi.follow(jo_ann);
    abin_abi.follow(manu_man);
    jo_ann.acceptRequestFrom(abin_abi);
    jo_ann.follow(abin_abi);
    abin_abi.acceptRequestFrom(jo_ann);

    abin_abi.uploadPost(1, "forest", "forest.jpg", LocalDate.of(2023, 5, 12));
    abin_abi.uploadPost(2, "me", "me.jpg", LocalDate.of(2023, 5, 22));
    abin_abi.uploadReel(1, "travel", "travel.mp4");

    jo_ann.uploadPost(1, "home", "home.jpg", LocalDate.of(2023, 5, 14));
    jo_ann.uploadPost(2, "oreo", "my-pet.jpg", LocalDate.of(2023, 6, 1));
    jo_ann.updateStory("My friends", "friends.mp4");
    jo_ann.updateStory("my new look", "new look.jpg");
    manu_man.uploadReel(1, "family", "family.mp4");
    manu_man.updateStory("beautiful flower", "flower.jpg");

    jo_ann.likePost(abin_abi, 1);
    jo_ann.likeReel(abin_abi, 1);
    jo_ann.commentPost(abin_abi, 1, "awsome");
    jo_ann.commentPost(abin_abi, 1, "good");
    jo_ann.commentReel(abin_abi, 1, "interesting");

    
    abin_abi.updateStory("awsome ride", "car.mp4");
    abin_abi.getFeed().addContentToFeed();    
    
    System.out.println("abi's profile: ");
    System.out.println("abi's following list: " + abin_abi.following);
    System.out.println("abi's followers list: " + abin_abi.followers);
    System.out.println("abi's posts " + abin_abi.myPosts);
    System.out.println("abi's Reels " + abin_abi.myReels);
    System.out.println();
    System.out.println("story of abin: " + abin_abi.getMystory());
    System.out.println();
    System.out.println("Feed of anin:" + abin_abi.getFeed());       
   }           
    
}
