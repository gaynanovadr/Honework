package Les02;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        super("Problem in element [" + i + "]["+ j + "]");

    }

}
