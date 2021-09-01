package Lesson06.HW6;

public class Cat extends Animal {
    static int countCat = 0;

    public Cat (String name, int age, int runLimit) {
        super(name, age, runLimit);
        countCat ++;
    }

    @Override
    String swim (int obstaclesLength) {
        return "Cats cant swim!";
    }

}
