public class ArrayExamples2 {
    public static void main(String[] args) {
        Number[] n = new Number[10];
//       n[0] = new Integer(10);
//        n[1] = new Double(10.5);
        Runnable[] r = new Runnable[10];
        r[0] = new Thread();
        System.out.println(r[0]);

        int[] a = {10,20,30};
        int[] b = {40,50};
//        char[] ch = {'a','b','c'};
//         a = b;
        b = a;
        System.out.println(b.length);
//        System.out.println(a.length);

//        int[] c = ch;

        System.out.println("===========");
        String[] argh = {"A","B"};
        args = argh;
        System.out.println(args.length);
//        for(int i = 0;i<=args.length;i++)
        for(int i = 0; i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
