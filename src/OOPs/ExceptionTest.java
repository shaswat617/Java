package OOPs;

public class ExceptionTest {
    public static void methodOne() {
        System.out.println("Parent exception");
    }
}

class ChildException extends ExceptionTest {
    public static void methodOne() {
        System.out.println("Child Exception");

    }

    public static void main(String[] args) {
        //ExceptionTest e1 = new ChildException();
        methodOne();
    }
}
