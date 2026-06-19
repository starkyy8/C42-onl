package Homework_6;

import java.util.Scanner;

public class CreditCard {
    int accountNumber;
    int currentAmount;

    public void depositingMoney (){
        System.out.println("Сколько денег вы хотите положить на карту - " + accountNumber + " ? ");
        int deposit = new Scanner(System.in).nextInt();
        currentAmount += deposit;
    }

    public void withdrawMoney(){
        System.out.println("Сколько денег вы хотите снять с карты - " + accountNumber + " ? ");
        int withdraw = new Scanner(System.in).nextInt();
        if(withdraw > currentAmount){
            System.out.println("Не достаточно средств!");
        }else currentAmount -= withdraw;

    }

    public String showInformation(){
        return "Account number: " + accountNumber
                + "\nCurrent amount: " + currentAmount;
    }


}
