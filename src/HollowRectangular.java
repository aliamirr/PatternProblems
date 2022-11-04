public class HollowRectangular {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        //Outer Loop || Rows
        for(int i = 1; i <= m; i++){
            //Inner Loop || Columns
            for(int j = 1; j <= n; j++){
                // Condition required for boundary.
                if(i ==1 || j == 1 || i == m || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Spaces in middle
                }
            }
            System.out.println();
        }
    }
}
