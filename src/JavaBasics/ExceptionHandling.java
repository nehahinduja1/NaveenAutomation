package JavaBasics;

public class ExceptionHandling {
//    int a = 10;
//    static ExceptionHandling obj;

    public static void main(String[] args) {

        // uncaught exception
//        int i = 9/0;
//        System.out.println(i);
//

//        Caught exception
//        Thread.sleep(2000);

//        System.out.println(obj.a);

//    1. try-catch block:
        try {
            int i = 9 / 0;   // this code will throw an exception
        } catch (Throwable e) {    // Error can also be written else just write Throwable
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("hey -- this/ by zero error");

        }
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");

    }






    }
