public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        System.out.println("---Normal operations---");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));
        System.out.println("Complex expression: " + (num1 + (num2 * 4)));

        int autoIncrease = 4;
        System.out.println("\n---Auto incrementation---");
        autoIncrease += 1;
        System.out.println("Addition: " + autoIncrease);
        autoIncrease -= 1;
        System.out.println("Subtraction: " + autoIncrease);
        autoIncrease *= 2;
        System.out.println("Multiplication: " + autoIncrease);
        autoIncrease /= 2;
        System.out.println("Division " + autoIncrease);
        autoIncrease %= 1;
        System.out.println("Remainder: " + autoIncrease);

        // Prefix and Postfix incrementation:
        // ++myNumber -> Increments by one BEFORE returning the value;
        // myNumber++ -> Increments by one AFTER returning the value.
    }
}