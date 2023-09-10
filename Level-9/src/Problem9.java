public class Problem9 {
    public static void main(String[] args) {
        String input = "Hello, have a good day";
        String result = removeConsonants(input);

        System.out.println("Original string: " + input);
        System.out.println("String after removing consonants: " + result);
    }

    public static String removeConsonants(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (isVowel(ch) || Character.isWhitespace(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
