package OOPs;

 abstract public class AbstractClassTest {
//    public static void sum(){
//        System.out.println("Hello");
//    }
//
//    public static void main(String[] args) {
//        AbstractClassTest.sum();
//
//    }
     public abstract void m1();
     public void m2(){
         System.out.println("hii");
     }
}
class ChildAbstractTest extends AbstractClassTest{
     public void m1(){}
}

