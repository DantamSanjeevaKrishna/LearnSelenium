package learnOops;

public class SingleInhritance{
	public static void main(String[] args) {
		Dog.bark();Dog.eat();
	}
}
class Animal{
	static void bark() {
		System.out.println("barking.....");
	}
}
	class Dog extends Animal{
		static void eat() {
			System.out.println("eating....");
		}
	}
