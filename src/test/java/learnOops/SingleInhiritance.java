package learnOops;

public class SingleInhiritance {
	public static void main(String[] args) {
		boy b=new boy();
		b.walk();b.run();
	}
}
	class Man{
		void walk() {
			System.out.println("Walking....");
		}
	}
	class boy extends Man{
		void run() {
			System.out.println("running....");
		}
	}
