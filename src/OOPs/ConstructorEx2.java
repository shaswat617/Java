package OOPs;

public class ConstructorEx2 {
    ConstructorEx2(int a,int b, int c){
        System.out.println("Hello");
    }
}
class ChildConstructorEx2 extends ConstructorEx2{
    ChildConstructorEx2(){
        super(10,20,30);
    }
    public static void main(String[] args) {
       ConstructorEx2 c1 = new ChildConstructorEx2();

    }
}