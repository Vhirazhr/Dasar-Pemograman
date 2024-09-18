import java.util.Scanner;

public class arrayAverageScore11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        double totalPassed = 0;
        double totalFailed = 0;
        int passedCount = 0;
        int failedCount = 0;

        System.out.print("Enter the number of students: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter final score for student " + (i + 1) + ": ");
            scores[i] = input.nextInt();

            if (scores[i] >= 70) {
                totalPassed += scores[i];
                passedCount++;
            } else {
                totalFailed += scores[i];
                failedCount++;
            }
        }

        double averagePassed = (passedCount > 0) ? totalPassed / passedCount : 0;
        double averageFailed = (failedCount > 0) ? totalFailed / failedCount : 0;

        System.out.println("The average score of students who passed is: " + averagePassed);
        System.out.println("The average score of students who failed is: " + averageFailed);

        input.close();
    }
}
