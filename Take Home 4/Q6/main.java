package Q6;

public class main {
    public static void main(String[] args) {
        BankAccount heshan = new BankAccount(1001, "Heshan", 67000.67);
        BankAccount denuri = new BankAccount(1002, "Denuri", 120000.00);

        System.out.println(heshan.withdraw(10000.67 ));
        System.out.println(denuri.withdraw(20000.90));

        heshan.deposit(5000);
        denuri.deposit(25000);

        System.out.println(heshan.getaccountinfo("Malkaduwawa"));
        System.out.println(denuri.getaccountinfo("Kurunegala"));

        System.out.println(heshan.getBalance());
        System.out.println(denuri.getBalance());
    }
}
