package streams;

import java.util.List;

public class NumbersStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,4,6,8,10);
        System.out.println(numbers);
        System.out.println("sum: " + numbers.stream().reduce(0, Integer::sum));
    }
}
