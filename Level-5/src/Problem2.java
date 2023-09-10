import java.util.Scanner;

public class Problem2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int greatest = (num1 > num2) ? num1 : num2;

        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}
