package com.capgemini;

import java.util.HashMap;

public class NoOfOccures3 {
	public static void main(String[] args) {
		String s="Dantam sanjeeva krishna";
		HashMap<Character,Integer> hmap=new HashMap();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				if(hmap.containsKey(s.charAt(i))) {
					hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
				}else {
					hmap.put(s.charAt(i),1);
				}
			}
		}
		System.out.println(hmap);
	}
}
