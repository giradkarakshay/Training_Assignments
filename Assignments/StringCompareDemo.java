/**
 * 
 */

/**
 * @author giradkar.akshay
 * DESC : String comparison demo
 *
 */
public class StringCompareDemo {

	
	public static void main(String[] args) {
		
		String s1 = "AKSHAY";
		String s2 = new String("AKSHAY");
		
		System.out.println(s1==s2);//reference comparison
		System.out.println(s1.equals(s2));//value comparison
		
		String s3 = s2;
		
		System.out.println(s2==s3);//new reference pointing to same s2 object

	}

}
