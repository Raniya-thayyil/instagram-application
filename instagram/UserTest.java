package instagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserTest {
    @Test
    public void testCreateProfile() {
        Instagram instagram = new Instagram();

        User abin = new User("abin", "abin2123", "abin@gmail.com");
        instagram.usersList.add(abin);
        boolean got = abin.createProfile(instagram, "abin_abi", "hi i am abi", "abi.jpg");

        assertTrue(got);

        // test case 2
        User eby = new User("abin", "eb12", "eby@gmail.com");
        boolean got1 = eby.createProfile(instagram, "abin_abi", "hello", "me.jpg");
        assertFalse(got1);
    }
}
