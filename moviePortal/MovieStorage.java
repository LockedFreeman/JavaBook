package homework.moviePortal;

public class MovieStorage {

    private Movie[] movies = new Movie[20];
    private int size;

    public void add(Movie movie) {
        if (size == movies.length) {
            extend();
        }
        movies[size++] = movie;
    }

    private void extend() {
        Movie[] mov = new Movie[movies.length + 10];
        System.arraycopy(movies, 0, mov, 0, movies.length);
        movies = mov;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(movies[i]);
        }
    }

    public void search(String keyword){
        for (int i = 0; i < size; i++) {
            if (movies[i].getTitle().contains(keyword)||movies[i].getDesc().contains(keyword)){
                System.out.println(keyword);
            }
        }
    }

    public void deleteIndex(int index){
        for (int i = index; i < size; i++) {
            movies[i-1] = movies[i];
        }
        size--;
    }

    public void deleteByTitle(String title){
        for (int i = 0; i < size; i++) {
            if (movies[i].getTitle().equals(title)){
                deleteIndex(i);
            }

        }
    }

    public void searchByYear(int year){
        for (int i = 0; i < size; i++) {
            if (movies[i].getYear() == year){
                System.out.println(year);
            }
        }
    }

    public void searchByYear(int year1,int year2){
        for (int i = year1; i <= year2; i++) {
            for (int j = 0; j < size; j++) {
                if (i == movies[j].getYear()){
                    System.out.println(movies[j]);
                }
            }
        }
    }

    public void searchByCategory(String category){
        for (int i = 0; i < size; i++) {
            if (movies[i].getCategory().equals(category)){
                System.out.println(category);
            }
        }
    }

}
