package OOPs;

public class ParenConstructor {
    ParenConstructor(){
        System.out.println(this.hashCode());
       // super();
    }
}
class ChildConstructor extends ParenConstructor{

    public static void main(String[] args) {
        ChildConstructor c1 = new ChildConstructor();
    }
}
