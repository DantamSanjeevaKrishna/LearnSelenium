package learnJavaBasics;

import java.util.HashSet;

public class DelectedDuplicateCharacters {

	public static void main(String[] args) {
		String s="dantam danjeeva krishna";
		char[] ch=s.toCharArray();
		HashSet hs=new HashSet();
		for(int i=0;i<ch.length;i++) {
			hs.add(ch[i]);
		}
		System.out.println(hs);
	}
}
