package Lesson06.HW6;

public class Animal {
    protected String name;
    protected int age;
    protected int runLimit;
    static int countAnimals = 0;

    public Animal(String name, int age, int runLimit) {
        this.name = name;
        this.age = age;
        this.runLimit = runLimit;
        countAnimals ++;
    }

    String run (int obstaclesLength) {
        if (obstaclesLength > runLimit) {
            return name + " cant run more than " + runLimit + " meters. " ;
        } else {
            return name + " runs " + obstaclesLength + " meters.";
        }
    }
    String swim (int obstaclesLength) {
            return (name + " swims " + obstaclesLength + " meters.");
    }
}
