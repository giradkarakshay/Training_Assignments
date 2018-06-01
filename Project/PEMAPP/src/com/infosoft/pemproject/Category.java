/**
 * 
 */
package com.infosoft.pemproject;

/**
 * @author giradkar.akshay
 *
 */
public class Category {

	private Long categoryId = System.currentTimeMillis();//PK
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
