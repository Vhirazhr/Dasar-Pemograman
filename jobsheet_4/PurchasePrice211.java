import java.util.Scanner;

public class PurchasePrice211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pageCount, totalCost, discount, bookBrand;

        System.out.println("input book brand: ");
        bookBrand = input.nextInt();
        System.out.println("input page count: ");
        pageCount = input.nextInt();
        System.out.println("input discount percentage: ");
        discount = input.nextInt();

        totalCost = pageCount * 10 - (pageCount * 10 * discount / 100);

        System.out.println("input book brand: " + bookBrand);
        System.out.println("input page count: " + pageCount);
        System.out.println("input discount percentage: " + discount);
        System.out.println("totalCost = " + totalCost);

        input.close();
    }
}