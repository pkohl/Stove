/**
 * 
 */

/**
 * @author Pat
 *
 */
public class Burner {

	private enum Temperature{
		BLAZING ("VERY HOT! DON'T TOUCH"), HOT ("CAREFUL"), WARM ("warm"), COLD ("cooool");
		private String burnerTemperature;
		
		Temperature(String burnerTemp){
			burnerTemperature = burnerTemp;
		}
		
		public String toString(){
			return burnerTemperature;
		}

	}
	

	
	private Temperature myTemperature;
	private Setting mySetting;

	public Temperature getMyTemperature() {
		return myTemperature;
	}
	
	public Setting getMySetting(){
		return mySetting;
	}

	public Burner() {
		super();
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
	}

	

}
