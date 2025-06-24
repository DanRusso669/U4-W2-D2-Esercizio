package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    static private Map<String, Integer> rubrica = new HashMap<>();

    public static void addContact(String name, int phoneNum) {
        rubrica.put(name, phoneNum);
    }

    public static void deleteContact(String name) {
        rubrica.remove(name);
    }

//    public static String getName(int phoneNum, Map<String, Integer> list) {
//        }
//    }

    public static void getByName(String name) {
        System.out.println("The number you're looking for is " + rubrica.get(name));
    }

    public static void getAddressBook() {
        if (rubrica.isEmpty()) {
            System.out.println("Your address book is empty.");
        } else {
            System.out.println(rubrica);
        }
    }

}
