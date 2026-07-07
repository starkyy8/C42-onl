package Games;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {


        new TicTacToe().playLogic();
    }

    static char[][] playField;
    static char player1 = 'X';
    static char player2 = 'O';
    static Random random;
    static Scanner scanner;

    TicTacToe(){
        playField = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }


    public static void playLogic(){
        startGame();

        Boolean whoStartTurn = random.nextBoolean();

            if(whoStartTurn){
                //turnHuman();
                System.out.println("Начинает человек!");
            }else {
                //turnIA();
                System.out.println("Начинает ИИ!");
            }
        while (true){
            printTable();

            if(whoStartTurn){
                turnHuman();
            }else {
                turnIA();
            }
            whoStartTurn =!whoStartTurn;
            if (checkWin(player1)) {
                System.out.println("Победа игрока 1");
                printTable();
                break;
            }
            if (checkWin(player2)){
                System.out.println("Победа игрока 2");
                printTable();
                break;
            }
            if(isTableFull()){
                System.out.println("Ничья!");
                break;
            }


        }
        newGame();
    }

    public static void startGame(){
        for (int row = 0; row < playField.length; row++){
            for (int col = 0; col < playField[row].length; col++){
                playField[row][col] = '.';
            }
        }
    }

    public static void turnHuman(){
        int x, y;
        do {
            System.out.println("Введите координаты (0...2):");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }while (!isCellValid(x, y));
        playField[x][y] = player1;
    }
    public static boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x >= 3 || y >= 3){
            return false;
        }
        return playField[x][y] == '.';
    }

    public static void turnIA(){
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }while (!isCellValid(x, y));
        playField[x][y] = player2;
    }
    public static boolean checkWin(char dot){
        for (int i = 0; i < 3; i++){
            if((playField[i][0] == dot && playField[i][1] == dot &&
                playField[i][2] == dot) || (playField[0][i] == dot &&
                playField[1][i] == dot && playField[2][i] == dot))

                return true;
            if ((playField[0][0] == dot && playField[1][1] == dot &&
                 playField[2][2] == dot) || (playField[2][0] == dot &&
                 playField[1][1] == dot && playField[0][2] == dot))
                return true;
        }
        return false;
    }
    public static boolean isTableFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (playField[row][col] == '.')
                    return false;
        return true;
    }
    public static void printTable(){
        for (int row = 0; row < playField.length; row++){
            for (int col = 0; col < playField[row].length; col++){
                System.out.print(playField[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void newGame(){
        System.out.println("Вы хотите сыграть еще раз (Да/Нет)?");
        String userAnswer = new Scanner(System.in).nextLine().toLowerCase().trim();
        if (userAnswer.equals("да")){
            new TicTacToe().playLogic();
        }else {
            System.out.println("Спасибо за игру, До свидания!");
        }
    }
}
