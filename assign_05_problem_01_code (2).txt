// Abdelrahman ahmed
// 20216681
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println("Balance of account1 is: " + account1.getBalance());
        System.out.println("Number of users: " + BankAccount.getNumOfUsers());
        System.out.println("Number of calls for Deposite() function: " + BankAccount.getNumOfCalls());
        System.out.println("Number of calls for Withdraw() function: " + BankAccount.getNumOfCalls());

        BankAccount account2 = new BankAccount(1000, "John Doe", "Bank of Egypt");
        account2.Deposite(500);
        account2.Withdraw(200);
        System.out.println("Balance of account2 is: " + account2.getBalance());
        System.out.println("Number of users: " + BankAccount.getNumOfUsers());
        System.out.println("Number of calls for Deposite() function: " + BankAccount.getNumOfCalls());
        System.out.println("Number of calls for Withdraw() function: " + BankAccount.getNumOfCalls());
}
