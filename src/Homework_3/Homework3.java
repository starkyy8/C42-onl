package Homework_3;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args){
        //getEven();
        //getTemperature();
        //getSquareNumber();
        //getSequence();
        getSum();
    }

    public static void getEven(){
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число: ");
        String value = input.nextLine();
        int result = Integer.parseInt(value);
        if ( result % 2 == 0) {
            System.out.println("Ваше число - " + result + " четное");
        }
        else {
            System.out.println("Ваше число - " + result + " нечетное");
        }

    }

    public static void getTemperature() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите температуру: ");
        String t = input.nextLine();
        int resultInput = Integer.parseInt(t);

        if (resultInput > -5 ){
            System.out.println("Warm");
        }
        else if (resultInput < -5 && resultInput > -20){
            System.out.println("Normal");
        }
        else{
            System.out.println("Cold");
        }
    }

    public static void getSquareNumber(){
            int a = 10;

        for(int i = 1; i < 12; i++){
            int b = a++;
            System.out.println(b * b);
        }
    }

    public static void getSequence(){
        int a = 7;


        while (a < 98 ){
            a = a + 7;
            System.out.println(a);
        }
    }

    public static void getSum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");

        if (input.hasNextInt() ) {
            int value = input.nextInt();
            if (value >= 0){
                int a = 1;
                int b = 1;
                while (a <= value - 1) {
                    a++;
                    b = b + a;
                }
                    System.out.println("Сумма чисел от 1 до " + value + " равна - " + b);
            }
            else {
                System.out.println("Ведено неверное число.");
            }
        }
        else {
            System.out.println("Ведено неверное число.");
        }
    }
}
