package Homework_19;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Person> list = createPerson();
        createMainMenu(userInput, list);
        //filterByName(list);
        //filterBySurname(list);
        //sortBySurname(list);
        //getPostAddress(list);
    }
    public static List<Person> createPerson(){
        List<Person> people = List.of(
                new Person("Ivan", "Ivanov", "Minsk, Sovetskaya str. 12",
                        "+375255112550", "250360"),
                new Person("Petr", "Petrov", "Minsk, Sovetskaya str. 165",
                "+375257801230", "250340"),
                new Person("Olga", "Potapova", "Minsk, Niamiha str. 10",
                        "+375293151746", "240360"),
                new Person("Mihail", "Osinskiy", "Minsk, Victors avn. 133",
                "+375333400119", "245555"),
                new Person("Ivan", "Abramov", "Minsk, Sovetskaya str. 18", "+375255466541",
                        "246654"));
        return people;
    }

    public static void createMainMenu(Scanner userInput, List<Person> list){
        boolean running = true;
        while (running){
            System.out.println("""
                
                Для операций с телефонной книгой нажмите:
                0 - Выход из программы
                1 - Вывод телефонной книги
                2 - Фильтр по Имени
                3 - Фильтр по Фамилии
                4 - Сортировка по Фамилии
                5 - Получить данные о почтовых адресах
                6 - Проверить данные по почтовым адресам(правда я не понял что нужно сделать)""");

            while (!userInput.hasNextInt()) {
                System.out.println("Ошибка ввода: введите число!");
                userInput.next();
            }
            int answer = userInput.nextInt();
            userInput.nextLine();
                switch (answer) {
                    case 1 -> showTelephoneBook(list);
                    case 2 ->  filterByName(userInput, list);
                    case 3 -> filterBySurname(list, userInput);
                    case 4 -> sortBySurname(list);
                    case 5 -> getPostAddress(list);
                    case 6 -> checkPostAddress(list);
                    case 0 -> {
                        System.out.println("Выход из программы");
                        running = false;
                    }
                    default -> System.out.println("Неверный пункт. Попробуйте снова");
                }
        }
    }

    public static void showTelephoneBook(List<Person> list){
        System.out.println(list);
    }

    public static void filterByName(Scanner userInput, List<Person> list){
        System.out.println("Введите имя для поиска: ");
        String name = userInput.next();
        list.stream()
            .filter(person -> person.getName().equalsIgnoreCase(name))
            .forEach(System.out::println);
    }
    public static void filterBySurname(List<Person> list, Scanner userInput){
        System.out.println("Введите фамилию для поиска: ");
        String surname = userInput.next();
        list.stream()
            .filter(person -> person.getSurname().equalsIgnoreCase(surname))
            .forEach(System.out::println);
    }
    public static void sortBySurname(List<Person> list){
        list.stream()
            .sorted(Comparator.comparing(Person::getSurname))
            .forEach(System.out::println);
    }
    public static void getPostAddress(List<Person> list){
        list.stream()
                .map(p -> p.getName() +" "+ p.getSurname() + " - " + p.getPostAddress())
                .forEach(System.out::println);
    }
    public static void checkPostAddress(List<Person> list){
        System.out.println("Что-то тут должно быть!");
    }
}
