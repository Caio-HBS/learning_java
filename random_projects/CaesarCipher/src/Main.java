import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cypher cypher = new Cypher();
        Scanner input = new Scanner(System.in);

        String desiredCypher;
        int cypherType, cypherNumber;

        System.out.println("What type of cypher do you wish to decrypt? ('Word' or 'Letter')");
        String[] validTypes = {"Word", "Letter"};
        if (!Arrays.stream(validTypes).toList().contains(input.next())) {
            System.out.println("\nERROR: Invalid type for cypher.\n");
            return;
        }

        if (Objects.equals(input.nextLine(), "Word")) {
            cypherType = 0;
        } else {
            cypherType = 1;
        }

        System.out.println("\nWhat is the cypher? (only letters)");
        desiredCypher = input.nextLine().toUpperCase();

        System.out.println("\nWhat number do you wish to use for the cypher?");
        cypherNumber = input.nextInt();

        System.out.println("\nYour encrypted string is: " + cypher.getDecrypted(desiredCypher, cypherType, cypherNumber));
    }
}