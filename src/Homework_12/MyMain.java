package Homework_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
    public static void main(String[] args) {
        getAbbreviation();
    }
    public static void getAbbreviation(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = userInput.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные аббревиатуры: ");
        boolean found = false;
        while (matcher.find()){
            System.out.println(matcher.group());
            found = true;
        }
        if(!found){
            System.out.println("Аббревиатуры не найдены.");
        }

    }
}
