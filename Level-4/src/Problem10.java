import java.util.Scanner;

public class Problem10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks for the first subject (out of 100): ");
        int subject1Marks = scanner.nextInt();

        System.out.print("Enter the marks for the second subject (out of 100): ");
        int subject2Marks = scanner.nextInt();

        System.out.print("Enter the marks for the third subject (out of 100): ");
        int subject3Marks = scanner.nextInt();

        int totalMarks = subject1Marks + subject2Marks + subject3Marks;

        double percentageMarks = (totalMarks / 300.0) * 100.0;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage Marks: " + percentageMarks + "%");

        scanner.close();
    }
}
