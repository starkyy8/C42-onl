package Homework_8;

public class Rabbit extends Animal{
    @Override
    public void voice(){
        System.out.println("Squeak");
    }
    @Override
    public void eat(String food){
        if ("Grass".equalsIgnoreCase(food)){
            System.out.println("Кролик любит - " + food);
        }else {
            System.out.println("Кролик не доволен, он не ест - " + food);
        }
    }
}
