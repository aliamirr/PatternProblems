public class RectangularPatterns {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        //Outer Loop || Rows
        for(int i = 1; i <= m; i++){
            //Inner Loop || Columns
            for(int j = 1; j <=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
