package Lesson01;

public class Human implements CanCompite {
    private final int maxJumpHeight;
    private final int maxRunLength;
    private boolean check = true;

    public Human(int maxJumpHeight, int maxRunLength) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public void jump(int height) {
        if (maxJumpHeight >= height && check) {
            System.out.println("Human can jump");
        } else {
            System.out.println("Human cant jump");
            check = false;
        }
    }

    @Override
    public void run(int length) {
        if (maxRunLength >= length && check) {
            System.out.println("Human can run");
        } else {
            System.out.println("Human cant run");
            check = false;
        }
    }
}
