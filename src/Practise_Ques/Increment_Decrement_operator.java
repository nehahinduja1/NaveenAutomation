package Practise_Ques;

public class Increment_Decrement_operator {
    public static void main(String[] args) {
        // ++
        // --

        //Post increment
        int i = 1;
        int j = i++;  // i value is given to j then i is increased by 1

        System.out.println(i);
        System.out.println(j);

        // Pre increment
        int a = 1;
        int b = ++a;  // first value of a will increase by 1; b = 2, a = a++ = 2

        System.out.println(a);
        System.out.println(b);

        // Post decrement
       int m = 2;
       int n = m--;   // value of m will be given to n, n = 2, m-- = 2-1 = 1
       System.out.println("value of m:" + m);
       System.out.println("value of n:" + n);

       // pre decrement
        int p = 2;
        int q = --p;  // first p will decrease by 1 as --p = 2-1 = 1, p = 1 then value of p will be given to q = 1
        System.out.println(p);
        System.out.println(q);


    }
}
