package Com.RaveeshSir.Collection.StackAndQueue;

import java.util.Scanner;

public class QueueImplementationUsingArray {
	
	private int size=3;
	int[] arr=new int[size];
	int front=-1, rear=0;
	
	//push
	public void push(int ele) {
		if(front<size-1) {
			front++;
			arr[front]=ele;
			System.out.println(+ele+" pushed into the stack");
		}
		else {
			System.out.println("Stack overflow");
		}
	}
	
	//pop
	public void pop(int ele) {
		if(front>=rear) {
			rear--;
			System.out.println("Pop operation done");
		}
		else {
			System.out.println("Stack underflow");
		}
	}
	
	//display
	public void printElement() {
		if(front>=0) {
			System.out.println("Elements in stack : ");
			for(int i=rear; i<=front; i++) {
				System.out.println(arr[i]);
			}
		}
		else {
			System.out.println("Empty queue");
		}
	}
	
	
	//main
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		int n=3;
		System.out.println("Enter the elements : ");
		int[] ele=new int[n];
		for(int i=0; i<n; i++) {
			ele[i]=KB.nextInt();
		}
		QueueImplementationUsingArray QI=new QueueImplementationUsingArray();
		
		//push
		for(int i=0; i<ele.length; i++) {
			QI.push(ele[i]);
		}
		QI.printElement();
		
		//pop
		for(int i=0; i<ele.length; i++) {
			QI.pop(ele[i]);
		}
		
	KB.close();
	}

}
