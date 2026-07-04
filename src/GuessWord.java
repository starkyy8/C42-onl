import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        getRandomWord();
        tryToGuess();

    }

    public static String[] arrayOfWords = {
            "город", "книга", "ручка", "ложка", "вилка",
            "чашка", "ножка", "шапка", "кошка", "мышка",
            "белка", "олень", "дверь", "полка", "лампа",
            "сумка", "парта", "ковер", "ветер", "месяц"
        };

    public static String secretWord;

    public static void getRandomWord(){

    Random rand = new Random();

    int temp = rand.nextInt(arrayOfWords.length);
    secretWord = arrayOfWords[temp];
        //System.out.println(secretWord);
    }

    public static void tryToGuess(){

        char[] secretWordChar = new char[secretWord.length()];
        Arrays.fill(secretWordChar,'*');

        int attempts = 5;


        do {
            System.out.println("Введите букву или попробуйте угадать все слово сразу.");
            System.out.print("Загаданное слово - ");
            System.out.println(secretWordChar);

            String userInput = new Scanner(System.in).nextLine();
            if (userInput.isEmpty()){
                System.out.println("Вы ввели пустое значение, попробуйте еще раз.");
                continue;
            }
            //System.out.println("Вы ввели - " + userInput.trim().toLowerCase());


            if(userInput.length() > 1){
                if(userInput.equals(secretWord)){
                    System.out.println("Поздравляю! Вы угадали слово - " + secretWord + " !");
                    break;
                }else {
                    System.out.println("Вы не угадали слово.");
                    System.out.println("Количество оставшихся попыток - " + attempts);
                    System.out.println("-".repeat(40));
                    attempts--;
                }
                if (attempts == 0){
                    System.out.println("Вы проиграли.");
                    System.out.println("Загаданное слово было - " + secretWord);
                }
            }

            char letter = userInput.charAt(0);

            boolean found = false;

            for (int index = 0; index < secretWord.length(); index++){
                if(secretWord.charAt(index) == letter){
                    secretWordChar[index] = letter;
                    found = true;
                }
            }


            if (found){
                System.out.println("Буква " + letter + " есть в слове. Осталось попыток - " + attempts);
                boolean allOpened = true;
                for(char chars : secretWordChar){
                    if(chars == '*'){
                        allOpened = false;
                        break;
                    }
                }
                if(allOpened){
                    System.out.println("Поздравляю! Вы отгадали слово - " + secretWord + " !");
                    return;
                }
            }else {
                attempts--;
                System.out.println("Буквы " + userInput + " нет в слове. Осталось попыток - " + attempts);

                if (attempts == 0){
                    System.out.println("Вы проиграли.");
                    System.out.println("Загаданное слово было - " + secretWord);
                }
            }

            


        }while (attempts > 0);
        getRandomWord();
        tryNewGame();



    }
    public static void tryNewGame() {

        System.out.println("Хотите начать заново (Да/Нет)?");
        String userInput = new Scanner(System.in).nextLine();
        if (userInput.trim().toLowerCase().equalsIgnoreCase("Да")) {
            tryToGuess();
        } else {
            System.out.println("Спасибо за игру. До свидания!");

        }
    }
}
