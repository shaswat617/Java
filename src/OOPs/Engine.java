package OOPs;

public class Engine {
    void methodOne(){
        System.out.println("First method");
    }
}
class Car{
    void methodTwo(){
        System.out.println("Second method");
    }
   static Engine e1 = new Engine();

    public static void main(String[] args) {
        e1.methodOne();
      //  e1.methodTwo();
    }
}
