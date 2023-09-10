package streams;

import java.util.Arrays;

public class ArrayStream {
    public static void main(String[] args) {
        int[] numbers = {0,2,4,6,8};
        Arrays.stream(numbers).forEach(number -> System.out.print(number + 1 + " "));
        System.out.println();
        Arrays.stream(numbers).parallel().forEach(number -> System.out.print(number + 1 + " "));
    }
}
