package functional_interfaces;

import java.util.function.Supplier;

public class TestSupplierInterface {
    public static void main(String[] args) {
        Supplier<String> getString = () -> "This is Java";
        System.out.println(getString.get());
    }
}
