public class Problem3 {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 50;
        int num3 = 29;

        System.out.println("Multiplication Table of " + num1 + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
        }

        System.out.println("\nMultiplication Table of " + num2 + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num2 + " x " + i + " = " + (num2 * i));
        }

        System.out.println("\nMultiplication Table of " + num3 + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num3 + " x " + i + " = " + (num3 * i));
        }
    }
}
