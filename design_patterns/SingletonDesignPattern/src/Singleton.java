import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
    private static Singleton firstInstance = null;

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d", "e",
            "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i", "i", "i", "i",
            "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o", "o",
            "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s", "t", "t", "t", "t",
            "t", "t", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    // Used to slow down 1st thread.
    static boolean firstThread = true;

    // Created to keep users from instantiation. Only Singleton will be able to instantiate this class.
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (firstInstance == null) {
            if (firstThread) {
                firstThread = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Here we just use synchronized when the first object is created.
            synchronized (Singleton.class) {
                if (firstInstance == null) {
                    // If the instance isn't needed it isn't created. This is known as lazy instantiation.
                    firstInstance = new Singleton();

                    // Shuffle the letters in the list.
                    Collections.shuffle(firstInstance.letterList);
                }
            }
        }
        // Under either circumstance this returns the instance.
        return firstInstance;
    }

    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;
    }

    public LinkedList<String> getTiles(int howManyTiles) {
        // Tiles to be returned to the user.
        LinkedList<String> tilesToSend = new LinkedList<String>();

        // Cycle through the LinkedList while adding the starting Strings to the to be returned LinkedList while deleting
        // them from letterList.
        for (int i = 0; i <= howManyTiles; i++) {
            tilesToSend.add(firstInstance.letterList.remove(0));
        }

        // Return the number of letter tiles requested.
        return tilesToSend;
    }
}