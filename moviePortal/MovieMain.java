package homework.moviePortal;

import java.time.Year;
import java.util.Scanner;

public class MovieMain {

    static MovieStorage movieStorage = new MovieStorage();
    static Scanner scanner = new Scanner(System.in);


    private static final int EXIT = 0;
    private static final int ADD_MOVIE = 1;
    private static final int SEARCH_MOVIE = 2;
    private static final int DELETE_MOVIE_BY_TITLE = 3;
    private static final int SEARCH_BY_YEAR = 4;
    private static final int SEARCH_BY_CATEGORY = 5;

    public static void main(String[] args) {

        boolean isRun = true;
        while(isRun){
            printCommands();
            String commandstr = scanner.nextLine();
            int command = Integer.parseInt(commandstr);
            switch (command){
                case EXIT:
                    isRun = false;
                    System.out.println("hajoxutyun, noren hameceq)))");
                    break;
                case ADD_MOVIE:
                    addMovie();
                    break;
                case SEARCH_MOVIE:
                    searchMovie();
                    break;
                case DELETE_MOVIE_BY_TITLE:
                    deleteMovieByTitle();
                    break;
                case SEARCH_BY_YEAR:
                    searchByYear();
                    break;
                case SEARCH_BY_CATEGORY:
                    searchByCategory();
            }
        }

    }

    private static void searchByCategory() {
        System.out.println("nermuceq janr@");
        String categoryStr = scanner.nextLine();
        movieStorage.searchByCategory(categoryStr);
    }

    private static void searchByYear() {
        System.out.println("mutqagreq taretiv@");
        String yearStr = scanner.nextLine();
        String[] yearData = yearStr.split("-");
        int[] yearStr1  = new int[yearData.length];
        for (int i = 0; i < yearData.length; i++) {
            yearStr1[i] = Integer.parseInt(yearData[i]);
        }
        if (yearStr1.length == 1){
            movieStorage.searchByYear(yearStr1[0]);
        }
        else{
            movieStorage.searchByYear(yearStr1[0],yearStr1[1]);
        }


    }

    private static void deleteMovieByTitle() {
        movieStorage.print();
        System.out.println("greq grqi vernagir@ jnjelu hamar");
        String title = scanner.nextLine();
        movieStorage.deleteByTitle(title);
        System.out.println();
        System.out.println("girq@ hajoxutyamb jnjvac e");
        System.out.println();
    }

    private static void searchMovie() {
        System.out.println("greq pntrvox bar@");
        String keyword = scanner.nextLine();
        movieStorage.search(keyword);
    }

    private static void addMovie(){
        System.out.println("nermuceq filmi bnutagir@ " +
                "(String title, String desc, String year, String category)");
        String moviestr = scanner.nextLine();
        String[] movieData = moviestr.split(",");

        Movie movie = new Movie();
        movie.setTitle(movieData[0]);
        movie.setDesc(movieData[1]);
        movie.setYear(Integer.parseInt(movieData[2]));
        movie.setCategory(movieData[3]);
        movieStorage.add(movie);
        System.out.println();
        System.out.println("film@ hajoxutyamb avelacvel e");
        System.out.println();

    }


    private static void printCommands() {
        System.out.println(EXIT + " EXIT");
        System.out.println(ADD_MOVIE + " ADD_MOVIE");
        System.out.println(SEARCH_MOVIE + " SEARCH_MOVIE");
        System.out.println(DELETE_MOVIE_BY_TITLE + " DELETE_MOVIE_BY_TITLE");
        System.out.println(SEARCH_BY_YEAR + " SEARCH_BY_YEAR");
        System.out.println(SEARCH_BY_CATEGORY + " SEARCH_BY_CATEGORY");
    }
}
