package instagram;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class PostTest {
    @Test
    public void testSetImageUrl() {

        User eby = new User("eby", "eb12", "eby@gmail.com");
        UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
        Post post = new Post(eby_12, 1, "beautiful flower", "rose.jpg", LocalDate.of(2023, 6, 5));

        String expected;
        String got;

        // test case 1
        expected = "rose.jpg";
        got = post.getImageUrl();

        assertEquals(expected, got);

        // test case 2
        post.setImageUrl("flower.jpg");
        expected = "flower.jpg";
        got = post.getImageUrl();

        assertEquals(expected, got);

    }

    @Test
    public void testSetCaption() {

        User eby = new User("eby", "eb12", "eby@gmail.com");
        UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
        Post post = new Post(eby_12, 1, "beautiful flower", "rose.jpg", LocalDate.of(2023, 6, 5));

        String expected;
        String got;

        // test case 1
        expected = "beautiful flower";
        got = post.getCaption();

        assertEquals(expected, got);

        // test case 2
        post.setCaption("flower");
        expected = "flower";
        got = post.getCaption();

        assertEquals(expected, got);

    }

    @Test
    public void testSetId() {

        User eby = new User("eby", "eb12", "eby@gmail.com");
        UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
        Post post = new Post(eby_12, 1, "beautiful flower", "rose.jpg", LocalDate.of(2023, 6, 5));

        int expected;
        int got;

        // test case 1
        expected = 1;
        got = post.getId();

        assertEquals(expected, got);

        // test case 2
        post.setId(2);
        expected = 2;
        got = post.getId();

        assertEquals(expected, got);
    }

    


}
