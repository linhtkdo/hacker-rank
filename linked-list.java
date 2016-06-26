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

