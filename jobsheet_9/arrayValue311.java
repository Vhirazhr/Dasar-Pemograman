import java.util.Scanner;

public class arrayValue311 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] finalScore = new int[10];

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final Score" + i + ": ");
            finalScore[i] = input.nextInt();
        }
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) {
            System.out.println("Student " + i + " passed!");
        }
    }

        input.close();
    }
}