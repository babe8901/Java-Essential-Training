package functional_interfaces;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class TestPredicateInterface {
    public static void main(String[] args) {
        Predicate<String> isIndia = (country) -> Objects.equals(country, "India");
        Predicate<String> isLengthEqualToFive = (country) -> country.length() == 5;
        List<String> countries = List.of("Australia", "China", "India", "Russia", "America");
        countries.forEach(country -> System.out.println(isIndia.test(country)));
        System.out.println("------------------");
        countries.forEach(country -> System.out.println(isIndia.negate().test(country)));
        System.out.println("------------------");
        countries.forEach(country -> System.out.println(isLengthEqualToFive.test(country)));
        System.out.println("------------------");
        countries.forEach(country -> System.out.println(isLengthEqualToFive.and(isIndia).test(country)));
        System.out.println("------------------");
        countries.forEach(country -> System.out.println(isLengthEqualToFive.or(isIndia).test(country)));
        System.out.println("------------------");
        countries.forEach(country -> System.out.println(Predicate.not(isLengthEqualToFive).test(country)));
        System.out.println("------------------");
        System.out.println(Predicate.isEqual(isIndia).test(isLengthEqualToFive));
        System.out.println("----------");

        Predicate<Object> isNull = (input) -> Objects.equals(input, null);
        Predicate<Object> isStringNull1 = Predicate.not(isNull);
        Predicate<String> isStringNull2 = Predicate.not(isNull);

//        System.out.println(isStringNull1 instanceof Predicate<String>);
        System.out.println(isStringNull1 instanceof Predicate<Object>);
        System.out.println("----------");
        System.out.println(isStringNull2 instanceof Predicate<String>);
//        System.out.println(isStringNull2 instanceof Predicate<Object>);
        System.out.println("----------");
        System.out.println(isNull.getClass());
        System.out.println(isStringNull1.getClass());
        System.out.println(isStringNull2.getClass());
    }
}
