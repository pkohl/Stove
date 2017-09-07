/**
 * 
 */

/**
 * @author Pat
 *
 */
public class Burner {
	public static final int TIME_DURATION = 2;
	private int timer;

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
	
	public void plusButton(){
		switch(mySetting){
			case OFF:
				mySetting = Setting.LOW;
				return;
			case LOW:
				mySetting = Setting.MEDIUM;
				return;
			case MEDIUM:
				mySetting = Setting.HIGH;
				return;
			case HIGH:
				mySetting = Setting.HIGH;
				return;
		}
	}
	
	public void minusButton(){
		switch(mySetting){
			case OFF:
				mySetting = Setting.OFF;
				return;
			case LOW:
				mySetting = Setting.OFF;
				return;
			case MEDIUM:
				mySetting = Setting.LOW;
				return;
			case HIGH:
				mySetting = Setting.MEDIUM;
				return;
		}
	}

	

}
