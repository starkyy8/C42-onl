package Homework_8;

public class Tiger extends Animal{
    public void voice(){
        System.out.println("Roar");
    }

    public void eat(String food){
        if("Meat".equalsIgnoreCase(food)){
            System.out.println("Тигр любит - " + food);
        }else {
            System.out.println("Тигр не любит - " + food);
        }
    }
}
