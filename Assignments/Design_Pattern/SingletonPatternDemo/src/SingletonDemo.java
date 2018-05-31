/**
 * 
 */

/**
 * @author giradkar.akshay
 *
 */
public class SingletonDemo {
	
private static final SingletonDemo instance = new SingletonDemo();
    
    //private constructor to avoid client applications to use constructor
    private SingletonDemo(){}

    public static SingletonDemo getInstance(){
        return instance;
    }

    public void showMsg()
    {
    	System.out.println("Singleton can only one instance of class ");
    }
    
}

class TestSingleton{
	public static void main(String[] args) {
		
		SingletonDemo single = SingletonDemo.getInstance();
		
		single.showMsg();
	}
}
