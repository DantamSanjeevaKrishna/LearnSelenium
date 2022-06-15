package learnArrays;

public class ReplaceAll {
	public static void main(String[] args) {
		String s="Sa3n*(je*)334)*(ev98)a";
		String s1 = s.replaceAll("\\W","");
		System.out.println(s1);
		String s2=s1.replaceAll("\\d","");
		System.out.println(s2);
	}
}
