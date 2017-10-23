
import java.util.ArrayList;

public class Occupation {
	
	private String title;
	private ArrayList<Crunch> skills;
	
	public Occupation(String title, Crunch... args) {
		
		this.title = title;
		skills = new ArrayList<>();
		
		for (Crunch c : args) {
			skills.add(c);
		}
		
	}

	public String getTitle() {
		return title;
	}

	public ArrayList<Crunch> getSkills() {
		return skills;
	}

}
