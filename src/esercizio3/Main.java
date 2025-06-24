package esercizio3;

public class Main {
    public static void main(String[] args) {

        AddressBook.getAddressBook();
        AddressBook.addContact("Mario", 1239);
        AddressBook.addContact("Luigi", 14239);
        AddressBook.addContact("Bowser", 13139);
        AddressBook.addContact("Peach", 491288);
        AddressBook.getAddressBook();
        AddressBook.deleteContact("Peach");
        AddressBook.getAddressBook();

        AddressBook.getByName("Luigi");
        AddressBook.getByPhone(1239);

    }
}
