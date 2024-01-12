import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner modeSelect = new Scanner(System.in);
    public static Scanner number = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("What mode would you like to try? ('random' or 'input')");
        String mode = modeSelect.nextLine();

        int myNumber = 0;

        if (Objects.equals(mode, "random")) {
            Random random = new Random();
            myNumber = random.nextInt(6);
        } else if (Objects.equals(mode, "input")) {
            System.out.println("What number do you choose?");
            myNumber = number.nextInt();
        }

        if (myNumber == 3) {
            System.out.println("The generated number was 3.");
        } else if (myNumber > 3) {
            System.out.println(myNumber + " is bigger than 3.");
        } else {
            System.out.println(myNumber + " is smaller than 3.");
        }
    }
}