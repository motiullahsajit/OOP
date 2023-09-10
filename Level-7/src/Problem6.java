import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }

    public static double calculateCircumference(double radius) {
        return 2 * 3.1416 * radius;
    }

    public static double calculateArea(double radius) {
        return 3.1416 * radius * radius;
    }
}
