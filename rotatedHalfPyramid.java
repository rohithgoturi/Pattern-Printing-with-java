public class rotatedHalfPyramid {
    public static void main(String[] args) {
        int rows = 4;

        for(int i = 1; i<=rows; i++){
            //loop for spaces
            for(int j = rows-i; j>=0; j--){
                System.out.print("  ");
            }

            //loop for stars
            for(int k = 1; k<=i; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
