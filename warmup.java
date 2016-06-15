bigSum
A signed 32−bit integer value uses the 1st bit to represent the sign of the number and the remaining 31−bits to represent the magnitude. 
When we add several integer values, the resulting sum might exceed this range. Use long long in C/C++ and long in Jav

public class Staircase {
Sample Input
6 
Sample Output
     #
    ##
   ###
  ####
 #####
######
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.close();
        
        for (int i=1; i<=len; i++) { // row (i)
        	int j = len;
        	
        	// loop to print (size - i) spaces
        	while (j-- > i) System.out.print(" "); // do something then subtract 1 from j
        	
        	// loop to print (i) #s
        	while (j-- >= 0) System.out.print("#");
        	
            	System.out.println();
        }
       
    }
}
