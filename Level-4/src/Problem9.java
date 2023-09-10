import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of 'b': ");
        int b = scanner.nextInt();

        boolean condition1 = a < 50;
        boolean condition2 = a < b;

        if (condition1 && condition2) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }

        scanner.close();
    }
}
