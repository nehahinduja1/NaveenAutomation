package Practise_Ques;

public class Array {
    public static void main (String [] args) {
        // int array
     int i[] = new int[4];
     i[0] = 10;
     i[1] = 20;
     i[2] = 30;
     i[3] = 40;

       // write a program to write all value of array for loop

    for(int j = 0; j< i.length; j++) {
        System.out.println(i[j]);
    }

    // double array

        double d[] = new double[4];
         d[0] = 50.45;
         d[1] = 60.33;
         d[2] = 70.77;
         d[3] = 80.87;

         for(int e = 0 ; e < d.length; e++) {
             System.out.println(d[e]);
         }



    }
}
