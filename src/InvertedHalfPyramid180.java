//public class InvertedHalfPyramid180 {
//    public static void main(String[] args) {
//        int m =4;
//        //Outer Loop
//        for(int i = 1; i <= m; i++){
//            //Inner Loop
//            for (int j = 1; j <= m - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//public class InvertedHalfPyramid180 {
//    public static void main(String[] args) {
//        int m =4;
//        //Outer Loop
//        for(int i = m; i >= 1; i--){
//            //Inner Loop
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= m-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


public class InvertedHalfPyramid180 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
