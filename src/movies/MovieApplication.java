package movies;

import java.util.Scanner;

public class MovieApplication {
    public static void userSelection(int select) {

    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();
        boolean exit = false;
        do {
            String prompt = "What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category\n";
        System.out.println(prompt);
        int select = S.nextInt();
        switch (select) {
            case 0:
                exit=true;
                break;
            case 1:
                for (Movie movie : movies) {
                    System.out.println(movie.getName() + " Category: " + movie.getCategory());
                }
                break;
            case 2:
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName() + " Category: " + movie.getCategory());
                    }
                }
                break;
            case 3:
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName() + " Category: " + movie.getCategory());
                    }
                }
                break;
            case 4:
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName() + " Category: " + movie.getCategory());
                    }
                }
                break;
            case 5:
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName() + " Category: " + movie.getCategory());
                    }
                }
                break;
        }
    } while (!exit);
    }
}
