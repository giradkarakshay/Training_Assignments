import java.util.Scanner;

/**
 * 
 */

/**
 * Taking input from Keyboard(System.in) using Scanner class
 * @author giradkar.akshay
 *
 */
public class TestInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter an int value : ");
		int  i = s.nextInt();
		System.out.println("value of i : " + i);
		
		
		System.out.println("Enter an float value : ");
		float f = s.nextFloat();
		System.out.println("value of f : " + f);
		
		System.out.println("Enter an String value : ");
		String str = s.next();
		System.out.println("value of str : " + str);
		
		s.nextLine();
		
		System.out.println("Enter a Line : ");
		String line = s.nextLine();
		System.out.println("value of line : " + line);
		
	}

}
