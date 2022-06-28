package programs.sanjeev;

public class CapitalizeWord {

	public static void main(String[] args) {
		String str="my name is sanjeeva krishna dantam";
		String[] words=str.split("\\s");
		
		for(String w:words) {
			String first=w.substring(0,1);
			String afterfirst=w.substring(1);
			String upperCase = first.toUpperCase()+afterfirst+" ";
			System.out.print(upperCase);
		}
		
	}
}
