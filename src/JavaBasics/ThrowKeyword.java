package JavaBasics;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("ABC");

        try {
            throw new Exception("Naveen Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("PQR");

        String Exce_Flag = "N";
        if(Exce_Flag.equals("N")) {
            try {
                throw new Exception("Exec flag is No Exception");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Test");
    }
}