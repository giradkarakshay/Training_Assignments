/**
 * 
 */
package com.infosoft.objarg;

/**
 * @author giradkar.akshay
 *
 */
public class Employee {

	int empAge;
	String empName;

	public int getEmpAge() {
		return empAge;
	}

	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empAge
	 * @param empName
	 */
	public Employee(int empAge, String empName) {
		this.empAge = empAge;
		this.empName = empName;
	}

}
