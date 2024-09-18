import java.util.Scanner;

public class Selection2Exp111 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        int year;

        System.out.print("Input year = ");
        year = input24.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
