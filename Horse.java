public class Horse extends Mammal{
	private int hurdles;
	public void speak(){
		System.out.println("\nNeh!!!");
	}
	public Horse(){
		hurdles = 0;
	}
	public void trot(){
		System.out.println("Trotting away  'click click click'");
	}

public void succesfulHurdle(int n){
		hurdles += n;
	}

	public void unsuccesfulHurdle(int n){
		hurdles -= n;
	}

	public String toString(){
		String output = "";
		output += "Hurdles jumped: " + hurdles + "\n";
		return output;
	}
}



