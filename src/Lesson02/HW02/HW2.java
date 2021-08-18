package Lesson02.HW02;

public class HW2 {
    public static void main(String[] args) {
        System.out.println("******* Задание 1 *******");
        if (checkSum(5, 89)) {
            System.out.println("Sum between 10-20");
        } else {
            System.out.println("Sum is not between 10-20");
        }
        System.out.println("******* Задание 2*******");
        if (checkNumber(0)) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        System.out.println("******* Задание 3 *******");
        if (checkNumberNeg(-7)) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }

        System.out.println("******* Задание 4 *******");
        printSmth(3, "hello");

        System.out.println("******* Задание 5 *******");
        if (checkYear(2020)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Normal Year");
        }
    }
    public static boolean checkSum(int a, int b) { //task1
        return (a + b) >= 10 && (a + b) <= 20;
    }
    public static boolean checkNumber(int a) { //task2 return pos
        return a >= 0;
    }
    public static boolean checkNumberNeg(int a) { //task3 return neg
        return a < 0;
    }
    public static void printSmth(int n, String something) { //task4
        for (int i = 0; i < n; i++)
            System.out.println(something);
    }
    public static boolean checkYear(int year) { //task5
        return (year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0;
    }
}

