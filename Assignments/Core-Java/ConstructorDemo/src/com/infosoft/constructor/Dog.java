/**
 * 
 */
package com.infosoft.constructor;

/**
 * @author giradkar.akshay 
 * DESC : Constructor default value demonstration
 *
 */
public class Dog {

	private int age;
	private String name;

	public Dog() {
		System.out.println("-------DEFAULT CONSTRUCTOR-----------");
		// default age

		age = 2;
	}
	
	public Dog(String name , int age)
	{
		System.out.println("--------PARAMETRISED CONSTRUCTOR---------");
		this.age = age;
		this.name = name;
	}

	void eat() {
		System.out.println("Dog is eating : " + name + "" + age);
	}

}
class TestDog {
	public static void main(String[] args) {
		
		Dog d1 = new Dog();//default
		d1.eat();
		
		Dog d2 = new Dog("Champ", 10);
		d2.eat();
	}
}

