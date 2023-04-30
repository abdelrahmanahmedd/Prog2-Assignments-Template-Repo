/* 
 Name: "Abdelrahman Ahmed"
 ID:"20216681"
*/
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
        input.close();
    }
}
