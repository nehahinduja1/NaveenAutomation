package OOPConcept_Part1.Object;

public class CallByValue {
    public static void main(String[] args) {
       CallByValue obj = new CallByValue();
       int x = 10;
       int y = 20;
       obj.testSum(x,y); // Call by value or pass by value (It will not change)

}
   public int testSum(int a, int b){    // copy of x, y is given to a,b
        a = 30; // if we are making changes here
        b = 40;
        int c = a +b;  // 30+40= 70
        return c;
   }
}
