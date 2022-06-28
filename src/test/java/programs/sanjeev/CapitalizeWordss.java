package programs.sanjeev;

public class CapitalizeWordss {

	public static void main(String[] args) {
		String str="my name is sanjeeva krishna dantam";
		String[] words = str.split("\\s");
		
		for(String w:words) {
			String first = w.substring(0,1);
			String afterfirst = w.substring(1);
			String uppercase=first.toUpperCase()+afterfirst+" ";
			System.out.print(uppercase);
		}
	}
}
