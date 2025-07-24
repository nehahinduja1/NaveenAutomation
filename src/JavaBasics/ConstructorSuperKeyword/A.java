package JavaBasics.ConstructorSuperKeyword;

public class A {
    public A() {
        System.out.println("parent class constructor");
    }

    public A(int i) {
        System.out.println("Parent class const with value of i: " + i );
    }

    public A(int i, int j) {
        System.out.println("Parent class const with value of i:" + i);
        System.out.println("Parent class const with value of j:" + j);
    }


}
