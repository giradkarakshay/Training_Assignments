/**
 * 
 */
package com.infosoft.pemproject;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * This class contains most of the operations related to PEM Application.
 * <p>
 * This class prepares a menu and various method are present to handle the user actions.
 * This class make use of <code> Repository </code> to store the data.
 * Also using <code>ReportService </code> to generate various reports. 
 * @author giradkar.akshay
 *
 */
public class PEMService {
	
	/**
	 * Declare a reference of repository by calling a static method which return a singleton repository object.
	 */

	Repository repo = Repository.getRepository();
	
	
	/**
	 * Declare a reference of ReportService to call different methods to calculate reports.
	 */
	ReportService reportService = new ReportService();
	
	
	/**
	 * Declare a Scanner object to take input from keyboard.
	 */
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * This variable store the value of menu choice.
	 */
	private int choice;
	
	
	/**
	 * Call this constructor to create PEMService Object with default details.
	 */
	public PEMService() {
		//prepareSampleData(); 
	}

	/**
	 * This method prepares the PEMApp Menu using switch case and infinite loop and also wait for user to ask choice
	 */
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
	/**
	 * This method prints a menu(CUI/CLI).
	 */

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
	
	/**
	 * This method is taking expense category name as input to add new category in the system.
	 */

	public void onAddCategory() {
		scanner.nextLine();// New line character is read here which is already present in stream and its
							// not used for now
		System.out.println("Enter Category Name :");
		String catName = scanner.nextLine();
		Category cat = new Category(catName);
		repo.categoryList.add(cat);
		System.out.println("SUCCESS : Category added ");
	}
	
	/**
	 * Call this method to print existing list
	 */

	public void onCategoryList() {
		System.out.println("Listing categories.....");
		List<Category> cList = repo.categoryList;
		for (int i = 0; i < cList.size(); i++) {
			Category c = cList.get(i);
			System.out.println((i + 1) + "." + c.getName() + " ," + c.getCategoryId());

		}

	}
	/**
	 * Call this method to enter expense detail.The entered detail will be added in repository.
	 */

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
/**
 * This method prints all the entered expenses.
 */
	public void onExpenseList() {
		System.out.println("Listing expenses.....");

		List<Expense> expList = repo.expenseList;

		for (int i = 0; i < expList.size(); i++) {
			Expense exp = expList.get(i);
			String catName = reportService.categoryNameById(exp.getCategoryId());
			String dateString = DateUtil.dateToString((exp.getDate()));
			System.out.println(
					(i + 1) + ". " + catName + ", " + exp.getRemark() + ", " + exp.getAmount() + ", " + dateString);
		}
	}
/**
 * This method is called for menu to prepare monthly wise expense total.
 * Its using <code>ReportService </code> to calculate report.
 * The returned result will be printed.
 */
	private void onMonthlyExpenseList() {
		System.out.println("Monthly expense listing.....");
		Map<String,Float> resultMap = reportService.calculateMonthlyTotal();
		Set<String> keys = resultMap.keySet();
		for(String yearMonth : keys )
		{
			String[] arr = yearMonth.split(",");
			String year = arr[0];
			Integer monthNo = new Integer(arr[1]);
			String monthName = DateUtil.getMonthName(monthNo);
			
			System.out.println(year+" , "+monthName+" : "+resultMap.get(yearMonth));
		}

	}
	/**
	 * This method is called for menu to prepare yearly wise expense total.
	 * Its using <code>ReportService </code> to calculate report.
	 * The returned result will be printed.
	 */
	private void onYearlyExpenseList() {
		System.out.println("Yearly expense listing......");
		
		Map<Integer,Float> resultMap = reportService.calculateYearlyTotal();
		Set<Integer> years = resultMap.keySet();
		
		Float total = 0.0f;
		
		for (Integer year : years) {
			Float exp = resultMap.get(year);
			total = total+exp;
			
			System.out.println(year+" "+exp);
			
			
		}
		
		System.out.println("----------------------------");
		System.out.println(" Total Expenses(INR) : "+total);

	}
	/**
	 * This method is called for menu to prepare category wise expense total.
	 * Its using <code>ReportService </code> to calculate report.
	 * The returned result will be printed.
	 */
	private void onCategorizedExpenseList() {
		System.out.println("categorywise expense listing....");
		
		Map<String,Float> resultMap = reportService.calculateCategorizedTotal();
		
		Set<String> categories = resultMap.keySet();
		
		Float netTotal = 0.0f;
		
		for (String categoryName : categories) {
			
			Float catWiseTotal = resultMap.get(categoryName);
			
			netTotal = netTotal + catWiseTotal;
			
			System.out.println(categoryName+" : "+catWiseTotal );
			
		}
		
		System.out.println("-----------------------------------");
		System.out.println(" Net Total : "+netTotal);
		

	}
/**
 * This method will stop JVM.
 */
	private void exit() {
		System.exit(8);

	}

	/**
	 * This method is called to hold a output screen after processing the requested task
	 * and wait for any char input to continue to the menu.
	 */

	public void pressAnyKeyToContinue() {
		System.out.println(" Press any key to continue :");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
/**
 * This method is preparing sample data for testing purpose.
 * It should be report once application is  tested OK.
 */
	public void prepareSampleData() {

		Category catParty = new Category("Party");
		delay();

		Category catShopping = new Category("Shopping");
		delay();

		Category catGift = new Category("Gift");

		repo.categoryList.add(catParty);
		repo.categoryList.add(catShopping);
		repo.categoryList.add(catGift);

		// JAN 2018
		Expense e1 = new Expense(catParty.getCategoryId(), 1000.0f, DateUtil.stringToDate("01/01/2018"), "GOOD");
		delay();

		Expense e2 = new Expense(catParty.getCategoryId(), 2000.0f, DateUtil.stringToDate("02/01/2018"), "BAD");
		delay();

		// FEB 2018
		Expense e3 = new Expense(catParty.getCategoryId(), 1200.0f, DateUtil.stringToDate("01/02/2018"), "Average");
		delay();

		Expense e4 = new Expense(catParty.getCategoryId(), 2400.0f, DateUtil.stringToDate("02/02/2018"), "Not Good");
		delay();

		repo.expenseList.add(e1);
		repo.expenseList.add(e2);
		repo.expenseList.add(e3);
		repo.expenseList.add(e4);

	}
/**
 * This method sleep a thread for 10ms.
 */
	public void delay() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
