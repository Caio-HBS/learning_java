import java.util.Arrays;
import java.util.List;

public class Cypher {

    private final List<String> capAlphabet = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    private final List<String> stdAlphabet = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

    /**
     * Returns the capitalized alphabet.
     * @return capitalized alphabet.
     */
    public List<String> getCapAlphabet() {
        return capAlphabet;
    }

    /**
     * Returns the non-capitalized alphabet.
     * @return non-capitalized alphabet.
     */
    public List<String> getStdAlphabet() {
        return stdAlphabet;
    }

    /**
     * Returns the encrypted/decrypted string based on the Caesar Cypher method.
     * @param cypher a String with the letters to be capitalized. Can have numbers, punctuation, whitespaces etc...
     * @param cypherNum the number used to encrypt/decrypt the original String
     * @return the encrypted/decrypted String based on the chosen number.
     */
    public String getDecrypted(String cypher, int cypherNum) {
        List<String> alphabet;
        StringBuilder decrypted = new StringBuilder();

        for (char letter : cypher.toCharArray()) {
            String strLetter = String.valueOf(letter);

            if (Character.isUpperCase(letter)) {
                alphabet = getCapAlphabet();
            } else {
                alphabet = getStdAlphabet();
            }

            if (!alphabet.contains(strLetter)) {
                decrypted.append(strLetter);
                continue;
            }

            int foundIndex = alphabet.indexOf(strLetter);

            int computedIndex = getComputedIndex(cypherNum, foundIndex);

            decrypted.append(alphabet.get(computedIndex));
        }
        return decrypted.toString();
    }


    /**
     * Receives the number for encrypting/decrypting the desired letter on a Caesar cypher and the index for that letter
     * on the alphabet. Returns the final index for encrypted/decrypted letter after cyphering the original desired letter
     * @param cypherNum an integer used to create the cypher
     * @param foundIndex the corresponding index of the desired letter in the alphabet
     * @return the resulting index for encrypting/decrypting the desired letter
     */
    private static int getComputedIndex(int cypherNum, int foundIndex) {
        int computedIndex = foundIndex + cypherNum;

        if (computedIndex < 0) {
            if (computedIndex < -26) {
                computedIndex = (computedIndex % 26) + 26;
            } else {
                computedIndex += 26;
            }
        }
        if (computedIndex > 25) {
            if (computedIndex > 26) {
                computedIndex = (computedIndex % 26);
            } else {
                computedIndex -= 26;
            }
        }
        return computedIndex;
    }
}
