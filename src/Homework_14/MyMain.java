package Homework_14;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        openFile();
    }

    public static void openFile() {
        File readDocument = new File("src/Homework_14/Romeo and Juliet.txt");
        String longestWord = "";
        String newFile = "src/Homework_14/Output.txt";

        try (Scanner scanner = new Scanner(readDocument)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("[\\s-]+");

                for (String word : words){
                    if(word.length() > longestWord.length()){
                        longestWord = word;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + e.getMessage());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))){
            writer.write(longestWord);
        } catch (IOException e) {
            System.out.println("Ошибка записи " + e.getMessage());
        }
        System.out.println("Самое длинное слово записано в " + newFile);
        System.out.println("Самое длинное слово " + longestWord);
    }
}
