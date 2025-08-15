package OOPs;


 class Person1 {
    String name="Mamuni";
    int age=20;
    Person1(String name, int age) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(this.name);
        System.out.println(this.age);
        this.name = name;
        this.age = age;

    }

     public static void main(String[] args) {
         Person1 p1 = new Person1("Shaswat",30);

     }
}