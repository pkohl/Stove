/**
 * 
 */

/**
 * @author Pat
 *
 */
public enum Setting {
	OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
	private String burnerSetting;
	
	Setting(String burnerInput){
		burnerSetting = burnerInput;
	}
	
	public String toString(){
		return burnerSetting;
	}
}
