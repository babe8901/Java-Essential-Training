package functional_interfaces;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class TestUnaryOperatorInterface {
    public static void main(String[] args) {
        UnaryOperator<Integer> incrementByOne = (num) -> num + 1;
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach((num) -> System.out.println(incrementByOne.apply(num)));
        System.out.println("--------");
        UnaryOperator<Integer> decrementByOne = (num) -> num - 1;
        Arrays.stream(arr).forEach((num) -> System.out.println(decrementByOne.apply(num)));
    }
}
