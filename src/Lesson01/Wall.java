package Lesson01;

public class Wall implements Obstacles{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doObstacles(CanCompite competitor) {
        competitor.jump(height);
    }
}
