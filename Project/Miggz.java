class Miggz{
	private int itsAttack;
	private int itsDefence, itsHealth;
	private String Special;
	public int getHealth(){
		return itsHealth;
	}
	public void setHealth(int newHealth){
		itsHealth = newHealth;
	}
	public int getAttack(){
		return itsAttack;
	}

	public int getDefence(){
		return itsDefence;
	}

	public void setAttack(int newAttack){
		itsAttack = newAttack;
	}

	public void setDefence(int newDefence){
		itsDefence = newDefence;
	}

	public String getSpecial() {
		return Special;
	}

	public void setSpecial(String newSpecial){
		Special = newSpecial;
	}
}