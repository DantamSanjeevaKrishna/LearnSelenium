package learnJavaBasics;

import java.util.LinkedHashSet;

public class DelectedDuplicateInteger {
	public static void main(String[] args) {

	int[] i= {12,52,56,52,12,213,25,235,25};
	LinkedHashSet ls=new LinkedHashSet();
	for(int j=0;j<i.length;j++) {
		ls.add(i[j]);
	}
	System.out.println(ls);
}
}