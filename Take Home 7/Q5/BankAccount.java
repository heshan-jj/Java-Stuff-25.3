package Q5;

public class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    void showDetails(){
        System.out.println("Account: " +accountNumber+ " Holder: " +holderName+ " Balance " +balance);
    }

    void deposit( double amount){
        balance = balance + amount;
        
    }
}
