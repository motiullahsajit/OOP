import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");
        int nameLength = nameParts.length;

        StringBuilder abbreviatedName = new StringBuilder();

        for (int i = 0; i < nameLength - 1; i++) {
            String namePart = nameParts[i];
            abbreviatedName.append(namePart.charAt(0)).append(".");
        }

        abbreviatedName.append(nameParts[nameLength - 1]);

        System.out.println("Abbreviated name: " + abbreviatedName.toString());

        scanner.close();
    }
}
