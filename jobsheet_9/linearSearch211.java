import java.util.Scanner;

public class linearSearch211 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the array element " + i + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter the key you want to search for: ");
        int key = input.nextInt();
        int result = searchKey(array, key);

        if (result != -1) {
            System.out.println("The key in the array is located at index position " + result);
        } else {
            System.out.println("The key is not found in the array.");
        }

        input.close();
    }

    private static int searchKey(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
