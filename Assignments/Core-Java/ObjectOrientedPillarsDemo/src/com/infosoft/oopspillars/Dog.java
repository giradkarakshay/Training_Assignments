/**
 * 
 */
package com.infosoft.oopspillars;

/**
 * @author giradkar.akshay
 *
 */
public class Dog {
	
	//properties of dog
	 int age;
	 String name;

	
	//actions
	public void eat()
	{
		System.out.println("Dog can eat "+name+" "+age);
	}

}

class DogTest {
	public static void main(String[] args) {
		
		Dog d1;
		d1 = new Dog();
		d1.age = 10;
		d1.name ="Tuffey";
		
		d1.eat();
		
		Dog d2;
		d2 = new Dog();
		d2.age = 12;
		d2.name ="Champ";
		
		d2.eat();
		
		
		Dog d3 = d2;//pointing to same object with different reference
		
		d3.eat();
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		
		
		
		
	}
}
