public class ArrayExamples4 {
    private String sName;
    int roll;
    int sClass;
    public void methodOne(){
        roll =10;
        System.out.println(roll);
    }
    {
        roll = 20;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    //    ArrayExamples4(String s,int r,int c){
//        s = this.sName;
//        r = this.roll;
//        c = this.sClass;
//    }
    public static void main(String[] args) {
//        sName = ""
//        ArrayExamples4 s1 = new ArrayExamples4("Mamuni",1,1);
//        ArrayExamples4 s2 = new ArrayExamples4("Sasmita",2,1);
        ArrayExamples4 s3 = new ArrayExamples4();
        s3.methodOne();
    }

}
class XYZ{
    int a = 10;
    int b = 20;
    public static void main(String[] args) {
        XYZ x1 = new XYZ();
        System.out.println(sum(x1.a,x1.b));

    }
    public static int sum(int x, int y){
        int c;
        c = x + y;
        return c;
    }
}
