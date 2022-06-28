package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap();
		hmap.put(102, "Ram");hmap.put(103, "sanjeeva");
		hmap.put(104, "Krishna");hmap.put(105, "Sriram");
		hmap.put(106, "Nagarjuna");
		System.out.println(hmap);
		hmap.put(102, "Krishna");
		System.out.println(hmap);
		System.out.println(hmap.containsKey(105));
		System.out.println(hmap.containsValue("Krishna"));
		System.out.println(hmap.entrySet());
		System.out.println(hmap.get(102));
		System.out.println(hmap.get(105));
		Set<Integer> keySet = hmap.keySet();
		System.out.println(keySet);
		Collection<String> values = hmap.values();
		System.out.println(values);
		//hmap.clear();
		System.out.println(hmap);
		for(Entry<Integer,String> m:hmap.entrySet()) {
				System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		
	}

}
