package frequentlyAskingprograms;

import java.util.TreeSet;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] a= {12,45,86,75,42,45,1,5,5,42};
		TreeSet ts=new TreeSet();
		for(int i=0;i<a.length;i++) {
			ts.add(a[i]);
		}
		System.out.println(ts);
		
	}
}
