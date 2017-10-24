import java.util.ArrayList;

public class Author extends Occupation {

	private static ArrayList<Crunch> allSkills = Skills.getInstance().getAllSkills();
	
	public Author() {
		super("Author",
				allSkills.get(4),
				allSkills.get(16),
				allSkills.get(22),
				allSkills.get(29),
				allSkills.get(19),
				allSkills.get(20),
				allSkills.get(33),
				allSkills.get(23));
	}
	
}