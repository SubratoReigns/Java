package dsa;

public class LinkedList {
	Node head;
	
	 public LinkedList addNode(LinkedList ll, int data) {
		Node add = new Node(data);
		Node temp = ll.head;
		
		if(ll.head == null) {
			ll.head = add;
			return ll;
		}
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = add;
		
		return ll;
	}
	 
	 void remove(LinkedList ll, int idx) {
		 Node temp = ll.head;
		 
		 if(ll.size(ll) == 1) {
			 ll.head = null;
			 return;
		
		 }
		 
		 else if(ll.size(ll) == 2 || idx == 0) {
			 if(idx == 0)
				 ll.head = temp.next;
			 	 
			 else if(idx == 1)
		         temp.next = null;
			 
			 return;
		 }
		 
		 int cnt = 0;
		 while(cnt + 1 != idx) {
			 temp = temp.next;
			 cnt++;
		 }
		 
		 Node link = temp.next;
		 temp.next = link.next;
		 link.next = null;
		 return;
		 
	 }
	 
	 public int size(LinkedList ll) {
		 Node temp = ll.head;
		 int count = 0;
		 
		 if(ll.head == null) {
			 return 0;
		 }
		 
		 while(temp != null) {
			 count++;
			 temp = temp.next;
		 }
		 return count;
	 }
	 
	 void display(LinkedList ll) {
		 Node temp = ll.head;
		 
		 while(temp != null) {
			 System.out.print(temp.data + " ");
			 temp = temp.next;
		 }
	 }
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
}
