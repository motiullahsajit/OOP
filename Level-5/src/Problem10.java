public class Problem10 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 0;

        boolean resultA = x == 2;
        boolean resultB = x != 5;
        boolean resultC = x != 5 && y >= 5;
        boolean resultD = z != 0 || x == 2;
        boolean resultE = !(y < 10);

        System.out.println("a. x == 2: " + resultA);
        System.out.println("b. x != 5: " + resultB);
        System.out.println("c. x != 5 && y >= 5: " + resultC);
        System.out.println("d. z != 0 || x == 2: " + resultD);
        System.out.println("e. !(y < 10): " + resultE);
    }
}
