import java.util.*;
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

