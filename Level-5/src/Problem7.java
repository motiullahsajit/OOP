import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double absoluteValue = Math.abs(number);

        System.out.println("Absolute value: " + absoluteValue);

        scanner.close();
    }
}
