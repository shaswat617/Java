package OOPs;

public interface Inter2 {
    void methodOne();
    //  void methodTwo();
}

interface Inter1 {
    void methodOne();
}

interface Inter3 extends Inter2, Inter1 {

}

class Test implements Inter3 {
    public void methodOne() {
        System.out.println("This is methodOne()");
    }

    public static void main(String[] args) {
        Inter3 i3 = new Test();
        i3.methodOne();
        //i3.methodOne();
       // i3.methodTwo();
    }
}
