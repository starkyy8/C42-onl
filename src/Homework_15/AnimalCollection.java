package Homework_15;

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<String> animals;

    public AnimalCollection(){
        animals = new LinkedList<>();
    }

    public void addAnimal(String name){
        animals.addFirst(name);
        System.out.println("Добавлено животное - " + name);
    }

    public void removeAnimal(){
        if(!animals.isEmpty()){
            String removed = animals.removeLast();
            System.out.println("Удалено животное - " + removed);
        }else {
            System.out.println("Коллекция пуста - нечего удалять");
        }
    }

    public void printAnimals(){
        System.out.println("Текущая коллекция - " + animals);
    }
}
