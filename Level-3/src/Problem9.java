public class Problem9 {
    public static void main(String[] args) {
        int subject1Marks = 78;
        int subject2Marks = 45;
        int subject3Marks = 62;
        int totalMarks = subject1Marks + subject2Marks + subject3Marks;
        
        int maxMarksPerSubject = 100;
        double percentage = (double) totalMarks / (3 * maxMarksPerSubject) * 100;

        System.out.println("Marks in Subject 1: " + subject1Marks);
        System.out.println("Marks in Subject 2: " + subject2Marks);
        System.out.println("Marks in Subject 3: " + subject3Marks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage Marks: " + percentage + "%");
    }
}
