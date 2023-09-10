import java.util.Scanner;

public class Problem3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        double area = length * breadth;
        int areaAsInteger = (int) area;
        System.out.println("Area of the rectangle (type-casted to int): " + areaAsInteger);
        scanner.close();
    }
}
