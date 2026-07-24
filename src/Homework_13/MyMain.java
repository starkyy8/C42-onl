package Homework_13;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args){
        checkLoginAndPassword();
    }
    public static void checkLoginAndPassword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = input.nextLine();
        System.out.println("Введите пароль");
        String password = input.nextLine();
        System.out.println("Повторите пароль");
        String confirmPassword = input.nextLine();

        try {
            boolean result = LoginValidator.validate(login, password, confirmPassword);
            System.out.println("Результат: " + result);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка логина: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка пароля: " + e.getMessage());
        }
    }
}
