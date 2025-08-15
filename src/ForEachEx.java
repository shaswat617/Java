public class ForEachEx {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
//        for (int x : a) {
//            if (x == 2)
//                break;
//            System.out.println(x);
//        }
        for(int i = 0;i<a.length;i++){
            if(i==3)
                break;
            System.out.println(a[i]);
        }

//    public static void main(String[] args) {
//        int[][] a = {{10, 20, 30}, {40, 50}};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println(a[i][j]);
//            }
//
//        }

//        for(int[] x:a){
//            for(int y:x){
//                System.out.println(y);
//            }
//        }

//    }

    }
}
