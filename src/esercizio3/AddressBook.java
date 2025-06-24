package esercizio3;

import java.util.HashMap;
import java.util.Map;

public abstract class AddressBook {
    static private final Map<String, Integer> addressBook = new HashMap<>();

    public static void addContact(String name, int phoneNum) {
        addressBook.put(name, phoneNum);
    }

    public static void deleteContact(String name) {
        addressBook.remove(name);
    }

    // https://docs.vultr.com/java/examples/get-key-from-hashmap-using-the-value

    public static void getByPhone(int phoneNum) {
        for (Map.Entry<String, Integer> item : addressBook.entrySet()) {
            if (item.getValue().equals(phoneNum)) {
                System.out.println("The name you're looking for is " + item.getKey());
            }
        }
    }

    public static void getByName(String name) {
        System.out.println("The number you're looking for is " + addressBook.get(name));
    }

    public static void getAddressBook() {
        if (addressBook.isEmpty()) {
            System.out.println("Your address book is empty.");
        } else {
            System.out.println(addressBook);
        }
    }

}
