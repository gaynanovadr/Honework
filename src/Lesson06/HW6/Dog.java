package Lesson06.HW6;


public class Dog extends Animal {
    private int swimLimit = 10;
    static int countDog = 0;

    public Dog (String name, int age, int runLimit) {
        super(name, age, runLimit);
        countDog ++;

    }
    @Override
    String swim (int obstaclesLength) {
        if (obstaclesLength > swimLimit) {
            return (name + " cant swim more than " + swimLimit + " meters. ");
        } else {
            return (name + " swims " + obstaclesLength + " meters.");
        }
    }

}
