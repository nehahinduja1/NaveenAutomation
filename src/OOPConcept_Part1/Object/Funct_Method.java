package OOPConcept_Part1.Object;

public class Funct_Method {
    public static void main(String[] args) {
       Funct_Method obj = new Funct_Method();
       // after creating the object,the copy of all non-static methods will be given to this object
//       naveen please write -> obj.write();
        obj.test();   // calling the method

       int l = obj.pqr();  // obj.pqr=30 will give this value to some integer variable int l
        System.out.println(l);


       String s1 = obj.qa();  // obj.qa= selenium will give this value to some string, String s1
        System.out.println(s1);

       int d1 = obj.div(60, 30);
        System.out.println(d1);

    }

    // non-static methods
    //1. NO input no output

    //void does not return any value
    public void test() {
        System.out.println("test method");
    }

//2.No input some output
    public int pqr() {
        System.out.println("PQR method");
        int a = 10;
        int b = 20;
        int c = a+b;

        return c;  // 30 will be return to obj.pqr
    }

    //3. No input some output
    public String qa() {
        System.out.println("QA method");
        String s = "selenium";

        return s;  // selenium will be return to obj.qa
    }

// 4. Pass Input and get some output
public int div(int x, int y) {
    System.out.println("Division method");
    int d = x/y;

    return d;
}

}
