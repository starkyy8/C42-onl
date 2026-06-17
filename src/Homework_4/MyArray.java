package Homework_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {

        public static void main(String[] args) {
            //getForwardAndReversArray();
            findIncreasing();
        }

        public static Scanner getInput(){
            return new Scanner(System.in);
        }

        public static void getForwardAndReversArray(){

            int arrayElementCounter;

            do {
                System.out.print("Введите количество элементов массива: ");

                if((arrayElementCounter = getInput().nextInt()) > 0) break;
                System.out.println("Вы ввели неверное значение!");
            } while (true);

            int[] array = new int[arrayElementCounter];

            System.out.println("Элементы массива в прямом порядке: ");
            for (int index = 0; index < array.length; index++){
                array[index] = new Random().nextInt(20);
                System.out.println("Элемент массива № " + (index + 1) + " - " + array[index]);
            }
            System.out.println("-".repeat(50));
            System.out.println("Элементы массива в обратном порядке: ");
            for (int index = array.length - 1; index >= 0; index--){

                System.out.println("Элемент массива № " + (index + 1) + " - " + array[index]);
            }

        }

        public static void getMaxAndMin(){

            int arrayElementCounter;

            do{
                System.out.print("Введите количество элементов массива: ");

                if((arrayElementCounter = getInput().nextInt()) > 0) break;
                System.out.println("Вы ввели неверное значение!");
            } while (true);


            int[] array = new int[arrayElementCounter];
            for (int index = 0; index < array.length; index++){
                System.out.print("Введите значение элемента массива № " + (index + 1)+ ": ");
                array[index] = getInput().nextInt();
            }
            Arrays.sort(array);
            System.out.println("Максимальный элемент массива - " + array[array.length - 1]);
            System.out.println("Минимальный элемент массива - " + array[0]);

        }

        public static void getMaxMinIndex(){
            int arrayElementCouner;

            do{
                System.out.println("Введите количество элементов массива: ");

                if((arrayElementCouner = getInput().nextInt()) > 0) break;;

            }while(true);


            int[] array = new int[arrayElementCouner];
            int maxIndex = 0;
            int minIndex = 0;

            for (int index = 0; index < array.length; index++){
                array[index] = new Random().nextInt(200);

                if (array[index] > array[maxIndex]){
                    maxIndex = index;
                }
                if (array[index] < array[minIndex]){
                    minIndex = index;
                }
            }

            System.out.println("Максимальный индекс: " + maxIndex);
            System.out.println("Минимальный индекс: " + minIndex);
            System.out.println(Arrays.toString(array));


        }

        public static void findZero(){
            int arrayElementCouner;

            do{
                System.out.println("Введите количество элементов массива: ");

                if((arrayElementCouner = getInput().nextInt()) > 0) break;;

            }while(true);

            int[] array = new int[arrayElementCouner];
            int zeroCounter = 0;
            for (int index = 0; index < array.length; index++){
                array[index] = new Random().nextInt(5);
                if(array[index] == 0){
                    zeroCounter++;
                }
            }
            if (zeroCounter == 0){
                System.out.println("Нулей в массиве нет.");
            }
            else {
                System.out.println("Нулей в массиве - " + zeroCounter);
            }

            System.out.println(Arrays.toString(array));

        }
        public static void swapArray(){
            int arrayElementCouner;

            do{
                System.out.println("Введите количество элементов массива: ");

                if((arrayElementCouner = getInput().nextInt()) > 0) break;;

            }while(true);

            int[] array = new int[arrayElementCouner];

            for (int index = 0; index < array.length; index++) {
                array[index] = new Random().nextInt(20);
            }
            System.out.println("Начальный массив " + Arrays.toString(array));

            for (int index = 0; index < array.length / 2; index++) {
                int temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            }

            System.out.println("Перевернутый массив - " + Arrays.toString(array));

        }
        public static void findIncreasing (){
            int arrayElementCounter;

            do {
                System.out.println("Введите количество элементов массива: ");
                if ((arrayElementCounter = getInput().nextInt()) > 0) break;
            } while (true);

            int[] array = new int[arrayElementCounter];

            for (int index = 0; index < array.length; index++) {
                System.out.println("Введите элемент " + (index + 1) + ": ");
                array[index] = getInput().nextInt();
            }

            System.out.println("Массив -  " + Arrays.toString(array));

            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] >= array[index + 1]) {
                    System.out.println("Массив не возрастающий");
                    return;
                }
            }
            System.out.println("Массив возрастающий");
        }

}
