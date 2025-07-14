package OOPConcept_Part1.Object;

public class Car1 {

//    How to create object of Car class

// create two variable called as Class variables : global variables

        int mod;
        int wheel;

// create an object of Car class -> created 3 object of car class

        public static void main(String[] args) {

            // new Car()-> object of car class-> this line is representing one object
            // Car is a class name so C capital
            // object reference variable a,b,c; they are representing object
            // new keyword is used to create the object

             Car a = new Car();
             Car b = new Car();
             Car c = new Car();

            a.mod = 2015;  // initializing values
            a.wheel = 4;  // object ref var.class var

            b.mod = 2014;
            b.wheel = 4;

            c.mod = 2013;
            c.wheel = 4;

            System.out.println("before assigning the references");

            System.out.println(a.mod);
            System.out.println(a.wheel);

            System.out.println(b.mod);
            System.out.println(b.wheel);

            System.out.println(c.mod);
            System.out.println(c.wheel);

            System.out.println("after shifting the references");

            a=b;
            b=c;
            c=a;

            a.mod = 10;
            System.out.println(a.mod);
            c.mod = 20;  // old value 10 will be replaced
            System.out.println(a.mod);  // 10
            System.out.println(c.mod);  // 20


        }
    }


