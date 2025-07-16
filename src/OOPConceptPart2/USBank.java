package OOPConceptPart2;

public interface USBank {

    int min_bal = 100;   // static in nature and final in nature

    public void credit();

    public void debit();

    public void transferMoney();

    // only method declaration
//    No method body - only method prototype
//     In interface, we can declare the variables, var are by default static in nature
//    var value will not be changed, its final/constant in nature
//    No static method in interface
//    no main method in interface
//    we cannot create the object of Interface
//    Interface is abstract in nature (abstract- cannot create object)







}
