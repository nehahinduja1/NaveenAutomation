package JavaBasics;

public class Array {
    public static void main (String[]args) {
        int i = 20;
        i = 10;   // previous i value is replaced, i is array variable

        // array : to store similar data types values in a array variable

        // One dimension array
//   disadvantages of array
//    1. size is fixed -> static array - to overcome this - we use collections - arraylist, hashtable - use dynamic array
//    2. Stores only similar data types -- only char, only string, or only int -> to overcome this--
//   -- we use object array



// 1. int array variable:
        // lowest bound/index = o
        // upper bound/index = n-1 (n is size of array)

        int k[] = new int[4];  // we can store max 4 value (0, 1,2,3)
        k[0] = 10;
        k[1] = 20;
        k[2] = 30;
        k[3] = 40;

        System.out.println(k[2]);
        System.out.println(k[3]);
//        System.out.println(k[4]);  // array index out of bound exception

        System.out.println(k.length);  // size, length of array

        // print all values of array : use for loop

        for(int j= 0; j< k.length; j++) {
            System.out.println(k[j]);

        }

        //2. double array:

        double d[] = new double[3];
        d[0]= 12.33;
        d[1] = 13.33;
        d[2] = 14.55;
        System.out.println(d[2]);

        //3. char array:

        char c[] = new char[3];
        c[0] = 'a';
        c[1] = '$';
        c[2] = '1';
        System.out.println(c[1]);


        //4. Boolean array

        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;
        System.out.println(b[0]);


        // 5. string array - is not data type it is class

        String s[] = new String[3];
        s[0] = "Hello";
        s[1] = "World";
        s[2] = "test";
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println(s.length);

        //6. Object array: Object is class 'O' capital - is used to store diff data types variables

        Object o[] = new Object[5];
        o[0] = "Tom";
        o[1] = 'M';
        o[2] = "1/1/1990";
        o[3] = 29;
        o[4]= 5.2;
        System.out.println(o[3]);
        System.out.println(o.length);

    }
}
