package BinaryConverter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        startProgram();

    }
    public static void startProgram(){
        Scanner scanner = new Scanner(System.in);
        getChoice(scanner);
        System.out.println("Желаете повторить конвертирование?(Да/Нет)");
        String repeatAnswer = new Scanner(System.in).nextLine();
        if (repeatAnswer.equalsIgnoreCase("Да")){
            startProgram();
        }else {
            System.out.println("Все результаты сохранены в файл conversion_history.txt. Работа программы завершена.");
        }
        scanner.close();
    }

    public static void getChoice(Scanner scanner) {
        int input = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("Выберите способ перевода: \nС помощью массива - 1 \nС помощью рекурсии - 2");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                valid = true;
            } else {
                String wrongInput = scanner.nextLine();
                System.out.println("Ошибка! Вы ввели не число! Вы ввели: " + wrongInput);
                System.out.println("-".repeat(50));
            }
        }
        switch (input) {
            case 1:
                useArrayMethod(scanner);
                break;
            case 2:
                useRecursionMethod(scanner);
                break;
            default:
                System.out.println("Вы ввели не правильное значение!");
                System.out.println("-".repeat(50));
                getChoice(scanner);
        }
    }

    public static void useArrayMethod(Scanner scanner) {
        System.out.println("Введите число для перевода в двоичную систему");

        boolean valid = false;
        while (!valid){
            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                scanner.nextLine();
                if(input < 0){
                    System.out.println("Вы ввели отрицательное число, попробуйте снова.");
                    continue;
                }

                StringBuilder log = new StringBuilder();
                log.append("-".repeat(50)).append("\n");
                log.append("Исходное число - ").append(input).append("\n");
                log.append("Способ перевода: массив\n");
                log.append("Процесс перевода\n");

                String binary;
                if(input == 0) {
                    String step = "0 / 2 = 0";
                    System.out.println(step);
                    log.append(step).append("\n");
                    binary = "0";
                    log.append("Результат: ").append(binary).append("\n");
                    log.append("-".repeat(50));
                    System.out.println("Остаток в обратном порядке:" + binary);
                    System.out.println("Двоичное представление числа 0: 0");

                    try {
                        Files.writeString(Path.of("src/BinaryConverter/conversion_history.txt"), log.toString(),
                                StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                    }
                    catch (IOException e){
                        System.err.println("Ошибка записи в файл: " + e.getMessage());
                    }
                    break;
                }

                int number = input;
                int counter = 0;

                while (number > 0){
                    counter++;
                    number /= 2;
                }
                int[] binaryArray = new int[counter];
                number = input;

                for(int index = counter - 1; index >= 0; index--){
                    binaryArray[index] = number % 2;
                    String step = number + " / 2 = " + (number / 2) + ", остаток " + binaryArray[index];
                    System.out.println(step);
                    log.append(step).append("\n");
                    number /= 2;
                }
                System.out.println("Двоичное представление через массив: " + Arrays.toString(binaryArray));

                StringBuilder sb = new StringBuilder();
                for (int bit : binaryArray){
                    sb.append(bit);
                }
                binary = sb.toString();

                System.out.println("Остатки в обратном порядке: " + binary);
                System.out.println("Двоичное значение числа " + input + ": " + binary);

                log.append("Результат: ").append(binary).append("\n");
                log.append("-".repeat(50));

                try {
                    Files.writeString(Path.of("src/BinaryConverter/conversion_history.txt"), log.toString(),
                            StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    System.err.println("Ошибка записи в файл: " + e.getMessage());
                }
                valid = true;
            }
            else {
                String wrongInput = scanner.next();
                System.out.println("Ошибка введите число, а не " + wrongInput);
            }
        }
    }

    public static void useRecursionMethod(Scanner scanner) {
        System.out.println("Введите целое положительное число число:");
        while (true){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                if(number < 0){
                    System.out.println("Вы ввели отрицательное число, попробуйте снова.");
                    continue;
                }
                StringBuilder log = new StringBuilder();
                log.append("-".repeat(50)).append("\n");
                log.append("Исходное число - ").append(number).append("\n");
                log.append("Способ перевода: рекурсия\n");
                log.append("Процесс перевода\n");

                String binary;
                if(number == 0){
                    String step = "0 / 2 = 0";
                    System.out.println(step);
                    log.append(step).append("\n");
                    binary = "0";
                }else {
                    binary = convertRecursive(number, log);
                }

                log.append("Результат: ").append(binary).append("\n");
                log.append("-".repeat(50));

                System.out.println("Остаток в обратном порядке: " + binary);
                System.out.println("Двоичное значение числа " + number + ": " +binary);

                try {
                    Files.writeString(Path.of("src/BinaryConverter/conversion_history.txt"), log.toString(), StandardCharsets.UTF_8,
                            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    System.err.println("Ошибка записи в файл: " + e.getMessage());
                }

                break;
            }else {
                String wrong = scanner.next();
                System.out.println("Ошибка введите число, а не " + wrong);
            }
        }
    }

    public static String convertRecursive(int n, StringBuilder log){
        if(n == 0 ){
            return "";
        }
        int quotient = n / 2;
        int remainder = n % 2;
        String step = n + " / 2 = " + quotient + ", остаток " + remainder;
        System.out.println(step);
        log.append(step).append("\n");
        return convertRecursive(quotient, log) + remainder;
    }
}
