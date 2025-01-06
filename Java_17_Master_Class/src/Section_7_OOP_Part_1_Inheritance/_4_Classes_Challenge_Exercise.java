package Section_7_OOP_Part_1_Inheritance;

public class _4_Classes_Challenge_Exercise {
    /*
        Create a new class for a bank account

        Create fields for account characteristics like:
            account number
            account balance
            customer name
            email
            phone number

         Create getters and setters for each field.

         Create two additional methods:
            one for depositing funds into the account.
            one for withdrawing funds from the account.

         A customer should not be allowed to withdraw funds if that withdrawal takes their balance negative

         Create a new project called ClassesChallenge with the usual Main clas with the usual main method.

         You'll create an instance of an Account class and then test your withdraw and deposit methods.

         You'll print information to the console that confirms what the balance is after the methods are called.
     */

    public static void main(String[] args) {

        ClassesChallenge kassie = new ClassesChallenge();

        kassie.setAccountNumber(241597632);
        kassie.setEmail("kassie.j.whitney92@gmail.com");
        kassie.setPhoneNumber("360-250-4332");
        kassie.setBalance(1200);
        kassie.setCustomerName("Kassie Whitney");

        System.out.println(kassie.getBalance());

        kassie.withdraw(3200);

        System.out.println(" ");

        kassie.deposit(1200);

        System.out.println(" ");

        /*
            1200.0
            Kassie Whitney:
            Insufficient funds
            You currently have $1200.0

            Kassie Whitney:
            You deposited $1200.0 into your account
            You currently have $2400.0

         */

    }
}
