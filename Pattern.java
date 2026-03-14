public class Pattern {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 0; i <= 2 * n - 2; i++) {
            for (int j = 0; j <= 2 * n - 2; j++) {

                int min = Math.min(Math.min(i, j), Math.min(2*n-2-i, 2*n-2-j));

                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }
}