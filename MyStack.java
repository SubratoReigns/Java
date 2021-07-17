package dsa;



public class MyStack<E> {

	  
	  Node<E> head = null;
	  
	  void push(E data) {
		  Node<E> add = new Node<E>(data);
			Node<E> temp = head;
			
			if(head == null) {
				head = add;
				return;
			
			}
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = add;
			
			
	  }
	  
	  E pop() throws Exception{
		  Node<E> temp = head;
		  
		  if(temp == null) {
			  throw new Exception("Popping from empty list is not allowed");
			  
		  }
		  
		  else if(temp.next == null) {
			  E rres = temp.data;
			  temp = null;
			  return rres;
		  }
		  
		  while(temp.next.next != null) {
			temp = temp.next;  
		  }
		  
		  E rres = temp.next.data;
		  temp.next = null;
		  return rres;
	  }
	  
	  E peek() throws Exception{
		  Node<E> temp = head;
		  
		  if(temp == null) {
			  throw new Exception("Stack is empty unable to peek");
		  }
		  
		  while(temp.next != null) {
			  temp = temp.next;
		  }
		  
		  return temp.data;
	  }
	  
	  static class Node<E>{
			E data;
			Node<E> next;
			
			public Node(E data){
				this.data = data;
				next = null;
			}
}
}
