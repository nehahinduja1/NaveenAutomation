package OOPConceptPart2;

public class TestBank {
    public static void main(String[] args) {

        System.out.println(USBank.min_bal);
//        USBank.min_bal = 200;  it cannot be change

        HSBCBank hs = new HSBCBank();  // can create obje of class not interface
        hs.credit();   // override method
        hs.debit();
        hs.transferMoney();
        hs.educationLoan();  // separate method
        hs.carLoan();
        hs.mutualFund();

//        dynamic polymorphism:
//        child class object can be referred by parent interface reference var
        USBank b =  new HSBCBank();
        b.credit();
        b.debit();
        b.transferMoney();
//        b.educationLoan(); only HSBC bank separate method can be called, only overriden method can be called

        //  child class object can be referred by parent interface reference var
        BrazilBank bz = new HSBCBank();
        bz.mutualFund();



    }
}
