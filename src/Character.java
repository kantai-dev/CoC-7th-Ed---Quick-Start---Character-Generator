import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Character {
	
	//will have an attributes list, luck, build, san, hp, occupation and skills list
	
	private Scanner input;
	
	//Attributes
	private Crunch STR, CON, POW, DEX, APP, SIZ, INT, EDU;
	private ArrayList<Crunch> attributes;
	
	private Random d6;
	private int cLuck, cBuild, cHitPoints, cSAN, cCreditRating;
	private String cDamageBonus;
	
	private Occupation cOccupation;
	private ArrayList<Crunch> skills;
	
	public Character() {
		
		input = new Scanner(System.in);
		
		attributes = new ArrayList<>();
		populateAttributes();
		assignAttributeScores();
		displayAttributes();
		
		d6 = new Random();
		cLuck = rollForLuck();
		consultDamageBonusTable();
		cHitPoints = calculateHitPoints();
		cSAN = POW.getValue();
		
		skills = new ArrayList<>();
		chooseOccupation(input.nextInt());
		assignSkillScores();
		choosePersonalInterestSkills();
		
	}
	
	private void populateAttributes() {
		
		STR = new Crunch("STR");
		CON = new Crunch("CON");
		POW = new Crunch("POW");
		DEX = new Crunch("DEX");
		APP = new Crunch("APP");
		SIZ = new Crunch("SIZ");
		INT = new Crunch("INT");
		EDU = new Crunch("EDU");
		
		attributes.add(STR);
		attributes.add(CON);
		attributes.add(POW);
		attributes.add(DEX);
		attributes.add(APP);
		attributes.add(SIZ);
		attributes.add(INT);
		attributes.add(EDU);
		
	}

	private void displayAttributes() {
		for (Crunch c : attributes) {
			System.out.println(c.getName() + " (" 
					+ c.getValue() + "/" + c.getHalfValue() + "/" + c.getFifthValue() + ")");
		}
	}

	private void assignAttributeScores() {
		
		//40, 50, 50, 50, 60, 60, 70, 80
		
		//test
//		STR.assignValue(40, true);
//		CON.assignValue(50, true);
//		POW.assignValue(50, true);
//		DEX.assignValue(50, true);
//		APP.assignValue(60, true);
//		SIZ.assignValue(60, true);
//		INT.assignValue(70, true);
//		EDU.assignValue(80, true);
		
		System.out.println("40, 50, 50, 50, 60, 60, 70, 80");
		STR.assignValue(input.nextInt(), true);
		CON.assignValue(input.nextInt(), true);
		POW.assignValue(input.nextInt(), true);
		DEX.assignValue(input.nextInt(), true);
		APP.assignValue(input.nextInt(), true);
		SIZ.assignValue(input.nextInt(), true);
		INT.assignValue(input.nextInt(), true);
		EDU.assignValue(input.nextInt(), true);
		
	}
	
	private int rollForLuck() {
		
		int tmpLuck = 0;
		
		for (int i = 0; i <= 3; i++) {
			tmpLuck = d6.nextInt(7) + 1; //1-6
		}
		
		return tmpLuck * 5;
		
	}
	
	private void consultDamageBonusTable() {
		
		int tmpBuild = STR.getValue() + SIZ.getValue();
		
		if (tmpBuild < 64 && tmpBuild > 2) {
			cBuild = -2;
			cDamageBonus = "-2";
		} else if (tmpBuild < 84 && tmpBuild > 65) {
			cBuild = -1;
			cDamageBonus = "-1";
		} else if (tmpBuild < 124 && tmpBuild > 85) {
			cBuild = 0;
			cDamageBonus = "None";
		} else if (tmpBuild < 164 && tmpBuild > 124) {
			cBuild = 1;
			cDamageBonus = "+1D4";
		} else if (tmpBuild < 204 && tmpBuild > 165) {
			cBuild = 2;
			cDamageBonus = "+1D6";
		}
	}
	
	private int calculateHitPoints() {
		return SIZ.getValue() + CON.getValue() / 10;
	}
	
	private void chooseOccupation(int choice) {
		
		switch (choice) {
		case 0: //Antiquarian
			cOccupation = new Antiquarian();
			break;
		case 1: //Author
			cOccupation = new Author();
			break;
		case 2: //Dilettante
			cOccupation = new Dilettante();
			break;
		case 3: //Doctor of Medicine
			cOccupation = new DoctorOfMedicine();
			break;
		case 4: //Journalist
			cOccupation = new Journalist();
			break;
		case 5: //Police Detective
			cOccupation = new PoliceDetective();
			break;
		case 6: //Private Investigator
			cOccupation = new PrivateInvestigator();
			break;
		case 7: //Professor
			cOccupation = new Professor();
			break;
		default:
			break;
		}
		
		skills = cOccupation.getSkills();
		
	}
	
	private void assignSkillScores() {
		
		//40, 40, 40, 50, 50, 50, 60, 60, 70
		
		//8 skills and credit rating
		
//		skills.get(0).assignValue(40, true);
//		skills.get(1).assignValue(40, true);
//		skills.get(2).assignValue(40, true);
//		skills.get(3).assignValue(50, true);
//		skills.get(4).assignValue(50, true);
//		skills.get(5).assignValue(50, true);
//		skills.get(6).assignValue(60, true);
//		skills.get(7).assignValue(60, true);
//		
//		cCreditRating = 70;
		
		System.out.println("40, 40, 40, 50, 50, 50, 60, 60, 70");
		
		skills.get(0).assignValue(input.nextInt(), true);
		skills.get(1).assignValue(input.nextInt(), true);
		skills.get(2).assignValue(input.nextInt(), true);
		skills.get(3).assignValue(input.nextInt(), true);
		skills.get(4).assignValue(input.nextInt(), true);
		skills.get(5).assignValue(input.nextInt(), true);
		skills.get(6).assignValue(input.nextInt(), true);
		skills.get(7).assignValue(input.nextInt(), true);
		
		cCreditRating = input.nextInt();
		
	}
	
	private void choosePersonalInterestSkills() {
		
		ArrayList<Crunch> tmp = Skills.getInstance().getAllSkills();
		
		tmp.removeAll(skills); // Remove skills which have already been allocated
		
		System.out.println("Choose 4");
		
		for (int i = 0; i < tmp.size(); i++) {
			System.out.println(i + " - " + tmp.get(i).getName());
		}

//		tmp.get(0).assignValue(20, false);
//		tmp.get(9).assignValue(20, false);
//		tmp.get(23).assignValue(20, false);
//		tmp.get(33).assignValue(20, false);
//		
//		skills.add(tmp.get(0));
//		skills.add(tmp.get(9));
//		skills.add(tmp.get(23));
//		skills.add(tmp.get(33));

		Crunch choice1 = tmp.get(input.nextInt()),
				choice2 = tmp.get(input.nextInt()),
				choice3 = tmp.get(input.nextInt()),
				choice4 = tmp.get(input.nextInt());
		
		choice1.assignValue(20, false);
		choice2.assignValue(20, false);
		choice3.assignValue(20, false);
		choice4.assignValue(20, false);
		
		skills.add(choice1);
		skills.add(choice2);
		skills.add(choice3);
		skills.add(choice4);
		
	}
	
	public void displaySkills() {
		for (Crunch c : skills) {
			System.out.println(c.getName() + " (" + c.getValueFormatted() + "/" + c.getHalfValueFormatted() + "/" + c.getFifthValueFormatted() + ")");
		}
	}
	
	// Here be getters
	
	public int getLuck() {
		return cLuck;
	}

	public int getBuild() {
		return cBuild;
	}

	public String getDamageBonus() {
		return cDamageBonus;
	}
	
	public int getHitPoints() {
		return cHitPoints;
	}
	
	public int getSAN() {
		return cSAN;
	}
	
	public Occupation getOccupation() {
		return cOccupation;
	}
	
	public int getCreditRating() {
		return cCreditRating;
	}
}
