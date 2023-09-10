import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of alphabets: ");
        String input = scanner.nextLine().toLowerCase();

        int[] frequency = new int[26]; 

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                frequency[index]++;
            }
        }

        int maxFrequency = 0;
        char maxAlphabet = ' ';

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = ch - 'a';
            if (frequency[index] > maxFrequency) {
                maxFrequency = frequency[index];
                maxAlphabet = ch;
            }
        }

        System.out.println("Alphabet frequencies:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = ch - 'a';
            if (frequency[index] > 0) {
                System.out.println(ch + ": " + frequency[index]);
            }
        }

        System.out.println("Alphabet with maximum occurrence: " + maxAlphabet + " (" + maxFrequency + " times)");

        scanner.close();
    }
}
