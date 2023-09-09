package functional_interfaces;

import java.util.List;
import java.util.function.Consumer;

public class TestConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Consumer<String> bye = c -> System.out.println("Bye");
        print.andThen(bye).accept("Hello World!!!");

        List<String> countries = List.of("Australia", "China", "India", "Russia", "America");
        countries.forEach(print);
    }
}
