package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Set<String> userWords = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try {
            System.out.println("How many words do you want to put in ?");
            int howManyWords = Integer.parseInt(scan.nextLine());
            if (howManyWords < 0) {
                throw new NumberFormatException();
            }

            for (int i = 0; i < howManyWords; i++) {
                System.out.println("Enter a new word: ");
                String newWord = scan.nextLine();

                if (!userWords.add(newWord)) {
                    duplicates.add(newWord);
                } else {
                    userWords.add(newWord);
                }

            }

            System.out.println("Your duplicates: " + duplicates);
            System.out.println("You entered " + userWords.size() + " unique words.");
            System.out.println(userWords);

        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number.");
        }


        scan.close();
    }
}