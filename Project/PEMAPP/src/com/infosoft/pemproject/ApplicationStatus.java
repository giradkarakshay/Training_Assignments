/**
 * 
 */
package com.infosoft.pemproject;

/**
 * This class is an entry point of execution of PersonalExpenseManager Application (PEM).
 * @author giradkar.akshay
 *
 */
public class ApplicationStatus {
	
	/**
	 * This method is creating <code>PEMService</code> object and show app menu by calling showMenu() method.
	 * @param args
	 */

	public static void main(String[] args) {
		
		PEMService pemService = new PEMService();
		pemService.showMenu();

	}

}
