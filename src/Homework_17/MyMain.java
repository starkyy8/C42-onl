package Homework_17;

import java.nio.charset.StandardCharsets;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyMain {
    public static void main(String[] args) {
        //getDateOfOneHundred();
        //getPositiveNumbers();
        //useDollarConverter();
        //useConsumer();
        useSupplier();
    }
    public static void getDateOfOneHundred(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения в формате (ГГГГ-ММ-ДД): ");
        String dateOfBirth = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateOfBirth).plusYears(100);
        System.out.println(date);
    }

    public static void getPositiveNumbers(){
        Integer[] array = new Integer[]{12, -3, 5, 2, -4};
        Predicate<Integer> isPositive = x -> x > 0;
        Integer[] positiveNumbers = Arrays.stream(array)
                                          .filter(isPositive)
                                          .toArray(Integer[]::new);
        System.out.println("Положительные числа из массива array: " + Arrays.toString(positiveNumbers));
    }

    public static void useDollarConverter(){
        double exchange = 3.004;
        Function<String, Double> toUSD = s -> {
            String[] parts = s.trim().split(" ");
            if (parts.length != 2 || !parts[1].equalsIgnoreCase("BYN")){
                throw new IllegalArgumentException("Неверный формат. Ожидается 'Сумма BYN'");
            }
            double amountBYN = Double.parseDouble(parts[0]);
            return amountBYN / exchange;
        };
        System.out.println("Введите сумму для перевода (Сумма BYN): ");
        String input = new Scanner(System.in).nextLine();
        try {
            double result = toUSD.apply(input);
            System.out.printf("%s = %.2f USD%n", input, result);
        } catch (Exception e) {
            System.out.println("Ошибка: " +e.getMessage());
        }

    }

    public static void useConsumer(){
        double exchangeRate = 3.004;
        Consumer<String> printUsd = s -> {
            try {
                String[] parts = s.trim().split(" ");
                if (parts.length != 2 || !parts[1].equalsIgnoreCase("BYN")) {
                    System.out.println("Неверный формат. Ожидается: 'сумма BYN'");
                    return;
                }
                double amountByn = Double.parseDouble(parts[0]);
                double amountUsd = amountByn / exchangeRate;
                System.out.printf("%s = %.2f USD%n", s.trim(), amountUsd);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: сумма должна быть числом (например, 100 или 250.50)");
            }
        };
        System.out.print("Введите сумму в формате 'число BYN': ");
        String input = new Scanner(System.in).nextLine();

        printUsd.accept(input);

    }

    public static void useSupplier(){
        Supplier<String> supplier = () ->{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String input = scanner.nextLine();
            return new StringBuilder(input).reverse().toString();
        };
        String reversed = supplier.get();
        System.out.println(reversed);
    }
}
