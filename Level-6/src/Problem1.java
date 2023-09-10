import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 10;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / count;

        System.out.println("Average value: " + average);

        scanner.close();
    }
}
