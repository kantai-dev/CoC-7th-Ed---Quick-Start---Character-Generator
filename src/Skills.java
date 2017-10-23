import java.util.ArrayList;

public class Skills {

	private ArrayList<Crunch> skills;
	
	public Skills(ArrayList<Crunch> tmp) {
		
		skills = new ArrayList<>();
		
		skills.add(new Crunch("Accounting", 5));
		skills.add(new Crunch("Anthropology", 1));
		skills.add(new Crunch("Appraise", 5));
		skills.add(new Crunch("Archaeology", 1));
		skills.add(new Crunch("Art/Craft", 5));
		skills.add(new Crunch("Charm", 15));
		skills.add(new Crunch("Climb", 20));
		skills.add(new Crunch("Disguise", 5));
		skills.add(new Crunch("Dodge"));
		skills.add(new Crunch("Drive Auto", 20));
		skills.add(new Crunch("Electrical Repair", 10));
		skills.add(new Crunch("Fast Talk", 5));
		skills.add(new Crunch("Fighting (Brawl)", 25));
		skills.add(new Crunch("Firearms (Handguns)", 20));
		skills.add(new Crunch("Firearms (Rifle/Shotgun)", 25));
		skills.add(new Crunch("First Aid", 30));
		skills.add(new Crunch("History", 5));
		skills.add(new Crunch("Initmidate", 15));
		skills.add(new Crunch("Jump", 20));
		skills.add(new Crunch("Language (Other)", 1));
		skills.add(new Crunch("Language (Own)"));
		skills.add(new Crunch("Law", 5));
		skills.add(new Crunch("Library Use", 20));
		skills.add(new Crunch("Listen", 20));
		skills.add(new Crunch("Locksmith", 1));
		skills.add(new Crunch("Mechanical Repair", 10));
		skills.add(new Crunch("Medicine", 1));
		skills.add(new Crunch("Natural World", 10));
		skills.add(new Crunch("Navigate", 10));
		skills.add(new Crunch("Occult", 5));
		skills.add(new Crunch("Operate Heavy Machinery", 1));
		skills.add(new Crunch("Persuade", 10));
		skills.add(new Crunch("Pilot", 1));
		skills.add(new Crunch("Psychology", 10));
		skills.add(new Crunch("Psychoanalysis", 1));
		skills.add(new Crunch("Ride", 5));
		skills.add(new Crunch("Science", 1));
		skills.add(new Crunch("Sleight Of Hand", 10));
		skills.add(new Crunch("Spot Hidden", 25));
		skills.add(new Crunch("Stealth", 20));
		skills.add(new Crunch("Survival", 10));
		skills.add(new Crunch("Swim", 20));
		skills.add(new Crunch("Throw", 20));
		skills.add(new Crunch("Track", 10));
		
//		removeDuplicates(tmp);
		
	}
	
//	private void removeDuplicates(ArrayList<Crunch> tmp) {
//		
//		skills.removeAll(tmp);
//		
//	}
	
	public ArrayList<Crunch> getAllSkills() {
		return skills;
	}
	
}
