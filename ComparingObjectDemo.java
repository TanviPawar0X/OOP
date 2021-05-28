import java.util.*;

enum Criteria{ Rating, Title, Director}//user defined type to store constant values
class MovieComparer implements Comparator<Movie>{
	
	private Criteria condition;
	
	public MovieComparer(Criteria condition) {
		this.condition=condition;
	}
	
	public int compare(Movie m1, Movie m2) {
		switch(condition) {
		case Rating:
			return m1.compareTo(m2);
		case Title:
			return m1.name.compareTo(m2.name);
		case Director:
			return m1.director.compareTo(m2.director);
		}
		return 0;
	}
}


class Movie implements Comparable<Movie>{
	double rating;
	String name;
	String director;
	
	public Movie(double rate,String name,String director) {
		rating=rate;
		this.name=name;
		this.director=director;
	}

	public int compareTo(Movie other) {
		if(this.rating>other.rating)
			return 1;
		else if(this.rating<other.rating)
			return -1;
		else 
			return 0;
	}

}
public class ComparingObjectDemo {

	public static void main(String[] args) {
		
		List<Movie> movies=new ArrayList<Movie>();
		movies.add(new Movie(2.0,"X","Aa"));
		movies.add(new Movie(10.0,"Q","Bb"));
		movies.add(new Movie(8.1,"Z","Cc"));
		movies.add(new Movie(5.0,"R","Dd"));
		movies.add(new Movie(7.5,"M","Ee"));
		
		Collections.sort(movies);
		System.out.println("After sorting: ");
		for(Movie m: movies)
			System.out.println(String.format("%s-%f", m.name, m.rating));
		
		System.out.println("After sorting by Title: ");
		//movies.sort(new MovieComparer(Criteria.Title));
		
		Collections.sort(movies, new MovieComparer(Criteria.Title));
		for(Movie m: movies)
			System.out.println(String.format("%s-%f", m.name, m.rating));
	}

}
