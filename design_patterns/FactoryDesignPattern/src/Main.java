import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the factory object.
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        // Enemy ship object.
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of ship do you want? (U / R / B)");

        if (userInput.hasNextLine()) {

            String typeOfShip = userInput.nextLine().toUpperCase();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);

            if (theEnemy != null) {
                doStuffEnemy(theEnemy);
            } else {
                System.out.print("That wasn't one of the options I told you to use :(");
            }
        }
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
