  import javax.swing.*;

public class Dog{
    private String dogName, dogBreed;

    public Dog(){
        dogName = "";
    }

	public Dog(String n, String b){
		dogName = n;
		dogBreed = b;
	}

    public String getdogName(){
        return dogName;
    }
    public void setDogName(String con){
        dogName = con;
    }

    public String toString(){
        String output = "";
       	output += dogName +"-" + dogBreed;
        return output;
    }

}