package instagram;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Instagram instagram = new Instagram();

        User abin = new User("abin", "abin2123", "abin@gmail.com");
        instagram.usersList.add(abin);
        abin.createProfile(instagram, "abin_abi", "hi i am abi", "abi.jpg");
        UserProfile abin_abi = abin.getProfile();        

        User manu = new User("manu_m", "manu123", "man@gmail.com");
        instagram.usersList.add(manu);
        manu.createProfile(instagram, "manu_man", "hey there", "manu.jpg");
        UserProfile manu_man = manu.getProfile();

        User jo = new User("jo_jo", "jo#21", "jo@gmail.com");
        instagram.usersList.add(jo);
        jo.createProfile(instagram, "jo_ann", "call me jo", "jo.jpg");
        UserProfile jo_ann = jo.getProfile();

        abin_abi.follow(jo_ann);
        abin_abi.follow(manu_man);
        jo_ann.acceptRequestFrom(abin_abi);
        jo_ann.follow(abin_abi);
        abin_abi.acceptRequestFrom(jo_ann);
        manu_man.follow(abin_abi);
        abin_abi.acceptRequestFrom(manu_man);

        Post forestImage = new Post(abin_abi, 1, "forest", "forest.jpg", LocalDate.of(2023, 5, 12));
        forestImage.uploadPost();
        forestImage.like(jo_ann);
        forestImage.like(manu_man);
        forestImage.comment(jo_ann, "wow!", 1);
        forestImage.replyToComment(jo_ann, 1, "thank you jo");
        forestImage.tagUser(jo_ann);
        forestImage.share(jo_ann);        
        Post myImage = new Post(abin_abi, 2, "me", "me.jpg",  LocalDate.of(2023, 5, 22));
        myImage.uploadPost();
        Reel travelVideo = new Reel(1, abin_abi, "travel", "travel.mp4");
        travelVideo.uploadReel();
        travelVideo.like(jo_ann);   
        travelVideo.share(jo_ann);    
        travelVideo.comment(jo_ann, "awsome!", 1);
        Story rideStory = new Story(abin_abi, "awsome ride", "ride.mp4", LocalDate.of(2023, 6, 3));
        rideStory.updateStory();         

        Post petImage = new Post(jo_ann, 1, "oreo", "my-pet.mp4", LocalDate.of(2023, 6, 2));
        petImage.uploadPost();      
        Post homeImage = new Post(jo_ann, 2, "home", "home.jpg", LocalDate.of(2023, 5, 14));
        homeImage.uploadPost();        
        Post skyImage = new Post(jo_ann, 3, "some where in earth", "sky.jpg", LocalDate.of(2023, 6, 5));
        skyImage.uploadPost();
        Story friendsStory = new Story(jo_ann, "my friends", "friends.mp4", LocalDate.of(2023, 6, 5));
        friendsStory.updateStory();
        Story holydayTrip = new Story(jo_ann, "holyday", "trip.mp4", LocalDate.of(2023, 6, 6));
        holydayTrip.updateStory();
        holydayTrip.delete();
        
        Reel familyVideo = new Reel(1, manu_man, "family", "family.mp4");
        familyVideo.uploadReel();        
        Story birthdayStory = new Story(manu_man, "happy birthday", "hbd.jpg", LocalDate.of(2023, 6, 5));
        birthdayStory.updateStory();
        Story weddingDay = new Story(manu_man, "happy wedding", "wedding.jpg", LocalDate.of(2023, 6, 6));
        weddingDay.updateStory();

        Feed abisFeed = abin_abi.getFeed();      

        System.out.println("abi's profile: ");
        System.out.println("abi's following list: " + abin_abi.following);
        System.out.println("abi's followers list: " + abin_abi.followers);
        System.out.println("abi's posts: " + abin_abi.myPosts);
        System.out.println("abi's Reels: " + abin_abi.myReels);
        System.out.println();        
        System.out.println("jo's inbox: " + jo_ann.getShareDetail());
        System.out.println();
        System.out.println("Feed of abin:" + abisFeed);        
    }
}
