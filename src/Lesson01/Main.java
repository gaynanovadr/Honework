package Lesson01;

public class Main {
    public static void main(String[] args) {
        CanCompite [] competitors = {new Human(4,8),
                new Cat(5, 10), new Robot(8, 15)}; //массив участников
        Obstacles [] obstacles = {new Wall(5), new RaceCourse(10)}; // полоса препятствий

        for (Obstacles obst : obstacles) {
            for (CanCompite comp : competitors) {
                obst.doObstacles(comp);
            }
        }

    }

}
