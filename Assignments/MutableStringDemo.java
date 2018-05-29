/**
 * 
 */

/**
 * @author giradkar.akshay
 */
public class MutableStringDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("HELLO");
		
		System.out.println("Before Appending:" +sb);
		
		sb.append("FRIENDS");
		
		System.out.println("After Appending:" +sb);

	}

}
