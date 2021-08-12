package Lesson01;

public class HomeWorkApp {
    public static void main(String[] args) { // задание1 метод main()
        System.out.println("******* Задание 2 *******");
        printThreeWords();
        System.out.println("******* Задание 3 *******");
        checkSumSign(78,87);
        System.out.println("******* Задание 4 *******");
        printColor(565);
        System.out.println("******* Задание 5 *******");
        compareNumbers(9, 7);
    }
    public static void printThreeWords() { // задание2
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(int a, int b) { // задание3
        int sum = a + b;
        System.out.println((sum >= 0)? "Сумма положительная" : "Сумма отрицательная");
    }
    public static void printColor(int value) { // задание4
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) { //можно убрать 1е условие, оставила для логической операции
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b) { // задание5
        System.out.println((a >= b)? "a >= b" : "a < b");
    }
}

