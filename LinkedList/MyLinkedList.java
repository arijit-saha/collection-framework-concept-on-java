package Com.RaveeshSir.Collection.LinkedList;

public class MyLinkedList {
	private Node first;
	private Node last;
	private int count;
	
	public void add(Object arg) {
		if(first==null) {
			first=new Node(arg);
			last=first;
			count++;
			return;
		}
		last.next=new Node(arg);
		last=last.next;
		count++;
	}
	
	public void add(int index, Object ele) {
		if(index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=new Node(ele, first);
			count++;
			//return;
		}
		Node p=first;
		for(int i=1; i<index; i++) {
			p=p.next;
		}
		p.next=new Node(ele, p.next);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public Object get(int index ) {
		if(index>=size()) throw new IndexOutOfBoundsException();
		Node p=first;
		for(int i=1; i<=index; i++) {
			p=p.next;
		}
		return p.ele;
	}
	
	public String toString() {
		if(size()==0) return "[ ]";
		String s="["+first.ele;
		Node p=first;
		while(p.next!=null ) {
			p=p.next;
			s+=", "+p.ele;
		}
		return s+"]";
	}
	
	private class Node {
		Object ele;
		Node next;
		
		Node(Object ele) {
			this.ele=ele;
		}
		
		Node(Object ele, Node next) {
			this.ele=ele;
			this.next=next;
		}		
	}
	
	
	
	//main
	public static void main(String[] args) {
		MyLinkedList mll=new MyLinkedList();
		mll.add(20);
		mll.add(60);
		mll.add(40);
		System.out.println(mll);
		mll.add(2,20);
		System.out.println(mll);
		
		for(int i=0; i<mll.size(); i++) {
			System.out.print(mll.get(i)+", ");
		}
	}
}
