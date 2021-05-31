package com.company;

import java.util.ArrayList;
import java.util.Arrays;

class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String argTitle, String argStudio, String argRating){
        this.title = argTitle;
        this.studio = argStudio;
        this.rating = argRating;
    }
    public Movie(String argTitle, String argStudio){
        this.title = argTitle;
        this.studio = argStudio;
        this.rating = "PG";
    }
    public static Object[] getPG(Movie[] movies){
        ArrayList<Movie> pgMovies = new ArrayList<>();
        for (Movie movie:movies) {
            if(movie.rating.contains("PG"))
                pgMovies.add(movie);
        }
        return pgMovies.toArray();
    }
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Movie movieOne = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movieTwo = new Movie("XYZ", "Abc Productions", "R");
        Movie movieThree = new Movie("LMN", "Abc Productions");
        Movie[] movies = {movieOne,movieTwo, movieThree};
        System.out.println(Arrays.toString(Movie.getPG(movies)));
    }
}
