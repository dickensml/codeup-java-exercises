package movies;

import util.Input;
import java.util.Scanner;
public class MoviesApplication {
    public static void getMovies(String category, Movie[] movies) {
        for (Movie movie : movies) {
            if (category.equals(movie.getCategory())) {
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }


    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        int userChoice = -1;
        while (userChoice != 0) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - choose from all movies");
            System.out.println("2 - choose animated movies");
            System.out.println("3 - choose dramas");
            System.out.println("4 - choose horror");
            System.out.println("5 - choose science fiction");
            userChoice = input.getInt("Enter your choice: ");
            switch (userChoice) {
                case 0:
                    break;
                case 1:
                    for (Movie movie : movies) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2:
                    getMovies("animated", movies);
                    break;
                case 3:
                    getMovies("drama", movies);
                    break;
                case 4:
                    getMovies("horror", movies);
                    break;
                case 5:
                    getMovies("scifi", movies);
                    break;
            }
        }
    }
}