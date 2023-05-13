// Abdelrahman ahmed
// 20216681
public class Main {
    package BankSystem;

    public class Main {
        public static void main(String[] args) {
            employee emp = new employee("Abdo", 20, "Male", 5000, "IT");
            emp.PrintData();
            System.out.println("Salary: " + emp.getSalary() + ", Department: " + emp.getDepartment());

            BankAccount account1 = new BankAccount();
            account1.setBalance(1000);
            System.out.println("Balance of account1: " + account1.getBalancePlusTenPercent());

            BankAccount account2 = new BankAccount();
            account2.setBalance(500, 10);
            System.out.println("Balance of account2: " + account2.getBalancePlusTenPercent());

            customer cust = new customer("Sara", 29, "Female", 12345, "123 Main St.");
            cust.PrintData();
        }
}

//out put
//Name: Abdo, Age: 20, Gender: Male
//Salary: 5000.0, Department: IT
//Salary: 5000.0, Department: IT
//Balance of account1: 1100.0
//Balance of account2: 495.0
//Name: Sara, Age: 29, Gender: Female
