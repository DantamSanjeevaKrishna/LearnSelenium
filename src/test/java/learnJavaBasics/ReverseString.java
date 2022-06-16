package learnJavaBasics;

public class ReverseString {
	public static void main(String[] args) {
		String s="Sanjeeva krishna Dantam";
		System.out.println("The string is reverse Order ");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}
