public class Main {
    public static void main(String[] args) {
        System.out.println("Creating first instance in Main.");

        Singleton firstInstance = Singleton.getInstance();
        int firstInstanceHash = firstInstance.hashCode();
        System.out.println("\nFirst instance hash: " + firstInstanceHash);

        System.out.println("\nAttempting to create a second instance in Main.");

        Singleton secondInstance = Singleton.getInstance();
        int secondInstanceHash = secondInstance.hashCode();
        System.out.println("\nSecond instance hash: " + secondInstanceHash);

        if (firstInstance == secondInstance) {
            System.out.println("\nThe hash is the same. Singleton Pattern detected.");
        } else {
            System.out.println("\nThe hash is not the same. Singleton Pattern not working.");
        }
    }
}