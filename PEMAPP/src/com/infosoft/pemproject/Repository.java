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

	public List<Expense> expenseList = new ArrayList<>();
	public List<Category> categoryList = new ArrayList<>();

	private static Repository repository;

	private Repository() {

	}

	public static Repository getRepository() {
		if (repository == null) {
			repository = new Repository();
		}
		return repository;
	}

}
