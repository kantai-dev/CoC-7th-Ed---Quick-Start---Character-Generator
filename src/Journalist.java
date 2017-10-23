public class Journalist extends Occupation {

	public Journalist() {
		super("Journalist",
				new Crunch("Art/Craft (Photography)", 5),
				new Crunch("History", 5),
				new Crunch("Library Use", 20),
				new Crunch("Language (Own)"), //This should be the characters EDU score
				new Crunch("Charm", 15),
				new Crunch("Psychology", 10),
				new Crunch("Listen", 20),
				new Crunch("Stealth", 20));
	}
	
}