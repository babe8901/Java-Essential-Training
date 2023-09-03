package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("strawberry", 45);
        //fruitCalories.put("lemon", 17); //overrides existing value
        fruitCalories.putIfAbsent("lemon", 17);

        System.out.println(fruitCalories);
        System.out.println("banana: " + fruitCalories.get("banana"));

        fruitCalories.remove("lemon");
        System.out.println(fruitCalories);

        System.out.println("contains key cherry: " + fruitCalories.containsKey("cherry"));

        System.out.println("contains value 45: " + fruitCalories.containsValue(45));

        // immutable map
        Map moreFruitCalories = Map.of(
                "cherry", 15,
                "cranberry", 210,
                "plum", 35);
        System.out.println(moreFruitCalories);

        System.out.println("Map Entries: " + fruitCalories.entrySet());
        System.out.println("map keys: " + fruitCalories.keySet());
        // returns a Collection object
        Collection values = fruitCalories.values();
        System.out.println("map values: " + values);
        values.remove(45);
        System.out.println(fruitCalories);
    }
}