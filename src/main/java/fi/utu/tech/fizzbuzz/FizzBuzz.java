package fi.utu.tech.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static List<String> fizzBuzz() {
        return IntStream.range(1, 100).mapToObj((int i) -> {
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            return divBy3 && divBy5 ? "FizzBuzz"
                    : divBy3 ? "Fizz"
                    : divBy5 ? "Buzz"
                    : String.valueOf(i);
        }).collect(Collectors.toList());
    }
}
