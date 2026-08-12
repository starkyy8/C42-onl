package Homework_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        getFirstAndLastLetter();
    }

    public static void getTrueOrFalse(){
        String[] letters = new String[]{"a", "a", "b", "c", "d", "d"};

        Map<String, Integer> counter = new HashMap<>();
        for (String letter : letters){
            counter.put(letter, counter.getOrDefault(letter, 0) + 1);
        }
        System.out.println(counter);
        Map<String, Boolean> result = new HashMap<>();
        for (Map.Entry<String,Integer> entry : counter.entrySet()){
            String letter = entry.getKey();
            int count = entry.getValue();
            result.put(letter,count > 1);
        }

        System.out.println(result);
    }

    public static void getFirstAndLastLetter(){
        String[] words = new String[]{"moon", "sun", "star"};
        Map<String, String> stringMap = new HashMap<>();

        for (String word : words){
            char key = word.charAt(0);
            char value = word.charAt(word.length() - 1 );
            String stringKey = String.valueOf(key);
            String stringValue = String.valueOf(value);
            stringMap.put(stringKey, stringValue);
        }
        System.out.println(stringMap);

    }

}
