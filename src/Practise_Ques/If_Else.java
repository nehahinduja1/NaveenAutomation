package Practise_Ques;

public class If_Else {
    public static void main(String[] args) {

        int a = 30;
        int b = 20;

        // for comparision if_else

        if (b > a) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("a is greater than b");
        }

        // comparision
        // < > >= <= == !=

        int c = 40;
        int d = 40;
        if (c == d) {
            System.out.println("c and d are equal");
        } else {
            System.out.println("c and d are not equal");
        }

        // write a logic to find out the highest number

        int a1 = 100;
        int b1 = 200;
        int c1 = 300;
        int d1 = 400;
        int e1 = 900;

        // nested if else condition
        if (a1 > b1 && a1 > c1 && a1>d1 && a1>e1) {
            System.out.println("a1 is greatest");
        } else if (b1 > c1 && b1 > d1 && b1> e1) {
            System.out.println("b1 is greatest");
        } else if (c1 > d1 && c1 > e1) {
            System.out.println("c1 is greatest");
        } else if (d1 > e1) {
            System.out.println("d1 is greatest");
        } else {
            System.out.println("e1 is greatest");
    }
}

}
