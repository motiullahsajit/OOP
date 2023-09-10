public class Problem7 {
    public static void main(String[] args) {
        int a = 55;
        int b = 70;

        boolean condition1 = a < 50;
        boolean condition2 = a < b;

        if (condition1 && condition2) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }
    }
}
