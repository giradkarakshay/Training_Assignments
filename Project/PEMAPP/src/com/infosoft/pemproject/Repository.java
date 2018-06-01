/**
 * 
 */
package com.infosoft.pemproject;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used as repository/database and its a singleton class
 * @author giradkar.akshay
 *
 */
public class Repository {

	/**
	 * This list holds all expenses added by the user.
	 */
	public List<Expense> expenseList = new ArrayList<>();
	

	/**
	 * This list holds all categories added by the user.
	 */
	public List<Category> categoryList = new ArrayList<>();

	/**
	 * A Singleton Reference of Repository.
	 */
	private static Repository repository;

	
	/**
	 * Private constructor to restrict object creation from outside.
	 */
	private Repository() {

	}

	
	/**
	 * This method provides a Singleton Object.
	 * @return
	 */
	public static Repository getRepository() {
		if (repository == null) {
			repository = new Repository();
		}
		return repository;
	}

}
