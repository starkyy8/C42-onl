package Homework_8;

public class Dog extends Animal{
    public void voice(){
        System.out.println("Woof");
    }

    public void eat(String food){
        if("Meat".equalsIgnoreCase(food)){
            System.out.println("Собака любит - " + food);
        }else {
            System.out.println("Собака не любит - " + food);
        }
    }
}
