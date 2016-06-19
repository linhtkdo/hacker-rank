import java.io.*;
import java.util.*;
public class Compare {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // The first line contains a string . The second line contains another string .
        String A = sc.next();
        String B = sc.next();
        sc.close();
        
        System.out.println( A.length() + B.length() );
        
        // Write Yes if  is lexicographically larger than  or No if it is not. 
        // variable x = (expression) ? value if true : value if false
        System.out.println( (A.compareTo(B) > 0) ? "Yes" : "No"); 
        
        // capitalize the first letter in both
        System.out.println(
            A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
            B.substring(0, 1).toUpperCase() + B.substring(1)
        );
    }
}
public class FunnyString {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++) { // step through all test cases
            String s = sc.next();
            int flag = 0; // assume string is funny
            
            int j = 0; // init: s[j] (ASCII val) from start of tring
            int k = s.length() - 1; // s[k] from end of string
            
            while (j < s.length() - 1) { // step through chars
                int first = (int)s.charAt(j); // cast char to int = ASCII value
                int sec = (int)s.charAt(j+1);
                int last = (int)s.charAt(k);
                int secLast = (int)s.charAt(k-1);
                
                if (Math.abs(first - sec) != Math.abs(last - secLast)) { // compare: abs diff s[i] - s[i+1] && s[k] - s[k-1]
                    flag = 1; // if not equal, string is not funny, then stop the loop
                    break;
                }
                j++;
                k--;
            }
            System.out.println(flag==0 ? "Funny" : "Not Funny");
           
        }
        sc.close();
 
    }
}
