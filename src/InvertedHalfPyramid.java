//public class InvertedHalfPyramid {
//    public static void main(String[] args) {
//        int m = 4;
//        for(int i = m; i >= 1; i--){
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


public class InvertedHalfPyramid  {
    public static void main(String[] args) {
        int n = 5;

        //Outer Loop
        for(int i = 1; i<=n; i++){
            //Inner Loop
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}