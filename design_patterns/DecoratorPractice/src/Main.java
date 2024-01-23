public class Main {
    public static void main(String[] args) {

        Cake sponge = new SpongeCake();

        System.out.println("---Before decorator---\n");

        System.out.println("Ingredients: " + sponge.getDescription());
        System.out.println("Total cost:" + sponge.getCost());

        Cake myCake = new RedVelvetCake(sponge);

        System.out.println("\n---After decorator---\n");

        System.out.println("Ingredients: " + myCake.getDescription());
        System.out.println("Total cost:" + myCake.getCost());
    }
}