package learnJavaBasics;

public class SwapStrings {
	public static void main(String[] args) {
		String s1="Sanjeeva";
		String s2="Krishna";
		s1=s1.concat(s2);
		s2=s1.substring(0,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println("After swapping");
		System.out.println(s1+"  "+s2);
	}
}
