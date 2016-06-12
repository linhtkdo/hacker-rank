import java.io.*;
import java.util.*;
public class Reverse {
Sample Input
4
1 4 3 2
Sample Output
2 3 4 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];
        
        // Write each element of input into an array.
        for (int i=0; i<len; i++) {
            a[i] = sc.nextInt();
        }
        // Iterate through the array in reverse, printing each element as you go.
        for (int i=len-1; i>=0; i--) {
            System.out.print(a[i] + " ");
        }
        
        sc.close();
    }
}
