package OOPs;

public class MainMethodChange {
    public static void main(String[] args) {
        MainChild c1 = new MainChild();
        System.out.println(c1.a);
    }
}
class MainChild extends MainMethodChange{
    int a =10;
}

