import java.util.ArrayList;

public class Professor extends Occupation {
	
	private static ArrayList<Crunch> allSkills = Skills.getInstance().getAllSkills();

	public Professor() {
		super("Professor",
				allSkills.get(22),
				allSkills.get(19),
				allSkills.get(20),
				allSkills.get(33),
				allSkills.get(11),
				allSkills.get(28),
				allSkills.get(16),
				allSkills.get(32));
	}
	
}