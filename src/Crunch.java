
public class Crunch {
	
	//This is a combination class for both Attributes and Skills
	
	private String cName;
	private int cValue;
	private int cHalfValue;
	private int cFifthValue;
	
	/**
	 * 
	 * Constructor to assign the name and DEFAULT value of 0 for an attribute
	 * 
	 * @param name
	 */
	public Crunch(String name) {
		cName = name;
		cValue = 0;
		calculateHalfAndFifth();
	}

	
	/**
	 * 
	 * Constructor to assign the name and DEFAULT value for a skill
	 * 
	 * @param name
	 * @param value
	 */
	public Crunch(String name, int value) {
		cName = name;
		cValue = value;
		calculateHalfAndFifth();
	}

	/**
	 * 
	 * Assign the given value to the skill/attribute
	 * 
	 * Check if the flag is true or not, if true, set the int value to cValue,
	 * if false add the value to cValue.
	 * 
	 * @param value
	 * @param flag
	 */
	public void assignValue(int value, boolean flag) {
		
		//will need error checking
		
		if (flag) {
			cValue = value;
		} else {
			cValue += value;
		}
		
		calculateHalfAndFifth();
		
	}
	
	private int generateHalfValue(int value) {
		return value /2;
	}
	
	private int generateFifthValue(int value) {
		return value /5;
	}
	
	private void calculateHalfAndFifth() {
		cHalfValue = generateHalfValue(cValue);
		cFifthValue = generateFifthValue(cValue);
	}

	// Here be getters

	public String getName() {
		return cName;
	}


	public int getValue() {
		return cValue;
	}
	
	public String getValueFormatted() {
		return cValue + "%";
	}


	public int getHalfValue() {
		return cHalfValue;
	}
	
	public String getHalfValueFormatted() {
		return cHalfValue + "%";
	}


	public int getFifthValue() {
		return cFifthValue;
	}
	
	public String getFifthValueFormatted() {
		return cFifthValue + "%";
	}

}
