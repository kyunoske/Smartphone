package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriendTest {

    @Test
    void testToString() {
        //Given
        Friend contact1 = new Friend("Jim", "12345679", "Happy");

        //When
        String actual = contact1.toString();

        //Then
        assertEquals(contact1.toString(), actual);
    }
}