import java.util.Scanner;

public class Problem1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double max = findMax(num1, num2, num3);
        double min = findMin(num1, num2, num3);

        System.out.println("Maximum number among the three: " + max);
        System.out.println("Minimum number among the three: " + min);

        scanner.close();
    }

    public static double findMax(double a, double b, double c) {
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static double findMin(double a, double b, double c) {
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
