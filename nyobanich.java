import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Expedition {

    static Scanner scanner = new Scanner(System.in);

    // paymenType = scanner.nextLine();
    paymentType=scanner.nextLine();
    Double paymentAmount = 0.0;
    Double remain = 0.0;

    System.out.print("Payment type (Direct / COD) : ");if(paymentType.equals("COD"))
    {
        System.out.println("|================================================================================| ");
        System.out.println("|                            Payment : Not yet paid off                          |");
        System.out.println("|================================================================================| ");
    }else
    {
        System.out.print("Payment amount : ");
        paymentAmount = scanner.nextDouble();
        remain = paymentAmount - totalCost;
        System.out.println("|================================================================================| ");
        System.out.println("|                                   Payment : Paid off                           |");
        System.out.println("|                                                                                |");
        System.out.println("  |                             Remain fee : Rp. " + remain + "                     |");
        System.out.println("|================================================================================| ");

    }
    // int detailOption = scanner.nextInt();
    coordinate=new String[10][3]; // or adjust the size based on your requirements

    order++;
    String newArray[][] = new String[order][3];for(
    int i = 0;i<coordinate.length;i++)
    {
        for (int j = 0; j < coordinate[i].length; j++) {
            newArray[i][j] = coordinate[i][j];
        }
    }coordinate[order-1][0]=expeditionName;coordinate[order-1][1]=recipientName;coordinate[order-1][2]=fromWhere;

    paymentType=scanner.nextLine();

    ClearScreen();scanner.nextLine();System.out.println("Insert anything to go back");

    anything=scanner.nextLine();

    MainMenuUser();
}
