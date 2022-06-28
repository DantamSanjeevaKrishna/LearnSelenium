package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet1 {
 public static void main(String[] args) {
	 LinkedHashSet hs=new LinkedHashSet();
	 hs.add(25);hs.add(89);
	 hs.add(21);hs.add(115);hs.add(25);
	 System.out.println(hs);
	 TreeSet ts=new TreeSet();
	 ts.add(25);ts.add(12);ts.add(56);ts.add(12);
	 ts.add(10);ts.add(51);ts.add(33);
	 System.out.println(ts);
 }
}
