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
