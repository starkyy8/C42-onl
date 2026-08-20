package Homework_19;

public class Person {
    private final String name;
    private final String surname;
    private final String address;
    private final String phoneNumber;
    private final String postAddress;

    public Person(String name, String surname, String address, String phoneNumber, String postAddress) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.postAddress = postAddress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPostAddress() {
        return postAddress;
    }

    @Override
    public String toString() {
        return "\n" + "-".repeat(50)+ "\n" + this.name + " " + this.surname + "\nAddress: "
                + this.address + "\nPhone number: " + this.phoneNumber + "\nPost address: "
                + this.postAddress ;
    }
}
