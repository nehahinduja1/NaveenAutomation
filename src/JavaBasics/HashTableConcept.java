package JavaBasics;

import java.util.Hashtable;
public class HashTableConcept {
    public static void main (String[]args) {

        Hashtable h = new Hashtable();

        h.put("A","Test");
        h.put("B", "Hello");
        h.put("C","World");

        System.out.println(h.size());

        h.put(1,100);
        h.put(2,200);

        System.out.println(h.size());
        System.out.println(h.get(2));
        System.out.println(h.get("C"));

        h.put(3,"Tom");

        System.out.println(h.get(3));

//        If we want to restrict to integer or string etc

        Hashtable <Integer, Integer> h1 = new Hashtable< Integer, Integer> ();
        h1.put(1, 200);
//        h1.put(2, kajal);

        Hashtable <String, String> h2 = new <String, String> Hashtable();
        h2.put("Riya", "Is good girl");
//        h2.put("aarti", 350);

        Hashtable <Integer, String> h3 = new Hashtable <Integer, String>();
        h3.put(56, "Kiran");
//        h3.put("riya", 5640);


    }
}
