/**
 * 
 */

/**
 * @author giradkar.akshay
 * DESC : This class will tell basic functionality of FOR loop working
 *
 */
public class ForDemo {


	public static void main(String[] args) {
		
		int sum =0;
		
		for(int number = 0 ; number <=9 ; number++)
		{
			System.out.println(number);
			if(sum % 2==0)
			{
				System.out.println(number);
			sum+=number;
			}
		}
		System.out.println("Value of Sum is "+sum);

	}

}
