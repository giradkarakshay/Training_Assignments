/**
 * 
 */
package com.infosoft.thisuse;

/**
 * @author giradkar.akshay 
 * Will describe "this" keyword functionality
 * Deffrentiate the variable when their name is same / common in different scope
 */
public class Employee {

	//Instatnce Variables
	private int empAge;
	private String empName;

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	void doTask() {
		System.out.println("--Employee doing some tasks--" + this.empAge + "" + this.empName);
		System.out.println("this----" + this);
	}

}

class EmployeeTest {
	public static void main(String[] args) {

		Employee emp1 = new Employee();
		
		emp1.setEmpAge(20);
		emp1.doTask();

	}
}
