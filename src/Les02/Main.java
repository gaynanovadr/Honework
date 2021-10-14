package Les02;

public class Main {
    public static void main(String[] args) {
        String[][] myArr2 = {
                {"6", "6", "3", "5"},
                {"3", "6", "4", "1"},
                {"2", "0", "z", "2"},
                {"7", "2", "1", "5"}
        };

        try {
            arrayExc(myArr2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println("test");
    }

    public static void arrayExc(String[][] inputArray) throws MyArraySizeException, MyArrayDataException {

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray.length != 4 || inputArray[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int totalSum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                try {
                    totalSum += Integer.parseInt(inputArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println(totalSum);
    }
}
