/**
 * 
 */
package com.infosoft.thisconcept;

/**
 * @author giradkar.akshay
 * Will describe "this" keyword functionality
 */
public class Employee {

	int empAge;
	String empName;

	void doTask() {
		System.out.println("--Employee doing some tasks--" + empAge + "" + empName);
		System.out.println("this----" + this);
	}

}

class EmployeeTest {
	public static void main(String[] args) {

		Employee emp1 = new Employee();

		emp1.doTask();

		System.out.println(emp1.hashCode());

		Employee emp2 = new Employee();

		emp2.doTask();

		System.out.println(emp2.hashCode());
	}
}