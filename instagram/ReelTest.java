package instagram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReelTest {
    @Test
    public void testSetVideoUrl() {

        User eby = new User("eby", "eb12", "eby@gmail.com");
        UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
        Reel reel = new Reel(1, eby_12, "friends", "friends.mp4");

        String expected;
        String got;

        // test case 1
        expected = "friends.mp4";
        got = reel.getVideoUrl();

        assertEquals(expected, got);

        // test case 2
        reel.setVideoUrl("my_friends.mp4");
        expected = "my_friends.mp4";
        got = reel.getVideoUrl();

        assertEquals(expected, got);


    }

    @Test
    public void testSetCaption() {

        User eby = new User("eby", "eb12", "eby@gmail.com");
        UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
        Reel reel = new Reel(1, eby_12, "friends", "friends.mp4");

        String expected;
        String got;

        // test case 1
        expected = "friends";
        got = reel.getCaption();
        assertEquals(expected, got);

        // test case 2
        reel.setCaption("my friends");
        expected = "my friends";
        got = reel.getCaption();
        assertEquals(expected, got);

    }

    @Test
    public void testSetId() {

        User eby = new User("eby", "eb12", "eby@gmail.com");
        UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
        Reel reel = new Reel(1, eby_12, "friends", "friends.mp4");

        int expected;
        int got;

        // test case 1
        expected = 1;
        got = reel.getId();
        assertEquals(expected, got);

        // test case 2
        reel.setId(2);
        expected = 2;
        got = reel.getId();
        assertEquals(expected, got);
    }
}
