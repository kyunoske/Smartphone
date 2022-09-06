package model;

public class Friend extends Contact{

    private String nickName;

    public Friend() {
        super();
        this.nickName = nickName;
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
                ", nameOfContacts='" + nameOfContacts + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
