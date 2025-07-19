package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {

        ArrayList ar = new ArrayList();  // created an object

        ar.add(100);  //0
        ar.add(200);  //1
        ar.add(300);  //2

        System.out.println(ar.size());

        ar.add(400);  //3
        ar.add(500);  //4

        System.out.println(ar.size());

        ar.add("Tom");  //5
        ar.add("Hello"); //6
        ar.add(12.33);  //7
        ar.add('M');  //8
        ar.add(600); //9

        System.out.println(ar.size());

        ar.remove(9);
        System.out.println(ar.size());


        System.out.println(ar.get(4));
//        System.out.println(ar.get(9));

//        to print all the value of Arraylist: For loop

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        // If u want to restrict arraylist (only int value or only double etc.)
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(100);
//        a1.add("Tom");
        a1.add(1233);

        ArrayList<String> a2 = new ArrayList<String>();
//    a2.add(564);
        a2.add("Rakhi");
        a2.add("hello world");


    }
}