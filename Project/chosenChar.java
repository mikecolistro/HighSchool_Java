public class chosenChar{
	private String charName;
	private int charAttack, charDefence, charSpecial, itsHealth;
	String getName;
	public int getHealth(){
		return itsHealth;
	}
	public void setHealth(int newHealth){
		itsHealth = newHealth;
	}
	public chosenChar(){
		charName = "";
	}
	public String getName(){
		return charName;
	}
	public void setName(String nam){
		charName = nam;
	}
	public int getcharAttack(){
		return charAttack;
	}
	public  void setAttack(int attk){
		charAttack = attk;
	}
	public int getcharSpecial(){
		return charSpecial;
	}
	public  void setSpecial(int spec){
		charSpecial = spec;
	}
	public int getcharDefence(){
		return charDefence;
	}
	public void setDefence(int def){
		charDefence = def;
	}
}