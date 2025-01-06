package Section_7_OOP_Part_1_Inheritance;

public class ClassesChallenge {

    private int accountNumber; // default: 0
    private double balance; // default: 0.0
    private String customerName; // default: null
    private String email; // default: null
    private String phoneNumber; // default: null

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double depositFunds){
        this.balance += depositFunds;
        System.out.println(getCustomerName() + ":");
        System.out.println("You deposited $" + depositFunds + " into your account");
        System.out.println("You currently have $" + getBalance());
    }

    public void withdraw(double withdraw){
        System.out.println(getCustomerName() + ":");
        if(balance - withdraw < 0){
            System.out.println("Insufficient funds");
            System.out.println("You currently have $" + getBalance());
        }
        else{
            this.balance -= withdraw;
            System.out.println("You withdrew $" + withdraw + " from your account");
            System.out.println("You now have $" + getBalance() + " in your account");
        }
    }
}
