package dsa;

public class LinkedList_Object_Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		ll.addNode(ll, 5);
		ll.addNode(ll, 2);
		ll.addNode(ll, 3);
		ll.addNode(ll, 4);
		ll.addNode(ll, 5);
		ll.remove(ll, 4);

		//System.out.println(ll.size());
		ll.display(ll);
		
	}

}
