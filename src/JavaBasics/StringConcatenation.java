package JavaBasics;

public class StringConcatenation {
    public static void main(String[] args) {

        //String concatenation
        // println = is for new line
        // print = just to print

        int a= 100;
        int b = 200;

        String x = "Hello";
        String y = "World";

        double c = 12.33;
        double d = 10.33;

        System.out.println(a+b);
        System.out.println(x+y);
        System.out.println(a+b+x+y);  // Left to right
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b)); // BODMAS
        System.out.println(a+b+x+y+a+x+b+y);  // + is concatenation operator
        System.out.println(a+b+x+y+a+b);

        System.out.println(c+d);
        System.out.println(x+y+c+d);
        System.out.println("HelloWorld");
        System.out.println(a);
        System.out.println("the value of a is:" + a);
        System.out.println("the value of b is:" + b);
        System.out.println("the addition of a and b is:" + (a+b));
        System.out.print("Hello Selenium");
        System.out.println("Hello Testing");
        System.out.println("Hello Neha");//ln = new line

    }
}
