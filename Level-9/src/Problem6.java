public class Problem6 {
    public static void main(String[] args) {
        String str = "Hello, World";
        char targetChar1 = 'o';
        char targetChar2 = ',';
        int firstOccurrence1 = -1;
        int lastOccurrence1 = -1;
        int firstOccurrence2 = -1;
        int lastOccurrence2 = -1;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == targetChar1) {
                if (firstOccurrence1 == -1) {
                    firstOccurrence1 = i;
                }
                lastOccurrence1 = i;
            }

            if (currentChar == targetChar2) {
                if (firstOccurrence2 == -1) {
                    firstOccurrence2 = i;
                }
                lastOccurrence2 = i;
            }
        }

        if (firstOccurrence1 != -1) {
            System.out.println("First occurrence of 'o' is at index: " + firstOccurrence1);
            System.out.println("Last occurrence of 'o' is at index: " + lastOccurrence1);
        } else {
            System.out.println("The letter 'o' is not present in the string.");
        }

        if (firstOccurrence2 != -1) {
            System.out.println("First occurrence of ',' is at index: " + firstOccurrence2);
            System.out.println("Last occurrence of ',' is at index: " + lastOccurrence2);
        } else {
            System.out.println("The character ',' is not present in the string.");
        }
    }
}
