import java.util.ArrayList;

public class DoctorOfMedicine extends Occupation {

	private static ArrayList<Crunch> allSkills = Skills.getInstance().getAllSkills();
	
	public DoctorOfMedicine() {
		super("Doctor Of Medicine",
				allSkills.get(15),
				allSkills.get(19),
				allSkills.get(26),
				allSkills.get(33),
				allSkills.get(36),
				allSkills.get(36),
				allSkills.get(23),
				allSkills.get(34));
	}
	
}