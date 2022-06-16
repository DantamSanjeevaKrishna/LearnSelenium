package learnArrays;

import java.util.ArrayList;
import java.util.List;

public class ArraylisttoArray {
	public static void main(String[] args) {
		List<Integer> arr=new ArrayList();
		arr.add(12);arr.add(56);arr.add(63);
		Object[] ar = arr.toArray();
		
		System.out.println(ar.length);
		
		
		
		
	}
}
