package com.joseph;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by joseph on 7/1/17.
 */
public class MovieFinder {
    Logger logger =Logger.getLogger(this.getClass().getName());
    private String movieName;
    private int movieId;

    public MovieFinder(String movieName, int movieId) {
        this.movieName = movieName;
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public void findMovie(String movieName,int movieId){
        logger.log(Level.INFO,"Finding movie name# "+movieName+", and id#" +movieId);
    }
}
