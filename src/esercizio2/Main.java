package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int howManyNums = 5;

        List<Integer> randNums = new ArrayList<>();

        System.out.println("Your numbers are: " + firstNumsList(howManyNums, randNums));

        List<Integer> reverseRandNums = new ArrayList<>(randNums);

        oddEven(true, randNums);
        oddEven(false, randNums);

        System.out.println("Your reverse list: " + reverse(reverseRandNums, randNums));

    }

    public static List<Integer> firstNumsList(int howManyNums, List<Integer> a) {
        Random r = new Random();

        for (int i = 0; i < howManyNums; i++) {
            a.add(r.nextInt(100));
        }

        Collections.sort(a);
        return a;
    }

    public static List<Integer> reverse(List<Integer> a, List<Integer> b) {
        Collections.reverse(a);
        b.addAll(a);
        return b;
    }

    public static void oddEven(boolean a, List<Integer> list) {
        if (a) {
            for (int number : list) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        } else {
            for (int number : list) {
                if (number % 2 != 0) {
                    System.out.println(number);
                }
            }
        }
    }
}
