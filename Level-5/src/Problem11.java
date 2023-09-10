import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The entered character is lowercase.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The entered character is uppercase.");
        } else {
            System.out.println("The entered character is not a letter.");
        }

        scanner.close();
    }
}
