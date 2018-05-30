/**
 * 
 */
package com.infosoft.stringfunctions;

/**
 * @author giradkar.akshay 
 *SBOperationDemo class includes StringBuilder/StringBuffer api's opeartions
 * 
 */
public class SBOperationDemo {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder("HELLO");
		//StringBuffer sb = new StringBuffer("HELLO");
		System.out.println(sb);
		System.out.println(sb.length());
		
		String s = sb.toString();
		
		System.out.println(s);
		
		sb.append(" FRIENDS");
		sb.insert(5, " DEAR");
		System.out.println(sb);
		sb.delete(0,6);
		System.out.println(sb);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		//sb.reverse();
		System.out.println(sb);
		sb.replace(0, 4, "AKSHAY");
		System.out.println(sb);
		sb.substring(6, 9);
		
		String sub1 = sb.substring(6);
		
		System.out.println(sub1);
		
		String sub2 = sb.substring(6, 9);//last index is excluded
		
		System.out.println(sub2);
		
		

	}

}
