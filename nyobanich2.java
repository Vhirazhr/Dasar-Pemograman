import java.util.Scanner;

public class nyobanich2 {
    static String[][] coordinate;
    static int order = 0;
    static double totalCost = 1000.0;
    static String expeditionName;
    static String recipientName;
    static String fromWhere;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paymentType;
        Double paymentAmount = 0.0;
        Double remain = 0.0;

        System.out.print("Enter payment type (COD/Direct): ");
        paymentType = scanner.nextLine();

        if (paymentType.equals("COD")) {
            System.out.println("|================================================================================| ");
            System.out.println("|                            Payment : Not yet paid off                          |");
            System.out.println("|================================================================================| ");
        } else {
            System.out.print("Payment amount : ");
            paymentAmount = scanner.nextDouble();
            remain = paymentAmount - totalCost;
            System.out.println("|================================================================================| ");
            System.out.println("|                                   Payment : Paid off                           |");
            System.out.println("|                                                                                |");
            System.out.println("|                             Remain fee : Rp. " + remain + "                     |");
            System.out.println("|================================================================================| ");
        }

        // Inisialisasi atau pengaturan ulang array coordinate
        coordinate = new String[order + 1][3];

        order++;
        String newArray[][] = new String[order][3];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = coordinate[i][j];
            }
        }

        coordinate[order - 1][0] = expeditionName;
        coordinate[order - 1][1] = recipientName;
        coordinate[order - 1][2] = fromWhere;

        System.out.print("Enter payment type (COD/Direct): ");
        paymentType = scanner.nextLine();

        // Clear screen function (belum terlihat di potongan kode yang diberikan)
        // ClearScreen();

        System.out.println("Insert anything to go back");
        String anything = scanner.nextLine();

        // Panggil fungsi MainMenuUser() (belum terlihat di potongan kode yang
        // diberikan)
        // MainMenuUser();

        // Tutup scanner
        scanner.close();
    }
}
