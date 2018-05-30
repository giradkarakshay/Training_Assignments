/**
 * 
 */
package com.infosoft.classobjOp;

/**
 * @author giradkar.akshay
 * Class and Object demo
 * Robustness Of Class
 */
public class Dog {

	// properties of dog
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			// allow
			this.age = age;
		} else {

			String errMsg = " Wrong value for age ";
			throw new IllegalArgumentException(errMsg);

		}
	}

	// actions
	public void eat() {
		System.out.println("Dog is eating : " + age);
	}

}

class DogTest {
	public static void main(String[] args) {

		Dog d1;
		d1 = new Dog();
		 d1.setAge(-10);
		//d1.setAge(10);

		d1.eat();
		System.out.println(d1.getAge());

	}
}
