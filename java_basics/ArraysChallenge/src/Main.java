// Challenge: Create a function which receives an array of numbers as a parameter and returns the biggest number from the
// array.

public class Main {
    public static void main(String[] args) {
        int[] defaultNumbers = {0, 2, 5, 10};
        int[] negativeNumbers = {-4, -1, -8, -26};
        int[] equalNumbers = {1, 1, 1, 1};
        int[] empty = {};

        System.out.println("Default array: " + getMax(defaultNumbers) + "\nExpected: 10");
        System.out.println("\n\nNegative numbers array: " + getMax(negativeNumbers) + "\nExpected: -1");
        System.out.println("\n\nEqual numbers array: " + getMax(equalNumbers) + "\nExpected: 1");
        System.out.println("\n\nEmpty array: " + getMax(empty) + "\nExpected: -1");
    }

    public static int getMax(int[] numbersArray) {
        int maxNum;
        if (numbersArray.length > 0) {
            maxNum = numbersArray[0];
        } else {
            return -1;
        }

        for (int number : numbersArray) {
            if (number > maxNum) {
                maxNum = number;
            }
        }
        return maxNum;
    }
}