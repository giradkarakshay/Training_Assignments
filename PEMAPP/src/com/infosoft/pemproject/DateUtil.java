/**
 * 
 */
package com.infosoft.pemproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author giradkar.akshay
 *
 */
public class DateUtil {

	public static final String[] MONTHS = { "January", "February", "March", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	public static Date stringToDate(String dateAsString) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sdf.parse(dateAsString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static String dateToString(Date date) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);

	}

	public static String getYearAndMonth(Date date) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM");
		return sdf.format(date);

	}
	
	public static String getMonthName(Integer monthNo)
	{
		return MONTHS[monthNo-1];
	}

}
