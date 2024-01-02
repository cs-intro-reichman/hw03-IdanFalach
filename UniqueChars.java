/**
 * String processing exercise 2.
 */
public class UniqueChars {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(uniqueChars("a quick brown fox"));
    }

    /**
     * Returns a string which is identical to the original string,
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String uniqueCharsString = "";

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (uniqueCharsString.indexOf(character) == -1 || character == ' ') {
                uniqueCharsString += character;
            }
        }

        return uniqueCharsString;
    }
}
