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
