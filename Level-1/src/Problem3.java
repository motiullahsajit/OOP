public class Problem3 {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
