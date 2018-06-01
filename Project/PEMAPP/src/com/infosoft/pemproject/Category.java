/**
 * 
 */
package com.infosoft.pemproject;

/**
 * This is domain class represent category.
 * @author giradkar.akshay
 *
 */
public class Category {

	/**
	 * It refers to unique category Id.Here it is simply generated using current time.
	 * But in real time it should be generated using some professional strategy.
	 */
	private Long categoryId = System.currentTimeMillis();//PK
	
	/**
	 * Name of Expense category.
	 */
	private String name;

	public Category(String name) {
		this.name = name;

	}

	public Category(Long categoryId, String name) {
		this.categoryId = categoryId;
		this.name = name;
	}

	public Category() {

	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
