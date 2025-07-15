package OOPConcept_Part1.Object;

public class StaticAndNonStatic {

    // global var = the scope of global var will be available accorss all functions with some condition
    String name = "Tom";    // non static global variable
    static int age = 25;   // static global variable

    public static void main(String[] args) {

        // how to call static methods and variable
        // 1. direct calling:
        sum();

        //2. calling by class name:
        StaticAndNonStatic.sum();

        // 3. how to call variable
        System.out.println(age);

        //4. calling by class name
        System.out.println(StaticAndNonStatic.age);

        // how to call non-static methods and variable u have to create object
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.sendMail();

        System.out.println(obj.name);

        // can I access static methods by using object reference: Yes
        obj.sum();// warning will be given but it is not a good practise
        System.out.println(obj.age);  // warning will be given but it is not a good practise

    }

public void sendMail() {   // non-static method
    System.out.println("Send mail method");
}

public static void sum() {   // static method
    System.out.println("Sum method");
}

}
