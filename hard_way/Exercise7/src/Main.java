import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What country are you from?");
        keyboard.next();

        System.out.println("What is 5 times 9?");
        keyboard.nextInt();

        System.out.println("Enter a number between 0.0 and 1.1");
        keyboard.nextDouble();
    }
}