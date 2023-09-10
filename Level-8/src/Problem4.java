import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] originalArray = new int[10]; 

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        int[] reversedArray = new int[10]; 

        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i]; 
        }

        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("Reversed Array:");
        printArray(reversedArray);

        scanner.close();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
