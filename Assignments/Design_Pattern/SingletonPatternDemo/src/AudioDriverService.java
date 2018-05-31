/**
 * 
 */

/**
 * @author giradkar.akshay
 *
 */
public class AudioDriverService {

	
	//Private static variable of the same class that is the only instance of the class.
	private static final AudioDriverService instance = new AudioDriverService();

	// private constructor to avoid client applications to use constructor
	private AudioDriverService() {
	}

	//Public static method that returns the instance of the class
	public static AudioDriverService getInstance() {
		return instance;
	}

	public void windowsMediaAccessPlayer() {
		System.out.println(" WindowsMediaPlayer will share the same object of AudioDriverService ");
	}

}

class ApplicationStatus {
	public static void main(String[] args) {

		AudioDriverService single = AudioDriverService.getInstance();
		
		AudioDriverService single1 = AudioDriverService.getInstance();

		single.windowsMediaAccessPlayer();
		
		System.out.println(single.hashCode());
		System.out.println(single1.hashCode());
		
	}
}
