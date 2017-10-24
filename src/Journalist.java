import java.util.ArrayList;

public class Journalist extends Occupation {
	
	private static ArrayList<Crunch> allSkills = Skills.getInstance().getAllSkills();

	public Journalist() {
		super("Journalist",
				allSkills.get(4),
				allSkills.get(16),
				allSkills.get(22),
				allSkills.get(20),
				allSkills.get(5),
				allSkills.get(33),
				allSkills.get(23),
				allSkills.get(39));
	}
	
}