package learnArrays;

public class ReverseNumber {
	public static void main(String[] args) {
		int reverse=0;
		for(int num=568565284;num!=0;num=num/10) {
			int remainder=num%10;
			reverse=reverse*10+remainder;
		}
		System.out.println("The reverse of the number "+reverse);	
	}
}
