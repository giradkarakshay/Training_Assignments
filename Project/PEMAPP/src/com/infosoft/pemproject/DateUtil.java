/**
 * 
 */
package com.infosoft.pemproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class contains static methods to handle date.
 * @author giradkar.akshay
 *
 */
public class DateUtil {

	public static final String[] MONTHS = { "January", "February", "March", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	/**
	 * this method converts stringDate to Date Object
	 * @param dateAsString string formatted date (ex. "01/06/2018")
	 * @return
	 */
	public static Date stringToDate(String dateAsString) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sdf.parse(dateAsString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;

	}
	

	/**
	 * this method converts  Date Object to String Date
	 * @param date Object to be converted into string.
	 * @return
	 */

	public static String dateToString(Date date) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);

	}
	/**
	 * This method return year and month from given date in YEAR/MONTH format.
	 * Ex. 2016,01;
	 * @param date year and month will be extracted from this date.
	 * @return year and month for input date.
	 */

	public static String getYearAndMonth(Date date) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM");
		return sdf.format(date);

	}
	/**
	 * returns year for input date.
	 * @param date
	 * @return
	 */
	
	public static Integer getYear(Date date) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		return new  Integer(sdf.format(date))  ;

	}
	/**
	 * This method returns Month name from given month number.
	 * @param monthNo
	 * @return
	 */
	
	public static String getMonthName(Integer monthNo)
	{
		return MONTHS[monthNo-1];
	}

}
