package OOPConcept_Part1.Object;

public class MethodOverloading {
    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(10);
        obj.sum(10,20);

    }

    public static void main(int p) {

    }

    public static void main(int q, int h) {

    }

    //We can overload Main method also
    // you can not create a method inside a method
    // duplicate methods - i.e same method name with same number of arguments, same data type is not allowed

    // Method Overloading -> when method name is same with diff arguments or input param within same class
    public void sum(){   // 0 input param
        System.out.println("Sum method - zero parameter ");

    }

    public void sum(double d){   // 1 input param diff input para
        System.out.println("Sum method - zero parameter ");

    }


    public void sum(int i) {   // 1 input param
        System.out.println("sum method - 1 input parameter ");

    }

       public void sum(int k, int l) {  // 2 input param
           System.out.println("Sum method - 2 input parameter");
           System.out.println(k+l);
}


}
