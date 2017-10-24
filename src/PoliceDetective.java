import java.util.ArrayList;

public class PoliceDetective extends Occupation {
	
	private static ArrayList<Crunch> allSkills = Skills.getInstance().getAllSkills();

	public PoliceDetective() {
		super("Police Detective",
				allSkills.get(4),
				allSkills.get(13),
				allSkills.get(21),
				allSkills.get(23),
				allSkills.get(17),
				allSkills.get(33),
				allSkills.get(38),
				allSkills.get(43));
	}
	
}