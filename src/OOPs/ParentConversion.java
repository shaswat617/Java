package OOPs;

public class ParentConversion {
    public void methodOne(){
        System.out.println("A");
    }
}
class ChildConversion extends ParentConversion{
    public void methodOne(){
        System.out.println("B");
    }
    public void methodTwo(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        ChildConversion c = new ChildConversion();
        c.methodOne();
        c.methodTwo();
        ((ParentConversion)c).methodOne();
//        ParentConversion p = new ParentConversion();
//        ParentConversion p = (ParentConversion)c;
//        p.methodOne();
    }
}
