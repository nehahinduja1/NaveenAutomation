package JavaBasics.ConstructorSuperKeyword;

public class B extends A {

//  super keyword is used to call parent class parametrised constructor
//  As here two para is given so it will call parent class two param const

     public B() {
        super();
    }

    public B(int i) {
            super(i);
    }

    public B(int i, int j) {
         super(i,j);
    }


    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(10);
        B obj2 = new B(10, 20);

    }

}
