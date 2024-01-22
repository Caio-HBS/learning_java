import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cypher cypher = new Cypher();
        Scanner input = new Scanner(System.in);

        String desiredCypher;
        int cypherNumber;


        System.out.println("\nWhat is the cypher?");
        desiredCypher = input.nextLine();

        System.out.println("\nWhat number do you wish to use for the cypher? You can also use negative numbers.");
        cypherNumber = input.nextInt();

        System.out.println("\nYour encrypted string is: \n\n" + cypher.getDecrypted(desiredCypher, cypherNumber));
    }
}