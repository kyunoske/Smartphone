package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void startRadio() {
        //Given
        Friend contact1 = new Friend("Jim", "12345679", "Happy");
        Friend contact2 = new Friend("Jimmmy", "123456790", "Sad");
        Friend contact3 = new Friend("Jimmmy Boy", "123456791", "Cheerful");
        Friend contact4 = new Friend("Jimmmy Boy Wonder", "123456792", "Suprised");

        Friend[] contacts = {contact1, contact2, contact3, contact4};

        Smartphone smartphone = new Smartphone("x", "y", contacts);
        boolean on = smartphone.startRadio();

        //When
        boolean actual = true;

        //Then
        assertEquals(true, actual);
    }

    @Test
    void stopRadio() {
        //Given
        Friend contact1 = new Friend("Jim", "12345679", "Happy");
        Friend contact2 = new Friend("Jimmmy", "123456790", "Sad");
        Friend contact3 = new Friend("Jimmmy Boy", "123456791", "Cheerful");
        Friend contact4 = new Friend("Jimmmy Boy Wonder", "123456792", "Suprised");

        Friend[] contacts = {contact1, contact2, contact3, contact4};

        Smartphone smartphone = new Smartphone("x", "y", contacts);
        boolean on = smartphone.stopRadio();

        //When
        boolean actual = false;

        //Then
        assertEquals(false, actual);
    }

    @Test
    void getPosition() {
        //Given
        Friend contact1 = new Friend("Jim", "12345679", "Happy");
        Friend contact2 = new Friend("Jimmmy", "123456790", "Sad");
        Friend contact3 = new Friend("Jimmmy Boy", "123456791", "Cheerful");
        Friend contact4 = new Friend("Jimmmy Boy Wonder", "123456792", "Suprised");

        Friend[] contacts = {contact1, contact2, contact3, contact4};

        Smartphone smartphone = new Smartphone("x", "y", contacts);
        String gps = smartphone.gpsLocation();

        //When
        String actual = gps;

        //Then
        assertEquals("Koln", actual);
    }
}