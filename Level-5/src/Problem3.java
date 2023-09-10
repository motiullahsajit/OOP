import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of units purchased: ");
        int quantity = scanner.nextInt();

        int unitCost = 100;
        int totalCost = quantity * unitCost;

        if (totalCost > 1000) {
            double discount = 0.10 * totalCost;
            totalCost -= discount;
        }

        System.out.println("Total cost for the user: " + totalCost);

        scanner.close();
    }
}
