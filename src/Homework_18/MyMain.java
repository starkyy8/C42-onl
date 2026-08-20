package Homework_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyMain {
    public static void main(String[] args) {
        createCollection();
    }
    public static void createCollection(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3 , 4, 1, 2));
        System.out.println(numbers);
        List<Integer> noRepeat = numbers.stream()
                                        .distinct()
                                        .toList();
        System.out.println("Коллекция без дубликатов: " + noRepeat);
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .toList();
        System.out.println("Четные элементы коллекции: " + evens);
        int sum =(numbers.stream()
                .mapToInt(i -> i)
                .sum());
        System.out.println("Сумма элементов коллекции: " + sum);
    }

}
