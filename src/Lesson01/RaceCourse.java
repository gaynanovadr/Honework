package Lesson01;

public class RaceCourse implements Obstacles {
    private int length;

    public RaceCourse(int length) {
        this.length = length;
    }

    @Override
    public void doObstacles(CanCompite competitor) {
        competitor.run(length);
    }
}
