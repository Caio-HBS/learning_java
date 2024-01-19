public class Singleton {

    private static Singleton firstInstance = null;

    private Singleton() {
        System.out.println("SYSTEM: Created instance.");
    }

    public static Singleton getInstance() {
        if (firstInstance == null) {
            firstInstance = new Singleton();
        }
        return firstInstance;
    }
}
