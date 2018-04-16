package model;

public class Contact {

    private String name;
    private String surname;
    private int age;
    private String phoneNumber;

    public Contact(String name, String surname, int age, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Surname: " + surname + "; Age: " + age +"; PhoneNumber: " + phoneNumber +  ";";
    }
}
