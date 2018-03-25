package Com.RaveeshSir.Collection.ArrayList;

import java.util.Scanner;

public class CollectionArrayList {
	private Object[] arr;
	private int p;
	
	public CollectionArrayList() {
		this(10);
	}
	
	public CollectionArrayList(int initialsize) {
		arr=new Object[initialsize];
	}
	
	public void add(Object arg) {
		if(p>=arr.length) increaseSize();
		arr[p++]=arg;
	}
	
	public Object get(int index) {
		if(index>size()) throw new IndexOutOfBoundsException();
		return arr[index];
	}
	
	public int size() {
		return p;
	}
	
	private void increaseSize() {
		Object[] b=new Object[(arr.length)*2];
		for(int i=0; i<arr.length; i++)
			b[i]=arr[i];
		arr=b;
	}
	
	public String toString() {
		return "[]";		
	}
	
	
	//main
	public static void main(String[] args) {
		CollectionArrayList CAL=new CollectionArrayList(5);
		Scanner KB=new Scanner(System.in);
		System.out.println("Enter the elements : ");
		int a=0;
		while(a>10) {
			System.out.println("Enter "+a+" : ");
			int val=KB.nextInt(); 
			CAL.add(val);
			a++;
		}
		System.out.print("The values are : [");
		for(int i=0; i<CAL.size(); i++) {
			System.out.print(CAL.get(i)+", ");
		}
		System.out.print("]");
		KB.close();
	}
}
