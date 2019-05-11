package netflix;

public class The_Program {
public static void main(String[] args) {
	Movie one = new Movie("Avengers:Endgame", 5);
	Movie owo = new Movie("Avengers: Infinity War", 4);
	Movie three = new Movie("Spiderman: Homecoming", 4);
	Movie four = new Movie ("Captain Marvel", 3);
	Movie five = new Movie ("Pizza Time!", 2);
	NetflixQueue flicks = new NetflixQueue();
	
	
System.out.println(one.getTitle());	
System.out.println(owo.getTitle());
System.out.println(three.getTitle());
System.out.println(four.getTitle());
System.out.println(five.getTitle());
System.out.println(one.getRating());
System.out.println(owo.getRating());
System.out.println(three.getRating());
System.out.println(four.getRating());
System.out.println(	five.getRating());
System.out.println(	one.toString());
System.out.println(owo.toString());
System.out.println(three.toString());
System.out.println(four.toString());
System.out.println(five.toString());
System.out.println(one.getTicketPrice());
System.out.println(owo.getTicketPrice());
System.out.println(three.getTicketPrice());
System.out.println(four.getTicketPrice());
System.out.println(five.getTicketPrice());
	flicks.addMovie(one);
	flicks.addMovie(owo);
	flicks.addMovie(three);
	flicks.addMovie(four);
	flicks.addMovie(five);
	flicks.getMovie(0);
	flicks.getMovie(1);
	flicks.getMovie(2);
	flicks.getMovie(3);
	flicks.getMovie(4);
	
	
}
}
