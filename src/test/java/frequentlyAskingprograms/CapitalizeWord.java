package frequentlyAskingprograms;

public class CapitalizeWord {

	public static void main(String[] args) {
		String s="my name is sanjeeva krishna dantam";
		String[] words = s.split("\\s");
		for(String w:words) {
			String first=w.substring(0,1);
			String afterfirst=w.substring(1);
			String uppercase=first.toUpperCase()+afterfirst+" ";
			System.out.print(uppercase);
		}
	}
}
