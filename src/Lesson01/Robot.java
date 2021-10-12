package Lesson01;

public class Robot implements CanCompite{
    private  int maxJumpHeight;
    private  int maxRunLength;

    public Robot(int maxJumpHeight, int maxRunLength) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public void jump(int height) {
        if (maxJumpHeight >= height) {
            System.out.println("Robot can jump");
        } else {
            System.out.println("Robot cant jump");
        }
    }

    @Override
    public void run(int length) {
        if (maxRunLength >= length) {
            System.out.println("Robot can run");
        } else {
            System.out.println("Robot cant run");
        }
    }
}
