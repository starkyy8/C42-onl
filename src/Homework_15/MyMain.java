package Homework_15;

import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        addStudent();
    }

    public static void removeRepeatingNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String[] input = scanner.nextLine().split("\\s");
        Set<Integer> noReapeatingSet = new HashSet<>();

        for (String part : input){
            if(!part.trim().isEmpty()){
                noReapeatingSet.add(Integer.parseInt(part.trim()));
            }
        }
        System.out.println(noReapeatingSet);

    }
    public static void collectAnimals(){
        AnimalCollection animalCollection = new AnimalCollection();
        animalCollection.addAnimal("Собака");
        animalCollection.addAnimal("Кот");
        animalCollection.addAnimal("Волк");
        animalCollection.addAnimal("Бык");
        animalCollection.printAnimals();
        System.out.println("*".repeat(50));
        animalCollection.removeAnimal();
        animalCollection.removeAnimal();
        animalCollection.printAnimals();
    }
    public static void addStudent(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иванов Иван", "Группа А", 1, List.of(2,3,5,4)));
        students.add(new Student("Петров Петр", "Группа Б", 2, List.of(3,3,4,5)));
        students.add(new Student("Соломкина Дарья", "Группа А", 1, List.of(4,3,5,4)));
        students.add(new Student("Процко Артем", "Группа А", 1, List.of(1,2,2,3)));

        System.out.println("Список студентов до проверки среднего балла: ");
        for (Student s : students){
            System.out.println(s);
        }

        StudentManager.processStudent(students);

        System.out.println("Список студентов после проверки среднего балла: ");
        for (Student s : students){
            System.out.println(s);
        }
        StudentManager.printStudent(students, 1);
        System.out.println();
        StudentManager.printStudent(students,2);
        System.out.println();
        StudentManager.printStudent(students, 3);

    }
}
