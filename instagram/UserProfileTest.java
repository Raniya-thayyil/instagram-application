package instagram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserProfileTest {

    @Test
    public void testSetProfilePicture() {

        User eby = new User("eby", "eb12", "eby@gmail.com");
        UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");

        // test case 1
        String expected = "me.jpg";
        String got = eby_12.getProfilePicture();

        assertEquals(expected, got);

        // test case 2
        eby_12.setProfilePicture("ho.jpg");
        expected = "ho.jpg";
        got = eby_12.getProfilePicture();

        assertEquals(expected, got);
    }

    @Test
    public void testSetBio() {

        User eby = new User("eby", "eb12", "eby@gmail.com");
        UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");

        String expected;
        String got;

        expected = "hey";
        got = eby_12.getBio();
        assertEquals(expected, got);
    }

    @Test
    public void testSetFollowersCount() {

        User eby = new User("eby", "eb12", "eby@gmail.com");
        UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");

        User nia = new User("nia", "nia2", "nia@gmail.com");
        UserProfile nia_n = new UserProfile(nia, "nia", "hey", "me.jpg");
        eby_12.follow(nia_n);
        nia_n.acceptRequestFrom(eby_12);

        int expected;
        int got;

        expected = 1;
        got = nia_n.getFollowersCount();
        assertEquals(expected, got);

    }

    @Test
    public void testSetFollowingCount() {

        User eby = new User("eby", "eb12", "eby@gmail.com");
        UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");

        User nia = new User("nia", "nia2", "nia@gmail.com");
        UserProfile nia_n = new UserProfile(nia, "nia", "hey", "me.jpg");
        eby_12.follow(nia_n);
        nia_n.acceptRequestFrom(eby_12);

        int expected;
        int got;

        expected = 1;
        got = eby_12.getFollowingCount();
        assertEquals(expected, got);
    }

    @Test
    public void testSetProfileName() {

        User nia = new User("nia", "nia2", "nia@gmail.com");
        UserProfile nia_n = new UserProfile(nia, "nia", "hey", "me.jpg");

        String expected;
        String got;

        expected = "nia";
        got = nia_n.getProfileName();
        assertEquals(expected, got);
    }
}
