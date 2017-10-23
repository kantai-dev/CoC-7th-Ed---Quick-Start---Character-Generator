public class Professor extends Occupation {

	public Professor() {
		super("Professor",
				new Crunch("Library Use", 20),
				new Crunch("Language (Other)", 01),
				new Crunch("Language (Own)"),
				new Crunch("Psychology", 10),
				new Crunch("Fast Talk", 5),
				new Crunch("Library Use", 20),
				new Crunch("History", 5),
				new Crunch("Occult", 5));
	}
	
}