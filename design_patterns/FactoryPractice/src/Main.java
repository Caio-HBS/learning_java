import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        YamahaFactory factory = new YamahaFactory();

        YamahaProduct newProd;

        Scanner selector = new Scanner(System.in);
        System.out.println("What product would you like to know about? ('Car', 'Jetski' or 'Keyboard')");

        if (selector.hasNext()) {
            String selectedProd = selector.nextLine().toLowerCase();
            newProd = factory.makeNewProduct(selectedProd);

            if (newProd != null) {
                testProd(newProd);
            } else {
                System.out.println("Sorry, something went wrong while creating the product :(");
            }
        }
    }

    public static void testProd(YamahaProduct prod) {
        prod.useProduct();
    }
}