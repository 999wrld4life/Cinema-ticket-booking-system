package com.movie;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Admin {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    private static final String MOVIE_FILE_PATH = "movies.txt";

    public boolean authenticate(String enteredUsername, String enteredPassword) {
		return false;
        
    }

    public void addMovie(String title, String synopsis, String rating, String date, String startTime, String endTime) {
        
    }

    public void deleteMovie(int choice) {

    }

    public void updateMovie(int choice, String title, String synopsis, String rating, String date, String startTime, String endTime) {

    }

    private List<String> readMoviesFromFile() throws IOException {
		return null;
        
    }

    private void writeMoviesToFile(List<String> movies) throws IOException {
        
    }

    
}
