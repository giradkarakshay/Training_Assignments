/**
 * 
 */
package com.infosoft.objarg;

/**
 * @author giradkar.akshay
 *
 */
public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee emp = new Employee(21, "SWARAJ");
		
		EmployeeService service = new EmployeeService();
		
		service.save(emp);//1. OBJECT AS A ARGUMENT
		
		Employee emp2 = service.getEmployee();//Return value from method 
		
		
		System.out.println("---------------"+emp2.getEmpAge()+" "+emp2.getEmpName());

}
}