package ListConcept;

import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListConcept {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        // add: it add string in comma separated []
        ll.add("test");
        ll.add("qtp");
        ll.add("selenium");
        ll.add("RPA");
        ll.add("RFT");


        // print:
        System.out.println("content of linkedList:" + ll);

        //addfirst:
        ll.addFirst("Naveen");

        // addlast:
        ll.addLast("Automation");
        System.out.println("Content of LinkedList:" + ll);

        //get:
        System.out.println(ll.get(0));
        System.out.println(ll.get(1));

        //set:
        ll.set(0, "Tom");
        System.out.println(ll.get(0));

        //remove first and last element
        ll.removeFirst();
        ll.removeLast();
        System.out.println("content of LinkedList:" + ll);

        //remove any specific element
        ll.remove(2);
        System.out.println("content of LinkedList:" + ll);

        //how to print all the values of LinkedList:
        //for loop

        System.out.println("Using for loop");
        for(int n=0; n<ll.size(); n++) {
            System.out.println(ll.get(n));
        }

        // advance for loop

        System.out.println("****Using advance for loop");
        for(String s: ll ) {
            System.out.println(s);
        }

        //iterator

        System.out.println("***using iterator");
       Iterator <String>  I = ll.iterator();
       while(I.hasNext()) {
           System.out.println(I.next());
       }

        //while loop

        System.out.println("***using while loop");
       int n = 0;
       while(ll.size() > n) {
            System.out.println(ll.get(n));
            n++;
        }














    }
}
