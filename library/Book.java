package library;

public class Book {

    private String title;
    private String description;
    private double price;
    private Author Author;

    public Book(String title, String description, double price, Author authorName) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.Author = Author;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthorName() {
        return Author;
    }

    public void setAuthorName(String authorName) {
        this.Author = Author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", authorName='" + Author + '\'' +
                '}';
    }
}
