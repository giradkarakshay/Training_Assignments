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

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MMM");	
			return sdf.format(date);

	}

}
