public class assigment2 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {

            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
