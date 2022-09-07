package model;

public class Friend extends Contact {

    private String nickName;

    public Friend(String nameOfContact, String phoneNumber, String nickName) {
        this.nickName = nickName;
        this.nameOfContact = nameOfContact;
        this.phoneNumber = phoneNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    //toString()

    @Override
    public String toString() {
        return "Friend{" +
                "nickName='" + nickName + '\'' +
                ", nameOfContacts='" + nameOfContact + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
