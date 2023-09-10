public class Problem12 {
    public static void main(String[] args) {
        int totalStudents = 90;
        int totalBoys = 45;
        double percentageGradeA = 50.0;
        int gradeABoys = 20; 

        double totalGradeA = (percentageGradeA / 100) * totalStudents;

        int totalGirls = totalStudents - totalBoys;
        int gradeAGirls = (int) (totalGradeA - gradeABoys);

        System.out.println("Total number of girls getting grade 'A': " + gradeAGirls);
    }
}
