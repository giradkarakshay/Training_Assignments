/**
 * 
 */
package com.infosoft.pemproject;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author giradkar.akshay
 *
 */
public class PEMService {

	Repository repo = Repository.getRepository();
	private Scanner scanner = new Scanner(System.in);
	private int choice;

	public void showMenu() {
		while (true) {
			printMenu();

			switch (choice) {
			case 1:

				onAddCategory();
				pressAnyKeyToContinue();

				break;

			case 2:

				onCategoryList();
				pressAnyKeyToContinue();

				break;

			case 3:

				onExpenseEntry();
				pressAnyKeyToContinue();

				break;

			case 4:

				onExpenseList();
				pressAnyKeyToContinue();

				break;

			case 5:

				onMonthlyExpenseList();
				pressAnyKeyToContinue();

				break;

			case 6:

				onYearlyExpenseList();
				pressAnyKeyToContinue();

				break;

			case 7:

				onCategorizedExpenseList();
				pressAnyKeyToContinue();

				break;

			case 8:

				exit();
				break;

			default:
				break;
			}
		}
	}

	public void printMenu() {
		System.out.println("------------PEM MENU--------------");

		System.out.println("1.  ADD Category ");
		System.out.println("2.  Category List ");
		System.out.println("3.  Expense Entry ");
		System.out.println("4.  Expense List ");
		System.out.println("5.  Monthly Expense List ");
		System.out.println("6.  Yearly Expense List ");
		System.out.println("7.  Categorized Expense List ");
		System.out.println("8.  Exit");
		System.out.println("--------------------------------");

		System.out.println("Enter Your Choice : ");

		choice = scanner.nextInt();

	}

	public void onAddCategory() {
		scanner.nextLine();// New line character is read here which is already present in stream and its
							// not used for now
		System.out.println("Enter Category Name :");
		String catName = scanner.nextLine();
		Category cat = new Category(catName);
		repo.categoryList.add(cat);
		System.out.println("SUCCESS : Category added ");
	}

	public void onCategoryList() {
		System.out.println("Listing categories.....");
		List<Category> cList = repo.categoryList;
		for (int i = 0; i < cList.size(); i++) {
			Category c = cList.get(i);
			System.out.println((i + 1) + "." + c.getName() + " ," + c.getCategoryId());

		}

	}

	public void onExpenseEntry() {
		System.out.println("Enter Details For Expense Entry :");
		onCategoryList();
		System.out.println(" Choose Category :");
		int catChoice = scanner.nextInt();
		Category selectedCat = repo.categoryList.get(catChoice - 1);
		System.out.println("My selected category is : " + selectedCat.getName());

		System.out.println(" Enter Amount : ");
		float amount = scanner.nextFloat();

		System.out.println(" Enter Remarks : ");
		scanner.nextLine();
		String remark = scanner.nextLine();

		System.out.println(" Enter Date(DD/MM/YYYY): ");
		String dateAsString = scanner.nextLine();
			
		Date date = DateUtil.stringToDate(dateAsString);

		// Add expense detail in expense object
		Expense expense = new Expense();
		expense.setCategoryId(selectedCat.getCategoryId());
		expense.setAmount(amount);
		expense.setRemark(remark);
		expense.setDate(date);

		// store expense object in repository

		repo.expenseList.add(expense);

		System.out.println("SUCCESS : Expense added ");
	}

	public void onExpenseList() {
		System.out.println("Listing expenses.....");

		List<Expense> expList = repo.expenseList;

		for (int i = 0; i < expList.size(); i++) {
			Expense exp = expList.get(i);
			String catName = categoryNameById(exp.getCategoryId());
			String dateString = DateUtil.dateToString((exp.getDate()));
			System.out.println((i + 1) + ". " + catName + ", " + exp.getRemark() + ", " + exp.getAmount()
					+ ", " + dateString);
		}
	}

	private void onMonthlyExpenseList() {
		System.out.println("Monthly expense listing.....");

	}

	private void onYearlyExpenseList() {
		System.out.println("Yearly expense listing......");

	}

	private void onCategorizedExpenseList() {
		System.out.println("categorywise expense listing....");

	}

	private void exit() {
		System.exit(8);

	}

	public String categoryNameById(Long categoryId) {
		for (Category c : repo.categoryList) {
			if (c.getCategoryId().equals(categoryId)) {
				return c.getName();
			}

		}
		return null;//No such Id is present
	}

	public void pressAnyKeyToContinue() {
		System.out.println(" Press any key to continue :");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
