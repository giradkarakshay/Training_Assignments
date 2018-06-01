/**
 * 
 */
package com.infosoft.pemproject;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author giradkar.akshay
 *
 */
public class ReportService {

	private Repository repo = Repository.getRepository();

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

}
