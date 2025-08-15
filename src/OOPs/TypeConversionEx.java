package OOPs;

public class TypeConversionEx {
    public static void main(String[] args) {
//        int i = 'a';//low to high type cast
        int i = 97;
        char ch = (char) i;//high to low type cast
        System.out.println(ch);
    }
}
