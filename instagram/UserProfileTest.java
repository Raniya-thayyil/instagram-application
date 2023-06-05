// package instagram;

// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertTrue;

// import java.time.LocalDate;

// import org.junit.Test;

// public class UserProfileTest {

//     @Test
//     public void testCommentPost() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
//         eby_12.uploadPost(1, "hello", "you.jpg", LocalDate.of(2023, 6, 5));

//         User nita = new User("nia", "ni12", "nia@gmail.com");
//         UserProfile nia_n = new UserProfile(nita, "nia", "hey you", "me.jpg");

//         boolean got;

//         // test case 1
//         got = nia_n.commentPost(eby_12, 1, "nice");
//         assertTrue(got);

//         // test case 2
//         got = nia_n.commentPost(eby_12, 2, "nice");
//         assertFalse(got);
//     }

//     @Test
//     public void testCommentReel() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
//         eby_12.uploadReel(1, "hello", "you.jpg");

//         User nita = new User("nia", "ni12", "nia@gmail.com");
//         UserProfile nia_n = new UserProfile(nita, "nia", "hey you", "me.jpg");

//         boolean got;

//         // test case 1
//         got = nia_n.commentReel(eby_12, 1, "nice");
//         assertTrue(got);

//         // test case 2
//         got = nia_n.commentPost(eby_12, 2, "good");
//         assertFalse(got);
//     }

//     @Test
//     public void testDeletePost() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
//         eby_12.uploadPost(1, "hello", "you.jpg", LocalDate.of(2023, 6, 5));

//         // test case 1
//         boolean got = eby_12.deletePost(1);
//         assertTrue(got);

//         // test case 2
//         boolean got1 = eby_12.deletePost(2);
//         assertFalse(got1);
//     }

//     @Test
//     public void testEditPost() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
//         eby_12.uploadPost(1, "hello", "you.jpg", LocalDate.of(2023, 6, 5));

//         // test case 1
//         boolean got = eby_12.editPost(1, "we");
//         assertTrue(got);

//         // test case 2
//         boolean got1 = eby_12.editPost(2, "we");
//         assertFalse(got1);
//     }

//     @Test
//     public void testLikePost() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
//         eby_12.uploadPost(1, "hello", "you.jpg", LocalDate.of(2023, 6, 5));

//         User nita = new User("nia", "ni12", "nia@gmail.com");
//         UserProfile nia_n = new UserProfile(nita, "nia", "hey you", "me.jpg");

//         // test case 1
//         boolean got = nia_n.likePost(eby_12, 1);
//         assertTrue(got);

//         // test case 2
//         boolean got1 = nia_n.likePost(eby_12, 2);
//         assertFalse(got1);
//     }

//     @Test
//     public void testLikeReel() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
//         eby_12.uploadReel(1, "hello world", "me.mp4");

//         User nita = new User("nia", "ni12", "nia@gmail.com");
//         UserProfile nia_n = new UserProfile(nita, "nia", "hey you", "me.jpg");

//         // test case 1
//         boolean got = nia_n.likeReel(eby_12, 1);
//         assertTrue(got);

//         // test case 2
//         boolean got1 = nia_n.likeReel(eby_12, 2);
//         assertFalse(got1);
//     }

//     @Test
//     public void testSetBio() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");

//         String expected;
//         String got;

//         // test case 1
//         expected = "hey";
//         got = eby_12.getBio();

//         assertEquals(expected, got);

//         // test case 2
//         eby_12.setBio("i am eby");
//         expected = "i am eby";
//         got = eby_12.getBio();

//         assertEquals(expected, got);
//     }

//     @Test
//     public void testSetFollowersCount() {
//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");

//         User nita = new User("nia", "ni12", "nia@gmail.com");
//         UserProfile nia_n = new UserProfile(nita, "nia", "hey you", "me.jpg");

//         eby_12.follow(nia_n);
//         nia_n.acceptRequestFrom(eby_12);

//         int expected;
//         int got;

//         expected = 1;
//         got = nia_n.getFollowersCount();

//         assertEquals(expected, got);
//     }

//     @Test
//     public void testSetFollowingCount() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");

//         User nita = new User("nia", "ni12", "nia@gmail.com");
//         UserProfile nia_n = new UserProfile(nita, "nia", "hey you", "me.jpg");

//         eby_12.follow(nia_n);
//         nia_n.acceptRequestFrom(eby_12);

//         int expected;
//         int got;

//         expected = 1;
//         got = eby_12.getFollowingCount();

//         assertEquals(expected, got);
//     }

//     @Test
//     public void testSetProfileName() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");

//         // test case 1
//         String expected = "eb";
//         String got = eby_12.getProfileName();

//         assertEquals(expected, got);

//         // test case 2
//         eby_12.setProfileName("eby1");
//         expected = "eby1";
//         got = eby_12.getProfileName();

//         assertEquals(expected, got);
//     }

//     @Test
//     public void testSetProfilePicture() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");

//         // test case 1
//         String expected = "me.jpg";
//         String got = eby_12.getProfilePicture();

//         assertEquals(expected, got);

//         // test case 2
//         eby_12.setProfilePicture("ho.jpg");
//         expected = "ho.jpg";
//         got = eby_12.getProfilePicture();

//         assertEquals(expected, got);
//     }

//     @Test
//     public void testTagUser() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");
//         eby_12.uploadPost(1, "hello", "you.jpg", LocalDate.of(2023, 6, 5));

//         User nita = new User("nia", "ni12", "nia@gmail.com");
//         UserProfile nia_n = new UserProfile(nita, "nia", "hey you", "me.jpg");

//         // test case 1
//         boolean got;
//         got = eby_12.tagUser(nia_n, 1);
//         assertTrue(got);

//         // test case 2
//         got = eby_12.tagUser(nia_n, 10);
//         assertFalse(got);
//     }

//     @Test
//     public void testUploadPost() {

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         UserProfile eby_12 = new UserProfile(eby, "eb", "hey", "me.jpg");

//         // test case 1
//         boolean got = eby_12.uploadPost(1, "hello", "you.jpg", LocalDate.of(2023, 6, 5));
//         assertTrue(got);

//         // test case2

//         boolean got1 = eby_12.uploadPost(1, "hello", "you.jpg", LocalDate.of(2023, 6, 5));
//         assertFalse(got1);
//     }

//     @Test
//     public void testSearchUserProfile() {
//         Instagram instagram = new Instagram();

//         User eby = new User("eby", "eb12", "eby@gmail.com");
//         eby.createProfile(instagram, "eb", "hey", "me.jpg");
//         UserProfile eby_eb = eby.getProfile();

//         User nita = new User("nia", "ni12", "nia@gmail.com");
//         nita.createProfile(instagram, "nia_a", "i am nita", "home.jpg");

//         boolean got;

//         // test case 1
//         got = eby_eb.searchUserProfile(instagram, "nia_a");
//         assertTrue(got);

//         // test case 2
//         got = eby_eb.searchUserProfile(instagram, "nia");
//         assertFalse(got);
//     }

// }
