package OOPConcept_Part1.Object;

public class CallByValCallByRef {

    int p;
    int q;

    public static void main(String[] args) {

        CallByValCallByRef obj = new CallByValCallByRef();
        int x = 10;
        int y = 20;
        obj.testSum(x,y);  // call by value  or pass by value (copy of x,y is given to a, b)

        obj.p = 50;  // initialize using obj reference
        obj.q = 60;

        obj.swap(obj);
        // after swap
        System.out.println(obj.p);
        System.out.println(obj.q);
    }

    public int testSum(int a, int b) {
        a = 30;
        b = 40;
        int c = a+b;
        return c;

    }

    // call by reference
    public void swap(CallByValCallByRef t){
        int temp;
        temp = t.p; // temp = 50
        t.p = t.q;  // t.p = 60
        t.q = temp;  // t.q = 50
    }





}
