package learnArrays;

public class ReplaceAll2 {
	public static void main(String[] args) {
		String s="Sa*&*(*(nj*(89090eeva";
		String s1 = s.replaceAll("\\W","");
		String s2 = s1.replaceAll("\\d","");
		System.out.println(s2);
		
	}
}
