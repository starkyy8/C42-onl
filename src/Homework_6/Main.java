package Homework_6;

public class Main {

    public static void main(String[] args) {
        createCard();
    }

    public static void createCard(){
        CreditCard cardOne = new CreditCard();
        cardOne.accountNumber = 1;
        cardOne.currentAmount = 1000;

        CreditCard cardTwo = new CreditCard();
        cardTwo.accountNumber = 2;
        cardTwo.currentAmount = 500;

        CreditCard cardThree = new CreditCard();
        cardThree.accountNumber = 3;
        cardThree.currentAmount = 200;


        System.out.println(cardOne.showInformation());
        System.out.println(cardTwo.showInformation());
        System.out.println(cardThree.showInformation());

        cardOne.depositingMoney();
        System.out.println(cardOne.showInformation());
        cardTwo.depositingMoney();
        System.out.println(cardTwo.showInformation());
        cardThree.withdrawMoney();
        System.out.println(cardThree.showInformation());

    }
}
