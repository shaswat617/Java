package OOPs;

abstract class Parent{
    Parent(){
        System.out.println(this.hashCode());
    }
}
class ChildNew extends Parent{
    ChildNew(){
        System.out.println(this.hashCode());
    }
}
public class AbstractClassConstructor {
    public static void main(String[] args) {
        ChildNew c1 = new ChildNew();
        System.out.println(c1.hashCode());
    }

}
