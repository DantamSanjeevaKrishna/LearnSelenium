package frequentlyAskingprograms;

public class Patterns {

	public static void main(String[] args) {
		for(int row=0;row<6;row++) {
			for(int col=0;col<row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row=0;row<6;row++) {
			for(int col=6;col>row;col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
