import java.util.HashMap;
import java.util.Map;

public class Uniquecharacters {

    public static void main(String[] args) {
     
        String inputString = "abcb";

       
        System.out.println("Unique characters in the string: " + getUniqueCharacters(inputString));
    }


    private static String getUniqueCharacters(String str) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (charFrequency.get(ch) == 1) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
