package learnArrays;

import java.util.Arrays;

public class SortArray1 {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,5,6,77};
		System.out.println(" After sort the given array ");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
