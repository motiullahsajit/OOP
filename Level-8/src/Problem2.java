import java.util.Scanner;

public class Problem2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10]; 
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter a number to check: ");
        int numberToCheck = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] == numberToCheck) {
                found = true;
                break; 
            }
        }

        if (found) {
            System.out.println(numberToCheck + " is present in the array.");
        } else {
            System.out.println(numberToCheck + " is not present in the array.");
        }

        scanner.close();
    }
}
