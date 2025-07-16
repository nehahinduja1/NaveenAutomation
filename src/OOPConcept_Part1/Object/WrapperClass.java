package OOPConcept_Part1.Object;

public class WrapperClass {
    public static void main(String[]args) {
        String x = "100";
        System.out.println(x+20);// string concatenation

        //How to convert string into integer (wrapper class concept)

        // wrapper class - integer
        // data conversion : string to integer parseInt method
       int i =  Integer.parseInt(x);
        System.out.println(i);
        System.out.println(i+20);

        // Integer, Double, Character, Boolean

        // String to double conversion:
        String y = "12.33";
        double d = Double.parseDouble(y);
        System.out.println(d);
        System.out.println(d+10);

        // String to boolean:
        String k = "true";
        boolean b = Boolean.parseBoolean(k);
        System.out.println(b);

        //int to String: valueOf
        int j = 200;
        System.out.println(j+20);

        String s = String.valueOf(j);
        System.out.println(s);    // 200
        System.out.println(s+20);  // 20020

        /* */
//        String u = "100A";
//        Integer l = Integer.parseInt(u);  // Numberformatexception it should be pure int, double, string
//        System.out.println(l);

        // Char to string
        char c = 'B';
        String s1 = String.valueOf(c);
        System.out.println(s1);
        System.out.println(s1+30);


    }





}
