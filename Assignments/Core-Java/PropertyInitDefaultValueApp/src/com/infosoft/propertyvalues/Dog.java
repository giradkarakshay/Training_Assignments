/**
 * 
 */
package com.infosoft.propertyvalues;

/**
 * @author giradkar.akshay
 * This class will show property default value
 *
 */
public class Dog {
	
	int age = 3;
	 
	void eat()
	{
		System.out.println("Dog is eating : "+age);
	}

}

 class DogTest {
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.eat();
		
		Dog d2 = new Dog();
		d2.age = 9;
		d2.eat();
		
	}
}