public class Example2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 010;
        int z = 0x10;
        System.out.println(x+" "+y+" "+z);

        double d=10e2;
        double d1=0xFACE;
        System.out.println(d1);

        char ch=97;
        System.out.println(ch);
        char ch1=0xABE;
        System.out.println(ch1);

        char ch2='\ubeec';
        System.out.println(ch2);
        char ch3='\u0061';
        System.out.println(ch3);

        int n = 0b101;
        System.out.println(n);

        double dn = 1_23_456.7_8_9;
        System.out.println(dn);
        int dn1 = 1_23_4;
        System.out.println(dn1);
        double dn2 = 'a';
        System.out.println(dn2);
        float f = 10L;
        System.out.println(f);

    }
}
