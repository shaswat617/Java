public class MainMethodEx {
//    public static void main(String[] args) {
//         int x=10;
//        System.out.println(x);
//
//    }


//    public static void main(String[] args) {
//        System.out.println("String[] array main method");
//        MainMethodEx.main(new int[]{10,20,30});
//    }
//
//    public static void main(int[] args) {
//        System.out.println("int[] array main method");
//    }


    public static void main(String[] args) {
        System.out.println("parent main");          //Parent.java
//        MainMethodEx.main(new String[]{"Mamuni","Rocky","Sasmita"});
    }
}

class Child extends MainMethodEx {
    public static void main(String[] args) {
        System.out.println("chlid main");          //Parent.java

    }
}



