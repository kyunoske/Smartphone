import model.Contact;
import model.Friend;
import model.Smartphone;

public class Main {

    public static void main(String[] args) {

        Friend contact1 = new Friend("Jim", "12345679", "Happy");
        Friend contact2 = new Friend("Jimmmy", "123456790", "Sad");
        Friend contact3 = new Friend("Jimmmy Boy", "123456791", "Cheerful");
        Friend contact4 = new Friend("Jimmmy Boy Wonder", "123456792", "Suprised");

        Friend[] contacts = {contact1, contact2, contact3, contact4};
        System.out.println(contacts);

        Smartphone phoneX = new Smartphone("x839+ Mega Ultra Best", "Some Company", contacts);
        System.out.println(phoneX);
    }
}
