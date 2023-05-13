// Abdelrahman ahmed
// 20216681
public class Customer {
    package BankSystem;

    class customer extends human {
        private int SSN;
        private String Address;
        private BankAccount bankAccount;

        customer(String Name, int Age, String Gender, int SSN, String Address){
            super(Name, Age, Gender);
            this.SSN = SSN;
            this.Address = Address;
            bankAccount = new BankAccount();
        }
}
