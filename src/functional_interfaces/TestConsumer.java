package functional_interfaces;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Consumer<String> bye = c -> System.out.println("Bye");
        print.andThen(bye).accept("Hello World!!!");
    }
}
