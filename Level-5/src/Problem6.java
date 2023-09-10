import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age of person 1: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter the age of person 2: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter the age of person 3: ");
        int age3 = scanner.nextInt();

        int oldest = Math.max(age1, Math.max(age2, age3));
        int youngest = Math.min(age1, Math.min(age2, age3));

        System.out.println("Oldest person's age: " + oldest);
        System.out.println("Youngest person's age: " + youngest);

        scanner.close();
    }
}
