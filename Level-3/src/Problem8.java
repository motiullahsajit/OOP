public class Problem8 {
    public static void main(String[] args) {
        int a = 55;
        int b = 70;

        boolean condition1 = a < 50;
        boolean condition2 = a < b;

        if (condition1 || condition2) {
            System.out.println("At least one condition is true.");
        } else {
            System.out.println("Both conditions are false.");
        }
    }
}
