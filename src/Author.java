public class Author extends Occupation {

	public Author() {
		super("Author",
				new Crunch("Art (Literature)", 5),
				new Crunch("History", 5),
				new Crunch("Library Use", 20),
				new Crunch("Occult", 5),
				new Crunch("Language (Other)", 1),
				new Crunch("Language (Own)"), //This should be the characters EDU score
				new Crunch("Psychology", 10),
				new Crunch("Listen", 20));
	}
	
}