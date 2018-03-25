package Com.RaveeshSir.Collection.StackAndQueue;

import java.util.Scanner;

public class StackImplementationUsingArray {
	
	private int size=3;
	int[] arr=new int[size];
	int front=-1;
	
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
	
	public void pop(int ele) {
		if(front>=0) {
			front--;
			System.out.println("Pop operation done");
		}
		else {
			System.out.println("Stack underflow");
		}
	}
	
	public void printElement() {
		if(front>=0) {
			System.out.println("Elements in stack : ");
			for(int i=0; i<=front; i++) {
				System.out.println(arr[i]);
			}
		}
		else {
			System.out.println("Empty stack");
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
		StackImplementationUsingArray SI=new StackImplementationUsingArray();
		
		//push
		for(int i=0; i<ele.length; i++) {
			SI.push(ele[i]);
		}
		SI.printElement();
		
		//pop
		for(int i=0; i<ele.length; i++) {
			SI.pop(ele[i]);
		}
		SI.printElement();
		
	KB.close();
	}

}
