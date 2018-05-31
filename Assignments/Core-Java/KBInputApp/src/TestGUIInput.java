import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * Taking input using GUI input-dialog (swing)
 * @author giradkar.akshay
 *
 */
public class TestGUIInput {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Your name: ");
		
		String strSal = JOptionPane.showInputDialog("Enter Salary:");
		Float salary = new Float(strSal);
		
		Integer age = new Integer (JOptionPane.showInputDialog("Enter age : "));
		
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
	}

}
