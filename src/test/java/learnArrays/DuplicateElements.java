package learnArrays;

public class DuplicateElements {
	public static void main(String[] args) {
		int[] arr1= {1,56,78,5,6,4,56,1,25,85,78};
		System.out.println("Duplicate Elements in Array ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					System.out.print(" "+arr1[j]);
				}
			}
		}
		
	}
}
