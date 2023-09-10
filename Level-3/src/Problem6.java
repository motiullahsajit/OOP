public class Problem6 {
    public static void main(String[] args) {
        int base = 7;
        int exponent = 5;

        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("7 raised to the power of 5 is: " + result);
    }
}
