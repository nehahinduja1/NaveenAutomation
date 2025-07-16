package OOPConcept_Part1.Object;

public class CallByRef {
     int p;
     int q;   // non static global var

    public static void main(String[] args) {
        CallByRef obj = new CallByRef();
        obj.p = 50;
        obj.q = 60;

        obj.swap(obj);   // call function swap, will pass obj as it is object ref variable bec t is class ref
//        after swap p should be 60 q should be 50
        System.out.println(obj.p);
        System.out.println(obj.q);

    }

    //Call By reference - we are passing the value of object
    public void swap(CallByRef t) {  // In swap method will pass the ref var t of class Callbyref
      int temp;   // created third variable temp bec I have to swap
      temp = t.p;  // temp = 50
      t.p = t.q;   // t.p = 60
      t.q = temp;  // t.q = 50

    }

// Is it possible by call by ref in java yes using object references
    
    
    
}





