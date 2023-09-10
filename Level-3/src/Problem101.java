public class Problem101 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int temp;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping using a third variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
