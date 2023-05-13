// Abdelrahman ahmed
// 20216681
public class BankAccount {
    private double balance;
    private String username;
    private String bankname;
    private static final String country = "Egypt";
    private static int NumOfUsers = 0;
    private static int NumOfcalls = 0;

    public BankAccount() {
        this.balance = 0;
        this.username = "";
        this.bankname = "";
        System.out.println("A new BankAccount object has been created.");
        NumOfUsers++;
    }

    public BankAccount(double initialBalance, String username, String bankname) {
        this.balance = initialBalance;
        this.username = username;
        this.bankname = bankname;
        System.out.println("A new BankAccount object has been created.");
        NumOfUsers++;
    }

    public void Deposite(double amount) {
        balance += amount;
        NumOfcalls++;
    }

    public void Withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            NumOfcalls++;
        } else {
            System.out.println("Not enough balance.");
        }
    }

    public static int getNumOfUsers() {
        return NumOfUsers;
    }

    public static int getNumOfCalls() {
        return NumOfcalls;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public String getBankname() {
        return bankname;
    }
}
