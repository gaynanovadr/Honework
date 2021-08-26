package Lesson05.HW05;

public class Employer {

    String name; //fields
    String position;
    String email;
    int phone;
    int age;
    int salary;

    public Employer (String name, String position, String email, int phone, int age, int salary) { // constructor
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }
    void showInfo() {
        System.out.println(name + ", " + position + ", " + email + ", " + phone + ", " + age + ", " + salary);
    }

}
