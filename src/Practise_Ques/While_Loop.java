package Practise_Ques;

public class While_Loop {

    // Write a program to print top 10 positive integer numbers

    // dis adv of while loop it will generate infinite while loop if u don't give increment or decrement part
    public static void main (String[] args) {
         int i = 1;           // Declare
         while(i <= 10) {     // condition
             System.out.println(i);  // print
             i = i +1;              // Increment/ decrement
         }
    }

}
