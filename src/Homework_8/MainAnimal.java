package Homework_8;

public class MainAnimal {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        rabbit.voice();
        dog.voice();
        tiger.voice();

        rabbit.eat("meat");
        rabbit.eat("Grass");

        dog.eat("Meat");
        dog.eat("Grass");

        tiger.eat("Meat");
        tiger.eat("Grass");
    }

}
