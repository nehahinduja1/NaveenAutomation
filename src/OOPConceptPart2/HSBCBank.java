package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank { // we are achieving multiple inheritance
// Is-a relationship

//    If a class is implementing any Interface, then its mandatory to define/override all the methods of Interface
// overriding from USBank

    public void credit() {
        System.out.println("hsbc credit");
    }

    public void debit() {
        System.out.println("hsbc debit");
    }

    public void transferMoney() {
        System.out.println("Transfer money");
    }

    //Separate method of HSBCbank class
    public void educationLoan() {
        System.out.println("education loan");
    }

    public void carLoan() {
        System.out.println("car loan");
    }

    // brazil bank method: overriding from Brazilbank

    public void mutualFund() {
        System.out.println("mutual Fund");
    }
}
