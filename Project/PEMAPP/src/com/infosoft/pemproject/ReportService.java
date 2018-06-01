/**
 * 
 */
package com.infosoft.pemproject;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class contains various methods to calculate PEM App reports.
 * @author giradkar.akshay
 *
 */
public class ReportService {

	/**
	 * declare a reference of singleton repository.
	 */
	private Repository repo = Repository.getRepository();

	
	/**
	 * This method will calculate month wise total and returns result in map.
	 * Its preparing data in proper order.
	 * @returns 
	 */
	public Map<String, Float> calculateMonthlyTotal() {
		Map<String, Float> map = new TreeMap<>();
		for (Expense expense : repo.expenseList) {
			Date expDate = expense.getDate();
			String yearMonth = DateUtil.getYearAndMonth(expDate);

			if (map.containsKey(yearMonth)) {
				// when expense is already present for a month
				Float total = map.get(yearMonth);
				total = total + expense.getAmount();
				map.put(yearMonth, total);
			} else {
				map.put(yearMonth, expense.getAmount());
			}

		}

		return map;

	}
	
	/**
	 * This method will calculate year wise total and returns result in map.
	 * Its preparing data in proper order.
	 * @returns 
	 */
	
	public Map<Integer, Float> calculateYearlyTotal() {
		Map<Integer, Float> map = new TreeMap<>();
		for (Expense expense : repo.expenseList) {
			Date expDate = expense.getDate();
			
			Integer year = DateUtil.getYear(expDate);
			
			if (map.containsKey(year)) {
				// when expense is already present for a month
				Float total = map.get(year);
				total = total + expense.getAmount();
				map.put(year, total);
			} else {
				map.put(year, expense.getAmount());
			}

		}

		return map;

	}
	/**
	 * This method returns a category Name for given category Id.
	 * returns null when wrong category is applied.
	 * @param categoryId
	 * @return
	 */
	public String categoryNameById(Long categoryId) {
		for (Category c : repo.categoryList) {
			if (c.getCategoryId().equals(categoryId)) {
				return c.getName();
			}

		}
		return null;// No such Id is present
	}

	/**
	 * This method will calculate category wise total and returns result in map.
	 * Its preparing data in proper order.
	 * @returns 
	 */
	public Map<String, Float> calculateCategorizedTotal() {
		Map<String, Float> map = new TreeMap<>();
		for (Expense expense : repo.expenseList) {
			
			
			Long categoryId = expense.getCategoryId();
			
			String catName = this.categoryNameById(categoryId);
			
			
			
			if (map.containsKey(catName)) {
				// when expense is already present for a month
				Float total = map.get(catName);
				total = total + expense.getAmount();
				map.put(catName, total);
			} else {
				map.put(catName, expense.getAmount());
			}

		}

		return map;

	}

}
