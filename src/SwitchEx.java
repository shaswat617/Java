import java.util.Scanner;

public class SwitchEx {
//    public static void main(String args[]){
//        int x=10;
//        switch(x)
//        {
//            //System.out.println("hello");
//        }}


//        public static void main(String[] args){
//            byte b=10;
//            switch(b+1)
//            {
//                case 10:
//                    System.out.println("10");
//                case 100:
//                    System.out.println("100");
//                case 1000:
//                    System.out.println("1000");
//            }}

//    public static void main(String[] args) {
//        int x = 10;
//       final int y=20;
//        switch(x){
//            case 10:
//                System.out.println("10");
//            case y:
//                System.out.println("20");
//            default:
//                System.out.println("Give a proper input");
//        }
//    }

//    public static void main(String[] args) {
//        int x = 10;
//        switch (x){
//            case 99:
//                System.out.println("99");
//            case 97:
//                System.out.println("97");
//            case 'b':
//                System.out.println("100");
//            default:
//                System.out.println("enter proper input");
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your input");
        String day = sc.next();
        switch (day){
            case "one":
                System.out.println("Monday");
                break;
            case "two":
                System.out.println("Tuesday");
                //break;
            case "three":
                System.out.println("wednesday");
                break;
            case "four":
                System.out.println("thursday");
                break;
            case "five":
                System.out.println("friday");
                break;
            case "six":
                System.out.println("saturday");
                break;
            default:
                System.out.println("Give a valid input");
               // break;
        }
    }
}
