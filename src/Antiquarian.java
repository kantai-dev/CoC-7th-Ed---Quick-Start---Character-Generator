public class Antiquarian extends Occupation {

	public Antiquarian() {
		super("Antiquarian",
				new Crunch("Appraise", 5),
				new Crunch("Art/Craft", 5),
				new Crunch("History", 5),
				new Crunch("Language (Other)", 1),
				new Crunch("Library Use", 20),
				new Crunch("Fast Talk", 5), // this would be a choice
				new Crunch("Spot Hidden", 25),
				new Crunch("Persuade", 10));
	}
	
}