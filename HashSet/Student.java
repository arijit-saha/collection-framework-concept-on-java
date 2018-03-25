package Com.RaveeshSir.Collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Student {
	String name;
	int std;

	Student(String name, int std) {
		this.name=name;
		this.std=std;
	}
	
	public int hashcode() {
		return std; 
	}
	
	public boolean equals(Object arg) {
		if(!(arg instanceof Student)) return false;
		Student s=(Student)arg;
		return name.equals(s.name) && std==s.std;
	}
	
	public String toString() {
		return "Student [name = "+name+", std = "+std+"]"; 
	}
	
	
	//main
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(new Student("chinnu", 6));
		s.add(new Student("munnu", 3));
		s.add(new Student("chinnu", 6));
		
		for(Object pos:s)
			System.out.println(pos);
		
		System.out.println("Size : "+s.size());
	}
}
