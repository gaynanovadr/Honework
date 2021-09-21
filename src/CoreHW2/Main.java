package CoreHW2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        // String[][] myArr1 = new String[5][4]; //тест размера массива
        String[][] myArr2 = {
                {"6", "6", "3", "2"},
                {"3", "6", "4", "1"},
                {"2", "0", "y", "2"},
                {"7", "2", "1", "5"}
        };

        arrayExc(myArr2);
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
