import java.util.ArrayList;

public class Dilettante extends Occupation {
	
	private static ArrayList<Crunch> allSkills = Skills.getInstance().getAllSkills();

	public Dilettante() {
		super("Dilettante",
				allSkills.get(4),
				allSkills.get(13),
				allSkills.get(19),
				allSkills.get(35),
				allSkills.get(5),
				allSkills.get(29),
				allSkills.get(38),
				allSkills.get(28));
	}
	
}