package programs.sanjeev;

public class Patterns {

	public static void main(String[] args) {
		for(int row=0;row<6;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row1=0;row1<6;row1++) {
			for(int r=6;r>row1;r--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
