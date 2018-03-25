package Com.RaveeshSir.Collection.StackAndQueue;

class StackImplementationUsingLinkedList {

	private Node first;
	private Node last;
	private int size;
	private int temp = 0;

	/*public StackImplementationUsingLinkedList(){
		System.out.println("Enter the max size of stack using parameterized cons.");
		System.exit(0);
	}*/
	
	public StackImplementationUsingLinkedList(int max) {
		size=max;
	}

	public void push(Object arg) {
		if(temp>=size) {
			System.out.println("Stack is full");
			return;
		}
		if(temp==0) {
			first = new Node(arg);
			temp++;
			last=first;
			return;
		}
		last.next=new Node(arg);
		last=last.next;
		temp++;
	}
	
	public boolean isEmpty() {
		if(temp==0)
			return true;
		return false;
	}
	
	public Object pop() {
		if(isEmpty()) {
			System.out.println("No element");
			return null;
		}
		Object ob=last.ele;
		Node pt=first;
		for(int i=0;i<temp-2;i++) {
			pt=pt.next;
		}
		pt.next=null;
		last=pt;
		temp--;
		return ob;
	}

	public Object peek() {
		if(isEmpty()) {
			//System.out.println("No element");
			return null;
		}
		return last.ele;
	}

	public String toString() {
		if(temp==0)
			return "[ ]";
		String str="["+first.ele;
		Node p=first;
		while(p.next!=null) {
			p=p.next;
			str+=","+p.ele;
		}
		return 	str+"]";
	}
	
	public class Node {
		Object ele;
		Node next;
		
		public Node(Object ar) {
			ele=ar;
		}
		
		public Node(Object ar, Node n) {
			ele=ar;
			next=n;
		}	
	}
	
	
	public static void main(String[] args) {
		
		StackImplementationUsingLinkedList s1 = new StackImplementationUsingLinkedList(5);
		s1.push(20);
		s1.push(70);
		s1.push(50);
		s1.push(90);
		s1.push(80);
		System.out.println(s1);
		/*s1.push(70);
		System.out.println(s1.pop());
		s1.push(70);
		System.out.println(s1);	
		s1.push(89);*/
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1);
		/*s1.push(100);
		s1.push(200);
		s1.push(300);
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1);*/
	}
}