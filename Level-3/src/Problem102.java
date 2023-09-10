public class Problem102 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter swapping without using a third variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
