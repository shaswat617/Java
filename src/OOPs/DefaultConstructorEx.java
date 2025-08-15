package OOPs;

public class DefaultConstructorEx {
    //   static void DefaultConstructorEx(){
//       System.out.println("Hello");
//    }
//    DefaultConstructorEx() {
//        this(10, 20);
//    }
//
    DefaultConstructorEx(int a, int b) {
        //super(a, b, 30);
        this(a,b,30);
    }
 //int x;
    DefaultConstructorEx(int x, int y, int z) {
       // this(12,16,20);
        super();
   //     this.x = x;
    }

    public static void main(String[] args) {
        // DefaultConstructorEx();
       // DefaultConstructorEx obj = new DefaultConstructorEx();
        DefaultConstructorEx obj2 = new DefaultConstructorEx(2, 3,4);
    }


}
