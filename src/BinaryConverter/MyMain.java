package BinaryConverter;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        startProgram();
        //algorithm(10);
        //anotherAlgorithm();
        //arrayAlgorithm();
    }
    public static void startProgram(){
        Scanner scanner = new Scanner(System.in);
        getChoice(scanner);
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
                useRecursionMethod();
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
                    number /= 2;
                }
                System.out.println("Двоичное представление через массив: " + Arrays.toString(binaryArray));

                StringBuilder sb = new StringBuilder();
                for (int bit : binaryArray){
                    sb.append(bit);
                }
                System.out.println("Двоичная строка: " + sb.toString());
                valid = true;
            }
            else {
                String wrongInput = scanner.next();
                System.out.println("Вы ввели неверное число - " + wrongInput);
                System.out.println("-".repeat(50));

            }
        }
    }

    public static void useRecursionMethod() {
        System.out.println("Рекурсия");
    }

    public static String algorithm(int n){
        if(n == 0){
            return "0";
        }
        if(n == 1){
            return "1";
        }
        return algorithm(n / 2) + (n % 2);

    }

    public static void arrayAlgorithm(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
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
            number /= 2;
        }
        System.out.println("Двоичное представление через массив: " + Arrays.toString(binaryArray));

        StringBuilder sb = new StringBuilder();
        for (int bit : binaryArray){
            sb.append(bit);
        }
        System.out.println("Двоичная строка: " + sb.toString());

    }


}
