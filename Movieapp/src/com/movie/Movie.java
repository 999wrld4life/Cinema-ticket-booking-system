package com.movie;

public class Movie {
  private String title;
  private double rating;
  private String showtimes;
  private String genre;
  private String synopsis;
  private String releaseDate;
  private String mainActor;
  private String secondaryMainActor;
  private String tertiaryMainActor;
  
   


/*to prevent default toString() when printing out the movie and its details 
    (e.g., com.movie.User@41906a77)
   and print out meaningful string representation (I'll explain more in person)
   */
   @Override
	public String toString() {
	 return "- Title: " + title + " - Rating: " + rating + "- Showtimes: " + showtimes + "- Genre: " + genre + "- Synopsis: " + synopsis;
	 }
	

  
//  public Movie(String title, double rating, String showtimes, String genre) {
//	  this.title = title;
//	  this.rating = rating;
//	  this.showtimes = showtimes;
//	  this.genre = genre;
//  }
  
   
   //getters and setters for the attributes
  public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(String showtimes) {
		this.showtimes = showtimes;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getReleaseDate() {
		return releaseDate;
	}



	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}



	public String getMainActor() {
		return mainActor;
	}



	public void setMainActor(String mainActor) {
		this.mainActor = mainActor;
	}



	public String getSecondaryMainActor() {
		return secondaryMainActor;
	}



	public void setSecondaryMainActor(String secondaryMainActor) {
		this.secondaryMainActor = secondaryMainActor;
	}



	public String getTertiaryMainActor() {
		return tertiaryMainActor;
	}



	public void setTertiaryMainActor(String tertiaryMainActor) {
		this.tertiaryMainActor = tertiaryMainActor;
	}


}
