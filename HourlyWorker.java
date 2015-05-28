public class HourlyWorker extends Person {
	private double wagePerHour;
	private double hoursPerWeek;

	public HourlyWorker() {
		super();
		wagePerHour = 10.0;
		hoursPerWeek = 37.0;
	}

	public void displayCheque() {
		System.out.println("Cheque: " + (wagePerHour * hoursPerWeek));
	}

	public String toString() {
		String output = "";
		output += super.toString();
		output += "Wage: " + wagePerHour + "\n";
		output += "Hours Per Week: " + hoursPerWeek + "\n";
		return output;
	}
}