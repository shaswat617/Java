package OOPs;

import java.util.Scanner;

interface InterfaceEx {
  int sum(int a,int b);
}

class Example implements  InterfaceEx {
    public int sum(int a, int b){
       return a+b;
   }

    public static void main(String[] args) {
//        int a = 3;
//        int b = 4;
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
       // Example e1 = new Example();
        InterfaceEx e1 = new Example();
        System.out.println("Result is : ");
        System.out.println(e1.sum(num1, num2));
    }
}
