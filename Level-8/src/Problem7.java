public class Problem7 {
    public static void main(String[] args) {
        int[] arr = { 5, 12, 7, 2, 8, 15, 1, 6 };

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            } else if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
