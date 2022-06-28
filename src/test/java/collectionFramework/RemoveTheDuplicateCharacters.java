package collectionFramework;

import java.util.HashSet;
import java.util.TreeSet;

public class RemoveTheDuplicateCharacters {
		public static void main(String[] args) {
			char[] c= {'D','a','n','t','a','m','s','a','n','j','e','e','v','a'};
			TreeSet hs=new TreeSet();
			for(int i=0;i<c.length;i++){
			hs.add(c[i]);		
			}
			System.out.println(hs);
		}
}
