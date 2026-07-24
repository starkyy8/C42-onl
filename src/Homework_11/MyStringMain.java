package Homework_11;

import java.util.Arrays;
import java.util.Scanner;

public class MyStringMain {
    public static void main(String[] args) {
        //getShortAndLongString();
        //sortStrings();
        //getStringLength();
        //getUniqueWord();
        getDoubleChar();
    }
    public static void getShortAndLongString(){
        Scanner userInput = new Scanner(System.in);
        String shortString;
        String longString;
        System.out.println("Введите строку № 1 - ");
        String firstString = userInput.nextLine();
        System.out.println("Введите строку № 2 - ");
        String secondString = userInput.nextLine();
        System.out.println("Введите строку № 3 - ");
        String thirdString = userInput.nextLine();

        if(firstString.length() < secondString.length() && firstString.length() < thirdString.length()){
            shortString = firstString;
        }else if (secondString.length() < firstString.length() && secondString.length() < thirdString.length()){
            shortString = secondString;
        }else {
            shortString = thirdString;
        }

        if(firstString.length() > secondString.length() && firstString.length() > thirdString.length()){
            longString = firstString;
        }else if (secondString.length() > firstString.length() && secondString.length() > thirdString.length()){
            longString = secondString;
        }else {
            longString = thirdString;
        }

        System.out.println("Самая короткая строка - " + shortString);
        System.out.println("Самая длинная строка - " + longString);

    }
    public static void sortStrings(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите строку № 1 - ");
        String firstString = userInput.nextLine();
        System.out.println("Введите строку № 2 - ");
        String secondString = userInput.nextLine();
        System.out.println("Введите строку № 3 - ");
        String thirdString = userInput.nextLine();
        String[] strings = new String[]{firstString, secondString, thirdString};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
    public static void getStringLength(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите строку № 1 - ");
        String firstString = userInput.nextLine();
        System.out.println("Введите строку № 2 - ");
        String secondString = userInput.nextLine();
        System.out.println("Введите строку № 3 - ");
        String thirdString = userInput.nextLine();

        String[] strings = new String[]{firstString, secondString, thirdString};
        double average;
        average = (firstString.length() + secondString.length() + thirdString.length()) / 3.0;
        System.out.println(average);
        for (String s : strings){
            if (s.length() < average){
                System.out.println("Строка - " + s + " - ее длина " + s.length());
            }
        }
    }
    public static void getUniqueWord(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите строку № 1 - ");
        String firstString = userInput.nextLine();
        System.out.println("Введите строку № 2 - ");
        String secondString = userInput.nextLine();
        System.out.println("Введите строку № 3 - ");
        String thirdString = userInput.nextLine();

        String[] lines = {firstString, secondString, thirdString};
        String foundWord = null;

        for (String line : lines){
            String[] words = line.split(" ");
            for (String word : words){
                if(word.isEmpty()) continue;
                if (hasAllUniqueChars(word)){
                    foundWord = word;
                    break;
                }
            }
            if (foundWord != null){
                break;
            }
        }

        if (foundWord != null){
            System.out.println("Первое слово с уникальными символами - " + foundWord);
        }else {
            System.out.println("Слов с уникальными символами не найдено.");
        }

    }
    public static boolean hasAllUniqueChars(String str){
        for (int i = 0; i < str.length(); i++){
            for (int j = i + 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void getDoubleChar(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = userInput.nextLine();
        String result = duplicateChars(input);
        System.out.println("Результат дублирования: " + result);

    }
    public static String duplicateChars(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            sb.append(c).append(c);
        }
        return sb.toString();
    }
}
