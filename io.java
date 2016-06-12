import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
      String inputString = scan.nextLine(); // read a line of input and save it to a variable
      scan.close(); // close the scanner
      
      // Your first line of output goes here
      System.out.println("Hello, World.");
      
      System.out.println(inputString);
   }
}
public class Solution {
Input Format
The first line contains an integer, . 
The second line contains a double, . 
The third line contains a string, .

Output Format
Print the sum of both integers on the first line, the sum of both doubles on the second line, 
and then the two concatenated strings on the third line.
   
   public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
      
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;
        
        /* Read and save an integer, double, and String to your variables.*/
        i2 = scan.nextInt(); // Scans the next token of the input as an int.
        d2 = scan.nextDouble(); // Scans the next token of the input as a double.
        scan.nextLine(); // read the rest of the line of input (newline character after the double token).
        s2 = scan.nextLine();
       
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d2);
      
        /* Concatenate and print the String variables on a new line integer variables on a new line; 
           the 'string` variable above should be printed first. */
        System.out.println(s + s2);
        
        scan.close();
   }
}

