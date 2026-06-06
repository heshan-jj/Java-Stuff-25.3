package Q6;

public class BankAccount {
    int acno;
    String name;
    double balance;

    BankAccount(int acno, String name, double balance){
        this.acno = acno;
        this.name = name;
        this.balance = balance;

    }
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposit of Rs" + amount + " successful");

     }
    String withdraw(double amount2){
        if(amount2 < balance){
            balance = balance - amount2;
            return "Withdrawal successful. Remaining balance: " + balance ;
        }else{
            return "Insufficient funds.";
        }
    }

    double getBalance(){
        return balance;
    }
    String getaccountinfo(String branch){
        return acno + " " + name + " " + branch;
    }
}
