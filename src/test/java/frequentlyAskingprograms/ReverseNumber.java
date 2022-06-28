package frequentlyAskingprograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int reverse=0;
		
		for(int a=24523552;a!=0;a=a/10) {
			int remainder=a%10;
			reverse=reverse*10+remainder;
		}
		System.out.println("The reverse of the number "+reverse);
	}
}
