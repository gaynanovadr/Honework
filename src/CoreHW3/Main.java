package CoreHW3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("*******Task1*********");
        String[] array = {"Ann", "Nika", "Diana", "Lena", "Kate"}; // задаем массив
        changePositionInArray(array, 1, 3);  //меняем местами элементы

        System.out.println("*******Task2*********");
        Box<Apple> appleBox = new Box<>(); // создаем коробку с яблоками
        appleBox.addFruit(new Apple()); // добавляем яблоки в коробку
        appleBox.addFruit(new Apple()); // добавляем яблоки в коробку
        appleBox.addFruit(new Apple()); // добавляем яблоки в коробку

        Box<Orange> orangeBox1 = new Box<>(); // создаем коробку 1 с апельсинами
        Box<Orange> orangeBox2 = new Box<>(); // создаем коробку 2 с апельсинами
        orangeBox1.addFruit(new Orange()); // добавляем апельсинки в коробку
        orangeBox1.addFruit(new Orange()); // добавляем апельсинки в коробку
        orangeBox2.addFruit(new Orange()); // добавляем апельсинки в коробку

        System.out.println(orangeBox1.getWeight()); // считаем вес коробки
        System.out.println(orangeBox1.compare(appleBox)); // сравниваем коробки

        orangeBox1.fillFromOneBoxToAnother(orangeBox2); // пересыпаем коробки
        System.out.println(orangeBox2.toString()); // проверка коробка пустая
        System.out.println(orangeBox1.toString()); // проверка в коробке +1 фрукт





    }

    public static void changePositionInArray(Object[] inputArr, int firstElement, int secondElement) {
        Object tempVar = inputArr[firstElement];
        inputArr[firstElement] = inputArr[secondElement];
        inputArr[secondElement] = tempVar;
        System.out.println(Arrays.toString(inputArr));
    }


}
