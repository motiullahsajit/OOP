import java.util.Scanner;

public class Problem10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("At least two elements are required for comparisons.");
            return;
        }

        int[] array = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int maxDifference = Integer.MIN_VALUE;
        int minDifference = Integer.MAX_VALUE;
        int maxDiffPair1 = 0, maxDiffPair2 = 0;
        int minDiffPair1 = 0, minDiffPair2 = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(array[i] - array[j]);

                if (diff > maxDifference) {
                    maxDifference = diff;
                    maxDiffPair1 = array[i];
                    maxDiffPair2 = array[j];
                }

                if (diff < minDifference) {
                    minDifference = diff;
                    minDiffPair1 = array[i];
                    minDiffPair2 = array[j];
                }
            }
        }

        System.out.println("Pair with maximum difference: " + maxDiffPair1 + " and " + maxDiffPair2);
        System.out.println("Maximum difference: " + maxDifference);
        System.out.println("Pair with minimum difference: " + minDiffPair1 + " and " + minDiffPair2);
        System.out.println("Minimum difference: " + minDifference);

        scanner.close();
    }
}
