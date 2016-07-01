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
public class binaryNum {
// For example: (4)10 → (?)2. The remainders form (100)2 (the binary equivalent of (4)10) when read from the bottom up: 
// 4 ÷ 2 = 2 remainder 0 ↑ 
// 2 ÷ 2 = 1 remainder 0 ↑ 
// 1 ÷ 2 = 0 remainder 1 ↑ 
// To convert an integer, n, from decimal to a String of binary numbers in Java, you can use the Integer.toBinaryString(n) function. 
	
// Given a base-10 integer, n, convert it to binary (base-2). 
// Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int max = 0, count = 0, rem = 0;
        
        while (n > 0) {
            rem = n % 2; // The remainder at each step of division is a single digit of the binary equivalent of n
            if (rem == 1) {
                count++;
                if (count > max) max = count;
            }
            else count = 0;
            n = n/2; // To convert an integer from decimal to binary, repeatedly divide your base-10 number, n, by 2.
        }
        System.out.println(max);
    }
}
class Person {
	
	// instance variables
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
// You are given two classes, Person and Student, where Person is the base class and Student is the derived class. 
// Observe that Student inherits all the properties of Person.

// A Student class constructor, which has  parameters:
// A string, firstName.
// A string, lastName.
// An integer, id.
// An integer array (or vector) of test scores, testScores.

// A char calculate() method that calculates a Student object's average and 
// returns the grade character representative of their calculated average

	private int[] testScores;
    
    public Student(String first, String last, int id, int[] scores) {
        super(first, last, id); // call to superclass' constructor
        this.testScores = scores;
    }
    
    public char calculate() {
        int avg = 0;
        for (int score: testScores) avg += score;
        
        avg /= testScores.length;
        
        if (avg >= 90) return 'O';
        if (avg >= 80) return 'E';
        if (avg >= 70) return 'A';
        if (avg >= 55) return 'P';
        if (avg >= 40) return 'D';
        return 'T';
    }
}
class printStudent {
// Sample Input
// 	Heraldo Memelli 8135627
// 	2
// 	100 80
// Sample Output
//  	Name: Memelli, Heraldo
//  	ID: 8135627
//  	Grade: O

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
class Difference {
	private int[] elements;
	public int maximumDifference;
	
	// save the argument passed as its integer array parameter to the integer array instance variable
	Difference(int[] elts) { 
		this.elements = elts;
	}
	
	
	void computeDifference() { 
       int max = 1; // set max to its minimum possible value set by Constraints 
       int min = 100; 
       
       // access the the integer array instance variable () and find its maximum and minimum elements.
       for (int elt: elements) {
           if (elt < min) min = elt;
           if (elt > max) max = elt;
       }
       
       // save their absolute difference to the instance variable. 
       this.maximumDifference = max - min; 
	}
}
public class StringtoIntException {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner (System.in);) {
			System.out.println( Integer.parseInt(sc.next()) );
		} 
		catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}
}
class Calculator {
    int power(int n, int p) throws Exception{
        if (n < 0 || p < 0) throw new Exception("n and p should be non-negative");
        return (int)Math.pow(n, p);
    }
}
