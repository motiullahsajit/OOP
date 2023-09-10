import java.util.Scanner;

public class Problem13 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 10000 && number <= 99999) {
            int firstDigit = number / 10000;  
            int secondLastDigit = (number / 10) % 10;  
            int sum = firstDigit + secondLastDigit;

            System.out.println("Sum of the first and second last digit: " + sum);
        } else {
            System.out.println("Please enter a valid 5-digit number.");
        }
    }
}
