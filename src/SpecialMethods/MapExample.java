package SpecialMethods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Original numbers: " + numbers);
        System.out.println("Squares: " + squares);


        int[] numbersv2 = {1, 2, 3, 4, 5};

        int[] squaredNumbers = Arrays.stream(numbersv2)
                .map(n -> n * n)
                .toArray();

        System.out.println("Original numbers: " + Arrays.toString(numbersv2));
        System.out.println("Squared numbers: " + Arrays.toString(squaredNumbers));


    }
}
