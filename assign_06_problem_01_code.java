// Abdelrahman ahmed
// 20216681
public class BankAccount {
    package BankSystem;

    final class BankAccount {
        private double balance;

        double getBalance(){
            return balance;
        }

        void setBalance(double balance){
            if(balance < 0 || balance > 1000000){
                System.out.println("Invalid balance value!");
                return;
            }
            this.balance += balance;
        }

        void setBalance(double balance, double Tax){
            double newBalance = balance - (balance * (Tax/100));
            if(newBalance < 0 || newBalance > 1000000){
                System.out.println("Invalid balance value!");
                return;
            }
            this.balance += newBalance;
        }

        double getBalancePlusTenPercent(){
            return balance + (balance * 0.1);
        }
}
