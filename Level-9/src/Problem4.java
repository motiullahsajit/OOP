public class Problem4 {
    public static void main(String[] args) {
        String word = "Umbrella";
        char targetLetter = 'e';
        boolean isPresent = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == targetLetter) {
                isPresent = true;
                break; 
            }
        }

        if (isPresent) {
            System.out.println("The letter 'e' is present in the word 'Umbrella'.");
        } else {
            System.out.println("The letter 'e' is not present in the word 'Umbrella'.");
        }
    }
}
