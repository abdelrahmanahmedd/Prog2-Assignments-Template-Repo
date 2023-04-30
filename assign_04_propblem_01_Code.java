/* 
 Name: "Abdelrahman Ahmed"
 ID:"20216681"
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        // Input the array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Output the elements less than or equal to 10
        for (int i = 0; i < n; i++) {
            if (a[i] <= 10) {
                System.out.println("A[" + i + "] = " + a[i]);
            }
        }
    }
}
