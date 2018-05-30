/**
 * 
 */
package com.infosoft.objarr;

/**
 * @author giradkar.akshay DESC : will show how object of array will work
 *
 */
public class Employee {

	private String empName;
	private int empId;

	/**
	 * @param empName
	 * @param empId
	 */
	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}

	void doTask() {

		System.out.println(" Employee doing some tasks...." + empName + " " + empId);
	}

}

class TestObjectArray {
	public static void main(String[] args) {

		Employee[] emp = new Employee[3];

		Employee employee = new Employee("AKSHAY", 101);

		emp[0] = employee;
		emp[1] = new Employee("SWARAJ", 102);
		emp[2] = new Employee("SANTOSH", 103);
		
		for (int i = 0; i < emp.length; i++) {
			emp[i].doTask();
			
		}
/*
		for (Employee employees : emp) {
			employees.doTask();

		}*/

	}
}
