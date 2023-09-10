import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = calculateSum(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }

    public static double calculateSum(double a, double b) {
        return a + b;
    }
}
