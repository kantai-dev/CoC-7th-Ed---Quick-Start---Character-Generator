import java.util.ArrayList;

public class Antiquarian extends Occupation {

	private static ArrayList<Crunch> allSkills = Skills.getInstance().getAllSkills();
	
	public Antiquarian() {
		super("Antiquarian",
				allSkills.get(2),
				allSkills.get(4),
				allSkills.get(16),
				allSkills.get(19),
				allSkills.get(22),
				allSkills.get(11), // this would be a choice
				allSkills.get(38),
				allSkills.get(31));
	}
	
}