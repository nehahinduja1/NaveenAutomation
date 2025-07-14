package JavaBascis;

public class IncrementandDecrementOperator {

    public static void main(String[] args) {
        // ++
//        --

        int i = 1;
        int j = i++;   // post increment-> value of i will be given to j then it will be increased

        System.out.println(i);
        System.out.println(j);

        int a = 1;
        int b = ++a;  // pre increment -> increase value of a by 1 then give it to a
        System.out.println(a);
        System.out.println(b);

        int m = 2;
        int n = m--;  // post decrement
        System.out.println(m);
        System.out.println(n);

        int p = 2;
        int q = --p;  // pre decrement
        System.out.println(p);
        System.out.println(q);

    }
}
