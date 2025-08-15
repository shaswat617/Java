package OOPs;

public class PolymorphismParent1 {
    int a, b, c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public void sum(int a, int b){
        System.out.println("Parent Sum");
    }

}
class PolymorphismChild extends PolymorphismParent1 {
    double d,e,f;


    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    public void sum(float a, int b){
        System.out.println("Child Sum");
    }
    public static void main(String[] args) {
        PolymorphismParent1 p1 = new PolymorphismParent1();
        p1.getC();
        PolymorphismChild c1 = new PolymorphismChild();
        c1.getD();
        PolymorphismParent1 p2 = new PolymorphismChild(); //parent class reference variable can hold child class objects, but by using that reference variable we can ONLY call parent specific methods
        p2.getC();
//        p2.su;
//        PolymorphismChild c2 = new PolymorphismParent1(); // Child class reference variable can not hold parent class object


    }

}