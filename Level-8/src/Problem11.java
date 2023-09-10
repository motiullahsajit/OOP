public class Problem11 {
    import java.util.Scanner;

public class MaxMinDifferenceSubarray {
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
        int maxDiffStart = 0, maxDiffEnd = 0;
        int minDiffStart = 0, minDiffEnd = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(array[i] - array[j]);

                if (diff > maxDifference) {
                    maxDifference = diff;
                    maxDiffStart = i;
                    maxDiffEnd = j;
                }

                if (diff < minDifference) {
                    minDifference = diff;
                    minDiffStart = i;
                    minDiffEnd = j;
                }
            }
        }

        System.out.println("Subarray with maximum difference:");
        printSubarray(array, maxDiffStart, maxDiffEnd);

        System.out.println("Maximum difference: " + maxDifference);

        System.out.println("Subarray with minimum difference:");
        printSubarray(array, minDiffStart, minDiffEnd);

        System.out.println("Minimum difference: " + minDifference);

        scanner.close();
    }

    public static void printSubarray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

}
