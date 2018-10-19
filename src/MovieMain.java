
public class MovieMain {
	public static void main(String[] args) {
		Movie one = new Movie("Avengers: Infinity War", 5);
		Movie two = new Movie("Star Wars Episode I", 2);
		Movie three = new Movie("Mission: Impossible", 4);
		Movie four = new Movie("Captain America: Civil War", 5);
		Movie five = new Movie("Gaurdians of the Galaxy", 4);
		NetflixQueue que = new NetflixQueue();
		que.addMovie(one);
		que.addMovie(two);
		que.addMovie(three);
		que.addMovie(four);
		que.addMovie(five);
		que.printMovies();
		que.sortMoviesByRating();
		System.out.println(one.getTicketPrice());
		System.out.println("The best movie is " + que.getBestMovie());
		System.out.println("The second best movie is" + que.getMovie(1));
	}
}