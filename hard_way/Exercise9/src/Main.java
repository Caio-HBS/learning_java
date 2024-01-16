import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double m, kg, bmi;

        System.out.println("Your height (m):");
        m = keyboard.nextDouble();

        System.out.println("Your weight (kg):");
        kg = keyboard.nextDouble();

        bmi = kg / (m*m);

        System.out.println("Your Body Mass Index is: " + bmi);
    }
}