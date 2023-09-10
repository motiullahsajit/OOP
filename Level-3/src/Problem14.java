import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int originalNumber = scanner.nextInt();
        scanner.close();

        if (originalNumber >= 1000 && originalNumber <= 9999) {
            int digit1 = (originalNumber / 1000 + 2) % 10;
            int digit2 = ((originalNumber / 100) % 10 + 2) % 10;
            int digit3 = ((originalNumber / 10) % 10 + 2) % 10;
            int digit4 = (originalNumber % 10 + 2) % 10;

            int resultNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;
            
            System.out.println("Original number: " + originalNumber);
            System.out.println("Displayed number: " + resultNumber);
        } else {
            System.out.println("Please enter a valid 4-digit number.");
        }
    }
}
