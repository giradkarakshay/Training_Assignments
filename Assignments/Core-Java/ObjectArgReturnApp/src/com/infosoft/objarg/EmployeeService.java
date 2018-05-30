/**
 * 
 */
package com.infosoft.objarg;

/**
 * @author giradkar.akshay
 *
 */
public class EmployeeService {

	//Employee as a argument
	public void save(Employee emp) {
		System.out.println("------SAVE---------" + emp.getEmpAge() + "" + emp.empName);
	}

	//Employee as a return type
	public Employee getEmployee() {

		Employee em = new Employee(20, "AKSHAY");
		return em;

	}
}
