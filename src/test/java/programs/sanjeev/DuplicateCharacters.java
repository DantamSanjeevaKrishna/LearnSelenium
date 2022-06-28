package programs.sanjeev;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String s="dantam sanjeeva krishna";
		HashMap<Character,Integer> hm=new HashMap();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				if(hm.containsKey(s.charAt(i))) {
					hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
				}else {
					hm.put(s.charAt(i), 1);
				}
			}
		}
		System.out.println(hm);
		System.out.println("Duplicate elements are:");
		for(Map.Entry<Character, Integer> e:hm.entrySet()) {
			if(e.getValue()>1) {
				System.out.print(e.getKey()+" ");
			}
		}
		System.out.println();
		System.out.println("Unique Elements are:");
		for(Map.Entry<Character,Integer> g:hm.entrySet()) {
			if(!(g.getValue()<1) ){
				System.out.print(g.getKey()+" ");
				
			}
		}
	}
}
