package JavaBascis;

public class LoopsConcept {
    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);

        // 1 . While loop
//        dis adv of while loop - it will generate infinite loop if u dont give incremental/decremental part

        int i = 0;  // intialization
        while(i< 10) { // conditional part
            System.out.println(i);
            i = i+1;  // incremental/ decremental
        }

        System.out.println("***********");

        //2. For loop
        // j++ = j +1
        for(int j = 0; j <= 10; j++)  // initialization, conditional , incremental
        {
            System.out.println(j);
        }


        System.out.println("***********");

        // print 10 to 1

       for(int k = 10; k>=-10; k--) {  // k> 0
           System.out.println(k);
       }





    }
}