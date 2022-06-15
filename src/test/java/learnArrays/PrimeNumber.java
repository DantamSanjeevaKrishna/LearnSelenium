package learnArrays;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num =100;
		
		for (int i=5;i<num;i++) {
			int count=0;
			for (int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}
}
