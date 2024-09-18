import java.util.Scanner;

public class arrayValue11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] finalScore = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the final Score" + i + ": ");
            finalScore[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Final Score" + i + " is " + finalScore[i]);
        }

        input.close();
    }
}