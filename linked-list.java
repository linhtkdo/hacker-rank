class Node {
	int data;
	Node next;
	
	Node(int d) {
        data = d;
        next = null;
    }
}
public static Node insert(Node head,int data) {

	// Create a new node corresponding to data
	Node n = new Node(data);
	
	// if list has no elements, return new node as head
        if (head == null) return n; 
        
        // else iterate through list, add node to tail, and return head
        Node temp = head;
        while (temp.next != null) temp = temp.next; 
        temp.next = n;
        return head;
    }

void Print(Node head) {
	// To print the elements of a linked list, we need to traverse the entire list and print the value of every node.
	// The basic idea behind traversing the linked list is to follow the next pointers untill NULL is encountered. 
	Node temp = head;
	while (temp != null) {
		System.out.println(temp.data);
		temp = temp.next;
	}
}
Node Delete(Node head, int position) {
// 0-->1-->2-->3-->4 ...want to delete 3
// (0, 3) calls (1, 2) calls (2, 1) calls (3, 0) returns 4
// so 2.next = 4. end of recursion
// then return head ref

    if (position == 0) return head.next;
    head.next = Delete(head.next, position - 1);
    return head;
}
void ReversePrint(Node head) {
// [1] --> [2] --> [3]
// (1) calls (2) calls (3) calls null--do nothing. end of recursion
// go back up: (3) -- print[3] -> (2) -- print[2] -> (1) print [1]

   if (head != null) {
   		ReversePrint(head.next);
   		/*----------------------------------------------
        The recursion will get "stacked" right here!
        The code below this area will not get called
        until we go back up through the recursive stack.
        -----------------------------------------------*/
   		System.out.println(head.data);
   }
}
Node Reverse(Node head) {
// [1] --> [2] --> [3] --> null
// (1) calls (2) calls (3) returns 3. end of recursion
// go back up: (2) -- newHead = 3 -- 2.n.n = 3.n = 2 -- 2.n = null -- returns 3 
//             (1) -- newHead = 3 -- 1.n.n = 2.n = 1 -- 1.n = null -- returns 3

    if (head == null || head.next == null) {
        return head;
    }

    Node newHead = Reverse(head.next); 
    /* When the recursion creates the stack for A -> B -> C
   	(RevA(RevB(RevC()))) it will stop at the last node and
   	the recursion will end, beginning the unraveling of the
   	nested functions from the inside, out. 
	-----------------------------------------------------*/
    head.next.next = head; 
    head.next = null; 

    return newHead;
}
