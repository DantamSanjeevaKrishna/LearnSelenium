package interviewPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class NoOfOccueances {

	public static void main(String[] args) {
			
		String s="mundru gangadhara sai";
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
				
				if(hm.containsKey(s.charAt(i))) {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
				else {
				hm.put(s.charAt(i), 1);
				
				
				}
				
			}
			
		}
		System.out.println(hm);
		
		for(Entry<Character,Integer> e:hm.entrySet()) {
			System.out.println(e.getKey()+ " "+ e.getValue());
		}
		//to print only duplicate chars
		System.out.println("Duplicates are:");
		for(Entry<Character,Integer> e:hm.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
		}
		//print only uniques
		System.out.println("Only uniques are:");
		for(Entry<Character,Integer> e:hm.entrySet()) {
			if(!(e.getValue()>1)) {
				System.out.println(e.getKey());
			}
		}
		
		TreeSet set=new TreeSet();
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("b");
		set.add("f");
		set.add("g");
		set.add("d");
		System.out.println(set);

	}

}
