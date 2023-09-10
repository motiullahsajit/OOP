import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double product = calculateProduct(num1, num2);

        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        scanner.close();
    }

    public static double calculateProduct(double a, double b) {
        return a * b;
    }
}
