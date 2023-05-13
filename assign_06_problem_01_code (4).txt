// Abdelrahman ahmed
// 20216681
package BankSystem;
public class Human {
    class human {
        private String Name;
        private int Age;
        private String Gender;

        human(String Name, int Age, String Gender){
            this.Name = Name;
            this.Age = Age;
            this.Gender = Gender;
        }

        void PrintData(){
            System.out.println("Name: " + Name + ", Age: " + Age + ", Gender: " + Gender);
        }

        final void Greet(){
            System.out.println("Good Morning");
        }
}
