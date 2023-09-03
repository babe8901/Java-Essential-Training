package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add(1);
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);

        System.out.println("have lemon? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("Number of elements after removing lemon : " + fruits.size());

        // moreFruits will be immutable
        Set moreFruits = Set.of("pear", "raisin", "cherry");
        // It will throw UnsupportedOperationException during runtime
        moreFruits.add("cranberry");
        moreFruits.remove("pear");
        System.out.println(moreFruits);
    }
}
