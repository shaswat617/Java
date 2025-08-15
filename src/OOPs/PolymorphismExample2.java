package OOPs;

public class PolymorphismExample2 {
    public void methodOne(int i) {

        System.out.println("int-arg method"); //overloaded methods
    }
    public void methodOne(byte b) {

        System.out.println("byte-arg method"); //overloaded methods
    }

    public static void main(String[] args) {
        PolymorphismExample2 p1 = new PolymorphismExample2();
        byte b = 10;
        p1.methodOne(b);

    }
}

