package OOPs;

public class RecursiveTest {
//    RecursiveTest(){
//        this(10);
//    }
//    RecursiveTest(int a){
//        this();
//    }
    public void m1(){
        m2();
    }
    public void m2(){
        m1();
    }

    public static void main(String[] args) {
        RecursiveTest t1 = new RecursiveTest();
        t1.m1();
    }
}
