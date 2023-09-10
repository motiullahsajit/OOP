import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        boolean allEqual = num1 == num2 && num2 == num3;
        boolean anyTwoEqual = num1 == num2 || num1 == num3 || num2 == num3;

        if (allEqual) {
            System.out.println("All three numbers are equal.");
        } else if (anyTwoEqual) {
            System.out.println("Any two of the three numbers are equal.");
        } else {
            System.out.println("None of the numbers are equal.");
        }

        scanner.close();
    }
}
