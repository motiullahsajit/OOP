public class Problem2c {
    public static void main(String args[]){
        int n = 4;

        for (int i = n; i > 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
        
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
        
            System.out.println();
        }
        
    }
}
