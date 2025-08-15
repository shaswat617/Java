public class VariablesExample {
     int eId;
     String eName;
     int salary;
     static String cName;
     public static void methodTwo(){
         cName = "Cognizant";
         System.out.println(cName);
//         eId = 101;
     }
    static{
        cName = "NessTech.";
//        eId = 101;
    }
    VariablesExample(int e, String n,int sal, String cn){
         e = this.eId;
         n = this.eName;
         sal = this.salary;
         cn = this.cName;
    }

    public static void main(String[] args) {
        cName = "Wipro";
//        VariablesExample ve = new VariablesExample();
//        ve.cName = "Wipro";
        VariablesExample ve1 = new VariablesExample(101,"Mamuni",100,"Wipro");
    }

}
class VarEx2{
    public static void main(String[] args) {
        VariablesExample.cName = "wipro";
    }
}
class VarEx3{
    static String s;

    public static void main(String[] args) {
        System.out.println(s); //null

    }
}
