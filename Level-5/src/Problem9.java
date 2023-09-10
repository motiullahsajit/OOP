import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        double attendancePercentage = (double) attendedClasses / totalClasses * 100.0;

        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");

        scanner.nextLine(); 

        System.out.print("Do you have a medical cause? (Y/N): ");
        char medicalCause = scanner.nextLine().charAt(0);

        if (medicalCause == 'Y' || medicalCause == 'y') {
            System.out.println("You are allowed to sit in the exam due to a medical cause.");
        } else if (attendancePercentage >= 75.0) {
            System.out.println("You are allowed to sit in the exam.");
        } else {
            System.out.println("You are not allowed to sit in the exam due to low attendance.");
        }

        scanner.close();
    }
}
