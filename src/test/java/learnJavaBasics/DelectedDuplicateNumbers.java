package learnJavaBasics;

import java.util.TreeSet;

public class DelectedDuplicateNumbers {
	public static void main(String[] args) {
		int[] arr1= {1,2,2,35,65,75,88,35,65};
		TreeSet<Integer> ts=new TreeSet();
		for(Integer i:arr1)
		ts.add(i);
		System.out.println(ts);
	}
}	
