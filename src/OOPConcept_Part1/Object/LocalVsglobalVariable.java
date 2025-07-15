package OOPConcept_Part1.Object;

public class LocalVsglobalVariable {

    //Global variables -- class variable
    String name = "Tom";
    int age = 25;


    public static void main(String[] args) {

        int i = 10;   // local variable for main method
        System.out.println(i);

        //create object inside main method
        LocalVsglobalVariable obj = new LocalVsglobalVariable();
        System.out.println(obj.name);
        System.out.println(obj.age);

    }

    public void sum() {
        int i = 15;    // local variable of sum method
        int j = 20;


    }
}
