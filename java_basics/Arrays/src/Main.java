import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Declaring is a bit different from Python and JS.
        int[] numbers = {12, 15, 16, 100, 200, 20, 50};
        // Also, you can't add new numbers to this type of array, it is fixed size once created.


        // No differences, indexes start at 0.
        System.out.println("---GETTING ARRAY ITEM BY INDEX---");
        System.out.println(numbers[0]);

        // Declare the type of the iterable.
        System.out.println("\n---LOOPING THROUGH ARRAY---");
        for (int number : numbers) {
            System.out.println(number);
        }

        // No differences in getting length either.
        System.out.println("\n---LOOPING THROUGH ARRAY USING ITS LENGTH (CLASSIC LOOP)---");
        for (int i = 0; i <= (numbers.length - 1); i++) {
            System.out.println(numbers[i]);
        }


        // No differences for string arrays.
        String[] names = {"João", "Maria", "Eduardo", "Mônica", "Caio"};

        System.out.println("\n\n---OPTIMIZED LOOP FOR STRINGS---");
        for (String name : names) {
            System.out.println(name);
        }

        // Creating a defined size array, doesn't allow for more than the defined size of elements.
        int[] definedNumbersArray = new int[5];
        definedNumbersArray[0] = 1;
        definedNumbersArray[1] = 5;
        definedNumbersArray[2] = 7;
        definedNumbersArray[3] = 10;
        definedNumbersArray[4] = 24;

        System.out.println(Arrays.toString(definedNumbersArray));
    }
}