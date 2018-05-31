/**
 * 
 */
package com.infosoft.inheritancedemo;

/**
 * @author giradkar.akshay DESC : Class will have subclasses(Dog/Cat) that will
 *         inherit the properties of Animal Class
 *
 */
public class Animal {

	private String name;

	void eat() {
		System.out.println(" Animal is Eating : " + name);
	}

	void run() {
		System.out.println(" Animal is running : " + name);
	}

}

class Dog extends Animal {

	void bark() {
		System.out.println(" Dog is barking......... ");
	}

}

class Cat extends Animal {

	void bite() {
		System.out.println(" Cat is biting.... ");
	}

}

class ApplicationStatus {

	public static void main(String[] args) {

		// Specialization Type
		Dog d = new Dog();

		d.eat();// inherited : reused
		d.bark();// own : extended
		d.run();// inherited : reused
		
		System.out.println(d);

		// Specialization Type
		Cat c = new Cat();

		c.eat();// inherited : reused
		c.bite();// own : extended
		c.run();// inherited : reused
		
		System.out.println(c);
	}

}
