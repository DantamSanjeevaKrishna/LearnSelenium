package frequentlyAskingprograms;

import java.util.HashMap;

public class DuplicateWords {

	public static void main(String[] args) {
		String s="my name is sanjeeva krishna dantam your name is Srinivasa rao dantam";
		String[] words = s.split("\\s");
		HashMap<String,Integer> hm=new HashMap();
		for(int i=0;i<words.length;i++) {
			if(hm.containsKey(words[i])) {
				hm.put(words[i],hm.get(words[i])+1);
			}else {
				hm.put(words[i],1);
			}
			}
		System.out.println(hm);
		}
	}

