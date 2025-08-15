package OOPs;

public class OverrideEx1 {
     void methodOne(){
        System.out.println("Parent method");
    }
}
abstract class Child extends OverrideEx1{
    public abstract void methodOne();
}
class Child1 extends OverrideEx1{
//    public static void main(String[] args) {
//        Child1 ch = new Child1();
//        ch.methodOne();
//    }
    public void methodOne(){
        System.out.println("Child method");
    }
}