package Homework_10;

public class MyMain {
    public static void main(String[] args) {
        createUser();
    }

    public static void createUser(){
        User user1 = new User(1, "Ivan", "ivan@gmail.com");
        User user2 = new User(1,"Ivan", "ivan@gmail.com");
        User user3 = new User(2, "Alex", "alex@gmail.com");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println("-".repeat(60));
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
        System.out.println("-".repeat(60));
        System.out.println("hashCode User 1 - " + user1.hashCode());
        System.out.println("hashCode User 2 - " + user2.hashCode());
        System.out.println("hashCode User 3 - " + user3.hashCode());
    }
}
