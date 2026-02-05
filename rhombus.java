public class rhombus {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {

            //spaces loop
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            //rhombus loop
            for (int k=1; k<=rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
