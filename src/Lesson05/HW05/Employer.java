package Lesson05.HW05;

public class Employer {

    private String name; //fields
    private String position;
    private String email;
    private int phone;
    private int age;
    private int salary;

    public Employer (String name, String position, String email, int phone, int age, int salary) { // constructor
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }
    public int getAge () {
        return this.age;
    }
    public String getEmail () {
        return this.email;
    }
    public int getSalary () {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void showInfo() {
        System.out.println(name + ", " + position + ", " + email + ", " + phone + ", " + age + ", " + salary);
    }

}
