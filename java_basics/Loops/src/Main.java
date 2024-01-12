import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Scanner responseSelector = new Scanner(System.in);

    public static void main(String[] args) {

        // For Loop. Same construction as C.
        for (int i = 0; i <= 100; i++) {
            if (i == 50) {
                System.out.println("---FOR LOOP---");
                System.out.println("Reached the middle of the 'For Loop'.\n");
                break; // As opposed to "continue", which just skips a defined part of the loop, "break" just stops the
                       // loop.
            }
        }

        // While Loop. Also has the same construction as C.
        while (true) {
            System.out.println("---WHILE LOOP---");
            System.out.println("What is the best band of all time?");
            String response = responseSelector.nextLine();
            if (!Objects.equals(response.toLowerCase(), "muse")) {
                System.out.println("Wrong response...\n");
            } else {
                System.out.println("Congratulations, you have good taste!\n");
                break;
            }
        }

        // Do While Loop. Very similar to the "While Loop", except it is guaranteed to execute AT LEAST once.
        System.out.println("---DO WHILE LOOP---");
        int num = 0;
        do {
            System.out.println("Execute this until JS becomes a good programming language.");
            if (num == 3) {
                System.out.println("Just kidding, we don't wanna be here forever.");
            }
            num++;
        } while (num <= 3);
    }
}