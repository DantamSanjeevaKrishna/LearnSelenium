package learnArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {
	public static void main(String[] args) {
		Integer[] arr= {55,44,65,98};
		ArrayList al=new ArrayList();
		List<Integer> list=Arrays.asList(arr);
		System.out.println(list);
		
		
	}
}
