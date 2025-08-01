package Practise_Ques;

public class Nested_if_else_condition {
    public static void main(String[] args) {
        int a = 50, b = 80, c = 60;

        if (a>b) {
            if(a>c) {
                System.out.println("a is largest");
            }
            else{
                System.out.println("c is largest");
            }


        } else {
            if(b>c) {
               System.out.println("b is greatest");
            } else{
                System.out.println("c is greatest");
            }

        }


    }
}

