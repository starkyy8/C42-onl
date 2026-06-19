package Homework_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_5 {

    public static void main (String[] args){

        //useTwoDimensionalArray(5, 5);
        paintCheckmateDeck(8,8);
    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }

    public static void useTwoDimensionalArray(int row, int column){

        int[][] array = new int[row][column];

        for(int rowIndex = 0; rowIndex < array.length; rowIndex++){
            for(int colIndex = 0; colIndex < array[rowIndex].length; colIndex++){
                array[rowIndex][colIndex] = new Random().nextInt(20);
            }
        }

        System.out.println("Начальный двухмерный массив: ");
        readTwoDimensionalArrayInt(array);
        System.out.print("Введите число которое нужно добавить к каждому элементу двухмерного массива: ");
        int userNumberInput = getInput().nextInt();
        int sum = 0;

        for(int rowIndex= 0; rowIndex < array.length; rowIndex++){
            for (int colIndex = 0; colIndex < array[rowIndex].length; colIndex++){
                array[rowIndex][colIndex] += userNumberInput;
                sum += array[rowIndex][colIndex];
            }
        }
        System.out.println("Двухмерный массив к элементам которого прибавили число: " + userNumberInput);
        readTwoDimensionalArrayInt(array);
        System.out.println("Сумма всех элементов массива равна: " + sum);
    }

    public static void readTwoDimensionalArrayInt(int[][] arrayRead){

        for (int [] row : arrayRead){
            for(int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void readTwoDimensionalArrayString(String[][] arrayRead){

        for (String [] row : arrayRead){
            for(String col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void paintCheckmateDeck(int row, int col){
        String[][] checkmateDeck = new String[row][col];

        for (int rowIndex = 0; rowIndex < checkmateDeck.length; rowIndex++){
            for(int colIndex = 0; colIndex < checkmateDeck[rowIndex].length; colIndex++){
                if((rowIndex + colIndex) % 2 == 0){
                    checkmateDeck[rowIndex][colIndex] = "B";
                }
                else checkmateDeck[rowIndex][colIndex] = "W";
            }
        }
        readTwoDimensionalArrayString(checkmateDeck);
    }
}
