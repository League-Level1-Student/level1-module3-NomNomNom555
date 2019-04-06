
	public class Athlete {

	     static int nextBibNumber;
	     static String raceLocation = "Calexico";
	     static String raceStartTime = "9.00am";

	     String name;
	     int speed;
	     int bibNumber;

	Athlete (String name, int speed){
		this.bibNumber= nextBibNumber;
		nextBibNumber++;
	     this.name = name;
	     this.speed = speed;
	}

	public static void main(String[] args) {
		Athlete runner = new Athlete("Bob", 20);
		Athlete.raceLocation= "Wyoming";
		Athlete.raceStartTime= "12:00pm";
		System.out.println(runner.name);
		runner.bibNumber= nextBibNumber;
		System.out.println(runner.bibNumber);
		System.out.println(raceLocation);
		System.out.println("@ "+ raceStartTime);
		Athlete other = new Athlete("Dan",35);
		System.out.println(other.name);
		other.bibNumber= nextBibNumber;
		System.out.println(other.bibNumber);
		System.out.println(raceLocation);
		System.out.println("@ "+ raceStartTime);
		
		
	     //create two athletes      //print their names, bibNumbers, and the location of their race. }
	}

}

