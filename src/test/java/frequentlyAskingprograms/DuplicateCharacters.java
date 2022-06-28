package frequentlyAskingprograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String s="dantam sanjeeva krishna";
		HashMap<Character,Integer> hm=new HashMap();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				if(hm.containsKey(s.charAt(i))) {
					hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
				}else {
					hm.put(s.charAt(i),1);
				}
			}
		}
		System.out.println(hm);
		for(Entry<Character,Integer> e:hm.entrySet()) {
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
		System.out.println("Duplicate Elements are:");
		for(Entry<Character,Integer> e:hm.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey()+" -->"+e.getValue());
			}
		}
		System.out.println("Unique Elements are: ");
		for(Entry<Character,Integer> e:hm.entrySet()) {
			if(e.getValue()==1) {
				System.out.println(e.getKey()+"--->"+e.getValue());
			}
		}
	}
}
