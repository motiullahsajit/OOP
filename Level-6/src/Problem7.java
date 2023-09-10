import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int product = 1;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (or 'q' to quit): ");
            String input = scanner.next();

            if (input.equals("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                product *= number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        if (count == 0) {
            System.out.println("No valid numbers entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Average of entered numbers: " + average);
            System.out.println("Product of entered numbers: " + product);
        }

        scanner.close();
    }
}
