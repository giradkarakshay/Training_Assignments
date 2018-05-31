/**
 * 
 */

/**
 * @author giradkar.akshay
 *
 */

class Animal {

	private String name;

	public Animal() {
		System.out.println("-----def cons: Animal---");
	}

	public Animal(String name) {
		System.out.println("-----param cons: Animal---");
		this.name = name;
	}
	
	void eat() {
		System.out.println("animal is eating..." + name);
	}

}

class Dog extends Animal {

	private int age;
	
	public Dog() {
		super();//calling Animal's def const
		System.out.println("----------def const: Dog---------");
	}

	public Dog(int age, String name) {
		super(name);//calling Animal's param const
		this.age = age;
		System.out.println("----------param const: Dog---------");
	}
	
	void bark() {
		System.out.println("Dog barking..." + age);
	}
}

public class TestInh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Specialization-style
		Dog d = new Dog();
		d.eat();// inherited : reused
		d.bark();// own : extended
		
		System.out.println("-----------------------");
		
		Dog dd = new Dog(2, "Tommy");
		dd.eat();
		dd.bark();
	}

}
