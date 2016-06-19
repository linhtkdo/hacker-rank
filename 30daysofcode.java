import java.util.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class IO {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
      String inputString = scan.nextLine(); // read a line of input and save it to a variable
      scan.close(); // close the scanner
      
      // Your first line of output goes here
      System.out.println("Hello, World.");
      
      System.out.println(inputString);
   }
}
public class IO2 {
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
public class Arithmetic {
// Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent 
// (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Calculate Tax and Tip:
        double tip = mealCost * tipPercent / 100; // mixed double and int -- int converted to double
        double tax = mealCost * taxPercent / 100;
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tax + tip); // cast return-value (long) to (int)
      
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
public class Weird {
// If n is odd, print Weird
// If n is even and in the inclusive range of 2 to 5, print Not Weird
// If n is even and in the inclusive range of 6 to 20, print Weird
// If n is even and greater than 20, print Not Weird
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); 
      sc.close();
      
      // Weird: odd or (even) 6...20; Not weird: otherwise
      System.out.println( ((n % 2) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
   }
}
public class Person { // class: a blueprint defining the characteristics and behaviors of an object of that class type
   private int age;	// instance variable
  
	public Person(int initialAge) { // overloaded constructor: takes parameters
  		// Add some more code to run some checks on initialAge
      if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else this.age = initialAge;
	}

	public void amIOld() { // method
  		// Write code determining if this person's age is old and print the correct statement:
        if (age < 13) System.out.println("You are young.");
        else if (age >= 18) System.out.println("You are old.");
        else System.out.println("You are a teenager.");
	}

	public void yearPasses() { // method
  		// Increment this person's age.
        this.age++;
	}
}
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
class Maps{
	
Sample Input
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

Sample Output
sam=99912222
Not found
harry=12299933	

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> m = new HashMap<String, Integer>(); // Make an empty map
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            m.put(name, phone); // Add the key/value pairs; if the Key is already in the map, the Value is overwritten. 
            
        }
        // Each line (query) contains a name to look up, and you must continue reading lines until there is no more input.
        while(in.hasNext()){  
            String s = in.next();
            
            // containsKey(Object key) tests if the given key is in the map, returning a boolean.
            // get(Object key) Returns the value to which the key is mapped; returns null if there is no such mapping.
            System.out.println(m.containsKey(s) ? s + "=" + m.get(s) : "Not found");
        }
        in.close();
    }
}


