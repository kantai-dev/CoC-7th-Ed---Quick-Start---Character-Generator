import java.util.ArrayList;

public class Skills {
	
	private static final Skills instance = new Skills();

	private ArrayList<Crunch> skills;
	
	public Skills() { //ArrayList<Crunch> tmp
		
		skills = new ArrayList<>();
		
		skills.add(new Crunch("Accounting", 5)); //0
		skills.add(new Crunch("Anthropology", 1)); //1
		skills.add(new Crunch("Appraise", 5)); //2
		skills.add(new Crunch("Archaeology", 1)); //3
		skills.add(new Crunch("Art/Craft", 5)); //4
		skills.add(new Crunch("Charm", 15)); //5
		skills.add(new Crunch("Climb", 20)); //6
		skills.add(new Crunch("Disguise", 5)); //7
		skills.add(new Crunch("Dodge")); //8
		skills.add(new Crunch("Drive Auto", 20)); //9
		skills.add(new Crunch("Electrical Repair", 10)); //10
		skills.add(new Crunch("Fast Talk", 5)); //11
		skills.add(new Crunch("Fighting (Brawl)", 25)); //12
		skills.add(new Crunch("Firearms (Handguns)", 20)); //13
		skills.add(new Crunch("Firearms (Rifle/Shotgun)", 25)); //14
		skills.add(new Crunch("First Aid", 30)); //15
		skills.add(new Crunch("History", 5)); //16
		skills.add(new Crunch("Initmidate", 15)); //17
		skills.add(new Crunch("Jump", 20)); //18
		skills.add(new Crunch("Language (Other)", 1)); //19
		skills.add(new Crunch("Language (Own)")); //20
		skills.add(new Crunch("Law", 5)); //21
		skills.add(new Crunch("Library Use", 20)); //22
		skills.add(new Crunch("Listen", 20)); //23
		skills.add(new Crunch("Locksmith", 1)); //24
		skills.add(new Crunch("Mechanical Repair", 10)); //25
		skills.add(new Crunch("Medicine", 1)); //26
		skills.add(new Crunch("Natural World", 10)); //27
		skills.add(new Crunch("Navigate", 10)); //28
		skills.add(new Crunch("Occult", 5)); //29
		skills.add(new Crunch("Operate Heavy Machinery", 1)); //30
		skills.add(new Crunch("Persuade", 10)); //31
		skills.add(new Crunch("Pilot", 1)); //32
		skills.add(new Crunch("Psychology", 10)); //33
		skills.add(new Crunch("Psychoanalysis", 1)); //34
		skills.add(new Crunch("Ride", 5)); //35
		skills.add(new Crunch("Science", 1)); //36
		skills.add(new Crunch("Sleight Of Hand", 10)); //37
		skills.add(new Crunch("Spot Hidden", 25)); //38
		skills.add(new Crunch("Stealth", 20)); //39
		skills.add(new Crunch("Survival", 10)); //40
		skills.add(new Crunch("Swim", 20)); //41
		skills.add(new Crunch("Throw", 20)); //42
		skills.add(new Crunch("Track", 10)); //43
		
	}
	
	public static Skills getInstance() {
		return instance;
	}
	
	public ArrayList<Crunch> getAllSkills() {
		return skills;
	}
	
}
