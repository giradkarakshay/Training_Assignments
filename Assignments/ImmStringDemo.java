/**
 * 
 */

/**
 * @author giradkar.akshay
 */
public class ImmStringDemo {

	
	public static void main(String[] args) {
		
		
		String s1 = new String("HELLO");
		String s2 = new String("FRIENDS");
		
		
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1 = s1 + s2;//concat: trying to modify the strings
		System.out.println(s1);
		System.out.println(s1.hashCode());

	}

}
