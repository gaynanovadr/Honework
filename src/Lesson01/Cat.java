package Lesson01;

public class Cat implements CanCompite{
    private  int maxJumpHeight;
    private  int maxRunLength;

    public Cat(int maxJumpHeight, int maxRunLength) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public void jump(int height) {
        if (maxJumpHeight >= height) {
            System.out.println("Cat can jump");
        } else {
            System.out.println("Cat cant jump");
        }
    }

    @Override
    public void run(int length) {
        if (maxRunLength >= length) {
            System.out.println("Cat can run");
        } else {
            System.out.println("Cat cant run");
        }
    }
}
