package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"john","Tester");
		Employee e2=new Employee(102,"Sanjeev","AutomationTester");
		Employee e3=new Employee(103,"raj","Developer");
		
		ArrayList<Employee> emptyList=new ArrayList<Employee>();
		emptyList.add(e1);
		emptyList.add(e2);
		emptyList.add(e3);
		System.out.println(emptyList);
	}
}
