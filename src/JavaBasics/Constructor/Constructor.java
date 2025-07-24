package JavaBasics.Constructor;

import JavaBasics.ConstructorSuperKeyword.B;
import JavaBasics.ConstructorSuperKeyword.C;

// main funct of constructor is initializing variables

public class Constructor {

    // class variable, global variable, instance vars
    String place;
    int number;

    public Constructor() {   // constructor should be same as class name
        System.out.println("Default constructor");
    }

    public Constructor(int i) {   // 1 param
        System.out.println("Const with 1 param: ");
        System.out.println(i);
    }

    public Constructor(int i, int j) {
        System.out.println("Const with 2 param: ");
        System.out.println(i + " " + j);
    }

    public Constructor(String place, int number) {  //this place, number is diff from class variable
       this.number = number;  // this means current class (this.classvar = localvar
       this.number = number; // this keyword is used when we have to intiliaze class var with local var.
//       place = place1;   // if variable names are diff then we don't have to use this keyword
//       number = number1;

    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();     // same name as class name
        Constructor obj1 = new Constructor(10);
        Constructor obj2 = new Constructor(10, 30);
        Constructor obj3 = new Constructor("London", 401);

        System.out.println(obj3.place);   // place is non-static so we have to call by obj refe obj3
        System.out.println(obj3.number);


    }

}
