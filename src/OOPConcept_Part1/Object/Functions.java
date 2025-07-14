package OOPConcept_Part1.Object;

public class Functions {

    // main method -> starting point of execution if main is blank other method will not run
    // static method
    public static void main(String[] args) {   //main function/main method same

         Functions obj = new Functions();
         // one object will be created, obj is ref variable, referring to this object
        // after creating the object, the copy of all non-static method will be given to this object

         obj.test();
        int l =  obj.pqr();
        System.out.println(l);

         obj.qa();
         String s1 = obj.qa();
        System.out.println(s1);

//        obj.div(20,20);
        int div = obj.div(20,20);
        System.out.println(div);

    }

    // Non-static methods

 /* after creating any method we have to put () */

// void means does not return any value
    // return type = void  //1. NO input, no output
    public void test() {  // public -> publicly available, test -> method name any name
        System.out.println("test method");
    }

 //public void pqr()
// return type = int   // 2. No Input but some output
    public int pqr() {  // void will be replaced by return data type of c i.e; int
        System.out.println("PQR method");
        int a = 10;   // i am declaring variable
        int b = 20;
        int c = a + b;

        return c; // we are returning c; so data type of c is int
    }

        public String qa() {  //2. No input some output
            System.out.println("qa method");
            String s = "Selenium";

            return s;
        }

        // x, y -- input parameters/input arguments
    // return type = int
        public int div(int x, int y) {
        System.out.println("division method");
        int d = x/y;

        return d;
        }
}





