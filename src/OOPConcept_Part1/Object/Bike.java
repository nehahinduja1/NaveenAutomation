package OOPConcept_Part1.Object;

public class Bike {
// class var

    int mod;
    int wheel;

    public static void main(String[] args) {
      Bike a = new Bike();
      Bike b = new Bike();
      Bike c = new Bike();

      a.mod = 2025;
      a.wheel = 2;

      b.mod = 2024;
      b.wheel = 2;

      c.mod = 2022;
      c.wheel = 2;

      System.out.println("Before assigning the references");

      System.out.println(a.mod);
      System.out.println(a.wheel);

      System.out.println(b.mod);
      System.out.println(b.wheel);

      System.out.println(c.mod);
      System.out.println(c.wheel);

        System.out.println("After shifting the references");

        a=b;
        b=c;
        c=a;

        a.mod = 10;
        System.out.println(a.mod); //10
        c.mod = 20;
        System.out.println(a.mod); //20
        System.out.println(c.mod); // 20



    }

}
