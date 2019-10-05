package homework.moviePortal;

import java.util.Objects;

public class Movie {

    private String title;
    private String desc;
    private int year;
    private String category;

    public Movie(String title, String desc, int year, String category) {
        this.title = title;
        this.desc = desc;
        this.year = year;
        this.category = category;
    }

    public Movie() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) &&
                Objects.equals(desc, movie.desc) &&
                Objects.equals(year, movie.year) &&
                Objects.equals(category, movie.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, desc, year, category);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", year='" + year + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
