package programs.sanjeev;

public class ReverseNumber2 {
	public static void main(String[] args) {
		int reverse=0;
		for(int num=987654321;num!=0;num=num/10) {
			int remainder=num%10;
			 reverse=reverse*10+remainder;
		}
		System.out.println(reverse);
	}
	}

