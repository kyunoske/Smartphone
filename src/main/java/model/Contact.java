package model;

import java.util.Objects;

public abstract class Contact {

    protected String nameOfContact;
    protected String phoneNumber;

    public String getNameOfContact() {
        return nameOfContact;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }
}
