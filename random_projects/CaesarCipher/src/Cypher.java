import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Cypher {

    private List<String> alphabet = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    public List<String> getAlphabet() {
        return alphabet;
    }

    public String getDecrypted(String cypher, int type, int cypherNum) {
        List<String> alphabet = getAlphabet();

        return switch (type) {
            // Single letter.
            case 0 -> {
                if (!alphabet.contains(cypher)) {
                    System.out.println("\nERROR: letter not present in alphabet\n");
                    yield null;
                }

                int foundIndex = alphabet.indexOf(cypher);
                yield alphabet.get(foundIndex + cypherNum);
            }
            // Single word.
            case 1 -> {
                String decryptedWord = "";
                for (char letter : cypher.toCharArray()) {
                    String strLetter = String.valueOf(letter);
                    if (!alphabet.contains(strLetter)) {
                        System.out.println("\nERROR: letter not present in alphabet\n");
                        yield null;
                    }
                    int foundIndex = alphabet.indexOf(strLetter);

                    decryptedWord += alphabet.get(foundIndex + cypherNum);
                }
                yield decryptedWord;
            }
            // Invalid.
            default -> {
                System.out.println("\nERROR: invalid type\n");
                yield null;
            }
        };
    }
}
