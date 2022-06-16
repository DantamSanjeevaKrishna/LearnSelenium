package learnArrays;

public class CountOfCharacter {
	public static void main(String[] args) {
		String s="success is big thing to a people";
		int count=0;
		System.out.print("Total characters in given sentnce without spaces ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(" "+count);
	}
}
