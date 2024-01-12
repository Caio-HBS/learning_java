import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Scanner name = new Scanner(System.in);
    public static Scanner age = new Scanner(System.in);
    public static Scanner again = new Scanner(System.in);
    public static Scanner func = new Scanner(System.in);
    public static Scanner numSelect1 = new Scanner(System.in);
    public static Scanner numSelect2 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Select a function to execute ('sayHello', 'getMax')");
        String funcSelector = func.nextLine();

        switch (funcSelector) {
            case "sayHello":
                while (true) {
                    System.out.println("\nWhat is your name?");
                    String nameVal = name.nextLine();

                    System.out.println("What is your age?");
                    int ageVal = age.nextInt();

                    sayHello(nameVal, ageVal);


                    System.out.println("\nWanna try it a second time? ('yes' or 'no')");
                    String anotherTime = again.nextLine();

                    if (Objects.equals(anotherTime, "no")) {
                        System.out.println("\nOk, bye!");
                        break;
                    }
                }
                break;
            case "getMax":
                System.out.println("Type the first number.");
                int num1 = numSelect1.nextInt();
                System.out.println("Type the second number.");
                int num2 = numSelect2.nextInt();

                int resValue = getMax(num1, num2);
                if (resValue != 0) {
                    System.out.println("The bigger number is: " + resValue);
                } else {
                    System.out.println("The numbers are equal.");
                }
                break;
        }
    }

    public static void sayHello(String name, int age) {
        String ageResult = age >= 18 ? "\nYou can vote" : "\nYou are " + (18 - age) + " away from being able to vote :)";
        System.out.println("\nHello, " + name + "!" + ageResult);
    }

    public static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        } else {
            return 0;
        }
    }
}