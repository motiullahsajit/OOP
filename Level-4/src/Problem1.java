import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
