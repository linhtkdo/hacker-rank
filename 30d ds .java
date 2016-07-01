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
public class hourGlass {
// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0

// a b c
//   d
// e f g

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int max = -63, sum; // every value in  will be in the inclusive range of -9 to 9 => min of glass = -9 * 7

        for (int i=1; i < 5; i++) {
            for (int j=1; j < 5; j++) {
                sum = arr[i][j] + arr[i-1][j] + arr[i-1][j-1] + arr[i-1][j+1]
                        + arr[i+1][j] + arr[i+1][j-1] + arr[i+1][j+1];
                if (sum > max) max = sum;
            }
        }
        System.out.println(max);
            
    }
}
public class palindrome {
// str to check: racecar
// add each ch to stack and queue
// pop() from last ch; dequeue() from first ch
// now compare

    Stack<Character> stack = new Stack();
    Queue<Character> queue = new LinkedList();
    
    void pushCharacter(char ch) {
        stack.push(ch);
    }
    
    void enqueueCharacter(char ch) {
        queue.add(ch);
    }
    
    char popCharacter() {
        return stack.pop();
    }
    
    char dequeueCharacter() {
        return queue.remove();
    }
}
    
