package interviewPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class PracticeMap {

	public static void main(String[] args) {
		String s = "Mundru Sai Gangadhar";
		String[] split = s.split(" ");
		System.out.println(split[1]);
		
		HashMap<Character,Integer> hm = new HashMap();
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
		for(Entry<Character,Integer> e : hm.entrySet()) {
			if(e.getValue()==1) {
				
				System.out.println(e);
				
			}
		}
			
}
}
