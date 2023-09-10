package streams;

import java.util.List;
import java.util.stream.Collectors;

public class VegetablesStream {
    public static void main(String[] args) {
        List<String> vegetables = List.of(
                "spinach",
                "cabbage",
                "peas",
                "green beans",
                "brussels sprouts",
                "carrots"
        );
        System.out.println(vegetables);
        boolean anyMatch = vegetables.stream().anyMatch((vegetable) -> vegetable.contains(" "));
        System.out.println(anyMatch);
        boolean allMatch = vegetables.stream().allMatch((vegetable) -> vegetable.contains("s"));
        System.out.println(allMatch);
        vegetables.stream().filter(vegetable -> vegetable.startsWith("c")).forEach(System.out::println);
        vegetables.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println(vegetables.stream().sorted().reduce("", (result, vegetable) -> result + "|" + vegetable));
        List<String> vegetablesThatEndWithS = vegetables.stream().filter((vegetable) -> vegetable.endsWith("s")).collect(Collectors.toList());
        System.out.println(vegetablesThatEndWithS);
        List<String> strings = vegetables.stream().filter(vegetable -> vegetable.startsWith("c")).map(String::toUpperCase).map(vegetable -> "yummy " + vegetable).collect(Collectors.toList());
        strings.forEach(System.out::println);
        System.out.println(strings);
    }
}
