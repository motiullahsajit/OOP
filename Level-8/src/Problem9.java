public class Problem9 {
    public static void main(String[] args) {
        int[] initialArray = {58, 24, 13, 15, 63, 9, 8, 81, 1, 78};
        int length = initialArray.length;

        int middle = length / 2;

        int[] firstArray = new int[middle];
        int[] secondArray = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            firstArray[i] = initialArray[i];
        }

        for (int i = middle; i < length; i++) {
            secondArray[i - middle] = initialArray[i];
        }

        System.out.println("INITIAL array:");
        printArray(initialArray);

        System.out.println("After splitting:");

        System.out.print("First Array: ");
        printArray(firstArray);

        System.out.print("Second Array: ");
        printArray(secondArray);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
