package OOPs;

public class ConstructorExamples {
    ConstructorExamples(int i){
        super();
    }
//    ConstructorExamples(){
//        super();
//    }
}
class ChildExamples extends ConstructorExamples {
    ChildExamples(){
        super(10);
    }
    public static void main(String[] args) {

        ConstructorExamples c1 = new ChildExamples();
        ConstructorExamples c2 = new ConstructorExamples(10);
        ChildExamples c3 = new ChildExamples();
    }
}