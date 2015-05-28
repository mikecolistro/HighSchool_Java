public class Bird extends Mammal{
	private int windows;
	public void speak(){
		System.out.println("\nChirp Chirp !!");
	}
	public Bird(){
		super();
		windows = 0;
	}
	public void flyHigh(){
			System.out.println("The bird is now taking off");
		}

	public void noticedWindows(int n){
		windows += n;
	}

	public void unnoticedWindow(int n){
		windows -= n;
	}

	public String toString(){
		String output = "";
		output += "Windows noticed: " + windows + "\n";
		return output;
	}


}

