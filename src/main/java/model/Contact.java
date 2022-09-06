package model;

import java.util.Objects;

public abstract class Contact {

    public String nameOfContacts;
    public String phoneNumber;

    public Contact() {
        super();
        this.nameOfContacts = nameOfContacts;
        this.phoneNumber = phoneNumber;
    }

    public String getNameOfContacts() {
        return nameOfContacts;
    }

    public void setNameOfContacts(String nameOfContacts) {
        this.nameOfContacts = nameOfContacts;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nameOfContacts='" + nameOfContacts + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(nameOfContacts, contact.nameOfContacts) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfContacts, phoneNumber);
    }
}
