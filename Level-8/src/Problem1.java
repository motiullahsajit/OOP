import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Entered numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        scanner.close();
    }
}
