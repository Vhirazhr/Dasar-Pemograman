import java.util.Scanner;

public class Selection211 {
    public static void main(String[] args) {

        Scanner input05 = new Scanner(System.in);
        System.out.print("finalExam     : ");
        float finalExam = input05.nextFloat();
        System.out.print("midExam       : ");
        float midExam = input05.nextFloat();
        System.out.print("quiz          : ");
        float quiz = input05.nextFloat();
        System.out.print("assignment    : ");
        float assignment = input05.nextFloat();

        float total = (finalExam * 0.4f) + (midExam * 0.3F) + (quiz * 0.1f) + (assignment * 0.2f);
        String message = total < 65 ? "Retake" : "Pass";
        System.out.println("Final Grade = " + total + " and the decission is " + message);
        if (total < 65) {
            message = "retake";
        } else {
            message = "pass";
        }

        char grade;
        if (total >= 85) {
            grade = 'A';
        } else if (total >= 75) {
            grade = 'B';
        } else if (total >= 65) {
            grade = 'C';
        } else {
            grade = 'D';

        }

        System.out.print("Final grade = " + grade + " and the decision is" + message);
    }
}
