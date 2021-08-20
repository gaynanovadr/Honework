package Lesson03.HW03;

public class HW3 {

    public static void main(String[] args) {
        System.out.println("******* Задание 1 *******");
        int [] task1Arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0};
        int [] newArr = new int[task1Arr.length];
        for (int i = 0; i < newArr.length; i++) {
            if (task1Arr [i] == 1) {
                newArr[i] = 0;
            } else {
                newArr[i] = 1;
            }
        }
        printArray(task1Arr);
        printArray(newArr);

        System.out.println("******* Задание 2 *******");
        int [] task2Arr = new int[100];
        for (int i = 0; i < 100; i++) {
            task2Arr[i] = i+1;
        }
        printArray(task2Arr);

        System.out.println("******* Задание 3 *******");
        int [] task3Arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i< task3Arr.length; i++) {
            if (task3Arr[i] < 6) {
                task3Arr[i] *= 2;
            }
        }
        printArray(task3Arr);

        System.out.println("******* Задание 4 *******");
        arrayDiagonal(10,10);

        System.out.println("******* Задание 5 *******");
        printArray(initialArr(8, 55));

        System.out.println("******* Задание 6 *******");
        printArray(task3Arr);
        findMinMax(task3Arr);

        System.out.println("******* Задание 7 *******");
        int [] balancedArr = {1, 1, 1, 2, 1};
        int [] notbalancedArr = {1, 1, 1, 1, 1};
        System.out.println(checkBalance(balancedArr));
        System.out.println(checkBalance(notbalancedArr));
    }

    public static void printArray (int [] inputArray) { //print Array
        for (int i = 0; i< inputArray.length; i++) {
            System.out.print( inputArray[i] + " ");
        }
        System.out.println();
    }
    public static void arrayDiagonal (int h, int w) { // task4
        int [][] inputArr = new int [h][w];
        for (int i=0; i < inputArr.length; i++) {   // fill 2DArray
            for (int j=0; j < inputArr[i].length ; j++) {
                int k = (inputArr.length - 1) - j;
                if (i==j || i==k) {
                    inputArr [i][j] = 1;
                } else {
                    inputArr [i][j] = 0;
                }
            }
        }
        for (int i=0; i < inputArr.length; i++) {    // print 2DArray
            for (int j=0; j < inputArr[i].length ; j++) {
            System.out.print(inputArr[i][j] + "\t");
            }
            System.out.println();
        }
        }

    public static int[] initialArr (int len, int initialValue) { //task5
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void findMinMax (int [] inputArr) { // task6
        int min = inputArr[0];
        int max = inputArr[0];
        for (int i = 0; i < inputArr.length; i++) {
            if (min > inputArr[i]) {
                min = inputArr[i];
            } if (inputArr[i] > max) {
                max= inputArr[i];
            }
        }
        System.out.println( "min= " + min + " max= " + max);
    }
    public static boolean checkBalance(int [] inputArray) {  // task7
        int leftSum = 0;
        int totalSum = 0;
        for (int i=0; i< inputArray.length; i++) {
            totalSum += inputArray[i];
        }
        for (int i=0; i< inputArray.length; i++) {
            leftSum += inputArray[i];
            if (leftSum == (totalSum - leftSum)) {
                return true;
            }
        }
        return false;
    }
}
