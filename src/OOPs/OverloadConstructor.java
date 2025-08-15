package OOPs;

public class OverloadConstructor {
    OverloadConstructor(int i){
        //super();
        this(10,20.5);
        System.out.println(i);
    }
    OverloadConstructor(int i,double j){
       // super();
        this(10,20);
        System.out.println("Y");
    }
    OverloadConstructor(int i,int j){
        //super();
        //this(10,2.4);
        System.out.println("Z");
    }
//    OverloadConstructor(){
//       // super();
//    }
public static void main(String[] args) {
    OverloadConstructor olc = new OverloadConstructor(20);
    
}
}
