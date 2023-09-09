package functional_interfaces;

import java.util.List;
import java.util.function.Function;

public class TestFunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = String::length;
        Function<Integer, Integer> modThree = (num) -> num % 3;
        Function<String, String> subString = (string) -> string.concat(":country");

        List<String> countries = List.of("Australia", "China", "India", "Russia", "America");
        countries.forEach(country -> System.out.println(stringLength.apply(country)));
        System.out.println("--------------");
        countries.forEach(country -> System.out.println(Function.identity().apply(country)));
        System.out.println("--------------");
        countries.forEach(country -> System.out.println(stringLength.andThen(modThree).apply(country)));
        System.out.println("--------------");
        countries.forEach(country -> System.out.println(stringLength.compose(subString).apply(country)));
    }
}
