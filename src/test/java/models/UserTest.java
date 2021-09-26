package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void instntiastes_correctly() {
        User user = new User(4,"run","two","ceo");
        assertEquals(true, user instanceof User);
    }

    @Test
    public void gets_the_id() {
        User user = new User(4,"run","two","ceo");
        assertEquals(4,user.getId());
    }
}