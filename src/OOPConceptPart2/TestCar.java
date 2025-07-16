package OOPConceptPart2;


/*Method overriding -> when same method is present in parent and child class with same name and same no.
  of argument*/
public class TestCar {
    public static void main(String[] args) {

        // Static polymorphism or compile-time polymorphism -> 1 to many method, method overriding

        BMW b = new BMW();  // object created of bmw class, as it is public so can be created anywhere
        b.start();    // method is common in parent/child class preference will be given to child class
        b.stop();
        b.refuel();  //  Inheritance from parent class
        b.theftSafety();
        b.engine();

        System.out.println("******");


        Car c = new Car();   // parent class object
        c.start();
        c.stop();
        c.refuel();
        c.engine();
//      c.theftsafety(); parent cannot access all properties of child class

        System.out.println("******");

        // Top Casting
        Car c1 = new BMW(); //dynamic or runtime polymorphism -> child class object can be referred by parent class ref variable
        c1.start();  // child class will be preferred
        c1.stop();
        c1.refuel();
        c1.engine();
//      c1.theftSafety();  // obj is child class but it is ref by parent class ref var, only common or parent class method can be accessed

//     Down Casting - object of parent referred by child class ref variable
//     BMW b1 = new Car(); - not allowed, parent cannot fit into child class
//        we have to cast it

//        BMW b1 = (BMW)new Car();  // exception error

    }



}
