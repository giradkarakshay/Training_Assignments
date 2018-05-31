/**
 * 
 */

/**
 * @author giradkar.akshay
 *
 */

class Calc{
	
	void add(int a, int b){
		System.out.println("---add(int, int) -------" + (a + b));
	}
	
	void add(float a, float b){
		System.out.println("---add(float, float) -------" + (a + b));
	}
	
	void add(int a, float b){
		System.out.println("---add(int, float) -------" + (a + b));
	}
}

public class TestMethodOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Calc c = new Calc();
		c.add(10, 20);
//		c.add(10.05, 10.02);//error
		c.add(10.05f, 10.02f);
		c.add(10, 10.02f);
		c.add('A','b');
	}

}
