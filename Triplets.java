import java.util.ArrayList;
public class Triplets {
	public static void main (String [] args){
		ArrayList<String> nouns = new ArrayList<String>();
		nouns.add("Hyena");
		nouns.add("Dinosaur");
		nouns.add("Gazelle");
		nouns.add("Drawer");
		nouns.add("Sunflower");
		nouns.add("Enemy");
		nouns.add("Harp");
		
		ArrayList<String> verbs = new ArrayList<String>();
		verbs.add("Baffled");
		verbs.add("browsed");
		verbs.add("run");
		verbs.add("paged");
		verbs.add("persecute");
		verbs.add("flight");
		verbs.add("prize");
		
		ArrayList<String> rhymingNouns = new ArrayList<String>();
		rhymingNouns.add("moose");
		rhymingNouns.add("zues");
		rhymingNouns.add("fruit juice");
		rhymingNouns.add("produce");
		rhymingNouns.add("abuse");
		rhymingNouns.add("bruce");
		rhymingNouns.add("noose");
		rhymingNouns.add("Duce");
		
		String noun;
		String verb1, verb2, verb3;
		String rhymingNoun1, rhymingNoun2, rhymingNoun3;
		int randomNum;
		//gets the noun
		randomNum = (int)(Math.random() * nouns.size());
		noun = nouns.get(randomNum);
		
		//gets the first verb then removes it so it cant be used again
		randomNum = (int)(Math.random() * verbs.size());
		verb1 = verbs.get(randomNum);
		verbs.remove(randomNum);
		
		//gets the second verb then removes it so it cant be used again
		randomNum = (int)(Math.random() * verbs.size());
		verb2 = verbs.get(randomNum);	
		verbs.remove(randomNum);
		
		//gets the third verb then removes it so it cant be used again
		randomNum = (int)(Math.random() * verbs.size());
		verb3 = verbs.get(randomNum);
		verbs.remove(randomNum);
		
		//gets the first rhyming noun then removes it so it cant be used again
		randomNum = (int)(Math.random() * rhymingNouns.size());
		rhymingNoun1 = rhymingNouns.get(randomNum);
		rhymingNouns.remove(randomNum);
		
		//gets the second rhyming noun then removes it so it cant be used again
		randomNum = (int)(Math.random() * rhymingNouns.size());
		rhymingNoun2 = rhymingNouns.get(randomNum);
		rhymingNouns.remove(randomNum);
		
		//gets the third rhyming noun 
		randomNum = (int)(Math.random() * rhymingNouns.size());
		rhymingNoun3 = rhymingNouns.get(randomNum);
		
		System.out.println("The " + noun + " " + verb1 + " a " + rhymingNoun1 + "\n" + "then " + verb2 + " it in the " + rhymingNoun2 + "\n" + "now " + verb3 + " towards the " + rhymingNoun3);
	}
}