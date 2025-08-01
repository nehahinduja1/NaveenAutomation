package Practise_Ques;

public class ifcond_temp_Var_max {
    public static void main (String[] args) {

        int a = 100, b = 300, c= 200, d= 670, e = 400, f=150;

       int max = a; // initially assume as is maximum

        if( b > max){
            max = b;
        }
        if( c > max) {
            max = c;
        }
        if( d > max) {
            max = d;
        }
        if(e > max) {
            max = e;
        }
        if( f > max) {
            max = f;
        }

        System.out.println("The largest number is:" + max);


    }
}
