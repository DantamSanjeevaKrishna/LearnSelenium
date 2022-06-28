package programs.sanjeev;

public class ReverseString {

	public static void main(String[] args) {
		String s="Sanjeeva";
		for(int i=s.length()-1;i<=s.length();i--) {
			System.out.print(s.charAt(i));
		}
	}
}
