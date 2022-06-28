package programs.sanjeev;

public class SwapStrings {

	public static void main(String[] args) {
		String s1="sanjeeva";
		String s2="krishna";
		s1=s1.concat(s2);
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1+" "+s2);
	}
}
