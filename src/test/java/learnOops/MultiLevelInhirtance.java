package learnOops;

public class MultiLevelInhirtance {
	public static void main(String[] args) {
		BabyDog d=new BabyDog();
		d.bark();d.eat();d.weep();
	}
}
class Animal2{
	void eat() {
		System.out.println("eating.....");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("barking....");
	}
}
class BabyDog extends Dog2{
	void weep() {
		System.out.println("weeping....");
	}
}
