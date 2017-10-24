import java.util.ArrayList;

public class PrivateInvestigator extends Occupation {
	
	private static ArrayList<Crunch> allSkills = Skills.getInstance().getAllSkills();

	public PrivateInvestigator() {
		super("Private Investigator",
				allSkills.get(4),
				allSkills.get(7),
				allSkills.get(21),
				allSkills.get(22),
				allSkills.get(11),
				allSkills.get(33),
				allSkills.get(38),
				allSkills.get(24));
	}
	
}