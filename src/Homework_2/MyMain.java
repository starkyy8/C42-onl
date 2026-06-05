package Homework_2;

public class MyMain {

    public static void main (String []args) {

        calculateValue();
        getSum();
        getSumThreeNumbers();
        getInteger();
        getDivision();
        changeVariables();
    }
    public static void calculateValue(){
        int a;
        int b = 5;
        int c = 10;

        System.out.println("Результат вычисления формулы = " + (a = 4 * (b + c - 1) / 2));
    }
    public static void getSum(){
        int n = 26;
        int temp;
        int temp2;
        int sum;

        temp = n / 10;
        temp2 = n % 10;
        sum = temp + temp2;

        System.out.println("Сумма цифр в заданном числе n = " + sum);

    }
    public static void getSumThreeNumbers(){
        int n = 126;
        int temp;
        int temp2;
        int temp3;
        int sum;

        temp = n / 100;
        temp2 = (n / 10) % 10;
        temp3 = n % 10;
        sum = temp + temp2 +temp3;

        System.out.println("Сумма цифр в заданном числе n = " + sum);

    }

    public static void getInteger(){
        float n = 3.75f;
        int result;
        result = (int) (n + 0.5);
        System.out.println("Результат округления: " + result);
    }

    public static void getDivision(){
        int q = 21;
        int w = 8;

        System.out.println("Результат деления q и w = " + q / w + ". остаток = " + q % w);

    }
    public static void changeVariables(){
        int a = 1;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Result a: " + a);
        System.out.println("Result b: " + b);
    }

}


