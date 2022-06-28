package frequentlyAskingprograms;

import java.util.TreeSet;

public class DuplicateNumberss {

	public static void main(String[] args) {
		int[] a= {12,55,35,53,55,1,2,2,35,44};
		TreeSet ts=new TreeSet();
		for(int i=0;i<a.length;i++) {
			ts.add(a[i]);
		}
		System.out.println(ts);
	}
}
