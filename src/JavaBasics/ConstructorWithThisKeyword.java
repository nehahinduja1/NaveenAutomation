package JavaBasics;

public class ConstructorWithThisKeyword {


    // Class variables
    String name1;
    int age1;

    public ConstructorWithThisKeyword(String name, int age) {
        this.name1 = name;   // this keyword is used to initialize the class var in constructor
//        this.name' refers to class variable; 'name' refers to constructor parameter
        this.age1 = age;



        System.out.println(name);
        System.out.println(age);

    }


    public static void main (String[]args) {
     ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 30);

    }
}
