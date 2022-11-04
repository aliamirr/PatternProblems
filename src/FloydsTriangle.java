public class FloydsTriangle {
    public static void main(String[] args) {
        int m = 5;
        int number = 1;

        //Outer Loop
        for(int i = 1; i<=m; i++ ){
            //Inner Loop
            for (int j = 1; j <=i ; j++) {
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }
    }
}
