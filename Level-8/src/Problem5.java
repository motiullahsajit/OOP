import java.util.Scanner;

public class Problem5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = calculateSum(array);
        long product = calculateProduct(array);

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

        scanner.close();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static long calculateProduct(int[] arr) {
        long product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }
}
