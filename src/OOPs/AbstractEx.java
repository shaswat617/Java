package OOPs;

 abstract class AbstractEx {
//      abstract int sum(int a, int b);
     public int multiply(int a, int b){
         return a*b;
     }
}
class ChildEx extends AbstractEx
{
//     int sum(int x, int y){
//        return x+ y;
//    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        AbstractEx ae1 = new ChildEx();
        System.out.println(ae1.multiply(x,y));
    }
}