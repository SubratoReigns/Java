package dsa;

public class StackImp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyStack<Integer> st = new MyStack<>();
		st.push(15);
		st.push(24);
		st.push(36);
		int popped = st.pop();
		System.out.println(popped);
		int peeked = st.peek();
		System.out.println(peeked);
	}

}
