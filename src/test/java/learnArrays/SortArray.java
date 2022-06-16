package learnArrays;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] a= {25,12,36,58,45,11,8};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}
}
