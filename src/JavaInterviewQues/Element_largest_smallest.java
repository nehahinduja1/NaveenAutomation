package JavaInterviewQues;

import java.util.Arrays;

public class Element_largest_smallest {
 public static void main (String[]args) {
     int[] number = {10, 24, 56, -89, 47, 987, 845, -65};

     int largest = number[0];
     int smallest = number[0];  // For loop -> If-else

     for(int i=0; i < number.length; i++) {
         if(number[i] > largest){
             largest = number[i];
         }
         else if(number[i] < smallest){
             smallest = number[i];
         }

     }

     System.out.println("Given numbers:" + Arrays.toString(number));
     System.out.println("Largest number:" + largest);
     System.out.println("Smallest number:" + smallest);
    }

}
