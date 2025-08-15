package OOPs;

public class ExampleConstructor {
    int a;
    int b;

    ExampleConstructor(int a, int b) {
        //System.out.println("Java Program");
        System.out.println(a + " " + b);
//        this.a = a;
//        this.b = b;
        System.out.println(this.a + " " + this.b);
    }

    public void sum(int x, int y) {
        this.a = x;
        this.b = y;
        System.out.println(this.a + this.b);
    }

    public static void main(String[] args) {
        ExampleConstructor obj = new ExampleConstructor(10, 20);
        System.out.println(obj.a + obj.b);
        obj.sum(30, 40);
    }
}


//this and super keywords can be used in instance area i.e, within class but above main(), constructor, instance method , instance block.